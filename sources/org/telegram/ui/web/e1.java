package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class e1 {
    public static ArrayList d;
    public final String a;
    public final String b;
    public final String c;

    public e1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static e1 a() {
        ArrayList b10 = b();
        return b10.isEmpty() ? new e1("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=") : (e1) b10.get(Utilities.j(bz.p0, b10.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i7 = 1;
            while (true) {
                String c10 = c(gd.O0("SearchEngine" + i7 + "Name"));
                if (c10 == null) {
                    break;
                }
                String c11 = c(gd.O0("SearchEngine" + i7 + "SearchURL"));
                String c12 = c(gd.O0("SearchEngine" + i7 + "AutocompleteURL"));
                c(gd.O0("SearchEngine" + i7 + "PrivacyPolicyURL"));
                d.add(new e1(c10, c11, c12));
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
