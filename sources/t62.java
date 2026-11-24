// default package

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t62 extends jb8 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ w62 b;

    public t62(w62 w62Var) {
        this.b = w62Var;
    }

    @Override // jb8, pb8
    public final void D() {
        w62 w62Var = this.b;
        w62Var.c();
        w62Var.i(w62Var.Q.Q, false);
    }

    @Override // jb8, pb8
    public final int E(int i, rcc rccVar) {
        if (i < 0 || i >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((jo6) this.a.get(i)).C);
        w62 w62Var = this.b;
        int indexOf = w62Var.h.indexOf(valueOf);
        ArrayList arrayList = w62Var.h;
        if (indexOf < 0) {
            arrayList.add(valueOf);
            w62Var.c();
            return w62Var.h.size() - 1;
        }
        if (arrayList.size() <= 1) {
            return -1;
        }
        w62Var.h.remove(indexOf);
        w62Var.c();
        return indexOf;
    }

    @Override // jb8, pb8
    public final int H() {
        return this.b.h.size();
    }

    @Override // jb8, pb8
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        jo6 jo6Var;
        ArrayList arrayList;
        w62 w62Var = this.b;
        ArrayList arrayList2 = w62Var.b;
        x62 x62Var = w62Var.Q;
        if (i >= 0 && i < this.a.size() && w(i) && (jo6Var = (jo6) this.a.get(i)) != null) {
            int size = arrayList2.size();
            v62 v62Var = null;
            u62 u62Var = null;
            for (int i2 = 0; i2 < size; i2++) {
                v62Var = (v62) arrayList2.get(i2);
                if (v62Var != null && (arrayList = v62Var.h) != null) {
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        u62 u62Var2 = (u62) arrayList.get(i3);
                        if (u62Var2 != null && u62Var2.b == jo6Var && u62Var2.k > 0.5d) {
                            u62Var = (u62) arrayList.get(i3);
                            break;
                        }
                        i3++;
                    }
                    if (u62Var != null) {
                        break;
                    }
                }
            }
            if (v62Var != null && u62Var != null) {
                qb8 qb8Var = new qb8();
                int[] iArr = new int[2];
                w62Var.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - x62Var.b.Q();
                }
                qb8Var.b = iArr[0];
                qb8Var.c = iArr[1] + ((int) v62Var.a);
                qb8Var.k = 1.0f;
                qb8Var.d = w62Var;
                ImageReceiver imageReceiver = u62Var.c;
                qb8Var.a = imageReceiver;
                qb8Var.e = imageReceiver.p();
                qb8Var.h = new int[]{(int) r7.left, (int) r7.top, (int) r7.right, (int) r7.bottom};
                RectF rectF = u62Var.q;
                qb8Var.j = (int) (-w62Var.getY());
                qb8Var.i = w62Var.getHeight() - ((int) (((-w62Var.getY()) + x62Var.r.getHeight()) - x62Var.b.T0()));
                return qb8Var;
            }
        }
        return null;
    }

    @Override // jb8, pb8
    public final int S(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((jo6) obj).C);
        w62 w62Var = this.b;
        if (w62Var.h.size() <= 1 || (indexOf = w62Var.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        w62Var.h.remove(indexOf);
        w62Var.c();
        return indexOf;
    }

    @Override // jb8, pb8
    public final int T(int i) {
        jo6 jo6Var;
        if (i < 0 || i >= this.a.size() || (jo6Var = (jo6) this.a.get(i)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(jo6Var.C));
    }

    @Override // jb8, pb8
    public final void Y(int i) {
        jo6 jo6Var;
        ArrayList arrayList;
        boolean z;
        w62 w62Var = this.b;
        ArrayList arrayList2 = w62Var.b;
        if (i < 0 || i >= this.a.size() || (jo6Var = (jo6) this.a.get(i)) == null) {
            return;
        }
        int i2 = jo6Var.C;
        w62Var.invalidate();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            v62 v62Var = (v62) arrayList2.get(i3);
            if (v62Var != null && (arrayList = v62Var.h) != null) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    u62 u62Var = (u62) arrayList.get(i4);
                    if (u62Var != null && u62Var.b.C == i2) {
                        u62Var.f(jo6Var);
                    }
                }
                r62 r62Var = v62Var.k;
                if (r62Var == null || ((ArrayList) r62Var.f) == null) {
                    z = false;
                } else {
                    z = false;
                    for (int i5 = 0; i5 < ((ArrayList) v62Var.k.f).size(); i5++) {
                        if (((jo6) ((ArrayList) v62Var.k.f).get(i5)).C == i2) {
                            ((ArrayList) v62Var.k.f).set(i5, jo6Var);
                            z = true;
                        }
                    }
                }
                if (z) {
                    v62Var.b(v62Var.k, true);
                }
            }
        }
        w62Var.g();
        w62Var.invalidate();
    }

    @Override // jb8, pb8
    public final ArrayList d() {
        return this.b.h;
    }

    @Override // jb8, pb8
    public final boolean t() {
        return false;
    }

    @Override // jb8, pb8
    public final HashMap u() {
        return this.b.d;
    }

    @Override // jb8, pb8
    public final boolean w(int i) {
        if (i < 0 || i >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((jo6) this.a.get(i)).C));
    }
}
