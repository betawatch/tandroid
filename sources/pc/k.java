package pc;

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class k {
    public static final char[] r;
    public static final int[] s = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final a a;
    public final b b;
    public n3.a d;
    public j i;
    public final i j;
    public final h k;
    public final d l;
    public final f m;
    public final e n;
    public String o;
    public final int[] p;
    public final int[] q;
    public a2 c = a2.a;
    public boolean e = false;
    public String f = null;
    public final StringBuilder g = new StringBuilder(1024);
    public final StringBuilder h = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        r = cArr;
        Arrays.sort(cArr);
    }

    public k(a aVar, b bVar) {
        i iVar = new i(2);
        iVar.v = new oc.b();
        this.j = iVar;
        this.k = new h(3);
        this.l = new d(5, 1);
        this.m = new f();
        this.n = new e();
        this.p = new int[1];
        this.q = new int[2];
        this.a = aVar;
        this.b = bVar;
    }

    public final void a(a2 a2Var) {
        this.a.a();
        this.c = a2Var;
    }

    public final void b(String str) {
        b bVar = this.b;
        if (bVar.size() < 0) {
            a aVar = this.a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Invalid character reference: %s", aVar.f + aVar.e, new Object[]{str}));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (java.util.Arrays.binarySearch(pc.k.r, r4[r1.e]) >= 0) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] c(Character ch2, boolean z4) {
        int i10;
        char c3;
        int i11;
        char c10;
        char c11;
        char c12;
        char c13;
        int[] iArr;
        int i12;
        String c14;
        char c15;
        int i13;
        int i14;
        a aVar = this.a;
        boolean j10 = aVar.j();
        String[] strArr = aVar.h;
        char[] cArr = aVar.a;
        if (!j10 && (ch2 == null || ch2.charValue() != aVar.i())) {
            aVar.b();
            if (!aVar.j()) {
            }
            aVar.g = aVar.e;
            boolean k10 = aVar.k("#");
            int[] iArr2 = this.p;
            if (k10) {
                boolean l10 = aVar.l("X");
                if (l10) {
                    aVar.b();
                    int i15 = aVar.e;
                    while (true) {
                        i14 = aVar.e;
                        iArr = null;
                        if (i14 >= aVar.c) {
                            c13 = 0;
                            break;
                        }
                        char c16 = cArr[i14];
                        if (c16 < '0' || c16 > '9') {
                            c13 = 0;
                            if (c16 >= 'A') {
                                if (c16 <= 'F') {
                                    continue;
                                }
                            }
                            if (c16 < 'a' || c16 > 'f') {
                                break;
                            }
                        }
                        aVar.e = i14 + 1;
                    }
                    c14 = a.c(cArr, strArr, i15, i14 - i15);
                } else {
                    c13 = 0;
                    iArr = null;
                    aVar.b();
                    int i16 = aVar.e;
                    while (true) {
                        i12 = aVar.e;
                        if (i12 >= aVar.c || (c15 = cArr[i12]) < '0' || c15 > '9') {
                            break;
                        }
                        aVar.e = i12 + 1;
                    }
                    c14 = a.c(cArr, strArr, i16, i12 - i16);
                }
                if (c14.length() == 0) {
                    b("numeric reference with no numerals");
                    aVar.e = aVar.g;
                    return iArr;
                }
                if (!aVar.k(";")) {
                    b("missing semicolon");
                }
                try {
                    i13 = Integer.valueOf(c14, l10 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    i13 = -1;
                }
                if (i13 == -1 || ((i13 >= 55296 && i13 <= 57343) || i13 > 1114111)) {
                    b("character outside of valid range");
                    iArr2[c13] = 65533;
                    return iArr2;
                }
                if (i13 >= 128 && i13 < 160) {
                    b("character is not a valid unicode code point");
                    i13 = s[i13 - 128];
                }
                iArr2[c13] = i13;
                return iArr2;
            }
            aVar.b();
            int i17 = aVar.e;
            while (true) {
                int i18 = aVar.e;
                if (i18 >= aVar.c || (((c12 = cArr[i18]) < 'A' || c12 > 'Z') && ((c12 < 'a' || c12 > 'z') && !Character.isLetter(c12)))) {
                    break;
                }
                aVar.e++;
            }
            while (true) {
                i10 = aVar.e;
                if (i10 < aVar.c && (c11 = cArr[i10]) >= '0' && c11 <= '9') {
                    aVar.e = i10 + 1;
                }
            }
            String c17 = a.c(cArr, strArr, i17, i10 - i17);
            boolean m9 = aVar.m(';');
            Map map = oc.c.a;
            if (!map.containsKey(c17) || !m9) {
                aVar.e = aVar.g;
                if (!m9) {
                    return null;
                }
                b("invalid named referenece '" + c17 + "'");
                return null;
            }
            if (z4 && (aVar.o() || ((!aVar.j() && (c10 = cArr[aVar.e]) >= '0' && c10 <= '9') || aVar.n('=', '-', '_')))) {
                aVar.e = aVar.g;
                return null;
            }
            if (!aVar.k(";")) {
                b("missing semicolon");
            }
            String str = (String) map.get(c17);
            int[] iArr3 = this.q;
            if (str != null) {
                i11 = str.length();
                if (i11 == 1) {
                    c3 = 0;
                    iArr3[0] = str.charAt(0);
                } else {
                    c3 = 0;
                    iArr3[0] = str.charAt(0);
                    iArr3[1] = str.charAt(1);
                }
            } else {
                c3 = 0;
                i11 = 0;
            }
            if (i11 == 1) {
                iArr2[c3] = iArr3[c3];
                return iArr2;
            }
            if (i11 == 2) {
                return iArr3;
            }
            throw new IllegalArgumentException("Unexpected characters returned for ".concat(c17));
        }
        return null;
    }

    public final j d(boolean z4) {
        j jVar;
        if (z4) {
            jVar = this.j;
            jVar.g();
        } else {
            jVar = this.k;
            jVar.g();
        }
        this.i = jVar;
        return jVar;
    }

    public final void e() {
        n3.a.h(this.h);
    }

    public final void f(char c3) {
        g(String.valueOf(c3));
    }

    public final void g(String str) {
        if (this.f == null) {
            this.f = str;
            return;
        }
        StringBuilder sb = this.g;
        if (sb.length() == 0) {
            sb.append(this.f);
        }
        sb.append(str);
    }

    public final void h(n3.a aVar) {
        if (this.e) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.d = aVar;
        this.e = true;
        int i10 = aVar.b;
        if (i10 == 2) {
            this.o = ((i) aVar).c;
            return;
        }
        if (i10 != 3 || ((h) aVar).v == null) {
            return;
        }
        b bVar = this.b;
        if (bVar.size() < 0) {
            a aVar2 = this.a;
            int i11 = aVar2.f + aVar2.e;
            com.google.android.gms.internal.clearcut.z0 z0Var = new com.google.android.gms.internal.clearcut.z0();
            z0Var.b = i11;
            z0Var.c = "Attributes incorrectly present on end tag";
            bVar.add(z0Var);
        }
    }

    public final void i() {
        h(this.n);
    }

    public final void j() {
        h(this.m);
    }

    public final void k() {
        j jVar = this.i;
        if (jVar.e != null) {
            jVar.p();
        }
        h(this.i);
    }

    public final void l(a2 a2Var) {
        b bVar = this.b;
        if (bVar.size() < 0) {
            a aVar = this.a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Unexpectedly reached end of file (EOF) in input state [%s]", aVar.f + aVar.e, new Object[]{a2Var}));
        }
    }

    public final void m(a2 a2Var) {
        b bVar = this.b;
        if (bVar.size() < 0) {
            a aVar = this.a;
            bVar.add(new com.google.android.gms.internal.clearcut.z0("Unexpected character '%s' in input state [%s]", aVar.f + aVar.e, new Object[]{Character.valueOf(aVar.i()), a2Var}));
        }
    }

    public final boolean n() {
        return this.o != null && this.i.o().equalsIgnoreCase(this.o);
    }
}
