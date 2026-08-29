package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wy extends LinearLayout {
    public final org.telegram.ui.ActionBar.c6 a;
    public final FrameLayout b;
    public final org.telegram.ui.Components.t9 c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.t9 f;
    public final FrameLayout h;
    public ValueAnimator n;
    public float r;

    public wy(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = c6Var;
        setOrientation(0);
        setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        i7.h6.b(frameLayout, 0.05f, 1.25f);
        addView(frameLayout, i7.f6.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.c = t9Var;
        t9Var.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.topics_tabs, AndroidUtilities.dp(160.0f), "topics_tabs", AndroidUtilities.dp(160.0f)));
        frameLayout.addView(t9Var, i7.f6.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i10 = org.telegram.ui.ActionBar.g6.z6;
        TextView b10 = i7.j6.b(context, 14.0f, i10, true, null);
        b10.setPadding(b.e(12.0f, R.string.TopicsLayoutTabs, b10), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(b10, i7.f6.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.d = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int dp = AndroidUtilities.dp(13.0f);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        frameLayout2.addView(frameLayout3, i7.f6.e(-2, 26, 17));
        int i12 = org.telegram.ui.ActionBar.g6.g6;
        TextView b11 = i7.j6.b(context, 14.0f, i12, true, null);
        b11.setText(LocaleController.getString(R.string.TopicsLayoutTabs));
        frameLayout3.addView(b11, i7.f6.e(-2, -2, 17));
        frameLayout.addView(frameLayout2, i7.f6.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.e = frameLayout4;
        i7.h6.b(frameLayout4, 0.05f, 1.25f);
        addView(frameLayout4, i7.f6.o(-1, 226, 1.0f, 119));
        org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(context);
        this.f = t9Var2;
        t9Var2.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.topics_list, AndroidUtilities.dp(160.0f), "topics_list", AndroidUtilities.dp(160.0f)));
        frameLayout4.addView(t9Var2, i7.f6.d(160, 160.0f, 49, 0.0f, 12.33f, 0.0f, 0.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        TextView b12 = i7.j6.b(context, 14.0f, i10, true, null);
        b12.setPadding(b.e(12.0f, R.string.TopicsLayoutList, b12), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout5.addView(b12, i7.f6.e(-2, -2, 17));
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.h = frameLayout6;
        frameLayout6.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout6.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)));
        frameLayout5.addView(frameLayout6, i7.f6.e(-2, 26, 17));
        TextView b13 = i7.j6.b(context, 14.0f, i12, true, null);
        b13.setText(LocaleController.getString(R.string.TopicsLayoutList));
        frameLayout6.addView(b13, i7.f6.e(-2, -2, 17));
        frameLayout4.addView(frameLayout5, i7.f6.d(-2, 26.0f, 49, 0.0f, 182.0f, 0.0f, 0.0f));
        a(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n = null;
        }
        org.telegram.ui.Components.t9 t9Var = this.f;
        org.telegram.ui.Components.t9 t9Var2 = this.c;
        FrameLayout frameLayout = this.h;
        FrameLayout frameLayout2 = this.d;
        if (z11) {
            ViewPropertyAnimator alpha = frameLayout2.animate().scaleX(!z10 ? 0.0f : 1.0f).scaleY(!z10 ? 0.0f : 1.0f).alpha(!z10 ? 0.0f : 1.0f);
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
            alpha.setInterpolator(jrVar).setDuration(320L).start();
            frameLayout.animate().scaleX(z10 ? 0.0f : 1.0f).scaleY(z10 ? 0.0f : 1.0f).alpha(z10 ? 0.0f : 1.0f).setInterpolator(jrVar).setDuration(320L).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, z10 ? 1.0f : 0.0f);
            this.n = ofFloat;
            ofFloat.addUpdateListener(new g3(this, 11));
            this.n.addListener(new org.telegram.ui.Components.z9(27, this, z10));
            this.n.setInterpolator(jrVar);
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
            int i10 = org.telegram.ui.ActionBar.g6.C6;
            org.telegram.ui.ActionBar.c6 c6Var = this.a;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
            int i11 = org.telegram.ui.ActionBar.g6.Oh;
            int d = i0.a.d(this.r, v02, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            t9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
            t9Var2.invalidate();
            t9Var.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - this.r, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var)), mode));
            t9Var.invalidate();
        }
        if (z10) {
            t9Var = t9Var2;
        }
        org.telegram.ui.Components.xi0 lottieAnimation = t9Var.getImageReceiver().getLottieAnimation();
        if (lottieAnimation != null) {
            if (lottieAnimation.r() > (z10 ? 0.85f : 0.8f)) {
                lottieAnimation.Q(0.0f, false);
            }
            lottieAnimation.F(true);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
