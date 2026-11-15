package v4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class a1 {
    public int a = -1;
    public RecyclerView b;
    public o0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final z0 g;
    public boolean h;

    public a1() {
        z0 z0Var = new z0();
        z0Var.d = -1;
        z0Var.f = false;
        z0Var.g = 0;
        z0Var.a = 0;
        z0Var.b = 0;
        z0Var.c = TLObject.FLAG_31;
        z0Var.e = null;
        this.g = z0Var;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i7) {
        o0 o0Var = this.c;
        if (o0Var instanceof b0) {
            return ((b0) o0Var).E0(i7);
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
        z0 z0Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                b1 b1Var = recyclerView.v0;
                g(view2, z0Var);
                z0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            b1 b1Var2 = recyclerView.v0;
            d(i7, i10, z0Var);
            boolean z10 = z0Var.d >= 0;
            z0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.s0.a();
            }
        }
    }

    public abstract void d(int i7, int i10, z0 z0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, z0 z0Var);

    public final void h() {
        if (this.e) {
            this.e = false;
            f();
            this.b.v0.a = -1;
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
