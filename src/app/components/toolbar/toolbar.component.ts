import { Component } from '@angular/core';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatToolbarModule } from '@angular/material/toolbar';
import { NgOptimizedImage } from '@angular/common';

/**
 * @title Toolbar
 */
@Component({
  selector: 'toolbar',
  templateUrl: 'toolbar.component.html',
  styleUrl: 'toolbar.component.css',
  standalone: true,
  imports: [MatToolbarModule, MatButtonModule, MatIconModule, NgOptimizedImage],
})
export class Toolbar {}
