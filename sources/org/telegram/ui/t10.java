package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class t10 {
    public static void a(Activity activity, int i10, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.u6 u6Var) {
        String formatString;
        String formatString2;
        String b10;
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) activity, u6Var, false);
        k3Var.fixNavigationBarKey(org.telegram.ui.ActionBar.y6.h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int dp = AndroidUtilities.dp(80.0f);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        frameLayout.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout, K, N, null, u6Var);
        linearLayout.addView(frameLayout, org.telegram.ui.Components.gb1.x(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(activity);
        ak0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = i10 == 0 ? 70 : 78;
        ak0Var.f(i10 == 0 ? R.raw.fragment_username : R.raw.fragment, i12, i12, null);
        ak0Var.d();
        ak0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i10 == 0) {
            ak0Var.setScaleX(0.86f);
            ak0Var.setScaleY(0.86f);
        } else {
            ak0Var.setTranslationY(AndroidUtilities.dp(2.0f));
        }
        frameLayout.addView(ak0Var, org.telegram.ui.Components.gb1.u(-1, -1, 17));
        String userName = tLObject instanceof TLRPC.User ? UserObject.getUserName((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
        String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i10 == 0) {
            String formatString3 = LocaleController.formatString(R.string.FragmentUsernameTitle, org.telegram.ui.Components.b10.j("@", str));
            formatString2 = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : a1.g.p("(", formatCurrency, ")"));
            b10 = a1.g.q(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
            formatString = formatString3;
        } else {
            if (i10 != 1) {
                return;
            }
            formatString = LocaleController.formatString(R.string.FragmentPhoneTitle, kf.b.c().b("+" + str));
            formatString2 = LocaleController.formatString(R.string.FragmentPhoneMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : a1.g.p("(", formatCurrency, ")"));
            b10 = kf.b.c().b("+" + str);
        }
        org.telegram.ui.Components.zr0 zr0Var = b10 != null ? new org.telegram.ui.Components.zr0(b10, i10, k3Var, u6Var) : null;
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(formatString, zr0Var);
        SpannableString spannableString = new SpannableString("TON");
        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.mini_gram_16, 0);
        zqVar.recolorDrawable = false;
        zqVar.setWidth(AndroidUtilities.dp(13.0f));
        spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(formatString2), spannableString);
        org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(activity, null);
        z90Var.setTypeface(AndroidUtilities.bold());
        z90Var.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(z90Var, i13, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.o6, u6Var);
        z90Var.setTextSize(1, 16.0f);
        z90Var.setText(replaceSingleTag);
        linearLayout.addView(z90Var, org.telegram.ui.Components.gb1.x(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int dp2 = AndroidUtilities.dp(28.0f);
        int dp3 = AndroidUtilities.dp(28.0f);
        int i14 = org.telegram.ui.ActionBar.y6.ci;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.y6.d0(dp2, dp3, org.telegram.ui.ActionBar.y6.w0(i14, u6Var));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i14);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, d02, N2, null, u6Var);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        j9Var.p(tLObject);
        y9Var.f(tLObject, j9Var);
        frameLayout2.addView(y9Var, org.telegram.ui.Components.gb1.i(28, 28, 51));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.f7.V(textView, i13, u6Var);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(Emoji.replaceEmoji(userName, textView.getPaint().getFontMetricsInt(), false));
        frameLayout2.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, org.telegram.ui.Components.gb1.x(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(textView2, i13, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(replaceCharSequence);
        linearLayout.addView(textView2, org.telegram.ui.Components.gb1.x(-1, -2, 1, 32, 0, 32, 19));
        fi.d dVar = new fi.d(activity, u6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        dVar.setOnClickListener(new org.telegram.ui.Components.k51(18, activity, tL_collectibleInfo));
        linearLayout.addView(dVar, org.telegram.ui.Components.gb1.o(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (zr0Var != null) {
            fi.d dVar2 = new fi.d(activity, u6Var, true);
            dVar2.setRoundRadius(24);
            dVar2.e();
            dVar2.i(LocaleController.getString(i10 == 0 ? R.string.FragmentUsernameCopy : R.string.FragmentPhoneCopy), false, true);
            dVar2.setOnClickListener(new org.telegram.ui.Components.k51(19, zr0Var, k3Var));
            linearLayout.addView(dVar2, org.telegram.ui.Components.gb1.o(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        k3Var.setCustomView(linearLayout);
        k3Var.show();
    }
}
