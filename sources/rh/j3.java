package rh;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j3 {
    public final Runnable a;
    public i3 b;
    public i3 c;
    public i3 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final i3 h;
    public final i3 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.t5 m;
    public int n = -1;

    public j3(Runnable runnable, ArrayList arrayList, i3 i3Var, i3 i3Var2, float f7, int i10) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = i3Var;
        this.i = i3Var2;
        this.j = f7;
        this.k = i10;
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(runnable, 300L, gr.h);
        this.m = t5Var;
        t5Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i10;
        this.b = i3Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        i3 i3Var = this.h;
        if (i3Var != null) {
            i3Var.a();
        }
        i3 i3Var2 = this.i;
        if (i3Var2 != null) {
            i3Var2.a();
        }
    }

    public final boolean b(float f7) {
        return this.c == this.i && this.f + f7 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final i3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            i3 i3Var = this.i;
            if (i3Var.b()) {
                int i10 = this.l;
                if (i10 <= 0) {
                    return i3Var;
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
            if (i11 != this.n && ((i3) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((i3) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = org.telegram.messenger.i0.a;
        int intValue = ((Integer) (arrayList2.isEmpty() ? null : arrayList2.get(Math.abs(((int) Utilities.c.nextLong()) % arrayList2.size())))).intValue();
        this.n = intValue;
        return (i3) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f = i10 + 0.5f;
    }

    public final float f(boolean z10, float f7) {
        long j10;
        i3 i3Var;
        int i10 = this.l;
        int i11 = this.k;
        if (i10 >= i11) {
            j10 = 450;
        } else {
            j10 = i11 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.t5 t5Var = this.m;
        t5Var.g = j10;
        float T1 = (f7 * org.telegram.messenger.i0.T1(i11 == 3 ? 0.75f : 2.0f, 7.5f, t5Var.d(i10 >= i11)) * this.j) + this.f;
        this.f = T1;
        i3 i3Var2 = this.i;
        if (T1 >= 0.0f) {
            double d = T1;
            if (Math.floor(d) + 1.0d > this.e && (i3Var = this.c) != i3Var2) {
                this.b = i3Var;
                i3 i3Var3 = this.d;
                this.c = i3Var3;
                this.d = i3Var3 == i3Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == i3Var2 ? Math.min(T1, this.e + 0.5f) : T1;
    }
}
