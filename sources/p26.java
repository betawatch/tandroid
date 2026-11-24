// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class p26 {
    public cr2 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public final void a() {
        boolean z = this.d;
        cr2 cr2Var = this.a;
        this.c = z ? cr2Var.f() : cr2Var.j();
    }

    public final void b(int i, View view) {
        cr2 cr2Var = this.a;
        int k = Integer.MIN_VALUE == cr2Var.a ? 0 : cr2Var.k() - cr2Var.a;
        if (k >= 0) {
            boolean z = this.d;
            cr2 cr2Var2 = this.a;
            if (z) {
                int a = cr2Var2.a(view);
                cr2 cr2Var3 = this.a;
                this.c = (Integer.MIN_VALUE != cr2Var3.a ? cr2Var3.k() - cr2Var3.a : 0) + a;
            } else {
                this.c = cr2Var2.d(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        cr2 cr2Var4 = this.a;
        if (!z2) {
            int d = cr2Var4.d(view);
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
        int f2 = (cr2Var4.f() - k) - this.a.a(view);
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
