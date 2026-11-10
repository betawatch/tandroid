package org.telegram.ui.web;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                String c10 = c(id.N0("SearchEngine" + i7 + "Name"));
                if (c10 == null) {
                    break;
                }
                String c11 = c(id.N0("SearchEngine" + i7 + "SearchURL"));
                String c12 = c(id.N0("SearchEngine" + i7 + "AutocompleteURL"));
                c(id.N0("SearchEngine" + i7 + "PrivacyPolicyURL"));
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
