package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vy extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 a;
    public final FrameLayout b;
    public final org.telegram.ui.Components.y9 c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.y9 f;
    public final FrameLayout h;
    public ValueAnimator n;
    public float r;
    public int s;
    public int v;

    public vy(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.a = u6Var;
        setOrientation(0);
        setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        org.telegram.ui.Components.kb1.c(frameLayout, 0.05f, 1.25f);
        addView(frameLayout, org.telegram.ui.Components.kb1.s(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.c = y9Var;
        y9Var.setImageDrawable(new org.telegram.ui.Components.yj0(R.raw.topics_tabs, AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f)));
        frameLayout.addView(y9Var, org.telegram.ui.Components.kb1.h(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.y6.z6;
        TextView L = org.telegram.ui.Components.kb1.L(context, 14.0f, i10, true, null);
        L.setPadding(d3.h(12.0f, R.string.TopicsLayoutTabs, L), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(L, org.telegram.ui.Components.kb1.i(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(13.0f);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        frameLayout3.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout3, c02, N, null, u6Var);
        frameLayout2.addView(frameLayout3, org.telegram.ui.Components.kb1.i(-2, 26, 17));
        int i12 = org.telegram.ui.ActionBar.y6.g6;
        TextView L2 = org.telegram.ui.Components.kb1.L(context, 14.0f, i12, true, null);
        L2.setText(LocaleController.getString(R.string.TopicsLayoutTabs));
        frameLayout3.addView(L2, org.telegram.ui.Components.kb1.i(-2, -2, 17));
        frameLayout.addView(frameLayout2, org.telegram.ui.Components.kb1.h(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e = frameLayout4;
        org.telegram.ui.Components.kb1.c(frameLayout4, 0.05f, 1.25f);
        addView(frameLayout4, org.telegram.ui.Components.kb1.s(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(context);
        this.f = y9Var2;
        y9Var2.setImageDrawable(new org.telegram.ui.Components.yj0(R.raw.topics_list, AndroidUtilities.dp(160.0f), AndroidUtilities.dp(160.0f)));
        frameLayout4.addView(y9Var2, org.telegram.ui.Components.kb1.h(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        TextView L3 = org.telegram.ui.Components.kb1.L(context, 14.0f, i10, true, null);
        L3.setPadding(d3.h(12.0f, R.string.TopicsLayoutList, L3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout5.addView(L3, org.telegram.ui.Components.kb1.i(-2, -2, 17));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.h = frameLayout6;
        frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ShapeDrawable c03 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i11);
        frameLayout6.setBackground(c03);
        org.telegram.ui.ActionBar.f7.k(frameLayout6, c03, N2, null, u6Var);
        frameLayout5.addView(frameLayout6, org.telegram.ui.Components.kb1.i(-2, 26, 17));
        TextView L4 = org.telegram.ui.Components.kb1.L(context, 14.0f, i12, true, null);
        L4.setText(LocaleController.getString(R.string.TopicsLayoutList));
        frameLayout6.addView(L4, org.telegram.ui.Components.kb1.i(-2, -2, 17));
        frameLayout4.addView(frameLayout5, org.telegram.ui.Components.kb1.h(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        a(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n = null;
        }
        org.telegram.ui.Components.y9 y9Var = this.f;
        org.telegram.ui.Components.y9 y9Var2 = this.c;
        FrameLayout frameLayout = this.h;
        FrameLayout frameLayout2 = this.d;
        if (z11) {
            ViewPropertyAnimator alpha = frameLayout2.animate().scaleX(!z10 ? 0.0f : 1.0f).scaleY(!z10 ? 0.0f : 1.0f).alpha(!z10 ? 0.0f : 1.0f);
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
            alpha.setInterpolator(dsVar).setDuration(320L).start();
            frameLayout.animate().scaleX(z10 ? 0.0f : 1.0f).scaleY(z10 ? 0.0f : 1.0f).alpha(z10 ? 0.0f : 1.0f).setInterpolator(dsVar).setDuration(320L).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z10 ? 1.0f : 0.0f);
            this.n = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 10));
            this.n.addListener(new lo(28, this, z10));
            this.n.setInterpolator(dsVar);
            this.n.setDuration(320L);
            this.n.start();
        } else {
            frameLayout2.animate().cancel();
            frameLayout.animate().cancel();
            frameLayout2.setScaleX(!z10 ? 0.0f : 1.0f);
            frameLayout2.setScaleY(!z10 ? 0.0f : 1.0f);
            frameLayout2.setAlpha(!z10 ? 0.0f : 1.0f);
            frameLayout.setScaleX(z10 ? 0.0f : 1.0f);
            frameLayout.setScaleY(z10 ? 0.0f : 1.0f);
            frameLayout.setAlpha(z10 ? 0.0f : 1.0f);
            this.r = z10 ? 1.0f : 0.0f;
            int i10 = org.telegram.ui.ActionBar.y6.C6;
            org.telegram.ui.ActionBar.u6 u6Var = this.a;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            int i11 = org.telegram.ui.ActionBar.y6.Oh;
            int f7 = i0.a.f(this.r, w02, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            y9Var2.setColorFilter(new PorterDuffColorFilter(f7, mode));
            y9Var2.invalidate();
            y9Var.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - this.r, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(i11, u6Var)), mode));
            y9Var.invalidate();
        }
        if (z10) {
            y9Var = y9Var2;
        }
        org.telegram.ui.Components.yj0 lottieAnimation = y9Var.getImageReceiver().getLottieAnimation();
        if (lottieAnimation != null) {
            if (lottieAnimation.t() > (z10 ? 0.85f : 0.8f)) {
                lottieAnimation.T(0.0f, false);
            }
            lottieAnimation.H(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.C6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.Components.y9 y9Var;
        org.telegram.ui.Components.y9 y9Var2;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        try {
            ValueAnimator valueAnimator = this.n;
            if ((valueAnimator != null && valueAnimator.isRunning()) || (y9Var = this.c) == null || (y9Var2 = this.f) == null) {
                return;
            }
            int i10 = org.telegram.ui.ActionBar.y6.C6;
            int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
            int i11 = org.telegram.ui.ActionBar.y6.Oh;
            int f7 = i0.a.f(this.r, w02, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            int f10 = i0.a.f(1.0f - this.r, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
            if (f7 != this.s) {
                this.s = f7;
                y9Var.setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
                y9Var.invalidate();
            }
            if (f10 != this.v) {
                this.v = f10;
                y9Var2.setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                y9Var2.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
