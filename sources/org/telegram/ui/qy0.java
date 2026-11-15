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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qy0 extends org.telegram.ui.Components.ja {
    public final LinearLayout T1;
    public final org.telegram.ui.Components.eq U1;
    public final org.telegram.ui.Components.z70 V1;
    public org.telegram.ui.Components.p41 W1;

    public qy0(Context context, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.z10 z10Var) {
        super(context, null, false, false, e6Var);
        org.telegram.ui.ActionBar.e6 e6Var2;
        O();
        this.v1 = 0.2f;
        final int i7 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        final int i11 = 0;
        linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + this.u0, 0, org.telegram.messenger.g0.L(6.0f) + this.u0, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        fh0Var.setScaleType(scaleType);
        fh0Var.setImageResource(R.drawable.large_ads_info);
        fh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable L = org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(80.0f), org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        fh0Var.setBackground(L);
        org.telegram.ui.ActionBar.q6.j(fh0Var, L, M, null, e6Var);
        frameLayout.addView(fh0Var, c8.ja.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (z10Var != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.r5, null, PorterDuff.Mode.SRC_ATOP);
            int i12 = org.telegram.ui.ActionBar.j6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i12, false), 1, -1);
            org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i12);
            imageView.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M2, null);
            e6Var2 = e6Var;
            imageView.setOnClickListener(new bi.f4(this, z10Var, e6Var, imageView, 16));
            frameLayout.addView(imageView, c8.ja.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            e6Var2 = e6Var;
        }
        linearLayout.addView(frameLayout, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(org.telegram.messenger.hd.M0(2131754943, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i13, e6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.i20.f(linearLayout, textView, c8.ja.t(-2, -2, 1, 22, 14, 22, 0), context);
        f10.setText(org.telegram.messenger.hd.M0(2131746044, null));
        org.telegram.ui.ActionBar.q6.U(f10, i13, e6Var2);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        linearLayout.addView(f10, c8.ja.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new eh0(this, context, R.drawable.menu_privacy, org.telegram.messenger.hd.M0(z10 ? 2131746040 : 2131746041, null), org.telegram.messenger.hd.M0(z10 ? 2131746042 : 2131746043, null)), c8.ja.q(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new eh0(this, context, R.drawable.menu_feature_split, org.telegram.messenger.hd.M0(z10 ? 2131746036 : 2131746037, null), org.telegram.messenger.hd.M0(z10 ? 2131746038 : 2131746039, null)), c8.ja.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String a02 = org.telegram.messenger.hd.a0(null, null, z10 ? 2131746034 : 2131746035, Integer.valueOf(org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).A4));
        int i14 = org.telegram.ui.ActionBar.j6.Xc;
        linearLayout.addView(new eh0(this, context, R.drawable.menu_feature_noads, org.telegram.messenger.hd.M0(2131746033, null), org.telegram.messenger.g0.S2(a02, i14, 0, new Runnable(this) { // from class: org.telegram.ui.py0
            public final /* synthetic */ qy0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i15 = i11;
                qy0 qy0Var = this.b;
                switch (i15) {
                    case 0:
                        qy0Var.getClass();
                        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            qy0Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        qy0Var.dismiss();
                        vf.c.t(qy0Var.getContext(), org.telegram.messenger.hd.M0(2131746618, null));
                        break;
                }
            }
        }, null)), c8.ja.q(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d7, view, e6Var2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(org.telegram.messenger.hd.M0(z10 ? 2131746028 : 2131746029, null));
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.U(textView2, i13, e6Var2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, c8.ja.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(z10 ? 2131746031 : 2131746032, null));
        SpannableStringBuilder S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131746030, null), i14, 0, new Runnable(this) { // from class: org.telegram.ui.py0
            public final /* synthetic */ qy0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i15 = i7;
                qy0 qy0Var = this.b;
                switch (i15) {
                    case 0:
                        qy0Var.getClass();
                        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.q0(3)));
                            qy0Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        qy0Var.dismiss();
                        vf.c.t(qy0Var.getContext(), org.telegram.messenger.hd.M0(2131746618, null));
                        break;
                }
            }
        }, null);
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.attach_arrow_right, 0);
        this.U1 = eqVar;
        eqVar.y = org.telegram.ui.ActionBar.j6.x0(null, i14, false);
        eqVar.I = 0.7f;
        eqVar.J = 0.7f;
        eqVar.F = org.telegram.messenger.g0.L(12.0f);
        eqVar.s = 1.0f;
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder K2 = org.telegram.messenger.g0.K2(org.telegram.messenger.g0.K2(X2, S2, "%1$s"), spannableString, ">");
        org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context, null);
        this.V1 = z70Var;
        z70Var.setText(K2);
        org.telegram.ui.ActionBar.q6.U(z70Var, i13, e6Var2);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setGravity(1);
        z70Var.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(z70Var, c8.ja.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.Ji, e6Var2);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(org.telegram.messenger.hd.M0(2131746045, null));
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.y5.e(org.telegram.ui.ActionBar.j6.w0(i10, e6Var2), 6.0f);
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.m6 e11 = org.telegram.ui.ActionBar.q6.e(i10);
        textView3.setBackground(e10);
        org.telegram.ui.ActionBar.q6.j(textView3, e10, M3, e11, e6Var2);
        textView3.setOnClickListener(new ky0(this, i7));
        linearLayout.addView(textView3, c8.ja.t(-1, 48, 0, 14, 22, 14, 14));
        this.W1.O(false);
    }

    public static qy0 d1(Context context, org.telegram.ui.ActionBar.e2 e2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var, li.v vVar) {
        qy0 qy0Var = new qy0(context, z10, e6Var, vVar);
        if (e2Var == null) {
            qy0Var.show();
            return qy0Var;
        }
        if (e2Var.getParentActivity() != null) {
            e2Var.showDialog(qy0Var);
        }
        return qy0Var;
    }

    public static void e1(Context context, org.telegram.ui.ActionBar.e6 e6Var, an anVar) {
        d1(context, anVar, false, e6Var, null);
    }

    @Override // org.telegram.ui.Components.ja
    public final org.telegram.ui.Components.tj0 L0(org.telegram.ui.Components.uj0 uj0Var) {
        org.telegram.ui.Components.p41 p41Var = new org.telegram.ui.Components.p41(uj0Var, getContext(), this.a, 0, true, new a5(this, 21), this.J0);
        this.W1 = p41Var;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return org.telegram.messenger.hd.M0(2131754943, null);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void s0() {
        super.s0();
        try {
            org.telegram.ui.Components.eq eqVar = this.U1;
            if (eqVar != null) {
                eqVar.y = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xc, false);
                org.telegram.ui.Components.z70 z70Var = this.V1;
                if (z70Var != null) {
                    z70Var.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
