// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vo3 {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(ik0.class, nd5.class, s84.class, cg5.class, jjb.class, y46.class, hn5.class));
    public static final Map q;
    public String a;
    public boolean d;
    public boolean h;
    public final ArrayList i;
    public final rn5 j;
    public final ArrayList k;
    public final so3 l;
    public final ArrayList n;
    public final LinkedHashSet o;
    public int b = 0;
    public int c = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public final LinkedHashMap m = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ik0.class, new jk0((byte) 0));
        hashMap.put(nd5.class, new jk0((byte) 2));
        hashMap.put(s84.class, new jk0((byte) 1));
        hashMap.put(cg5.class, new jk0((byte) 3));
        hashMap.put(jjb.class, new jk0((byte) 8));
        hashMap.put(y46.class, new jk0((byte) 6));
        hashMap.put(hn5.class, new jk0((byte) 4));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public vo3(ArrayList arrayList, rn5 rn5Var, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = rn5Var;
        this.k = arrayList2;
        so3 so3Var = new so3((byte) 0);
        this.l = so3Var;
        arrayList3.add(so3Var);
        linkedHashSet.add(so3Var);
    }

    public final void a(x1 x1Var) {
        while (!h().b(x1Var.e())) {
            e(h());
        }
        h().e().b(x1Var.e());
        this.n.add(x1Var);
        this.o.add(x1Var);
    }

    public final void b(uu7 uu7Var) {
        f46 f46Var = uu7Var.b;
        f46Var.a();
        ArrayList arrayList = f46Var.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e46 e46Var = (e46) obj;
            tu7 tu7Var = uu7Var.a;
            e46Var.g();
            tg6 tg6Var = (tg6) tu7Var.e;
            e46Var.e = tg6Var;
            if (tg6Var != null) {
                tg6Var.f = e46Var;
            }
            e46Var.f = tu7Var;
            tu7Var.e = e46Var;
            tg6 tg6Var2 = (tg6) tu7Var.b;
            e46Var.b = tg6Var2;
            if (((tg6) e46Var.e) == null) {
                tg6Var2.c = e46Var;
            }
            String str = e46Var.g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, e46Var);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            int i = this.b + 1;
            String str = this.a;
            CharSequence subSequence2 = str.subSequence(i, str.length());
            int i2 = 4 - (this.c % 4);
            StringBuilder sb = new StringBuilder(subSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            String str2 = this.a;
            subSequence = str2.subSequence(this.b, str2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        char charAt = this.a.charAt(this.b);
        int i = this.b + 1;
        if (charAt != '\t') {
            this.b = i;
            this.c++;
        } else {
            this.b = i;
            int i2 = this.c;
            this.c = (4 - (i2 % 4)) + i2;
        }
    }

    public final void e(x1 x1Var) {
        if (h() == x1Var) {
            tb4.v(1, this.n);
        }
        if (x1Var instanceof uu7) {
            b((uu7) x1Var);
        }
        x1Var.d();
    }

    public final void f(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e((x1) arrayList.get(size));
        }
    }

    public final void g() {
        int i = this.b;
        int i2 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.a.charAt(i);
            if (charAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (charAt != ' ') {
                this.h = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.e = i;
        this.f = i2;
        this.g = i2 - this.c;
    }

    public final x1 h() {
        return (x1) b00.f(1, this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x0225, code lost:
    
        if (r8 == 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x070a, code lost:
    
        r23 = r6;
        r24 = r7;
        k(r25.e);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:229:0x02a1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0635  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        x1 x1Var;
        boolean z;
        int i;
        mk0 mk0Var;
        int i2;
        char charAt;
        int i3;
        t84 t84Var;
        mk0 mk0Var2;
        char c;
        od5 od5Var;
        int i4;
        StringBuilder I;
        int i5;
        int i6;
        int i7;
        int i8;
        z46 z46Var;
        char charAt2;
        z46 z46Var2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        int i12;
        int i13;
        String str2 = str;
        int length = str2.length();
        int i14 = 0;
        StringBuilder sb = null;
        for (int i15 = 0; i15 < length; i15++) {
            char charAt5 = str2.charAt(i15);
            if (charAt5 == 0) {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append((CharSequence) str2, 0, i15);
                }
                sb.append((char) 65533);
            } else if (sb != null) {
                sb.append(charAt5);
            }
        }
        if (sb != null) {
            str2 = sb.toString();
        }
        this.a = str2;
        this.b = 0;
        this.c = 0;
        this.d = false;
        ArrayList arrayList = this.n;
        int i16 = 1;
        for (x1 x1Var2 : arrayList.subList(1, arrayList.size())) {
            g();
            vj2 h = x1Var2.h(this);
            if (h == null) {
                break;
            }
            if (h.c) {
                e(x1Var2);
                return;
            }
            int i17 = h.a;
            if (i17 != -1) {
                k(i17);
            } else {
                int i18 = h.b;
                if (i18 != -1) {
                    j(i18);
                }
            }
            i16++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i16, arrayList.size()));
        x1 x1Var3 = (x1) arrayList.get(i16 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z2 = (x1Var3.e() instanceof tu7) || x1Var3.f();
        while (true) {
            if (z2) {
                g();
                if (!this.h) {
                    int i19 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        qx4 qx4Var = new qx4(x1Var3);
                        ArrayList arrayList3 = this.i;
                        int size = arrayList3.size();
                        int i20 = i14;
                        while (true) {
                            if (i20 < size) {
                                Object obj = arrayList3.get(i20);
                                i20++;
                                byte b = ((jk0) obj).a;
                                i = i14;
                                char c2 = '\t';
                                char c3 = ' ';
                                Object obj2 = qx4Var.a;
                                switch (b) {
                                    case 0:
                                        x1Var = x1Var3;
                                        z = isEmpty;
                                        int i21 = this.e;
                                        String str3 = this.a;
                                        i2 = 4;
                                        if (this.g < 4 && i21 < str3.length() && str3.charAt(i21) == '>') {
                                            int i22 = this.c + this.g;
                                            int i23 = i22 + 1;
                                            String str4 = this.a;
                                            int i24 = i21 + 1;
                                            if (i24 < str4.length() && ((charAt = str4.charAt(i24)) == '\t' || charAt == ' ')) {
                                                i23 = i22 + 2;
                                            }
                                            x1[] x1VarArr = new x1[1];
                                            x1VarArr[i] = new kk0();
                                            mk0Var = new mk0(x1VarArr);
                                            mk0Var.c = i23;
                                            break;
                                        }
                                        mk0Var = null;
                                        break;
                                    case 1:
                                        x1Var = x1Var3;
                                        z = isEmpty;
                                        int i25 = this.g;
                                        if (i25 < 4) {
                                            int i26 = this.e;
                                            String str5 = this.a;
                                            int length2 = str5.length();
                                            int i27 = i26;
                                            int i28 = i;
                                            int i29 = i28;
                                            while (true) {
                                                i3 = i26;
                                                if (i27 < length2) {
                                                    char charAt6 = str5.charAt(i27);
                                                    if (charAt6 == '`') {
                                                        i28++;
                                                    } else if (charAt6 == '~') {
                                                        i29++;
                                                    }
                                                    i27++;
                                                    i26 = i3;
                                                }
                                            }
                                            int i30 = 3;
                                            if (i28 >= 3) {
                                                if (i29 == 0) {
                                                    int i31 = i3 + i28;
                                                    int length3 = str5.length();
                                                    while (true) {
                                                        if (i31 < length3) {
                                                            c = '`';
                                                            if (str5.charAt(i31) != '`') {
                                                                i31++;
                                                            }
                                                        } else {
                                                            c = '`';
                                                            i31 = -1;
                                                        }
                                                    }
                                                    if (i31 == -1) {
                                                        t84Var = new t84(c, i28, i25);
                                                        if (t84Var != null) {
                                                            x1[] x1VarArr2 = new x1[1];
                                                            x1VarArr2[i] = t84Var;
                                                            mk0Var2 = new mk0(x1VarArr2);
                                                            mk0Var2.b = i3 + t84Var.a.h;
                                                            mk0Var = mk0Var2;
                                                            i2 = 4;
                                                            break;
                                                        }
                                                    }
                                                    t84Var = null;
                                                    if (t84Var != null) {
                                                    }
                                                } else {
                                                    i30 = 3;
                                                }
                                            }
                                            if (i29 >= i30 && i28 == 0) {
                                                t84Var = new t84('~', i29, i25);
                                                if (t84Var != null) {
                                                }
                                            }
                                            t84Var = null;
                                            if (t84Var != null) {
                                            }
                                        }
                                        mk0Var = null;
                                        i2 = 4;
                                    case 2:
                                        x1Var = x1Var3;
                                        z = isEmpty;
                                        if (this.g < 4) {
                                            String str6 = this.a;
                                            int i32 = this.e;
                                            int b2 = lqe.b('#', str6, i32, str6.length()) - i32;
                                            if (b2 != 0 && b2 <= 6) {
                                                int i33 = i32 + b2;
                                                if (i33 >= str6.length()) {
                                                    od5Var = new od5(b2, "");
                                                } else {
                                                    char charAt7 = str6.charAt(i33);
                                                    char c4 = ' ';
                                                    char c5 = '\t';
                                                    if (charAt7 == ' ' || charAt7 == '\t') {
                                                        int length4 = str6.length() - 1;
                                                        while (true) {
                                                            if (length4 < i33) {
                                                                length4 = i33 - 1;
                                                            } else {
                                                                char charAt8 = str6.charAt(length4);
                                                                if (charAt8 == c5 || charAt8 == c4) {
                                                                    length4--;
                                                                    c5 = '\t';
                                                                    c4 = ' ';
                                                                }
                                                            }
                                                        }
                                                        int i34 = length4;
                                                        while (true) {
                                                            if (i34 < i33) {
                                                                i34 = i33 - 1;
                                                            } else if (str6.charAt(i34) == '#') {
                                                                i34--;
                                                            }
                                                        }
                                                        int i35 = i34;
                                                        while (true) {
                                                            if (i35 >= i33) {
                                                                char charAt9 = str6.charAt(i35);
                                                                int i36 = i35;
                                                                if (charAt9 == '\t' || charAt9 == ' ') {
                                                                    i35 = i36 - 1;
                                                                } else {
                                                                    i5 = i36;
                                                                }
                                                            } else {
                                                                i5 = i33 - 1;
                                                            }
                                                        }
                                                        od5Var = i5 != i34 ? new od5(b2, str6.subSequence(i33, i5 + 1).toString()) : new od5(b2, str6.subSequence(i33, length4 + 1).toString());
                                                    }
                                                }
                                                if (od5Var == null) {
                                                    x1[] x1VarArr3 = new x1[1];
                                                    x1VarArr3[i] = od5Var;
                                                    mk0Var2 = new mk0(x1VarArr3);
                                                    mk0Var2.b = str6.length();
                                                } else {
                                                    char charAt10 = str6.charAt(i32);
                                                    if (charAt10 != '-') {
                                                        if (charAt10 == '=') {
                                                            if (lqe.c(lqe.b('=', str6, i32 + 1, str6.length()), str6.length(), str6) >= str6.length()) {
                                                                i4 = 1;
                                                                if (i4 > 0 && (I = qx4Var.I()) != null) {
                                                                    x1[] x1VarArr4 = new x1[1];
                                                                    x1VarArr4[i] = new od5(i4, I.toString());
                                                                    mk0Var2 = new mk0(x1VarArr4);
                                                                    mk0Var2.b = str6.length();
                                                                    mk0Var2.a = true;
                                                                }
                                                            }
                                                        }
                                                        i4 = i;
                                                        if (i4 > 0) {
                                                            x1[] x1VarArr42 = new x1[1];
                                                            x1VarArr42[i] = new od5(i4, I.toString());
                                                            mk0Var2 = new mk0(x1VarArr42);
                                                            mk0Var2.b = str6.length();
                                                            mk0Var2.a = true;
                                                        }
                                                    }
                                                    if (lqe.c(lqe.b('-', str6, i32 + 1, str6.length()), str6.length(), str6) >= str6.length()) {
                                                        i4 = 2;
                                                        if (i4 > 0) {
                                                        }
                                                    }
                                                    i4 = i;
                                                    if (i4 > 0) {
                                                    }
                                                }
                                                mk0Var = mk0Var2;
                                                i2 = 4;
                                                break;
                                            }
                                            od5Var = null;
                                            if (od5Var == null) {
                                            }
                                            mk0Var = mk0Var2;
                                            i2 = 4;
                                        }
                                        mk0Var = null;
                                        i2 = 4;
                                        break;
                                    case 3:
                                        x1Var = x1Var3;
                                        z = isEmpty;
                                        int i37 = i19;
                                        int i38 = this.e;
                                        String str7 = this.a;
                                        if (this.g < i37 && str7.charAt(i38) == '<') {
                                            for (int i39 = 1; i39 <= 7; i39++) {
                                                if (i39 != 7 || !(((x1) obj2).e() instanceof tu7)) {
                                                    Pattern[] patternArr = dg5.e[i39];
                                                    Pattern pattern = patternArr[i];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(str7.subSequence(i38, str7.length())).find()) {
                                                        x1[] x1VarArr5 = new x1[1];
                                                        x1VarArr5[i] = new dg5(pattern2);
                                                        mk0Var = new mk0(x1VarArr5);
                                                        mk0Var.b = this.b;
                                                        i2 = 4;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        mk0Var = null;
                                        i2 = 4;
                                        break;
                                    case 4:
                                        x1Var = x1Var3;
                                        z = isEmpty;
                                        if (this.g < 4) {
                                            i2 = 4;
                                        } else if (!this.h && !(h().e() instanceof tu7)) {
                                            x1[] x1VarArr6 = new x1[1];
                                            x1VarArr6[i] = new od5();
                                            mk0Var = new mk0(x1VarArr6);
                                            i2 = 4;
                                            mk0Var.c = this.c + 4;
                                            break;
                                        } else {
                                            i2 = 4;
                                        }
                                        mk0Var = null;
                                        break;
                                    case 5:
                                        x1Var = x1Var3;
                                        z = isEmpty;
                                        if (this.g < 4) {
                                            int i40 = this.e;
                                            String str8 = this.a;
                                            int length5 = str8.length();
                                            int i41 = i40;
                                            while (true) {
                                                if (i41 >= length5) {
                                                    i6 = length5 - i40;
                                                } else if ('$' != str8.charAt(i41)) {
                                                    i6 = i41 - i40;
                                                } else {
                                                    i41++;
                                                }
                                            }
                                            if (i6 >= 2 && lqe.b(' ', str8, i40 + i6, length5) == length5) {
                                                rs5 rs5Var = new rs5(i6);
                                                x1[] x1VarArr7 = new x1[1];
                                                x1VarArr7[i] = rs5Var;
                                                mk0Var = new mk0(x1VarArr7);
                                                mk0Var.b = length5 + 1;
                                                i2 = 4;
                                                break;
                                            }
                                        }
                                        mk0Var = null;
                                        i2 = 4;
                                        break;
                                    case 6:
                                        x1Var = x1Var3;
                                        z = isEmpty;
                                        x1 x1Var4 = (x1) obj2;
                                        int i42 = this.g;
                                        if (i42 < 4) {
                                            int i43 = this.e;
                                            int i44 = this.c + i42;
                                            int i45 = qx4Var.I() != null ? 1 : i;
                                            String str9 = this.a;
                                            char charAt11 = str9.charAt(i43);
                                            if (charAt11 == '*' || charAt11 == '+' || charAt11 == '-') {
                                                i7 = i45;
                                                i8 = i44;
                                                int i46 = i43 + 1;
                                                if (i46 >= str9.length() || (charAt2 = str9.charAt(i46)) == '\t' || charAt2 == ' ') {
                                                    x01 x01Var = new x01();
                                                    x01Var.g = charAt11;
                                                    z46Var = new z46(x01Var, i46);
                                                    if (z46Var != null) {
                                                        y46 y46Var = z46Var.a;
                                                        int i47 = z46Var.b;
                                                        int i48 = (i47 - i43) + i8;
                                                        int length6 = str9.length();
                                                        int i49 = i48;
                                                        while (true) {
                                                            if (i47 < length6) {
                                                                char charAt12 = str9.charAt(i47);
                                                                int i50 = i47;
                                                                if (charAt12 == '\t') {
                                                                    i49 = (4 - (i49 % 4)) + i49;
                                                                } else if (charAt12 == ' ') {
                                                                    i49++;
                                                                } else {
                                                                    i9 = 1;
                                                                }
                                                                i47 = i50 + 1;
                                                            } else {
                                                                i9 = i;
                                                            }
                                                        }
                                                        if (i7 == 0 || ((!(y46Var instanceof xq7) || ((xq7) y46Var).g == 1) && i9 != 0)) {
                                                            if (i9 == 0 || i49 - i48 > 4) {
                                                                i49 = i48 + 1;
                                                            }
                                                            z46Var2 = new z46(y46Var, i49);
                                                            if (z46Var2 != null) {
                                                                y46 y46Var2 = z46Var2.a;
                                                                int i51 = z46Var2.b;
                                                                g56 g56Var = new g56(i51 - this.c);
                                                                if (x1Var4 instanceof a56) {
                                                                    y46 y46Var3 = ((a56) x1Var4).a;
                                                                    if ((((y46Var3 instanceof x01) && (y46Var2 instanceof x01)) ? Character.valueOf(((x01) y46Var3).g).equals(Character.valueOf(((x01) y46Var2).g)) : ((y46Var3 instanceof xq7) && (y46Var2 instanceof xq7)) ? Character.valueOf(((xq7) y46Var3).h).equals(Character.valueOf(((xq7) y46Var2).h)) : i) != 0) {
                                                                        x1[] x1VarArr8 = new x1[1];
                                                                        x1VarArr8[i] = g56Var;
                                                                        mk0Var2 = new mk0(x1VarArr8);
                                                                        mk0Var2.c = i51;
                                                                        mk0Var = mk0Var2;
                                                                    }
                                                                }
                                                                a56 a56Var = new a56(y46Var2);
                                                                x1[] x1VarArr9 = new x1[2];
                                                                x1VarArr9[i] = a56Var;
                                                                x1VarArr9[1] = g56Var;
                                                                mk0Var2 = new mk0(x1VarArr9);
                                                                mk0Var2.c = i51;
                                                                mk0Var = mk0Var2;
                                                            }
                                                        }
                                                    }
                                                    z46Var2 = null;
                                                    if (z46Var2 != null) {
                                                    }
                                                }
                                                z46Var = null;
                                                if (z46Var != null) {
                                                }
                                                z46Var2 = null;
                                                if (z46Var2 != null) {
                                                }
                                            } else {
                                                int length7 = str9.length();
                                                int i52 = i43;
                                                int i53 = i;
                                                while (true) {
                                                    i7 = i45;
                                                    if (i52 < length7) {
                                                        charAt3 = str9.charAt(i52);
                                                        i8 = i44;
                                                        if (charAt3 != ')' && charAt3 != '.') {
                                                            switch (charAt3) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case kk7.n0 /* 51 */:
                                                                case kk7.o0 /* 52 */:
                                                                case kk7.p0 /* 53 */:
                                                                case kk7.q0 /* 54 */:
                                                                case kk7.r0 /* 55 */:
                                                                case '8':
                                                                case kk7.t0 /* 57 */:
                                                                    i53++;
                                                                    if (i53 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i52++;
                                                                        i45 = i7;
                                                                        i44 = i8;
                                                                    }
                                                            }
                                                            if (z46Var != null) {
                                                            }
                                                            z46Var2 = null;
                                                            if (z46Var2 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        i8 = i44;
                                                    }
                                                }
                                                if (i53 >= 1 && ((i10 = i52 + 1) >= str9.length() || (charAt4 = str9.charAt(i10)) == '\t' || charAt4 == ' ')) {
                                                    String charSequence = str9.subSequence(i43, i52).toString();
                                                    xq7 xq7Var = new xq7();
                                                    xq7Var.g = Integer.parseInt(charSequence);
                                                    xq7Var.h = charAt3;
                                                    z46Var = new z46(xq7Var, i10);
                                                    if (z46Var != null) {
                                                    }
                                                    z46Var2 = null;
                                                    if (z46Var2 != null) {
                                                    }
                                                }
                                                z46Var = null;
                                                if (z46Var != null) {
                                                }
                                                z46Var2 = null;
                                                if (z46Var2 != null) {
                                                }
                                            }
                                            i2 = 4;
                                            break;
                                        }
                                        mk0Var = null;
                                        i2 = 4;
                                        break;
                                    case 7:
                                        String str10 = this.a;
                                        StringBuilder I2 = qx4Var.I();
                                        if (I2 != null && I2.toString().contains("|") && !I2.toString().contains("\n")) {
                                            CharSequence subSequence = str10.subSequence(this.b, str10.length());
                                            ArrayList arrayList4 = new ArrayList();
                                            int i54 = i;
                                            int i55 = i54;
                                            int i56 = i55;
                                            while (true) {
                                                if (i55 >= subSequence.length()) {
                                                    x1Var = x1Var3;
                                                    z = isEmpty;
                                                    break;
                                                } else {
                                                    char charAt13 = subSequence.charAt(i55);
                                                    x1Var = x1Var3;
                                                    if (charAt13 == '\t' || charAt13 == ' ') {
                                                        z = isEmpty;
                                                        i55++;
                                                    } else {
                                                        z = isEmpty;
                                                        if (charAt13 == '-' || charAt13 == ':') {
                                                            if (i56 != 0 || arrayList4.isEmpty()) {
                                                                if (charAt13 == ':') {
                                                                    i55++;
                                                                    i11 = 1;
                                                                } else {
                                                                    i11 = i;
                                                                }
                                                                int i57 = i;
                                                                while (i55 < subSequence.length() && subSequence.charAt(i55) == '-') {
                                                                    i55++;
                                                                    i57 = 1;
                                                                }
                                                                if (i57 != 0) {
                                                                    if (i55 >= subSequence.length() || subSequence.charAt(i55) != ':') {
                                                                        i12 = i;
                                                                    } else {
                                                                        i55++;
                                                                        i12 = 1;
                                                                    }
                                                                    arrayList4.add(i11 != 0 ? i12 != 0 ? leb.b : leb.a : i12 != 0 ? leb.c : null);
                                                                    i56 = i;
                                                                }
                                                            }
                                                        } else if (charAt13 == '|') {
                                                            i55++;
                                                            i56++;
                                                            if (i56 <= 1) {
                                                                i54 = 1;
                                                            }
                                                        }
                                                    }
                                                    x1Var3 = x1Var;
                                                    isEmpty = z;
                                                }
                                            }
                                            arrayList4 = null;
                                            if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                ArrayList i58 = geb.i(I2);
                                                if (arrayList4.size() >= i58.size()) {
                                                    geb gebVar = new geb(arrayList4, i58);
                                                    x1[] x1VarArr10 = new x1[1];
                                                    x1VarArr10[i] = gebVar;
                                                    mk0 mk0Var3 = new mk0(x1VarArr10);
                                                    mk0Var3.b = this.b;
                                                    mk0Var3.a = true;
                                                    mk0Var = mk0Var3;
                                                    i2 = 4;
                                                    break;
                                                }
                                            }
                                        } else {
                                            x1Var = x1Var3;
                                            z = isEmpty;
                                        }
                                        mk0Var = null;
                                        i2 = 4;
                                        break;
                                    default:
                                        if (this.g < i19) {
                                            int i59 = this.e;
                                            String str11 = this.a;
                                            int length8 = str11.length();
                                            int i60 = i;
                                            int i61 = i60;
                                            int i62 = i61;
                                            while (true) {
                                                if (i59 >= length8) {
                                                    int i63 = i60;
                                                    int i64 = i61;
                                                    int i65 = i62;
                                                    if ((i63 >= 3 && i64 == 0 && i65 == 0) || ((i64 >= 3 && i63 == 0 && i65 == 0) || (i65 >= 3 && i63 == 0 && i64 == 0))) {
                                                        x1[] x1VarArr11 = new x1[1];
                                                        x1VarArr11[i] = new so3((byte) 1);
                                                        mk0Var = new mk0(x1VarArr11);
                                                        mk0Var.b = str11.length();
                                                    }
                                                } else {
                                                    char charAt14 = str11.charAt(i59);
                                                    if (charAt14 == c2 || charAt14 == c3) {
                                                        i13 = i60;
                                                        i61 = i61;
                                                        i62 = i62;
                                                    } else if (charAt14 != '*') {
                                                        if (charAt14 == '-') {
                                                            i60++;
                                                        } else if (charAt14 == '_') {
                                                            i61++;
                                                        }
                                                        i13 = i60;
                                                    } else {
                                                        i13 = i60;
                                                        i62++;
                                                    }
                                                    i59++;
                                                    i60 = i13;
                                                    c3 = ' ';
                                                    c2 = '\t';
                                                }
                                            }
                                        }
                                        mk0Var = null;
                                        x1Var = x1Var3;
                                        z = isEmpty;
                                        i2 = 4;
                                        break;
                                }
                                if (mk0Var == null) {
                                    i19 = i2;
                                    i14 = i;
                                    x1Var3 = x1Var;
                                    isEmpty = z;
                                }
                            } else {
                                i = i14;
                                x1Var = x1Var3;
                                z = isEmpty;
                                mk0Var = null;
                            }
                        }
                        if (mk0Var == null) {
                            k(this.e);
                        } else {
                            if (z) {
                                isEmpty = z;
                            } else {
                                f(arrayList2);
                                isEmpty = true;
                            }
                            int i66 = mk0Var.b;
                            if (i66 != -1) {
                                k(i66);
                            } else {
                                int i67 = mk0Var.c;
                                if (i67 != -1) {
                                    j(i67);
                                }
                            }
                            if (mk0Var.a) {
                                x1 h2 = h();
                                tb4.v(1, arrayList);
                                this.o.remove(h2);
                                if (h2 instanceof uu7) {
                                    b((uu7) h2);
                                }
                                h2.e().g();
                            }
                            x1[] x1VarArr12 = (x1[]) mk0Var.d;
                            int length9 = x1VarArr12.length;
                            x1Var3 = x1Var;
                            for (int i68 = i; i68 < length9; i68++) {
                                x1Var3 = x1VarArr12[i68];
                                a(x1Var3);
                                z2 = x1Var3.f();
                            }
                            i14 = i;
                        }
                    }
                }
            } else {
                x1Var = x1Var3;
                z = isEmpty;
            }
        }
        if (!z && !this.h && h().c()) {
            c();
            return;
        }
        if (!z) {
            f(arrayList2);
        }
        if (!x1Var.f()) {
            c();
        } else {
            if (this.h) {
                return;
            }
            a(new uu7());
            c();
        }
    }

    public final void j(int i) {
        int i2;
        int i3 = this.f;
        if (i >= i3) {
            this.b = this.e;
            this.c = i3;
        }
        int length = this.a.length();
        while (true) {
            i2 = this.c;
            if (i2 >= i || this.b == length) {
                break;
            } else {
                d();
            }
        }
        if (i2 <= i) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i;
        this.d = true;
    }

    public final void k(int i) {
        int i2 = this.e;
        if (i >= i2) {
            this.b = i2;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i3 = this.b;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}
