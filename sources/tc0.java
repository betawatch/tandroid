// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tc0 extends FrameLayout {
    public final /* synthetic */ byte a = 0;
    public int b;
    public boolean c;
    public Object d;
    public final Object e;
    public Object f;
    public Object h;

    public tc0(Context context, ylb ylbVar) {
        super(context);
        this.b = gm.L(64.0f);
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        bf0Var.setAspectFit(true);
        bf0Var.setRoundRadius(gm.L(12.0f));
        addView(bf0Var, qoe.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, ylbVar);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.a;
        float f = 1.0f;
        Object obj = this.e;
        final byte b2 = 0;
        switch (b) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.c) {
                    Drawable t = ((bf0) this.d).getImageReceiver().t();
                    final byte b3 = 1;
                    if ((t instanceof kn) && ((kn) t).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                                radialProgress2.o(true, 1.0f);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f = ofFloat;
                            ofFloat.addListener(new g0(this, (byte) 19));
                            ((ValueAnimator) this.f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: sc0
                                public final /* synthetic */ tc0 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    byte b4 = b2;
                                    tc0 tc0Var = this.b;
                                    switch (b4) {
                                        case 0:
                                            tc0Var.invalidate();
                                            break;
                                        default:
                                            tc0Var.invalidate();
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
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: sc0
                            public final /* synthetic */ tc0 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                byte b4 = b3;
                                tc0 tc0Var = this.b;
                                switch (b4) {
                                    case 0:
                                        tc0Var.invalidate();
                                        break;
                                    default:
                                        tc0Var.invalidate();
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
                rob robVar = (rob) this.h;
                tnb tnbVar = robVar.a;
                if (this.c) {
                    RectF rectF = gm.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), nm7.d4, 31);
                    cmb.s(this, robVar.z0, tnbVar);
                    Paint d = tnbVar.d("paintChatActionBackground");
                    ColorFilter colorFilter = d.getColorFilter();
                    d.setColorFilter((ColorMatrixColorFilter) this.f);
                    hob hobVar = robVar.z0;
                    if (hobVar != null && (hobVar.getBackground() instanceof ah7) && robVar.n1 < 0.0f) {
                        f = 0.33f;
                    }
                    int alpha = d.getAlpha();
                    d.setAlpha((int) (alpha * f));
                    canvas.drawRect(rectF, d);
                    d.setAlpha(alpha);
                    d.setColorFilter(colorFilter);
                    if (robVar.O1) {
                        float f2 = robVar.p1;
                        if (f2 > 0.0f) {
                            canvas.drawColor(on2.p(-16777216, (int) (f2 * 255.0f * robVar.q1)));
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                RadialProgress2 radialProgress2 = (RadialProgress2) this.e;
                int i5 = this.b;
                radialProgress2.p(width - i5, height - i5, width + i5, height + i5);
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(i, i2);
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getMeasuredWidth() > gm.L(420.0f)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(gm.L(420.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), TLObject.FLAG_30));
                    }
                }
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc0(rob robVar, Context context, boolean z) {
        super(context);
        this.h = robVar;
        this.c = z;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        gm.i(colorMatrix, 0.4f);
        gm.l2(colorMatrix, 0.65f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }
}
