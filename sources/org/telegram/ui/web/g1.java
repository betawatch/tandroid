package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.uz;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class g1 {
    public static ArrayList d;
    public final String a;
    public final String b;
    public final String c;

    public g1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static g1 a() {
        ArrayList b10 = b();
        return b10.isEmpty() ? new g1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=") : (g1) b10.get(Utilities.j(uz.p0, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i10 = 1;
            while (true) {
                String c10 = c(dd.M0("SearchEngine" + i10 + "Name"));
                if (c10 == null) {
                    break;
                }
                String c11 = c(dd.M0("SearchEngine" + i10 + "SearchURL"));
                String c12 = c(dd.M0("SearchEngine" + i10 + "AutocompleteURL"));
                c(dd.M0("SearchEngine" + i10 + "PrivacyPolicyURL"));
                d.add(new g1(c10, c11, c12));
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
