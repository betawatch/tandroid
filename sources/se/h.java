package se;

import b2.r1;
import c3.i0;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.zs;
import ve.r;
import w7.d8;
import w7.e8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h implements we.a {
    public static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern m = Pattern.compile("`+");
    public static final Pattern n = Pattern.compile("^`+");
    public static final Pattern o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern s = Pattern.compile("\\s+");
    public static final Pattern t = Pattern.compile(" *$");
    public final BitSet a;
    public final BitSet b;
    public final HashMap c;
    public final m5.e d;
    public String e;
    public int f;
    public b g;
    public f6.f h;

    public h(m5.e eVar) {
        List list = (List) eVar.b;
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new te.a(0), new te.a(1)), hashMap);
        c(list, hashMap);
        this.c = hashMap;
        Set keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.a = bitSet2;
        this.d = eVar;
    }

    public static void b(char c10, ye.a aVar, HashMap hashMap) {
        if (((ye.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        n nVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ye.a aVar = (ye.a) it.next();
            char e = aVar.e();
            char b10 = aVar.b();
            if (e == b10) {
                ye.a aVar2 = (ye.a) hashMap.get(Character.valueOf(e));
                if (aVar2 == null || aVar2.e() != aVar2.b()) {
                    b(e, aVar, hashMap);
                } else {
                    if (aVar2 instanceof n) {
                        nVar = (n) aVar2;
                    } else {
                        n nVar2 = new n(e);
                        nVar2.f(aVar2);
                        nVar = nVar2;
                    }
                    nVar.f(aVar);
                    hashMap.put(Character.valueOf(e), nVar);
                }
            } else {
                b(e, aVar, hashMap);
                b(b10, aVar, hashMap);
            }
        }
    }

    public static void e(r rVar, r rVar2, int i10) {
        if (rVar == null || rVar2 == null || rVar == rVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(rVar.g);
        df.c cVar = (df.c) rVar.f;
        df.c cVar2 = (df.c) rVar2.f;
        while (cVar != cVar2) {
            sb2.append(((r) cVar).g);
            df.c cVar3 = (df.c) cVar.f;
            cVar.g();
            cVar = cVar3;
        }
        rVar.g = sb2.toString();
    }

    public static void f(df.c cVar, df.c cVar2) {
        r rVar = null;
        r rVar2 = null;
        int i10 = 0;
        while (cVar != null) {
            if (cVar instanceof r) {
                rVar2 = (r) cVar;
                if (rVar == null) {
                    rVar = rVar2;
                }
                i10 = rVar2.g.length() + i10;
            } else {
                e(rVar, rVar2, i10);
                rVar = null;
                rVar2 = null;
                i10 = 0;
            }
            if (cVar == cVar2) {
                break;
            } else {
                cVar = (df.c) cVar.f;
            }
        }
        e(rVar, rVar2, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0443  */
    /* JADX WARN: Type inference failed for: r3v16, types: [ve.r] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19, types: [ve.d] */
    /* JADX WARN: Type inference failed for: r3v23, types: [ve.r] */
    /* JADX WARN: Type inference failed for: r3v41, types: [df.c, ve.k] */
    /* JADX WARN: Type inference failed for: r3v57, types: [ve.k] */
    /* JADX WARN: Type inference failed for: r3v58, types: [ve.k] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r5v42, types: [b2.r1] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // we.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, df.c cVar) {
        int i10;
        ve.g gVar;
        df.c cVar2;
        df.c rVar;
        ?? rVar2;
        int i11;
        ve.k kVar;
        String d;
        df.c cVar3;
        int i12;
        String str2;
        boolean z10;
        String str3;
        ?? r42;
        ?? r82;
        ?? r52;
        this.e = str.trim();
        int i13 = 0;
        this.f = 0;
        df.c cVar4 = null;
        this.g = null;
        this.h = null;
        df.c cVar5 = null;
        while (true) {
            char g10 = g();
            if (g10 == 0) {
                cVar5 = cVar4;
                i10 = i13;
            } else {
                if (g10 == '\n') {
                    this.f++;
                    if (cVar5 instanceof r) {
                        r rVar3 = (r) cVar5;
                        if (rVar3.g.endsWith(" ")) {
                            String str4 = rVar3.g;
                            Matcher matcher = t.matcher(str4);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i10 = 0;
                            if (end > 0) {
                                rVar3.g = i0.m(end, 0, str4);
                            }
                            gVar = end >= 2 ? new ve.g(1) : new ve.g(2);
                            cVar2 = gVar;
                        }
                    }
                    i10 = 0;
                    gVar = new ve.g(2);
                    cVar2 = gVar;
                } else if (g10 != '!') {
                    if (g10 == '&') {
                        String d10 = d(l);
                        if (d10 != null) {
                            rVar2 = new r(ue.b.a(d10));
                            cVar2 = rVar2;
                        }
                        cVar2 = null;
                    } else if (g10 == '<') {
                        String d11 = d(o);
                        if (d11 != null) {
                            i11 = 1;
                            String m10 = i0.m(1, 1, d11);
                            kVar = new ve.k(1, sc.e.h("mailto:", m10), null);
                            kVar.b(new r(m10));
                        } else {
                            i11 = 1;
                            String d12 = d(p);
                            if (d12 != null) {
                                String m11 = i0.m(1, 1, d12);
                                kVar = new ve.k(1, m11, null);
                                kVar.b(new r(m11));
                            } else {
                                cVar2 = null;
                                if (cVar2 == null) {
                                    String d13 = d(j);
                                    if (d13 != null) {
                                        rVar2 = new ve.d(i11);
                                        rVar2.h = d13;
                                        cVar2 = rVar2;
                                    }
                                    cVar2 = null;
                                }
                            }
                        }
                        cVar2 = kVar;
                        if (cVar2 == null) {
                        }
                    } else if (g10 != '`') {
                        switch (g10) {
                            case zs.c1 /* 91 */:
                                int i14 = this.f;
                                this.f = i14 + 1;
                                r rVar4 = new r("[");
                                f6.f fVar = this.h;
                                f6.f fVar2 = new f6.f(rVar4, i14, fVar, this.g, false);
                                if (fVar != null) {
                                    fVar.d = true;
                                }
                                this.h = fVar2;
                                cVar2 = rVar4;
                                break;
                            case zs.d1 /* 92 */:
                                this.f++;
                                if (g() == '\n') {
                                    rVar = new ve.g(1);
                                    this.f++;
                                } else {
                                    if (this.f < this.e.length()) {
                                        String str5 = this.e;
                                        int i15 = this.f;
                                        if (k.matcher(str5.substring(i15, i15 + 1)).matches()) {
                                            String str6 = this.e;
                                            int i16 = this.f;
                                            r rVar5 = new r(str6.substring(i16, i16 + 1));
                                            this.f++;
                                            cVar2 = rVar5;
                                            break;
                                        }
                                    }
                                    rVar = new r("\\");
                                }
                                cVar2 = rVar;
                                break;
                            case zs.e1 /* 93 */:
                                int i17 = this.f + 1;
                                this.f = i17;
                                f6.f fVar3 = this.h;
                                if (fVar3 != null) {
                                    r rVar6 = (r) fVar3.e;
                                    boolean z11 = fVar3.b;
                                    if (fVar3.c) {
                                        if (g() == '(') {
                                            this.f++;
                                            Pattern pattern = q;
                                            d(pattern);
                                            i12 = 1;
                                            int a2 = d8.a(this.f, this.e);
                                            if (a2 == -1) {
                                                str3 = null;
                                            } else {
                                                String substring = g() == '<' ? this.e.substring(this.f + 1, a2 - 1) : this.e.substring(this.f, a2);
                                                this.f = a2;
                                                str3 = ue.a.a(substring);
                                            }
                                            if (str3 != null) {
                                                d(pattern);
                                                String str7 = this.e;
                                                int i18 = this.f;
                                                if (s.matcher(str7.substring(i18 - 1, i18)).matches()) {
                                                    int c10 = d8.c(this.f, this.e);
                                                    if (c10 == -1) {
                                                        str2 = null;
                                                    } else {
                                                        String substring2 = this.e.substring(this.f + 1, c10 - 1);
                                                        this.f = c10;
                                                        str2 = ue.a.a(substring2);
                                                    }
                                                    d(pattern);
                                                } else {
                                                    str2 = null;
                                                }
                                                if (g() == ')') {
                                                    this.f++;
                                                    z10 = true;
                                                } else {
                                                    this.f = i17;
                                                }
                                            } else {
                                                str2 = null;
                                            }
                                            z10 = false;
                                        } else {
                                            i12 = 1;
                                            str2 = null;
                                            z10 = false;
                                            str3 = null;
                                        }
                                        if (!z10) {
                                            int i19 = this.f;
                                            if (i19 < this.e.length() && this.e.charAt(this.f) == '[') {
                                                int i20 = this.f + 1;
                                                int b10 = d8.b(i20, this.e);
                                                int i21 = b10 - i20;
                                                if (b10 != -1 && i21 <= 999 && b10 < this.e.length() && this.e.charAt(b10) == ']') {
                                                    this.f = b10 + 1;
                                                }
                                            }
                                            int i22 = this.f - i19;
                                            String substring3 = i22 > 2 ? this.e.substring(i19, i22 + i19) : !fVar3.d ? this.e.substring(fVar3.a, i17) : null;
                                            if (substring3 != null) {
                                                Pattern pattern2 = ue.a.a;
                                                ve.m mVar = (ve.m) ((Map) this.d.c).get(ue.a.c.matcher(substring3.substring(i12, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                if (mVar != null) {
                                                    str3 = mVar.h;
                                                    str2 = mVar.i;
                                                    z10 = true;
                                                }
                                            }
                                        }
                                        if (!z10) {
                                            this.f = i17;
                                            this.h = (f6.f) this.h.f;
                                            rVar = new r("]");
                                            cVar2 = rVar;
                                            break;
                                        } else {
                                            rVar2 = z11 ? new ve.k(0, str3, str2) : new ve.k(1, str3, str2);
                                            df.c cVar6 = (df.c) rVar6.f;
                                            while (cVar6 != null) {
                                                df.c cVar7 = (df.c) cVar6.f;
                                                rVar2.b(cVar6);
                                                cVar6 = cVar7;
                                            }
                                            h((b) fVar3.g);
                                            df.c cVar8 = (df.c) rVar2.c;
                                            df.c cVar9 = (df.c) rVar2.d;
                                            if (cVar8 != cVar9) {
                                                f(cVar8, cVar9);
                                            }
                                            rVar6.g();
                                            f6.f fVar4 = (f6.f) this.h.f;
                                            this.h = fVar4;
                                            if (!z11) {
                                                while (fVar4 != null) {
                                                    if (!fVar4.b) {
                                                        fVar4.c = false;
                                                    }
                                                    fVar4 = (f6.f) fVar4.f;
                                                }
                                            }
                                            cVar2 = rVar2;
                                            break;
                                        }
                                    } else {
                                        this.h = (f6.f) fVar3.f;
                                        cVar3 = new r("]");
                                    }
                                } else {
                                    cVar3 = new r("]");
                                }
                                cVar2 = cVar3;
                                break;
                            default:
                                if (this.b.get(g10)) {
                                    ye.a aVar = (ye.a) this.c.get(Character.valueOf(g10));
                                    int i23 = this.f;
                                    int i24 = i13;
                                    while (g() == g10) {
                                        i24++;
                                        this.f++;
                                    }
                                    if (i24 < aVar.d()) {
                                        this.f = i23;
                                        r52 = cVar4;
                                    } else {
                                        String substring4 = i23 == 0 ? "\n" : this.e.substring(i23 - 1, i23);
                                        char g11 = g();
                                        String valueOf = g11 != 0 ? String.valueOf(g11) : "\n";
                                        Pattern pattern3 = i;
                                        boolean matches = pattern3.matcher(substring4).matches();
                                        Pattern pattern4 = r;
                                        boolean matches2 = pattern4.matcher(substring4).matches();
                                        boolean matches3 = pattern3.matcher(valueOf).matches();
                                        boolean matches4 = pattern4.matcher(valueOf).matches();
                                        int i25 = (matches4 || !(!matches3 || matches2 || matches)) ? i13 : 1;
                                        int i26 = (matches2 || !(!matches || matches4 || matches3)) ? i13 : 1;
                                        if (g10 == '_') {
                                            int i27 = (i25 == 0 || !(i26 == 0 || matches)) ? i13 : 1;
                                            if (i26 == 0 || !(i25 == 0 || matches3)) {
                                                r82 = i13;
                                                r42 = i27;
                                            } else {
                                                r82 = 1;
                                                r42 = i27;
                                            }
                                        } else {
                                            int i28 = (i25 == 0 || g10 != aVar.e()) ? i13 : 1;
                                            int i29 = (i26 == 0 || g10 != aVar.b()) ? i13 : 1;
                                            r42 = i28;
                                            r82 = i29;
                                        }
                                        this.f = i23;
                                        r52 = new r1(i24, r42, r82);
                                    }
                                    if (r52 != 0) {
                                        int i30 = r52.a;
                                        int i31 = this.f;
                                        int i32 = i31 + i30;
                                        this.f = i32;
                                        r rVar7 = new r(this.e.substring(i31, i32));
                                        boolean z12 = r52.c;
                                        boolean z13 = r52.b;
                                        b bVar = this.g;
                                        b bVar2 = new b(rVar7, g10, z12, z13, bVar);
                                        this.g = bVar2;
                                        bVar2.g = i30;
                                        bVar2.h = i30;
                                        if (bVar != null) {
                                            bVar.f = bVar2;
                                        }
                                        cVar2 = rVar7;
                                        i10 = i13;
                                        break;
                                    }
                                    cVar2 = cVar4;
                                    i10 = i13;
                                } else {
                                    int i33 = this.f;
                                    int length = this.e.length();
                                    while (true) {
                                        int i34 = this.f;
                                        if (i34 != length) {
                                            if (!this.a.get(this.e.charAt(i34))) {
                                                this.f++;
                                            }
                                        }
                                    }
                                    int i35 = this.f;
                                    if (i33 != i35) {
                                        cVar2 = new r(this.e.substring(i33, i35));
                                        i10 = i13;
                                    }
                                    cVar2 = cVar4;
                                    i10 = i13;
                                }
                                break;
                        }
                    } else {
                        String d14 = d(n);
                        if (d14 != null) {
                            int i36 = this.f;
                            do {
                                d = d(m);
                                if (d == null) {
                                    this.f = i36;
                                    rVar2 = new r(d14);
                                    cVar2 = rVar2;
                                }
                            } while (!d.equals(d14));
                            ve.d dVar = new ve.d(0);
                            String replace = this.e.substring(i36, this.f - d14.length()).replace('\n', ' ');
                            if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                                int length2 = replace.length();
                                if (e8.b(' ', replace, 0, length2) != length2) {
                                    replace = i0.m(1, 1, replace);
                                }
                            }
                            dVar.h = replace;
                            cVar3 = dVar;
                            cVar2 = cVar3;
                        }
                        cVar2 = null;
                    }
                    i10 = 0;
                } else {
                    int i37 = this.f + 1;
                    this.f = i37;
                    if (g() == '[') {
                        this.f++;
                        r rVar8 = new r("![");
                        f6.f fVar5 = this.h;
                        f6.f fVar6 = new f6.f(rVar8, i37, fVar5, this.g, true);
                        if (fVar5 != null) {
                            fVar5.d = true;
                        }
                        this.h = fVar6;
                        cVar2 = rVar8;
                        i10 = 0;
                    } else {
                        rVar = new r("!");
                        cVar2 = rVar;
                        i10 = 0;
                    }
                }
                if (cVar2 != null) {
                    cVar5 = cVar2;
                } else {
                    this.f++;
                    cVar5 = new r(String.valueOf(g10));
                }
            }
            if (cVar5 == null) {
                h(null);
                df.c cVar10 = (df.c) cVar.c;
                df.c cVar11 = (df.c) cVar.d;
                if (cVar10 == cVar11) {
                    return;
                }
                f(cVar10, cVar11);
                return;
            }
            cVar.b(cVar5);
            i13 = i10;
            cVar4 = null;
        }
    }

    public final String d(Pattern pattern) {
        if (this.f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f < this.e.length()) {
            return this.e.charAt(this.f);
        }
        return (char) 0;
    }

    public final void h(b bVar) {
        boolean z10;
        df.c cVar;
        HashMap hashMap = new HashMap();
        b bVar2 = this.g;
        while (bVar2 != null) {
            b bVar3 = bVar2.e;
            if (bVar3 == bVar) {
                break;
            } else {
                bVar2 = bVar3;
            }
        }
        while (bVar2 != null) {
            r rVar = bVar2.a;
            char c10 = bVar2.b;
            ye.a aVar = (ye.a) this.c.get(Character.valueOf(c10));
            if (!bVar2.d || aVar == null) {
                bVar2 = bVar2.f;
            } else {
                char e = aVar.e();
                b bVar4 = bVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.c && bVar4.b == e) {
                        i10 = aVar.a(bVar4, bVar2);
                        z11 = true;
                        if (i10 > 0) {
                            z10 = true;
                            break;
                        }
                    }
                    bVar4 = bVar4.e;
                }
                z10 = z11;
                z11 = false;
                if (z11) {
                    r rVar2 = bVar4.a;
                    bVar4.g -= i10;
                    bVar2.g -= i10;
                    rVar2.g = i0.m(i10, 0, rVar2.g);
                    rVar.g = i0.m(i10, 0, rVar.g);
                    b bVar5 = bVar2.e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        b bVar6 = bVar5.e;
                        i(bVar5);
                        bVar5 = bVar6;
                    }
                    if (rVar2 != rVar && (cVar = (df.c) rVar2.f) != rVar) {
                        f(cVar, (df.c) rVar.e);
                    }
                    aVar.c(rVar2, rVar, i10);
                    if (bVar4.g == 0) {
                        bVar4.a.g();
                        i(bVar4);
                    }
                    if (bVar2.g == 0) {
                        b bVar7 = bVar2.f;
                        rVar.g();
                        i(bVar2);
                        bVar2 = bVar7;
                    }
                } else {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), bVar2.e);
                        if (!bVar2.c) {
                            i(bVar2);
                        }
                    }
                    bVar2 = bVar2.f;
                }
            }
        }
        while (true) {
            b bVar8 = this.g;
            if (bVar8 == null || bVar8 == bVar) {
                return;
            } else {
                i(bVar8);
            }
        }
    }

    public final void i(b bVar) {
        b bVar2 = bVar.e;
        if (bVar2 != null) {
            bVar2.f = bVar.f;
        }
        b bVar3 = bVar.f;
        if (bVar3 == null) {
            this.g = bVar2;
        } else {
            bVar3.e = bVar2;
        }
    }
}
