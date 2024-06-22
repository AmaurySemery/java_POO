package com.academiews;

public class Browser {
    public void navigate(String url) {
        String ip = findIPAddress();
        String html = sendHttpRequest(ip);
    }

    // Détails d'implémentation qui n'ont pas besoin d'être publiques, car c'est une complexité pour faire fonctionner un ensemble qui ne nécessite pas qu'on y retouche
    private String findIPAddress(String url) {
        return "127.0.0.1";

    }

    private String sendHttpRequest(String ip) {
        return "<html> </html>";
    }

}
