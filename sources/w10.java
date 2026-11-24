// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class w10 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ i20 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(i20 i20Var, Activity activity) {
        super(activity);
        this.e = i20Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new s10(this, (byte) 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        i20 i20Var = this.e;
        p10 p10Var = i20Var.r1;
        x10 x10Var = i20Var.m1;
        boolean z = i20Var.n2;
        if (i20Var.q2.size() <= 1) {
            i20Var.s0.setBounds(0, (getMeasuredHeight() - i20Var.x1.getMeasuredHeight()) - i20Var.t0, getMeasuredWidth(), getMeasuredHeight());
            i20Var.s0.draw(canvas);
            if (z) {
                x10Var.setVisibility(8);
                return;
            }
            return;
        }
        if (p10Var.getVisibility() == 0) {
            int L = gl.L(13.0f);
            int translationY = (int) (p10Var.getTranslationY() + ((i20Var.t2 - i20Var.t0) - L));
            if (z) {
                translationY = (translationY - a.getCurrentActionBarHeight()) + gl.L(10.0f);
            }
            int L2 = gl.L(20.0f) + translationY;
            int L3 = gl.L(15.0f) + getMeasuredHeight();
            int i = i20Var.t0;
            int i2 = L3 + i;
            if (z || i + translationY >= a.getCurrentActionBarHeight()) {
                f = 0.0f;
                f2 = 1.0f;
            } else {
                float L4 = gl.L(4.0f) + L;
                f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - translationY) - i20Var.t0) / L4);
                int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L4) * f);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i2 += currentActionBarHeight;
                f2 = 1.0f - f;
            }
            int i3 = (int) ((1.0f - f) * gl.m);
            int i4 = translationY + i3;
            int i5 = L2 + i3;
            i20Var.s0.setBounds(0, i4, getMeasuredWidth(), i2);
            i20Var.s0.draw(canvas);
            RectF rectF = this.a;
            if (z || f2 == 1.0f) {
                f3 = 20.0f;
                f4 = 4.0f;
            } else {
                f3 = 20.0f;
                bkb.s0.setColor(bkb.v0(bkb.g5, i20Var.J0));
                f4 = 4.0f;
                rectF.set(i20Var.u0, i20Var.t0 + i4, getMeasuredWidth() - i20Var.u0, gl.L(24.0f) + i20Var.t0 + i4);
                canvas.drawRoundRect(rectF, gl.L(12.0f) * f2, gl.L(12.0f) * f2, bkb.s0);
            }
            if (!z && f2 != 0.0f) {
                int L5 = gl.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i5, (getMeasuredWidth() + L5) / 2, gl.L(f4) + i5);
                int v0 = bkb.v0(bkb.yj, i20Var.J0);
                int alpha = Color.alpha(v0);
                bkb.s0.setColor(v0);
                bkb.s0.setAlpha((int) (alpha * 1.0f * f2));
                canvas.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), bkb.s0);
            }
            if (z) {
                x10Var.setVisibility(0);
                float max = Math.max(0.0f, tb4.A(1.0f, i20Var.K2, gl.L(6.0f), gl.L(f3) + ((i4 - gl.m) - i20Var.t0)) - x10Var.getTop());
                x10Var.setTranslationY(max);
                i20Var.n1.setTranslationY(max);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r5.getY() < (gl.L(12.0f) + r0.t2)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r0.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.getY() < (getMeasuredHeight() - gl.L(((r0.I0() || r0.s2) ? 0 : 52) + kk7.U2))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            i20 i20Var = this.e;
            if (i20Var.t2 != 0 && i20Var.m1.getAlpha() == 0.0f) {
                if (i20Var.t1.b() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i20 i20Var = this.e;
        i20Var.U0();
        i20Var.T0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        i20 i20Var = this.e;
        k10 k10Var = i20Var.x1;
        k10 k10Var2 = i20Var.b2;
        p10 p10Var = i20Var.r1;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (size != this.c || size2 != this.d) {
            if (k10Var2.getTag() != null) {
                i20Var.Q0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        k10Var.setVisibility((i20Var.p1 || i20Var.d) ? 4 : 0);
        i20Var.o1.setVisibility(k10Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) p10Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + gl.m;
        ((FrameLayout.LayoutParams) i20Var.n1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + gl.m;
        ((FrameLayout.LayoutParams) k10Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int L2 = gl.L(kk7.I2 + ((i20Var.I0() || i20Var.s2) ? 0 : 52));
        if (i20Var.q2.size() > 1) {
            L2 += (gl.L(56.0f) * i20Var.q2.size()) + i20Var.t0;
        }
        if (i20Var.q1 || i20Var.d) {
            L = gl.L(8.0f);
        } else {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = gl.L(8.0f) + (paddingTop - L2);
            if (L > paddingTop - gl.L(((i20Var.I0() || i20Var.s2) ? 0 : 52) + kk7.z5)) {
                L = paddingTop - gl.L(((i20Var.I0() || i20Var.s2) ? 0 : 52) + kk7.z5);
            }
            if (L < 0) {
                L = 0;
            }
        }
        if (i20Var.o2) {
            L = 0;
        }
        if (p10Var.getPaddingTop() != L) {
            p10Var.setPadding(0, L, 0, (i20Var.q1 && i20Var.d) ? 0 : p10Var.getPaddingBottom());
        }
        this.b = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        getMeasuredHeight();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.e.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
