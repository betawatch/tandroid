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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r90 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final /* synthetic */ t90 E;
    public final org.telegram.ui.Components.m9 a;
    public final SpannableStringBuilder b;
    public final org.telegram.ui.Cells.a2 c;
    public final TextView d;
    public final org.telegram.ui.Cells.a2 e;
    public final TextView f;
    public final org.telegram.ui.Components.pm0 h;
    public final org.telegram.ui.Components.st0 n;
    public boolean r;
    public float s;
    public ValueAnimator w;
    public float x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r90(t90 t90Var, Context context) {
        super(context);
        this.E = t90Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        boolean z10 = true;
        char c2 = 1;
        k2.p1.t(textView, 1, 15.0f);
        int i3 = org.telegram.ui.ActionBar.k6.L6;
        org.telegram.ui.ActionBar.r6.V(textView, i3, null);
        textView.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        textView.setText(org.telegram.messenger.bd.N0("LiteBatteryTitle"));
        linearLayout.addView(textView, b8.mf.r(-2, -2, 16));
        boolean z11 = false;
        org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, z10, z11, z11);
        a2Var.w = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.r1(0.15f, org.telegram.ui.ActionBar.k6.x0(null, i3, false)));
        this.c = a2Var;
        a2Var.setTypeface(org.telegram.messenger.g0.o());
        a2Var.setPadding(org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(5.33f), org.telegram.messenger.g0.L(2.0f));
        a2Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.ActionBar.r6.Z(a2Var, i3, null);
        linearLayout.addView(a2Var, b8.mf.t(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, b8.mf.d(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(context, null, true);
        this.h = pm0Var;
        pm0Var.setReportChanges(true);
        pm0Var.setDelegate(new f(this, 20));
        pm0Var.setProgress(org.telegram.messenger.lc.c() / 100.0f);
        pm0Var.setImportantForAccessibility(2);
        addView(pm0Var, b8.mf.d(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.k6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        textView2.setGravity(3);
        textView2.setText(org.telegram.messenger.bd.M0(2131748882, null));
        frameLayout.addView(textView2, b8.mf.e(-2, -2, 19));
        org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(this, context);
        this.e = a2Var2;
        a2Var2.b(0.45f, 240L, org.telegram.ui.Components.xq.h);
        a2Var2.setGravity(1);
        a2Var2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        org.telegram.ui.ActionBar.r6.Z(a2Var2, org.telegram.ui.ActionBar.k6.n6, null);
        frameLayout.addView(a2Var2, b8.mf.e(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.b = spannableStringBuilder;
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9();
        this.a = m9Var;
        m9Var.a = a2Var2.getPaint();
        m9Var.f = org.telegram.messenger.g0.L(1.5f);
        m9Var.setBounds(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(-20.0f), org.telegram.messenger.g0.L(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(m9Var, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        textView3.setGravity(5);
        textView3.setText(org.telegram.messenger.bd.M0(2131748881, null));
        frameLayout.addView(textView3, b8.mf.e(-2, -2, 21));
        addView(frameLayout, b8.mf.d(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.n = new org.telegram.ui.Components.st0(c2 == true ? 1 : 0, this);
        a();
    }

    public final void a() {
        int c2 = org.telegram.messenger.lc.c();
        org.telegram.ui.Cells.a2 a2Var = this.e;
        a2Var.a();
        final int i3 = 0;
        final int i10 = 1;
        if (c2 <= 0) {
            a2Var.c(org.telegram.messenger.bd.M0(2131748884, null), !org.telegram.messenger.bd.a0, true);
        } else if (c2 >= 100) {
            a2Var.c(org.telegram.messenger.bd.M0(2131748883, null), !org.telegram.messenger.bd.a0, true);
        } else {
            float f10 = c2;
            this.a.a(true, f10 / 100.0f);
            a2Var.c(org.telegram.messenger.g0.K2(org.telegram.messenger.bd.M0(2131748875, null), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f10))), this.b), "%s"), !org.telegram.messenger.bd.a0, true);
        }
        String upperCase = org.telegram.messenger.bd.M0(org.telegram.messenger.lc.f() ? 2131748881 : 2131748882, null).toUpperCase();
        org.telegram.ui.Cells.a2 a2Var2 = this.c;
        a2Var2.setText(upperCase);
        boolean z10 = c2 > 0 && c2 < 100;
        if (z10 != this.r) {
            this.r = z10;
            a2Var2.clearAnimation();
            org.telegram.messenger.camera.q.l(a2Var2.animate().alpha(z10 ? 1.0f : 0.0f), org.telegram.ui.Components.xq.h, 220L);
        }
        float f11 = c2 >= 100 ? 1.0f : 0.0f;
        if (this.s != f11) {
            this.s = f11;
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.s, f11);
            this.w = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.p90
                public final /* synthetic */ r90 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (i3) {
                        case 0:
                            r90 r90Var = this.b;
                            TextView textView = r90Var.f;
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            r90Var.s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            break;
                        default:
                            r90 r90Var2 = this.b;
                            TextView textView2 = r90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            r90Var2.x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.w.addListener(new q90(this, f11, 0));
            this.w.setInterpolator(org.telegram.ui.Components.xq.h);
            this.w.setDuration(320L);
            this.w.start();
        }
        float f12 = c2 <= 0 ? 1.0f : 0.0f;
        if (this.x != f12) {
            this.x = f12;
            ValueAnimator valueAnimator2 = this.y;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.y = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.x, f12);
            this.y = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.p90
                public final /* synthetic */ r90 b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (i10) {
                        case 0:
                            r90 r90Var = this.b;
                            TextView textView = r90Var.f;
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            r90Var.s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            break;
                        default:
                            r90 r90Var2 = this.b;
                            TextView textView2 = r90Var2.d;
                            int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
                            int x05 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            r90Var2.x = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            break;
                    }
                }
            });
            this.y.addListener(new q90(this, f12, 1));
            this.y.setInterpolator(org.telegram.ui.Components.xq.h);
            this.y.setDuration(320L);
            this.y.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(112.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        return this.n.performAccessibilityAction(this, i3, bundle);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.w;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.s, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.y) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.x, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false)));
        }
        org.telegram.ui.Cells.a2 a2Var = this.c;
        if (a2Var != null) {
            a2Var.invalidate();
        }
    }
}
