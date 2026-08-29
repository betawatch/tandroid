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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class y10 extends org.telegram.ui.Components.ic0 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final Paint D0;
    public Boolean E0;
    public final /* synthetic */ z10 F0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y10(z10 z10Var, Context context) {
        super(context);
        this.F0 = z10Var;
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

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.l lVar7;
        z10 z10Var = this.F0;
        Paint paint = z10Var.G;
        ig.a aVar = z10Var.y;
        if (!z10Var.f) {
            if (z10Var.h) {
                float f9 = z10Var.n + 0.016f;
                z10Var.n = f9;
                if (f9 > 3.0f) {
                    z10Var.h = false;
                }
            } else {
                float f10 = z10Var.n - 0.016f;
                z10Var.n = f10;
                if (f10 < 1.0f) {
                    z10Var.h = true;
                }
            }
        }
        View m10 = z10Var.c.getLayoutManager() != null ? z10Var.c.getLayoutManager().m(0) : null;
        z10Var.r = m10 != null ? m10.getBottom() : 0;
        lVar = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + lVar.getBottom();
        float f11 = 1.0f - ((z10Var.r - dp) / (z10Var.F - dp));
        z10Var.v = f11;
        z10Var.v = Utilities.clamp(f11, 1.0f, 0.0f);
        lVar2 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + lVar2.getBottom();
        if (z10Var.r < dp2) {
            z10Var.r = dp2;
        }
        float f12 = z10Var.x;
        z10Var.x = 0.0f;
        if (z10Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            z10Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - z10Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (z10Var.D) {
            z10Var.x = 1.0f;
            z10Var.v = 1.0f;
        }
        if (f12 != z10Var.x) {
            z10Var.c.invalidate();
        }
        int i10 = z10Var.r;
        lVar3 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        int measuredHeight = lVar3.getMeasuredHeight();
        int measuredHeight2 = aVar.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) aVar.d;
        TextView textView = (TextView) aVar.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - z10Var.E));
        lVar4 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        float max = Math.max((((((lVar4.getMeasuredHeight() - z10Var.E) - textView.getMeasuredHeight()) / 2.0f) + z10Var.E) - aVar.getTop()) - textView.getTop(), dp3);
        aVar.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f13 = z10Var.v;
        float z10 = com.google.android.recaptcha.internal.a.z(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f14);
        ((FrameLayout) aVar.e).setAlpha(f14);
        ((org.telegram.ui.Components.y80) aVar.c).setAlpha(f14);
        z10Var.e.setAlpha(1.0f - z10Var.v);
        z10Var.e.setTranslationY((frameLayout.getY() + aVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f15 = z10Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.jr.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!z10Var.f) {
            invalidate();
        }
        z10Var.a.d(0, (-getMeasuredWidth()) * 0.1f * z10Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10Var.I) {
            int themedColor = z10Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7);
            Paint paint2 = this.D0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), z10Var.a.f);
        }
        int d = i0.a.d(f14, z10Var.getThemedColor(org.telegram.ui.ActionBar.g6.j5), z10Var.getThemedColor(z10Var.I ? org.telegram.ui.ActionBar.g6.G6 : org.telegram.ui.ActionBar.g6.Tj));
        lVar5 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        lVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.g6.Sj;
        c6Var = ((org.telegram.ui.ActionBar.o2) z10Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        lVar6 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, lVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !z10Var.q0()) {
            return;
        }
        b5Var = ((org.telegram.ui.ActionBar.o2) z10Var).parentLayout;
        lVar7 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        ((ActionBarLayout) b5Var).p(canvas, 255, lVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        Layout layout;
        float f9;
        org.telegram.ui.ActionBar.l lVar2;
        z10 z10Var = this.F0;
        lVar = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
            ImageView backButton = lVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (sg.i.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        ig.a aVar = z10Var.y;
        float x4 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.y80 y80Var = (org.telegram.ui.Components.y80) aVar.c;
        float x10 = y80Var.getX() + x4;
        float y8 = y80Var.getY() + aVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x10, y8, y80Var.getMeasuredWidth() + x10, y80Var.getMeasuredHeight() + y8);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.A0) || z10Var.c.G1 || (layout = y80Var.getLayout()) == null) {
            f9 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f9 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && z10Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x10, -y8);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.A0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.A0 = false;
                    }
                    y80Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x11 = frameLayout2.getX() + aVar.getX();
        float y10 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x11, y10, frameLayout2.getMeasuredWidth() + x11, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.z0) && !z10Var.c.G1 && isClickable && z10Var.x < f9) {
            motionEvent.offsetLocation(-x11, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.z0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.z0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x12 = frameLayout.getX() + aVar.getX();
        float y11 = frameLayout.getY() + aVar.getY();
        rectF2.set(x12, y11, frameLayout.getMeasuredWidth() + x12, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.B0) && !z10Var.c.G1 && z10Var.x < f9) {
            motionEvent.offsetLocation(-x12, -y11);
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
        org.telegram.ui.ActionBar.l lVar;
        z10 z10Var = this.F0;
        if (view != z10Var.c) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        lVar = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
        canvas.clipRect(0, lVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.ic0, org.telegram.ui.Components.hv0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ic0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.b5 b5Var;
        int i12;
        int i13;
        f2.j0 j0Var;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.b5 b5Var2;
        z10 z10Var = this.F0;
        ig.a aVar = z10Var.y;
        z10Var.D = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        b5Var = ((org.telegram.ui.ActionBar.o2) z10Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.o2) z10Var).parentLayout;
            if (((ActionBarLayout) b5Var2).I0) {
                i12 = 0;
                z10Var.E = i12;
                aVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = z10Var.e.getLayoutParams();
                i13 = z10Var.A;
                if (i13 <= 0) {
                    i13 = aVar.getMeasuredHeight();
                }
                layoutParams.height = i13;
                j0Var = z10Var.B;
                if (j0Var instanceof org.telegram.ui.Components.kz) {
                    org.telegram.ui.Components.kz kzVar = (org.telegram.ui.Components.kz) j0Var;
                    lVar = ((org.telegram.ui.ActionBar.o2) z10Var).actionBar;
                    kzVar.M = lVar.getMeasuredHeight();
                    kzVar.p1();
                    ((org.telegram.ui.Components.kz) z10Var.B).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    z10Var.u0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        z10Var.E = i12;
        aVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = z10Var.e.getLayoutParams();
        i13 = z10Var.A;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        j0Var = z10Var.B;
        if (j0Var instanceof org.telegram.ui.Components.kz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
