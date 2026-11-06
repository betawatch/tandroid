package uc;

import c8.pd;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a {
    public static final String[] o = {"34", "37"};
    public static final String[] p = {"60", "62", "64", "65"};
    public static final String[] q = {"35"};
    public static final String[] r = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public static final String[] s = {"4"};
    public static final String[] t = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55"};
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public String l;
    public String m;
    public final String n;

    public a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.a = pd.e(str == null ? null : str.trim().replaceAll("\\s+|-", ""));
        this.c = num;
        this.d = num2;
        this.b = pd.e(str2);
        this.e = pd.e(str3);
        this.f = pd.e(str4);
        this.g = pd.e(str5);
        this.h = pd.e(str6);
        this.i = pd.e(str7);
        this.j = pd.e(str8);
        this.k = pd.e(str9);
        this.m = pd.a(str10) == null ? a() : str10;
        this.l = pd.e(str11) == null ? b() : str11;
        pd.e(str12);
        pd.b(str13);
        pd.e(str14);
        this.n = pd.e(str15);
    }

    public final String a() {
        if (pd.d(this.m)) {
            String str = this.a;
            if (!pd.d(str)) {
                this.m = pd.c(str, o) ? "American Express" : pd.c(str, p) ? "Discover" : pd.c(str, q) ? "JCB" : pd.c(str, r) ? "Diners Club" : pd.c(str, s) ? "Visa" : pd.c(str, t) ? "MasterCard" : "Unknown";
            }
        }
        return this.m;
    }

    public final String b() {
        if (!pd.d(this.l)) {
            return this.l;
        }
        String str = this.a;
        if (str == null || str.length() <= 4) {
            return null;
        }
        String substring = str.substring(str.length() - 4, str.length());
        this.l = substring;
        return substring;
    }
}
