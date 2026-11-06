package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class f1 {
    public static ArrayList d;
    public final String a;
    public final String b;
    public final String c;

    public f1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static f1 a() {
        ArrayList b10 = b();
        return b10.isEmpty() ? new f1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=") : (f1) b10.get(Utilities.j(iz.p0, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i7 = 1;
            while (true) {
                String c10 = c(hd.N0("SearchEngine" + i7 + "Name"));
                if (c10 == null) {
                    break;
                }
                String c11 = c(hd.N0("SearchEngine" + i7 + "SearchURL"));
                String c12 = c(hd.N0("SearchEngine" + i7 + "AutocompleteURL"));
                c(hd.N0("SearchEngine" + i7 + "PrivacyPolicyURL"));
                d.add(new f1(c10, c11, c12));
                i7++;
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
