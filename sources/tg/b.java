package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class b extends View {
    public final o6 a;
    public float b;
    public ValueAnimator c;
    public int d;
    public final Paint e;

    public b(Context context) {
        super(context);
        this.b = 1.0f;
        o6 o6Var = new o6(false, false, true, false);
        this.a = o6Var;
        o6Var.k(0.3f, 250L, rr.h);
        o6Var.setCallback(this);
        o6Var.t(AndroidUtilities.dp(11.5f));
        o6Var.u(AndroidUtilities.bold());
        o6Var.r(-1);
        o6Var.q("", true, true);
        o6Var.b = 17;
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i10, boolean z10) {
        if (!s.i()) {
            i10 = 0;
        }
        if (i10 > 0) {
            setVisibility(0);
        }
        o6 o6Var = this.a;
        if (z10) {
            o6Var.b();
        }
        if (z10 && i10 != this.d && i10 > 0) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 18));
            this.c.addListener(new pg.d0(this, 7));
            this.c.setInterpolator(new OvershootInterpolator(2.0f));
            this.c.setDuration(200L);
            this.c.start();
        }
        this.d = i10;
        int length = o6Var.g.length();
        o6Var.q("x" + i10, z10, true);
        int length2 = o6Var.g.length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        int dp = AndroidUtilities.dp(8.0f);
        o6 o6Var = this.a;
        rect.set(0, 0, dp + ((int) o6Var.d()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.b != 1.0f) {
            canvas.save();
            float f7 = this.b;
            canvas.scale(f7, f7, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        o6Var.setBounds(rect);
        o6Var.draw(canvas);
        if (this.b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.a.e() + AndroidUtilities.dp(15.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), TLObject.FLAG_30));
    }
}
