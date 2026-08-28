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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t4 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public int b;
    public boolean c;
    public Object d;
    public final Object e;
    public Object f;
    public Object h;

    public t4(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.b = AndroidUtilities.dp(64.0f);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.d = o9Var;
        o9Var.setAspectFit(true);
        o9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
        addView(o9Var, g7.e6.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, b6Var);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i9 = this.a;
        float f10 = 1.0f;
        Object obj = this.e;
        final int i10 = 0;
        switch (i9) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.c) {
                    Drawable drawable = ((org.telegram.ui.Components.o9) this.d).getImageReceiver().getDrawable();
                    final int i11 = 1;
                    if ((drawable instanceof org.telegram.ui.Components.x5) && ((org.telegram.ui.Components.x5) drawable).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                                radialProgress2.o(1.0f, true);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f = ofFloat;
                            ofFloat.addListener(new mh.x(this, 6));
                            ((ValueAnimator) this.f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.s4
                                public final /* synthetic */ t4 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i10) {
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
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.s4
                            public final /* synthetic */ t4 b;

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
                oc1 oc1Var = (oc1) this.h;
                ob1 ob1Var = oc1Var.a;
                if (this.c) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.f6.s(this, oc1Var.t0, ob1Var);
                    Paint O = ob1Var.O("paintChatActionBackground");
                    ColorFilter colorFilter = O.getColorFilter();
                    O.setColorFilter((ColorMatrixColorFilter) this.f);
                    dc1 dc1Var = oc1Var.t0;
                    if (dc1Var != null && (dc1Var.getBackground() instanceof org.telegram.ui.Components.jb0) && oc1Var.h1 < 0.0f) {
                        f10 = 0.33f;
                    }
                    int alpha = O.getAlpha();
                    O.setAlpha((int) (alpha * f10));
                    canvas.drawRect(rectF, O);
                    O.setAlpha(alpha);
                    O.setColorFilter(colorFilter);
                    if (oc1Var.I1) {
                        float f11 = oc1Var.j1;
                        if (f11 > 0.0f) {
                            canvas.drawColor(i0.a.k(-16777216, (int) (f11 * 255.0f * oc1Var.k1)));
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
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                RadialProgress2 radialProgress2 = (RadialProgress2) this.e;
                int i13 = this.b;
                radialProgress2.q(width - i13, height - i13, width + i13, height + i13);
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(i9, i10);
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getMeasuredWidth() > AndroidUtilities.dp(420.0f)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(420.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), TLObject.FLAG_30));
                    }
                }
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(oc1 oc1Var, Context context, boolean z10) {
        super(context);
        this.h = oc1Var;
        this.c = z10;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.4f);
        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.65f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }
}
