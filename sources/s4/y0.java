package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class y0 {
    public int a = -1;
    public RecyclerView b;
    public o0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final x0 g;
    public boolean h;

    public y0() {
        x0 x0Var = new x0();
        x0Var.d = -1;
        x0Var.f = false;
        x0Var.g = 0;
        x0Var.a = 0;
        x0Var.b = 0;
        x0Var.c = TLObject.FLAG_31;
        x0Var.e = null;
        this.g = x0Var;
    }

    public static void b(PointF pointF) {
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        o0 o0Var = this.c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
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
        x0 x0Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                z0 z0Var = recyclerView.t0;
                g(view2, x0Var);
                x0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            z0 z0Var2 = recyclerView.t0;
            d(i10, i11, x0Var);
            boolean z10 = x0Var.d >= 0;
            x0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.q0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, x0 x0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, x0 x0Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.t0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            o0 o0Var = this.c;
            if (o0Var.e == this) {
                o0Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
