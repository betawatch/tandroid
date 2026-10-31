package yc;

import b2.r1;
import c3.i0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ve.r;
import w7.h9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i implements we.a {
    public static final Pattern j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern n = Pattern.compile("\\s+");
    public final m5.e a;
    public final BitSet b;
    public final HashMap c;
    public final HashMap d;
    public df.c e;
    public String f;
    public int g;
    public se.b h;
    public f6.f i;

    public i(m5.e eVar, List list, List list2) {
        k kVar;
        this.a = eVar;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            char d = hVar.d();
            List list3 = (List) hashMap.get(Character.valueOf(d));
            if (list3 == null) {
                list3 = new ArrayList(1);
                hashMap.put(Character.valueOf(d), list3);
            }
            list3.add(hVar);
        }
        this.c = hashMap;
        HashMap hashMap2 = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ye.a aVar = (ye.a) it2.next();
            char e = aVar.e();
            char b10 = aVar.b();
            if (e == b10) {
                ye.a aVar2 = (ye.a) hashMap2.get(Character.valueOf(e));
                if (aVar2 == null || aVar2.e() != aVar2.b()) {
                    b(e, aVar, hashMap2);
                } else {
                    if (aVar2 instanceof k) {
                        kVar = (k) aVar2;
                    } else {
                        k kVar2 = new k(e);
                        kVar2.f(aVar2);
                        kVar = kVar2;
                    }
                    kVar.f(aVar);
                    hashMap2.put(Character.valueOf(e), kVar);
                }
            } else {
                b(e, aVar, hashMap2);
                b(b10, aVar, hashMap2);
            }
        }
        this.d = hashMap2;
        Set keySet = this.c.keySet();
        Set keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        Iterator it3 = keySet.iterator();
        while (it3.hasNext()) {
            bitSet.set(((Character) it3.next()).charValue());
        }
        Iterator it4 = keySet2.iterator();
        while (it4.hasNext()) {
            bitSet.set(((Character) it4.next()).charValue());
        }
        this.b = bitSet;
    }

    public static void b(char c10, ye.a aVar, HashMap hashMap) {
        if (((ye.a) hashMap.put(Character.valueOf(c10), aVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0170  */
    @Override // we.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, df.c cVar) {
        df.c rVar;
        df.c cVar2;
        boolean z10;
        boolean z11;
        r1 r1Var;
        this.f = str.trim();
        this.g = 0;
        this.h = null;
        this.i = null;
        this.e = cVar;
        while (true) {
            char d = d();
            if (d == 0) {
                cVar2 = null;
            } else {
                List<h> list = (List) this.c.get(Character.valueOf(d));
                if (list != null) {
                    int i10 = this.g;
                    cVar2 = null;
                    for (h hVar : list) {
                        hVar.a = this;
                        hVar.b = this.e;
                        hVar.c = this.f;
                        hVar.d = this.g;
                        rVar = hVar.b();
                        this.g = hVar.d;
                        if (rVar != null) {
                            cVar2 = rVar;
                            break;
                        } else {
                            this.g = i10;
                            cVar2 = rVar;
                        }
                    }
                    if (cVar2 == null) {
                        this.g++;
                        cVar2 = new r(String.valueOf(d));
                    }
                } else {
                    ye.a aVar = (ye.a) this.d.get(Character.valueOf(d));
                    if (aVar != null) {
                        int i11 = this.g;
                        int i12 = 0;
                        while (d() == d) {
                            i12++;
                            this.g++;
                        }
                        if (i12 < aVar.d()) {
                            this.g = i11;
                            r1Var = null;
                        } else {
                            String substring = i11 == 0 ? "\n" : this.f.substring(i11 - 1, i11);
                            char d10 = d();
                            String valueOf = d10 != 0 ? String.valueOf(d10) : "\n";
                            Pattern pattern = j;
                            boolean matches = pattern.matcher(substring).matches();
                            Pattern pattern2 = l;
                            boolean matches2 = pattern2.matcher(substring).matches();
                            boolean matches3 = pattern.matcher(valueOf).matches();
                            boolean matches4 = pattern2.matcher(valueOf).matches();
                            boolean z12 = !matches4 && (!matches3 || matches2 || matches);
                            boolean z13 = !matches2 && (!matches || matches4 || matches3);
                            if (d == '_') {
                                z11 = z12 && (!z13 || matches);
                                z10 = z13 && (!z12 || matches3);
                            } else {
                                boolean z14 = z12 && d == aVar.e();
                                z10 = z13 && d == aVar.b();
                                z11 = z14;
                            }
                            this.g = i11;
                            r1Var = new r1(i12, z11, z10);
                        }
                        if (r1Var != null) {
                            int i13 = r1Var.a;
                            int i14 = this.g;
                            int i15 = i14 + i13;
                            this.g = i15;
                            r1 r1Var2 = r1Var;
                            r rVar2 = new r(this.f.substring(i14, i15));
                            boolean z15 = r1Var2.c;
                            boolean z16 = r1Var2.b;
                            se.b bVar = this.h;
                            se.b bVar2 = new se.b(rVar2, d, z15, z16, bVar);
                            this.h = bVar2;
                            bVar2.g = i13;
                            bVar2.h = i13;
                            if (bVar != null) {
                                bVar.f = bVar2;
                            }
                            cVar2 = rVar2;
                            if (cVar2 == null) {
                            }
                        }
                    } else {
                        int i16 = this.g;
                        int length = this.f.length();
                        while (true) {
                            int i17 = this.g;
                            if (i17 == length) {
                                break;
                            }
                            if (this.b.get(this.f.charAt(i17))) {
                                break;
                            } else {
                                this.g++;
                            }
                        }
                        int i18 = this.g;
                        if (i16 != i18) {
                            rVar = new r(this.f.substring(i16, i18));
                            cVar2 = rVar;
                            if (cVar2 == null) {
                            }
                        }
                    }
                    cVar2 = null;
                    if (cVar2 == null) {
                    }
                }
            }
            if (cVar2 == null) {
                break;
            } else {
                cVar.b(cVar2);
            }
        }
        e(null);
        df.c cVar3 = (df.c) cVar.c;
        df.c cVar4 = (df.c) cVar.d;
        if (cVar3 == cVar4) {
            return;
        }
        h9.b(cVar3, cVar4);
    }

    public final String c(Pattern pattern) {
        if (this.g >= this.f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f);
        matcher.region(this.g, this.f.length());
        if (!matcher.find()) {
            return null;
        }
        this.g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.g < this.f.length()) {
            return this.f.charAt(this.g);
        }
        return (char) 0;
    }

    public final void e(se.b bVar) {
        boolean z10;
        df.c cVar;
        HashMap hashMap = new HashMap();
        se.b bVar2 = this.h;
        while (bVar2 != null) {
            se.b bVar3 = bVar2.e;
            if (bVar3 == bVar) {
                break;
            } else {
                bVar2 = bVar3;
            }
        }
        while (bVar2 != null) {
            r rVar = bVar2.a;
            char c10 = bVar2.b;
            ye.a aVar = (ye.a) this.d.get(Character.valueOf(c10));
            if (!bVar2.d || aVar == null) {
                bVar2 = bVar2.f;
            } else {
                char e = aVar.e();
                se.b bVar4 = bVar2.e;
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
                    se.b bVar5 = bVar2.e;
                    while (bVar5 != null && bVar5 != bVar4) {
                        se.b bVar6 = bVar5.e;
                        f(bVar5);
                        bVar5 = bVar6;
                    }
                    if (rVar2 != rVar && (cVar = (df.c) rVar2.f) != rVar) {
                        h9.b(cVar, (df.c) rVar.e);
                    }
                    aVar.c(rVar2, rVar, i10);
                    if (bVar4.g == 0) {
                        bVar4.a.g();
                        f(bVar4);
                    }
                    if (bVar2.g == 0) {
                        se.b bVar7 = bVar2.f;
                        rVar.g();
                        f(bVar2);
                        bVar2 = bVar7;
                    }
                } else {
                    if (!z10) {
                        hashMap.put(Character.valueOf(c10), bVar2.e);
                        if (!bVar2.c) {
                            f(bVar2);
                        }
                    }
                    bVar2 = bVar2.f;
                }
            }
        }
        while (true) {
            se.b bVar8 = this.h;
            if (bVar8 == null || bVar8 == bVar) {
                return;
            } else {
                f(bVar8);
            }
        }
    }

    public final void f(se.b bVar) {
        se.b bVar2 = bVar.e;
        if (bVar2 != null) {
            bVar2.f = bVar.f;
        }
        se.b bVar3 = bVar.f;
        if (bVar3 == null) {
            this.h = bVar2;
        } else {
            bVar3.e = bVar2;
        }
    }
}
