package org.telegram.ui;

import android.app.Activity;
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
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r00 extends org.telegram.ui.Components.kb0 {
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public final Paint q0;
    public Boolean r0;
    public final /* synthetic */ s00 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r00(s00 s00Var, Activity activity) {
        super(activity);
        this.s0 = s00Var;
        new Paint(1);
        this.q0 = new Paint(1);
    }

    private void setLightStatusBar(int i7) {
        boolean z10 = org.telegram.messenger.g0.B(i7) >= 0.721f;
        Boolean bool = this.r0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.s0.fragmentView;
            this.r0 = Boolean.valueOf(z10);
            org.telegram.messenger.g0.q3(view, z10);
        }
    }

    @Override // org.telegram.ui.Components.au0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.k kVar2;
        s00 s00Var = this.s0;
        Paint paint = s00Var.L;
        ah.a aVar = s00Var.E;
        if (!s00Var.f) {
            if (s00Var.h) {
                float f10 = s00Var.n + 0.016f;
                s00Var.n = f10;
                if (f10 > 3.0f) {
                    s00Var.h = false;
                }
            } else {
                float f11 = s00Var.n - 0.016f;
                s00Var.n = f11;
                if (f11 < 1.0f) {
                    s00Var.h = true;
                }
            }
        }
        s00Var.r = (s00Var.c.getLayoutManager() != null ? s00Var.c.getLayoutManager().m(0) : null) == null ? 0 : Math.round(s00Var.q0() + r3.getBottom());
        FrameLayout p02 = s00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f12 = 1.0f - ((s00Var.r - L) / (s00Var.K - L));
        s00Var.w = f12;
        s00Var.w = Utilities.i(f12, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (s00Var.r < L2) {
            s00Var.r = L2;
        }
        float f13 = s00Var.y;
        s00Var.y = 0.0f;
        if (s00Var.r < org.telegram.messenger.g0.L(30.0f) + L2) {
            s00Var.y = ((org.telegram.messenger.g0.L(30.0f) + L2) - s00Var.r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (s00Var.I) {
            s00Var.y = 1.0f;
            s00Var.w = 1.0f;
        }
        if (f13 != s00Var.y) {
            s00Var.c.invalidate();
        }
        s00Var.t0(s00Var.w);
        int measuredHeight = p02.getMeasuredHeight();
        int i7 = s00Var.r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) aVar.c;
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        TextView textView = (TextView) aVar.b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        float max = Math.max((((((measuredHeight - s00Var.J) - textView.getMeasuredHeight()) / 2.0f) + s00Var.J) - aVar.getTop()) - textView.getTop(), org.telegram.messenger.g0.L(16.0f) + (i7 - ((measuredHeight2 + measuredHeight) - s00Var.J)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f14 = s00Var.w;
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        frameLayout2.setScaleX(z10);
        frameLayout2.setScaleY(z10);
        frameLayout2.setAlpha(f15);
        frameLayout.setAlpha(f15);
        k80Var.setAlpha(f15);
        if (s00Var.z0()) {
            int i10 = f15 > 0.0f ? 0 : 4;
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            k80Var.setVisibility(i10);
        }
        s00Var.e.setAlpha(1.0f - s00Var.w);
        s00Var.e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L3 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f16 = s00Var.w;
        textView.setTranslationX(s00Var.z0() ? 0.0f : (1.0f - org.telegram.ui.Components.lr.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * L3);
        if (!s00Var.f) {
            invalidate();
        }
        s00Var.a.d(0, (-getMeasuredWidth()) * 0.1f * s00Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (s00Var.N) {
            int themedColor = s00Var.getThemedColor(org.telegram.ui.ActionBar.n6.a7);
            Paint paint2 = this.q0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), s00Var.a.f);
        }
        int f17 = i0.a.f(f15, s00Var.getThemedColor(org.telegram.ui.ActionBar.n6.j5), s00Var.getThemedColor(s00Var.N ? org.telegram.ui.ActionBar.n6.G6 : org.telegram.ui.ActionBar.n6.Kk));
        kVar = ((org.telegram.ui.ActionBar.h2) s00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.h2) s00Var).actionBar;
            kVar2.getBackButton().setColorFilter(f17);
        }
        textView.setTextColor(f17);
        paint.setAlpha((int) ((1.0f - f15) * 255.0f));
        s00Var.s0(paint.getAlpha() > 0);
        int i11 = org.telegram.ui.ActionBar.n6.Jk;
        i6Var = ((org.telegram.ui.ActionBar.h2) s00Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), paint.getColor()));
        if (!s00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f15 > 0.01f || !s00Var.n0()) {
            return;
        }
        s4Var = ((org.telegram.ui.ActionBar.h2) s00Var).parentLayout;
        ((ActionBarLayout) s4Var).p(canvas, org.telegram.messenger.ks.e4, p02.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        s00 s00Var = this.s0;
        if (s00Var.z0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        kVar = ((org.telegram.ui.ActionBar.h2) s00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.h2) s00Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    if (jh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.p0 = true;
                    }
                }
                if (this.p0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.p0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        ah.a aVar = s00Var.E;
        float x10 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) aVar.c;
        float x11 = k80Var.getX() + x10;
        float y10 = k80Var.getY() + aVar.getY();
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(x11, y10, k80Var.getMeasuredWidth() + x11, k80Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.n0) || s00Var.c.J1 || (layout = k80Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && s00Var.y < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y10);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.n0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.n0 = false;
                    }
                    k80Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) && !s00Var.c.J1 && isClickable && s00Var.y < f10) {
            motionEvent.offsetLocation(-x12, -y11);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.m0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.m0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + aVar.getX();
        float y12 = frameLayout.getY() + aVar.getY();
        rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.o0) && !s00Var.c.J1 && s00Var.y < f10) {
            motionEvent.offsetLocation(-x13, -y12);
            if (motionEvent.getAction() == 0) {
                this.o0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.o0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.o0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        s00 s00Var = this.s0;
        if (view != s00Var.r0() || s00Var.z0()) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0, s00Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.kb0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.s4 s4Var;
        int i11;
        int i12;
        v4.c0 c0Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        s00 s00Var = this.s0;
        ah.a aVar = s00Var.E;
        s00Var.I = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10);
        s4Var = ((org.telegram.ui.ActionBar.h2) s00Var).parentLayout;
        if (s4Var != null) {
            s4Var2 = ((org.telegram.ui.ActionBar.h2) s00Var).parentLayout;
            if (((ActionBarLayout) s4Var2).T0) {
                i11 = 0;
                s00Var.J = i11;
                aVar.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = s00Var.e.getLayoutParams();
                i12 = s00Var.F;
                if (i12 <= 0) {
                    i12 = aVar.getMeasuredHeight();
                }
                layoutParams.height = i12;
                c0Var = s00Var.G;
                if (c0Var instanceof org.telegram.ui.Components.wy) {
                    org.telegram.ui.Components.wy wyVar = (org.telegram.ui.Components.wy) c0Var;
                    wyVar.M = s00Var.p0().getMeasuredHeight();
                    wyVar.p1();
                    ((org.telegram.ui.Components.wy) s00Var.G).S = 0;
                }
                super.onMeasure(i7, i10);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    s00Var.w0();
                    return;
                }
                return;
            }
        }
        i11 = org.telegram.messenger.g0.m;
        s00Var.J = i11;
        aVar.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = s00Var.e.getLayoutParams();
        i12 = s00Var.F;
        if (i12 <= 0) {
        }
        layoutParams2.height = i12;
        c0Var = s00Var.G;
        if (c0Var instanceof org.telegram.ui.Components.wy) {
        }
        super.onMeasure(i7, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
