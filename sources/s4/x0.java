package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class x0 {
    public int a = -1;
    public RecyclerView b;
    public n0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final w0 g;
    public boolean h;

    public x0() {
        w0 w0Var = new w0();
        w0Var.d = -1;
        w0Var.f = false;
        w0Var.g = 0;
        w0Var.a = 0;
        w0Var.b = 0;
        w0Var.c = TLObject.FLAG_31;
        w0Var.e = null;
        this.g = w0Var;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        n0 n0Var = this.c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f == null && this.c != null && (a2 = a(this.a)) != null) {
            float f7 = a2.x;
            if (f7 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        w0 w0Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                y0 y0Var = recyclerView.u0;
                g(view2, w0Var);
                w0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            y0 y0Var2 = recyclerView.u0;
            d(i10, i11, w0Var);
            boolean z10 = w0Var.d >= 0;
            w0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.r0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, w0 w0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, w0 w0Var);

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
