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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public abstract class t10 {
    public static void a(Activity activity, int i10, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.g6 g6Var) {
        String formatString;
        String formatString2;
        String b10;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) activity, g6Var, false);
        h3Var.fixNavigationBarKey(org.telegram.ui.ActionBar.k6.h5);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        int dp = AndroidUtilities.dp(80.0f);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        frameLayout.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout, K, O, null, g6Var);
        linearLayout.addView(frameLayout, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(activity);
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = i10 == 0 ? 70 : 78;
        bk0Var.f(i10 == 0 ? R.raw.fragment_username : R.raw.fragment, i12, i12, null);
        bk0Var.d();
        bk0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i10 == 0) {
            bk0Var.setScaleX(0.86f);
            bk0Var.setScaleY(0.86f);
        } else {
            bk0Var.setTranslationY(AndroidUtilities.dp(2.0f));
        }
        frameLayout.addView(bk0Var, w7.z5.q(-1, -1, 17));
        String userName = tLObject instanceof TLRPC.User ? UserObject.getUserName((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
        String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i10 == 0) {
            String formatString3 = LocaleController.formatString(R.string.FragmentUsernameTitle, si.o0.h("@", str));
            formatString2 = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : a1.g.p("(", formatCurrency, ")"));
            b10 = a1.g.q(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
            formatString = formatString3;
        } else {
            if (i10 != 1) {
                return;
            }
            formatString = LocaleController.formatString(R.string.FragmentPhoneTitle, jf.b.c().b("+" + str));
            formatString2 = LocaleController.formatString(R.string.FragmentPhoneMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : a1.g.p("(", formatCurrency, ")"));
            b10 = jf.b.c().b("+" + str);
        }
        org.telegram.ui.Components.fz0 fz0Var = b10 != null ? new org.telegram.ui.Components.fz0(b10, i10, h3Var, g6Var) : null;
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(formatString, fz0Var);
        SpannableString spannableString = new SpannableString("TON");
        org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.mini_gram_16, 0);
        xqVar.recolorDrawable = false;
        xqVar.setWidth(AndroidUtilities.dp(13.0f));
        spannableString.setSpan(xqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(formatString2), spannableString);
        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(activity, null);
        y90Var.setTypeface(AndroidUtilities.bold());
        y90Var.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.W(y90Var, i13, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.o6, g6Var);
        y90Var.setTextSize(1, 16.0f);
        y90Var.setText(replaceSingleTag);
        linearLayout.addView(y90Var, w7.z5.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        int dp2 = AndroidUtilities.dp(28.0f);
        int dp3 = AndroidUtilities.dp(28.0f);
        int i14 = org.telegram.ui.ActionBar.k6.ci;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(dp2, dp3, org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i14);
        frameLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout2, d02, O2, null, g6Var);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        h9Var.p(tLObject);
        w9Var.e(tLObject, h9Var);
        frameLayout2.addView(w9Var, w7.z5.e(28, 28, 51));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.r6.W(textView, i13, g6Var);
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(Emoji.replaceEmoji(userName, textView.getPaint().getFontMetricsInt(), false));
        frameLayout2.addView(textView, w7.z5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, w7.z5.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(textView2, i13, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(replaceCharSequence);
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 32, 0, 32, 19));
        ei.d dVar = new ei.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        dVar.i(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        dVar.setOnClickListener(new org.telegram.ui.Components.d51(18, activity, tL_collectibleInfo));
        linearLayout.addView(dVar, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (fz0Var != null) {
            ei.d dVar2 = new ei.d(activity, g6Var, true);
            dVar2.setRoundRadius(24);
            dVar2.e();
            dVar2.i(LocaleController.getString(i10 == 0 ? R.string.FragmentUsernameCopy : R.string.FragmentPhoneCopy), false, true);
            dVar2.setOnClickListener(new org.telegram.ui.Components.d51(19, fz0Var, h3Var));
            linearLayout.addView(dVar2, w7.z5.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        h3Var.setCustomView(linearLayout);
        h3Var.show();
    }
}
