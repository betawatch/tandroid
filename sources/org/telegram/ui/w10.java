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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class w10 extends org.telegram.ui.Components.tb0 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final Paint D0;
    public Boolean E0;
    public final /* synthetic */ x10 F0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(x10 x10Var, Context context) {
        super(context);
        this.F0 = x10Var;
        new Paint(1);
        this.D0 = new Paint(1);
    }

    private void setLightStatusBar(int i9) {
        boolean z10 = AndroidUtilities.computePerceivedBrightness(i9) >= 0.721f;
        Boolean bool = this.E0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.F0.fragmentView;
            this.E0 = Boolean.valueOf(z10);
            AndroidUtilities.setLightStatusBar(view, z10);
        }
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.k kVar7;
        x10 x10Var = this.F0;
        Paint paint = x10Var.G;
        fg.a aVar = x10Var.y;
        if (!x10Var.f) {
            if (x10Var.h) {
                float f10 = x10Var.n + 0.016f;
                x10Var.n = f10;
                if (f10 > 3.0f) {
                    x10Var.h = false;
                }
            } else {
                float f11 = x10Var.n - 0.016f;
                x10Var.n = f11;
                if (f11 < 1.0f) {
                    x10Var.h = true;
                }
            }
        }
        View m10 = x10Var.c.getLayoutManager() != null ? x10Var.c.getLayoutManager().m(0) : null;
        x10Var.r = m10 != null ? m10.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f12 = 1.0f - ((x10Var.r - dp) / (x10Var.F - dp));
        x10Var.v = f12;
        x10Var.v = Utilities.clamp(f12, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (x10Var.r < dp2) {
            x10Var.r = dp2;
        }
        float f13 = x10Var.x;
        x10Var.x = 0.0f;
        if (x10Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            x10Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - x10Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (x10Var.D) {
            x10Var.x = 1.0f;
            x10Var.v = 1.0f;
        }
        if (f13 != x10Var.x) {
            x10Var.c.invalidate();
        }
        int i9 = x10Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = aVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) aVar.d;
        TextView textView = (TextView) aVar.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i9 - ((measuredHeight2 + measuredHeight) - x10Var.E));
        kVar4 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - x10Var.E) - textView.getMeasuredHeight()) / 2.0f) + x10Var.E) - aVar.getTop()) - textView.getTop(), dp3);
        aVar.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f14 = x10Var.v;
        float z10 = e2.c.z(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f15);
        ((FrameLayout) aVar.e).setAlpha(f15);
        ((org.telegram.ui.Components.l80) aVar.c).setAlpha(f15);
        x10Var.e.setAlpha(1.0f - x10Var.v);
        x10Var.e.setTranslationY((frameLayout.getY() + aVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f16 = x10Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!x10Var.f) {
            invalidate();
        }
        x10Var.a.d(0, (-getMeasuredWidth()) * 0.1f * x10Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (x10Var.I) {
            int themedColor = x10Var.getThemedColor(org.telegram.ui.ActionBar.f6.a7);
            Paint paint2 = this.D0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), x10Var.a.f);
        }
        int d = i0.a.d(f15, x10Var.getThemedColor(org.telegram.ui.ActionBar.f6.j5), x10Var.getThemedColor(x10Var.I ? org.telegram.ui.ActionBar.f6.G6 : org.telegram.ui.ActionBar.f6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f15) * 255.0f));
        int i10 = org.telegram.ui.ActionBar.f6.Sj;
        b6Var = ((org.telegram.ui.ActionBar.o2) x10Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f15 > 0.01f || !x10Var.p0()) {
            return;
        }
        b5Var = ((org.telegram.ui.ActionBar.o2) x10Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        ((ActionBarLayout) b5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        x10 x10Var = this.F0;
        kVar = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (pg.i.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.C0 = true;
                    }
                }
                if (this.C0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.C0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        fg.a aVar = x10Var.y;
        float x10 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.l80 l80Var = (org.telegram.ui.Components.l80) aVar.c;
        float x11 = l80Var.getX() + x10;
        float y10 = l80Var.getY() + aVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y10, l80Var.getMeasuredWidth() + x11, l80Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.A0) || x10Var.c.G1 || (layout = l80Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && x10Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y10);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.A0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.A0 = false;
                    }
                    l80Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.z0) && !x10Var.c.G1 && isClickable && x10Var.x < f10) {
            motionEvent.offsetLocation(-x12, -y11);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.z0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.z0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + aVar.getX();
        float y12 = frameLayout.getY() + aVar.getY();
        rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.B0) && !x10Var.c.G1 && x10Var.x < f10) {
            motionEvent.offsetLocation(-x13, -y12);
            if (motionEvent.getAction() == 0) {
                this.B0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.B0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.B0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar;
        x10 x10Var = this.F0;
        if (view != x10Var.c) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        kVar = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
        canvas.clipRect(0, kVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.tb0, org.telegram.ui.Components.xu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.tb0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        int i11;
        int i12;
        f2.m0 m0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.b5 b5Var2;
        x10 x10Var = this.F0;
        fg.a aVar = x10Var.y;
        x10Var.D = View.MeasureSpec.getSize(i9) > View.MeasureSpec.getSize(i10);
        b5Var = ((org.telegram.ui.ActionBar.o2) x10Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) x10Var).parentLayout;
            if (((ActionBarLayout) b5Var2).I0) {
                i11 = 0;
                x10Var.E = i11;
                aVar.measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = x10Var.e.getLayoutParams();
                i12 = x10Var.A;
                if (i12 <= 0) {
                    i12 = aVar.getMeasuredHeight();
                }
                layoutParams.height = i12;
                m0Var = x10Var.B;
                if (m0Var instanceof org.telegram.ui.Components.bz) {
                    org.telegram.ui.Components.bz bzVar = (org.telegram.ui.Components.bz) m0Var;
                    kVar = ((org.telegram.ui.ActionBar.o2) x10Var).actionBar;
                    bzVar.M = kVar.getMeasuredHeight();
                    bzVar.p1();
                    ((org.telegram.ui.Components.bz) x10Var.B).S = 0;
                }
                super.onMeasure(i9, i10);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    x10Var.t0();
                    return;
                }
                return;
            }
        }
        i11 = AndroidUtilities.statusBarHeight;
        x10Var.E = i11;
        aVar.measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = x10Var.e.getLayoutParams();
        i12 = x10Var.A;
        if (i12 <= 0) {
        }
        layoutParams2.height = i12;
        m0Var = x10Var.B;
        if (m0Var instanceof org.telegram.ui.Components.bz) {
        }
        super.onMeasure(i9, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
