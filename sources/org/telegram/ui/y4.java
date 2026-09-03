package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class y4 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public boolean c;
    public Object d;
    public final Object e;
    public Object f;
    public Object h;

    public y4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(p9Var, k7.b6.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10 = this.a;
        float f10 = 1.0f;
        Object obj = this.e;
        final int i11 = 0;
        switch (i10) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.c) {
                    Drawable drawable = ((org.telegram.ui.Components.p9) this.d).getImageReceiver().getDrawable();
                    final int i12 = 1;
                    if ((drawable instanceof org.telegram.ui.Components.y5) && ((org.telegram.ui.Components.y5) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                                radialProgress2.o(1.0f, true);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f = ofFloat;
                            ofFloat.addListener(new cg.l0(this, 29));
                            ((ValueAnimator) this.f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.x4
                                public final /* synthetic */ y4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i11) {
                                        case 0:
                                            this.b.invalidate();
                                            break;
                                        default:
                                            this.b.invalidate();
                                            break;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f).setDuration(250L);
                            ((ValueAnimator) this.f).start();
                        } else {
                            this.c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.x4
                            public final /* synthetic */ y4 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (i12) {
                                    case 0:
                                        this.b.invalidate();
                                        break;
                                    default:
                                        this.b.invalidate();
                                        break;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f;
                    if (valueAnimator2 == null) {
                        ValueAnimator valueAnimator3 = (ValueAnimator) this.h;
                        if (valueAnimator3 != null) {
                            radialProgress2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                            radialProgress2.draw(canvas);
                            break;
                        }
                    } else {
                        radialProgress2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        radialProgress2.draw(canvas);
                        break;
                    }
                }
                break;
            default:
                Paint paint = (Paint) obj;
                jd1 jd1Var = (jd1) this.h;
                jc1 jc1Var = jd1Var.a;
                if (this.c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.j6.s(this, jd1Var.u0, jc1Var);
                    Paint G = jc1Var.G("paintChatActionBackground");
                    ColorFilter colorFilter = G.getColorFilter();
                    G.setColorFilter((ColorMatrixColorFilter) this.f);
                    yc1 yc1Var = jd1Var.u0;
                    if (yc1Var != null && (yc1Var.getBackground() instanceof org.telegram.ui.Components.ec0) && jd1Var.i1 < 0.0f) {
                        f10 = 0.33f;
                    }
                    int alpha = G.getAlpha();
                    G.setAlpha((int) (alpha * f10));
                    canvas.drawRect(rectF, G);
                    G.setAlpha(alpha);
                    G.setColorFilter(colorFilter);
                    if (jd1Var.J1) {
                        float f11 = jd1Var.k1;
                        if (f11 > 0.0f) {
                            canvas.drawColor(i0.a.k(-16777216, (int) (f11 * 255.0f * jd1Var.l1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.b != getHeight()) {
                        int height = getHeight();
                        this.b = height;
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        this.d = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    canvas.drawRect(rectF, paint);
                    canvas.restore();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                RadialProgress2 radialProgress2 = (RadialProgress2) this.e;
                int i14 = this.b;
                radialProgress2.q(width - i14, height - i14, width + i14, height + i14);
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                super.onMeasure(i10, i11);
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getMeasuredWidth() > AndroidUtilities.dp(420.0f)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(420.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), TLObject.FLAG_30));
                    }
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(jd1 jd1Var, Context context, boolean z4) {
        super(context);
        this.h = jd1Var;
        this.c = z4;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }
}
