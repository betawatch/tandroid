package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                outline.setRoundRect(f0Var2.a0, f0Var2.b0, view.getWidth() - f0Var2.a0, view.getHeight() - f0Var2.c0, ((height - r4) - f0Var2.c0) / 2.0f);
                break;
        }
    }
}
