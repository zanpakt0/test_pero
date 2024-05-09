const puppeteer = require('puppeteer');
describe('Check "Написать" button functionality', () => {
  let browser;
  let page;

  beforeAll(async () => {
    browser = await puppeteer.launch();
    page = await browser.newPage();
  });

  afterAll(async () => {
    await browser.close();
  });

  test('Test "Написать" button', async () => {
    await page.goto('https://vk.com/club225299895?w=product-225299895_10044406');

    // Нажатие кнопки "Написать"
    await page.click('span.MarketServiceButton__text');

    await page.waitForTimeout(2000);  // Небольшая пауза для загрузки

    // Проверка отображения диалогового окна
    const dialogWindow = await page.$('div.WriteLayout');
    expect(dialogWindow).not.toBeNull();

    // Нажатие кнопки "Отправить"
    await page.click('button[id^="mail_box_send"]');
  });
});


