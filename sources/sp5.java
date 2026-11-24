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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sp5 implements qp5 {
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
    public final wm4 d;
    public String e;
    public int f;
    public gf3 g;
    public zz0 h;

    public sp5(wm4 wm4Var) {
        ArrayList arrayList = (ArrayList) wm4Var.b;
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new my((byte) 0), new my((byte) 1)), hashMap);
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
        this.d = wm4Var;
    }

    public static void b(char c, hf3 hf3Var, HashMap hashMap) {
        if (((hf3) hashMap.put(Character.valueOf(c), hf3Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void c(List list, HashMap hashMap) {
        roa roaVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hf3 hf3Var = (hf3) it.next();
            char e = hf3Var.e();
            char b = hf3Var.b();
            if (e == b) {
                hf3 hf3Var2 = (hf3) hashMap.get(Character.valueOf(e));
                if (hf3Var2 == null || hf3Var2.e() != hf3Var2.b()) {
                    b(e, hf3Var, hashMap);
                } else {
                    if (hf3Var2 instanceof roa) {
                        roaVar = (roa) hf3Var2;
                    } else {
                        roa roaVar2 = new roa(e);
                        roaVar2.f(hf3Var2);
                        roaVar = roaVar2;
                    }
                    roaVar.f(hf3Var);
                    hashMap.put(Character.valueOf(e), roaVar);
                }
            } else {
                b(e, hf3Var, hashMap);
                b(b, hf3Var, hashMap);
            }
        }
    }

    public static void e(vib vibVar, vib vibVar2, int i2) {
        if (vibVar == null || vibVar2 == null || vibVar == vibVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(vibVar.g);
        ui6 ui6Var = (ui6) vibVar.f;
        ui6 ui6Var2 = (ui6) vibVar2.f;
        while (ui6Var != ui6Var2) {
            sb.append(((vib) ui6Var).g);
            ui6 ui6Var3 = (ui6) ui6Var.f;
            ui6Var.g();
            ui6Var = ui6Var3;
        }
        vibVar.g = sb.toString();
    }

    public static void f(ui6 ui6Var, ui6 ui6Var2) {
        vib vibVar = null;
        vib vibVar2 = null;
        int i2 = 0;
        while (ui6Var != null) {
            if (ui6Var instanceof vib) {
                vibVar2 = (vib) ui6Var;
                if (vibVar == null) {
                    vibVar = vibVar2;
                }
                i2 = vibVar2.g.length() + i2;
            } else {
                e(vibVar, vibVar2, i2);
                vibVar = null;
                vibVar2 = null;
                i2 = 0;
            }
            if (ui6Var == ui6Var2) {
                break;
            } else {
                ui6Var = (ui6) ui6Var.f;
            }
        }
        e(vibVar, vibVar2, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0505 A[LOOP:0: B:2:0x0013->B:7:0x0505, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x050c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v19, types: [vib] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v46, types: [vib] */
    /* JADX WARN: Type inference failed for: r2v55, types: [f34] */
    /* JADX WARN: Type inference failed for: r2v60, types: [vib] */
    /* JADX WARN: Type inference failed for: r2v61, types: [bm5, ui6] */
    /* JADX WARN: Type inference failed for: r2v87, types: [bm5] */
    /* JADX WARN: Type inference failed for: r2v88, types: [bm5] */
    /* JADX WARN: Type inference failed for: r3v18, types: [qk2] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r9v29, types: [p02] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    @Override // qp5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, ui6 ui6Var) {
        int i2;
        f34 f34Var;
        ui6 ui6Var2;
        ?? vibVar;
        vib vibVar2;
        byte b;
        bm5 bm5Var;
        String d;
        ui6 ui6Var3;
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
        vib vibVar3 = null;
        this.g = null;
        this.h = null;
        ui6 ui6Var4 = null;
        while (true) {
            char g = g();
            if (g == 0) {
                i2 = i4;
            } else {
                if (g == '\n') {
                    this.f++;
                    if (ui6Var4 instanceof vib) {
                        vib vibVar4 = (vib) ui6Var4;
                        if (vibVar4.g.endsWith(" ")) {
                            String str4 = vibVar4.g;
                            Matcher matcher = t.matcher(str4);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i2 = 0;
                            if (end > 0) {
                                vibVar4.g = ts2.m(end, 0, str4);
                            }
                            f34Var = end >= 2 ? new f34((byte) 1) : new f34((byte) 2);
                            ui6Var2 = f34Var;
                        }
                    }
                    i2 = 0;
                    f34Var = new f34((byte) 2);
                    ui6Var2 = f34Var;
                } else if (g != '!') {
                    if (g == '&') {
                        String d2 = d(l);
                        if (d2 != null) {
                            vibVar2 = new vib(ai5.a(d2));
                            ui6Var2 = vibVar2;
                        }
                        ui6Var2 = null;
                    } else if (g != '<') {
                        if (g != '`') {
                            switch (g) {
                                case nm7.b1 /* 91 */:
                                    int i5 = this.f;
                                    this.f = i5 + 1;
                                    vib vibVar5 = new vib("[");
                                    zz0 zz0Var = this.h;
                                    zz0 zz0Var2 = new zz0(vibVar5, i5, zz0Var, this.g, false);
                                    if (zz0Var != null) {
                                        zz0Var.d = true;
                                    }
                                    this.h = zz0Var2;
                                    ui6Var2 = vibVar5;
                                    break;
                                case nm7.c1 /* 92 */:
                                    this.f++;
                                    if (g() == '\n') {
                                        vibVar = new f34((byte) 1);
                                        this.f++;
                                    } else {
                                        if (this.f < this.e.length()) {
                                            String str5 = this.e;
                                            int i6 = this.f;
                                            if (k.matcher(str5.substring(i6, i6 + 1)).matches()) {
                                                String str6 = this.e;
                                                int i7 = this.f;
                                                vib vibVar6 = new vib(str6.substring(i7, i7 + 1));
                                                this.f++;
                                                ui6Var2 = vibVar6;
                                                break;
                                            }
                                        }
                                        vibVar = new vib("\\");
                                    }
                                    ui6Var2 = vibVar;
                                    break;
                                case nm7.d1 /* 93 */:
                                    int i8 = this.f + 1;
                                    this.f = i8;
                                    zz0 zz0Var3 = this.h;
                                    if (zz0Var3 == null) {
                                        ui6Var3 = new vib("]");
                                        break;
                                    } else {
                                        vib vibVar7 = (vib) zz0Var3.e;
                                        boolean z2 = zz0Var3.a;
                                        if (!zz0Var3.c) {
                                            this.h = (zz0) zz0Var3.f;
                                            ui6Var3 = new vib("]");
                                            break;
                                        } else {
                                            if (g() == '(') {
                                                this.f++;
                                                Pattern pattern = q;
                                                d(pattern);
                                                i3 = 1;
                                                int a = vpe.a(this.f, this.e);
                                                if (a == -1) {
                                                    str2 = null;
                                                } else {
                                                    char g2 = g();
                                                    String str7 = this.e;
                                                    int i9 = this.f;
                                                    String substring = g2 == '<' ? str7.substring(i9 + 1, a - 1) : str7.substring(i9, a);
                                                    this.f = a;
                                                    str2 = j54.a(substring);
                                                }
                                                if (str2 != null) {
                                                    d(pattern);
                                                    String str8 = this.e;
                                                    int i10 = this.f;
                                                    if (s.matcher(str8.substring(i10 - 1, i10)).matches()) {
                                                        int c = vpe.c(this.f, this.e);
                                                        if (c == -1) {
                                                            str3 = null;
                                                        } else {
                                                            String substring2 = this.e.substring(this.f + 1, c - 1);
                                                            this.f = c;
                                                            str3 = j54.a(substring2);
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
                                                            int b2 = vpe.b(i12, this.e);
                                                            int i13 = b2 - i12;
                                                            if (b2 != -1 && i13 <= 999 && b2 < this.e.length() && this.e.charAt(b2) == ']') {
                                                                this.f = b2 + 1;
                                                            }
                                                        }
                                                        int i14 = this.f - i11;
                                                        String substring3 = i14 > 2 ? this.e.substring(i11, i14 + i11) : !zz0Var3.d ? this.e.substring(zz0Var3.b, i8) : null;
                                                        if (substring3 != null) {
                                                            Pattern pattern2 = j54.a;
                                                            e66 e66Var = (e66) ((Map) this.d.c).get(j54.c.matcher(substring3.substring(i3, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                            if (e66Var != null) {
                                                                str2 = e66Var.h;
                                                                str3 = e66Var.i;
                                                                z = true;
                                                            }
                                                        }
                                                    }
                                                    if (z) {
                                                        this.f = i8;
                                                        this.h = (zz0) this.h.f;
                                                        vibVar = new vib("]");
                                                    } else {
                                                        vibVar = z2 ? new bm5(str2, str3, (byte) 0) : new bm5(str2, str3, (byte) 1);
                                                        ui6 ui6Var5 = (ui6) vibVar7.f;
                                                        while (ui6Var5 != null) {
                                                            ui6 ui6Var6 = (ui6) ui6Var5.f;
                                                            vibVar.b(ui6Var5);
                                                            ui6Var5 = ui6Var6;
                                                        }
                                                        h((gf3) zz0Var3.g);
                                                        ui6 ui6Var7 = (ui6) vibVar.c;
                                                        ui6 ui6Var8 = (ui6) vibVar.d;
                                                        if (ui6Var7 != ui6Var8) {
                                                            f(ui6Var7, ui6Var8);
                                                        }
                                                        vibVar7.g();
                                                        zz0 zz0Var4 = (zz0) this.h.f;
                                                        this.h = zz0Var4;
                                                        if (!z2) {
                                                            while (zz0Var4 != null) {
                                                                if (!zz0Var4.a) {
                                                                    zz0Var4.c = false;
                                                                }
                                                                zz0Var4 = (zz0) zz0Var4.f;
                                                            }
                                                        }
                                                    }
                                                    ui6Var2 = vibVar;
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
                                            ui6Var2 = vibVar;
                                        }
                                    }
                                    break;
                                default:
                                    if (this.b.get(g)) {
                                        hf3 hf3Var = (hf3) this.c.get(Character.valueOf(g));
                                        int i15 = this.f;
                                        int i16 = i4;
                                        while (g() == g) {
                                            i16++;
                                            this.f++;
                                        }
                                        if (i16 < hf3Var.c()) {
                                            this.f = i15;
                                            r9 = vibVar3;
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
                                                int i20 = (i17 == 0 || g != hf3Var.e()) ? i4 : 1;
                                                int i21 = (i18 == 0 || g != hf3Var.b()) ? i4 : 1;
                                                r4 = i20;
                                                r8 = i21;
                                            }
                                            this.f = i15;
                                            r9 = new p02(i16, r4, r8);
                                        }
                                        if (r9 != 0) {
                                            int i22 = r9.a;
                                            int i23 = i15 + i22;
                                            this.f = i23;
                                            vib vibVar8 = new vib(this.e.substring(i15, i23));
                                            boolean z3 = r9.c;
                                            boolean z4 = r9.b;
                                            gf3 gf3Var = this.g;
                                            gf3 gf3Var2 = new gf3(vibVar8, g, z3, z4, gf3Var);
                                            this.g = gf3Var2;
                                            gf3Var2.g = i22;
                                            gf3Var2.h = i22;
                                            if (gf3Var != null) {
                                                gf3Var.f = gf3Var2;
                                            }
                                            ui6Var2 = vibVar8;
                                            i2 = i4;
                                            break;
                                        }
                                        ui6Var2 = vibVar3;
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
                                            ui6Var2 = new vib(this.e.substring(i24, i26));
                                            i2 = i4;
                                        }
                                        ui6Var2 = vibVar3;
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
                                        vibVar2 = new vib(d3);
                                        ui6Var2 = vibVar2;
                                    }
                                } while (!d.equals(d3));
                                qk2 qk2Var = new qk2((byte) 0);
                                String replace = this.e.substring(i27, this.f - d3.length()).replace('\n', ' ');
                                if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                                    int length2 = replace.length();
                                    if (ose.b(' ', replace, 0, length2) != length2) {
                                        replace = ts2.m(1, 1, replace);
                                    }
                                }
                                qk2Var.h = replace;
                                ui6Var3 = qk2Var;
                            }
                            ui6Var2 = null;
                        }
                        ui6Var2 = ui6Var3;
                    } else {
                        String d4 = d(o);
                        if (d4 != null) {
                            b = 1;
                            String m2 = ts2.m(1, 1, d4);
                            bm5Var = new bm5("mailto:".concat(m2), null, (byte) 1);
                            bm5Var.b(new vib(m2));
                        } else {
                            b = 1;
                            String d5 = d(p);
                            if (d5 != null) {
                                String m3 = ts2.m(1, 1, d5);
                                bm5Var = new bm5(m3, null, (byte) 1);
                                bm5Var.b(new vib(m3));
                            } else {
                                ui6Var2 = null;
                                if (ui6Var2 == null) {
                                    String d6 = d(j);
                                    if (d6 != null) {
                                        ?? qk2Var2 = new qk2(b);
                                        qk2Var2.h = d6;
                                        vibVar2 = qk2Var2;
                                        ui6Var2 = vibVar2;
                                    }
                                    ui6Var2 = null;
                                }
                            }
                        }
                        ui6Var2 = bm5Var;
                        if (ui6Var2 == null) {
                        }
                    }
                    i2 = 0;
                } else {
                    int i28 = this.f + 1;
                    this.f = i28;
                    if (g() == '[') {
                        this.f++;
                        vib vibVar9 = new vib("![");
                        zz0 zz0Var5 = this.h;
                        zz0 zz0Var6 = new zz0(vibVar9, i28, zz0Var5, this.g, true);
                        if (zz0Var5 != null) {
                            zz0Var5.d = true;
                        }
                        this.h = zz0Var6;
                        ui6Var2 = vibVar9;
                        i2 = 0;
                    } else {
                        vibVar = new vib("!");
                        ui6Var2 = vibVar;
                        i2 = 0;
                    }
                }
                if (ui6Var2 != null) {
                    ui6Var4 = ui6Var2;
                    if (ui6Var4 != null) {
                        h(null);
                        ui6 ui6Var9 = (ui6) ui6Var.c;
                        ui6 ui6Var10 = (ui6) ui6Var.d;
                        if (ui6Var9 == ui6Var10) {
                            return;
                        }
                        f(ui6Var9, ui6Var10);
                        return;
                    }
                    ui6Var.b(ui6Var4);
                    i4 = i2;
                    vibVar3 = null;
                } else {
                    this.f++;
                    vibVar3 = new vib(String.valueOf(g));
                }
            }
            ui6Var4 = vibVar3;
            if (ui6Var4 != null) {
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

    public final void h(gf3 gf3Var) {
        boolean z;
        ui6 ui6Var;
        HashMap hashMap = new HashMap();
        gf3 gf3Var2 = this.g;
        while (gf3Var2 != null) {
            gf3 gf3Var3 = gf3Var2.e;
            if (gf3Var3 == gf3Var) {
                break;
            } else {
                gf3Var2 = gf3Var3;
            }
        }
        while (gf3Var2 != null) {
            vib vibVar = gf3Var2.a;
            char c = gf3Var2.b;
            hf3 hf3Var = (hf3) this.c.get(Character.valueOf(c));
            if (!gf3Var2.d || hf3Var == null) {
                gf3Var2 = gf3Var2.f;
            } else {
                char e = hf3Var.e();
                gf3 gf3Var4 = gf3Var2;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    gf3Var4 = gf3Var4.e;
                    if (gf3Var4 == null || gf3Var4 == gf3Var || gf3Var4 == hashMap.get(Character.valueOf(c))) {
                        break;
                    }
                    if (gf3Var4.c && gf3Var4.b == e) {
                        i2 = hf3Var.d(gf3Var4, gf3Var2);
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
                    vib vibVar2 = gf3Var4.a;
                    gf3Var4.g -= i2;
                    gf3Var2.g -= i2;
                    vibVar2.g = ts2.m(i2, 0, vibVar2.g);
                    vibVar.g = ts2.m(i2, 0, vibVar.g);
                    gf3 gf3Var5 = gf3Var2.e;
                    while (gf3Var5 != null && gf3Var5 != gf3Var4) {
                        gf3 gf3Var6 = gf3Var5.e;
                        i(gf3Var5);
                        gf3Var5 = gf3Var6;
                    }
                    if (vibVar2 != vibVar && (ui6Var = (ui6) vibVar2.f) != vibVar) {
                        f(ui6Var, (ui6) vibVar.e);
                    }
                    hf3Var.a(vibVar2, vibVar, i2);
                    if (gf3Var4.g == 0) {
                        gf3Var4.a.g();
                        i(gf3Var4);
                    }
                    if (gf3Var2.g == 0) {
                        gf3 gf3Var7 = gf3Var2.f;
                        vibVar.g();
                        i(gf3Var2);
                        gf3Var2 = gf3Var7;
                    }
                } else {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), gf3Var2.e);
                        if (!gf3Var2.c) {
                            i(gf3Var2);
                        }
                    }
                    gf3Var2 = gf3Var2.f;
                }
            }
        }
        while (true) {
            gf3 gf3Var8 = this.g;
            if (gf3Var8 == null || gf3Var8 == gf3Var) {
                return;
            } else {
                i(gf3Var8);
            }
        }
    }

    public final void i(gf3 gf3Var) {
        gf3 gf3Var2 = gf3Var.e;
        if (gf3Var2 != null) {
            gf3Var2.f = gf3Var.f;
        }
        gf3 gf3Var3 = gf3Var.f;
        if (gf3Var3 == null) {
            this.g = gf3Var2;
        } else {
            gf3Var3.e = gf3Var2;
        }
    }
}
