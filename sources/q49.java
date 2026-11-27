// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class q49 extends de0 {
    public boolean H;
    public wl I;
    public yl J;
    public boolean K;
    public final /* synthetic */ s49 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q49(s49 s49Var, Context context) {
        super(context);
        this.L = s49Var;
        getImageReceiver().T(3);
    }

    @Override // de0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        wl wlVar = this.I;
        if (wlVar != null) {
            wlVar.b(this);
        }
        yl ylVar = this.J;
        if (ylVar != null) {
            ylVar.f(this);
        }
    }

    @Override // de0, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        wl wlVar = this.I;
        if (wlVar != null) {
            wlVar.o(this);
        }
        yl ylVar = this.J;
        if (ylVar != null) {
            ylVar.d(this);
        }
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        wl wlVar = this.I;
        if (wlVar != null) {
            wlVar.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.setAlpha(jn7.d4);
            this.I.draw(canvas);
            this.H = true;
            return;
        }
        yl ylVar = this.J;
        if (ylVar != null) {
            ylVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.b(canvas);
            this.H = true;
            return;
        }
        if (getImageReceiver().y() != null && getImageReceiver().y().l0) {
            this.H = true;
        }
        if (!this.H && getImageReceiver().y() != null && !getImageReceiver().y().l0) {
            s49 s49Var = this.L;
            if (s49Var.a != 2 || s49Var.z) {
                getImageReceiver().y().I(0, false, false);
                getImageReceiver().y().start();
            } else {
                getImageReceiver().y().I(getImageReceiver().y().e[0] - 1, false, false);
            }
        }
        super.onDraw(canvas);
    }
}
