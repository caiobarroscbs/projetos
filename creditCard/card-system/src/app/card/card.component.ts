import { Component, Input, OnInit } from '@angular/core';
import { CartaoDeCredito } from '../interfaces/CartaoDeCredito';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  /**
   * O angular vai entender que a propriedade 'dadosCartao'
   * poderá receber valores externos ao componente, ou seja,
   * eu estrando em outro componente conseguirei mudar o valor
   * da propriedade 'dadosCartao' 
   */
  @Input()
  dadosCartao: CartaoDeCredito = {
    ano: '',
    mes: '',
    cvc: '',
    nome: '',
    numero: ''
  }

  constructor() { }

  ngOnInit(): void {
  }

}
