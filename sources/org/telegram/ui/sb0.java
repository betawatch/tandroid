package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sb0 extends FrameLayout {
    public final org.telegram.ui.Components.v9 a;
    public final SpannableStringBuilder b;
    public final org.telegram.ui.Cells.v1 c;
    public final TextView d;
    public final org.telegram.ui.Cells.v1 e;
    public final TextView f;
    public final org.telegram.ui.Components.ao0 h;
    public final qb0 n;
    public boolean r;
    public float s;
    public ValueAnimator v;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ ub0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb0(ub0 ub0Var, Context context) {
        super(context);
        this.y = ub0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z10 = true;
        th.n(15.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.g6.L6;
        boolean z11 = false;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, i7.f6.q(-2, -2, 16));
        org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(context, z10, z11, z11);
        v1Var.v = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        this.c = v1Var;
        v1Var.setTypeface(AndroidUtilities.bold());
        v1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        v1Var.setTextSize(AndroidUtilities.dp(12.0f));
        v1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        linearLayout.addView(v1Var, i7.f6.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, i7.f6.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.ao0 ao0Var = new org.telegram.ui.Components.ao0(context, null, true);
        this.h = ao0Var;
        ao0Var.setReportChanges(true);
        ao0Var.setDelegate(new h(this, 23));
        ao0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        ao0Var.setImportantForAccessibility(2);
        addView(ao0Var, i7.f6.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.g6.y6;
        th.s(i11, null, false, textView2, 3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, i7.f6.e(-2, -2, 19));
        org.telegram.ui.Cells.v1 v1Var2 = new org.telegram.ui.Cells.v1(this, context);
        this.e = v1Var2;
        v1Var2.b(0.45f, 240L, org.telegram.ui.Components.jr.h);
        v1Var2.setGravity(1);
        v1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        v1Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n6, false));
        frameLayout.addView(v1Var2, i7.f6.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9();
        this.a = v9Var;
        v9Var.a = v1Var2.getPaint();
        v9Var.f = AndroidUtilities.dp(1.5f);
        v9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(v9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        th.s(i11, null, false, textView3, 5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, i7.f6.e(-2, -2, 21));
        addView(frameLayout, i7.f6.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new qb0(this);
        a();
    }

    public final void a() {
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.v1 v1Var = this.e;
        v1Var.a();
        final int i10 = 0;
        final int i11 = 1;
        if (powerSaverLevel <= 0) {
            v1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            v1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f9 = powerSaverLevel;
            this.a.a(f9 / 100.0f, true);
            v1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f9))), this.b)), !LocaleController.isRTL, true);
        }
        String upperCase = LocaleController.getString(LiteMode.isPowerSaverApplied() ? R.string.LiteBatteryEnabled : R.string.LiteBatteryDisabled).toUpperCase();
        org.telegram.ui.Cells.v1 v1Var2 = this.c;
        v1Var2.setText(upperCase);
        boolean z10 = powerSaverLevel > 0 && powerSaverLevel < 100;
        if (z10 != this.r) {
            this.r = z10;
            v1Var2.clearAnimation();
            b.q(v1Var2.animate().alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.jr.h, 220L);
        }
        float f10 = powerSaverLevel >= 100 ? 1.0f : 0.0f;
        if (this.s != f10) {
            this.s = f10;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, f10);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pb0
                public final /* synthetic */ sb0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i10) {
                        case 0:
                            sb0 sb0Var = this.b;
                            TextView textView = sb0Var.f;
                            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false);
                            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            sb0Var.s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            break;
                        default:
                            sb0 sb0Var2 = this.b;
                            TextView textView2 = sb0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false);
                            int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            sb0Var2.w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            break;
                    }
                }
            });
            this.v.addListener(new rb0(this, f10, 0));
            this.v.setInterpolator(org.telegram.ui.Components.jr.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        float f11 = powerSaverLevel <= 0 ? 1.0f : 0.0f;
        if (this.w != f11) {
            this.w = f11;
            ValueAnimator valueAnimator2 = this.x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.x = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.w, f11);
            this.x = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.pb0
                public final /* synthetic */ sb0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i11) {
                        case 0:
                            sb0 sb0Var = this.b;
                            TextView textView = sb0Var.f;
                            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false);
                            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            sb0Var.s = floatValue;
                            textView.setTextColor(i0.a.d(floatValue, w02, w03));
                            break;
                        default:
                            sb0 sb0Var2 = this.b;
                            TextView textView2 = sb0Var2.d;
                            int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false);
                            int w05 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            sb0Var2.w = floatValue2;
                            textView2.setTextColor(i0.a.d(floatValue2, w04, w05));
                            break;
                    }
                }
            });
            this.x.addListener(new rb0(this, f11, 1));
            this.x.setInterpolator(org.telegram.ui.Components.jr.h);
            this.x.setDuration(320L);
            this.x.start();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.n.performAccessibilityAction(this, i10, bundle);
    }
}
