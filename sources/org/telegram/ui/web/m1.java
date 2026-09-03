package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class m1 {
    public static ArrayList d;
    public final String a;
    public final String b;
    public final String c;

    public m1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static m1 a() {
        ArrayList b10 = b();
        return b10.isEmpty() ? new m1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=") : (m1) b10.get(Utilities.clamp(SharedConfig.searchEngineType, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i10 = 1;
            while (true) {
                String c3 = c(LocaleController.getString("SearchEngine" + i10 + "Name"));
                if (c3 == null) {
                    break;
                }
                String c10 = c(LocaleController.getString("SearchEngine" + i10 + "SearchURL"));
                String c11 = c(LocaleController.getString("SearchEngine" + i10 + "AutocompleteURL"));
                c(LocaleController.getString("SearchEngine" + i10 + "PrivacyPolicyURL"));
                d.add(new m1(c3, c10, c11));
                i10++;
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
