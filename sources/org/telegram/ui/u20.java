package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class u20 extends org.telegram.ui.Components.md0 {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final Paint H0;
    public Boolean I0;
    public final /* synthetic */ v20 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u20(v20 v20Var, Context context) {
        super(context);
        this.J0 = v20Var;
        new Paint(1);
        this.H0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10 = AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f;
        Boolean bool = this.I0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.J0.fragmentView;
            this.I0 = Boolean.valueOf(z10);
            AndroidUtilities.setLightStatusBar(view, z10);
        }
    }

    @Override // org.telegram.ui.Components.ow0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.k kVar7;
        v20 v20Var = this.J0;
        Paint paint = v20Var.K;
        s20 s20Var = v20Var.y;
        if (!v20Var.f) {
            if (v20Var.h) {
                float f7 = v20Var.n + 0.016f;
                v20Var.n = f7;
                if (f7 > 3.0f) {
                    v20Var.h = false;
                }
            } else {
                float f10 = v20Var.n - 0.016f;
                v20Var.n = f10;
                if (f10 < 1.0f) {
                    v20Var.h = true;
                }
            }
        }
        View m10 = v20Var.c.getLayoutManager() != null ? v20Var.c.getLayoutManager().m(0) : null;
        v20Var.r = m10 != null ? m10.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f11 = 1.0f - ((v20Var.r - dp) / (v20Var.J - dp));
        v20Var.v = f11;
        v20Var.v = Utilities.clamp(f11, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (v20Var.r < dp2) {
            v20Var.r = dp2;
        }
        float f12 = v20Var.x;
        v20Var.x = 0.0f;
        if (v20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            v20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - v20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (v20Var.H) {
            v20Var.x = 1.0f;
            v20Var.v = 1.0f;
        }
        if (f12 != v20Var.x) {
            v20Var.c.invalidate();
        }
        v20Var.s0(v20Var.v);
        int i10 = v20Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = s20Var.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) s20Var.d;
        TextView textView = (TextView) s20Var.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - v20Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - v20Var.I) - textView.getMeasuredHeight()) / 2.0f) + v20Var.I) - s20Var.getTop()) - textView.getTop(), dp3);
        s20Var.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f13 = v20Var.v;
        float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(y3);
        frameLayout.setScaleY(y3);
        frameLayout.setAlpha(f14);
        ((FrameLayout) s20Var.e).setAlpha(f14);
        ((org.telegram.ui.Components.da0) s20Var.c).setAlpha(f14);
        v20Var.e.setAlpha(1.0f - v20Var.v);
        v20Var.e.setTranslationY((frameLayout.getY() + s20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f15 = v20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.es.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!v20Var.f) {
            invalidate();
        }
        v20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * v20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (v20Var.M) {
            int themedColor = v20Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7);
            Paint paint2 = this.H0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), v20Var.a.f);
        }
        int d = i0.a.d(f14, v20Var.getThemedColor(org.telegram.ui.ActionBar.g6.j5), v20Var.getThemedColor(v20Var.M ? org.telegram.ui.ActionBar.g6.G6 : org.telegram.ui.ActionBar.g6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.g6.Sj;
        c6Var = ((org.telegram.ui.ActionBar.m2) v20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(i11, c6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !v20Var.q0()) {
            return;
        }
        b5Var = ((org.telegram.ui.ActionBar.m2) v20Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
        ((ActionBarLayout) b5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        v20 v20Var = this.J0;
        kVar = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (ih.j.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.G0 = true;
                    }
                }
                if (this.G0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.G0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        s20 s20Var = v20Var.y;
        float x10 = s20Var.getX();
        FrameLayout frameLayout = (FrameLayout) s20Var.e;
        FrameLayout frameLayout2 = (FrameLayout) s20Var.d;
        org.telegram.ui.Components.da0 da0Var = (org.telegram.ui.Components.da0) s20Var.c;
        float x11 = da0Var.getX() + x10;
        float y3 = da0Var.getY() + s20Var.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, da0Var.getMeasuredWidth() + x11, da0Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.E0) || v20Var.c.I1 || (layout = da0Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && v20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.E0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.E0 = false;
                    }
                    da0Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + s20Var.getX();
        float y10 = frameLayout2.getY() + s20Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.D0) && !v20Var.c.I1 && isClickable && v20Var.x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.D0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.D0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + s20Var.getX();
        float y11 = frameLayout.getY() + s20Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.F0) && !v20Var.c.I1 && v20Var.x < f7) {
            motionEvent.offsetLocation(-x13, -y11);
            if (motionEvent.getAction() == 0) {
                this.F0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.F0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.F0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        v20 v20Var = this.J0;
        if (view != v20Var.c) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        kVar = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
        canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.md0, org.telegram.ui.Components.ow0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.md0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.b5 b5Var;
        int i12;
        int i13;
        s4.b0 b0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.b5 b5Var2;
        v20 v20Var = this.J0;
        s20 s20Var = v20Var.y;
        v20Var.H = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        b5Var = ((org.telegram.ui.ActionBar.m2) v20Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) v20Var).parentLayout;
            if (((ActionBarLayout) b5Var2).M0) {
                i12 = 0;
                v20Var.I = i12;
                s20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = v20Var.e.getLayoutParams();
                i13 = v20Var.E;
                if (i13 <= 0) {
                    i13 = s20Var.getMeasuredHeight();
                }
                layoutParams.height = i13;
                b0Var = v20Var.F;
                if (b0Var instanceof org.telegram.ui.Components.b00) {
                    org.telegram.ui.Components.b00 b00Var = (org.telegram.ui.Components.b00) b0Var;
                    kVar = ((org.telegram.ui.ActionBar.m2) v20Var).actionBar;
                    b00Var.M = kVar.getMeasuredHeight();
                    b00Var.p1();
                    ((org.telegram.ui.Components.b00) v20Var.F).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    v20Var.v0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        v20Var.I = i12;
        s20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = v20Var.e.getLayoutParams();
        i13 = v20Var.E;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        b0Var = v20Var.F;
        if (b0Var instanceof org.telegram.ui.Components.b00) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
