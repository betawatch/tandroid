package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class d1 {
    public static ArrayList d;
    public final String a;
    public final String b;
    public final String c;

    public d1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static d1 a() {
        ArrayList b10 = b();
        return b10.isEmpty() ? new d1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=") : (d1) b10.get(Utilities.j(az.p0, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i3 = 1;
            while (true) {
                String c2 = c(bd.N0("SearchEngine" + i3 + "Name"));
                if (c2 == null) {
                    break;
                }
                String c10 = c(bd.N0("SearchEngine" + i3 + "SearchURL"));
                String c11 = c(bd.N0("SearchEngine" + i3 + "AutocompleteURL"));
                c(bd.N0("SearchEngine" + i3 + "PrivacyPolicyURL"));
                d.add(new d1(c2, c10, c11));
                i3++;
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
