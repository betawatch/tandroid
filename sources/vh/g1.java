package vh;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.mb0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g1 extends h1 implements vs {
    public final mb0 b;
    public final e1 c;
    public final p1 d;
    public final f1 e;
    public final d1 f;
    public final ArrayList h;
    public final ArrayList n;
    public final /* synthetic */ u1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(u1 u1Var, Context context) {
        super(context);
        this.r = u1Var;
        this.f = new d1();
        this.h = new ArrayList();
        this.n = new ArrayList();
        mb0 mb0Var = new mb0(this, context, 5);
        this.b = mb0Var;
        e1 e1Var = new e1(this);
        this.c = e1Var;
        mb0Var.setAdapter(e1Var);
        f1 f1Var = new f1(this);
        this.e = f1Var;
        mb0Var.setLayoutManager(f1Var);
        mb0Var.i(new mg.u1(this, 9));
        mb0Var.setClipToPadding(true);
        mb0Var.setVerticalScrollBarEnabled(false);
        ag.y0 y0Var = new ag.y0(this, 19);
        mb0Var.setOnTouchListener(new org.telegram.ui.ActionBar.d1(7, this, y0Var));
        mb0Var.setOnItemClickListener(y0Var);
        mb0Var.setOnScrollListener(new cu0(this, 24));
        addView(mb0Var, w7.b6.d(-1, -1.0f, at.E1, 0.0f, 58.0f, 0.0f, 40.0f));
        int i10 = u1.y1;
        p1 p1Var = new p1(context, u1Var.I0);
        this.d = p1Var;
        p1Var.x = new qh.d(this, 16);
        p1Var.a(2, false);
        addView(p1Var, w7.b6.e(-1, -2, 48));
    }

    @Override // vh.h1
    public final void a(int i10) {
        e1 e1Var = this.c;
        e1.E(e1Var, false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.i1)) {
            e1Var.G();
        }
        e1Var.H(null);
    }

    @Override // vh.h1
    public final float b() {
        int i10 = 0;
        while (true) {
            mb0 mb0Var = this.b;
            if (i10 >= mb0Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = mb0Var.getChildAt(i10).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return Math.max(0, r2.getBottom());
            }
            i10++;
        }
    }

    @Override // vh.h1
    public final void c() {
        this.d.setTranslationY(org.telegram.messenger.i0.L(10.0f) + Math.max(0.0f, b()));
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.X0) {
            e1.E(this.c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = u1.y1;
        at.f(this.r.a).c(this, at.X0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = u1.y1;
        at.f(this.r.a).n(this, at.X0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = u1.y1;
        int i13 = this.r.t0;
        setPadding(i13, 0, i13, org.telegram.messenger.i0.n);
        super.onMeasure(i10, i11);
    }
}
