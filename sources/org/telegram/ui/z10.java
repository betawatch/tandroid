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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class z10 extends org.telegram.ui.Components.xb0 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final Paint D0;
    public Boolean E0;
    public final /* synthetic */ a20 F0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z10(a20 a20Var, Context context) {
        super(context);
        this.F0 = a20Var;
        new Paint(1);
        this.D0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10 = AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f;
        Boolean bool = this.E0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.F0.fragmentView;
            this.E0 = Boolean.valueOf(z10);
            AndroidUtilities.setLightStatusBar(view, z10);
        }
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
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
        a20 a20Var = this.F0;
        Paint paint = a20Var.G;
        gg.a aVar = a20Var.y;
        if (!a20Var.f) {
            if (a20Var.h) {
                float f10 = a20Var.n + 0.016f;
                a20Var.n = f10;
                if (f10 > 3.0f) {
                    a20Var.h = false;
                }
            } else {
                float f11 = a20Var.n - 0.016f;
                a20Var.n = f11;
                if (f11 < 1.0f) {
                    a20Var.h = true;
                }
            }
        }
        View m10 = a20Var.c.getLayoutManager() != null ? a20Var.c.getLayoutManager().m(0) : null;
        a20Var.r = m10 != null ? m10.getBottom() : 0;
        kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f12 = 1.0f - ((a20Var.r - dp) / (a20Var.F - dp));
        a20Var.v = f12;
        a20Var.v = Utilities.clamp(f12, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (a20Var.r < dp2) {
            a20Var.r = dp2;
        }
        float f13 = a20Var.x;
        a20Var.x = 0.0f;
        if (a20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            a20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - a20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (a20Var.D) {
            a20Var.x = 1.0f;
            a20Var.v = 1.0f;
        }
        if (f13 != a20Var.x) {
            a20Var.c.invalidate();
        }
        int i10 = a20Var.r;
        kVar3 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        int measuredHeight = kVar3.getMeasuredHeight();
        int measuredHeight2 = aVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) aVar.d;
        TextView textView = (TextView) aVar.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - a20Var.E));
        kVar4 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - a20Var.E) - textView.getMeasuredHeight()) / 2.0f) + a20Var.E) - aVar.getTop()) - textView.getTop(), dp3);
        aVar.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f14 = a20Var.v;
        float z10 = com.google.android.recaptcha.internal.a.z(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f15);
        ((FrameLayout) aVar.e).setAlpha(f15);
        ((org.telegram.ui.Components.p80) aVar.c).setAlpha(f15);
        a20Var.e.setAlpha(1.0f - a20Var.v);
        a20Var.e.setTranslationY((frameLayout.getY() + aVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f16 = a20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.er.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!a20Var.f) {
            invalidate();
        }
        a20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * a20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (a20Var.I) {
            int themedColor = a20Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7);
            Paint paint2 = this.D0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), a20Var.a.f);
        }
        int d = i0.b.d(f15, a20Var.getThemedColor(org.telegram.ui.ActionBar.g6.j5), a20Var.getThemedColor(a20Var.I ? org.telegram.ui.ActionBar.g6.G6 : org.telegram.ui.ActionBar.g6.Tj));
        kVar5 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        kVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f15) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.g6.Sj;
        c6Var = ((org.telegram.ui.ActionBar.n2) a20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        kVar6 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, kVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f15 > 0.01f || !a20Var.q0()) {
            return;
        }
        b5Var = ((org.telegram.ui.ActionBar.n2) a20Var).parentLayout;
        kVar7 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        ((ActionBarLayout) b5Var).p(canvas, 255, kVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        a20 a20Var = this.F0;
        kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (qg.j.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        gg.a aVar = a20Var.y;
        float x8 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) aVar.c;
        float x10 = p80Var.getX() + x8;
        float y10 = p80Var.getY() + aVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x10, y10, p80Var.getMeasuredWidth() + x10, p80Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.A0) || a20Var.c.G1 || (layout = p80Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && a20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x10, -y10);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.A0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.A0 = false;
                    }
                    p80Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x11 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x11, y11, frameLayout2.getMeasuredWidth() + x11, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.z0) && !a20Var.c.G1 && isClickable && a20Var.x < f10) {
            motionEvent.offsetLocation(-x11, -y11);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.z0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.z0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x12 = frameLayout.getX() + aVar.getX();
        float y12 = frameLayout.getY() + aVar.getY();
        rectF2.set(x12, y12, frameLayout.getMeasuredWidth() + x12, frameLayout.getMeasuredHeight() + y12);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.B0) && !a20Var.c.G1 && a20Var.x < f10) {
            motionEvent.offsetLocation(-x12, -y12);
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
        a20 a20Var = this.F0;
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

    @Override // org.telegram.ui.Components.xb0, org.telegram.ui.Components.zu0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.xb0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.b5 b5Var;
        int i12;
        int i13;
        f2.k0 k0Var;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.b5 b5Var2;
        a20 a20Var = this.F0;
        gg.a aVar = a20Var.y;
        a20Var.D = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        b5Var = ((org.telegram.ui.ActionBar.n2) a20Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.n2) a20Var).parentLayout;
            if (((ActionBarLayout) b5Var2).I0) {
                i12 = 0;
                a20Var.E = i12;
                aVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = a20Var.e.getLayoutParams();
                i13 = a20Var.A;
                if (i13 <= 0) {
                    i13 = aVar.getMeasuredHeight();
                }
                layoutParams.height = i13;
                k0Var = a20Var.B;
                if (k0Var instanceof org.telegram.ui.Components.dz) {
                    org.telegram.ui.Components.dz dzVar = (org.telegram.ui.Components.dz) k0Var;
                    kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
                    dzVar.M = kVar.getMeasuredHeight();
                    dzVar.p1();
                    ((org.telegram.ui.Components.dz) a20Var.B).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    a20Var.u0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        a20Var.E = i12;
        aVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = a20Var.e.getLayoutParams();
        i13 = a20Var.A;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        k0Var = a20Var.B;
        if (k0Var instanceof org.telegram.ui.Components.dz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
