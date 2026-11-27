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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class x10 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public int c;
    public int d;
    public final /* synthetic */ j20 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x10(j20 j20Var, Activity activity) {
        super(activity);
        this.e = j20Var;
        this.a = new RectF();
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new t10(this, (byte) 0));
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
        j20 j20Var = this.e;
        q10 q10Var = j20Var.r1;
        y10 y10Var = j20Var.m1;
        boolean z = j20Var.n2;
        if (j20Var.q2.size() <= 1) {
            j20Var.s0.setBounds(0, (getMeasuredHeight() - j20Var.x1.getMeasuredHeight()) - j20Var.t0, getMeasuredWidth(), getMeasuredHeight());
            j20Var.s0.draw(canvas);
            if (z) {
                y10Var.setVisibility(8);
                return;
            }
            return;
        }
        if (q10Var.getVisibility() == 0) {
            int L = hl.L(13.0f);
            int translationY = (int) (q10Var.getTranslationY() + ((j20Var.t2 - j20Var.t0) - L));
            if (z) {
                translationY = (translationY - a.getCurrentActionBarHeight()) + hl.L(10.0f);
            }
            int L2 = hl.L(20.0f) + translationY;
            int L3 = hl.L(15.0f) + getMeasuredHeight();
            int i = j20Var.t0;
            int i2 = L3 + i;
            if (z || i + translationY >= a.getCurrentActionBarHeight()) {
                f = 0.0f;
                f2 = 1.0f;
            } else {
                float L4 = hl.L(4.0f) + L;
                f = Math.min(1.0f, ((a.getCurrentActionBarHeight() - translationY) - j20Var.t0) / L4);
                int currentActionBarHeight = (int) ((a.getCurrentActionBarHeight() - L4) * f);
                translationY -= currentActionBarHeight;
                L2 -= currentActionBarHeight;
                i2 += currentActionBarHeight;
                f2 = 1.0f - f;
            }
            int i3 = (int) ((1.0f - f) * hl.m);
            int i4 = translationY + i3;
            int i5 = L2 + i3;
            j20Var.s0.setBounds(0, i4, getMeasuredWidth(), i2);
            j20Var.s0.draw(canvas);
            RectF rectF = this.a;
            if (z || f2 == 1.0f) {
                f3 = 20.0f;
                f4 = 4.0f;
            } else {
                f3 = 20.0f;
                aob.s0.setColor(aob.v0(aob.h5, j20Var.J0));
                f4 = 4.0f;
                rectF.set(j20Var.u0, j20Var.t0 + i4, getMeasuredWidth() - j20Var.u0, hl.L(24.0f) + j20Var.t0 + i4);
                canvas.drawRoundRect(rectF, hl.L(12.0f) * f2, hl.L(12.0f) * f2, aob.s0);
            }
            if (!z && f2 != 0.0f) {
                int L5 = hl.L(36.0f);
                rectF.set((getMeasuredWidth() - L5) / 2, i5, (getMeasuredWidth() + L5) / 2, hl.L(f4) + i5);
                int v0 = aob.v0(aob.zj, j20Var.J0);
                int alpha = Color.alpha(v0);
                aob.s0.setColor(v0);
                aob.s0.setAlpha((int) (alpha * 1.0f * f2));
                canvas.drawRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), aob.s0);
            }
            if (z) {
                y10Var.setVisibility(0);
                float max = Math.max(0.0f, qd4.A(1.0f, j20Var.K2, hl.L(6.0f), hl.L(f3) + ((i4 - hl.m) - j20Var.t0)) - y10Var.getTop());
                y10Var.setTranslationY(max);
                j20Var.n1.setTranslationY(max);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r5.getY() < (hl.L(12.0f) + r0.t2)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        r0.dismiss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r5.getY() < (getMeasuredHeight() - hl.L(((r0.J0() || r0.s2) ? 0 : 52) + jn7.U2))) goto L21;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            j20 j20Var = this.e;
            if (j20Var.t2 != 0 && j20Var.m1.getAlpha() == 0.0f) {
                if (j20Var.t1.b() > 0) {
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j20 j20Var = this.e;
        j20Var.V0();
        j20Var.U0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        j20 j20Var = this.e;
        l10 l10Var = j20Var.x1;
        l10 l10Var2 = j20Var.b2;
        q10 q10Var = j20Var.r1;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (size != this.c || size2 != this.d) {
            if (l10Var2.getTag() != null) {
                j20Var.R0(false, false);
            }
            this.d = size2;
            this.c = size;
        }
        this.b = true;
        l10Var.setVisibility((j20Var.p1 || j20Var.d) ? 4 : 0);
        j20Var.o1.setVisibility(l10Var.getVisibility());
        int paddingTop = size - getPaddingTop();
        ((FrameLayout.LayoutParams) q10Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + hl.m;
        ((FrameLayout.LayoutParams) j20Var.n1.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + hl.m;
        ((FrameLayout.LayoutParams) l10Var2.getLayoutParams()).topMargin = -getPaddingTop();
        int L2 = hl.L(jn7.I2 + ((j20Var.J0() || j20Var.s2) ? 0 : 52));
        if (j20Var.q2.size() > 1) {
            L2 += (hl.L(56.0f) * j20Var.q2.size()) + j20Var.t0;
        }
        if (j20Var.q1 || j20Var.d) {
            L = hl.L(8.0f);
        } else {
            if (L2 >= paddingTop) {
                L2 = (int) ((paddingTop / 5) * 3.5f);
            }
            L = hl.L(8.0f) + (paddingTop - L2);
            if (L > paddingTop - hl.L(((j20Var.J0() || j20Var.s2) ? 0 : 52) + jn7.z5)) {
                L = paddingTop - hl.L(((j20Var.J0() || j20Var.s2) ? 0 : 52) + jn7.z5);
            }
            if (L < 0) {
                L = 0;
            }
        }
        if (j20Var.o2) {
            L = 0;
        }
        if (q10Var.getPaddingTop() != L) {
            q10Var.setPadding(0, L, 0, (j20Var.q1 && j20Var.d) ? 0 : q10Var.getPaddingBottom());
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
