package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class a3 {
    public final Runnable a;
    public z2 b;
    public z2 c;
    public z2 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final z2 h;
    public final z2 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.g6 m;
    public int n = -1;

    public a3(Runnable runnable, ArrayList arrayList, z2 z2Var, z2 z2Var2, float f7, int i10) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = z2Var;
        this.i = z2Var2;
        this.j = f7;
        this.k = i10;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(runnable, 300L, es.h);
        this.m = g6Var;
        g6Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i10;
        this.b = z2Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        z2 z2Var = this.h;
        if (z2Var != null) {
            z2Var.a();
        }
        z2 z2Var2 = this.i;
        if (z2Var2 != null) {
            z2Var2.a();
        }
    }

    public final boolean b(float f7) {
        return this.c == this.i && this.f + f7 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final z2 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            z2 z2Var = this.i;
            if (z2Var.b()) {
                int i10 = this.l;
                if (i10 <= 0) {
                    return z2Var;
                }
                this.l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.n && ((z2) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((z2) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.n = intValue;
        return (z2) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        long j10;
        z2 z2Var;
        int i10 = this.l;
        int i11 = this.k;
        if (i10 >= i11) {
            j10 = 450;
        } else {
            j10 = i11 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.g6 g6Var = this.m;
        g6Var.g = j10;
        float lerp = (f7 * AndroidUtilities.lerp(i11 == 3 ? 0.75f : 2.0f, 7.5f, g6Var.e(i10 >= i11)) * this.j) + this.f;
        this.f = lerp;
        z2 z2Var2 = this.i;
        if (lerp >= 0.0f) {
            double d = lerp;
            if (Math.floor(d) + 1.0d > this.e && (z2Var = this.c) != z2Var2) {
                this.b = z2Var;
                z2 z2Var3 = this.d;
                this.c = z2Var3;
                this.d = z2Var3 == z2Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == z2Var2 ? Math.min(lerp, this.e + 0.5f) : lerp;
    }
}
