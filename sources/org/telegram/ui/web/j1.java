package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j1 {
    public static ArrayList d;
    public final String a;
    public final String b;
    public final String c;

    public j1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static j1 a() {
        ArrayList b10 = b();
        return b10.isEmpty() ? new j1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=") : (j1) b10.get(Utilities.clamp(SharedConfig.searchEngineType, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i9 = 1;
            while (true) {
                String c10 = c(LocaleController.getString("SearchEngine" + i9 + "Name"));
                if (c10 == null) {
                    break;
                }
                String c11 = c(LocaleController.getString("SearchEngine" + i9 + "SearchURL"));
                String c12 = c(LocaleController.getString("SearchEngine" + i9 + "AutocompleteURL"));
                c(LocaleController.getString("SearchEngine" + i9 + "PrivacyPolicyURL"));
                d.add(new j1(c10, c11, c12));
                i9++;
            }
        }
        return d;
    }

    public static String c(String str) {
        if (str == null || str.startsWith("LOC_ERR") || "reserved".equals(str)) {
            return null;
        }
        return str;
    }
}
