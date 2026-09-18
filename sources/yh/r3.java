package yh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.n20;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class r3 extends FrameLayout {
    public final x0 a;
    public final q3 b;
    public final q3 c;
    public final q3 d;
    public boolean e;
    public final n20 f;
    public final RectF h;

    public r3(Context context, org.telegram.ui.ActionBar.f6 f6Var, x0 x0Var) {
        super(context);
        this.f = new n20();
        this.h = new RectF();
        this.a = x0Var;
        q3 q3Var = new q3(context, f6Var);
        this.b = q3Var;
        q3 q3Var2 = new q3(context, f6Var);
        this.c = q3Var2;
        q3 q3Var3 = new q3(context, f6Var);
        this.d = q3Var3;
        addView(q3Var, w7.x5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(q3Var2, w7.x5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(q3Var3, w7.x5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(h3 h3Var, float f7, boolean z10, h3 h3Var2, float f10, boolean z11, h3 h3Var3, float f11, boolean z12) {
        x0 x0Var = this.a;
        q3 q3Var = this.b;
        if (h3Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            q3Var.setVisibility(0);
            q3Var.e(h3Var.a, h3Var.b, x0Var);
            q3Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            q3Var.setVisibility(4);
        }
        q3 q3Var2 = this.c;
        if (h3Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            q3Var2.setVisibility(0);
            q3Var2.e(h3Var2.a, h3Var2.b, x0Var);
            q3Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(q3Var2, 23));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            q3Var2.setVisibility(4);
        }
        q3 q3Var3 = this.d;
        if (h3Var3 == null) {
            q3Var3.setVisibility(4);
            return;
        }
        float f14 = f11;
        if (z12) {
            f14 = Math.max(0.5f, f14);
        }
        q3Var3.setVisibility(0);
        q3Var3.e(h3Var3.a, h3Var3.b, x0Var);
        q3Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float width = getWidth();
        float dp = AndroidUtilities.dp(8.0f);
        RectF rectF = this.h;
        rectF.set(0.0f, 0.0f, width, dp);
        n20 n20Var = this.f;
        n20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        n20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), TLObject.FLAG_30));
    }
}
