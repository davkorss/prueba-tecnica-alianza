import { Component, signal, effect, output } from '@angular/core';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { FormsModule } from '@angular/forms';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { Toolbar } from './components/toolbar/toolbar.component';
import { Sidenav } from './components/sidenav/sidenav.component';
import { TablaClientes } from './components/table/table.component';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    Toolbar,
    Sidenav,
    TablaClientes,
    MatIconModule,
    MatButtonModule,
    FormsModule,
    MatInputModule,
    MatFormFieldModule,
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  clientes = [];
  title = 'prueba-tecnica-alianza';
  search = signal<string>('');
  clearSearch() {
    this.search.set('');
  }
  async searchClients(search: string) {
    const body = JSON.stringify({
      sharedKey: search,
    });
    const response = await fetch('http://localhost:8080/clientes', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body,
    });
    const json = await response.json();
    console.log(json);
    this.clientes = json;
  }
  clientsEffect = effect(async () => {
    await this.searchClients(this.search());
  });
}
