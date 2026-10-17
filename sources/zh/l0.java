package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class l0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ l0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                m0 m0Var = this.b;
                outline.setRoundRect(Math.round(m0Var.n - translationX), Math.round(m0Var.r - translationY), Math.round(m0Var.s - translationX), Math.round(m0Var.v - translationY), m0Var.w);
                break;
            default:
                int height = view.getHeight();
                m0 m0Var2 = this.b;
                outline.setRoundRect(m0Var2.T, m0Var2.U, view.getWidth() - m0Var2.T, view.getHeight() - m0Var2.V, ((height - r4) - m0Var2.V) / 2.0f);
                break;
        }
    }
}
