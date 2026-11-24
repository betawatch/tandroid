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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class w9c extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ y9c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9c(y9c y9cVar, Context context) {
        super(context);
        this.e = y9cVar;
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
        y9c y9cVar = this.e;
        Drawable drawable = y9cVar.q1;
        RectF rectF = y9cVar.w1;
        int L = gm.L(6.0f) + (y9cVar.x1 - y9cVar.t0);
        int L2 = (y9cVar.x1 - y9cVar.t0) - gm.L(13.0f);
        int L3 = gm.L(50.0f) + getMeasuredHeight();
        int i = y9cVar.t0;
        int i2 = gm.m;
        int i3 = L2 + i2;
        int i4 = L + i2;
        int i5 = (L3 + i) - i2;
        float translationY = getTranslationY() + i + i3;
        int i6 = gm.m;
        if (translationY < (i6 << 1)) {
            int min = (int) Math.min(i6, ((r8 - i3) - y9cVar.t0) - getTranslationY());
            i3 -= min;
            i5 += min;
            f = 1.0f - Math.min(1.0f, (min << 1) / gm.m);
        } else {
            f = 1.0f;
        }
        float translationY2 = getTranslationY() + y9cVar.t0 + i3;
        float f2 = gm.m;
        int min2 = translationY2 < f2 ? (int) Math.min(f2, ((r7 - i3) - y9cVar.t0) - getTranslationY()) : 0;
        drawable.setBounds(0, i3, getMeasuredWidth(), i5);
        drawable.draw(canvas);
        if (!y9cVar.M1) {
            if (f != 1.0f) {
                cmb.s0.setColor(y9cVar.z1);
                rectF.set(y9cVar.u0, y9cVar.t0 + i3, getMeasuredWidth() - y9cVar.u0, gm.L(24.0f) + y9cVar.t0 + i3);
                canvas.drawRoundRect(rectF, gm.L(12.0f) * f, gm.L(12.0f) * f, cmb.s0);
            }
            int L4 = gm.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i4, (getMeasuredWidth() + L4) / 2, gm.L(4.0f) + i4);
            cmb.s0.setColor(cmb.w0(null, y9cVar.C1, false));
            canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
        }
        if (min2 > 0) {
            cmb.s0.setColor(y9cVar.z1);
        }
        boolean z = min2 > gm.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z) {
            boolean z2 = gm.B(cmb.v0(cmb.g5, y9cVar.J0)) > 0.721f;
            boolean z3 = gm.B(cmb.v(cmb.v0(cmb.r8, y9cVar.J0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            gm.n3(y9cVar.getWindow(), z2);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            y9c y9cVar = this.e;
            if (y < y9cVar.x1) {
                y9cVar.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e.L0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        int size = View.MeasureSpec.getSize(i2);
        this.c = true;
        y9c y9cVar = this.e;
        pu9 pu9Var = y9cVar.n1;
        int i3 = y9cVar.u0;
        setPadding(i3, gm.m, i3, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        if (y9cVar.d) {
            L = gm.L(8.0f);
            y9cVar.r0(false);
            int i4 = y9cVar.x1;
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
                ofFloat.addUpdateListener(new oxb(this, (byte) 6));
                this.a.setDuration(250L);
                this.a.setInterpolator(gb.w);
                this.a.addListener(new q7b(this, (byte) 16));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + gm.L(8.0f);
            y9cVar.r0 = true;
        }
        if (pu9Var.getPaddingTop() != L) {
            this.c = true;
            pu9Var.setPadding(0, L, 0, 0);
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
