package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class b3 {
    public final Runnable a;
    public a3 b;
    public a3 c;
    public a3 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final a3 h;
    public final a3 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.g6 m;
    public int n = -1;

    public b3(Runnable runnable, ArrayList arrayList, a3 a3Var, a3 a3Var2, float f7, int i10) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = a3Var;
        this.i = a3Var2;
        this.j = f7;
        this.k = i10;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(runnable, 300L, hs.h);
        this.m = g6Var;
        g6Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i10;
        this.b = a3Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        a3 a3Var = this.h;
        if (a3Var != null) {
            a3Var.a();
        }
        a3 a3Var2 = this.i;
        if (a3Var2 != null) {
            a3Var2.a();
        }
    }

    public final boolean b(float f7) {
        return this.c == this.i && this.f + f7 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final a3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            a3 a3Var = this.i;
            if (a3Var.b()) {
                int i10 = this.l;
                if (i10 <= 0) {
                    return a3Var;
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
            if (i11 != this.n && ((a3) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((a3) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.n = intValue;
        return (a3) arrayList.get(intValue);
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
        a3 a3Var;
        int i10 = this.l;
        int i11 = this.k;
        if (i10 >= i11) {
            j3 = 450;
        } else {
            j3 = i11 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.g6 g6Var = this.m;
        g6Var.g = j3;
        float lerp = (f7 * AndroidUtilities.lerp(i11 == 3 ? 0.75f : 2.0f, 7.5f, g6Var.e(i10 >= i11)) * this.j) + this.f;
        this.f = lerp;
        a3 a3Var2 = this.i;
        if (lerp >= 0.0f) {
            double d = lerp;
            if (Math.floor(d) + 1.0d > this.e && (a3Var = this.c) != a3Var2) {
                this.b = a3Var;
                a3 a3Var3 = this.d;
                this.c = a3Var3;
                this.d = a3Var3 == a3Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == a3Var2 ? Math.min(lerp, this.e + 0.5f) : lerp;
    }
}
