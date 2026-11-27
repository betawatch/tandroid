// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class vbc extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ xbc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbc(xbc xbcVar, Context context) {
        super(context);
        this.e = xbcVar;
        this.c = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, getPaddingTop(), getMeasuredWidth(), getMeasuredHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        canvas.save();
        xbc xbcVar = this.e;
        Drawable drawable = xbcVar.q1;
        RectF rectF = xbcVar.w1;
        int L = hl.L(6.0f) + (xbcVar.x1 - xbcVar.t0);
        int L2 = (xbcVar.x1 - xbcVar.t0) - hl.L(13.0f);
        int L3 = hl.L(50.0f) + getMeasuredHeight();
        int i = xbcVar.t0;
        int i2 = hl.m;
        int i3 = L2 + i2;
        int i4 = L + i2;
        int i5 = (L3 + i) - i2;
        float translationY = getTranslationY() + i + i3;
        int i6 = hl.m;
        if (translationY < (i6 << 1)) {
            int min = (int) Math.min(i6, ((r8 - i3) - xbcVar.t0) - getTranslationY());
            i3 -= min;
            i5 += min;
            f = 1.0f - Math.min(1.0f, (min << 1) / hl.m);
        } else {
            f = 1.0f;
        }
        float translationY2 = getTranslationY() + xbcVar.t0 + i3;
        float f2 = hl.m;
        int min2 = translationY2 < f2 ? (int) Math.min(f2, ((r7 - i3) - xbcVar.t0) - getTranslationY()) : 0;
        drawable.setBounds(0, i3, getMeasuredWidth(), i5);
        drawable.draw(canvas);
        if (!xbcVar.M1) {
            if (f != 1.0f) {
                aob.s0.setColor(xbcVar.z1);
                rectF.set(xbcVar.u0, xbcVar.t0 + i3, getMeasuredWidth() - xbcVar.u0, hl.L(24.0f) + xbcVar.t0 + i3);
                canvas.drawRoundRect(rectF, hl.L(12.0f) * f, hl.L(12.0f) * f, aob.s0);
            }
            int L4 = hl.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i4, (getMeasuredWidth() + L4) / 2, hl.L(4.0f) + i4);
            aob.s0.setColor(aob.w0(null, xbcVar.C1, false));
            canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
        }
        if (min2 > 0) {
            aob.s0.setColor(xbcVar.z1);
        }
        boolean z = min2 > hl.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z) {
            boolean z2 = hl.B(aob.v0(aob.h5, xbcVar.J0)) > 0.721f;
            boolean z3 = hl.B(aob.v(aob.v0(aob.s8, xbcVar.J0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            hl.n3(xbcVar.getWindow(), z2);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            xbc xbcVar = this.e;
            if (y < xbcVar.x1) {
                xbcVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e.M0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        int size = View.MeasureSpec.getSize(i2);
        this.c = true;
        xbc xbcVar = this.e;
        gw9 gw9Var = xbcVar.n1;
        int i3 = xbcVar.u0;
        setPadding(i3, hl.m, i3, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        if (xbcVar.d) {
            L = hl.L(8.0f);
            xbcVar.r0(false);
            int i4 = xbcVar.x1;
            if (i4 != 0) {
                float f = i4;
                this.b = f;
                setTranslationY(f);
                ValueAnimator valueAnimator = this.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new pzb(this, (byte) 6));
                this.a.setDuration(250L);
                this.a.setInterpolator(hb.w);
                this.a.addListener(new omb(this, (byte) 13));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + hl.L(8.0f);
            xbcVar.r0 = true;
        }
        if (gw9Var.getPaddingTop() != L) {
            this.c = true;
            gw9Var.setPadding(0, L, 0, 0);
            this.c = false;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        invalidate();
    }
}
