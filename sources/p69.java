// default package

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class p69 extends p79 implements yi5 {
    public final qcc a;
    public final d79 b;
    public final int c;
    public final boolean d;

    public p69(d79 d79Var, qcc qccVar, int i, boolean z) {
        this.b = d79Var;
        this.a = qccVar;
        this.c = i;
        this.d = z;
    }

    @Override // yi5
    public final void a(qeb qebVar, RectF rectF) {
        qebVar.b = true;
    }

    @Override // p79
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        int b;
        if (((Boolean) this.a.a(view)).booleanValue()) {
            int i = this.c;
            rect.right = i;
            rect.left = i;
            f89 U = recyclerView.U(view);
            j79 adapter = recyclerView.getAdapter();
            if (U == null || adapter == null || (b = U.b()) == -1) {
                return;
            }
            boolean z = b == 0;
            boolean z2 = b == adapter.b() - 1;
            if (z) {
                rect.top = this.d ? i : hl.L(4.0f);
            }
            if (z2) {
                rect.bottom = i;
            }
        }
    }

    @Override // p79
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (recyclerView instanceof d79) {
            ((d79) recyclerView).R0(canvas);
        }
    }

    @Override // yi5
    public final void g(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        this.b.R0(canvas);
        canvas.restore();
    }
}
