package ug;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.j6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class o0 extends j6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ p0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, Context context, int i7) {
        super(context, true, true, true);
        this.s = i7;
        this.w = p0Var;
    }

    @Override // org.telegram.ui.Components.j6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                p0 p0Var = this.w;
                if (p0Var.O > 0.0f) {
                    if (p0Var.N == null) {
                        p0Var.N = new cp(p0Var.f.getTextColor());
                    }
                    int L = (int) ((1.0f - p0Var.O) * org.telegram.messenger.g0.L(24.0f));
                    p0Var.N.setBounds(0, L, getWidth(), getHeight() + L);
                    p0Var.N.setAlpha((int) (p0Var.O * 255.0f));
                    p0Var.N.draw(canvas);
                    invalidate();
                }
                float f10 = p0Var.O;
                if (f10 < 1.0f) {
                    if (f10 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var.O * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var.O * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                p0 p0Var2 = this.w;
                if (p0Var2.O > 0.0f) {
                    if (p0Var2.N == null) {
                        p0Var2.N = new cp(p0Var2.f.getTextColor());
                    }
                    int L2 = (int) ((1.0f - p0Var2.O) * org.telegram.messenger.g0.L(24.0f));
                    p0Var2.N.setBounds(0, L2, getWidth(), getHeight() + L2);
                    p0Var2.N.setAlpha((int) (p0Var2.O * 255.0f));
                    p0Var2.N.draw(canvas);
                    invalidate();
                }
                float f11 = p0Var2.O;
                if (f11 < 1.0f) {
                    if (f11 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var2.O * org.telegram.messenger.g0.L(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var2.O * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
