// default package

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qz8 extends ViewOutlineProvider {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rz8 b;

    public /* synthetic */ qz8(rz8 rz8Var, byte b) {
        this.a = b;
        this.b = rz8Var;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        byte b = this.a;
        rz8 rz8Var = this.b;
        switch (b) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                outline.setRoundRect(Math.round(rz8Var.n - translationX), Math.round(rz8Var.r - translationY), Math.round(rz8Var.s - translationX), Math.round(rz8Var.w - translationY), rz8Var.x);
                break;
            default:
                int height = view.getHeight();
                outline.setRoundRect(rz8Var.b0, rz8Var.c0, view.getWidth() - rz8Var.b0, view.getHeight() - rz8Var.d0, ((height - r3) - rz8Var.d0) / 2.0f);
                break;
        }
    }
}
