package org.telegram.ui;

import android.app.Activity;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class r10 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity, int i10, String str, TLObject tLObject, TL_fragment.TL_collectibleInfo tL_collectibleInfo, org.telegram.ui.ActionBar.c6 c6Var) {
        String str2;
        String str3;
        org.telegram.ui.ActionBar.f3 f3Var;
        String formatString;
        String b10;
        String str4;
        String str5;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.f3 f3Var2;
        vs vsVar;
        org.telegram.ui.ActionBar.f3 f3Var3 = new org.telegram.ui.ActionBar.f3(activity, c6Var, false, false);
        f3Var3.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        linearLayout.addView(frameLayout, i7.f6.t(80, 80, 1, 0, 16, 0, 16));
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(activity);
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = i10 == 0 ? 70 : 78;
        aj0Var.f(i10 == 0 ? R.raw.fragment_username : R.raw.fragment, i11, i11, null);
        aj0Var.d();
        aj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (i10 == 0) {
            aj0Var.setScaleX(0.86f);
            aj0Var.setScaleY(0.86f);
        } else {
            aj0Var.setTranslationY(AndroidUtilities.dp(2.0f));
        }
        frameLayout.addView(aj0Var, i7.f6.q(-1, -1, 17));
        if (tLObject instanceof TLRPC.User) {
            str3 = UserObject.getUserName((TLRPC.User) tLObject);
        } else {
            if (!(tLObject instanceof TLRPC.Chat)) {
                str2 = "";
                String formatCurrency = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
                String formatCurrency2 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
                if (i10 != 0) {
                    f3Var = f3Var3;
                    String formatString2 = LocaleController.formatString(R.string.FragmentUsernameTitle, u3.c.e("@", str));
                    formatString = LocaleController.formatString(R.string.FragmentUsernameMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : a4.w.n("(", formatCurrency, ")"));
                    b10 = a4.w.o(MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix, "/", str, new StringBuilder());
                    str4 = formatString2;
                } else {
                    f3Var = f3Var3;
                    if (i10 != 1) {
                        return;
                    }
                    String formatString3 = LocaleController.formatString(R.string.FragmentPhoneTitle, qe.b.c().b("+" + str));
                    formatString = LocaleController.formatString(R.string.FragmentPhoneMessage, LocaleController.formatShortDateTime(tL_collectibleInfo.purchase_date), formatCurrency2, TextUtils.isEmpty(formatCurrency) ? "" : a4.w.n("(", formatCurrency, ")"));
                    b10 = qe.b.c().b("+" + str);
                    str4 = formatString3;
                }
                String str6 = formatString;
                str5 = b10;
                if (str5 == null) {
                    c6Var2 = c6Var;
                    org.telegram.ui.ActionBar.f3 f3Var4 = f3Var;
                    vsVar = new vs(str5, i10, f3Var4, c6Var2, 1);
                    f3Var2 = f3Var4;
                } else {
                    c6Var2 = c6Var;
                    f3Var2 = f3Var;
                    vsVar = null;
                }
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(str4, vsVar);
                SpannableString spannableString = new SpannableString("TON");
                org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.mini_gram_16, 0);
                iqVar.setWidth(AndroidUtilities.dp(13.0f));
                spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
                SpannableStringBuilder replaceCharSequence = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str6), spannableString);
                org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(activity, null);
                y80Var.setTypeface(AndroidUtilities.bold());
                y80Var.setGravity(17);
                int i12 = org.telegram.ui.ActionBar.g6.j5;
                y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var2));
                y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.o6, c6Var2));
                y80Var.setTextSize(1, 16.0f);
                y80Var.setText(replaceSingleTag);
                linearLayout.addView(y80Var, i7.f6.t(-1, -2, 1, 42, 0, 42, 0));
                FrameLayout frameLayout2 = new FrameLayout(activity);
                frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ci, c6Var2)));
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(activity);
                t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                e9Var.p(tLObject);
                t9Var.e(tLObject, e9Var);
                frameLayout2.addView(t9Var, i7.f6.e(28, 28, 51));
                TextView textView = new TextView(activity);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var2));
                textView.setTextSize(1, 13.0f);
                textView.setSingleLine();
                textView.setText(Emoji.replaceEmoji(str2, textView.getPaint().getFontMetricsInt(), false));
                frameLayout2.addView(textView, i7.f6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
                linearLayout.addView(frameLayout2, i7.f6.t(-2, 28, 1, 42, 10, 42, 18));
                TextView textView2 = new TextView(activity);
                textView2.setGravity(17);
                b.m(i12, c6Var2, textView2, 1, 14.0f);
                textView2.setText(replaceCharSequence);
                linearLayout.addView(textView2, i7.f6.t(-1, -2, 1, 32, 0, 32, 19));
                nh.d dVar = new nh.d(activity, c6Var2, true);
                dVar.setRoundRadius(24);
                dVar.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
                dVar.setOnClickListener(new org.telegram.ui.Components.fi0(activity, tL_collectibleInfo));
                linearLayout.addView(dVar, i7.f6.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
                if (vsVar != null) {
                    nh.d dVar2 = new nh.d(activity, c6Var2, true);
                    dVar2.setRoundRadius(24);
                    dVar2.d();
                    dVar2.g(LocaleController.getString(i10 == 0 ? R.string.FragmentUsernameCopy : R.string.FragmentPhoneCopy), false, true);
                    dVar2.setOnClickListener(new org.telegram.ui.Components.fi0(26, vsVar, f3Var2));
                    linearLayout.addView(dVar2, i7.f6.k(6.0f, 6.0f, 6.0f, 0.0f, -1, 48));
                }
                f3Var2.setCustomView(linearLayout);
                f3Var2.show();
            }
            str3 = ((TLRPC.Chat) tLObject).title;
        }
        str2 = str3;
        String formatCurrency3 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.amount, tL_collectibleInfo.currency);
        String formatCurrency22 = BillingController.getInstance().formatCurrency(tL_collectibleInfo.crypto_amount, tL_collectibleInfo.crypto_currency);
        if (i10 != 0) {
        }
        String str62 = formatString;
        str5 = b10;
        if (str5 == null) {
        }
        SpannableStringBuilder replaceSingleTag2 = AndroidUtilities.replaceSingleTag(str4, vsVar);
        SpannableString spannableString2 = new SpannableString("TON");
        org.telegram.ui.Components.iq iqVar2 = new org.telegram.ui.Components.iq(R.drawable.mini_gram_16, 0);
        iqVar2.setWidth(AndroidUtilities.dp(13.0f));
        spannableString2.setSpan(iqVar2, 0, spannableString2.length(), 33);
        SpannableStringBuilder replaceCharSequence2 = AndroidUtilities.replaceCharSequence("TON", AndroidUtilities.replaceTags(str62), spannableString2);
        org.telegram.ui.Components.y80 y80Var2 = new org.telegram.ui.Components.y80(activity, null);
        y80Var2.setTypeface(AndroidUtilities.bold());
        y80Var2.setGravity(17);
        int i122 = org.telegram.ui.ActionBar.g6.j5;
        y80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i122, c6Var2));
        y80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.o6, c6Var2));
        y80Var2.setTextSize(1, 16.0f);
        y80Var2.setText(replaceSingleTag2);
        linearLayout.addView(y80Var2, i7.f6.t(-1, -2, 1, 42, 0, 42, 0));
        FrameLayout frameLayout22 = new FrameLayout(activity);
        frameLayout22.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ci, c6Var2)));
        org.telegram.ui.Components.t9 t9Var2 = new org.telegram.ui.Components.t9(activity);
        t9Var2.setRoundRadius(AndroidUtilities.dp(28.0f));
        org.telegram.ui.Components.e9 e9Var2 = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        e9Var2.p(tLObject);
        t9Var2.e(tLObject, e9Var2);
        frameLayout22.addView(t9Var2, i7.f6.e(28, 28, 51));
        TextView textView3 = new TextView(activity);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i122, c6Var2));
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine();
        textView3.setText(Emoji.replaceEmoji(str2, textView3.getPaint().getFontMetricsInt(), false));
        frameLayout22.addView(textView3, i7.f6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
        linearLayout.addView(frameLayout22, i7.f6.t(-2, 28, 1, 42, 10, 42, 18));
        TextView textView22 = new TextView(activity);
        textView22.setGravity(17);
        b.m(i122, c6Var2, textView22, 1, 14.0f);
        textView22.setText(replaceCharSequence2);
        linearLayout.addView(textView22, i7.f6.t(-1, -2, 1, 32, 0, 32, 19));
        nh.d dVar3 = new nh.d(activity, c6Var2, true);
        dVar3.setRoundRadius(24);
        dVar3.g(LocaleController.getString(R.string.FragmentUsernameOpen), false, true);
        dVar3.setOnClickListener(new org.telegram.ui.Components.fi0(activity, tL_collectibleInfo));
        linearLayout.addView(dVar3, i7.f6.k(6.0f, 0.0f, 6.0f, 0.0f, -1, 48));
        if (vsVar != null) {
        }
        f3Var2.setCustomView(linearLayout);
        f3Var2.show();
    }
}
