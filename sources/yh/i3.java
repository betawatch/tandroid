package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class i3 {
    public final Runnable a;
    public h3 b;
    public h3 c;
    public h3 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final h3 h;
    public final h3 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.c6 m;
    public int n = -1;

    public i3(Runnable runnable, ArrayList arrayList, h3 h3Var, h3 h3Var2, float f7, int i10) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = h3Var;
        this.i = h3Var2;
        this.j = f7;
        this.k = i10;
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(runnable, 300L, qr.h);
        this.m = c6Var;
        c6Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i10;
        this.b = h3Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        h3 h3Var = this.h;
        if (h3Var != null) {
            h3Var.a();
        }
        h3 h3Var2 = this.i;
        if (h3Var2 != null) {
            h3Var2.a();
        }
    }

    public final boolean b(float f7) {
        return this.c == this.i && this.f + f7 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final h3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            h3 h3Var = this.i;
            if (h3Var.b()) {
                int i10 = this.l;
                if (i10 <= 0) {
                    return h3Var;
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
            if (i11 != this.n && ((h3) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((h3) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.n = intValue;
        return (h3) arrayList.get(intValue);
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
        h3 h3Var;
        int i10 = this.l;
        int i11 = this.k;
        if (i10 >= i11) {
            j3 = 450;
        } else {
            j3 = i11 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.c6 c6Var = this.m;
        c6Var.g = j3;
        float lerp = (f7 * AndroidUtilities.lerp(i11 == 3 ? 0.75f : 2.0f, 7.5f, c6Var.e(i10 >= i11)) * this.j) + this.f;
        this.f = lerp;
        h3 h3Var2 = this.i;
        if (lerp >= 0.0f) {
            double d = lerp;
            if (Math.floor(d) + 1.0d > this.e && (h3Var = this.c) != h3Var2) {
                this.b = h3Var;
                h3 h3Var3 = this.d;
                this.c = h3Var3;
                this.d = h3Var3 == h3Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == h3Var2 ? Math.min(lerp, this.e + 0.5f) : lerp;
    }
}
