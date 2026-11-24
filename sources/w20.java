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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w20 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ i30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w20(i30 i30Var, Activity activity) {
        super(activity);
        this.e = i30Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new s20(this, (byte) 0));
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
        i30 i30Var = this.e;
        p20 p20Var = i30Var.r1;
        x20 x20Var = i30Var.m1;
        boolean z = i30Var.n2;
        if (i30Var.q2.size() <= 1) {
            i30Var.s0.setBounds(0, (getMeasuredHeight() - i30Var.x1.getMeasuredHeight()) - i30Var.t0, getMeasuredWidth(), getMeasuredHeight());
            i30Var.s0.draw(canvas);
            if (z) {
                x20Var.setVisibility(8);
                return;
            }
            return;
        }
        if (p20Var.getVisibility() == 0) {
            int L = gm.L(13.0f);
            int translationY = (int) (p20Var.getTranslationY() + ((i30Var.t2 - i30Var.t0) - L));
            if (z) {
                translationY = (translationY - a.getCurrentActionBarHeight()) + gm.L(10.0f);
            }
            int L2 = gm.L(20.0f) + translationY;
            int L3 = gm.L(15.0f) + getMeasuredHeight();
            int i = i30Var.t0;
            int i2 = L3 + i;
            if (z || i + translationY >= a.getCurrentActionBarHeight()) {
                f = 0.0f;
                f2 = 1.0f;
            } else {
                float L4 = gm.L(4.0f) + L;
                f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - translationY) - i30Var.t0) / L4);
                int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L4) * f);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i2 += currentActionBarHeight;
                f2 = 1.0f - f;
            }
            int i3 = (int) ((1.0f - f) * gm.m);
            int i4 = translationY + i3;
            int i5 = L2 + i3;
            i30Var.s0.setBounds(0, i4, getMeasuredWidth(), i2);
            i30Var.s0.draw(canvas);
            RectF rectF = this.a;
            if (z || f2 == 1.0f) {
                f3 = 20.0f;
                f4 = 4.0f;
            } else {
                f3 = 20.0f;
                cmb.s0.setColor(cmb.v0(cmb.g5, i30Var.J0));
                f4 = 4.0f;
                rectF.set(i30Var.u0, i30Var.t0 + i4, getMeasuredWidth() - i30Var.u0, gm.L(24.0f) + i30Var.t0 + i4);
                canvas.drawRoundRect(rectF, gm.L(12.0f) * f2, gm.L(12.0f) * f2, cmb.s0);
            }
            if (!z && f2 != 0.0f) {
                int L5 = gm.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i5, (getMeasuredWidth() + L5) / 2, gm.L(f4) + i5);
                int v0 = cmb.v0(cmb.yj, i30Var.J0);
                int alpha = Color.alpha(v0);
                cmb.s0.setColor(v0);
                cmb.s0.setAlpha((int) (alpha * 1.0f * f2));
                canvas.drawRoundRect(rectF, gm.L(2.0f), gm.L(2.0f), cmb.s0);
            }
            if (z) {
                x20Var.setVisibility(0);
                float max = Math.max(0.0f, td4.A(1.0f, i30Var.K2, gm.L(6.0f), gm.L(f3) + ((i4 - gm.m) - i30Var.t0)) - x20Var.getTop());
                x20Var.setTranslationY(max);
                i30Var.n1.setTranslationY(max);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r5.getY() < (gm.L(12.0f) + r0.t2)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r0.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.getY() < (getMeasuredHeight() - gm.L(((r0.I0() || r0.s2) ? 0 : 52) + nm7.U2))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            i30 i30Var = this.e;
            if (i30Var.t2 != 0 && i30Var.m1.getAlpha() == 0.0f) {
                if (i30Var.t1.b() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        i30 i30Var = this.e;
        i30Var.U0();
        i30Var.T0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        i30 i30Var = this.e;
        k20 k20Var = i30Var.x1;
        k20 k20Var2 = i30Var.b2;
        p20 p20Var = i30Var.r1;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (size != this.c || size2 != this.d) {
            if (k20Var2.getTag() != null) {
                i30Var.Q0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        k20Var.setVisibility((i30Var.p1 || i30Var.d) ? 4 : 0);
        i30Var.o1.setVisibility(k20Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) p20Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + gm.m;
        ((FrameLayout.LayoutParams) i30Var.n1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + gm.m;
        ((FrameLayout.LayoutParams) k20Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int L2 = gm.L(nm7.I2 + ((i30Var.I0() || i30Var.s2) ? 0 : 52));
        if (i30Var.q2.size() > 1) {
            L2 += (gm.L(56.0f) * i30Var.q2.size()) + i30Var.t0;
        }
        if (i30Var.q1 || i30Var.d) {
            L = gm.L(8.0f);
        } else {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = gm.L(8.0f) + (paddingTop - L2);
            if (L > paddingTop - gm.L(((i30Var.I0() || i30Var.s2) ? 0 : 52) + nm7.z5)) {
                L = paddingTop - gm.L(((i30Var.I0() || i30Var.s2) ? 0 : 52) + nm7.z5);
            }
            if (L < 0) {
                L = 0;
            }
        }
        if (i30Var.o2) {
            L = 0;
        }
        if (p20Var.getPaddingTop() != L) {
            p20Var.setPadding(0, L, 0, (i30Var.q1 && i30Var.d) ? 0 : p20Var.getPaddingBottom());
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
