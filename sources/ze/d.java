package ze;

import androidx.car.app.navigation.model.Maneuver;
import cf.p;
import cf.q;
import cf.r;
import cf.t;
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
import v7.i0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(cf.b.class, cf.i.class, cf.h.class, cf.j.class, t.class, cf.n.class, cf.l.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final df.b j;
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
        hashMap.put(cf.b.class, new ad.b(2));
        hashMap.put(cf.i.class, new ad.b(4));
        hashMap.put(cf.h.class, new ad.b(3));
        hashMap.put(cf.j.class, new ad.b(5));
        hashMap.put(t.class, new ad.b(8));
        hashMap.put(cf.n.class, new ad.b(7));
        hashMap.put(cf.l.class, new ad.b(6));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, df.b bVar, ArrayList arrayList2) {
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

    public final void a(ef.a aVar) {
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
            cf.m mVar2 = (cf.m) obj;
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

    public final void e(ef.a aVar) {
        if (h() == aVar) {
            a1.g.y(1, this.n);
        }
        if (aVar instanceof m) {
            b((m) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((ef.a) list.get(size));
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

    public final ef.a h() {
        return (ef.a) hg.c.g(1, this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x01ba, code lost:
    
        if (r8 < 1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01bc, code lost:
    
        r6 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01c2, code lost:
    
        if (r6 >= r13.length()) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01c4, code lost:
    
        r8 = r13.charAt(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01ca, code lost:
    
        if (r8 == '\t') goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x01ce, code lost:
    
        if (r8 == ' ') goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x01d1, code lost:
    
        r8 = r13.subSequence(r4, r15).toString();
        r14 = new cf.q();
        r14.g = java.lang.Integer.parseInt(r8);
        r14.h = r3;
        r3 = new ze.j(r14, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0606, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0604, code lost:
    
        if (r6 == 0) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x06ea, code lost:
    
        k(r22.e);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:161:0x01a7. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        ef.a aVar;
        int i10;
        t8.b bVar;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt;
        int i15;
        e eVar;
        t8.b bVar2;
        f fVar;
        int i16;
        StringBuilder a2;
        int i17;
        int i18;
        j jVar;
        char charAt2;
        j jVar2;
        int i19;
        String str2 = str;
        int length = str2.length();
        int i20 = 0;
        StringBuilder sb2 = null;
        for (int i21 = 0; i21 < length; i21++) {
            char charAt3 = str2.charAt(i21);
            if (charAt3 == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) str2, 0, i21);
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
        int i22 = 1;
        for (ef.a aVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            q3.h h = aVar2.h(this);
            if (h == null) {
                break;
            }
            if (h.c) {
                e(aVar2);
                return;
            }
            int i23 = h.a;
            if (i23 != -1) {
                k(i23);
            } else {
                int i24 = h.b;
                if (i24 != -1) {
                    j(i24);
                }
            }
            i22++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i22, arrayList.size()));
        ef.a aVar3 = (ef.a) arrayList.get(i22 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z11 = (aVar3.e() instanceof r) || aVar3.f();
        while (true) {
            if (z11) {
                g();
                if (!this.h) {
                    int i25 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        w3.d dVar = new w3.d(aVar3);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                int i26 = ((ad.b) it.next()).a;
                                i10 = i20;
                                char c10 = ' ';
                                Object obj = dVar.a;
                                switch (i26) {
                                    case 0:
                                        aVar = aVar3;
                                        i11 = 4;
                                        if (this.g < 4) {
                                            int i27 = this.e;
                                            CharSequence charSequence = this.a;
                                            int length2 = charSequence.length();
                                            int i28 = i27;
                                            while (true) {
                                                if (i28 >= length2) {
                                                    i12 = length2 - i27;
                                                } else if ('$' != charSequence.charAt(i28)) {
                                                    i12 = i28 - i27;
                                                } else {
                                                    i28++;
                                                }
                                            }
                                            if (i12 >= 2 && i0.b(' ', charSequence, i27 + i12, length2) == length2) {
                                                ef.a[] aVarArr = new ef.a[1];
                                                aVarArr[i10] = new ad.c(i12);
                                                bVar = new t8.b(aVarArr);
                                                bVar.a = length2 + 1;
                                                break;
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 1:
                                        aVar = aVar3;
                                        CharSequence charSequence2 = this.a;
                                        StringBuilder a10 = dVar.a();
                                        if (a10 != null && a10.toString().contains("|") && !a10.toString().contains("\n")) {
                                            CharSequence subSequence = charSequence2.subSequence(this.b, charSequence2.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            int i29 = i10;
                                            int i30 = i29;
                                            int i31 = i30;
                                            while (true) {
                                                if (i30 >= subSequence.length()) {
                                                    break;
                                                } else {
                                                    char charAt4 = subSequence.charAt(i30);
                                                    if (charAt4 == '\t' || charAt4 == ' ') {
                                                        i30++;
                                                    } else if (charAt4 == '-' || charAt4 == ':') {
                                                        if (i31 == 0 && !arrayList3.isEmpty()) {
                                                            break;
                                                        } else {
                                                            if (charAt4 == ':') {
                                                                i30++;
                                                                i13 = 1;
                                                            } else {
                                                                i13 = i10;
                                                            }
                                                            int i32 = i10;
                                                            while (i30 < subSequence.length() && subSequence.charAt(i30) == '-') {
                                                                i30++;
                                                                i32 = 1;
                                                            }
                                                            if (i32 == 0) {
                                                                break;
                                                            } else {
                                                                if (i30 >= subSequence.length() || subSequence.charAt(i30) != ':') {
                                                                    i14 = i10;
                                                                } else {
                                                                    i30++;
                                                                    i14 = 1;
                                                                }
                                                                arrayList3.add((i13 == 0 || i14 == 0) ? i13 != 0 ? xe.c.a : i14 != 0 ? xe.c.c : null : xe.c.b);
                                                                i31 = i10;
                                                            }
                                                        }
                                                    } else if (charAt4 != '|') {
                                                        break;
                                                    } else {
                                                        i30++;
                                                        i31++;
                                                        if (i31 > 1) {
                                                            break;
                                                        } else {
                                                            i29 = 1;
                                                        }
                                                    }
                                                }
                                            }
                                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                                ArrayList i33 = ye.a.i(a10);
                                                if (arrayList3.size() >= i33.size()) {
                                                    ye.a aVar4 = new ye.a(arrayList3, i33);
                                                    ef.a[] aVarArr2 = new ef.a[1];
                                                    aVarArr2[i10] = aVar4;
                                                    t8.b bVar3 = new t8.b(aVarArr2);
                                                    bVar3.a = this.b;
                                                    bVar3.c = true;
                                                    bVar = bVar3;
                                                    i11 = 4;
                                                    break;
                                                }
                                            }
                                        }
                                        bVar = null;
                                        i11 = 4;
                                        break;
                                    case 2:
                                        aVar = aVar3;
                                        int i34 = this.e;
                                        if (a.i(this, i34)) {
                                            int i35 = this.c + this.g;
                                            int i36 = i35 + 1;
                                            CharSequence charSequence3 = this.a;
                                            int i37 = i34 + 1;
                                            if (i37 < charSequence3.length() && ((charAt = charSequence3.charAt(i37)) == '\t' || charAt == ' ')) {
                                                i36 = i35 + 2;
                                            }
                                            ef.a[] aVarArr3 = new ef.a[1];
                                            aVarArr3[i10] = new a();
                                            bVar = new t8.b(aVarArr3);
                                            bVar.b = i36;
                                            i11 = 4;
                                            break;
                                        }
                                        bVar = null;
                                        i11 = 4;
                                        break;
                                    case 3:
                                        aVar = aVar3;
                                        int i38 = this.g;
                                        if (i38 < 4) {
                                            int i39 = this.e;
                                            CharSequence charSequence4 = this.a;
                                            int length3 = charSequence4.length();
                                            int i40 = i39;
                                            int i41 = i10;
                                            int i42 = i41;
                                            while (true) {
                                                i15 = i39;
                                                if (i40 < length3) {
                                                    char charAt5 = charSequence4.charAt(i40);
                                                    if (charAt5 == '`') {
                                                        i41++;
                                                    } else if (charAt5 == '~') {
                                                        i42++;
                                                    }
                                                    i40++;
                                                    i39 = i15;
                                                }
                                            }
                                            int i43 = 3;
                                            if (i41 >= 3) {
                                                if (i42 == 0) {
                                                    int i44 = i15 + i41;
                                                    int length4 = charSequence4.length();
                                                    while (true) {
                                                        if (i44 >= length4) {
                                                            i44 = -1;
                                                        } else if (charSequence4.charAt(i44) != '`') {
                                                            i44++;
                                                        }
                                                    }
                                                    if (i44 == -1) {
                                                        eVar = new e('`', i41, i38);
                                                        if (eVar != null) {
                                                            ef.a[] aVarArr4 = new ef.a[1];
                                                            aVarArr4[i10] = eVar;
                                                            bVar2 = new t8.b(aVarArr4);
                                                            bVar2.a = i15 + eVar.a.h;
                                                            bVar = bVar2;
                                                            i11 = 4;
                                                            break;
                                                        }
                                                    }
                                                    eVar = null;
                                                    if (eVar != null) {
                                                    }
                                                } else {
                                                    i43 = 3;
                                                }
                                            }
                                            if (i42 >= i43 && i41 == 0) {
                                                eVar = new e('~', i42, i38);
                                                if (eVar != null) {
                                                }
                                            }
                                            eVar = null;
                                            if (eVar != null) {
                                            }
                                        }
                                        bVar = null;
                                        i11 = 4;
                                    case 4:
                                        aVar = aVar3;
                                        if (this.g < 4) {
                                            CharSequence charSequence5 = this.a;
                                            int i45 = this.e;
                                            int b10 = i0.b('#', charSequence5, i45, charSequence5.length()) - i45;
                                            if (b10 != 0 && b10 <= 6) {
                                                int i46 = i45 + b10;
                                                if (i46 >= charSequence5.length()) {
                                                    fVar = new f(b10, "");
                                                } else {
                                                    char charAt6 = charSequence5.charAt(i46);
                                                    char c11 = ' ';
                                                    char c12 = '\t';
                                                    if (charAt6 == ' ' || charAt6 == '\t') {
                                                        int length5 = charSequence5.length() - 1;
                                                        while (true) {
                                                            if (length5 < i46) {
                                                                length5 = i46 - 1;
                                                            } else {
                                                                char charAt7 = charSequence5.charAt(length5);
                                                                if (charAt7 == c12 || charAt7 == c11) {
                                                                    length5--;
                                                                    c11 = ' ';
                                                                    c12 = '\t';
                                                                }
                                                            }
                                                        }
                                                        int i47 = length5;
                                                        while (true) {
                                                            if (i47 < i46) {
                                                                i47 = i46 - 1;
                                                            } else if (charSequence5.charAt(i47) == '#') {
                                                                i47--;
                                                            }
                                                        }
                                                        int i48 = i47;
                                                        while (true) {
                                                            if (i48 < i46) {
                                                                i48 = i46 - 1;
                                                            } else {
                                                                char charAt8 = charSequence5.charAt(i48);
                                                                if (charAt8 == '\t' || charAt8 == ' ') {
                                                                    i48--;
                                                                }
                                                            }
                                                        }
                                                        fVar = i48 != i47 ? new f(b10, charSequence5.subSequence(i46, i48 + 1).toString()) : new f(b10, charSequence5.subSequence(i46, length5 + 1).toString());
                                                    }
                                                }
                                                if (fVar == null) {
                                                    ef.a[] aVarArr5 = new ef.a[1];
                                                    aVarArr5[i10] = fVar;
                                                    bVar2 = new t8.b(aVarArr5);
                                                    bVar2.a = charSequence5.length();
                                                } else {
                                                    char charAt9 = charSequence5.charAt(i45);
                                                    if (charAt9 != '-') {
                                                        if (charAt9 == '=') {
                                                            if (i0.c(i0.b('=', charSequence5, i45 + 1, charSequence5.length()), charSequence5.length(), charSequence5) >= charSequence5.length()) {
                                                                i16 = 1;
                                                                if (i16 > 0 && (a2 = dVar.a()) != null) {
                                                                    f fVar2 = new f(i16, a2.toString());
                                                                    ef.a[] aVarArr6 = new ef.a[1];
                                                                    aVarArr6[i10] = fVar2;
                                                                    bVar2 = new t8.b(aVarArr6);
                                                                    bVar2.a = charSequence5.length();
                                                                    bVar2.c = true;
                                                                }
                                                            }
                                                        }
                                                        i16 = i10;
                                                        if (i16 > 0) {
                                                            f fVar22 = new f(i16, a2.toString());
                                                            ef.a[] aVarArr62 = new ef.a[1];
                                                            aVarArr62[i10] = fVar22;
                                                            bVar2 = new t8.b(aVarArr62);
                                                            bVar2.a = charSequence5.length();
                                                            bVar2.c = true;
                                                        }
                                                    }
                                                    if (i0.c(i0.b('-', charSequence5, i45 + 1, charSequence5.length()), charSequence5.length(), charSequence5) >= charSequence5.length()) {
                                                        i16 = 2;
                                                        if (i16 > 0) {
                                                        }
                                                    }
                                                    i16 = i10;
                                                    if (i16 > 0) {
                                                    }
                                                }
                                                bVar = bVar2;
                                                i11 = 4;
                                                break;
                                            }
                                            fVar = null;
                                            if (fVar == null) {
                                            }
                                            bVar = bVar2;
                                            i11 = 4;
                                        }
                                        bVar = null;
                                        i11 = 4;
                                        break;
                                    case 5:
                                        aVar = aVar3;
                                        int i49 = i25;
                                        int i50 = this.e;
                                        CharSequence charSequence6 = this.a;
                                        if (this.g < i49 && charSequence6.charAt(i50) == '<') {
                                            for (int i51 = 1; i51 <= 7; i51++) {
                                                if (i51 != 7 || !(((ef.a) obj).e() instanceof r)) {
                                                    Pattern[] patternArr = g.e[i51];
                                                    Pattern pattern = patternArr[i10];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence6.subSequence(i50, charSequence6.length())).find()) {
                                                        ef.a[] aVarArr7 = new ef.a[1];
                                                        aVarArr7[i10] = new g(pattern2);
                                                        bVar = new t8.b(aVarArr7);
                                                        bVar.a = this.b;
                                                        i11 = 4;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        bVar = null;
                                        i11 = 4;
                                        break;
                                    case 6:
                                        aVar = aVar3;
                                        if (this.g < 4) {
                                            i17 = 4;
                                        } else if (!this.h && !(h().e() instanceof r)) {
                                            ef.a[] aVarArr8 = new ef.a[1];
                                            aVarArr8[i10] = new f();
                                            bVar = new t8.b(aVarArr8);
                                            i17 = 4;
                                            bVar.b = this.c + 4;
                                            i11 = i17;
                                            break;
                                        } else {
                                            i17 = 4;
                                        }
                                        bVar = null;
                                        i11 = i17;
                                        break;
                                    case 7:
                                        ef.a aVar5 = (ef.a) obj;
                                        int i52 = this.g;
                                        if (i52 < 4) {
                                            int i53 = this.e;
                                            int i54 = this.c + i52;
                                            int i55 = dVar.a() != null ? 1 : i10;
                                            CharSequence charSequence7 = this.a;
                                            char charAt10 = charSequence7.charAt(i53);
                                            if (charAt10 == '*' || charAt10 == '+' || charAt10 == '-') {
                                                i18 = i55;
                                                aVar = aVar3;
                                                int i56 = i53 + 1;
                                                if (i56 >= charSequence7.length() || (charAt2 = charSequence7.charAt(i56)) == '\t' || charAt2 == ' ') {
                                                    cf.c cVar = new cf.c();
                                                    cVar.g = charAt10;
                                                    jVar = new j(cVar, i56);
                                                    if (jVar != null) {
                                                        cf.n nVar = jVar.a;
                                                        int i57 = jVar.b;
                                                        int i58 = (i57 - i53) + i54;
                                                        int length6 = charSequence7.length();
                                                        int i59 = i58;
                                                        while (true) {
                                                            if (i57 >= length6) {
                                                                i19 = i10;
                                                            } else {
                                                                char charAt11 = charSequence7.charAt(i57);
                                                                if (charAt11 == '\t') {
                                                                    i59 = (4 - (i59 % 4)) + i59;
                                                                } else if (charAt11 == ' ') {
                                                                    i59++;
                                                                } else {
                                                                    i19 = 1;
                                                                }
                                                                i57++;
                                                            }
                                                        }
                                                        if (i18 == 0 || ((!(nVar instanceof q) || ((q) nVar).g == 1) && i19 != 0)) {
                                                            if (i19 == 0 || i59 - i58 > 4) {
                                                                i59 = i58 + 1;
                                                            }
                                                            jVar2 = new j(nVar, i59);
                                                            if (jVar2 != null) {
                                                                cf.n nVar2 = jVar2.a;
                                                                int i60 = jVar2.b;
                                                                l lVar = new l(i60 - this.c);
                                                                if (aVar5 instanceof k) {
                                                                    cf.n nVar3 = ((k) aVar5).a;
                                                                    if ((((nVar3 instanceof cf.c) && (nVar2 instanceof cf.c)) ? Character.valueOf(((cf.c) nVar3).g).equals(Character.valueOf(((cf.c) nVar2).g)) : ((nVar3 instanceof q) && (nVar2 instanceof q)) ? Character.valueOf(((q) nVar3).h).equals(Character.valueOf(((q) nVar2).h)) : i10) != 0) {
                                                                        ef.a[] aVarArr9 = new ef.a[1];
                                                                        aVarArr9[i10] = lVar;
                                                                        bVar2 = new t8.b(aVarArr9);
                                                                        bVar2.b = i60;
                                                                        bVar = bVar2;
                                                                    }
                                                                }
                                                                k kVar = new k(nVar2);
                                                                ef.a[] aVarArr10 = new ef.a[2];
                                                                aVarArr10[i10] = kVar;
                                                                aVarArr10[1] = lVar;
                                                                bVar2 = new t8.b(aVarArr10);
                                                                bVar2.b = i60;
                                                                bVar = bVar2;
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
                                                int length7 = charSequence7.length();
                                                int i61 = i53;
                                                int i62 = i10;
                                                while (true) {
                                                    i18 = i55;
                                                    if (i61 < length7) {
                                                        char charAt12 = charSequence7.charAt(i61);
                                                        aVar = aVar3;
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
                                                                    i62++;
                                                                    if (i62 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i61++;
                                                                        i55 = i18;
                                                                        aVar3 = aVar;
                                                                    }
                                                            }
                                                            if (jVar != null) {
                                                            }
                                                            jVar2 = null;
                                                            if (jVar2 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        aVar = aVar3;
                                                    }
                                                }
                                                jVar = null;
                                                if (jVar != null) {
                                                }
                                                jVar2 = null;
                                                if (jVar2 != null) {
                                                }
                                            }
                                            i11 = 4;
                                            break;
                                        } else {
                                            aVar = aVar3;
                                        }
                                        bVar = null;
                                        i11 = 4;
                                        break;
                                    default:
                                        if (this.g < i25) {
                                            int i63 = this.e;
                                            CharSequence charSequence8 = this.a;
                                            int length8 = charSequence8.length();
                                            int i64 = i10;
                                            int i65 = i64;
                                            int i66 = i65;
                                            while (true) {
                                                if (i63 >= length8) {
                                                    int i67 = i65;
                                                    int i68 = i66;
                                                    if ((i64 >= 3 && i67 == 0 && i68 == 0) || ((i67 >= 3 && i64 == 0 && i68 == 0) || (i68 >= 3 && i64 == 0 && i67 == 0))) {
                                                        ef.a[] aVarArr11 = new ef.a[1];
                                                        aVarArr11[i10] = new c(1);
                                                        bVar = new t8.b(aVarArr11);
                                                        bVar.a = charSequence8.length();
                                                    }
                                                } else {
                                                    char charAt13 = charSequence8.charAt(i63);
                                                    if (charAt13 == '\t' || charAt13 == c10) {
                                                        i65 = i65;
                                                        i66 = i66;
                                                    } else if (charAt13 == '*') {
                                                        i66++;
                                                    } else if (charAt13 == '-') {
                                                        i64++;
                                                    } else if (charAt13 == '_') {
                                                        i65++;
                                                    }
                                                    i63++;
                                                    c10 = ' ';
                                                }
                                            }
                                        }
                                        bVar = null;
                                        aVar = aVar3;
                                        i11 = 4;
                                        break;
                                }
                                if (bVar == null) {
                                    i25 = i11;
                                    i20 = i10;
                                    aVar3 = aVar;
                                }
                            } else {
                                i10 = i20;
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
                            int i69 = bVar.a;
                            if (i69 != -1) {
                                k(i69);
                            } else {
                                int i70 = bVar.b;
                                if (i70 != -1) {
                                    j(i70);
                                }
                            }
                            if (bVar.c) {
                                ef.a h10 = h();
                                z10 = true;
                                a1.g.y(1, arrayList);
                                this.o.remove(h10);
                                if (h10 instanceof m) {
                                    b((m) h10);
                                }
                                h10.e().g();
                            } else {
                                z10 = true;
                            }
                            ef.a[] aVarArr12 = (ef.a[]) bVar.d;
                            int length9 = aVarArr12.length;
                            aVar3 = aVar;
                            for (int i71 = i10; i71 < length9; i71++) {
                                aVar3 = aVarArr12[i71];
                                a(aVar3);
                                z11 = aVar3.f();
                            }
                            i20 = i10;
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
