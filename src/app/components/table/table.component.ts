import { Component, input, effect } from '@angular/core';
import { MatIconModule } from '@angular/material/icon';
import { MatTableModule } from '@angular/material/table';

@Component({
  selector: 'tabla-clientes',
  styleUrl: 'table.component.css',
  templateUrl: 'table.component.html',
  standalone: true,
  imports: [MatTableModule, MatIconModule],
})
export class TablaClientes {
  displayedColumns: string[] = [
    'sharedKey',
    'businessId',
    'email',
    'phone',
    'dataAdded',
    'actions',
  ];
  clientes = input<any>();
  dataSource = this.clientes();
  clientsEffect = effect(() => {
    this.dataSource = this.clientes();
  });
}
