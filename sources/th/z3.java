package th;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z3 extends f3 {
    public final /* synthetic */ o7 N;
    public final /* synthetic */ f4 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Context context, f4 f4Var, o7 o7Var) {
        super(context);
        this.O = f4Var;
        this.N = o7Var;
        this.x = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new d3(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.b.o(-16777216, zs.q2)});
    }

    @Override // th.f3
    public final void b(int i10) {
        k7 k7Var;
        f4 f4Var = this.O;
        a4 a4Var = f4Var.E;
        if (f4Var.x) {
            return;
        }
        if (a4Var.getCurrentItem() != i10) {
            try {
                a4Var.x(i10, false);
            } catch (Throwable th2) {
                f8.g(th2, true);
                a4Var.getAdapter().g();
                a4Var.x(i10, false);
            }
        }
        o7 o7Var = this.N;
        if (o7Var.O0 == null || (k7Var = o7Var.t0) == null) {
            return;
        }
        if (i10 < 10) {
            k7Var.c(false);
        } else if (i10 >= this.E.size() - 10) {
            o7Var.t0.c(true);
        }
    }
}
