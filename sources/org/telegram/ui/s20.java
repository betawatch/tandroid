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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public class s20 extends org.telegram.ui.Components.mc0 {
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public final Paint G0;
    public Boolean H0;
    public final /* synthetic */ t20 I0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s20(t20 t20Var, Context context) {
        super(context);
        this.I0 = t20Var;
        new Paint(1);
        this.G0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10 = AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f;
        Boolean bool = this.H0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.I0.fragmentView;
            this.H0 = Boolean.valueOf(z10);
            AndroidUtilities.setLightStatusBar(view, z10);
        }
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.k kVar7;
        t20 t20Var = this.I0;
        Paint paint = t20Var.K;
        q20 q20Var = t20Var.y;
        if (!t20Var.f) {
            if (t20Var.h) {
                float f7 = t20Var.n + 0.016f;
                t20Var.n = f7;
                if (f7 > 3.0f) {
                    t20Var.h = false;
                }
            } else {
                float f10 = t20Var.n - 0.016f;
                t20Var.n = f10;
                if (f10 < 1.0f) {
                    t20Var.h = true;
                }
            }
        }
        View m10 = t20Var.c.getLayoutManager() != null ? t20Var.c.getLayoutManager().m(0) : null;
        t20Var.r = m10 != null ? m10.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f11 = 1.0f - ((t20Var.r - dp) / (t20Var.J - dp));
        t20Var.v = f11;
        t20Var.v = Utilities.clamp(f11, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (t20Var.r < dp2) {
            t20Var.r = dp2;
        }
        float f12 = t20Var.x;
        t20Var.x = 0.0f;
        if (t20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            t20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - t20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (t20Var.H) {
            t20Var.x = 1.0f;
            t20Var.v = 1.0f;
        }
        if (f12 != t20Var.x) {
            t20Var.c.invalidate();
        }
        int i10 = t20Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = q20Var.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) q20Var.d;
        TextView textView = (TextView) q20Var.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - t20Var.I));
        kVar4 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - t20Var.I) - textView.getMeasuredHeight()) / 2.0f) + t20Var.I) - q20Var.getTop()) - textView.getTop(), dp3);
        q20Var.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f13 = t20Var.v;
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f14);
        ((FrameLayout) q20Var.e).setAlpha(f14);
        ((org.telegram.ui.Components.c90) q20Var.c).setAlpha(f14);
        t20Var.e.setAlpha(1.0f - t20Var.v);
        t20Var.e.setTranslationY((frameLayout.getY() + q20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f15 = t20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.qr.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!t20Var.f) {
            invalidate();
        }
        t20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * t20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (t20Var.M) {
            int themedColor = t20Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7);
            Paint paint2 = this.G0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), t20Var.a.f);
        }
        int d = i0.a.d(f14, t20Var.getThemedColor(org.telegram.ui.ActionBar.j6.j5), t20Var.getThemedColor(t20Var.M ? org.telegram.ui.ActionBar.j6.G6 : org.telegram.ui.ActionBar.j6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.j6.Sj;
        f6Var = ((org.telegram.ui.ActionBar.o2) t20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !t20Var.q0()) {
            return;
        }
        e5Var = ((org.telegram.ui.ActionBar.o2) t20Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        ((ActionBarLayout) e5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        t20 t20Var = this.I0;
        kVar = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (hh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.F0 = true;
                    }
                }
                if (this.F0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.F0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        q20 q20Var = t20Var.y;
        float x10 = q20Var.getX();
        FrameLayout frameLayout = (FrameLayout) q20Var.e;
        FrameLayout frameLayout2 = (FrameLayout) q20Var.d;
        org.telegram.ui.Components.c90 c90Var = (org.telegram.ui.Components.c90) q20Var.c;
        float x11 = c90Var.getX() + x10;
        float y3 = c90Var.getY() + q20Var.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, c90Var.getMeasuredWidth() + x11, c90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.D0) || t20Var.c.K1 || (layout = c90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && t20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.D0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.D0 = false;
                    }
                    c90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + q20Var.getX();
        float y10 = frameLayout2.getY() + q20Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.C0) && !t20Var.c.K1 && isClickable && t20Var.x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.C0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.C0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + q20Var.getX();
        float y11 = frameLayout.getY() + q20Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.E0) && !t20Var.c.K1 && t20Var.x < f7) {
            motionEvent.offsetLocation(-x13, -y11);
            if (motionEvent.getAction() == 0) {
                this.E0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.E0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.E0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar;
        t20 t20Var = this.I0;
        if (view != t20Var.c) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        kVar = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
        canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.mc0, org.telegram.ui.Components.qv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.mc0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.e5 e5Var;
        int i12;
        int i13;
        s4.c0 c0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.e5 e5Var2;
        t20 t20Var = this.I0;
        q20 q20Var = t20Var.y;
        t20Var.H = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        e5Var = ((org.telegram.ui.ActionBar.o2) t20Var).parentLayout;
        if (e5Var != null) {
            e5Var2 = ((org.telegram.ui.ActionBar.o2) t20Var).parentLayout;
            if (((ActionBarLayout) e5Var2).M0) {
                i12 = 0;
                t20Var.I = i12;
                q20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = t20Var.e.getLayoutParams();
                i13 = t20Var.E;
                if (i13 <= 0) {
                    i13 = q20Var.getMeasuredHeight();
                }
                layoutParams.height = i13;
                c0Var = t20Var.F;
                if (c0Var instanceof org.telegram.ui.Components.pz) {
                    org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) c0Var;
                    kVar = ((org.telegram.ui.ActionBar.o2) t20Var).actionBar;
                    pzVar.M = kVar.getMeasuredHeight();
                    pzVar.p1();
                    ((org.telegram.ui.Components.pz) t20Var.F).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    t20Var.u0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        t20Var.I = i12;
        q20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = t20Var.e.getLayoutParams();
        i13 = t20Var.E;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        c0Var = t20Var.F;
        if (c0Var instanceof org.telegram.ui.Components.pz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
