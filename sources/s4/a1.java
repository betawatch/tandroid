package s4;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class a1 {
    public int a = -1;
    public RecyclerView b;
    public p0 c;
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
        float f7 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        p0 p0Var = this.c;
        if (p0Var instanceof c0) {
            return ((c0) p0Var).E0(i10);
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
                recyclerView.u0((int) Math.signum(f7), (int) Math.signum(a2.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        z0 z0Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                b1 b1Var = recyclerView.u0;
                g(view2, z0Var);
                z0Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            b1 b1Var2 = recyclerView.u0;
            d(i10, i11, z0Var);
            boolean z10 = z0Var.d >= 0;
            z0Var.a(recyclerView);
            if (z10 && this.e) {
                this.d = true;
                recyclerView.r0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, z0 z0Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, z0 z0Var);

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
