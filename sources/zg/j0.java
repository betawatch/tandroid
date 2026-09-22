package zg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.u9;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class j0 extends u9 {
    public boolean G;
    public o5 H;
    public d I;
    public boolean J;
    public final /* synthetic */ l0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, Context context) {
        super(context);
        this.K = l0Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override // org.telegram.ui.Components.u9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        o5 o5Var = this.H;
        if (o5Var != null) {
            o5Var.a(this);
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    @Override // org.telegram.ui.Components.u9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        o5 o5Var = this.H;
        if (o5Var != null) {
            o5Var.o(this);
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override // org.telegram.ui.Components.u9, android.view.View
    public final void onDraw(Canvas canvas) {
        o5 o5Var = this.H;
        if (o5Var != null) {
            o5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.H.setAlpha(255);
            this.H.draw(canvas);
            this.G = true;
            return;
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.b(canvas);
            this.G = true;
            return;
        }
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().k0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().k0) {
            l0 l0Var = this.K;
            if (l0Var.a != 2 || l0Var.z) {
                getImageReceiver().getLottieAnimation().N(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            } else {
                getImageReceiver().getLottieAnimation().N(getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
        }
        super.onDraw(canvas);
    }
}
