package yh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.l20;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class p3 extends FrameLayout {
    public final x0 a;
    public final o3 b;
    public final o3 c;
    public final o3 d;
    public boolean e;
    public final l20 f;
    public final RectF h;

    public p3(Context context, org.telegram.ui.ActionBar.f6 f6Var, x0 x0Var) {
        super(context);
        this.f = new l20();
        this.h = new RectF();
        this.a = x0Var;
        o3 o3Var = new o3(context, f6Var);
        this.b = o3Var;
        o3 o3Var2 = new o3(context, f6Var);
        this.c = o3Var2;
        o3 o3Var3 = new o3(context, f6Var);
        this.d = o3Var3;
        addView(o3Var, w7.y5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(o3Var2, w7.y5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
        addView(o3Var3, w7.y5.d(-2, -2.0f, 51, 12.66f, 5.33f, 12.66f, 5.33f));
    }

    public final void a(f3 f3Var, float f7, boolean z10, f3 f3Var2, float f10, boolean z11, f3 f3Var3, float f11, boolean z12) {
        x0 x0Var = this.a;
        o3 o3Var = this.b;
        if (f3Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            o3Var.setVisibility(0);
            o3Var.e(f3Var.a, f3Var.b, x0Var);
            o3Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            o3Var.setVisibility(4);
        }
        o3 o3Var2 = this.c;
        if (f3Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            o3Var2.setVisibility(0);
            o3Var2.e(f3Var2.a, f3Var2.b, x0Var);
            o3Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(o3Var2, 23));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            o3Var2.setVisibility(4);
        }
        o3 o3Var3 = this.d;
        if (f3Var3 == null) {
            o3Var3.setVisibility(4);
            return;
        }
        float f14 = f11;
        if (z12) {
            f14 = Math.max(0.5f, f14);
        }
        o3Var3.setVisibility(0);
        o3Var3.e(f3Var3.a, f3Var3.b, x0Var);
        o3Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
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
        l20 l20Var = this.f;
        l20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        l20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), TLObject.FLAG_30));
    }
}
