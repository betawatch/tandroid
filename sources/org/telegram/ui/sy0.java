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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class sy0 extends org.telegram.ui.Components.na {
    public final LinearLayout P1;
    public final org.telegram.ui.Components.wp Q1;
    public final org.telegram.ui.Components.w70 R1;
    public org.telegram.ui.Components.l41 S1;

    public sy0(Context context, boolean z9, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.c20 c20Var) {
        super(context, null, false, false, f6Var);
        org.telegram.ui.ActionBar.f6 f6Var2;
        N();
        this.r1 = 0.2f;
        final int i7 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.P1 = linearLayout;
        final int i11 = 0;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.t0, 0, org.telegram.messenger.g0.L(6.0f) + this.t0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ch0Var.setScaleType(scaleType);
        ch0Var.setImageResource(R.drawable.large_ads_info);
        ch0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        ch0Var.setBackground(L);
        org.telegram.ui.ActionBar.r6.k(ch0Var, L, N, null, f6Var);
        frameLayout.addView(ch0Var, c8.ha.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (c20Var != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.r5, null, PorterDuff.Mode.SRC_ATOP);
            int i12 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 1, -1);
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N2, null);
            f6Var2 = f6Var;
            imageView.setOnClickListener(new di.u3(this, c20Var, f6Var, imageView, 15));
            frameLayout.addView(imageView, c8.ha.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            f6Var2 = f6Var;
        }
        linearLayout.addView(frameLayout, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131754943, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i13, f6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.hd.M0(2131746045, null));
        org.telegram.ui.ActionBar.r6.V(f10, i13, f6Var2);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, c8.ha.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new sq0(this, context, R.drawable.menu_privacy, org.telegram.messenger.hd.M0(z9 ? 2131746041 : 2131746042, null), org.telegram.messenger.hd.M0(z9 ? 2131746043 : 2131746044, null)), c8.ha.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new sq0(this, context, R.drawable.menu_feature_split, org.telegram.messenger.hd.M0(z9 ? 2131746037 : 2131746038, null), org.telegram.messenger.hd.M0(z9 ? 2131746039 : 2131746040, null)), c8.ha.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String a02 = org.telegram.messenger.hd.a0(null, null, z9 ? 2131746035 : 2131746036, Integer.valueOf(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).z4));
        int i14 = org.telegram.ui.ActionBar.k6.Uc;
        linearLayout.addView(new sq0(this, context, R.drawable.menu_feature_noads, org.telegram.messenger.hd.M0(2131746034, null), org.telegram.messenger.g0.S2(a02, i14, 0, new Runnable(this) { // from class: org.telegram.ui.ry0
            public final /* synthetic */ sy0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i15 = i11;
                sy0 sy0Var = this.b;
                switch (i15) {
                    case 0:
                        sy0Var.getClass();
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            sy0Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        sy0Var.dismiss();
                        vf.c.t(sy0Var.getContext(), org.telegram.messenger.hd.M0(2131746617, null));
                        break;
                }
            }
        }, null)), c8.ha.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, f6Var2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.hd.M0(z9 ? 2131746029 : 2131746030, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.V(textView2, i13, f6Var2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.ha.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(z9 ? 2131746032 : 2131746033, null));
        SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131746031, null), i14, 0, new Runnable(this) { // from class: org.telegram.ui.ry0
            public final /* synthetic */ sy0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i15 = i7;
                sy0 sy0Var = this.b;
                switch (i15) {
                    case 0:
                        sy0Var.getClass();
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            sy0Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        sy0Var.dismiss();
                        vf.c.t(sy0Var.getContext(), org.telegram.messenger.hd.M0(2131746617, null));
                        break;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.attach_arrow_right, 0);
        this.Q1 = wpVar;
        wpVar.y = org.telegram.ui.ActionBar.k6.x0(null, i14, false);
        wpVar.H = 0.7f;
        wpVar.I = 0.7f;
        wpVar.E = org.telegram.messenger.g0.L(12.0f);
        wpVar.s = 1.0f;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(X2, S2, "%1$s"), spannableString, ">");
        org.telegram.ui.Components.w70 w70Var = new org.telegram.ui.Components.w70(context, null);
        this.R1 = w70Var;
        w70Var.setText(K2);
        org.telegram.ui.ActionBar.r6.V(w70Var, i13, f6Var2);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setGravity(1);
        w70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(w70Var, c8.ha.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Gi, f6Var2);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.hd.M0(2131746046, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.z5.e(org.telegram.ui.ActionBar.k6.w0(i10, f6Var2), 6.0f);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 f11 = org.telegram.ui.ActionBar.r6.f(i10);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.r6.k(textView3, e10, N3, f11, f6Var2);
        textView3.setOnClickListener(new my0(this, i7));
        linearLayout.addView(textView3, c8.ha.t(-1, 48, 0, 14, 22, 14, 14));
        this.S1.O(false);
    }

    public static sy0 d1(Context context, org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.voip.k kVar) {
        sy0 sy0Var = new sy0(context, z9, f6Var, kVar);
        if (f2Var == null) {
            sy0Var.show();
            return sy0Var;
        }
        if (f2Var.getParentActivity() != null) {
            f2Var.showDialog(sy0Var);
        }
        return sy0Var;
    }

    public static void e1(Context context, org.telegram.ui.ActionBar.f6 f6Var, an anVar) {
        d1(context, anVar, false, f6Var, null);
    }

    @Override // org.telegram.ui.Components.na
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(pj0Var, getContext(), this.a, 0, true, new a5(this, 21), this.I0);
        this.S1 = l41Var;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131754943, null);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            org.telegram.ui.Components.wp wpVar = this.Q1;
            if (wpVar != null) {
                wpVar.y = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false);
                org.telegram.ui.Components.w70 w70Var = this.R1;
                if (w70Var != null) {
                    w70Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
