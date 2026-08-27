package qe;

import java.util.Locale;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(Locale locale) {
        char c10;
        char c11;
        if (locale == null) {
            return 0;
        }
        String languageTag = locale.toLanguageTag();
        languageTag.getClass();
        switch (languageTag.hashCode()) {
            case 3121:
                if (languageTag.equals("ar")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3201:
                if (languageTag.equals("de")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3241:
                if (languageTag.equals("en")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3246:
                if (languageTag.equals("es")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3371:
                if (languageTag.equals("it")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 3428:
                if (languageTag.equals("ko")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3518:
                if (languageTag.equals("nl")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3651:
                if (languageTag.equals("ru")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 3734:
                if (languageTag.equals("uk")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 106935481:
                if (languageTag.equals("pt-BR")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case '\b':
                break;
            case '\t':
                break;
            default:
                String language = locale.getLanguage();
                language.getClass();
                switch (language.hashCode()) {
                    case 3121:
                        if (language.equals("ar")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3201:
                        if (language.equals("de")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3241:
                        if (language.equals("en")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3246:
                        if (language.equals("es")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3371:
                        if (language.equals("it")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3428:
                        if (language.equals("ko")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3518:
                        if (language.equals("nl")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3651:
                        if (language.equals("ru")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3734:
                        if (language.equals("uk")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                }
        }
        return 0;
    }
}
