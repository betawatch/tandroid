package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class k0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ k0(m0 m0Var, int i10) {
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
                outline.setRoundRect(m0Var2.a0, m0Var2.b0, view.getWidth() - m0Var2.a0, view.getHeight() - m0Var2.c0, ((height - r4) - m0Var2.c0) / 2.0f);
                break;
        }
    }
}
