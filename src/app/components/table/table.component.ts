import { Component } from '@angular/core';
import { MatTableModule } from '@angular/material/table';

export interface PeriodicElement {
  sharedKey: string;
  name: string;
  position: number;
  weight: number;
  symbol: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  { sharedKey: 'shared key', position: 1, name: 'Hydrogen', weight: 1.0079, symbol: 'H' },
  { sharedKey: 'shared key', position: 2, name: 'Helium', weight: 4.0026, symbol: 'He' },
  { sharedKey: 'shared key', position: 3, name: 'Lithium', weight: 6.941, symbol: 'Li' },
  { sharedKey: 'shared key', position: 4, name: 'Beryllium', weight: 9.0122, symbol: 'Be' },
  { sharedKey: 'shared key', position: 5, name: 'Boron', weight: 10.811, symbol: 'B' },
  { sharedKey: 'shared key', position: 6, name: 'Carbon', weight: 12.0107, symbol: 'C' },
  { sharedKey: 'shared key', position: 7, name: 'Nitrogen', weight: 14.0067, symbol: 'N' },
  { sharedKey: 'shared key', position: 8, name: 'Oxygen', weight: 15.9994, symbol: 'O' },
  { sharedKey: 'shared key', position: 9, name: 'Fluorine', weight: 18.9984, symbol: 'F' },
  { sharedKey: 'shared key', position: 10, name: 'Neon', weight: 20.1797, symbol: 'Ne' },
];

/**
 * @title Basic use of `<table mat-table>`
 */
@Component({
  selector: 'tabla-clientes',
  styleUrl: 'table.component.css',
  templateUrl: 'table.component.html',
  standalone: true,
  imports: [MatTableModule],
})
export class TablaClientes {
  displayedColumns: string[] = ['sharedKey', 'businessId', 'email', 'phone', 'dataAdded', 'actions'];
  dataSource = ELEMENT_DATA;
}
