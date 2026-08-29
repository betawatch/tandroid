package se;

import java.util.Locale;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(Locale locale) {
        char c3;
        char c6;
        if (locale == null) {
            return 0;
        }
        String languageTag = locale.toLanguageTag();
        languageTag.getClass();
        switch (languageTag.hashCode()) {
            case 3121:
                if (languageTag.equals("ar")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 3201:
                if (languageTag.equals("de")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 3241:
                if (languageTag.equals("en")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 3246:
                if (languageTag.equals("es")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 3371:
                if (languageTag.equals("it")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 3428:
                if (languageTag.equals("ko")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 3518:
                if (languageTag.equals("nl")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 3651:
                if (languageTag.equals("ru")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 3734:
                if (languageTag.equals("uk")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 106935481:
                if (languageTag.equals("pt-BR")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
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
                            c6 = 0;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 3201:
                        if (language.equals("de")) {
                            c6 = 1;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 3241:
                        if (language.equals("en")) {
                            c6 = 2;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 3246:
                        if (language.equals("es")) {
                            c6 = 3;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 3371:
                        if (language.equals("it")) {
                            c6 = 4;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 3428:
                        if (language.equals("ko")) {
                            c6 = 5;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 3518:
                        if (language.equals("nl")) {
                            c6 = 6;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 3651:
                        if (language.equals("ru")) {
                            c6 = 7;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 3734:
                        if (language.equals("uk")) {
                            c6 = '\b';
                            break;
                        }
                        c6 = 65535;
                        break;
                    default:
                        c6 = 65535;
                        break;
                }
                switch (c6) {
                }
        }
        return 0;
    }
}
