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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rb0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.ba a;
    public final SpannableStringBuilder b;
    public final org.telegram.ui.Cells.v1 c;
    public final TextView d;
    public final org.telegram.ui.Cells.v1 e;
    public final TextView f;
    public final org.telegram.ui.Components.lp0 h;
    public final pb0 n;
    public boolean r;
    public float s;
    public ValueAnimator v;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ tb0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb0(tb0 tb0Var, Context context) {
        super(context);
        this.y = tb0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(LocaleController.isRTL ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z10 = true;
        ic.a.o(15.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.y6.L6;
        org.telegram.ui.ActionBar.f7.V(textView, i10, null);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, org.telegram.ui.Components.gb1.u(-2, -2, 16));
        boolean z11 = false;
        org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(context, z10, z11, z11);
        v1Var.v = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.y6.o1(0.15f, org.telegram.ui.ActionBar.y6.x0(null, i10, false)));
        this.c = v1Var;
        v1Var.setTypeface(AndroidUtilities.bold());
        v1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        v1Var.setTextSize(AndroidUtilities.dp(12.0f));
        org.telegram.ui.ActionBar.f7.Z(v1Var, i10, null);
        linearLayout.addView(v1Var, org.telegram.ui.Components.gb1.x(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, org.telegram.ui.Components.gb1.h(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.lp0 lp0Var = new org.telegram.ui.Components.lp0(context, null, true);
        this.h = lp0Var;
        lp0Var.setReportChanges(true);
        lp0Var.setDelegate(new f(this, 23));
        lp0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        lp0Var.setImportantForAccessibility(2);
        addView(lp0Var, org.telegram.ui.Components.gb1.h(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.y6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        textView2.setGravity(3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, org.telegram.ui.Components.gb1.i(-2, -2, 19));
        org.telegram.ui.Cells.v1 v1Var2 = new org.telegram.ui.Cells.v1(this, context);
        this.e = v1Var2;
        v1Var2.b(0.45f, 240L, org.telegram.ui.Components.ds.h);
        v1Var2.setGravity(1);
        v1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        org.telegram.ui.ActionBar.f7.Z(v1Var2, org.telegram.ui.ActionBar.y6.n6, null);
        frameLayout.addView(v1Var2, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba();
        this.a = baVar;
        baVar.a = v1Var2.getPaint();
        baVar.f = AndroidUtilities.dp(1.5f);
        baVar.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(baVar, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        textView3.setGravity(5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, org.telegram.ui.Components.gb1.i(-2, -2, 21));
        addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new pb0(this);
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
            float f7 = powerSaverLevel;
            this.a.a(f7 / 100.0f, true);
            v1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f7))), this.b)), !LocaleController.isRTL, true);
        }
        String upperCase = LocaleController.getString(LiteMode.isPowerSaverApplied() ? R.string.LiteBatteryEnabled : R.string.LiteBatteryDisabled).toUpperCase();
        org.telegram.ui.Cells.v1 v1Var2 = this.c;
        v1Var2.setText(upperCase);
        boolean z10 = powerSaverLevel > 0 && powerSaverLevel < 100;
        if (z10 != this.r) {
            this.r = z10;
            v1Var2.clearAnimation();
            org.telegram.messenger.vh.q(v1Var2.animate().alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.ds.h, 220L);
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
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ob0
                public final /* synthetic */ rb0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i10) {
                        case 0:
                            rb0 rb0Var = this.b;
                            TextView textView = rb0Var.f;
                            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            rb0Var.s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            break;
                        default:
                            rb0 rb0Var2 = this.b;
                            TextView textView2 = rb0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            rb0Var2.w = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.v.addListener(new qb0(this, f10, 0));
            this.v.setInterpolator(org.telegram.ui.Components.ds.h);
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
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.ob0
                public final /* synthetic */ rb0 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i11) {
                        case 0:
                            rb0 rb0Var = this.b;
                            TextView textView = rb0Var.f;
                            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            rb0Var.s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            break;
                        default:
                            rb0 rb0Var2 = this.b;
                            TextView textView2 = rb0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            rb0Var2.w = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.x.addListener(new qb0(this, f11, 1));
            this.x.setInterpolator(org.telegram.ui.Components.ds.h);
            this.x.setDuration(320L);
            this.x.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.y6));
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

    @Override // org.telegram.ui.ActionBar.p6
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
                textView.setTextColor(i0.a.f(this.s, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.n6, false)));
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.x) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.w, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.n6, false)));
        }
        org.telegram.ui.Cells.v1 v1Var = this.c;
        if (v1Var != null) {
            v1Var.invalidate();
        }
    }
}
