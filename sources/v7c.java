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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class v7c extends FrameLayout {
    public ValueAnimator a;
    public float b;
    public boolean c;
    public Boolean d;
    public final /* synthetic */ x7c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7c(x7c x7cVar, Context context) {
        super(context);
        this.e = x7cVar;
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
        x7c x7cVar = this.e;
        Drawable drawable = x7cVar.q1;
        RectF rectF = x7cVar.w1;
        int L = gl.L(6.0f) + (x7cVar.x1 - x7cVar.t0);
        int L2 = (x7cVar.x1 - x7cVar.t0) - gl.L(13.0f);
        int L3 = gl.L(50.0f) + getMeasuredHeight();
        int i = x7cVar.t0;
        int i2 = gl.m;
        int i3 = L2 + i2;
        int i4 = L + i2;
        int i5 = (L3 + i) - i2;
        float translationY = getTranslationY() + i + i3;
        int i6 = gl.m;
        if (translationY < (i6 << 1)) {
            int min = (int) Math.min(i6, ((r8 - i3) - x7cVar.t0) - getTranslationY());
            i3 -= min;
            i5 += min;
            f = 1.0f - Math.min(1.0f, (min << 1) / gl.m);
        } else {
            f = 1.0f;
        }
        float translationY2 = getTranslationY() + x7cVar.t0 + i3;
        float f2 = gl.m;
        int min2 = translationY2 < f2 ? (int) Math.min(f2, ((r7 - i3) - x7cVar.t0) - getTranslationY()) : 0;
        drawable.setBounds(0, i3, getMeasuredWidth(), i5);
        drawable.draw(canvas);
        if (!x7cVar.M1) {
            if (f != 1.0f) {
                bkb.s0.setColor(x7cVar.z1);
                rectF.set(x7cVar.u0, x7cVar.t0 + i3, getMeasuredWidth() - x7cVar.u0, gl.L(24.0f) + x7cVar.t0 + i3);
                canvas.drawRoundRect(rectF, gl.L(12.0f) * f, gl.L(12.0f) * f, bkb.s0);
            }
            int L4 = gl.L(36.0f);
            rectF.set((getMeasuredWidth() - L4) / 2, i4, (getMeasuredWidth() + L4) / 2, gl.L(4.0f) + i4);
            bkb.s0.setColor(bkb.w0(null, x7cVar.C1, false));
            canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
        }
        if (min2 > 0) {
            bkb.s0.setColor(x7cVar.z1);
        }
        boolean z = min2 > gl.m / 2;
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z) {
            boolean z2 = gl.B(bkb.v0(bkb.g5, x7cVar.J0)) > 0.721f;
            boolean z3 = gl.B(bkb.v(bkb.v0(bkb.r8, x7cVar.J0), 855638016)) > 0.721f;
            this.d = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            gl.n3(x7cVar.getWindow(), z2);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y = motionEvent.getY();
            x7c x7cVar = this.e;
            if (y < x7cVar.x1) {
                x7cVar.dismiss();
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
        x7c x7cVar = this.e;
        ns9 ns9Var = x7cVar.n1;
        int i3 = x7cVar.u0;
        setPadding(i3, gl.m, i3, 0);
        this.c = false;
        int paddingTop = size - getPaddingTop();
        if (x7cVar.d) {
            L = gl.L(8.0f);
            x7cVar.r0(false);
            int i4 = x7cVar.x1;
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
                ofFloat.addUpdateListener(new uwb(this, (byte) 4));
                this.a.setDuration(250L);
                this.a.setInterpolator(gb.w);
                this.a.addListener(new iab(this, (byte) 14));
                this.a.start();
            } else if (this.a != null) {
                setTranslationY(this.b);
            }
        } else {
            L = (paddingTop - ((paddingTop / 5) * 3)) + gl.L(8.0f);
            x7cVar.r0 = true;
        }
        if (ns9Var.getPaddingTop() != L) {
            this.c = true;
            ns9Var.setPadding(0, L, 0, 0);
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
