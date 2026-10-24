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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class x21 extends org.telegram.ui.Components.bb {
    public final LinearLayout X;
    public final org.telegram.ui.Components.xq Y;
    public final org.telegram.ui.Components.y90 Z;
    public org.telegram.ui.Components.b71 a0;

    public x21(Context context, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, Utilities.Callback callback) {
        super(context, null, false, false, g6Var);
        org.telegram.ui.ActionBar.g6 g6Var2;
        fixNavigationBar();
        this.v = 0.2f;
        final int i10 = 1;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        final int i12 = 0;
        linearLayout.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        bk0Var.setScaleType(scaleType);
        bk0Var.setImageResource(R.drawable.large_ads_info);
        bk0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        bk0Var.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(bk0Var, K, O, null, g6Var);
        frameLayout.addView(bk0Var, w7.z5.d(80, 80.0f, 1, 0.0f, 20.0f, 0.0f, 0.0f));
        if (callback != null) {
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.r5, null, PorterDuff.Mode.SRC_ATOP);
            int i13 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i13, false), 1, -1);
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
            imageView.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O2, null);
            g6Var2 = g6Var;
            imageView.setOnClickListener(new ci.b4(this, callback, g6Var, imageView, 15));
            frameLayout.addView(imageView, w7.z5.d(24, 24.0f, 53, 12.0f, 14.0f, 14.0f, 12.0f));
        } else {
            g6Var2 = g6Var;
        }
        linearLayout.addView(frameLayout, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 100));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.AboutRevenueSharingAds));
        textView.setTypeface(AndroidUtilities.bold());
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i14, g6Var2);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(1);
        TextView f7 = org.telegram.messenger.sl.f(linearLayout, textView, w7.z5.t(-2, -2, 1, 22, 14, 22, 0), context);
        f7.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertSubtitle));
        org.telegram.ui.ActionBar.r6.W(f7, i14, g6Var2);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(1);
        linearLayout.addView(f7, w7.z5.t(-2, -2, 1, 22, 8, 22, 0));
        linearLayout.addView(new ci.h4(this, context, R.drawable.menu_privacy, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1TitleBot : R.string.RevenueSharingAdsInfo1Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo1SubtitleBot : R.string.RevenueSharingAdsInfo1Subtitle)), w7.z5.p(-1, -2, 0.0f, 0, 0, 20, 0, 0));
        linearLayout.addView(new ci.h4(this, context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2TitleBot : R.string.RevenueSharingAdsInfo2Title), LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo2SubtitleBot : R.string.RevenueSharingAdsInfo2Subtitle)), w7.z5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        String formatString = LocaleController.formatString(z10 ? R.string.RevenueSharingAdsInfo3SubtitleBot : R.string.RevenueSharingAdsInfo3Subtitle, Integer.valueOf(MessagesController.getInstance(UserConfig.selectedAccount).channelRestrictSponsoredLevelMin));
        int i15 = org.telegram.ui.ActionBar.k6.gc;
        linearLayout.addView(new ci.h4(this, context, R.drawable.menu_feature_noads, LocaleController.getString(R.string.RevenueSharingAdsInfo3Title), AndroidUtilities.replaceSingleTag(formatString, i15, 0, new Runnable(this) { // from class: org.telegram.ui.w21
            public final /* synthetic */ x21 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        x21 x21Var = this.b;
                        x21Var.getClass();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            x21Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        x21 x21Var2 = this.b;
                        x21Var2.dismiss();
                        pf.d.r(x21Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        })), w7.z5.p(-1, -2, 0.0f, 0, 0, 16, 0, 0));
        View view = new View(getContext());
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, g6Var2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
        layoutParams.setMargins(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
        linearLayout.addView(view, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4TitleBot : R.string.RevenueSharingAdsInfo4Title));
        textView2.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.W(textView2, i14, g6Var2);
        textView2.setTextSize(1, 20.0f);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        linearLayout.addView(textView2, w7.z5.t(-2, -2, 1, 22, 0, 22, 0));
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.RevenueSharingAdsInfo4Subtitle2Bot : R.string.RevenueSharingAdsInfo4Subtitle2));
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.RevenueSharingAdsInfo4SubtitleLearnMore), i15, 0, new Runnable(this) { // from class: org.telegram.ui.w21
            public final /* synthetic */ x21 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        x21 x21Var = this.b;
                        x21Var.getClass();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(3)));
                            x21Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        x21 x21Var2 = this.b;
                        x21Var2.dismiss();
                        pf.d.r(x21Var2.getContext(), LocaleController.getString(R.string.PromoteUrl));
                        break;
                }
            }
        });
        SpannableString spannableString = new SpannableString(">");
        org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.attach_arrow_right, 0);
        this.Y = xqVar;
        xqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.x0(null, i15, false));
        xqVar.setScale(0.7f, 0.7f);
        xqVar.setWidth(AndroidUtilities.dp(12.0f));
        xqVar.setTranslateY(1.0f);
        spannableString.setSpan(xqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence(">", AndroidUtilities.replaceCharSequence("%1$s", replaceTags, replaceSingleTag), spannableString);
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(context, null);
        this.Z = y90Var;
        y90Var.setText(replaceCharSequence);
        org.telegram.ui.ActionBar.r6.W(y90Var, i14, g6Var2);
        y90Var.setTextSize(1, 14.0f);
        y90Var.setGravity(1);
        y90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        linearLayout.addView(y90Var, w7.z5.t(-2, -2, 1, 26, 8, 26, 0));
        TextView textView3 = new TextView(context);
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(17);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.Sh, g6Var2);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextSize(1, 14.0f);
        textView3.setText(LocaleController.getString(R.string.RevenueSharingAdsAlertButton));
        org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{6.0f}, org.telegram.ui.ActionBar.k6.w0(i11, g6Var2));
        org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i11);
        org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i11);
        textView3.setBackground(e);
        org.telegram.ui.ActionBar.r6.k(textView3, e, O3, f10, g6Var2);
        textView3.setOnClickListener(new w50(this, 29));
        linearLayout.addView(textView3, w7.z5.t(-1, 48, 0, 14, 22, 14, 14));
        this.a0.N(false);
    }

    public static x21 T(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.m3 m3Var) {
        x21 x21Var = new x21(context, z10, g6Var, m3Var);
        if (o2Var == null) {
            x21Var.show();
            return x21Var;
        }
        if (o2Var.getParentActivity() != null) {
            o2Var.showDialog(x21Var);
        }
        return x21Var;
    }

    public static void U(Context context, org.telegram.ui.ActionBar.g6 g6Var, sn snVar) {
        T(context, snVar, false, g6Var, null);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.xq xqVar = this.Y;
            if (xqVar != null) {
                xqVar.setOverrideColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.gc, false));
                org.telegram.ui.Components.y90 y90Var = this.Z;
                if (y90Var != null) {
                    y90Var.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.lm0 w(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.b71 b71Var = new org.telegram.ui.Components.b71(mm0Var, getContext(), this.currentAccount, 0, true, new f5(this, 20), this.resourcesProvider);
        this.a0 = b71Var;
        return b71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        return LocaleController.getString(R.string.AboutRevenueSharingAds);
    }
}
