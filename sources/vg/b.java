package vg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import fi.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.r6;
import org.telegram.ui.d3;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b extends View {
    public final r6 a;
    public float b;
    public ValueAnimator c;
    public int d;
    public final Paint e;

    public b(Context context) {
        super(context);
        this.b = 1.0f;
        r6 r6Var = new r6(false, false, true);
        this.a = r6Var;
        r6Var.n(0.3f, 250L, ds.h);
        r6Var.setCallback(this);
        r6Var.w(AndroidUtilities.dp(11.5f));
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(-1);
        r6Var.t("", true, true);
        r6Var.b = 17;
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
        r6 r6Var = this.a;
        if (z10) {
            r6Var.a();
        }
        if (z10 && i10 != this.d && i10 > 0) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.addUpdateListener(new e4(this, 29));
            this.c.addListener(new hc1(this, 23));
            d3.m(2.0f, this.c);
            this.c.setDuration(200L);
            this.c.start();
        }
        this.d = i10;
        int length = r6Var.i.length();
        r6Var.t("x" + i10, z10, true);
        int length2 = r6Var.i.length();
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
        r6 r6Var = this.a;
        rect.set(0, 0, dp + ((int) r6Var.c()), AndroidUtilities.dp(20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        if (this.b != 1.0f) {
            canvas.save();
            float f7 = this.b;
            canvas.scale(f7, f7, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), AndroidUtilities.dp(19.0f));
        r6Var.setBounds(rect);
        r6Var.draw(canvas);
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
