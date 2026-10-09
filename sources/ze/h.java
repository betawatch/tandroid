package ze;

import b2.n1;
import cf.p;
import cf.s;
import com.google.android.gms.internal.vision.e2;
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
import org.telegram.ui.ActionBar.b5;
import sc.v;
import v7.h0;
import v7.i0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class h implements df.a {
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
    public final b5 d;
    public String e;
    public int f;
    public b g;
    public f6.f h;

    public h(b5 b5Var) {
        List list = (List) b5Var.b;
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new af.a(0), new af.a(1)), hashMap);
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
        this.d = b5Var;
    }

    public static void b(char c10, ff.a aVar, HashMap hashMap) {
        if (((ff.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        n nVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ff.a aVar = (ff.a) it.next();
            char e7 = aVar.e();
            char c10 = aVar.c();
            if (e7 == c10) {
                ff.a aVar2 = (ff.a) hashMap.get(Character.valueOf(e7));
                if (aVar2 == null || aVar2.e() != aVar2.c()) {
                    b(e7, aVar, hashMap);
                } else {
                    if (aVar2 instanceof n) {
                        nVar = (n) aVar2;
                    } else {
                        n nVar2 = new n(e7);
                        nVar2.f(aVar2);
                        nVar = nVar2;
                    }
                    nVar.f(aVar);
                    hashMap.put(Character.valueOf(e7), nVar);
                }
            } else {
                b(e7, aVar, hashMap);
                b(c10, aVar, hashMap);
            }
        }
    }

    public static void e(s sVar, s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(sVar.g);
        p pVar = (p) sVar.f;
        p pVar2 = (p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((s) pVar).g);
            p pVar3 = (p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void f(p pVar, p pVar2) {
        s sVar = null;
        s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof s) {
                sVar2 = (s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.g.length() + i10;
            } else {
                e(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            } else {
                pVar = (p) pVar.f;
            }
        }
        e(sVar, sVar2, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0443  */
    /* JADX WARN: Type inference failed for: r3v16, types: [cf.s] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19, types: [cf.d] */
    /* JADX WARN: Type inference failed for: r3v23, types: [cf.s] */
    /* JADX WARN: Type inference failed for: r3v41, types: [cf.k, cf.p] */
    /* JADX WARN: Type inference failed for: r3v57, types: [cf.k] */
    /* JADX WARN: Type inference failed for: r3v58, types: [cf.k] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r5v42, types: [b2.n1] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // df.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, p pVar) {
        int i10;
        cf.g gVar;
        p pVar2;
        p sVar;
        ?? sVar2;
        int i11;
        cf.k kVar;
        String d;
        p pVar3;
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
        p pVar4 = null;
        this.g = null;
        this.h = null;
        p pVar5 = null;
        while (true) {
            char g10 = g();
            if (g10 == 0) {
                pVar5 = pVar4;
                i10 = i13;
            } else {
                if (g10 == '\n') {
                    this.f++;
                    if (pVar5 instanceof s) {
                        s sVar3 = (s) pVar5;
                        if (sVar3.g.endsWith(" ")) {
                            String str4 = sVar3.g;
                            Matcher matcher = t.matcher(str4);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i10 = 0;
                            if (end > 0) {
                                sVar3.g = e2.i(end, 0, str4);
                            }
                            gVar = end >= 2 ? new cf.g(1) : new cf.g(2);
                            pVar2 = gVar;
                        }
                    }
                    i10 = 0;
                    gVar = new cf.g(2);
                    pVar2 = gVar;
                } else if (g10 != '!') {
                    if (g10 == '&') {
                        String d10 = d(l);
                        if (d10 != null) {
                            sVar2 = new s(bf.b.a(d10));
                            pVar2 = sVar2;
                        }
                        pVar2 = null;
                    } else if (g10 == '<') {
                        String d11 = d(o);
                        if (d11 != null) {
                            i11 = 1;
                            String i14 = e2.i(1, 1, d11);
                            kVar = new cf.k(1, v.i("mailto:", i14), null);
                            kVar.b(new s(i14));
                        } else {
                            i11 = 1;
                            String d12 = d(p);
                            if (d12 != null) {
                                String i15 = e2.i(1, 1, d12);
                                kVar = new cf.k(1, i15, null);
                                kVar.b(new s(i15));
                            } else {
                                pVar2 = null;
                                if (pVar2 == null) {
                                    String d13 = d(j);
                                    if (d13 != null) {
                                        sVar2 = new cf.d(i11);
                                        sVar2.h = d13;
                                        pVar2 = sVar2;
                                    }
                                    pVar2 = null;
                                }
                            }
                        }
                        pVar2 = kVar;
                        if (pVar2 == null) {
                        }
                    } else if (g10 != '`') {
                        switch (g10) {
                            case '[':
                                int i16 = this.f;
                                this.f = i16 + 1;
                                s sVar4 = new s("[");
                                f6.f fVar = this.h;
                                f6.f fVar2 = new f6.f(sVar4, i16, fVar, this.g, false);
                                if (fVar != null) {
                                    fVar.d = true;
                                }
                                this.h = fVar2;
                                pVar2 = sVar4;
                                break;
                            case '\\':
                                this.f++;
                                if (g() == '\n') {
                                    sVar = new cf.g(1);
                                    this.f++;
                                } else {
                                    if (this.f < this.e.length()) {
                                        String str5 = this.e;
                                        int i17 = this.f;
                                        if (k.matcher(str5.substring(i17, i17 + 1)).matches()) {
                                            String str6 = this.e;
                                            int i18 = this.f;
                                            s sVar5 = new s(str6.substring(i18, i18 + 1));
                                            this.f++;
                                            pVar2 = sVar5;
                                            break;
                                        }
                                    }
                                    sVar = new s("\\");
                                }
                                pVar2 = sVar;
                                break;
                            case ']':
                                int i19 = this.f + 1;
                                this.f = i19;
                                f6.f fVar3 = this.h;
                                if (fVar3 != null) {
                                    s sVar6 = (s) fVar3.e;
                                    boolean z11 = fVar3.b;
                                    if (fVar3.c) {
                                        if (g() == '(') {
                                            this.f++;
                                            Pattern pattern = q;
                                            d(pattern);
                                            i12 = 1;
                                            int a2 = h0.a(this.f, this.e);
                                            if (a2 == -1) {
                                                str3 = null;
                                            } else {
                                                String substring = g() == '<' ? this.e.substring(this.f + 1, a2 - 1) : this.e.substring(this.f, a2);
                                                this.f = a2;
                                                str3 = bf.a.a(substring);
                                            }
                                            if (str3 != null) {
                                                d(pattern);
                                                String str7 = this.e;
                                                int i20 = this.f;
                                                if (s.matcher(str7.substring(i20 - 1, i20)).matches()) {
                                                    int c10 = h0.c(this.f, this.e);
                                                    if (c10 == -1) {
                                                        str2 = null;
                                                    } else {
                                                        String substring2 = this.e.substring(this.f + 1, c10 - 1);
                                                        this.f = c10;
                                                        str2 = bf.a.a(substring2);
                                                    }
                                                    d(pattern);
                                                } else {
                                                    str2 = null;
                                                }
                                                if (g() == ')') {
                                                    this.f++;
                                                    z10 = true;
                                                } else {
                                                    this.f = i19;
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
                                            int i21 = this.f;
                                            if (i21 < this.e.length() && this.e.charAt(this.f) == '[') {
                                                int i22 = this.f + 1;
                                                int b10 = h0.b(i22, this.e);
                                                int i23 = b10 - i22;
                                                if (b10 != -1 && i23 <= 999 && b10 < this.e.length() && this.e.charAt(b10) == ']') {
                                                    this.f = b10 + 1;
                                                }
                                            }
                                            int i24 = this.f - i21;
                                            String substring3 = i24 > 2 ? this.e.substring(i21, i24 + i21) : !fVar3.d ? this.e.substring(fVar3.a, i19) : null;
                                            if (substring3 != null) {
                                                Pattern pattern2 = bf.a.a;
                                                cf.m mVar = (cf.m) ((Map) this.d.c).get(bf.a.c.matcher(substring3.substring(i12, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                if (mVar != null) {
                                                    str3 = mVar.h;
                                                    str2 = mVar.i;
                                                    z10 = true;
                                                }
                                            }
                                        }
                                        if (!z10) {
                                            this.f = i19;
                                            this.h = (f6.f) this.h.f;
                                            sVar = new s("]");
                                            pVar2 = sVar;
                                            break;
                                        } else {
                                            sVar2 = z11 ? new cf.k(0, str3, str2) : new cf.k(1, str3, str2);
                                            p pVar6 = (p) sVar6.f;
                                            while (pVar6 != null) {
                                                p pVar7 = (p) pVar6.f;
                                                sVar2.b(pVar6);
                                                pVar6 = pVar7;
                                            }
                                            h((b) fVar3.g);
                                            p pVar8 = (p) sVar2.c;
                                            p pVar9 = (p) sVar2.d;
                                            if (pVar8 != pVar9) {
                                                f(pVar8, pVar9);
                                            }
                                            sVar6.g();
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
                                            pVar2 = sVar2;
                                            break;
                                        }
                                    } else {
                                        this.h = (f6.f) fVar3.f;
                                        pVar3 = new s("]");
                                    }
                                } else {
                                    pVar3 = new s("]");
                                }
                                pVar2 = pVar3;
                                break;
                            default:
                                if (this.b.get(g10)) {
                                    ff.a aVar = (ff.a) this.c.get(Character.valueOf(g10));
                                    int i25 = this.f;
                                    int i26 = i13;
                                    while (g() == g10) {
                                        i26++;
                                        this.f++;
                                    }
                                    if (i26 < aVar.d()) {
                                        this.f = i25;
                                        r52 = pVar4;
                                    } else {
                                        String substring4 = i25 == 0 ? "\n" : this.e.substring(i25 - 1, i25);
                                        char g11 = g();
                                        String valueOf = g11 != 0 ? String.valueOf(g11) : "\n";
                                        Pattern pattern3 = i;
                                        boolean matches = pattern3.matcher(substring4).matches();
                                        Pattern pattern4 = r;
                                        boolean matches2 = pattern4.matcher(substring4).matches();
                                        boolean matches3 = pattern3.matcher(valueOf).matches();
                                        boolean matches4 = pattern4.matcher(valueOf).matches();
                                        int i27 = (matches4 || !(!matches3 || matches2 || matches)) ? i13 : 1;
                                        int i28 = (matches2 || !(!matches || matches4 || matches3)) ? i13 : 1;
                                        if (g10 == '_') {
                                            int i29 = (i27 == 0 || !(i28 == 0 || matches)) ? i13 : 1;
                                            if (i28 == 0 || !(i27 == 0 || matches3)) {
                                                r82 = i13;
                                                r42 = i29;
                                            } else {
                                                r82 = 1;
                                                r42 = i29;
                                            }
                                        } else {
                                            int i30 = (i27 == 0 || g10 != aVar.e()) ? i13 : 1;
                                            int i31 = (i28 == 0 || g10 != aVar.c()) ? i13 : 1;
                                            r42 = i30;
                                            r82 = i31;
                                        }
                                        this.f = i25;
                                        r52 = new n1(i26, r42, r82);
                                    }
                                    if (r52 != 0) {
                                        int i32 = r52.a;
                                        int i33 = this.f;
                                        int i34 = i33 + i32;
                                        this.f = i34;
                                        s sVar7 = new s(this.e.substring(i33, i34));
                                        boolean z12 = r52.c;
                                        boolean z13 = r52.b;
                                        b bVar = this.g;
                                        b bVar2 = new b(sVar7, g10, z12, z13, bVar);
                                        this.g = bVar2;
                                        bVar2.g = i32;
                                        bVar2.h = i32;
                                        if (bVar != null) {
                                            bVar.f = bVar2;
                                        }
                                        pVar2 = sVar7;
                                        i10 = i13;
                                        break;
                                    }
                                    pVar2 = pVar4;
                                    i10 = i13;
                                } else {
                                    int i35 = this.f;
                                    int length = this.e.length();
                                    while (true) {
                                        int i36 = this.f;
                                        if (i36 != length) {
                                            if (!this.a.get(this.e.charAt(i36))) {
                                                this.f++;
                                            }
                                        }
                                    }
                                    int i37 = this.f;
                                    if (i35 != i37) {
                                        pVar2 = new s(this.e.substring(i35, i37));
                                        i10 = i13;
                                    }
                                    pVar2 = pVar4;
                                    i10 = i13;
                                }
                                break;
                        }
                    } else {
                        String d14 = d(n);
                        if (d14 != null) {
                            int i38 = this.f;
                            do {
                                d = d(m);
                                if (d == null) {
                                    this.f = i38;
                                    sVar2 = new s(d14);
                                    pVar2 = sVar2;
                                }
                            } while (!d.equals(d14));
                            cf.d dVar = new cf.d(0);
                            String replace = this.e.substring(i38, this.f - d14.length()).replace('\n', ' ');
                            if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                                int length2 = replace.length();
                                if (i0.b(' ', replace, 0, length2) != length2) {
                                    replace = e2.i(1, 1, replace);
                                }
                            }
                            dVar.h = replace;
                            pVar3 = dVar;
                            pVar2 = pVar3;
                        }
                        pVar2 = null;
                    }
                    i10 = 0;
                } else {
                    int i39 = this.f + 1;
                    this.f = i39;
                    if (g() == '[') {
                        this.f++;
                        s sVar8 = new s("![");
                        f6.f fVar5 = this.h;
                        f6.f fVar6 = new f6.f(sVar8, i39, fVar5, this.g, true);
                        if (fVar5 != null) {
                            fVar5.d = true;
                        }
                        this.h = fVar6;
                        pVar2 = sVar8;
                        i10 = 0;
                    } else {
                        sVar = new s("!");
                        pVar2 = sVar;
                        i10 = 0;
                    }
                }
                if (pVar2 != null) {
                    pVar5 = pVar2;
                } else {
                    this.f++;
                    pVar5 = new s(String.valueOf(g10));
                }
            }
            if (pVar5 == null) {
                h(null);
                p pVar10 = (p) pVar.c;
                p pVar11 = (p) pVar.d;
                if (pVar10 == pVar11) {
                    return;
                }
                f(pVar10, pVar11);
                return;
            }
            pVar.b(pVar5);
            i13 = i10;
            pVar4 = null;
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
        p pVar;
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
            s sVar = bVar2.a;
            char c10 = bVar2.b;
            ff.a aVar = (ff.a) this.c.get(Character.valueOf(c10));
            if (!bVar2.d || aVar == null) {
                bVar2 = bVar2.f;
            } else {
                char e7 = aVar.e();
                b bVar4 = bVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.c && bVar4.b == e7) {
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
                    s sVar2 = bVar4.a;
                    bVar4.g -= i10;
                    bVar2.g -= i10;
                    sVar2.g = e2.i(i10, 0, sVar2.g);
                    sVar.g = e2.i(i10, 0, sVar.g);
                    b bVar5 = bVar2.e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        b bVar6 = bVar5.e;
                        i(bVar5);
                        bVar5 = bVar6;
                    }
                    if (sVar2 != sVar && (pVar = (p) sVar2.f) != sVar) {
                        f(pVar, (p) sVar.e);
                    }
                    aVar.b(sVar2, sVar, i10);
                    if (bVar4.g == 0) {
                        bVar4.a.g();
                        i(bVar4);
                    }
                    if (bVar2.g == 0) {
                        b bVar7 = bVar2.f;
                        sVar.g();
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
