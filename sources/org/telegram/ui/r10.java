package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public abstract class r10 {
    public static void a(Activity activity, int i10, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.d6 d6Var) {
        String formatString;
        String formatString2;
        String b10;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) activity, d6Var, false);
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
        linearLayout.addView(frameLayout, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(activity);
        xj0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = i10 == 0 ? 70 : 78;
        xj0Var.f(i10 == 0 ? R.raw.fragment_username : R.raw.fragment, i11, i11, null);
        xj0Var.d();
        xj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i10 == 0) {
            xj0Var.setScaleX(0.86f);
            xj0Var.setScaleY(0.86f);
        } else {
            xj0Var.setTranslationY(AndroidUtilities.dp(2.0f));
        }
        frameLayout.addView(xj0Var, w7.z5.q(-1, -1, 17));
        String userName = tLObject instanceof TLRPC.User ? UserObject.getUserName((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : "";
        String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i10 == 0) {
            String formatString3 = LocaleController.formatString(R.string.FragmentUsernameTitle, r4.c.h("@", str));
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
        org.telegram.ui.Components.az0 az0Var = b10 != null ? new org.telegram.ui.Components.az0(b10, i10, f3Var, d6Var) : null;
        SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(formatString, az0Var);
        SpannableString spannableString = new SpannableString("TON");
        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.mini_gram_16, 0);
        yqVar.recolorDrawable = false;
        yqVar.setWidth(AndroidUtilities.dp(13.0f));
        spannableString.setSpan(yqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(formatString2), spannableString);
        org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(activity, null);
        x90Var.setTypeface(AndroidUtilities.bold());
        x90Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.h6.j5;
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.o6, d6Var));
        x90Var.setTextSize(1, 16.0f);
        x90Var.setText(replaceSingleTag);
        linearLayout.addView(x90Var, w7.z5.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.ci, d6Var)));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(tLObject);
        w9Var.e(tLObject, h9Var);
        frameLayout2.addView(w9Var, w7.z5.e(28, 28, 51));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        textView.setTextSize(1, 13.0f);
        textView.setSingleLine();
        textView.setText(Emoji.replaceEmoji(userName, textView.getPaint().getFontMetricsInt(), false));
        frameLayout2.addView(textView, w7.z5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout2, w7.z5.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView2 = new TextView(activity);
        textView2.setGravity(17);
        org.telegram.messenger.lk.o(i12, d6Var, textView2, 1, 14.0f);
        textView2.setText(replaceCharSequence);
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 32, 0, 32, 19));
        ei.d dVar = new ei.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        dVar.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        dVar.setOnClickListener(new org.telegram.ui.Components.g51(17, activity, tL_collectibleInfo));
        linearLayout.addView(dVar, w7.z5.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (az0Var != null) {
            ei.d dVar2 = new ei.d(activity, d6Var, true);
            dVar2.setRoundRadius(24);
            dVar2.d();
            dVar2.g(LocaleController.getString(i10 == 0 ? R.string.FragmentUsernameCopy : R.string.FragmentPhoneCopy), false, true);
            dVar2.setOnClickListener(new org.telegram.ui.Components.g51(18, az0Var, f3Var));
            linearLayout.addView(dVar2, w7.z5.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
        }
        f3Var.setCustomView(linearLayout);
        f3Var.show();
    }
}
