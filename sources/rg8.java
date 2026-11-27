// default package

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class rg8 extends asb {
    public static final /* synthetic */ int n = 0;
    public final int e;
    public final pka f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final asb[] k;
    public final Object[] l;
    public final HashMap m;

    public rg8(asb[] asbVarArr, Object[] objArr, pka pkaVar) {
        this.f = pkaVar;
        this.e = pkaVar.c();
        int length = asbVarArr.length;
        this.k = asbVarArr;
        this.i = new int[length];
        this.j = new int[length];
        this.l = objArr;
        this.m = new HashMap();
        int length2 = asbVarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            asb asbVar = asbVarArr[i];
            this.k[i4] = asbVar;
            this.j[i4] = i2;
            this.i[i4] = i3;
            i2 += asbVar.o();
            i3 += this.k[i4].h();
            this.m.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.g = i2;
        this.h = i3;
    }

    @Override // asb
    public final int a(boolean z) {
        if (this.e != 0) {
            int i = 0;
            if (z) {
                int[] iArr = this.f.b;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            while (x(i).p()) {
                i = w(i, z);
                if (i == -1) {
                }
            }
            return x(i).a(z) + v(i);
        }
        return -1;
    }

    @Override // asb
    public final int b(Object obj) {
        int b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q = q(obj2);
        if (q == -1 || (b = x(q).b(obj3)) == -1) {
            return -1;
        }
        return u(q) + b;
    }

    @Override // asb
    public final int c(boolean z) {
        int i;
        int i2 = this.e;
        if (i2 != 0) {
            pka pkaVar = this.f;
            if (z) {
                int[] iArr = pkaVar.b;
                i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                i = i2 - 1;
            }
            while (x(i).p()) {
                i = z ? pkaVar.d(i) : i > 0 ? i - 1 : -1;
                if (i == -1) {
                }
            }
            return x(i).c(z) + v(i);
        }
        return -1;
    }

    @Override // asb
    public final int e(int i, int i2, boolean z) {
        int s = s(i);
        int v = v(s);
        int e = x(s).e(i - v, i2 == 2 ? 0 : i2, z);
        if (e != -1) {
            return v + e;
        }
        int w = w(s, z);
        while (w != -1) {
            if (!x(w).p()) {
                return x(w).a(z) + v(w);
            }
            w = w(w, z);
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // asb
    public final xrb f(int i, xrb xrbVar, boolean z) {
        int r = r(i);
        int v = v(r);
        x(r).f(i - u(r), xrbVar, z);
        xrbVar.c += v;
        if (z) {
            Object t = t(r);
            Object obj = xrbVar.b;
            obj.getClass();
            xrbVar.b = Pair.create(t, obj);
        }
        return xrbVar;
    }

    @Override // asb
    public final xrb g(Object obj, xrb xrbVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q = q(obj2);
        int v = v(q);
        x(q).g(obj3, xrbVar);
        xrbVar.c += v;
        xrbVar.b = obj;
        return xrbVar;
    }

    @Override // asb
    public final int h() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0025, code lost:
    
        if (r0 > 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0028, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0028, code lost:
    
        r0 = -1;
     */
    @Override // asb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i, int i2, boolean z) {
        int i3;
        int s = s(i);
        int v = v(s);
        int k = x(s).k(i - v, i2 == 2 ? 0 : i2, z);
        if (k != -1) {
            return v + k;
        }
        pka pkaVar = this.f;
        if (z) {
            i3 = pkaVar.d(s);
        }
        while (i3 != -1) {
            if (!x(i3).p()) {
                return x(i3).c(z) + v(i3);
            }
            i3 = z ? pkaVar.d(i3) : i3 > 0 ? i3 - 1 : -1;
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // asb
    public final Object l(int i) {
        int r = r(i);
        return Pair.create(t(r), x(r).l(i - u(r)));
    }

    @Override // asb
    public final zrb m(int i, zrb zrbVar, long j) {
        int s = s(i);
        int v = v(s);
        int u = u(s);
        x(s).m(i - v, zrbVar, j);
        Object t = t(s);
        Object obj = zrb.p;
        Object obj2 = zrbVar.a;
        if (obj != obj2) {
            t = Pair.create(t, obj2);
        }
        zrbVar.a = t;
        zrbVar.m += u;
        zrbVar.n += u;
        return zrbVar;
    }

    @Override // asb
    public final int o() {
        return this.g;
    }

    public final int q(Object obj) {
        Integer num = (Integer) this.m.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int r(int i) {
        return gcc.e(this.i, i + 1, false, false);
    }

    public final int s(int i) {
        return gcc.e(this.j, i + 1, false, false);
    }

    public final Object t(int i) {
        return this.l[i];
    }

    public final int u(int i) {
        return this.i[i];
    }

    public final int v(int i) {
        return this.j[i];
    }

    public final int w(int i, boolean z) {
        if (!z) {
            if (i < this.e - 1) {
                return i + 1;
            }
            return -1;
        }
        pka pkaVar = this.f;
        int i2 = pkaVar.c[i] + 1;
        int[] iArr = pkaVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final asb x(int i) {
        return this.k[i];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rg8(ArrayList arrayList, pka pkaVar) {
        this(r0, r1, pkaVar);
        asb[] asbVarArr = new asb[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            asbVarArr[i2] = ((a07) obj).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            objArr[i] = ((a07) obj2).a();
            i++;
        }
    }
}
