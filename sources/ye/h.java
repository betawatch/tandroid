package ye;

import b2.n1;
import bf.p;
import bf.s;
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
import n7.z0;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class h implements cf.a {
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
    public final z0 d;
    public String e;
    public int f;
    public b g;
    public f6.f h;

    public h(z0 z0Var) {
        List list = (List) z0Var.b;
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new ze.a(0), new ze.a(1)), hashMap);
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
        this.d = z0Var;
    }

    public static void b(char c10, ef.a aVar, HashMap hashMap) {
        if (((ef.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void c(Iterable iterable, HashMap hashMap) {
        n nVar;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ef.a aVar = (ef.a) it.next();
            char e7 = aVar.e();
            char a2 = aVar.a();
            if (e7 == a2) {
                ef.a aVar2 = (ef.a) hashMap.get(Character.valueOf(e7));
                if (aVar2 == null || aVar2.e() != aVar2.a()) {
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
                b(a2, aVar, hashMap);
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
    /* JADX WARN: Removed duplicated region for block: B:222:0x043e  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14, types: [bf.s] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [bf.d] */
    /* JADX WARN: Type inference failed for: r3v21, types: [bf.s] */
    /* JADX WARN: Type inference failed for: r3v39, types: [bf.k, bf.p] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v53, types: [bf.k] */
    /* JADX WARN: Type inference failed for: r3v54, types: [bf.k] */
    @Override // cf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, p pVar) {
        bf.g gVar;
        p pVar2;
        p sVar;
        int i10;
        bf.k kVar;
        String d;
        p pVar3;
        String str2;
        boolean z10;
        String str3;
        boolean z11;
        boolean z12;
        n1 n1Var;
        this.e = str.trim();
        this.f = 0;
        ?? r32 = 0;
        this.g = null;
        this.h = null;
        p pVar4 = null;
        while (true) {
            char g10 = g();
            if (g10 == 0) {
                pVar4 = r32;
            } else {
                if (g10 == '\n') {
                    this.f++;
                    if (pVar4 instanceof s) {
                        s sVar2 = (s) pVar4;
                        if (sVar2.g.endsWith(" ")) {
                            String str4 = sVar2.g;
                            Matcher matcher = t.matcher(str4);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            if (end > 0) {
                                sVar2.g = e2.i(end, 0, str4);
                            }
                            gVar = end >= 2 ? new bf.g(1) : new bf.g(2);
                            pVar2 = gVar;
                        }
                    }
                    gVar = new bf.g(2);
                    pVar2 = gVar;
                } else if (g10 == '!') {
                    int i11 = this.f + 1;
                    this.f = i11;
                    if (g() == '[') {
                        this.f++;
                        s sVar3 = new s("![");
                        f6.f fVar = this.h;
                        f6.f fVar2 = new f6.f(sVar3, i11, fVar, this.g, true);
                        if (fVar != null) {
                            fVar.d = true;
                        }
                        this.h = fVar2;
                        pVar2 = sVar3;
                    } else {
                        sVar = new s("!");
                        pVar2 = sVar;
                    }
                } else if (g10 == '&') {
                    String d10 = d(l);
                    if (d10 != null) {
                        r32 = new s(af.b.a(d10));
                        pVar2 = r32;
                    }
                    pVar2 = null;
                } else if (g10 == '<') {
                    String d11 = d(o);
                    if (d11 != null) {
                        i10 = 1;
                        String i12 = e2.i(1, 1, d11);
                        kVar = new bf.k(1, p6.i("mailto:", i12), null);
                        kVar.b(new s(i12));
                    } else {
                        i10 = 1;
                        String d12 = d(p);
                        if (d12 != null) {
                            String i13 = e2.i(1, 1, d12);
                            kVar = new bf.k(1, i13, null);
                            kVar.b(new s(i13));
                        } else {
                            pVar2 = null;
                            if (pVar2 == null) {
                                String d13 = d(j);
                                if (d13 != null) {
                                    r32 = new bf.d(i10);
                                    r32.h = d13;
                                    pVar2 = r32;
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
                            int i14 = this.f;
                            this.f = i14 + 1;
                            s sVar4 = new s("[");
                            f6.f fVar3 = this.h;
                            f6.f fVar4 = new f6.f(sVar4, i14, fVar3, this.g, false);
                            if (fVar3 != null) {
                                fVar3.d = true;
                            }
                            this.h = fVar4;
                            pVar2 = sVar4;
                            break;
                        case '\\':
                            this.f++;
                            if (g() == '\n') {
                                sVar = new bf.g(1);
                                this.f++;
                            } else {
                                if (this.f < this.e.length()) {
                                    String str5 = this.e;
                                    int i15 = this.f;
                                    if (k.matcher(str5.substring(i15, i15 + 1)).matches()) {
                                        String str6 = this.e;
                                        int i16 = this.f;
                                        s sVar5 = new s(str6.substring(i16, i16 + 1));
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
                            int i17 = this.f + 1;
                            this.f = i17;
                            f6.f fVar5 = this.h;
                            if (fVar5 != null) {
                                s sVar6 = (s) fVar5.e;
                                boolean z13 = fVar5.b;
                                if (fVar5.c) {
                                    if (g() == '(') {
                                        this.f++;
                                        Pattern pattern = q;
                                        d(pattern);
                                        int b10 = se.b.b(this.f, this.e);
                                        if (b10 == -1) {
                                            str3 = null;
                                        } else {
                                            String substring = g() == '<' ? this.e.substring(this.f + 1, b10 - 1) : this.e.substring(this.f, b10);
                                            this.f = b10;
                                            str3 = af.a.a(substring);
                                        }
                                        if (str3 != null) {
                                            d(pattern);
                                            String str7 = this.e;
                                            int i18 = this.f;
                                            if (s.matcher(str7.substring(i18 - 1, i18)).matches()) {
                                                int d14 = se.b.d(this.f, this.e);
                                                if (d14 == -1) {
                                                    str2 = null;
                                                } else {
                                                    String substring2 = this.e.substring(this.f + 1, d14 - 1);
                                                    this.f = d14;
                                                    str2 = af.a.a(substring2);
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
                                        str2 = null;
                                        z10 = false;
                                        str3 = null;
                                    }
                                    if (!z10) {
                                        int i19 = this.f;
                                        if (i19 < this.e.length() && this.e.charAt(this.f) == '[') {
                                            int i20 = this.f + 1;
                                            int c10 = se.b.c(i20, this.e);
                                            int i21 = c10 - i20;
                                            if (c10 != -1 && i21 <= 999 && c10 < this.e.length() && this.e.charAt(c10) == ']') {
                                                this.f = c10 + 1;
                                            }
                                        }
                                        int i22 = this.f - i19;
                                        String substring3 = i22 > 2 ? this.e.substring(i19, i22 + i19) : !fVar5.d ? this.e.substring(fVar5.a, i17) : null;
                                        if (substring3 != null) {
                                            Pattern pattern2 = af.a.a;
                                            bf.m mVar = (bf.m) ((Map) this.d.c).get(af.a.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
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
                                        sVar = new s("]");
                                        pVar2 = sVar;
                                        break;
                                    } else {
                                        r32 = z13 ? new bf.k(0, str3, str2) : new bf.k(1, str3, str2);
                                        p pVar5 = (p) sVar6.f;
                                        while (pVar5 != null) {
                                            p pVar6 = (p) pVar5.f;
                                            r32.b(pVar5);
                                            pVar5 = pVar6;
                                        }
                                        h((b) fVar5.g);
                                        p pVar7 = (p) r32.c;
                                        p pVar8 = (p) r32.d;
                                        if (pVar7 != pVar8) {
                                            f(pVar7, pVar8);
                                        }
                                        sVar6.g();
                                        f6.f fVar6 = (f6.f) this.h.f;
                                        this.h = fVar6;
                                        if (!z13) {
                                            while (fVar6 != null) {
                                                if (!fVar6.b) {
                                                    fVar6.c = false;
                                                }
                                                fVar6 = (f6.f) fVar6.f;
                                            }
                                        }
                                        pVar2 = r32;
                                        break;
                                    }
                                } else {
                                    this.h = (f6.f) fVar5.f;
                                    pVar3 = new s("]");
                                }
                            } else {
                                pVar3 = new s("]");
                            }
                            pVar2 = pVar3;
                            break;
                        default:
                            if (this.b.get(g10)) {
                                ef.a aVar = (ef.a) this.c.get(Character.valueOf(g10));
                                int i23 = this.f;
                                int i24 = 0;
                                while (g() == g10) {
                                    i24++;
                                    this.f++;
                                }
                                if (i24 < aVar.c()) {
                                    this.f = i23;
                                    n1Var = r32;
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
                                    boolean z14 = !matches4 && (!matches3 || matches2 || matches);
                                    boolean z15 = !matches2 && (!matches || matches4 || matches3);
                                    if (g10 == '_') {
                                        z12 = z14 && (!z15 || matches);
                                        z11 = z15 && (!z14 || matches3);
                                    } else {
                                        boolean z16 = z14 && g10 == aVar.e();
                                        z11 = z15 && g10 == aVar.a();
                                        z12 = z16;
                                    }
                                    this.f = i23;
                                    n1Var = new n1(i24, z12, z11);
                                }
                                if (n1Var != null) {
                                    int i25 = n1Var.a;
                                    int i26 = this.f;
                                    int i27 = i26 + i25;
                                    this.f = i27;
                                    s sVar7 = new s(this.e.substring(i26, i27));
                                    boolean z17 = n1Var.c;
                                    boolean z18 = n1Var.b;
                                    b bVar = this.g;
                                    b bVar2 = new b(sVar7, g10, z17, z18, bVar);
                                    this.g = bVar2;
                                    bVar2.g = i25;
                                    bVar2.h = i25;
                                    if (bVar != null) {
                                        bVar.f = bVar2;
                                    }
                                    pVar2 = sVar7;
                                    break;
                                }
                                pVar2 = r32;
                                break;
                            } else {
                                int i28 = this.f;
                                int length = this.e.length();
                                while (true) {
                                    int i29 = this.f;
                                    if (i29 != length) {
                                        if (!this.a.get(this.e.charAt(i29))) {
                                            this.f++;
                                        }
                                    }
                                }
                                int i30 = this.f;
                                if (i28 != i30) {
                                    pVar2 = new s(this.e.substring(i28, i30));
                                    break;
                                }
                                pVar2 = r32;
                            }
                            break;
                    }
                } else {
                    String d15 = d(n);
                    if (d15 != null) {
                        int i31 = this.f;
                        do {
                            d = d(m);
                            if (d == null) {
                                this.f = i31;
                                r32 = new s(d15);
                                pVar2 = r32;
                            }
                        } while (!d.equals(d15));
                        bf.d dVar = new bf.d(0);
                        String replace = this.e.substring(i31, this.f - d15.length()).replace('\n', ' ');
                        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                            int length2 = replace.length();
                            if (t7.s.b(' ', replace, 0, length2) != length2) {
                                replace = e2.i(1, 1, replace);
                            }
                        }
                        dVar.h = replace;
                        pVar3 = dVar;
                        pVar2 = pVar3;
                    }
                    pVar2 = null;
                }
                if (pVar2 != null) {
                    pVar4 = pVar2;
                } else {
                    this.f++;
                    pVar4 = new s(String.valueOf(g10));
                }
            }
            if (pVar4 == null) {
                h(null);
                p pVar9 = (p) pVar.c;
                p pVar10 = (p) pVar.d;
                if (pVar9 == pVar10) {
                    return;
                }
                f(pVar9, pVar10);
                return;
            }
            pVar.b(pVar4);
            r32 = 0;
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
            ef.a aVar = (ef.a) this.c.get(Character.valueOf(c10));
            if (!bVar2.d || aVar == null) {
                bVar2 = bVar2.f;
            } else {
                char e7 = aVar.e();
                b bVar4 = bVar2.e;
                int i10 = 0;
                boolean z11 = false;
                while (bVar4 != null && bVar4 != bVar && bVar4 != hashMap.get(Character.valueOf(c10))) {
                    if (bVar4.c && bVar4.b == e7) {
                        i10 = aVar.b(bVar4, bVar2);
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
                    aVar.d(sVar2, sVar, i10);
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
