package se;

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
import org.telegram.messenger.zs;
import r2.y;
import ve.p;
import ve.q;
import ve.s;
import w7.e8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(ve.b.class, ve.i.class, ve.h.class, ve.j.class, s.class, ve.n.class, ve.l.class));
    public static final Map q;
    public CharSequence a;
    public boolean d;
    public boolean h;
    public final List i;
    public final we.b j;
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
        hashMap.put(ve.b.class, new re.a(1));
        hashMap.put(ve.i.class, new re.a(3));
        hashMap.put(ve.h.class, new re.a(2));
        hashMap.put(ve.j.class, new re.a(4));
        hashMap.put(s.class, new re.a(7));
        hashMap.put(ve.n.class, new re.a(6));
        hashMap.put(ve.l.class, new re.a(5));
        q = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(ArrayList arrayList, we.b bVar, ArrayList arrayList2) {
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

    public final void a(xe.a aVar) {
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
            ve.m mVar2 = (ve.m) obj;
            q qVar = mVar.a;
            mVar2.g();
            df.c cVar = (df.c) qVar.e;
            mVar2.e = cVar;
            if (cVar != null) {
                cVar.f = mVar2;
            }
            mVar2.f = qVar;
            qVar.e = mVar2;
            df.c cVar2 = (df.c) qVar.b;
            mVar2.b = cVar2;
            if (((df.c) mVar2.e) == null) {
                cVar2.c = mVar2;
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

    public final void e(xe.a aVar) {
        if (h() == aVar) {
            a1.g.x(1, this.n);
        }
        if (aVar instanceof m) {
            b((m) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((xe.a) list.get(size));
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

    public final xe.a h() {
        return (xe.a) i0.a.g(1, this.n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x01fa, code lost:
    
        if (r12 < 1) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01fc, code lost:
    
        r6 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0202, code lost:
    
        if (r6 >= r14.length()) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0204, code lost:
    
        r8 = r14.charAt(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x020a, code lost:
    
        if (r8 == '\t') goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x020e, code lost:
    
        if (r8 == ' ') goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0211, code lost:
    
        r8 = r14.subSequence(r5, r15).toString();
        r12 = new ve.p();
        r12.g = java.lang.Integer.parseInt(r8);
        r12.h = r4;
        r4 = new se.j(r12, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0645, code lost:
    
        if (r6 == 0) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x06e5, code lost:
    
        k(r22.e);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:175:0x01e7. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0533  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(String str) {
        xe.a aVar;
        int i10;
        nh.n nVar;
        boolean z10;
        int i11;
        int i12;
        char charAt;
        int i13;
        e eVar;
        nh.n nVar2;
        f fVar;
        int i14;
        StringBuilder U;
        int i15;
        j jVar;
        char charAt2;
        j jVar2;
        int i16;
        int i17;
        String str2 = str;
        int length = str2.length();
        int i18 = 0;
        StringBuilder sb2 = null;
        for (int i19 = 0; i19 < length; i19++) {
            char charAt3 = str2.charAt(i19);
            if (charAt3 == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) str2, 0, i19);
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
        int i20 = 1;
        for (xe.a aVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            q3.h h = aVar2.h(this);
            if (h == null) {
                break;
            }
            if (h.c) {
                e(aVar2);
                return;
            }
            int i21 = h.a;
            if (i21 != -1) {
                k(i21);
            } else {
                int i22 = h.b;
                if (i22 != -1) {
                    j(i22);
                }
            }
            i20++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i20, arrayList.size()));
        xe.a aVar3 = (xe.a) arrayList.get(i20 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z11 = (aVar3.e() instanceof q) || aVar3.f();
        while (true) {
            if (z11) {
                g();
                if (!this.h) {
                    int i23 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.a, this.e))) {
                        y yVar = new y(aVar3, 6);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i10 = i18;
                                char c10 = ' ';
                                switch (((re.a) it.next()).a) {
                                    case 0:
                                        aVar = aVar3;
                                        CharSequence charSequence = this.a;
                                        StringBuilder U2 = yVar.U();
                                        if (U2 != null && U2.toString().contains("|") && !U2.toString().contains("\n")) {
                                            CharSequence subSequence = charSequence.subSequence(this.b, charSequence.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            int i24 = i10;
                                            int i25 = i24;
                                            int i26 = i25;
                                            while (true) {
                                                if (i25 >= subSequence.length()) {
                                                    break;
                                                } else {
                                                    char charAt4 = subSequence.charAt(i25);
                                                    if (charAt4 == '\t' || charAt4 == ' ') {
                                                        i25++;
                                                    } else if (charAt4 == '-' || charAt4 == ':') {
                                                        if (i26 != 0 || arrayList3.isEmpty()) {
                                                            if (charAt4 == ':') {
                                                                i25++;
                                                                i11 = 1;
                                                            } else {
                                                                i11 = i10;
                                                            }
                                                            int i27 = i10;
                                                            while (i25 < subSequence.length() && subSequence.charAt(i25) == '-') {
                                                                i25++;
                                                                i27 = 1;
                                                            }
                                                            if (i27 != 0) {
                                                                if (i25 >= subSequence.length() || subSequence.charAt(i25) != ':') {
                                                                    i12 = i10;
                                                                } else {
                                                                    i25++;
                                                                    i12 = 1;
                                                                }
                                                                arrayList3.add((i11 == 0 || i12 == 0) ? i11 != 0 ? qe.c.a : i12 != 0 ? qe.c.c : null : qe.c.b);
                                                                i26 = i10;
                                                            }
                                                        }
                                                    } else if (charAt4 == '|') {
                                                        i25++;
                                                        i26++;
                                                        if (i26 <= 1) {
                                                            i24 = 1;
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList3 = null;
                                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                                ArrayList i28 = re.b.i(U2);
                                                if (arrayList3.size() >= i28.size()) {
                                                    re.b bVar = new re.b(arrayList3, i28);
                                                    xe.a[] aVarArr = new xe.a[1];
                                                    aVarArr[i10] = bVar;
                                                    nh.n nVar3 = new nh.n(aVarArr);
                                                    nVar3.a = this.b;
                                                    nVar3.c = true;
                                                    nVar = nVar3;
                                                    break;
                                                }
                                            }
                                        }
                                        nVar = null;
                                        break;
                                    case 1:
                                        aVar = aVar3;
                                        int i29 = this.e;
                                        if (a.i(this, i29)) {
                                            int i30 = this.c + this.g;
                                            int i31 = i30 + 1;
                                            CharSequence charSequence2 = this.a;
                                            int i32 = i29 + 1;
                                            if (i32 < charSequence2.length() && ((charAt = charSequence2.charAt(i32)) == '\t' || charAt == ' ')) {
                                                i31 = i30 + 2;
                                            }
                                            xe.a[] aVarArr2 = new xe.a[1];
                                            aVarArr2[i10] = new a();
                                            nVar = new nh.n(aVarArr2);
                                            nVar.b = i31;
                                            break;
                                        }
                                        nVar = null;
                                        break;
                                    case 2:
                                        aVar = aVar3;
                                        int i33 = this.g;
                                        if (i33 < 4) {
                                            int i34 = this.e;
                                            CharSequence charSequence3 = this.a;
                                            int length2 = charSequence3.length();
                                            int i35 = i34;
                                            int i36 = i10;
                                            int i37 = i36;
                                            while (true) {
                                                i13 = i34;
                                                if (i35 < length2) {
                                                    char charAt5 = charSequence3.charAt(i35);
                                                    if (charAt5 == '`') {
                                                        i36++;
                                                    } else if (charAt5 == '~') {
                                                        i37++;
                                                    }
                                                    i35++;
                                                    i34 = i13;
                                                }
                                            }
                                            int i38 = 3;
                                            if (i36 >= 3) {
                                                if (i37 == 0) {
                                                    int i39 = i13 + i36;
                                                    int length3 = charSequence3.length();
                                                    while (true) {
                                                        if (i39 >= length3) {
                                                            i39 = -1;
                                                        } else if (charSequence3.charAt(i39) != '`') {
                                                            i39++;
                                                        }
                                                    }
                                                    if (i39 == -1) {
                                                        eVar = new e('`', i36, i33);
                                                        if (eVar != null) {
                                                            xe.a[] aVarArr3 = new xe.a[1];
                                                            aVarArr3[i10] = eVar;
                                                            nVar2 = new nh.n(aVarArr3);
                                                            nVar2.a = i13 + eVar.a.h;
                                                            nVar = nVar2;
                                                            break;
                                                        }
                                                    }
                                                    eVar = null;
                                                    if (eVar != null) {
                                                    }
                                                } else {
                                                    i38 = 3;
                                                }
                                            }
                                            if (i37 >= i38 && i36 == 0) {
                                                eVar = new e('~', i37, i33);
                                                if (eVar != null) {
                                                }
                                            }
                                            eVar = null;
                                            if (eVar != null) {
                                            }
                                        }
                                        nVar = null;
                                        break;
                                    case 3:
                                        aVar = aVar3;
                                        if (this.g < 4) {
                                            CharSequence charSequence4 = this.a;
                                            int i40 = this.e;
                                            int b10 = e8.b('#', charSequence4, i40, charSequence4.length()) - i40;
                                            if (b10 != 0 && b10 <= 6) {
                                                int i41 = i40 + b10;
                                                if (i41 >= charSequence4.length()) {
                                                    fVar = new f(b10, "");
                                                } else {
                                                    char charAt6 = charSequence4.charAt(i41);
                                                    char c11 = ' ';
                                                    char c12 = '\t';
                                                    if (charAt6 == ' ' || charAt6 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 < i41) {
                                                                length4 = i41 - 1;
                                                            } else {
                                                                char charAt7 = charSequence4.charAt(length4);
                                                                if (charAt7 == c12 || charAt7 == c11) {
                                                                    length4--;
                                                                    c12 = '\t';
                                                                    c11 = ' ';
                                                                }
                                                            }
                                                        }
                                                        int i42 = length4;
                                                        while (true) {
                                                            if (i42 < i41) {
                                                                i42 = i41 - 1;
                                                            } else if (charSequence4.charAt(i42) == '#') {
                                                                i42--;
                                                            }
                                                        }
                                                        int i43 = i42;
                                                        while (true) {
                                                            if (i43 < i41) {
                                                                i43 = i41 - 1;
                                                            } else {
                                                                char charAt8 = charSequence4.charAt(i43);
                                                                if (charAt8 == '\t' || charAt8 == ' ') {
                                                                    i43--;
                                                                }
                                                            }
                                                        }
                                                        fVar = i43 != i42 ? new f(b10, charSequence4.subSequence(i41, i43 + 1).toString()) : new f(b10, charSequence4.subSequence(i41, length4 + 1).toString());
                                                    }
                                                }
                                                if (fVar == null) {
                                                    xe.a[] aVarArr4 = new xe.a[1];
                                                    aVarArr4[i10] = fVar;
                                                    nVar2 = new nh.n(aVarArr4);
                                                    nVar2.a = charSequence4.length();
                                                } else {
                                                    char charAt9 = charSequence4.charAt(i40);
                                                    if (charAt9 != '-') {
                                                        if (charAt9 == '=') {
                                                            if (e8.c(e8.b('=', charSequence4, i40 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                                i14 = 1;
                                                                if (i14 > 0 && (U = yVar.U()) != null) {
                                                                    f fVar2 = new f(i14, U.toString());
                                                                    xe.a[] aVarArr5 = new xe.a[1];
                                                                    aVarArr5[i10] = fVar2;
                                                                    nVar2 = new nh.n(aVarArr5);
                                                                    nVar2.a = charSequence4.length();
                                                                    nVar2.c = true;
                                                                }
                                                            }
                                                        }
                                                        i14 = i10;
                                                        if (i14 > 0) {
                                                            f fVar22 = new f(i14, U.toString());
                                                            xe.a[] aVarArr52 = new xe.a[1];
                                                            aVarArr52[i10] = fVar22;
                                                            nVar2 = new nh.n(aVarArr52);
                                                            nVar2.a = charSequence4.length();
                                                            nVar2.c = true;
                                                        }
                                                    }
                                                    if (e8.c(e8.b('-', charSequence4, i40 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                        i14 = 2;
                                                        if (i14 > 0) {
                                                        }
                                                    }
                                                    i14 = i10;
                                                    if (i14 > 0) {
                                                    }
                                                }
                                                nVar = nVar2;
                                                break;
                                            }
                                            fVar = null;
                                            if (fVar == null) {
                                            }
                                            nVar = nVar2;
                                        }
                                        nVar = null;
                                        break;
                                    case 4:
                                        aVar = aVar3;
                                        int i44 = i23;
                                        int i45 = this.e;
                                        CharSequence charSequence5 = this.a;
                                        if (this.g < i44 && charSequence5.charAt(i45) == '<') {
                                            for (int i46 = 1; i46 <= 7; i46++) {
                                                if (i46 != 7 || !(((xe.a) yVar.b).e() instanceof q)) {
                                                    Pattern[] patternArr = g.e[i46];
                                                    Pattern pattern = patternArr[i10];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence5.subSequence(i45, charSequence5.length())).find()) {
                                                        xe.a[] aVarArr6 = new xe.a[1];
                                                        aVarArr6[i10] = new g(pattern2);
                                                        nVar = new nh.n(aVarArr6);
                                                        nVar.a = this.b;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        nVar = null;
                                        break;
                                    case 5:
                                        aVar = aVar3;
                                        if (this.g >= 4) {
                                            if (!this.h && !(h().e() instanceof q)) {
                                                xe.a[] aVarArr7 = new xe.a[1];
                                                aVarArr7[i10] = new f();
                                                nVar = new nh.n(aVarArr7);
                                                nVar.b = this.c + 4;
                                                break;
                                            }
                                        }
                                        nVar = null;
                                        break;
                                    case 6:
                                        xe.a aVar4 = (xe.a) yVar.b;
                                        int i47 = this.g;
                                        if (i47 >= 4) {
                                            aVar = aVar3;
                                        } else {
                                            int i48 = this.e;
                                            int i49 = this.c + i47;
                                            int i50 = yVar.U() != null ? 1 : i10;
                                            CharSequence charSequence6 = this.a;
                                            char charAt10 = charSequence6.charAt(i48);
                                            if (charAt10 == '*' || charAt10 == '+' || charAt10 == '-') {
                                                i15 = i50;
                                                aVar = aVar3;
                                                int i51 = i48 + 1;
                                                if (i51 >= charSequence6.length() || (charAt2 = charSequence6.charAt(i51)) == '\t' || charAt2 == ' ') {
                                                    ve.c cVar = new ve.c();
                                                    cVar.g = charAt10;
                                                    jVar = new j(cVar, i51);
                                                    if (jVar != null) {
                                                        ve.n nVar4 = jVar.a;
                                                        int i52 = jVar.b;
                                                        int i53 = (i52 - i48) + i49;
                                                        int length5 = charSequence6.length();
                                                        int i54 = i53;
                                                        while (true) {
                                                            if (i52 >= length5) {
                                                                i16 = i10;
                                                            } else {
                                                                char charAt11 = charSequence6.charAt(i52);
                                                                if (charAt11 == '\t') {
                                                                    i54 = (4 - (i54 % 4)) + i54;
                                                                } else if (charAt11 == ' ') {
                                                                    i54++;
                                                                } else {
                                                                    i16 = 1;
                                                                }
                                                                i52++;
                                                            }
                                                        }
                                                        if (i15 == 0 || ((!(nVar4 instanceof p) || ((p) nVar4).g == 1) && i16 != 0)) {
                                                            if (i16 == 0 || i54 - i53 > 4) {
                                                                i54 = i53 + 1;
                                                            }
                                                            jVar2 = new j(nVar4, i54);
                                                            if (jVar2 != null) {
                                                                ve.n nVar5 = jVar2.a;
                                                                int i55 = jVar2.b;
                                                                l lVar = new l(i55 - this.c);
                                                                if (aVar4 instanceof k) {
                                                                    ve.n nVar6 = ((k) aVar4).a;
                                                                    if ((((nVar6 instanceof ve.c) && (nVar5 instanceof ve.c)) ? Character.valueOf(((ve.c) nVar6).g).equals(Character.valueOf(((ve.c) nVar5).g)) : ((nVar6 instanceof p) && (nVar5 instanceof p)) ? Character.valueOf(((p) nVar6).h).equals(Character.valueOf(((p) nVar5).h)) : i10) != 0) {
                                                                        xe.a[] aVarArr8 = new xe.a[1];
                                                                        aVarArr8[i10] = lVar;
                                                                        nVar2 = new nh.n(aVarArr8);
                                                                        nVar2.b = i55;
                                                                        nVar = nVar2;
                                                                        break;
                                                                    }
                                                                }
                                                                k kVar = new k(nVar5);
                                                                xe.a[] aVarArr9 = new xe.a[2];
                                                                aVarArr9[i10] = kVar;
                                                                aVarArr9[1] = lVar;
                                                                nVar = new nh.n(aVarArr9);
                                                                nVar.b = i55;
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
                                                int i56 = i48;
                                                int i57 = i10;
                                                while (true) {
                                                    i15 = i50;
                                                    if (i56 < length6) {
                                                        char charAt12 = charSequence6.charAt(i56);
                                                        aVar = aVar3;
                                                        if (charAt12 != ')' && charAt12 != '.') {
                                                            switch (charAt12) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case zs.o0 /* 51 */:
                                                                case zs.p0 /* 52 */:
                                                                case zs.q0 /* 53 */:
                                                                case zs.r0 /* 54 */:
                                                                case zs.s0 /* 55 */:
                                                                case zs.t0 /* 56 */:
                                                                case zs.u0 /* 57 */:
                                                                    i57++;
                                                                    if (i57 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i56++;
                                                                        i50 = i15;
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
                                        }
                                        nVar = null;
                                        break;
                                    case 7:
                                        if (this.g < 4) {
                                            int i58 = this.e;
                                            CharSequence charSequence7 = this.a;
                                            int length7 = charSequence7.length();
                                            int i59 = i10;
                                            int i60 = i59;
                                            int i61 = i60;
                                            while (true) {
                                                if (i58 >= length7) {
                                                    int i62 = i60;
                                                    int i63 = i61;
                                                    if ((i59 >= 3 && i62 == 0 && i63 == 0) || ((i62 >= 3 && i59 == 0 && i63 == 0) || (i63 >= 3 && i59 == 0 && i62 == 0))) {
                                                        xe.a[] aVarArr10 = new xe.a[1];
                                                        aVarArr10[i10] = new c(1);
                                                        nVar = new nh.n(aVarArr10);
                                                        nVar.a = charSequence7.length();
                                                    }
                                                } else {
                                                    char charAt13 = charSequence7.charAt(i58);
                                                    if (charAt13 == '\t' || charAt13 == c10) {
                                                        i60 = i60;
                                                        i61 = i61;
                                                    } else if (charAt13 == '*') {
                                                        i61++;
                                                    } else if (charAt13 == '-') {
                                                        i59++;
                                                    } else if (charAt13 == '_') {
                                                        i60++;
                                                    }
                                                    i58++;
                                                    c10 = ' ';
                                                }
                                            }
                                        }
                                        nVar = null;
                                        aVar = aVar3;
                                        break;
                                    default:
                                        if (this.g < i23) {
                                            int i64 = this.e;
                                            CharSequence charSequence8 = this.a;
                                            int length8 = charSequence8.length();
                                            int i65 = i64;
                                            while (true) {
                                                if (i65 >= length8) {
                                                    i17 = length8 - i64;
                                                } else if ('$' != charSequence8.charAt(i65)) {
                                                    i17 = i65 - i64;
                                                } else {
                                                    i65++;
                                                }
                                            }
                                            if (i17 >= 2 && e8.b(' ', charSequence8, i64 + i17, length8) == length8) {
                                                xe.a[] aVarArr11 = new xe.a[1];
                                                aVarArr11[i10] = new tc.b(i17);
                                                nVar = new nh.n(aVarArr11);
                                                nVar.a = length8 + 1;
                                                aVar = aVar3;
                                                break;
                                            }
                                        }
                                        nVar = null;
                                        aVar = aVar3;
                                        break;
                                }
                                if (nVar == null) {
                                    i18 = i10;
                                    aVar3 = aVar;
                                    i23 = 4;
                                }
                            } else {
                                i10 = i18;
                                aVar = aVar3;
                                nVar = null;
                            }
                        }
                        if (nVar == null) {
                            k(this.e);
                        } else {
                            if (!isEmpty) {
                                f(arrayList2);
                                isEmpty = true;
                            }
                            int i66 = nVar.a;
                            if (i66 != -1) {
                                k(i66);
                            } else {
                                int i67 = nVar.b;
                                if (i67 != -1) {
                                    j(i67);
                                }
                            }
                            if (nVar.c) {
                                xe.a h10 = h();
                                z10 = true;
                                a1.g.x(1, arrayList);
                                this.o.remove(h10);
                                if (h10 instanceof m) {
                                    b((m) h10);
                                }
                                h10.e().g();
                            } else {
                                z10 = true;
                            }
                            xe.a[] aVarArr12 = (xe.a[]) nVar.d;
                            int length9 = aVarArr12.length;
                            aVar3 = aVar;
                            for (int i68 = i10; i68 < length9; i68++) {
                                aVar3 = aVarArr12[i68];
                                a(aVar3);
                                z11 = aVar3.f();
                            }
                            i18 = i10;
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
