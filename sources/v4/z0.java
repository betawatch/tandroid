package v4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class z0 {
    public int a = -1;
    public RecyclerView b;
    public n0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final y0 g;
    public boolean h;

    public z0() {
        y0 y0Var = new y0();
        y0Var.d = -1;
        y0Var.f = false;
        y0Var.g = 0;
        y0Var.a = 0;
        y0Var.b = 0;
        y0Var.c = TLObject.FLAG_31;
        y0Var.e = null;
        this.g = y0Var;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i7) {
        n0 n0Var = this.c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i7);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i7, int i10) {
        PointF a10;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f == null && this.c != null && (a10 = a(this.a)) != null) {
            float f10 = a10.x;
            if (f10 != 0.0f || a10.y != 0.0f) {
                recyclerView.u0((int) Math.signum(f10), (int) Math.signum(a10.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        y0 y0Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                a1 a1Var = recyclerView.u0;
                g(view2, y0Var);
                y0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            a1 a1Var2 = recyclerView.u0;
            d(i7, i10, y0Var);
            boolean z9 = y0Var.d >= 0;
            y0Var.a(recyclerView);
            if (z9 && this.e) {
                this.d = true;
                recyclerView.r0.a();
            }
        }
    }

    public abstract void d(int i7, int i10, y0 y0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, y0 y0Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.u0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            n0 n0Var = this.c;
            if (n0Var.e == this) {
                n0Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
