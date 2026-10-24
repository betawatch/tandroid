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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ub0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.y9 a;
    public final SpannableStringBuilder b;
    public final org.telegram.ui.Cells.w1 c;
    public final TextView d;
    public final org.telegram.ui.Cells.w1 e;
    public final TextView f;
    public final org.telegram.ui.Components.hp0 h;
    public final sb0 n;
    public boolean r;
    public float s;
    public ValueAnimator v;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ wb0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub0(wb0 wb0Var, Context context) {
        super(context);
        this.y = wb0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z10 = true;
        com.google.android.gms.internal.play_billing.k3.m(15.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.k6.L6;
        org.telegram.ui.ActionBar.r6.W(textView, i10, null);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, w7.z5.q(-2, -2, 16));
        boolean z11 = false;
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(context, z10, z11, z11);
        w1Var.v = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.k6.o1(0.15f, org.telegram.ui.ActionBar.k6.x0(null, i10, false)));
        this.c = w1Var;
        w1Var.setTypeface(AndroidUtilities.bold());
        w1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        w1Var.setTextSize(AndroidUtilities.dp(12.0f));
        org.telegram.ui.ActionBar.r6.a0(w1Var, i10, null);
        linearLayout.addView(w1Var, w7.z5.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, w7.z5.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.hp0 hp0Var = new org.telegram.ui.Components.hp0(context, null, true);
        this.h = hp0Var;
        hp0Var.setReportChanges(true);
        hp0Var.setDelegate(new f(this, 23));
        hp0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        hp0Var.setImportantForAccessibility(2);
        addView(hp0Var, w7.z5.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.k6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        textView2.setGravity(3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, w7.z5.e(-2, -2, 19));
        org.telegram.ui.Cells.w1 w1Var2 = new org.telegram.ui.Cells.w1(this, context);
        this.e = w1Var2;
        w1Var2.b(0.45f, 240L, org.telegram.ui.Components.bs.h);
        w1Var2.setGravity(1);
        w1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        org.telegram.ui.ActionBar.r6.a0(w1Var2, org.telegram.ui.ActionBar.k6.n6, null);
        frameLayout.addView(w1Var2, w7.z5.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9();
        this.a = y9Var;
        y9Var.a = w1Var2.getPaint();
        y9Var.f = AndroidUtilities.dp(1.5f);
        y9Var.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(y9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        textView3.setGravity(5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, w7.z5.e(-2, -2, 21));
        addView(frameLayout, w7.z5.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new sb0(this);
        a();
    }

    public final void a() {
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.w1 w1Var = this.e;
        w1Var.a();
        final int i10 = 0;
        final int i11 = 1;
        if (powerSaverLevel <= 0) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            w1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f7 = powerSaverLevel;
            this.a.a(f7 / 100.0f, true);
            w1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f7))), this.b)), !LocaleController.isRTL, true);
        }
        String upperCase = LocaleController.getString(LiteMode.isPowerSaverApplied() ? R.string.LiteBatteryEnabled : R.string.LiteBatteryDisabled).toUpperCase();
        org.telegram.ui.Cells.w1 w1Var2 = this.c;
        w1Var2.setText(upperCase);
        boolean z10 = powerSaverLevel > 0 && powerSaverLevel < 100;
        if (z10 != this.r) {
            this.r = z10;
            w1Var2.clearAnimation();
            org.telegram.messenger.sl.t(w1Var2.animate().alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.bs.h, 220L);
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rb0
                public final /* synthetic */ ub0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i10) {
                        case 0:
                            ub0 ub0Var = this.b;
                            TextView textView = ub0Var.f;
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            ub0Var.s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            break;
                        default:
                            ub0 ub0Var2 = this.b;
                            TextView textView2 = ub0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            ub0Var2.w = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.v.addListener(new tb0(this, f10, 0));
            this.v.setInterpolator(org.telegram.ui.Components.bs.h);
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
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rb0
                public final /* synthetic */ ub0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i11) {
                        case 0:
                            ub0 ub0Var = this.b;
                            TextView textView = ub0Var.f;
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            ub0Var.s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            break;
                        default:
                            ub0 ub0Var2 = this.b;
                            TextView textView2 = ub0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            ub0Var2.w = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.x.addListener(new tb0(this, f11, 1));
            this.x.setInterpolator(org.telegram.ui.Components.bs.h);
            this.x.setDuration(320L);
            this.x.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.v;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.s, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false)));
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.x) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.w, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false)));
        }
        org.telegram.ui.Cells.w1 w1Var = this.c;
        if (w1Var != null) {
            w1Var.invalidate();
        }
    }
}
