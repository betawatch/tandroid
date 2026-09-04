package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class f3 {
    public final Runnable a;
    public e3 b;
    public e3 c;
    public e3 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final e3 h;
    public final e3 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.e6 m;
    public int n = -1;

    public f3(Runnable runnable, ArrayList arrayList, e3 e3Var, e3 e3Var2, float f7, int i10) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = e3Var;
        this.i = e3Var2;
        this.j = f7;
        this.k = i10;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(runnable, 300L, pr.h);
        this.m = e6Var;
        e6Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i10;
        this.b = e3Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.a();
        }
        e3 e3Var2 = this.i;
        if (e3Var2 != null) {
            e3Var2.a();
        }
    }

    public final boolean b(float f7) {
        return this.c == this.i && this.f + f7 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final e3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            e3 e3Var = this.i;
            if (e3Var.b()) {
                int i10 = this.l;
                if (i10 <= 0) {
                    return e3Var;
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
            if (i11 != this.n && ((e3) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((e3) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.n = intValue;
        return (e3) arrayList.get(intValue);
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
        long j3;
        e3 e3Var;
        int i10 = this.l;
        int i11 = this.k;
        if (i10 >= i11) {
            j3 = 450;
        } else {
            j3 = i11 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.e6 e6Var = this.m;
        e6Var.g = j3;
        float lerp = (f7 * AndroidUtilities.lerp(i11 == 3 ? 0.75f : 2.0f, 7.5f, e6Var.e(i10 >= i11)) * this.j) + this.f;
        this.f = lerp;
        e3 e3Var2 = this.i;
        if (lerp >= 0.0f) {
            double d = lerp;
            if (Math.floor(d) + 1.0d > this.e && (e3Var = this.c) != e3Var2) {
                this.b = e3Var;
                e3 e3Var3 = this.d;
                this.c = e3Var3;
                this.d = e3Var3 == e3Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == e3Var2 ? Math.min(lerp, this.e + 0.5f) : lerp;
    }
}
