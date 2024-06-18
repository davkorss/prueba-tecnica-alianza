import { Component } from '@angular/core';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatNavList, MatList, MatListItem } from '@angular/material/list';
import { MatIcon } from '@angular/material/icon';

/**
 * @title Autosize sidenav
 */
@Component({
  selector: 'sidenav',
  templateUrl: 'sidenav.component.html',
  styleUrl: 'sidenav.component.css',
  standalone: true,
  imports: [MatSidenavModule, MatNavList, MatList, MatIcon, MatListItem],
})
export class Sidenav {
  showFiller = false;
  list: any[] = [{ title: 'Clientes', activated: true }];
}
