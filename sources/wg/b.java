package wg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.s81;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class b extends View {
    public final i6 a;
    public float b;
    public ValueAnimator c;
    public int d;
    public final Paint e;

    public b(Context context) {
        super(context);
        this.b = 1.0f;
        i6 i6Var = new i6(false, false, true);
        this.a = i6Var;
        i6Var.n(0.3f, 250L, xq.h);
        i6Var.setCallback(this);
        i6Var.w(org.telegram.messenger.g0.L(11.5f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.u(-1);
        i6Var.t("", true, true);
        i6Var.b = 17;
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i7, boolean z9) {
        if (!s.i()) {
            i7 = 0;
        }
        if (i7 > 0) {
            setVisibility(0);
        }
        i6 i6Var = this.a;
        if (z9) {
            i6Var.a();
        }
        if (z9 && i7 != this.d && i7 > 0) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.addUpdateListener(new ti.d(this, 5));
            this.c.addListener(new s81(this, 23));
            org.telegram.messenger.camera.q.i(2.0f, this.c);
            this.c.setDuration(200L);
            this.c.start();
        }
        this.d = i7;
        int length = i6Var.i.length();
        i6Var.t("x" + i7, z9, true);
        int length2 = i6Var.i.length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        int L = org.telegram.messenger.g0.L(8.0f);
        i6 i6Var = this.a;
        rect.set(0, 0, L + ((int) i6Var.c()), org.telegram.messenger.g0.L(20.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        if (this.b != 1.0f) {
            canvas.save();
            float f10 = this.b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.g0.L(19.0f));
        i6Var.setBounds(rect);
        i6Var.draw(canvas);
        if (this.b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.a.e() + org.telegram.messenger.g0.L(15.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), TLObject.FLAG_30));
    }
}
