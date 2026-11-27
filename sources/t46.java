// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class t46 {
    public vr2 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public final void a() {
        boolean z = this.d;
        vr2 vr2Var = this.a;
        this.c = z ? vr2Var.f() : vr2Var.j();
    }

    public final void b(int i, View view) {
        vr2 vr2Var = this.a;
        int k = Integer.MIN_VALUE == vr2Var.a ? 0 : vr2Var.k() - vr2Var.a;
        if (k >= 0) {
            boolean z = this.d;
            vr2 vr2Var2 = this.a;
            if (z) {
                int a = vr2Var2.a(view);
                vr2 vr2Var3 = this.a;
                this.c = (Integer.MIN_VALUE != vr2Var3.a ? vr2Var3.k() - vr2Var3.a : 0) + a;
            } else {
                this.c = vr2Var2.d(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        vr2 vr2Var4 = this.a;
        if (!z2) {
            int d = vr2Var4.d(view);
            int j = d - this.a.j();
            this.c = d;
            if (j > 0) {
                int f = (this.a.f() - Math.min(0, (this.a.f() - k) - this.a.a(view))) - (this.a.b(view) + d);
                if (f < 0) {
                    this.c -= Math.min(j, -f);
                    return;
                }
                return;
            }
            return;
        }
        int f2 = (vr2Var4.f() - k) - this.a.a(view);
        this.c = this.a.f() - f2;
        if (f2 > 0) {
            int b = this.c - this.a.b(view);
            int j2 = this.a.j();
            int min = b - (Math.min(this.a.d(view) - j2, 0) + j2);
            if (min < 0) {
                this.c = Math.min(f2, -min) + this.c;
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = TLObject.FLAG_31;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
    }
}
