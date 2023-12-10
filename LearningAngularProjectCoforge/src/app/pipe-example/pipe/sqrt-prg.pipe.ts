import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'sqrtPrg'
})
export class SqrtPrgPipe implements PipeTransform {

  transform(value:number): unknown {
    return Math.sqrt(value);
  }

}
