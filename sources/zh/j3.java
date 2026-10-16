package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.p20;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class j3 extends FrameLayout {
    public final w0 a;
    public final i3 b;
    public final i3 c;
    public final i3 d;
    public boolean e;
    public final p20 f;
    public final RectF h;

    public j3(Context context, org.telegram.ui.ActionBar.c6 c6Var, w0 w0Var) {
        super(context);
        this.f = new p20();
        this.h = new RectF();
        this.a = w0Var;
        i3 i3Var = new i3(context, c6Var);
        this.b = i3Var;
        i3 i3Var2 = new i3(context, c6Var);
        this.c = i3Var2;
        i3 i3Var3 = new i3(context, c6Var);
        this.d = i3Var3;
        addView(i3Var, w7.z5.a(-2.0f, 12.66f, 5.33f, 12.66f, 5.33f, -2, 51));
        addView(i3Var2, w7.z5.a(-2.0f, 12.66f, 5.33f, 12.66f, 5.33f, -2, 51));
        addView(i3Var3, w7.z5.a(-2.0f, 12.66f, 5.33f, 12.66f, 5.33f, -2, 51));
    }

    public final void a(z2 z2Var, float f7, boolean z10, z2 z2Var2, float f10, boolean z11, z2 z2Var3, float f11, boolean z12) {
        w0 w0Var = this.a;
        i3 i3Var = this.b;
        if (z2Var != null) {
            if (z10) {
                f7 = Math.max(0.5f, f7);
            }
            i3Var.setVisibility(0);
            i3Var.e(z2Var.a, z2Var.b, w0Var);
            i3Var.setTranslationY(AndroidUtilities.dp(36.0f) * ((f7 - 0.5f) / 1.5f));
        } else {
            i3Var.setVisibility(4);
        }
        i3 i3Var2 = this.c;
        if (z2Var2 != null) {
            float f12 = f10;
            if (z11) {
                f12 = Math.max(0.5f, f12);
            }
            float f13 = (f12 - 0.5f) / 1.5f;
            i3Var2.setVisibility(0);
            i3Var2.e(z2Var2.a, z2Var2.b, w0Var);
            i3Var2.setTranslationY(AndroidUtilities.dp(36.0f) * f13);
            if (z11 && f13 <= 0.0f && !this.e) {
                this.e = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ki.a(i3Var2, 24));
                ofFloat.setDuration(180L);
                ofFloat.start();
            }
        } else {
            i3Var2.setVisibility(4);
        }
        i3 i3Var3 = this.d;
        if (z2Var3 == null) {
            i3Var3.setVisibility(4);
            return;
        }
        float f14 = f11;
        if (z12) {
            f14 = Math.max(0.5f, f14);
        }
        i3Var3.setVisibility(0);
        i3Var3.e(z2Var3.a, z2Var3.b, w0Var);
        i3Var3.setTranslationY(AndroidUtilities.dp(36.0f) * ((f14 - 0.5f) / 1.5f));
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
        p20 p20Var = this.f;
        p20Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, getHeight() - AndroidUtilities.dp(8.0f), getWidth(), getHeight());
        p20Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.66f), TLObject.FLAG_30));
    }
}
