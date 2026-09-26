package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class t01 extends View {
    public final RectF a;
    public final TextPaint b;
    public final Paint c;
    public final ValueAnimator d;
    public final float[] e;
    public final z4.a f;
    public boolean h;
    public final /* synthetic */ ProfileActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t01(ProfileActivity profileActivity, Context context) {
        super(context);
        this.n = profileActivity;
        this.a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        z4.a adapter = profileActivity.n0.getAdapter();
        this.f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(org.telegram.ui.Components.rr.j);
        ofFloat.addUpdateListener(new c3(this, 29));
        ofFloat.addListener(new c70(5, this, profileActivity.n1));
        profileActivity.n0.b(new s01(this));
        adapter.a.registerObserver(new h1.a(this, 2));
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.ActionBar.k kVar2;
        ProfileActivity profileActivity = this.n;
        if (z10) {
            r01 r01Var = profileActivity.N;
            r01Var.J = r01Var.L;
            r01Var.K = r01Var.M;
            r01Var.N = 0.0f;
            r01Var.O = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.b.measureText(((String) this.f.d(profileActivity.n0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(54.0f);
        RectF rectF = this.a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
            if (kVar2.getOccupyStatusBar()) {
                i10 = AndroidUtilities.statusBarHeight;
                float dp = AndroidUtilities.dp(15.0f) + i10;
                rectF.top = dp;
                rectF.bottom = dp + AndroidUtilities.dp(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i10 = 0;
        float dp2 = AndroidUtilities.dp(15.0f) + i10;
        rectF.top = dp2;
        rectF.bottom = dp2 + AndroidUtilities.dp(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f7) {
        ProfileActivity profileActivity = this.n;
        boolean z10 = profileActivity.p2 && profileActivity.n0.getRealCount() > 20;
        if (z10 != this.h) {
            this.h = z10;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.e;
            float lerp = AndroidUtilities.lerp(fArr, animatedFraction);
            if (f7 <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z10) {
                valueAnimator.setDuration((long) (((1.0f - lerp) * 250.0f) / f7));
            } else {
                valueAnimator.setDuration((long) ((250.0f * lerp) / f7));
            }
            fArr[0] = lerp;
            fArr[1] = z10 ? 1.0f : 0.0f;
            valueAnimator.start();
        }
    }

    public final void c() {
        gz0 gz0Var;
        ProfileActivity profileActivity = this.n;
        if (profileActivity.T0 == null || (gz0Var = profileActivity.n0) == null || !profileActivity.p2) {
            return;
        }
        if (gz0Var.getRealPosition() == 0) {
            profileActivity.T0.r(33);
            profileActivity.T0.K(36);
        } else {
            profileActivity.T0.K(33);
            profileActivity.T0.r(36);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float dpf2 = AndroidUtilities.dpf2(12.0f);
        Paint paint = this.c;
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, dpf2, dpf2, paint);
        canvas.drawText(((String) this.f.d(this.n.n0.getCurrentItem())).toString(), rectF.centerX(), AndroidUtilities.dpf2(18.5f) + rectF.top, this.b);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        a(false);
    }
}
