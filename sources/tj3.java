// default package

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tj3 extends FrameLayout {
    public static final /* synthetic */ int M = 0;
    public i69 E;
    public boolean F;
    public ji3 G;
    public gk3 H;
    public boolean I;
    public final th3 J;
    public final th3 K;
    public final /* synthetic */ uj3 L;
    public qj3 a;
    public lp b;
    public uh3 c;
    public yh3 d;
    public lu5 e;
    public sj3 f;
    public int h;
    public xh3 n;
    public hw6 r;
    public int s;
    public byte w;
    public tk4 x;
    public sh3 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj3(uj3 uj3Var, Context context) {
        super(context);
        this.L = uj3Var;
        this.J = new th3(this, (byte) 1);
        this.K = new th3(this, (byte) 2);
    }

    public final boolean a() {
        int i = this.s;
        return i == 0 || i == 7 || i == 8;
    }

    public final void b(boolean z) {
        boolean z2;
        z2 = ((e) this.L).isPaused;
        if (z2) {
            return;
        }
        th3 th3Var = this.K;
        if (z) {
            hl.r(th3Var);
            this.a.setItemAnimator(this.y);
            th3Var.run();
        } else {
            if (this.I) {
                return;
            }
            this.I = true;
            if (!this.y.k()) {
                this.a.setItemAnimator(null);
            }
            hl.d3(th3Var, 36L);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ((FrameLayout.LayoutParams) this.a.getLayoutParams()).bottomMargin = 0;
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        vy4 vy4Var;
        tj3 tj3Var;
        if (getTranslationX() != f) {
            super.setTranslationX(f);
            uj3 uj3Var = this.L;
            if (uj3Var.j3 && (tj3Var = uj3Var.f0[0]) == this) {
                uj3Var.A0.j(Math.abs(tj3Var.getTranslationX()) / uj3Var.f0[0].getMeasuredWidth(), uj3Var.f0[1].h);
            }
            vy4Var = ((e) uj3Var).glassEngine;
            vy4Var.g();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        vy4 vy4Var;
        if (getTranslationY() != f) {
            vy4Var = ((e) this.L).glassEngine;
            vy4Var.g();
        }
        super.setTranslationY(f);
    }
}
