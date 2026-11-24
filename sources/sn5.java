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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sn5 implements qn5 {
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
    public final wk4 d;
    public String e;
    public int f;
    public ud3 g;
    public sy0 h;

    public sn5(wk4 wk4Var) {
        ArrayList arrayList = (ArrayList) wk4Var.b;
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new lx((byte) 0), new lx((byte) 1)), hashMap);
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
        this.d = wk4Var;
    }

    public static void b(char c, vd3 vd3Var, HashMap hashMap) {
        if (((vd3) hashMap.put(Character.valueOf(c), vd3Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void c(List list, HashMap hashMap) {
        qma qmaVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vd3 vd3Var = (vd3) it.next();
            char e = vd3Var.e();
            char b = vd3Var.b();
            if (e == b) {
                vd3 vd3Var2 = (vd3) hashMap.get(Character.valueOf(e));
                if (vd3Var2 == null || vd3Var2.e() != vd3Var2.b()) {
                    b(e, vd3Var, hashMap);
                } else {
                    if (vd3Var2 instanceof qma) {
                        qmaVar = (qma) vd3Var2;
                    } else {
                        qma qmaVar2 = new qma(e);
                        qmaVar2.f(vd3Var2);
                        qmaVar = qmaVar2;
                    }
                    qmaVar.f(vd3Var);
                    hashMap.put(Character.valueOf(e), qmaVar);
                }
            } else {
                b(e, vd3Var, hashMap);
                b(b, vd3Var, hashMap);
            }
        }
    }

    public static void e(ugb ugbVar, ugb ugbVar2, int i2) {
        if (ugbVar == null || ugbVar2 == null || ugbVar == ugbVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(ugbVar.g);
        tg6 tg6Var = (tg6) ugbVar.f;
        tg6 tg6Var2 = (tg6) ugbVar2.f;
        while (tg6Var != tg6Var2) {
            sb.append(((ugb) tg6Var).g);
            tg6 tg6Var3 = (tg6) tg6Var.f;
            tg6Var.g();
            tg6Var = tg6Var3;
        }
        ugbVar.g = sb.toString();
    }

    public static void f(tg6 tg6Var, tg6 tg6Var2) {
        ugb ugbVar = null;
        ugb ugbVar2 = null;
        int i2 = 0;
        while (tg6Var != null) {
            if (tg6Var instanceof ugb) {
                ugbVar2 = (ugb) tg6Var;
                if (ugbVar == null) {
                    ugbVar = ugbVar2;
                }
                i2 = ugbVar2.g.length() + i2;
            } else {
                e(ugbVar, ugbVar2, i2);
                ugbVar = null;
                ugbVar2 = null;
                i2 = 0;
            }
            if (tg6Var == tg6Var2) {
                break;
            } else {
                tg6Var = (tg6) tg6Var.f;
            }
        }
        e(ugbVar, ugbVar2, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0505 A[LOOP:0: B:2:0x0013->B:7:0x0505, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x050c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v19, types: [ugb] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v46, types: [ugb] */
    /* JADX WARN: Type inference failed for: r2v55, types: [u14] */
    /* JADX WARN: Type inference failed for: r2v60, types: [ugb] */
    /* JADX WARN: Type inference failed for: r2v61, types: [bk5, tg6] */
    /* JADX WARN: Type inference failed for: r2v87, types: [bk5] */
    /* JADX WARN: Type inference failed for: r2v88, types: [bk5] */
    /* JADX WARN: Type inference failed for: r3v18, types: [cj2] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r9v29, types: [cz1] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    @Override // qn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, tg6 tg6Var) {
        int i2;
        u14 u14Var;
        tg6 tg6Var2;
        ?? ugbVar;
        ugb ugbVar2;
        byte b;
        bk5 bk5Var;
        String d;
        tg6 tg6Var3;
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
        ugb ugbVar3 = null;
        this.g = null;
        this.h = null;
        tg6 tg6Var4 = null;
        while (true) {
            char g = g();
            if (g == 0) {
                i2 = i4;
            } else {
                if (g == '\n') {
                    this.f++;
                    if (tg6Var4 instanceof ugb) {
                        ugb ugbVar4 = (ugb) tg6Var4;
                        if (ugbVar4.g.endsWith(" ")) {
                            String str4 = ugbVar4.g;
                            Matcher matcher = t.matcher(str4);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i2 = 0;
                            if (end > 0) {
                                ugbVar4.g = ir2.n(end, 0, str4);
                            }
                            u14Var = end >= 2 ? new u14((byte) 1) : new u14((byte) 2);
                            tg6Var2 = u14Var;
                        }
                    }
                    i2 = 0;
                    u14Var = new u14((byte) 2);
                    tg6Var2 = u14Var;
                } else if (g != '!') {
                    if (g == '&') {
                        String d2 = d(l);
                        if (d2 != null) {
                            ugbVar2 = new ugb(bg5.a(d2));
                            tg6Var2 = ugbVar2;
                        }
                        tg6Var2 = null;
                    } else if (g != '<') {
                        if (g != '`') {
                            switch (g) {
                                case kk7.b1 /* 91 */:
                                    int i5 = this.f;
                                    this.f = i5 + 1;
                                    ugb ugbVar5 = new ugb("[");
                                    sy0 sy0Var = this.h;
                                    sy0 sy0Var2 = new sy0(ugbVar5, i5, sy0Var, this.g, false);
                                    if (sy0Var != null) {
                                        sy0Var.d = true;
                                    }
                                    this.h = sy0Var2;
                                    tg6Var2 = ugbVar5;
                                    break;
                                case kk7.c1 /* 92 */:
                                    this.f++;
                                    if (g() == '\n') {
                                        ugbVar = new u14((byte) 1);
                                        this.f++;
                                    } else {
                                        if (this.f < this.e.length()) {
                                            String str5 = this.e;
                                            int i6 = this.f;
                                            if (k.matcher(str5.substring(i6, i6 + 1)).matches()) {
                                                String str6 = this.e;
                                                int i7 = this.f;
                                                ugb ugbVar6 = new ugb(str6.substring(i7, i7 + 1));
                                                this.f++;
                                                tg6Var2 = ugbVar6;
                                                break;
                                            }
                                        }
                                        ugbVar = new ugb("\\");
                                    }
                                    tg6Var2 = ugbVar;
                                    break;
                                case kk7.d1 /* 93 */:
                                    int i8 = this.f + 1;
                                    this.f = i8;
                                    sy0 sy0Var3 = this.h;
                                    if (sy0Var3 == null) {
                                        tg6Var3 = new ugb("]");
                                        break;
                                    } else {
                                        ugb ugbVar7 = (ugb) sy0Var3.e;
                                        boolean z2 = sy0Var3.a;
                                        if (!sy0Var3.c) {
                                            this.h = (sy0) sy0Var3.f;
                                            tg6Var3 = new ugb("]");
                                            break;
                                        } else {
                                            if (g() == '(') {
                                                this.f++;
                                                Pattern pattern = q;
                                                d(pattern);
                                                i3 = 1;
                                                int a = sne.a(this.f, this.e);
                                                if (a == -1) {
                                                    str2 = null;
                                                } else {
                                                    char g2 = g();
                                                    String str7 = this.e;
                                                    int i9 = this.f;
                                                    String substring = g2 == '<' ? str7.substring(i9 + 1, a - 1) : str7.substring(i9, a);
                                                    this.f = a;
                                                    str2 = z34.a(substring);
                                                }
                                                if (str2 != null) {
                                                    d(pattern);
                                                    String str8 = this.e;
                                                    int i10 = this.f;
                                                    if (s.matcher(str8.substring(i10 - 1, i10)).matches()) {
                                                        int c = sne.c(this.f, this.e);
                                                        if (c == -1) {
                                                            str3 = null;
                                                        } else {
                                                            String substring2 = this.e.substring(this.f + 1, c - 1);
                                                            this.f = c;
                                                            str3 = z34.a(substring2);
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
                                                            int b2 = sne.b(i12, this.e);
                                                            int i13 = b2 - i12;
                                                            if (b2 != -1 && i13 <= 999 && b2 < this.e.length() && this.e.charAt(b2) == ']') {
                                                                this.f = b2 + 1;
                                                            }
                                                        }
                                                        int i14 = this.f - i11;
                                                        String substring3 = i14 > 2 ? this.e.substring(i11, i14 + i11) : !sy0Var3.d ? this.e.substring(sy0Var3.b, i8) : null;
                                                        if (substring3 != null) {
                                                            Pattern pattern2 = z34.a;
                                                            e46 e46Var = (e46) ((Map) this.d.c).get(z34.c.matcher(substring3.substring(i3, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                            if (e46Var != null) {
                                                                str2 = e46Var.h;
                                                                str3 = e46Var.i;
                                                                z = true;
                                                            }
                                                        }
                                                    }
                                                    if (z) {
                                                        this.f = i8;
                                                        this.h = (sy0) this.h.f;
                                                        ugbVar = new ugb("]");
                                                    } else {
                                                        ugbVar = z2 ? new bk5(str2, str3, (byte) 0) : new bk5(str2, str3, (byte) 1);
                                                        tg6 tg6Var5 = (tg6) ugbVar7.f;
                                                        while (tg6Var5 != null) {
                                                            tg6 tg6Var6 = (tg6) tg6Var5.f;
                                                            ugbVar.b(tg6Var5);
                                                            tg6Var5 = tg6Var6;
                                                        }
                                                        h((ud3) sy0Var3.g);
                                                        tg6 tg6Var7 = (tg6) ugbVar.c;
                                                        tg6 tg6Var8 = (tg6) ugbVar.d;
                                                        if (tg6Var7 != tg6Var8) {
                                                            f(tg6Var7, tg6Var8);
                                                        }
                                                        ugbVar7.g();
                                                        sy0 sy0Var4 = (sy0) this.h.f;
                                                        this.h = sy0Var4;
                                                        if (!z2) {
                                                            while (sy0Var4 != null) {
                                                                if (!sy0Var4.a) {
                                                                    sy0Var4.c = false;
                                                                }
                                                                sy0Var4 = (sy0) sy0Var4.f;
                                                            }
                                                        }
                                                    }
                                                    tg6Var2 = ugbVar;
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
                                            tg6Var2 = ugbVar;
                                        }
                                    }
                                    break;
                                default:
                                    if (this.b.get(g)) {
                                        vd3 vd3Var = (vd3) this.c.get(Character.valueOf(g));
                                        int i15 = this.f;
                                        int i16 = i4;
                                        while (g() == g) {
                                            i16++;
                                            this.f++;
                                        }
                                        if (i16 < vd3Var.c()) {
                                            this.f = i15;
                                            r9 = ugbVar3;
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
                                                int i20 = (i17 == 0 || g != vd3Var.e()) ? i4 : 1;
                                                int i21 = (i18 == 0 || g != vd3Var.b()) ? i4 : 1;
                                                r4 = i20;
                                                r8 = i21;
                                            }
                                            this.f = i15;
                                            r9 = new cz1(i16, r4, r8);
                                        }
                                        if (r9 != 0) {
                                            int i22 = r9.a;
                                            int i23 = i15 + i22;
                                            this.f = i23;
                                            ugb ugbVar8 = new ugb(this.e.substring(i15, i23));
                                            boolean z3 = r9.c;
                                            boolean z4 = r9.b;
                                            ud3 ud3Var = this.g;
                                            ud3 ud3Var2 = new ud3(ugbVar8, g, z3, z4, ud3Var);
                                            this.g = ud3Var2;
                                            ud3Var2.g = i22;
                                            ud3Var2.h = i22;
                                            if (ud3Var != null) {
                                                ud3Var.f = ud3Var2;
                                            }
                                            tg6Var2 = ugbVar8;
                                            i2 = i4;
                                            break;
                                        }
                                        tg6Var2 = ugbVar3;
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
                                            tg6Var2 = new ugb(this.e.substring(i24, i26));
                                            i2 = i4;
                                        }
                                        tg6Var2 = ugbVar3;
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
                                        ugbVar2 = new ugb(d3);
                                        tg6Var2 = ugbVar2;
                                    }
                                } while (!d.equals(d3));
                                cj2 cj2Var = new cj2((byte) 0);
                                String replace = this.e.substring(i27, this.f - d3.length()).replace('\n', ' ');
                                if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                                    int length2 = replace.length();
                                    if (lqe.b(' ', replace, 0, length2) != length2) {
                                        replace = ir2.n(1, 1, replace);
                                    }
                                }
                                cj2Var.h = replace;
                                tg6Var3 = cj2Var;
                            }
                            tg6Var2 = null;
                        }
                        tg6Var2 = tg6Var3;
                    } else {
                        String d4 = d(o);
                        if (d4 != null) {
                            b = 1;
                            String n2 = ir2.n(1, 1, d4);
                            bk5Var = new bk5("mailto:".concat(n2), null, (byte) 1);
                            bk5Var.b(new ugb(n2));
                        } else {
                            b = 1;
                            String d5 = d(p);
                            if (d5 != null) {
                                String n3 = ir2.n(1, 1, d5);
                                bk5Var = new bk5(n3, null, (byte) 1);
                                bk5Var.b(new ugb(n3));
                            } else {
                                tg6Var2 = null;
                                if (tg6Var2 == null) {
                                    String d6 = d(j);
                                    if (d6 != null) {
                                        ?? cj2Var2 = new cj2(b);
                                        cj2Var2.h = d6;
                                        ugbVar2 = cj2Var2;
                                        tg6Var2 = ugbVar2;
                                    }
                                    tg6Var2 = null;
                                }
                            }
                        }
                        tg6Var2 = bk5Var;
                        if (tg6Var2 == null) {
                        }
                    }
                    i2 = 0;
                } else {
                    int i28 = this.f + 1;
                    this.f = i28;
                    if (g() == '[') {
                        this.f++;
                        ugb ugbVar9 = new ugb("![");
                        sy0 sy0Var5 = this.h;
                        sy0 sy0Var6 = new sy0(ugbVar9, i28, sy0Var5, this.g, true);
                        if (sy0Var5 != null) {
                            sy0Var5.d = true;
                        }
                        this.h = sy0Var6;
                        tg6Var2 = ugbVar9;
                        i2 = 0;
                    } else {
                        ugbVar = new ugb("!");
                        tg6Var2 = ugbVar;
                        i2 = 0;
                    }
                }
                if (tg6Var2 != null) {
                    tg6Var4 = tg6Var2;
                    if (tg6Var4 != null) {
                        h(null);
                        tg6 tg6Var9 = (tg6) tg6Var.c;
                        tg6 tg6Var10 = (tg6) tg6Var.d;
                        if (tg6Var9 == tg6Var10) {
                            return;
                        }
                        f(tg6Var9, tg6Var10);
                        return;
                    }
                    tg6Var.b(tg6Var4);
                    i4 = i2;
                    ugbVar3 = null;
                } else {
                    this.f++;
                    ugbVar3 = new ugb(String.valueOf(g));
                }
            }
            tg6Var4 = ugbVar3;
            if (tg6Var4 != null) {
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

    public final void h(ud3 ud3Var) {
        boolean z;
        tg6 tg6Var;
        HashMap hashMap = new HashMap();
        ud3 ud3Var2 = this.g;
        while (ud3Var2 != null) {
            ud3 ud3Var3 = ud3Var2.e;
            if (ud3Var3 == ud3Var) {
                break;
            } else {
                ud3Var2 = ud3Var3;
            }
        }
        while (ud3Var2 != null) {
            ugb ugbVar = ud3Var2.a;
            char c = ud3Var2.b;
            vd3 vd3Var = (vd3) this.c.get(Character.valueOf(c));
            if (!ud3Var2.d || vd3Var == null) {
                ud3Var2 = ud3Var2.f;
            } else {
                char e = vd3Var.e();
                ud3 ud3Var4 = ud3Var2;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    ud3Var4 = ud3Var4.e;
                    if (ud3Var4 == null || ud3Var4 == ud3Var || ud3Var4 == hashMap.get(Character.valueOf(c))) {
                        break;
                    }
                    if (ud3Var4.c && ud3Var4.b == e) {
                        i2 = vd3Var.d(ud3Var4, ud3Var2);
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
                    ugb ugbVar2 = ud3Var4.a;
                    ud3Var4.g -= i2;
                    ud3Var2.g -= i2;
                    ugbVar2.g = ir2.n(i2, 0, ugbVar2.g);
                    ugbVar.g = ir2.n(i2, 0, ugbVar.g);
                    ud3 ud3Var5 = ud3Var2.e;
                    while (ud3Var5 != null && ud3Var5 != ud3Var4) {
                        ud3 ud3Var6 = ud3Var5.e;
                        i(ud3Var5);
                        ud3Var5 = ud3Var6;
                    }
                    if (ugbVar2 != ugbVar && (tg6Var = (tg6) ugbVar2.f) != ugbVar) {
                        f(tg6Var, (tg6) ugbVar.e);
                    }
                    vd3Var.a(ugbVar2, ugbVar, i2);
                    if (ud3Var4.g == 0) {
                        ud3Var4.a.g();
                        i(ud3Var4);
                    }
                    if (ud3Var2.g == 0) {
                        ud3 ud3Var7 = ud3Var2.f;
                        ugbVar.g();
                        i(ud3Var2);
                        ud3Var2 = ud3Var7;
                    }
                } else {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), ud3Var2.e);
                        if (!ud3Var2.c) {
                            i(ud3Var2);
                        }
                    }
                    ud3Var2 = ud3Var2.f;
                }
            }
        }
        while (true) {
            ud3 ud3Var8 = this.g;
            if (ud3Var8 == null || ud3Var8 == ud3Var) {
                return;
            } else {
                i(ud3Var8);
            }
        }
    }

    public final void i(ud3 ud3Var) {
        ud3 ud3Var2 = ud3Var.e;
        if (ud3Var2 != null) {
            ud3Var2.f = ud3Var.f;
        }
        ud3 ud3Var3 = ud3Var.f;
        if (ud3Var3 == null) {
            this.g = ud3Var2;
        } else {
            ud3Var3.e = ud3Var2;
        }
    }
}
