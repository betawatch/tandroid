// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yg8 extends hn {
    public final /* synthetic */ byte s;
    public final /* synthetic */ ah8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg8(ah8 ah8Var, Context context, byte b) {
        super(context, true, true, true);
        this.s = b;
        this.w = ah8Var;
    }

    @Override // hn, android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.s;
        ah8 ah8Var = this.w;
        switch (b) {
            case 0:
                if (ah8Var.P > 0.0f) {
                    if (ah8Var.O == null) {
                        ah8Var.O = new ih2(ah8Var.f.getTextColor());
                    }
                    int L = (int) ((1.0f - ah8Var.P) * gl.L(24.0f));
                    ah8Var.O.setBounds(0, L, getWidth(), getHeight() + L);
                    ah8Var.O.setAlpha((int) (ah8Var.P * 255.0f));
                    ah8Var.O.draw(canvas);
                    invalidate();
                }
                float f = ah8Var.P;
                if (f < 1.0f) {
                    if (f == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (ah8Var.P * gl.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (ah8Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                if (ah8Var.P > 0.0f) {
                    if (ah8Var.O == null) {
                        ah8Var.O = new ih2(ah8Var.f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - ah8Var.P) * gl.L(24.0f));
                    ah8Var.O.setBounds(0, L2, getWidth(), getHeight() + L2);
                    ah8Var.O.setAlpha((int) (ah8Var.P * 255.0f));
                    ah8Var.O.draw(canvas);
                    invalidate();
                }
                float f2 = ah8Var.P;
                if (f2 < 1.0f) {
                    if (f2 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (ah8Var.P * gl.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (ah8Var.P * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
