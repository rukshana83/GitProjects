package org.Base;

public class Child extends Base {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl(driver,"https://www.facebook.com/");
		Pojo p = new Pojo();
		insert(p.getTxtUser(), "Greens");
		System.out.println(attribute(p.getTxtUser(), "value"));
		insert(p.getTxtPass(), "java");
		btnClick(p.getBtnLogin());
		System.out.println(text(p.getText()));
		quit(driver);

	}
}
