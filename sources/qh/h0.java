package qh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h0 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ h0(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                i0 i0Var = this.b;
                outline.setRoundRect(Math.round(i0Var.n - translationX), Math.round(i0Var.r - translationY), Math.round(i0Var.s - translationX), Math.round(i0Var.w - translationY), i0Var.x);
                break;
            default:
                int height = view.getHeight();
                i0 i0Var2 = this.b;
                outline.setRoundRect(i0Var2.a0, i0Var2.b0, view.getWidth() - i0Var2.a0, view.getHeight() - i0Var2.c0, ((height - r4) - i0Var2.c0) / 2.0f);
                break;
        }
    }
}
