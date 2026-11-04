package vg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.h6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n0 extends h6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ o0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(o0 o0Var, Context context, int i3) {
        super(context, true, true, true);
        this.s = i3;
        this.w = o0Var;
    }

    @Override // org.telegram.ui.Components.h6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                o0 o0Var = this.w;
                if (o0Var.P > 0.0f) {
                    if (o0Var.O == null) {
                        o0Var.O = new cp(o0Var.f.getTextColor());
                    }
                    int L = (int) ((1.0f - o0Var.P) * org.telegram.messenger.g0.L(24.0f));
                    o0Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    o0Var.O.setAlpha((int) (o0Var.P * 255.0f));
                    o0Var.O.draw(canvas);
                    invalidate();
                }
                float f10 = o0Var.P;
                if (f10 < 1.0f) {
                    if (f10 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (o0Var.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (o0Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                o0 o0Var2 = this.w;
                if (o0Var2.P > 0.0f) {
                    if (o0Var2.O == null) {
                        o0Var2.O = new cp(o0Var2.f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - o0Var2.P) * org.telegram.messenger.g0.L(24.0f));
                    o0Var2.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    o0Var2.O.setAlpha((int) (o0Var2.P * 255.0f));
                    o0Var2.O.draw(canvas);
                    invalidate();
                }
                float f11 = o0Var2.P;
                if (f11 < 1.0f) {
                    if (f11 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (o0Var2.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (o0Var2.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
