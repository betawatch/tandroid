package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class w31 extends org.telegram.ui.Components.sa {
    public final LinearLayout U;
    public org.telegram.ui.Components.w51 V;

    public w31(Context context, boolean z4, org.telegram.ui.ActionBar.g6 g6Var, Utilities.Callback callback) {
        super(context, null, false, false, false, 1, g6Var);
        org.telegram.ui.ActionBar.g6 g6Var2;
        fixNavigationBar();
        this.v = 0.2f;
        final int i10 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        kj0Var.setScaleType(scaleType);
        kj0Var.setImageResource(R.drawable.large_ads_info);
        kj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        kj0Var.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.v0(i11, g6Var)));
        frameLayout.addView(kj0Var, k7.c6.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (callback != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView.setScaleType(scaleType);
            imageView.setColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.r5, false));
            imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false), 1, -1));
            g6Var2 = g6Var;
            imageView.setOnClickListener(new lh.u3(this, callback, g6Var, imageView, 13));
            frameLayout.addView(imageView, k7.c6.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            g6Var2 = g6Var;
        }
        linearLayout.addView(frameLayout, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        b.l(i13, g6Var2, textView, 1, 20.0f);
        textView.setGravity(1);
        TextView i14 = yh.i(linearLayout, textView, k7.c6.t(-2, -2, 1, 22, 14, 22, 0), context);
        i14.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        i14.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var2));
        i14.setTextSize(1, 14.0f);
        i14.setGravity(1);
        linearLayout.addView(i14, k7.c6.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new eh.d(this, context, R.drawable.menu_privacy, LocaleController.getString(z4 ? R.string.RevenueSharingAdsInfo1TitleBot : R.string.RevenueSharingAdsInfo1Title), LocaleController.getString(z4 ? R.string.RevenueSharingAdsInfo1SubtitleBot : R.string.RevenueSharingAdsInfo1Subtitle)), k7.c6.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new eh.d(this, context, R.drawable.menu_feature_split, LocaleController.getString(z4 ? R.string.RevenueSharingAdsInfo2TitleBot : R.string.RevenueSharingAdsInfo2Title), LocaleController.getString(z4 ? R.string.RevenueSharingAdsInfo2SubtitleBot : R.string.RevenueSharingAdsInfo2Subtitle)), k7.c6.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String formatString = LocaleController.formatString(z4 ? R.string.RevenueSharingAdsInfo3SubtitleBot : R.string.RevenueSharingAdsInfo3Subtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i15 = org.telegram.ui.ActionBar.k6.gc;
        linearLayout.addView(new eh.d(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(formatString, i15, 0, new Runnable(this) { // from class: org.telegram.ui.u31
            public final /* synthetic */ w31 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        w31 w31Var = this.b;
                        w31Var.getClass();
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            w31Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        w31 w31Var2 = this.b;
                        w31Var2.dismiss();
                        af.g.s(w31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        })), k7.c6.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d7, g6Var2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(z4 ? R.string.RevenueSharingAdsInfo4TitleBot : R.string.RevenueSharingAdsInfo4Title));
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var2));
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, k7.c6.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(z4 ? R.string.RevenueSharingAdsInfo4Subtitle2Bot : R.string.RevenueSharingAdsInfo4Subtitle2));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i15, 0, new Runnable(this) { // from class: org.telegram.ui.u31
            public final /* synthetic */ w31 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        w31 w31Var = this.b;
                        w31Var.getClass();
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            w31Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        w31 w31Var2 = this.b;
                        w31Var2.dismiss();
                        af.g.s(w31Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.attach_arrow_right, 0);
        oqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        oqVar.setScale(0.7f, 0.7f);
        oqVar.setWidth(AndroidUtilities.dp(12.0f));
        oqVar.setTranslateY(1.0f);
        spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", replaceTags, replaceSingleTag), spannableString);
        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(context, null);
        g90Var.setText(replaceCharSequence);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var2));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setGravity(1);
        g90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(g90Var, k7.c6.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g6Var2));
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        textView3.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{6.0f}, org.telegram.ui.ActionBar.k6.v0(i11, g6Var2)));
        textView3.setOnClickListener(new v31(this, i12));
        linearLayout.addView(textView3, k7.c6.t(-1, 48, 0, 14, 22, 14, 14));
        this.V.N(false);
    }

    public static w31 T(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var, lh.a1 a1Var) {
        w31 w31Var = new w31(context, z4, g6Var, a1Var);
        if (p2Var == null) {
            w31Var.show();
            return w31Var;
        }
        if (p2Var.getParentActivity() != null) {
            p2Var.showDialog(w31Var);
        }
        return w31Var;
    }

    public static void U(Context context, org.telegram.ui.ActionBar.g6 g6Var, xn xnVar) {
        T(context, xnVar, false, g6Var, null);
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.rl0 v(org.telegram.ui.Components.sl0 sl0Var) {
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(sl0Var, getContext(), this.currentAccount, 0, true, new d5(this, 20), this.resourcesProvider);
        this.V = w51Var;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
