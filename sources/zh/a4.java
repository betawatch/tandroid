package zh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a4 extends g3 {
    public final /* synthetic */ u7 N;
    public final /* synthetic */ g4 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Context context, g4 g4Var, u7 u7Var) {
        super(context);
        this.O = g4Var;
        this.N = u7Var;
        this.w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new rg.c(1, this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override // zh.g3
    public final void b(int i10) {
        q7 q7Var;
        g4 g4Var = this.O;
        b4 b4Var = g4Var.E;
        if (g4Var.w) {
            return;
        }
        if (b4Var.getCurrentItem() != i10) {
            try {
                b4Var.x(i10, false);
            } catch (Throwable th2) {
                FileLog.e(th2);
                b4Var.getAdapter().g();
                b4Var.x(i10, false);
            }
        }
        u7 u7Var = this.N;
        if (u7Var.O0 == null || (q7Var = u7Var.t0) == null) {
            return;
        }
        if (i10 < 10) {
            q7Var.b(false);
        } else if (i10 >= this.E.size() - 10) {
            u7Var.t0.b(true);
        }
    }
}
