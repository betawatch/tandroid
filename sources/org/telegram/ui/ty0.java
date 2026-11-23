package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ty0 extends org.telegram.ui.Components.ra {
    public final LinearLayout T1;
    public final org.telegram.ui.Components.kq U1;
    public final org.telegram.ui.Components.j80 V1;
    public org.telegram.ui.Components.b51 W1;

    public ty0(Context context, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.w10 w10Var) {
        super(context, null, false, false, i6Var);
        org.telegram.ui.ActionBar.i6 i6Var2;
        O();
        this.v1 = 0.2f;
        final int i7 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        final int i11 = 0;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.u0, 0, org.telegram.messenger.g0.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        qh0Var.setScaleType(scaleType);
        qh0Var.setImageResource(R.drawable.large_ads_info);
        qh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        qh0Var.setBackground(L);
        org.telegram.ui.ActionBar.u6.j(qh0Var, L, M, null, i6Var);
        frameLayout.addView(qh0Var, c8.na.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (w10Var != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.r5, null, PorterDuff.Mode.SRC_ATOP);
            int i12 = org.telegram.ui.ActionBar.n6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i12, false), 1, -1);
            org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M2, null);
            i6Var2 = i6Var;
            imageView.setOnClickListener(new bi.s6(this, w10Var, i6Var, imageView, 16));
            frameLayout.addView(imageView, c8.na.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            i6Var2 = i6Var;
        }
        linearLayout.addView(frameLayout, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.gd.N0(2131754943, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i13, i6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.m10.f(linearLayout, textView, c8.na.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.gd.N0(2131745848, null));
        org.telegram.ui.ActionBar.u6.U(f10, i13, i6Var2);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, c8.na.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new gh0(this, context, R.drawable.menu_privacy, org.telegram.messenger.gd.N0(z10 ? 2131745844 : 2131745845, null), org.telegram.messenger.gd.N0(z10 ? 2131745846 : 2131745847, null)), c8.na.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new gh0(this, context, R.drawable.menu_feature_split, org.telegram.messenger.gd.N0(z10 ? 2131745840 : 2131745841, null), org.telegram.messenger.gd.N0(z10 ? 2131745842 : 2131745843, null)), c8.na.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String a02 = org.telegram.messenger.gd.a0(null, null, z10 ? 2131745838 : 2131745839, Integer.valueOf(org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).C4));
        int i14 = org.telegram.ui.ActionBar.n6.Xc;
        linearLayout.addView(new gh0(this, context, R.drawable.menu_feature_noads, org.telegram.messenger.gd.N0(2131745837, null), org.telegram.messenger.g0.R2(a02, i14, 0, new Runnable(this) { // from class: org.telegram.ui.sy0
            public final /* synthetic */ ty0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i15 = i11;
                ty0 ty0Var = this.b;
                switch (i15) {
                    case 0:
                        ty0Var.getClass();
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            ty0Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        ty0Var.dismiss();
                        vf.c.t(ty0Var.getContext(), org.telegram.messenger.gd.N0(2131746422, null));
                        break;
                }
            }
        }, null)), c8.na.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d7, view, i6Var2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.gd.N0(z10 ? 2131745832 : 2131745833, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(textView2, i13, i6Var2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.na.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(z10 ? 2131745835 : 2131745836, null));
        SpannableStringBuilder R2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131745834, null), i14, 0, new Runnable(this) { // from class: org.telegram.ui.sy0
            public final /* synthetic */ ty0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i15 = i7;
                ty0 ty0Var = this.b;
                switch (i15) {
                    case 0:
                        ty0Var.getClass();
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            ty0Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        ty0Var.dismiss();
                        vf.c.t(ty0Var.getContext(), org.telegram.messenger.gd.N0(2131746422, null));
                        break;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(R.drawable.attach_arrow_right, 0);
        this.U1 = kqVar;
        kqVar.y = org.telegram.ui.ActionBar.n6.x0(null, i14, false);
        kqVar.I = 0.7f;
        kqVar.J = 0.7f;
        kqVar.F = org.telegram.messenger.g0.L(12.0f);
        kqVar.s = 1.0f;
        spannableString.setSpan(kqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(W2, R2, "%1$s"), spannableString, ">");
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, null);
        this.V1 = j80Var;
        j80Var.setText(K2);
        org.telegram.ui.ActionBar.u6.U(j80Var, i13, i6Var2);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setGravity(1);
        j80Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(j80Var, c8.na.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.Ji, i6Var2);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.gd.N0(2131745849, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(i10, i6Var2), 6.0f);
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i10);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.u6.j(textView3, e10, M3, e11, i6Var2);
        textView3.setOnClickListener(new ny0(this, i7));
        linearLayout.addView(textView3, c8.na.t(-1, 48, 0, 14, 22, 14, 14));
        this.W1.O(false);
    }

    public static ty0 e1(Context context, org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, ki.n2 n2Var) {
        ty0 ty0Var = new ty0(context, z10, i6Var, n2Var);
        if (g2Var == null) {
            ty0Var.show();
            return ty0Var;
        }
        if (g2Var.getParentActivity() != null) {
            g2Var.showDialog(ty0Var);
        }
        return ty0Var;
    }

    public static void f1(Context context, org.telegram.ui.ActionBar.i6 i6Var, bn bnVar) {
        e1(context, bnVar, false, i6Var, null);
    }

    @Override // org.telegram.ui.Components.ra
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(ek0Var, getContext(), this.a, 0, true, new a5(this, 21), this.J0);
        this.W1 = b51Var;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return org.telegram.messenger.gd.N0(2131754943, null);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            org.telegram.ui.Components.kq kqVar = this.U1;
            if (kqVar != null) {
                kqVar.y = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false);
                org.telegram.ui.Components.j80 j80Var = this.V1;
                if (j80Var != null) {
                    j80Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
