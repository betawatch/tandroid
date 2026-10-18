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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public class z10 extends org.telegram.ui.Components.gd0 {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final Paint H0;
    public Boolean I0;
    public final /* synthetic */ a20 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z10(a20 a20Var, Context context) {
        super(context);
        this.J0 = a20Var;
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

    @Override // org.telegram.ui.Components.jw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.k kVar7;
        a20 a20Var = this.J0;
        Paint paint = a20Var.K;
        ai.bd bdVar = a20Var.y;
        if (!a20Var.f) {
            if (a20Var.h) {
                float f7 = a20Var.n + 0.016f;
                a20Var.n = f7;
                if (f7 > 3.0f) {
                    a20Var.h = false;
                }
            } else {
                float f10 = a20Var.n - 0.016f;
                a20Var.n = f10;
                if (f10 < 1.0f) {
                    a20Var.h = true;
                }
            }
        }
        View m10 = a20Var.c.getLayoutManager() != null ? a20Var.c.getLayoutManager().m(0) : null;
        a20Var.r = m10 != null ? m10.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f11 = 1.0f - ((a20Var.r - dp) / (a20Var.J - dp));
        a20Var.v = f11;
        a20Var.v = Utilities.clamp(f11, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (a20Var.r < dp2) {
            a20Var.r = dp2;
        }
        float f12 = a20Var.x;
        a20Var.x = 0.0f;
        if (a20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            a20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - a20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (a20Var.H) {
            a20Var.x = 1.0f;
            a20Var.v = 1.0f;
        }
        if (f12 != a20Var.x) {
            a20Var.c.invalidate();
        }
        a20Var.s0(a20Var.v);
        int i10 = a20Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = bdVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) bdVar.d;
        TextView textView = (TextView) bdVar.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - a20Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - a20Var.I) - textView.getMeasuredHeight()) / 2.0f) + a20Var.I) - bdVar.getTop()) - textView.getTop(), dp3);
        bdVar.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f13 = a20Var.v;
        float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(y3);
        frameLayout.setScaleY(y3);
        frameLayout.setAlpha(f14);
        ((FrameLayout) bdVar.e).setAlpha(f14);
        ((org.telegram.ui.Components.x90) bdVar.c).setAlpha(f14);
        a20Var.e.setAlpha(1.0f - a20Var.v);
        a20Var.e.setTranslationY((frameLayout.getY() + bdVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f15 = a20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.bs.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!a20Var.f) {
            invalidate();
        }
        a20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * a20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (a20Var.M) {
            int themedColor = a20Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7);
            Paint paint2 = this.H0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), a20Var.a.f);
        }
        int f16 = i0.a.f(f14, a20Var.getThemedColor(org.telegram.ui.ActionBar.h6.j5), a20Var.getThemedColor(a20Var.M ? org.telegram.ui.ActionBar.h6.G6 : org.telegram.ui.ActionBar.h6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        kVar5.getBackButton().setColorFilter(f16);
        textView.setTextColor(f16);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.h6.Sj;
        d6Var = ((org.telegram.ui.ActionBar.n2) a20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(i11, d6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !a20Var.q0()) {
            return;
        }
        d5Var = ((org.telegram.ui.ActionBar.n2) a20Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        ((ActionBarLayout) d5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        a20 a20Var = this.J0;
        kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
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
        ai.bd bdVar = a20Var.y;
        float x10 = bdVar.getX();
        FrameLayout frameLayout = (FrameLayout) bdVar.e;
        FrameLayout frameLayout2 = (FrameLayout) bdVar.d;
        org.telegram.ui.Components.x90 x90Var = (org.telegram.ui.Components.x90) bdVar.c;
        float x11 = x90Var.getX() + x10;
        float y3 = x90Var.getY() + bdVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, x90Var.getMeasuredWidth() + x11, x90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.E0) || a20Var.c.I1 || (layout = x90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && a20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.E0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.E0 = false;
                    }
                    x90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + bdVar.getX();
        float y10 = frameLayout2.getY() + bdVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.D0) && !a20Var.c.I1 && isClickable && a20Var.x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.D0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.D0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + bdVar.getX();
        float y11 = frameLayout.getY() + bdVar.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.F0) && !a20Var.c.I1 && a20Var.x < f7) {
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
        a20 a20Var = this.J0;
        if (view != a20Var.c) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.gd0, org.telegram.ui.Components.jw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.gd0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.d5 d5Var;
        int i12;
        int i13;
        s4.b0 b0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.d5 d5Var2;
        a20 a20Var = this.J0;
        ai.bd bdVar = a20Var.y;
        a20Var.H = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        d5Var = ((org.telegram.ui.ActionBar.n2) a20Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) a20Var).parentLayout;
            if (((ActionBarLayout) d5Var2).M0) {
                i12 = 0;
                a20Var.I = i12;
                bdVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = a20Var.e.getLayoutParams();
                i13 = a20Var.E;
                if (i13 <= 0) {
                    i13 = bdVar.getMeasuredHeight();
                }
                layoutParams.height = i13;
                b0Var = a20Var.F;
                if (b0Var instanceof org.telegram.ui.Components.yz) {
                    org.telegram.ui.Components.yz yzVar = (org.telegram.ui.Components.yz) b0Var;
                    kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
                    yzVar.M = kVar.getMeasuredHeight();
                    yzVar.p1();
                    ((org.telegram.ui.Components.yz) a20Var.F).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    a20Var.v0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        a20Var.I = i12;
        bdVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = a20Var.e.getLayoutParams();
        i13 = a20Var.E;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        b0Var = a20Var.F;
        if (b0Var instanceof org.telegram.ui.Components.yz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
