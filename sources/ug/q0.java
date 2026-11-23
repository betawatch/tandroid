package ug;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.up;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class q0 extends o6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ r0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, Context context, int i7) {
        super(context, true, true, true);
        this.s = i7;
        this.w = r0Var;
    }

    @Override // org.telegram.ui.Components.o6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                r0 r0Var = this.w;
                if (r0Var.P > 0.0f) {
                    if (r0Var.O == null) {
                        r0Var.O = new up(r0Var.f.getTextColor());
                    }
                    int L = (int) ((1.0f - r0Var.P) * org.telegram.messenger.g0.L(24.0f));
                    r0Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    r0Var.O.setAlpha((int) (r0Var.P * 255.0f));
                    r0Var.O.draw(canvas);
                    invalidate();
                }
                float f10 = r0Var.P;
                if (f10 < 1.0f) {
                    if (f10 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (r0Var.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (r0Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                r0 r0Var2 = this.w;
                if (r0Var2.P > 0.0f) {
                    if (r0Var2.O == null) {
                        r0Var2.O = new up(r0Var2.f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - r0Var2.P) * org.telegram.messenger.g0.L(24.0f));
                    r0Var2.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    r0Var2.O.setAlpha((int) (r0Var2.P * 255.0f));
                    r0Var2.O.draw(canvas);
                    invalidate();
                }
                float f11 = r0Var2.P;
                if (f11 < 1.0f) {
                    if (f11 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (r0Var2.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (r0Var2.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
