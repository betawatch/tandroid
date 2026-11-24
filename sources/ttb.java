// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ttb extends FrameLayout {
    public final /* synthetic */ byte a;
    public float b;
    public boolean c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ttb(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = 1.0f;
        switch (this.a) {
            case 0:
                float f2 = ((1.0f - this.b) * 0.2f) + 0.8f;
                canvas.save();
                canvas.scale(f2, f2, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
                super.dispatchDraw(canvas);
                canvas.restore();
                if (isPressed()) {
                    float f3 = this.b;
                    if (f3 != 1.0f) {
                        this.b = Utilities.i(f3 + 0.16f, 1.0f, 0.0f);
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.dispatchDraw(canvas);
                boolean z = this.c;
                float f4 = this.b;
                if (z) {
                    float f5 = f4 + 0.013333334f;
                    this.b = f5;
                    if (f5 > 1.0f) {
                        this.c = false;
                        this.b = 1.0f;
                    } else {
                        f = f5;
                    }
                } else {
                    f = f4 - 0.013333334f;
                    this.b = f;
                    if (f < 0.0f) {
                        this.c = true;
                        this.b = 0.0f;
                        f = 0.0f;
                    }
                }
                ((TextView) this.d).setTranslationX(s33.f.getInterpolation(f) * gl.L(8.0f) * (k96.a0 ? -1 : 1));
                invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        switch (this.a) {
            case 0:
                super.setPressed(z);
                if (this.c != z) {
                    this.c = z;
                    invalidate();
                    if (z && (valueAnimator = (ValueAnimator) this.d) != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) this.d).cancel();
                    }
                    if (!z) {
                        float f = this.b;
                        if (f != 0.0f) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                            this.d = ofFloat;
                            ofFloat.addUpdateListener(new gja(this, (byte) 26));
                            ((ValueAnimator) this.d).addListener(new iab(this, (byte) 5));
                            b00.n(5.0f, (ValueAnimator) this.d);
                            ((ValueAnimator) this.d).setDuration(350L);
                            ((ValueAnimator) this.d).start();
                            break;
                        }
                    }
                }
                break;
            default:
                super.setPressed(z);
                break;
        }
    }
}
