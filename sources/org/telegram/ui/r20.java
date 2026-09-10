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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class r20 extends org.telegram.ui.Components.vc0 {
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public final Paint H0;
    public Boolean I0;
    public final /* synthetic */ s20 J0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r20(s20 s20Var, Context context) {
        super(context);
        this.J0 = s20Var;
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

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.l lVar7;
        s20 s20Var = this.J0;
        Paint paint = s20Var.K;
        p20 p20Var = s20Var.y;
        if (!s20Var.f) {
            if (s20Var.h) {
                float f7 = s20Var.n + 0.016f;
                s20Var.n = f7;
                if (f7 > 3.0f) {
                    s20Var.h = false;
                }
            } else {
                float f10 = s20Var.n - 0.016f;
                s20Var.n = f10;
                if (f10 < 1.0f) {
                    s20Var.h = true;
                }
            }
        }
        View m10 = s20Var.c.getLayoutManager() != null ? s20Var.c.getLayoutManager().m(0) : null;
        s20Var.r = m10 != null ? m10.getBottom() : 0;
        lVar = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + lVar.getBottom();
        float f11 = 1.0f - ((s20Var.r - dp) / (s20Var.J - dp));
        s20Var.v = f11;
        s20Var.v = Utilities.clamp(f11, 1.0f, 0.0f);
        lVar2 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + lVar2.getBottom();
        if (s20Var.r < dp2) {
            s20Var.r = dp2;
        }
        float f12 = s20Var.x;
        s20Var.x = 0.0f;
        if (s20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            s20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - s20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (s20Var.H) {
            s20Var.x = 1.0f;
            s20Var.v = 1.0f;
        }
        if (f12 != s20Var.x) {
            s20Var.c.invalidate();
        }
        int i10 = s20Var.r;
        lVar3 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        int measuredHeight = lVar3.getMeasuredHeight();
        int measuredHeight2 = p20Var.getMeasuredHeight();
        FrameLayout frameLayout = (FrameLayout) p20Var.d;
        TextView textView = (TextView) p20Var.b;
        float dp3 = AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - s20Var.I));
        lVar4 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        float max = Math.max((((((lVar4.getMeasuredHeight() - s20Var.I) - textView.getMeasuredHeight()) / 2.0f) + s20Var.I) - p20Var.getTop()) - textView.getTop(), dp3);
        p20Var.setTranslationY(max);
        frameLayout.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f13 = s20Var.v;
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout.setScaleX(z10);
        frameLayout.setScaleY(z10);
        frameLayout.setAlpha(f14);
        ((FrameLayout) p20Var.e).setAlpha(f14);
        ((org.telegram.ui.Components.m90) p20Var.c).setAlpha(f14);
        s20Var.e.setAlpha(1.0f - s20Var.v);
        s20Var.e.setTranslationY((frameLayout.getY() + p20Var.getY()) - AndroidUtilities.dp(30.0f));
        float dp4 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f15 = s20Var.v;
        textView.setTranslationX((1.0f - org.telegram.ui.Components.wr.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * dp4);
        if (!s20Var.f) {
            invalidate();
        }
        s20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * s20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (s20Var.M) {
            int themedColor = s20Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7);
            Paint paint2 = this.H0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), s20Var.a.f);
        }
        int d = i0.a.d(f14, s20Var.getThemedColor(org.telegram.ui.ActionBar.j6.j5), s20Var.getThemedColor(s20Var.M ? org.telegram.ui.ActionBar.j6.G6 : org.telegram.ui.ActionBar.j6.Tj));
        lVar5 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        lVar5.getBackButton().setColorFilter(d);
        textView.setTextColor(d);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        int i11 = org.telegram.ui.ActionBar.j6.Sj;
        f6Var = ((org.telegram.ui.ActionBar.p2) s20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), paint.getColor()));
        float measuredWidth = getMeasuredWidth();
        lVar6 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        canvas.drawRect(0.0f, 0.0f, measuredWidth, lVar6.getMeasuredHeight(), paint);
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !s20Var.q0()) {
            return;
        }
        f5Var = ((org.telegram.ui.ActionBar.p2) s20Var).parentLayout;
        lVar7 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        ((ActionBarLayout) f5Var).p(canvas, 255, lVar7.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.l lVar2;
        s20 s20Var = this.J0;
        lVar = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
            ImageView backButton = lVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (gh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        p20 p20Var = s20Var.y;
        float x10 = p20Var.getX();
        FrameLayout frameLayout = (FrameLayout) p20Var.e;
        FrameLayout frameLayout2 = (FrameLayout) p20Var.d;
        org.telegram.ui.Components.m90 m90Var = (org.telegram.ui.Components.m90) p20Var.c;
        float x11 = m90Var.getX() + x10;
        float y3 = m90Var.getY() + p20Var.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x11, y3, m90Var.getMeasuredWidth() + x11, m90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.E0) || s20Var.c.K1 || (layout = m90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && s20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.E0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.E0 = false;
                    }
                    m90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + p20Var.getX();
        float y10 = frameLayout2.getY() + p20Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.D0) && !s20Var.c.K1 && isClickable && s20Var.x < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.D0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.D0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + p20Var.getX();
        float y11 = frameLayout.getY() + p20Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.F0) && !s20Var.c.K1 && s20Var.x < f7) {
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.l lVar;
        s20 s20Var = this.J0;
        if (view != s20Var.c) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        lVar = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
        canvas.clipRect(0, lVar.getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    @Override // org.telegram.ui.Components.vc0, org.telegram.ui.Components.aw0
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.vc0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.f5 f5Var;
        int i12;
        int i13;
        s4.c0 c0Var;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.f5 f5Var2;
        s20 s20Var = this.J0;
        p20 p20Var = s20Var.y;
        s20Var.H = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        f5Var = ((org.telegram.ui.ActionBar.p2) s20Var).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) s20Var).parentLayout;
            if (((ActionBarLayout) f5Var2).M0) {
                i12 = 0;
                s20Var.I = i12;
                p20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = s20Var.e.getLayoutParams();
                i13 = s20Var.E;
                if (i13 <= 0) {
                    i13 = p20Var.getMeasuredHeight();
                }
                layoutParams.height = i13;
                c0Var = s20Var.F;
                if (c0Var instanceof org.telegram.ui.Components.wz) {
                    org.telegram.ui.Components.wz wzVar = (org.telegram.ui.Components.wz) c0Var;
                    lVar = ((org.telegram.ui.ActionBar.p2) s20Var).actionBar;
                    wzVar.M = lVar.getMeasuredHeight();
                    wzVar.p1();
                    ((org.telegram.ui.Components.wz) s20Var.F).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    s20Var.u0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        s20Var.I = i12;
        p20Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = s20Var.e.getLayoutParams();
        i13 = s20Var.E;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        c0Var = s20Var.F;
        if (c0Var instanceof org.telegram.ui.Components.wz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
