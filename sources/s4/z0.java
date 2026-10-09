package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class z0 {
    public int a = -1;
    public RecyclerView b;
    public p0 c;
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
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        p0 p0Var = this.c;
        if (p0Var instanceof d0) {
            return ((d0) p0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + d0.class.getCanonicalName());
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
            d(i10, i11, y0Var);
            boolean z10 = y0Var.d >= 0;
            y0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.r0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, y0 y0Var);

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
            p0 p0Var = this.c;
            if (p0Var.e == this) {
                p0Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
