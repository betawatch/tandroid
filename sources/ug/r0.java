package ug;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.sp;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class r0 extends n6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ s0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, Context context, int i7) {
        super(context, true, true, true);
        this.s = i7;
        this.w = s0Var;
    }

    @Override // org.telegram.ui.Components.n6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                s0 s0Var = this.w;
                if (s0Var.P > 0.0f) {
                    if (s0Var.O == null) {
                        s0Var.O = new sp(s0Var.f.getTextColor());
                    }
                    int L = (int) ((1.0f - s0Var.P) * org.telegram.messenger.g0.L(24.0f));
                    s0Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    s0Var.O.setAlpha((int) (s0Var.P * 255.0f));
                    s0Var.O.draw(canvas);
                    invalidate();
                }
                float f10 = s0Var.P;
                if (f10 < 1.0f) {
                    if (f10 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (s0Var.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (s0Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                s0 s0Var2 = this.w;
                if (s0Var2.P > 0.0f) {
                    if (s0Var2.O == null) {
                        s0Var2.O = new sp(s0Var2.f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - s0Var2.P) * org.telegram.messenger.g0.L(24.0f));
                    s0Var2.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    s0Var2.O.setAlpha((int) (s0Var2.P * 255.0f));
                    s0Var2.O.draw(canvas);
                    invalidate();
                }
                float f11 = s0Var2.P;
                if (f11 < 1.0f) {
                    if (f11 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (s0Var2.P * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (s0Var2.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
