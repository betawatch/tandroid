// default package

import java.util.ArrayList;
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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class vp5 implements tp5 {
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
    public final um4 d;
    public String e;
    public int f;
    public oe3 g;
    public az0 h;

    public vp5(um4 um4Var) {
        ArrayList arrayList = (ArrayList) um4Var.b;
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new mx((byte) 0), new mx((byte) 1)), hashMap);
        c(arrayList, hashMap);
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
        this.d = um4Var;
    }

    public static void b(char c, pe3 pe3Var, HashMap hashMap) {
        if (((pe3) hashMap.put(Character.valueOf(c), pe3Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void c(List list, HashMap hashMap) {
        nqa nqaVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pe3 pe3Var = (pe3) it.next();
            char e = pe3Var.e();
            char b = pe3Var.b();
            if (e == b) {
                pe3 pe3Var2 = (pe3) hashMap.get(Character.valueOf(e));
                if (pe3Var2 == null || pe3Var2.e() != pe3Var2.b()) {
                    b(e, pe3Var, hashMap);
                } else {
                    if (pe3Var2 instanceof nqa) {
                        nqaVar = (nqa) pe3Var2;
                    } else {
                        nqa nqaVar2 = new nqa(e);
                        nqaVar2.f(pe3Var2);
                        nqaVar = nqaVar2;
                    }
                    nqaVar.f(pe3Var);
                    hashMap.put(Character.valueOf(e), nqaVar);
                }
            } else {
                b(e, pe3Var, hashMap);
                b(b, pe3Var, hashMap);
            }
        }
    }

    public static void e(qkb qkbVar, qkb qkbVar2, int i2) {
        if (qkbVar == null || qkbVar2 == null || qkbVar == qkbVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(qkbVar.g);
        yi6 yi6Var = (yi6) qkbVar.f;
        yi6 yi6Var2 = (yi6) qkbVar2.f;
        while (yi6Var != yi6Var2) {
            sb.append(((qkb) yi6Var).g);
            yi6 yi6Var3 = (yi6) yi6Var.f;
            yi6Var.g();
            yi6Var = yi6Var3;
        }
        qkbVar.g = sb.toString();
    }

    public static void f(yi6 yi6Var, yi6 yi6Var2) {
        qkb qkbVar = null;
        qkb qkbVar2 = null;
        int i2 = 0;
        while (yi6Var != null) {
            if (yi6Var instanceof qkb) {
                qkbVar2 = (qkb) yi6Var;
                if (qkbVar == null) {
                    qkbVar = qkbVar2;
                }
                i2 = qkbVar2.g.length() + i2;
            } else {
                e(qkbVar, qkbVar2, i2);
                qkbVar = null;
                qkbVar2 = null;
                i2 = 0;
            }
            if (yi6Var == yi6Var2) {
                break;
            } else {
                yi6Var = (yi6) yi6Var.f;
            }
        }
        e(qkbVar, qkbVar2, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0505 A[LOOP:0: B:2:0x0013->B:7:0x0505, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x050c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v19, types: [qkb] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v46, types: [qkb] */
    /* JADX WARN: Type inference failed for: r2v55, types: [p24] */
    /* JADX WARN: Type inference failed for: r2v60, types: [qkb] */
    /* JADX WARN: Type inference failed for: r2v61, types: [em5, yi6] */
    /* JADX WARN: Type inference failed for: r2v87, types: [em5] */
    /* JADX WARN: Type inference failed for: r2v88, types: [em5] */
    /* JADX WARN: Type inference failed for: r3v18, types: [yj2] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r9v29, types: [uz1] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    @Override // tp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, yi6 yi6Var) {
        int i2;
        p24 p24Var;
        yi6 yi6Var2;
        ?? qkbVar;
        qkb qkbVar2;
        byte b;
        em5 em5Var;
        String d;
        yi6 yi6Var3;
        int i3;
        boolean z;
        String str2;
        String str3;
        ?? r4;
        ?? r8;
        ?? r9;
        this.e = str.trim();
        int i4 = 0;
        this.f = 0;
        qkb qkbVar3 = null;
        this.g = null;
        this.h = null;
        yi6 yi6Var4 = null;
        while (true) {
            char g = g();
            if (g == 0) {
                i2 = i4;
            } else {
                if (g == '\n') {
                    this.f++;
                    if (yi6Var4 instanceof qkb) {
                        qkb qkbVar4 = (qkb) yi6Var4;
                        if (qkbVar4.g.endsWith(" ")) {
                            String str4 = qkbVar4.g;
                            Matcher matcher = t.matcher(str4);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i2 = 0;
                            if (end > 0) {
                                qkbVar4.g = bs2.n(end, 0, str4);
                            }
                            p24Var = end >= 2 ? new p24((byte) 1) : new p24((byte) 2);
                            yi6Var2 = p24Var;
                        }
                    }
                    i2 = 0;
                    p24Var = new p24((byte) 2);
                    yi6Var2 = p24Var;
                } else if (g != '!') {
                    if (g == '&') {
                        String d2 = d(l);
                        if (d2 != null) {
                            qkbVar2 = new qkb(di5.a(d2));
                            yi6Var2 = qkbVar2;
                        }
                        yi6Var2 = null;
                    } else if (g != '<') {
                        if (g != '`') {
                            switch (g) {
                                case jn7.b1 /* 91 */:
                                    int i5 = this.f;
                                    this.f = i5 + 1;
                                    qkb qkbVar5 = new qkb("[");
                                    az0 az0Var = this.h;
                                    az0 az0Var2 = new az0(qkbVar5, i5, az0Var, this.g, false);
                                    if (az0Var != null) {
                                        az0Var.d = true;
                                    }
                                    this.h = az0Var2;
                                    yi6Var2 = qkbVar5;
                                    break;
                                case jn7.c1 /* 92 */:
                                    this.f++;
                                    if (g() == '\n') {
                                        qkbVar = new p24((byte) 1);
                                        this.f++;
                                    } else {
                                        if (this.f < this.e.length()) {
                                            String str5 = this.e;
                                            int i6 = this.f;
                                            if (k.matcher(str5.substring(i6, i6 + 1)).matches()) {
                                                String str6 = this.e;
                                                int i7 = this.f;
                                                qkb qkbVar6 = new qkb(str6.substring(i7, i7 + 1));
                                                this.f++;
                                                yi6Var2 = qkbVar6;
                                                break;
                                            }
                                        }
                                        qkbVar = new qkb("\\");
                                    }
                                    yi6Var2 = qkbVar;
                                    break;
                                case jn7.d1 /* 93 */:
                                    int i8 = this.f + 1;
                                    this.f = i8;
                                    az0 az0Var3 = this.h;
                                    if (az0Var3 == null) {
                                        yi6Var3 = new qkb("]");
                                        break;
                                    } else {
                                        qkb qkbVar7 = (qkb) az0Var3.e;
                                        boolean z2 = az0Var3.a;
                                        if (!az0Var3.c) {
                                            this.h = (az0) az0Var3.f;
                                            yi6Var3 = new qkb("]");
                                            break;
                                        } else {
                                            if (g() == '(') {
                                                this.f++;
                                                Pattern pattern = q;
                                                d(pattern);
                                                i3 = 1;
                                                int a = kse.a(this.f, this.e);
                                                if (a == -1) {
                                                    str2 = null;
                                                } else {
                                                    char g2 = g();
                                                    String str7 = this.e;
                                                    int i9 = this.f;
                                                    String substring = g2 == '<' ? str7.substring(i9 + 1, a - 1) : str7.substring(i9, a);
                                                    this.f = a;
                                                    str2 = u44.a(substring);
                                                }
                                                if (str2 != null) {
                                                    d(pattern);
                                                    String str8 = this.e;
                                                    int i10 = this.f;
                                                    if (s.matcher(str8.substring(i10 - 1, i10)).matches()) {
                                                        int c = kse.c(this.f, this.e);
                                                        if (c == -1) {
                                                            str3 = null;
                                                        } else {
                                                            String substring2 = this.e.substring(this.f + 1, c - 1);
                                                            this.f = c;
                                                            str3 = u44.a(substring2);
                                                        }
                                                        d(pattern);
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    if (g() == ')') {
                                                        this.f++;
                                                        z = true;
                                                    } else {
                                                        this.f = i8;
                                                        z = false;
                                                    }
                                                    if (!z) {
                                                        int i11 = this.f;
                                                        if (i11 < this.e.length() && this.e.charAt(this.f) == '[') {
                                                            int i12 = this.f + 1;
                                                            int b2 = kse.b(i12, this.e);
                                                            int i13 = b2 - i12;
                                                            if (b2 != -1 && i13 <= 999 && b2 < this.e.length() && this.e.charAt(b2) == ']') {
                                                                this.f = b2 + 1;
                                                            }
                                                        }
                                                        int i14 = this.f - i11;
                                                        String substring3 = i14 > 2 ? this.e.substring(i11, i14 + i11) : !az0Var3.d ? this.e.substring(az0Var3.b, i8) : null;
                                                        if (substring3 != null) {
                                                            Pattern pattern2 = u44.a;
                                                            i66 i66Var = (i66) ((Map) this.d.c).get(u44.c.matcher(substring3.substring(i3, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                            if (i66Var != null) {
                                                                str2 = i66Var.h;
                                                                str3 = i66Var.i;
                                                                z = true;
                                                            }
                                                        }
                                                    }
                                                    if (z) {
                                                        this.f = i8;
                                                        this.h = (az0) this.h.f;
                                                        qkbVar = new qkb("]");
                                                    } else {
                                                        qkbVar = z2 ? new em5(str2, str3, (byte) 0) : new em5(str2, str3, (byte) 1);
                                                        yi6 yi6Var5 = (yi6) qkbVar7.f;
                                                        while (yi6Var5 != null) {
                                                            yi6 yi6Var6 = (yi6) yi6Var5.f;
                                                            qkbVar.b(yi6Var5);
                                                            yi6Var5 = yi6Var6;
                                                        }
                                                        h((oe3) az0Var3.g);
                                                        yi6 yi6Var7 = (yi6) qkbVar.c;
                                                        yi6 yi6Var8 = (yi6) qkbVar.d;
                                                        if (yi6Var7 != yi6Var8) {
                                                            f(yi6Var7, yi6Var8);
                                                        }
                                                        qkbVar7.g();
                                                        az0 az0Var4 = (az0) this.h.f;
                                                        this.h = az0Var4;
                                                        if (!z2) {
                                                            while (az0Var4 != null) {
                                                                if (!az0Var4.a) {
                                                                    az0Var4.c = false;
                                                                }
                                                                az0Var4 = (az0) az0Var4.f;
                                                            }
                                                        }
                                                    }
                                                    yi6Var2 = qkbVar;
                                                    break;
                                                } else {
                                                    z = false;
                                                }
                                            } else {
                                                i3 = 1;
                                                z = false;
                                                str2 = null;
                                            }
                                            str3 = null;
                                            if (!z) {
                                            }
                                            if (z) {
                                            }
                                            yi6Var2 = qkbVar;
                                        }
                                    }
                                    break;
                                default:
                                    if (this.b.get(g)) {
                                        pe3 pe3Var = (pe3) this.c.get(Character.valueOf(g));
                                        int i15 = this.f;
                                        int i16 = i4;
                                        while (g() == g) {
                                            i16++;
                                            this.f++;
                                        }
                                        if (i16 < pe3Var.c()) {
                                            this.f = i15;
                                            r9 = qkbVar3;
                                        } else {
                                            String substring4 = i15 == 0 ? "\n" : this.e.substring(i15 - 1, i15);
                                            char g3 = g();
                                            String valueOf = g3 != 0 ? String.valueOf(g3) : "\n";
                                            Pattern pattern3 = i;
                                            boolean matches = pattern3.matcher(substring4).matches();
                                            Pattern pattern4 = r;
                                            boolean matches2 = pattern4.matcher(substring4).matches();
                                            boolean matches3 = pattern3.matcher(valueOf).matches();
                                            boolean matches4 = pattern4.matcher(valueOf).matches();
                                            int i17 = (matches4 || !(!matches3 || matches2 || matches)) ? i4 : 1;
                                            int i18 = (matches2 || !(!matches || matches4 || matches3)) ? i4 : 1;
                                            if (g == '_') {
                                                int i19 = (i17 == 0 || !(i18 == 0 || matches)) ? i4 : 1;
                                                if (i18 == 0 || !(i17 == 0 || matches3)) {
                                                    r8 = i4;
                                                    r4 = i19;
                                                } else {
                                                    r8 = 1;
                                                    r4 = i19;
                                                }
                                            } else {
                                                int i20 = (i17 == 0 || g != pe3Var.e()) ? i4 : 1;
                                                int i21 = (i18 == 0 || g != pe3Var.b()) ? i4 : 1;
                                                r4 = i20;
                                                r8 = i21;
                                            }
                                            this.f = i15;
                                            r9 = new uz1(i16, r4, r8);
                                        }
                                        if (r9 != 0) {
                                            int i22 = r9.a;
                                            int i23 = i15 + i22;
                                            this.f = i23;
                                            qkb qkbVar8 = new qkb(this.e.substring(i15, i23));
                                            boolean z3 = r9.c;
                                            boolean z4 = r9.b;
                                            oe3 oe3Var = this.g;
                                            oe3 oe3Var2 = new oe3(qkbVar8, g, z3, z4, oe3Var);
                                            this.g = oe3Var2;
                                            oe3Var2.g = i22;
                                            oe3Var2.h = i22;
                                            if (oe3Var != null) {
                                                oe3Var.f = oe3Var2;
                                            }
                                            yi6Var2 = qkbVar8;
                                            i2 = i4;
                                            break;
                                        }
                                        yi6Var2 = qkbVar3;
                                        i2 = i4;
                                    } else {
                                        int i24 = this.f;
                                        int length = this.e.length();
                                        while (true) {
                                            int i25 = this.f;
                                            if (i25 != length) {
                                                if (!this.a.get(this.e.charAt(i25))) {
                                                    this.f++;
                                                }
                                            }
                                        }
                                        int i26 = this.f;
                                        if (i24 != i26) {
                                            yi6Var2 = new qkb(this.e.substring(i24, i26));
                                            i2 = i4;
                                        }
                                        yi6Var2 = qkbVar3;
                                        i2 = i4;
                                    }
                                    break;
                            }
                        } else {
                            String d3 = d(n);
                            if (d3 != null) {
                                int i27 = this.f;
                                do {
                                    d = d(m);
                                    if (d == null) {
                                        this.f = i27;
                                        qkbVar2 = new qkb(d3);
                                        yi6Var2 = qkbVar2;
                                    }
                                } while (!d.equals(d3));
                                yj2 yj2Var = new yj2((byte) 0);
                                String replace = this.e.substring(i27, this.f - d3.length()).replace('\n', ' ');
                                if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                                    int length2 = replace.length();
                                    if (dve.b(' ', replace, 0, length2) != length2) {
                                        replace = bs2.n(1, 1, replace);
                                    }
                                }
                                yj2Var.h = replace;
                                yi6Var3 = yj2Var;
                            }
                            yi6Var2 = null;
                        }
                        yi6Var2 = yi6Var3;
                    } else {
                        String d4 = d(o);
                        if (d4 != null) {
                            b = 1;
                            String n2 = bs2.n(1, 1, d4);
                            em5Var = new em5("mailto:".concat(n2), null, (byte) 1);
                            em5Var.b(new qkb(n2));
                        } else {
                            b = 1;
                            String d5 = d(p);
                            if (d5 != null) {
                                String n3 = bs2.n(1, 1, d5);
                                em5Var = new em5(n3, null, (byte) 1);
                                em5Var.b(new qkb(n3));
                            } else {
                                yi6Var2 = null;
                                if (yi6Var2 == null) {
                                    String d6 = d(j);
                                    if (d6 != null) {
                                        ?? yj2Var2 = new yj2(b);
                                        yj2Var2.h = d6;
                                        qkbVar2 = yj2Var2;
                                        yi6Var2 = qkbVar2;
                                    }
                                    yi6Var2 = null;
                                }
                            }
                        }
                        yi6Var2 = em5Var;
                        if (yi6Var2 == null) {
                        }
                    }
                    i2 = 0;
                } else {
                    int i28 = this.f + 1;
                    this.f = i28;
                    if (g() == '[') {
                        this.f++;
                        qkb qkbVar9 = new qkb("![");
                        az0 az0Var5 = this.h;
                        az0 az0Var6 = new az0(qkbVar9, i28, az0Var5, this.g, true);
                        if (az0Var5 != null) {
                            az0Var5.d = true;
                        }
                        this.h = az0Var6;
                        yi6Var2 = qkbVar9;
                        i2 = 0;
                    } else {
                        qkbVar = new qkb("!");
                        yi6Var2 = qkbVar;
                        i2 = 0;
                    }
                }
                if (yi6Var2 != null) {
                    yi6Var4 = yi6Var2;
                    if (yi6Var4 != null) {
                        h(null);
                        yi6 yi6Var9 = (yi6) yi6Var.c;
                        yi6 yi6Var10 = (yi6) yi6Var.d;
                        if (yi6Var9 == yi6Var10) {
                            return;
                        }
                        f(yi6Var9, yi6Var10);
                        return;
                    }
                    yi6Var.b(yi6Var4);
                    i4 = i2;
                    qkbVar3 = null;
                } else {
                    this.f++;
                    qkbVar3 = new qkb(String.valueOf(g));
                }
            }
            yi6Var4 = qkbVar3;
            if (yi6Var4 != null) {
            }
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

    public final void h(oe3 oe3Var) {
        boolean z;
        yi6 yi6Var;
        HashMap hashMap = new HashMap();
        oe3 oe3Var2 = this.g;
        while (oe3Var2 != null) {
            oe3 oe3Var3 = oe3Var2.e;
            if (oe3Var3 == oe3Var) {
                break;
            } else {
                oe3Var2 = oe3Var3;
            }
        }
        while (oe3Var2 != null) {
            qkb qkbVar = oe3Var2.a;
            char c = oe3Var2.b;
            pe3 pe3Var = (pe3) this.c.get(Character.valueOf(c));
            if (!oe3Var2.d || pe3Var == null) {
                oe3Var2 = oe3Var2.f;
            } else {
                char e = pe3Var.e();
                oe3 oe3Var4 = oe3Var2;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    oe3Var4 = oe3Var4.e;
                    if (oe3Var4 == null || oe3Var4 == oe3Var || oe3Var4 == hashMap.get(Character.valueOf(c))) {
                        break;
                    }
                    if (oe3Var4.c && oe3Var4.b == e) {
                        i2 = pe3Var.d(oe3Var4, oe3Var2);
                        z2 = true;
                        if (i2 > 0) {
                            z = true;
                            break;
                        }
                    }
                }
                z = z2;
                z2 = false;
                if (z2) {
                    qkb qkbVar2 = oe3Var4.a;
                    oe3Var4.g -= i2;
                    oe3Var2.g -= i2;
                    qkbVar2.g = bs2.n(i2, 0, qkbVar2.g);
                    qkbVar.g = bs2.n(i2, 0, qkbVar.g);
                    oe3 oe3Var5 = oe3Var2.e;
                    while (oe3Var5 != null && oe3Var5 != oe3Var4) {
                        oe3 oe3Var6 = oe3Var5.e;
                        i(oe3Var5);
                        oe3Var5 = oe3Var6;
                    }
                    if (qkbVar2 != qkbVar && (yi6Var = (yi6) qkbVar2.f) != qkbVar) {
                        f(yi6Var, (yi6) qkbVar.e);
                    }
                    pe3Var.a(qkbVar2, qkbVar, i2);
                    if (oe3Var4.g == 0) {
                        oe3Var4.a.g();
                        i(oe3Var4);
                    }
                    if (oe3Var2.g == 0) {
                        oe3 oe3Var7 = oe3Var2.f;
                        qkbVar.g();
                        i(oe3Var2);
                        oe3Var2 = oe3Var7;
                    }
                } else {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), oe3Var2.e);
                        if (!oe3Var2.c) {
                            i(oe3Var2);
                        }
                    }
                    oe3Var2 = oe3Var2.f;
                }
            }
        }
        while (true) {
            oe3 oe3Var8 = this.g;
            if (oe3Var8 == null || oe3Var8 == oe3Var) {
                return;
            } else {
                i(oe3Var8);
            }
        }
    }

    public final void i(oe3 oe3Var) {
        oe3 oe3Var2 = oe3Var.e;
        if (oe3Var2 != null) {
            oe3Var2.f = oe3Var.f;
        }
        oe3 oe3Var3 = oe3Var.f;
        if (oe3Var3 == null) {
            this.g = oe3Var2;
        } else {
            oe3Var3.e = oe3Var2;
        }
    }
}
