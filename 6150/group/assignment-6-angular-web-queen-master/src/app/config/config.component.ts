import { Component, OnInit } from '@angular/core';
import { Config, ConfigService } from './config.service';

@Component({
  selector: 'app-config',
  templateUrl: './config.component.html',
  providers: [ ConfigService ],
  styles: ['.error {color: red;}']
})
export class ConfigComponent implements OnInit {

  error: any;
  headers: string[];
  config: Config;

  constructor(private configService: ConfigService) {}

  ngOnInit() {
    this.getConfigs();
  }

  getConfigs(): void {
    this.configService.getConfig()
    .subscribe(
      (data: Config) => this.config = { ...data }, // success path\
    );
  }
}
