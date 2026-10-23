package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class l0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ l0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                n0 n0Var = this.b;
                outline.setRoundRect(Math.round(n0Var.n - translationX), Math.round(n0Var.r - translationY), Math.round(n0Var.s - translationX), Math.round(n0Var.v - translationY), n0Var.w);
                break;
            default:
                int height = view.getHeight();
                n0 n0Var2 = this.b;
                outline.setRoundRect(n0Var2.a0, n0Var2.b0, view.getWidth() - n0Var2.a0, view.getHeight() - n0Var2.c0, ((height - r4) - n0Var2.c0) / 2.0f);
                break;
        }
    }
}
