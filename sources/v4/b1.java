package v4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class b1 {
    public int a = -1;
    public RecyclerView b;
    public p0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final a1 g;
    public boolean h;

    public b1() {
        a1 a1Var = new a1();
        a1Var.d = -1;
        a1Var.f = false;
        a1Var.g = 0;
        a1Var.a = 0;
        a1Var.b = 0;
        a1Var.c = TLObject.FLAG_31;
        a1Var.e = null;
        this.g = a1Var;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i7) {
        p0 p0Var = this.c;
        if (p0Var instanceof c0) {
            return ((c0) p0Var).E0(i7);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + c0.class.getCanonicalName());
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
        a1 a1Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                c1 c1Var = recyclerView.v0;
                g(view2, a1Var);
                a1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            c1 c1Var2 = recyclerView.v0;
            d(i7, i10, a1Var);
            boolean z10 = a1Var.d >= 0;
            a1Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.s0.a();
            }
        }
    }

    public abstract void d(int i7, int i10, a1 a1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, a1 a1Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.v0.a = -1;
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
