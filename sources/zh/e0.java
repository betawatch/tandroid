package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class e0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ e0(f0 f0Var, int i10) {
        this.a = i10;
        this.b = f0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                f0 f0Var = this.b;
                outline.setRoundRect(Math.round(f0Var.n - translationX), Math.round(f0Var.r - translationY), Math.round(f0Var.s - translationX), Math.round(f0Var.v - translationY), f0Var.w);
                break;
            default:
                int height = view.getHeight();
                f0 f0Var2 = this.b;
                outline.setRoundRect(f0Var2.Y, f0Var2.Z, view.getWidth() - f0Var2.Y, view.getHeight() - f0Var2.a0, ((height - r4) - f0Var2.a0) / 2.0f);
                break;
        }
    }
}
