package ye;

import androidx.car.app.navigation.model.Maneuver;
import bf.p;
import bf.q;
import bf.r;
import bf.t;
import hg.k0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import ki.e0;
import t7.s;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class d {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(bf.b.class, bf.i.class, bf.h.class, bf.j.class, t.class, bf.n.class, bf.l.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final cf.b j;
    public final List k;
    public final c l;
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
        hashMap.put(bf.b.class, new xe.a(1));
        hashMap.put(bf.i.class, new xe.a(3));
        hashMap.put(bf.h.class, new xe.a(2));
        hashMap.put(bf.j.class, new xe.a(4));
        hashMap.put(t.class, new xe.a(7));
        hashMap.put(bf.n.class, new xe.a(6));
        hashMap.put(bf.l.class, new xe.a(5));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, cf.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = bVar;
        this.k = arrayList2;
        c cVar = new c(0);
        this.l = cVar;
        arrayList3.add(cVar);
        linkedHashSet.add(cVar);
    }

    public final void a(df.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.n.add(aVar);
        this.o.add(aVar);
    }

    public final void b(m mVar) {
        i iVar = mVar.b;
        iVar.a();
        ArrayList arrayList = iVar.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bf.m mVar2 = (bf.m) obj;
            r rVar = mVar.a;
            mVar2.g();
            p pVar = (p) rVar.e;
            mVar2.e = pVar;
            if (pVar != null) {
                pVar.f = mVar2;
            }
            mVar2.f = rVar;
            rVar.e = mVar2;
            p pVar2 = (p) rVar.b;
            mVar2.b = pVar2;
            if (((p) mVar2.e) == null) {
                pVar2.c = mVar2;
            }
            String str = mVar2.g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar2);
            }
        }
    }

    public final void c() {
        CharSequence subSequence;
        if (this.d) {
            int i10 = this.b + 1;
            CharSequence charSequence = this.a;
            CharSequence subSequence2 = charSequence.subSequence(i10, charSequence.length());
            int i11 = 4 - (this.c % 4);
            StringBuilder sb2 = new StringBuilder(subSequence2.length() + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append(' ');
            }
            sb2.append(subSequence2);
            subSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.a;
            subSequence = charSequence2.subSequence(this.b, charSequence2.length());
        }
        h().a(subSequence);
    }

    public final void d() {
        if (this.a.charAt(this.b) != '\t') {
            this.b++;
            this.c++;
        } else {
            this.b++;
            int i10 = this.c;
            this.c = (4 - (i10 % 4)) + i10;
        }
    }

    public final void e(df.a aVar) {
        if (h() == aVar) {
            a4.a.x(1, this.n);
        }
        if (aVar instanceof m) {
            b((m) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((df.a) list.get(size));
        }
    }

    public final void g() {
        int i10 = this.b;
        int i11 = this.c;
        this.h = true;
        int length = this.a.length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char charAt = this.a.charAt(i10);
            if (charAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (charAt != ' ') {
                this.h = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.e = i10;
        this.f = i11;
        this.g = i11 - this.c;
    }

    public final df.a h() {
        return (df.a) k0.g(1, this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x01ef, code lost:
    
        if (r8 < 1) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01f1, code lost:
    
        r5 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x01f7, code lost:
    
        if (r5 >= r14.length()) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01f9, code lost:
    
        r8 = r14.charAt(r5);
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0201, code lost:
    
        if (r8 == '\t') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0205, code lost:
    
        if (r8 == ' ') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x020a, code lost:
    
        r6 = r14.subSequence(r11, r15).toString();
        r8 = new bf.q();
        r8.g = java.lang.Integer.parseInt(r6);
        r8.h = r4;
        r4 = new ye.j(r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0208, code lost:
    
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x05dd, code lost:
    
        if (r11 != 0) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x05e3, code lost:
    
        if (r5.isEmpty() != false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x05e6, code lost:
    
        if (r13 != ':') goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x05e8, code lost:
    
        r8 = r8 + 1;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x05ed, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x05f2, code lost:
    
        if (r8 >= r3.length()) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x05fa, code lost:
    
        if (r3.charAt(r8) != '-') goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x05fc, code lost:
    
        r8 = r8 + 1;
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0604, code lost:
    
        if (r13 != false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x060b, code lost:
    
        if (r8 >= r3.length()) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0613, code lost:
    
        if (r3.charAt(r8) != ':') goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0615, code lost:
    
        r8 = r8 + 1;
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x061a, code lost:
    
        if (r11 == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x061c, code lost:
    
        if (r13 == false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x061e, code lost:
    
        r11 = we.c.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0621, code lost:
    
        if (r11 == false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0623, code lost:
    
        r11 = we.c.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0626, code lost:
    
        if (r13 == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0628, code lost:
    
        r11 = we.c.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x062b, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0619, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x05ec, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0637, code lost:
    
        if (r6 == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x06d6, code lost:
    
        k(r23.e);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:175:0x01da. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0529  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        df.a aVar;
        t8.b bVar;
        t8.b bVar2;
        we.c cVar;
        char charAt;
        int i10;
        e eVar;
        f fVar;
        int i11;
        StringBuilder h;
        t8.b bVar3;
        boolean z10;
        j jVar;
        char charAt2;
        j jVar2;
        boolean z11;
        int i12;
        String str2 = str;
        int length = str2.length();
        StringBuilder sb2 = null;
        for (int i13 = 0; i13 < length; i13++) {
            char charAt3 = str2.charAt(i13);
            if (charAt3 == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) str2, 0, i13);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(charAt3);
            }
        }
        if (sb2 != null) {
            str2 = sb2.toString();
        }
        this.a = str2;
        this.b = 0;
        this.c = 0;
        this.d = false;
        ArrayList arrayList = this.n;
        int i14 = 1;
        for (df.a aVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            q3.h h10 = aVar2.h(this);
            if (h10 == null) {
                break;
            }
            if (h10.c) {
                e(aVar2);
                return;
            }
            int i15 = h10.a;
            if (i15 != -1) {
                k(i15);
            } else {
                int i16 = h10.b;
                if (i16 != -1) {
                    j(i16);
                }
            }
            i14++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i14, arrayList.size()));
        df.a aVar3 = (df.a) arrayList.get(i14 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z12 = (aVar3.e() instanceof r) || aVar3.f();
        while (true) {
            if (z12) {
                g();
                if (!this.h) {
                    int i17 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        e0 e0Var = new e0(aVar3, 25);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                int i18 = ((xe.a) it.next()).a;
                                char c10 = ' ';
                                Object obj = e0Var.b;
                                switch (i18) {
                                    case 0:
                                        aVar = aVar3;
                                        CharSequence charSequence = this.a;
                                        StringBuilder h11 = e0Var.h();
                                        if (h11 != null && h11.toString().contains("|") && !h11.toString().contains("\n")) {
                                            CharSequence subSequence = charSequence.subSequence(this.b, charSequence.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            boolean z13 = false;
                                            int i19 = 0;
                                            while (true) {
                                                int i20 = 0;
                                                while (true) {
                                                    if (i19 >= subSequence.length()) {
                                                        break;
                                                    } else {
                                                        char charAt4 = subSequence.charAt(i19);
                                                        if (charAt4 == '\t' || charAt4 == ' ') {
                                                            i19++;
                                                        } else if (charAt4 != '-' && charAt4 != ':') {
                                                            if (charAt4 == '|') {
                                                                i19++;
                                                                i20++;
                                                                if (i20 <= 1) {
                                                                    z13 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                arrayList3.add(cVar);
                                            }
                                            arrayList3 = null;
                                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                                ArrayList i21 = xe.b.i(h11);
                                                if (arrayList3.size() >= i21.size()) {
                                                    bVar2 = new t8.b(new xe.b(arrayList3, i21));
                                                    bVar2.a = this.b;
                                                    bVar2.c = true;
                                                    bVar = bVar2;
                                                    break;
                                                }
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 1:
                                        aVar = aVar3;
                                        int i22 = this.e;
                                        if (a.i(this, i22)) {
                                            int i23 = this.c + this.g;
                                            int i24 = i23 + 1;
                                            CharSequence charSequence2 = this.a;
                                            int i25 = i22 + 1;
                                            if (i25 < charSequence2.length() && ((charAt = charSequence2.charAt(i25)) == '\t' || charAt == ' ')) {
                                                i24 = i23 + 2;
                                            }
                                            bVar = new t8.b(new a());
                                            bVar.b = i24;
                                            break;
                                        }
                                        bVar = null;
                                        break;
                                    case 2:
                                        aVar = aVar3;
                                        int i26 = this.g;
                                        if (i26 < 4) {
                                            int i27 = this.e;
                                            CharSequence charSequence3 = this.a;
                                            int length2 = charSequence3.length();
                                            int i28 = i27;
                                            int i29 = 0;
                                            int i30 = 0;
                                            while (true) {
                                                i10 = i27;
                                                if (i28 < length2) {
                                                    char charAt5 = charSequence3.charAt(i28);
                                                    if (charAt5 == '`') {
                                                        i29++;
                                                    } else if (charAt5 == '~') {
                                                        i30++;
                                                    }
                                                    i28++;
                                                    i27 = i10;
                                                }
                                            }
                                            int i31 = 3;
                                            if (i29 >= 3) {
                                                if (i30 == 0) {
                                                    int i32 = i10 + i29;
                                                    int length3 = charSequence3.length();
                                                    while (true) {
                                                        if (i32 >= length3) {
                                                            i32 = -1;
                                                        } else if (charSequence3.charAt(i32) != '`') {
                                                            i32++;
                                                        }
                                                    }
                                                    if (i32 == -1) {
                                                        eVar = new e('`', i29, i26);
                                                        if (eVar != null) {
                                                            bVar2 = new t8.b(eVar);
                                                            bVar2.a = i10 + eVar.a.h;
                                                            bVar = bVar2;
                                                            break;
                                                        }
                                                    }
                                                    eVar = null;
                                                    if (eVar != null) {
                                                    }
                                                } else {
                                                    i31 = 3;
                                                }
                                            }
                                            if (i30 >= i31 && i29 == 0) {
                                                eVar = new e('~', i30, i26);
                                                if (eVar != null) {
                                                }
                                            }
                                            eVar = null;
                                            if (eVar != null) {
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 3:
                                        aVar = aVar3;
                                        if (this.g < 4) {
                                            CharSequence charSequence4 = this.a;
                                            int i33 = this.e;
                                            int b10 = s.b('#', charSequence4, i33, charSequence4.length()) - i33;
                                            if (b10 != 0 && b10 <= 6) {
                                                int i34 = i33 + b10;
                                                if (i34 >= charSequence4.length()) {
                                                    fVar = new f(b10, "");
                                                } else {
                                                    char charAt6 = charSequence4.charAt(i34);
                                                    char c11 = ' ';
                                                    char c12 = '\t';
                                                    if (charAt6 == ' ' || charAt6 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 < i34) {
                                                                length4 = i34 - 1;
                                                            } else {
                                                                char charAt7 = charSequence4.charAt(length4);
                                                                if (charAt7 == c12 || charAt7 == c11) {
                                                                    length4--;
                                                                    c12 = '\t';
                                                                    c11 = ' ';
                                                                }
                                                            }
                                                        }
                                                        int i35 = length4;
                                                        while (true) {
                                                            if (i35 < i34) {
                                                                i35 = i34 - 1;
                                                            } else if (charSequence4.charAt(i35) == '#') {
                                                                i35--;
                                                            }
                                                        }
                                                        int i36 = i35;
                                                        while (true) {
                                                            if (i36 < i34) {
                                                                i36 = i34 - 1;
                                                            } else {
                                                                char charAt8 = charSequence4.charAt(i36);
                                                                if (charAt8 == '\t' || charAt8 == ' ') {
                                                                    i36--;
                                                                }
                                                            }
                                                        }
                                                        fVar = i36 != i35 ? new f(b10, charSequence4.subSequence(i34, i36 + 1).toString()) : new f(b10, charSequence4.subSequence(i34, length4 + 1).toString());
                                                    }
                                                }
                                                if (fVar == null) {
                                                    bVar3 = new t8.b(fVar);
                                                    bVar3.a = charSequence4.length();
                                                    bVar = bVar3;
                                                    break;
                                                } else {
                                                    char charAt9 = charSequence4.charAt(i33);
                                                    if (charAt9 != '-') {
                                                        if (charAt9 == '=') {
                                                            if (s.c(s.b('=', charSequence4, i33 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                                i11 = 1;
                                                                if (i11 > 0 && (h = e0Var.h()) != null) {
                                                                    t8.b bVar4 = new t8.b(new f(i11, h.toString()));
                                                                    bVar4.a = charSequence4.length();
                                                                    bVar4.c = true;
                                                                    bVar = bVar4;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        i11 = 0;
                                                        if (i11 > 0) {
                                                            t8.b bVar42 = new t8.b(new f(i11, h.toString()));
                                                            bVar42.a = charSequence4.length();
                                                            bVar42.c = true;
                                                            bVar = bVar42;
                                                        }
                                                    }
                                                    if (s.c(s.b('-', charSequence4, i33 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                        i11 = 2;
                                                        if (i11 > 0) {
                                                        }
                                                    }
                                                    i11 = 0;
                                                    if (i11 > 0) {
                                                    }
                                                }
                                            }
                                            fVar = null;
                                            if (fVar == null) {
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 4:
                                        aVar = aVar3;
                                        int i37 = this.e;
                                        CharSequence charSequence5 = this.a;
                                        if (this.g < 4 && charSequence5.charAt(i37) == '<') {
                                            for (int i38 = 1; i38 <= 7; i38++) {
                                                if (i38 != 7 || !(((df.a) obj).e() instanceof r)) {
                                                    Pattern[] patternArr = g.e[i38];
                                                    Pattern pattern = patternArr[0];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence5.subSequence(i37, charSequence5.length())).find()) {
                                                        bVar = new t8.b(new g(pattern2));
                                                        bVar.a = this.b;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 5:
                                        aVar = aVar3;
                                        if (this.g >= 4 && !this.h && !(h().e() instanceof r)) {
                                            bVar = new t8.b(new f());
                                            bVar.b = this.c + 4;
                                            break;
                                        } else {
                                            bVar = null;
                                            break;
                                        }
                                        break;
                                    case 6:
                                        df.a aVar4 = (df.a) obj;
                                        int i39 = this.g;
                                        if (i39 >= 4) {
                                            aVar = aVar3;
                                        } else {
                                            int i40 = this.e;
                                            int i41 = this.c + i39;
                                            boolean z14 = e0Var.h() != null;
                                            CharSequence charSequence6 = this.a;
                                            char charAt10 = charSequence6.charAt(i40);
                                            if (charAt10 == '*' || charAt10 == '+' || charAt10 == '-') {
                                                z10 = z14;
                                                aVar = aVar3;
                                                int i42 = i40 + 1;
                                                if (i42 >= charSequence6.length() || (charAt2 = charSequence6.charAt(i42)) == '\t' || charAt2 == ' ') {
                                                    bf.c cVar2 = new bf.c();
                                                    cVar2.g = charAt10;
                                                    jVar = new j(cVar2, i42);
                                                    if (jVar != null) {
                                                        bf.n nVar = jVar.a;
                                                        int i43 = jVar.b;
                                                        int i44 = (i43 - i40) + i41;
                                                        int length5 = charSequence6.length();
                                                        int i45 = i44;
                                                        while (true) {
                                                            if (i43 >= length5) {
                                                                z11 = false;
                                                            } else {
                                                                char charAt11 = charSequence6.charAt(i43);
                                                                if (charAt11 == '\t') {
                                                                    i45 = (4 - (i45 % 4)) + i45;
                                                                } else if (charAt11 == ' ') {
                                                                    i45++;
                                                                } else {
                                                                    z11 = true;
                                                                }
                                                                i43++;
                                                            }
                                                        }
                                                        if (!z10 || ((!(nVar instanceof q) || ((q) nVar).g == 1) && z11)) {
                                                            if (!z11 || i45 - i44 > 4) {
                                                                i45 = i44 + 1;
                                                            }
                                                            jVar2 = new j(nVar, i45);
                                                            if (jVar2 != null) {
                                                                bf.n nVar2 = jVar2.a;
                                                                int i46 = jVar2.b;
                                                                l lVar = new l(i46 - this.c);
                                                                if (aVar4 instanceof k) {
                                                                    bf.n nVar3 = ((k) aVar4).a;
                                                                    if (((nVar3 instanceof bf.c) && (nVar2 instanceof bf.c)) ? Character.valueOf(((bf.c) nVar3).g).equals(Character.valueOf(((bf.c) nVar2).g)) : ((nVar3 instanceof q) && (nVar2 instanceof q)) ? Character.valueOf(((q) nVar3).h).equals(Character.valueOf(((q) nVar2).h)) : false) {
                                                                        bVar3 = new t8.b(lVar);
                                                                        bVar3.b = i46;
                                                                        bVar = bVar3;
                                                                        break;
                                                                    }
                                                                }
                                                                bVar = new t8.b(new k(nVar2), lVar);
                                                                bVar.b = i46;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    jVar2 = null;
                                                    if (jVar2 != null) {
                                                    }
                                                }
                                                jVar = null;
                                                if (jVar != null) {
                                                }
                                                jVar2 = null;
                                                if (jVar2 != null) {
                                                }
                                            } else {
                                                int length6 = charSequence6.length();
                                                int i47 = i40;
                                                int i48 = 0;
                                                while (true) {
                                                    if (i47 < length6) {
                                                        int i49 = length6;
                                                        char charAt12 = charSequence6.charAt(i47);
                                                        z10 = z14;
                                                        if (charAt12 != ')' && charAt12 != '.') {
                                                            switch (charAt12) {
                                                                case '0':
                                                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    i48++;
                                                                    if (i48 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i47++;
                                                                        length6 = i49;
                                                                        z14 = z10;
                                                                    }
                                                            }
                                                            if (jVar != null) {
                                                            }
                                                            jVar2 = null;
                                                            if (jVar2 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        z10 = z14;
                                                    }
                                                }
                                                aVar = aVar3;
                                                jVar = null;
                                                if (jVar != null) {
                                                }
                                                jVar2 = null;
                                                if (jVar2 != null) {
                                                }
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 7:
                                        if (this.g < 4) {
                                            int i50 = this.e;
                                            CharSequence charSequence7 = this.a;
                                            int length7 = charSequence7.length();
                                            int i51 = 0;
                                            int i52 = 0;
                                            int i53 = 0;
                                            while (true) {
                                                if (i50 >= length7) {
                                                    int i54 = i53;
                                                    if ((i51 >= 3 && i52 == 0 && i54 == 0) || ((i52 >= 3 && i51 == 0 && i54 == 0) || (i54 >= 3 && i51 == 0 && i52 == 0))) {
                                                        bVar = new t8.b(new c(1));
                                                        bVar.a = charSequence7.length();
                                                    }
                                                } else {
                                                    char charAt13 = charSequence7.charAt(i50);
                                                    if (charAt13 == '\t' || charAt13 == c10) {
                                                        i53 = i53;
                                                    } else if (charAt13 == '*') {
                                                        i53++;
                                                    } else if (charAt13 == '-') {
                                                        i51++;
                                                    } else if (charAt13 == '_') {
                                                        i52++;
                                                    }
                                                    i50++;
                                                    c10 = ' ';
                                                }
                                            }
                                        }
                                        bVar = null;
                                        aVar = aVar3;
                                        break;
                                    default:
                                        if (this.g < i17) {
                                            int i55 = this.e;
                                            CharSequence charSequence8 = this.a;
                                            int length8 = charSequence8.length();
                                            int i56 = i55;
                                            while (true) {
                                                if (i56 >= length8) {
                                                    i12 = length8 - i55;
                                                } else if ('$' != charSequence8.charAt(i56)) {
                                                    i12 = i56 - i55;
                                                } else {
                                                    i56++;
                                                }
                                            }
                                            if (i12 >= 2 && s.b(' ', charSequence8, i55 + i12, length8) == length8) {
                                                bVar = new t8.b(new zc.b(i12));
                                                bVar.a = length8 + 1;
                                                aVar = aVar3;
                                                break;
                                            }
                                        }
                                        bVar = null;
                                        aVar = aVar3;
                                        break;
                                }
                                if (bVar == null) {
                                    aVar3 = aVar;
                                    i17 = 4;
                                }
                            } else {
                                aVar = aVar3;
                                bVar = null;
                            }
                        }
                        if (bVar == null) {
                            k(this.e);
                        } else {
                            if (!isEmpty) {
                                f(arrayList2);
                                isEmpty = true;
                            }
                            int i57 = bVar.a;
                            if (i57 != -1) {
                                k(i57);
                            } else {
                                int i58 = bVar.b;
                                if (i58 != -1) {
                                    j(i58);
                                }
                            }
                            if (bVar.c) {
                                df.a h12 = h();
                                a4.a.x(1, arrayList);
                                this.o.remove(h12);
                                if (h12 instanceof m) {
                                    b((m) h12);
                                }
                                h12.e().g();
                            }
                            df.a[] aVarArr = (df.a[]) bVar.d;
                            int length9 = aVarArr.length;
                            int i59 = 0;
                            while (i59 < length9) {
                                df.a aVar5 = aVarArr[i59];
                                a(aVar5);
                                z12 = aVar5.f();
                                i59++;
                                aVar = aVar5;
                            }
                            aVar3 = aVar;
                        }
                    }
                }
            } else {
                aVar = aVar3;
            }
        }
        if (!isEmpty && !this.h && h().c()) {
            c();
            return;
        }
        if (!isEmpty) {
            f(arrayList2);
        }
        if (!aVar.f()) {
            c();
        } else {
            if (this.h) {
                return;
            }
            a(new m());
            c();
        }
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f;
        if (i10 >= i12) {
            this.b = this.e;
            this.c = i12;
        }
        int length = this.a.length();
        while (true) {
            i11 = this.c;
            if (i11 >= i10 || this.b == length) {
                break;
            } else {
                d();
            }
        }
        if (i11 <= i10) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i10;
        this.d = true;
    }

    public final void k(int i10) {
        int i11 = this.e;
        if (i10 >= i11) {
            this.b = i11;
            this.c = this.f;
        }
        int length = this.a.length();
        while (true) {
            int i12 = this.b;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}
