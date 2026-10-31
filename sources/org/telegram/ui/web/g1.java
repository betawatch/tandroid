package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.tz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        return b10.isEmpty() ? new g1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=") : (g1) b10.get(Utilities.j(tz.p0, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i10 = 1;
            while (true) {
                String c10 = c(cd.M0("SearchEngine" + i10 + "Name"));
                if (c10 == null) {
                    break;
                }
                String c11 = c(cd.M0("SearchEngine" + i10 + "SearchURL"));
                String c12 = c(cd.M0("SearchEngine" + i10 + "AutocompleteURL"));
                c(cd.M0("SearchEngine" + i10 + "PrivacyPolicyURL"));
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
