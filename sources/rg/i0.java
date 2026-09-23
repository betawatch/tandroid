package rg;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.p60;
import org.telegram.ui.xn;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class i0 extends LinearLayout {
    public TextView a;
    public TextView b;
    public final tg.b c;
    public LinearLayout d;
    public final /* synthetic */ j0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0d7d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0db2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0dca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0bdf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0554 A[LOOP:0: B:226:0x0552->B:227:0x0554, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0417  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i0(j0 j0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        String formatString;
        boolean z10;
        int i15;
        int i16;
        int i17;
        float f7;
        boolean z11;
        int i18;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int min;
        int i19;
        d6 d6Var;
        d6 d6Var2;
        ArrayList arrayList4;
        boolean z12;
        int i20;
        int i21;
        String str2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int size;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int size2;
        d6 d6Var3;
        int i27;
        int i28;
        d6 d6Var4;
        d6 d6Var5;
        d6 d6Var6;
        ArrayList arrayList9;
        int i29;
        ArrayList arrayList10;
        ArrayList arrayList11;
        int i30;
        int i31;
        int i32;
        int i33;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        d6 d6Var7;
        d6 d6Var8;
        int i34;
        int i35;
        d6 d6Var9;
        final int i36;
        d6 d6Var10;
        d6 d6Var11;
        d6 d6Var12;
        d6 d6Var13;
        d6 d6Var14;
        int i37;
        boolean z13;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3;
        float f10;
        float f11;
        int i38;
        n2 n2Var = j0Var.n;
        this.e = j0Var;
        setOrientation(1);
        i10 = ((f3) j0Var).backgroundPaddingLeft;
        int dp = AndroidUtilities.dp(6.0f) + i10;
        i11 = ((f3) j0Var).backgroundPaddingLeft;
        setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i11, 0);
        int i39 = j0Var.h0;
        i12 = ((f3) j0Var).currentAccount;
        androidx.emoji2.text.o u12 = j0.u1(i39, i12);
        j0Var.M0 = u12;
        int i40 = u12.a;
        i13 = ((f3) j0Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i13);
        boolean premiumFeaturesBlocked = messagesController.premiumFeaturesBlocked();
        boolean x12 = j0Var.x1();
        if (i39 == 31) {
            str = LocaleController.getString(x12 ? R.string.BoostingAdditionalFeaturesSubtitle : R.string.BoostingAdditionalFeaturesSubtitleChannel);
        } else if (i39 == 32) {
            str = j0Var.q1(true);
        } else if (i39 == 19) {
            org.telegram.ui.Cells.t1 t1Var = j0Var.g0;
            if (t1Var != null) {
                int i41 = t1Var.getMessageObject().messageOwner.from_boosts_applied;
                TLRPC.Chat s12 = j0Var.s1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("GroupBoostedByUserWithTimes", i41, UserObject.getFirstName(j0Var.g0.getCurrentUser())));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.GroupBoostedByUserWithDescription, s12 == null ? "" : s12.title));
                str = spannableStringBuilder.toString();
            } else if (n2Var instanceof p60) {
                str = LocaleController.formatPluralString("BoostingGroupBoostWhatAreBoostsDescription", tg.t.g(), new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(j0Var.q1(true));
                if (ChatObject.hasAdminRights(j0Var.s1()) && x12) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.BoostingPremiumUserCanBoostGroupWithLink));
                }
                str = spannableStringBuilder2.toString();
            }
        } else if (i39 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = j0Var.b0;
            if (tL_premium_boostsStatus4.level == 0) {
                int i42 = x12 ? R.string.GroupNeedBoostsDescription : R.string.ChannelNeedBoostsDescription;
                int i43 = tL_premium_boostsStatus4.next_level_boosts;
                str = LocaleController.formatString(i42, LocaleController.formatPluralString("MoreBoosts", i43, Integer.valueOf(i43)));
            } else {
                int i44 = x12 ? R.string.GroupNeedBoostsDescriptionNextLevel : R.string.ChannelNeedBoostsDescriptionNextLevel;
                int i45 = tL_premium_boostsStatus4.next_level_boosts;
                int i46 = tL_premium_boostsStatus4.boosts;
                str = LocaleController.formatString(i44, LocaleController.formatPluralString("MoreBoosts", i45 - i46, Integer.valueOf(i45 - i46)), LocaleController.formatPluralString("BoostStories", j0Var.b0.level + 1, new Object[0]));
            }
        } else if (i39 == 20) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(j0Var.o1()));
        } else if (i39 == 24) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(j0Var.o1()));
        } else if (i39 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i39 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i39 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i39 == 25) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i39 == 26) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i39 == 27) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i39 == 28) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(x12 ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i39 == 22) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i39 == 23) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else if (i39 == 21) {
            int i47 = j0Var.R0;
            str = LocaleController.formatPluralString("ReactionReachLvlForReaction", i47, Integer.valueOf(i47));
        } else if (i39 == 11) {
            formatString = !j0Var.Y ? ChatObject.isChannelAndNotMegaGroup(j0Var.O0) ? j0Var.B0.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsers2One, ContactsController.formatName((TLRPC.User) j0Var.B0.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers2", j0Var.B0.size(), Integer.valueOf(j0Var.B0.size())) : j0Var.B0.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsers2One, ContactsController.formatName((TLRPC.User) j0Var.B0.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers2", j0Var.B0.size(), Integer.valueOf(j0Var.B0.size())) : ChatObject.isChannelAndNotMegaGroup(j0Var.O0) ? j0Var.B0.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsersOne, ContactsController.formatName((TLRPC.User) j0Var.B0.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers", j0Var.B0.size(), Integer.valueOf(j0Var.B0.size())) : j0Var.B0.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsersOne, ContactsController.formatName((TLRPC.User) j0Var.B0.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers", j0Var.B0.size(), Integer.valueOf(j0Var.B0.size()));
            z10 = true;
            androidx.emoji2.text.o oVar = j0Var.M0;
            int i48 = oVar.b;
            int i49 = oVar.c;
            i15 = j0Var.w0;
            if (i39 != 3) {
                i38 = ((f3) j0Var).currentAccount;
                i15 = MessagesController.getInstance(i38).dialogFilters.size() - 1;
            } else if (i39 == 7) {
                i15 = UserConfig.getActivatedAccountsCount();
            } else if (i39 == 0) {
                i16 = ((f3) j0Var).currentAccount;
                ArrayList<TLRPC.Dialog> dialogs = MessagesController.getInstance(i16).getDialogs(0);
                int size3 = dialogs.size();
                int i50 = 0;
                for (int i51 = 0; i51 < size3; i51++) {
                    TLRPC.Dialog dialog = dialogs.get(i51);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                        i50++;
                    }
                }
                i15 = i50;
                i17 = ((f3) j0Var).currentAccount;
                if (!UserConfig.getInstance(i17).isPremium() || j0Var.N0) {
                    i15 = i49;
                    f7 = 1.0f;
                } else {
                    i15 = i15 < 0 ? i48 : i15;
                    if (i39 != 7) {
                        f10 = i15;
                        f11 = i49;
                    } else if (i15 > i48) {
                        f10 = i15 - i48;
                        f11 = i49 - i48;
                    } else {
                        f7 = 0.5f;
                    }
                    f7 = f10 / f11;
                }
                float f12 = i48 / i49;
                if (i39 == 18 && i39 != 20 && i39 != 24 && i39 != 25 && i39 != 26) {
                    if (i39 != 29 && i39 != 22 && i39 != 23 && i39 != 19 && i39 != 30 && i39 != 35 && i39 != 21 && i39 != 27 && i39 != 28 && i39 != 32) {
                        z11 = false;
                        i15 = z11 ? 0 : i15;
                        if (i39 != 11 || i39 == 34) {
                            i18 = ((f3) j0Var).currentAccount;
                            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && (((arrayList = j0Var.D0) != null && !arrayList.isEmpty()) || ((arrayList2 = j0Var.C0) != null && arrayList2.size() >= j0Var.B0.size()))) {
                                arrayList3 = !j0Var.D0.isEmpty() ? j0Var.C0 : j0Var.D0;
                                k9 k9Var = new k9(context, false);
                                k9Var.a.q = AndroidUtilities.dp(3.33f);
                                k9Var.setSize(AndroidUtilities.dp(72.0f));
                                k9Var.setStepFactor(0.4f);
                                min = Math.min(arrayList3.size(), 3);
                                k9Var.setCount(min);
                                for (i19 = 0; i19 < min; i19++) {
                                    Long l4 = (Long) arrayList3.get(i19);
                                    l4.getClass();
                                    i30 = ((f3) j0Var).currentAccount;
                                    TLRPC.User user = MessagesController.getInstance(i30).getUser(l4);
                                    i31 = ((f3) j0Var).currentAccount;
                                    k9Var.b(i19, user, i31);
                                }
                                k9Var.a(false);
                                addView(k9Var, x5.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                                TextView textView = new TextView(context);
                                textView.setGravity(17);
                                ul.k(20.0f, 1, textView);
                                int i52 = h6.j5;
                                d6Var = ((f3) j0Var).resourcesProvider;
                                textView.setTextColor(h6.v0(i52, d6Var));
                                textView.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                                addView(textView, x5.t(-1, -2, 1, 32, 0, 32, 9));
                                TextView textView2 = new TextView(context);
                                textView2.setGravity(17);
                                textView2.setTextSize(1, 14.0f);
                                d6Var2 = ((f3) j0Var).resourcesProvider;
                                textView2.setTextColor(h6.v0(i52, d6Var2));
                                addView(textView2, x5.t(-1, -2, 1, 32, 0, 32, 19));
                                boolean z14 = i39 != 34;
                                arrayList4 = j0Var.C0;
                                if (arrayList4 != null) {
                                    arrayList10 = j0Var.C0;
                                    int size4 = arrayList10.size();
                                    arrayList11 = j0Var.D0;
                                    if (size4 >= arrayList11.size()) {
                                        z12 = true;
                                        if (arrayList3.size() == 1) {
                                            int i53 = z14 ? R.string.InviteCallMessagePremiumBlockedOne : z12 ? R.string.InviteMessagePremiumBlockedOne : R.string.InvitePremiumBlockedOne;
                                            i29 = ((f3) j0Var).currentAccount;
                                            str2 = LocaleController.formatString(i53, UserObject.getForcedFirstName(MessagesController.getInstance(i29).getUser((Long) arrayList3.get(0))));
                                        } else if (arrayList3.size() == 2) {
                                            int i54 = z14 ? R.string.InviteCallMessagePremiumBlockedTwo : z12 ? R.string.InviteMessagePremiumBlockedTwo : R.string.InvitePremiumBlockedTwo;
                                            i25 = ((f3) j0Var).currentAccount;
                                            String forcedFirstName = UserObject.getForcedFirstName(MessagesController.getInstance(i25).getUser((Long) arrayList3.get(0)));
                                            i26 = ((f3) j0Var).currentAccount;
                                            str2 = LocaleController.formatString(i54, forcedFirstName, UserObject.getForcedFirstName(MessagesController.getInstance(i26).getUser((Long) arrayList3.get(1))));
                                        } else if (arrayList3.size() == 3) {
                                            int i55 = z14 ? R.string.InviteCallMessagePremiumBlockedThree : z12 ? R.string.InviteMessagePremiumBlockedThree : R.string.InvitePremiumBlockedThree;
                                            i22 = ((f3) j0Var).currentAccount;
                                            String forcedFirstName2 = UserObject.getForcedFirstName(MessagesController.getInstance(i22).getUser((Long) arrayList3.get(0)));
                                            i23 = ((f3) j0Var).currentAccount;
                                            String forcedFirstName3 = UserObject.getForcedFirstName(MessagesController.getInstance(i23).getUser((Long) arrayList3.get(1)));
                                            i24 = ((f3) j0Var).currentAccount;
                                            str2 = LocaleController.formatString(i55, forcedFirstName2, forcedFirstName3, UserObject.getForcedFirstName(MessagesController.getInstance(i24).getUser((Long) arrayList3.get(2))));
                                        } else {
                                            String str3 = z14 ? "InviteCallMessagePremiumBlockedMany" : z12 ? "InviteMessagePremiumBlockedMany" : "InvitePremiumBlockedMany";
                                            int size5 = arrayList3.size() - 2;
                                            i20 = ((f3) j0Var).currentAccount;
                                            String forcedFirstName4 = UserObject.getForcedFirstName(MessagesController.getInstance(i20).getUser((Long) arrayList3.get(0)));
                                            i21 = ((f3) j0Var).currentAccount;
                                            String formatPluralString = LocaleController.formatPluralString(str3, size5, forcedFirstName4, UserObject.getForcedFirstName(MessagesController.getInstance(i21).getUser((Long) arrayList3.get(1))));
                                            int size6 = arrayList3.size() - 2;
                                            int themedColor = j0Var.getThemedColor(h6.h5);
                                            k9Var.b = new z0(h6.Lj, h6.Mj, -1, -1, null);
                                            k9Var.c = new f01(hg.c.i(size6, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                                            Paint paint = new Paint(1);
                                            k9Var.d = paint;
                                            paint.setColor(themedColor);
                                            str2 = formatPluralString;
                                        }
                                        textView2.setText(AndroidUtilities.replaceTags(str2));
                                        arrayList5 = j0Var.D0;
                                        if (arrayList5 == null) {
                                            size = 0;
                                        } else {
                                            arrayList6 = j0Var.D0;
                                            size = arrayList6.size();
                                        }
                                        arrayList7 = j0Var.C0;
                                        if (arrayList7 == null) {
                                            size2 = 0;
                                        } else {
                                            arrayList8 = j0Var.C0;
                                            size2 = arrayList8.size();
                                        }
                                        if (size - size2 > 0 || ((size == 1 && size2 == 1) || !j0Var.Y)) {
                                            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                            j0Var.j0 = true;
                                        } else {
                                            d6Var3 = ((f3) j0Var).resourcesProvider;
                                            final int i56 = 0;
                                            p0 p0Var = new p0(context, d6Var3, false);
                                            z5.b(p0Var, 0.02f, 1.2f);
                                            p0Var.a(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), new View.OnClickListener(this) { // from class: rg.g0
                                                public final /* synthetic */ i0 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i56) {
                                                        case 0:
                                                            n2 n2Var2 = this.b.e.K0;
                                                            if (n2Var2 != null) {
                                                                l2 l2Var = new l2();
                                                                l2Var.a = true;
                                                                n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            j0 j0Var2 = this.b.e;
                                                            j0Var2.n.presentFragment(xn.R9(j0Var2.a0));
                                                            j0Var2.dismiss();
                                                            break;
                                                    }
                                                }
                                            }, false);
                                            i27 = ((f3) j0Var).backgroundPaddingLeft;
                                            float f13 = (i27 / AndroidUtilities.density) + 4.0f;
                                            i28 = ((f3) j0Var).backgroundPaddingLeft;
                                            addView(p0Var, x5.k(f13, 0.0f, (i28 / AndroidUtilities.density) + 4.0f, 18.0f, -1, 48));
                                            bi.o oVar2 = new bi.o(this, context);
                                            oVar2.setGravity(17);
                                            int i57 = h6.z6;
                                            d6Var4 = ((f3) j0Var).resourcesProvider;
                                            oVar2.setTextColor(h6.v0(i57, d6Var4));
                                            oVar2.setText(" " + LocaleController.getString(R.string.InvitePremiumBlockedOr) + " ");
                                            oVar2.setTextSize(14.0f);
                                            addView(oVar2, x5.t(190, -2, 1, 12, 0, 12, 20));
                                            TextView textView3 = new TextView(context);
                                            textView3.setGravity(17);
                                            textView3.setTypeface(AndroidUtilities.bold());
                                            textView3.setTextSize(1, 20.0f);
                                            d6Var5 = ((f3) j0Var).resourcesProvider;
                                            textView3.setTextColor(h6.v0(i52, d6Var5));
                                            textView3.setText(LocaleController.getString(R.string.InviteBlockedTitle));
                                            addView(textView3, x5.t(-1, -2, 1, 32, 0, 32, 9));
                                            TextView textView4 = new TextView(context);
                                            textView4.setGravity(17);
                                            textView4.setTextSize(1, 14.0f);
                                            d6Var6 = ((f3) j0Var).resourcesProvider;
                                            textView4.setTextColor(h6.v0(i52, d6Var6));
                                            arrayList9 = j0Var.D0;
                                            if (arrayList9.size() <= 1) {
                                                textView4.setText(LocaleController.getString(R.string.InviteBlockedOneMessage));
                                            } else {
                                                textView4.setText(LocaleController.getString(R.string.InviteBlockedManyMessage));
                                            }
                                            addView(textView4, x5.t(-1, -2, 1, 32, 0, 32, 19));
                                        }
                                        j0Var.L1();
                                        return;
                                    }
                                }
                                z12 = false;
                                if (arrayList3.size() == 1) {
                                }
                                textView2.setText(AndroidUtilities.replaceTags(str2));
                                arrayList5 = j0Var.D0;
                                if (arrayList5 == null) {
                                }
                                arrayList7 = j0Var.C0;
                                if (arrayList7 == null) {
                                }
                                if (size - size2 > 0) {
                                }
                                ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                j0Var.j0 = true;
                                j0Var.L1();
                                return;
                            }
                        }
                        if (i39 != 31 && i39 != 34) {
                            d6Var14 = ((f3) j0Var).resourcesProvider;
                            h0 h0Var = new h0(this, context, i40, i15, i49, f12, d6Var14);
                            j0Var.x0 = h0Var;
                            if (z11) {
                                h0Var.setBagePosition(f7);
                                j0Var.x0.setType(i39);
                                j0Var.x0.w.setVisibility(8);
                                if (z10) {
                                    h0 h0Var2 = j0Var.x0;
                                    h0Var2.I.setVisibility(8);
                                    s sVar = h0Var2.e;
                                    if (sVar != null) {
                                        sVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                                    }
                                    h0Var2.J = true;
                                } else {
                                    i37 = ((f3) j0Var).currentAccount;
                                    if (UserConfig.getInstance(i37).isPremium() || j0Var.N0) {
                                        j0Var.x0.v.setVisibility(8);
                                        if (i39 == 6) {
                                            j0Var.x0.w.setText("2 GB");
                                        } else {
                                            j0Var.x0.w.setText(Integer.toString(i48));
                                        }
                                        z13 = false;
                                        j0Var.x0.w.setVisibility(0);
                                        if (i39 != 2 || i39 == 5) {
                                            j0Var.x0.H = z13;
                                        }
                                        addView(j0Var.x0, x5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                                    }
                                }
                            } else {
                                tL_premium_boostsStatus2 = j0Var.b0;
                                if (tL_premium_boostsStatus2 != null) {
                                    h0 h0Var3 = j0Var.x0;
                                    tL_premium_boostsStatus3 = j0Var.b0;
                                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.c0;
                                    h0Var3.e(tL_premium_boostsStatus3, canApplyBoost != null && canApplyBoost.boostedNow);
                                }
                            }
                            z13 = false;
                            if (i39 != 2) {
                            }
                            j0Var.x0.H = z13;
                            addView(j0Var.x0, x5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                        if (i39 != 31) {
                            FrameLayout frameLayout = new FrameLayout(context);
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(f0.e.d(getContext(), R.drawable.large_boosts));
                            i32 = 17;
                            frameLayout.addView(imageView, x5.e(-2, -2, 17));
                            frameLayout.setBackground(h6.K(AndroidUtilities.dp(79.0f), h6.u0(h6.Oh)));
                            addView(frameLayout, x5.t(79, 79, 1, 0, 23, 0, 0));
                        } else {
                            i32 = 17;
                        }
                        TextView textView5 = new TextView(context);
                        this.a = textView5;
                        textView5.setTypeface(AndroidUtilities.bold());
                        if (i39 != 31) {
                            this.a.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                        } else if (i39 == 32) {
                            this.a.setText(j0Var.r1());
                        } else {
                            i33 = 19;
                            if (i39 == 19) {
                                if (n2Var instanceof p60) {
                                    this.a.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                                } else {
                                    this.a.setText(j0Var.r1());
                                }
                            } else if (i39 == 30) {
                                this.a.setText(j0Var.r1());
                            } else if (i39 == 35) {
                                this.a.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                            } else if (i39 == 18) {
                                tL_premium_boostsStatus = j0Var.b0;
                                if (tL_premium_boostsStatus.level == 0) {
                                    this.a.setText(LocaleController.getString(R.string.BoostingEnableStories));
                                } else {
                                    this.a.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                                }
                            } else if (i39 == 21) {
                                this.a.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                            } else if (i39 == 20) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableColor));
                            } else if (i39 == 24) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                            } else if (i39 == 27) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                            } else if (i39 == 28) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                            } else if (i39 == 25) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                            } else if (i39 == 26) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                            } else {
                                if (i39 != 29) {
                                    if (i39 == 22 || i39 == 23) {
                                        this.a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                    } else if (i39 == 11) {
                                        if (j0Var.Y) {
                                            this.a.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                                        } else {
                                            this.a.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted));
                                        }
                                    } else if (i39 == 34) {
                                        this.a.setText(LocaleController.getString(R.string.CallInviteViaLinkTitle));
                                    } else if (i39 == 6) {
                                        this.a.setText(LocaleController.getString(R.string.FileTooLarge));
                                    } else if (i39 != 14 || j0Var.X <= 1) {
                                        this.a.setText(LocaleController.getString(R.string.LimitReached));
                                    } else {
                                        this.a.setText(LocaleController.getString(R.string.CreateMultipleStories));
                                    }
                                    this.a.setTextSize(1, 20.0f);
                                    TextView textView6 = this.a;
                                    int i58 = h6.G6;
                                    d6Var7 = ((f3) j0Var).resourcesProvider;
                                    textView6.setTextColor(h6.v0(i58, d6Var7));
                                    this.a.setGravity(i32);
                                    if (i39 != i33 || i39 == 32 || j0Var.y1()) {
                                        tg.b bVar = new tg.b(context);
                                        this.c = bVar;
                                        bVar.a(j0Var.c0.boostCount, false);
                                        if (i39 == 32) {
                                            bVar.setVisibility(8);
                                        }
                                        if (j0Var.e0) {
                                            addView(this.a, x5.t(-2, -2, 1, 0, z10 ? 8 : 22, 0, 0));
                                            LinearLayout linearLayout = new LinearLayout(getContext());
                                            linearLayout.setOrientation(0);
                                            linearLayout.setClipChildren(false);
                                            FrameLayout frameLayout2 = new FrameLayout(getContext());
                                            int dp2 = AndroidUtilities.dp(14.0f);
                                            int i59 = h6.a7;
                                            d6Var8 = ((f3) j0Var).resourcesProvider;
                                            frameLayout2.setBackground(h6.b0(dp2, h6.v0(i59, d6Var8)));
                                            w9 w9Var = new w9(getContext());
                                            w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
                                            i34 = ((f3) j0Var).currentAccount;
                                            TLRPC.Chat chat = MessagesController.getInstance(i34).getChat(Long.valueOf(-j0Var.a0));
                                            h9 h9Var = new h9();
                                            i35 = ((f3) j0Var).currentAccount;
                                            h9Var.k(i35, chat);
                                            w9Var.e(chat, h9Var);
                                            frameLayout2.addView(w9Var, x5.c(28.0f, 28));
                                            TextView textView7 = new TextView(getContext());
                                            if (chat != null) {
                                                textView7.setText(chat.title);
                                            }
                                            textView7.setSingleLine(true);
                                            textView7.setMaxLines(1);
                                            textView7.setEllipsize(TextUtils.TruncateAt.END);
                                            textView7.setTextSize(1, 13.0f);
                                            d6Var9 = ((f3) j0Var).resourcesProvider;
                                            textView7.setTextColor(h6.v0(i58, d6Var9));
                                            frameLayout2.addView(textView7, x5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                            linearLayout.addView(frameLayout2, x5.t(-2, 28, 80, 18, 0, 18, 0));
                                            LayoutTransition layoutTransition = new LayoutTransition();
                                            layoutTransition.setDuration(100L);
                                            layoutTransition.enableTransitionType(4);
                                            linearLayout.setLayoutTransition(layoutTransition);
                                            linearLayout.addView(bVar, x5.t(-2, -2, 48, -30, 2, 18, 0));
                                            addView(linearLayout, x5.t(-2, 38, 17, 0, -4, 0, 12));
                                            z5.a(linearLayout);
                                            i36 = 1;
                                            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: rg.g0
                                                public final /* synthetic */ i0 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i36) {
                                                        case 0:
                                                            n2 n2Var2 = this.b.e.K0;
                                                            if (n2Var2 != null) {
                                                                l2 l2Var = new l2();
                                                                l2Var.a = true;
                                                                n2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            j0 j0Var2 = this.b.e;
                                                            j0Var2.n.presentFragment(xn.R9(j0Var2.a0));
                                                            j0Var2.dismiss();
                                                            break;
                                                    }
                                                }
                                            });
                                            TextView textView8 = new TextView(context);
                                            this.b = textView8;
                                            textView8.setText(AndroidUtilities.replaceTags(formatString));
                                            this.b.setTextSize(i36, 14.0f);
                                            this.b.setGravity(i36);
                                            TextView textView9 = this.b;
                                            textView9.setLineSpacing(textView9.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                            if (i39 != 18) {
                                                d6Var11 = ((f3) j0Var).resourcesProvider;
                                                if (d6Var11 instanceof ai.d) {
                                                    TextView textView10 = this.b;
                                                    int i60 = h6.y6;
                                                    d6Var13 = ((f3) j0Var).resourcesProvider;
                                                    textView10.setTextColor(h6.v0(i60, d6Var13));
                                                } else {
                                                    TextView textView11 = this.b;
                                                    d6Var12 = ((f3) j0Var).resourcesProvider;
                                                    textView11.setTextColor(h6.v0(i58, d6Var12));
                                                }
                                            } else {
                                                TextView textView12 = this.b;
                                                d6Var10 = ((f3) j0Var).resourcesProvider;
                                                textView12.setTextColor(h6.v0(i58, d6Var10));
                                            }
                                            if (i39 != i33) {
                                                addView(this.b, x5.t(-2, -2, 1, 24, -2, 24, 17));
                                            } else {
                                                addView(this.b, x5.t(-2, -2, 1, 24, 0, 24, 24));
                                            }
                                            if (i39 == 31) {
                                                ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                                ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                                ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                                            }
                                            j0Var.L1();
                                            return;
                                        }
                                        LinearLayout linearLayout2 = new LinearLayout(context);
                                        this.d = linearLayout2;
                                        linearLayout2.setOrientation(0);
                                        this.d.setWeightSum(1.0f);
                                        this.d.addView(this.a, x5.o(-2, -2, 1.0f, 0));
                                        this.d.addView(bVar, x5.t(-2, -2, 48, 0, 2, 0, 0));
                                        addView(this.d, x5.t(-2, -2, 1, 12, z10 ? 8 : 22, 12, 9));
                                    } else {
                                        addView(this.a, x5.t(-2, -2, 1, 0, z10 ? 8 : 22, 0, 10));
                                    }
                                    i36 = 1;
                                    TextView textView82 = new TextView(context);
                                    this.b = textView82;
                                    textView82.setText(AndroidUtilities.replaceTags(formatString));
                                    this.b.setTextSize(i36, 14.0f);
                                    this.b.setGravity(i36);
                                    TextView textView92 = this.b;
                                    textView92.setLineSpacing(textView92.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                    if (i39 != 18) {
                                    }
                                    if (i39 != i33) {
                                    }
                                    if (i39 == 31) {
                                    }
                                    j0Var.L1();
                                    return;
                                }
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                            }
                            this.a.setTextSize(1, 20.0f);
                            TextView textView62 = this.a;
                            int i582 = h6.G6;
                            d6Var7 = ((f3) j0Var).resourcesProvider;
                            textView62.setTextColor(h6.v0(i582, d6Var7));
                            this.a.setGravity(i32);
                            if (i39 != i33) {
                            }
                            tg.b bVar2 = new tg.b(context);
                            this.c = bVar2;
                            bVar2.a(j0Var.c0.boostCount, false);
                            if (i39 == 32) {
                            }
                            if (j0Var.e0) {
                            }
                        }
                        i33 = 19;
                        this.a.setTextSize(1, 20.0f);
                        TextView textView622 = this.a;
                        int i5822 = h6.G6;
                        d6Var7 = ((f3) j0Var).resourcesProvider;
                        textView622.setTextColor(h6.v0(i5822, d6Var7));
                        this.a.setGravity(i32);
                        if (i39 != i33) {
                        }
                        tg.b bVar22 = new tg.b(context);
                        this.c = bVar22;
                        bVar22.a(j0Var.c0.boostCount, false);
                        if (i39 == 32) {
                        }
                        if (j0Var.e0) {
                        }
                    }
                }
                z11 = true;
                if (z11) {
                }
                if (i39 != 11) {
                }
                i18 = ((f3) j0Var).currentAccount;
                if (!MessagesController.getInstance(i18).premiumFeaturesBlocked()) {
                    if (!j0Var.D0.isEmpty()) {
                    }
                    k9 k9Var2 = new k9(context, false);
                    k9Var2.a.q = AndroidUtilities.dp(3.33f);
                    k9Var2.setSize(AndroidUtilities.dp(72.0f));
                    k9Var2.setStepFactor(0.4f);
                    min = Math.min(arrayList3.size(), 3);
                    k9Var2.setCount(min);
                    while (i19 < min) {
                    }
                    k9Var2.a(false);
                    addView(k9Var2, x5.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                    TextView textView13 = new TextView(context);
                    textView13.setGravity(17);
                    ul.k(20.0f, 1, textView13);
                    int i522 = h6.j5;
                    d6Var = ((f3) j0Var).resourcesProvider;
                    textView13.setTextColor(h6.v0(i522, d6Var));
                    textView13.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                    addView(textView13, x5.t(-1, -2, 1, 32, 0, 32, 9));
                    TextView textView22 = new TextView(context);
                    textView22.setGravity(17);
                    textView22.setTextSize(1, 14.0f);
                    d6Var2 = ((f3) j0Var).resourcesProvider;
                    textView22.setTextColor(h6.v0(i522, d6Var2));
                    addView(textView22, x5.t(-1, -2, 1, 32, 0, 32, 19));
                    if (i39 != 34) {
                    }
                    arrayList4 = j0Var.C0;
                    if (arrayList4 != null) {
                    }
                    z12 = false;
                    if (arrayList3.size() == 1) {
                    }
                    textView22.setText(AndroidUtilities.replaceTags(str2));
                    arrayList5 = j0Var.D0;
                    if (arrayList5 == null) {
                    }
                    arrayList7 = j0Var.C0;
                    if (arrayList7 == null) {
                    }
                    if (size - size2 > 0) {
                    }
                    ((ViewGroup.MarginLayoutParams) textView22.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    j0Var.j0 = true;
                    j0Var.L1();
                    return;
                }
                if (i39 != 31) {
                    d6Var14 = ((f3) j0Var).resourcesProvider;
                    h0 h0Var4 = new h0(this, context, i40, i15, i49, f12, d6Var14);
                    j0Var.x0 = h0Var4;
                    if (z11) {
                    }
                    z13 = false;
                    if (i39 != 2) {
                    }
                    j0Var.x0.H = z13;
                    addView(j0Var.x0, x5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                }
                if (i39 != 31) {
                }
                TextView textView52 = new TextView(context);
                this.a = textView52;
                textView52.setTypeface(AndroidUtilities.bold());
                if (i39 != 31) {
                }
                i33 = 19;
                this.a.setTextSize(1, 20.0f);
                TextView textView6222 = this.a;
                int i58222 = h6.G6;
                d6Var7 = ((f3) j0Var).resourcesProvider;
                textView6222.setTextColor(h6.v0(i58222, d6Var7));
                this.a.setGravity(i32);
                if (i39 != i33) {
                }
                tg.b bVar222 = new tg.b(context);
                this.c = bVar222;
                bVar222.a(j0Var.c0.boostCount, false);
                if (i39 == 32) {
                }
                if (j0Var.e0) {
                }
            }
            i17 = ((f3) j0Var).currentAccount;
            if (UserConfig.getInstance(i17).isPremium()) {
            }
            i15 = i49;
            f7 = 1.0f;
            float f122 = i48 / i49;
            if (i39 == 18) {
            }
            z11 = true;
            if (z11) {
            }
            if (i39 != 11) {
            }
            i18 = ((f3) j0Var).currentAccount;
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked()) {
            }
            if (i39 != 31) {
            }
            if (i39 != 31) {
            }
            TextView textView522 = new TextView(context);
            this.a = textView522;
            textView522.setTypeface(AndroidUtilities.bold());
            if (i39 != 31) {
            }
            i33 = 19;
            this.a.setTextSize(1, 20.0f);
            TextView textView62222 = this.a;
            int i582222 = h6.G6;
            d6Var7 = ((f3) j0Var).resourcesProvider;
            textView62222.setTextColor(h6.v0(i582222, d6Var7));
            this.a.setGravity(i32);
            if (i39 != i33) {
            }
            tg.b bVar2222 = new tg.b(context);
            this.c = bVar2222;
            bVar2222.a(j0Var.c0.boostCount, false);
            if (i39 == 32) {
            }
            if (j0Var.e0) {
            }
        } else if (i39 == 34) {
            str = j0Var.B0.size() == 1 ? LocaleController.formatString(R.string.InviteCallRestrictedUsersOne, ContactsController.formatName((TLRPC.User) j0Var.B0.get(0))) : LocaleController.formatPluralString("InviteCallRestrictedUsers", j0Var.B0.size(), Integer.valueOf(j0Var.B0.size()));
        } else if (premiumFeaturesBlocked) {
            str = (String) j0Var.M0.f;
        } else {
            i14 = ((f3) j0Var).currentAccount;
            str = (String) ((UserConfig.getInstance(i14).isPremium() || j0Var.N0) ? j0Var.M0.e : j0Var.M0.d);
        }
        formatString = str;
        z10 = premiumFeaturesBlocked;
        androidx.emoji2.text.o oVar3 = j0Var.M0;
        int i482 = oVar3.b;
        int i492 = oVar3.c;
        i15 = j0Var.w0;
        if (i39 != 3) {
        }
        i17 = ((f3) j0Var).currentAccount;
        if (UserConfig.getInstance(i17).isPremium()) {
        }
        i15 = i492;
        f7 = 1.0f;
        float f1222 = i482 / i492;
        if (i39 == 18) {
        }
        z11 = true;
        if (z11) {
        }
        if (i39 != 11) {
        }
        i18 = ((f3) j0Var).currentAccount;
        if (!MessagesController.getInstance(i18).premiumFeaturesBlocked()) {
        }
        if (i39 != 31) {
        }
        if (i39 != 31) {
        }
        TextView textView5222 = new TextView(context);
        this.a = textView5222;
        textView5222.setTypeface(AndroidUtilities.bold());
        if (i39 != 31) {
        }
        i33 = 19;
        this.a.setTextSize(1, 20.0f);
        TextView textView622222 = this.a;
        int i5822222 = h6.G6;
        d6Var7 = ((f3) j0Var).resourcesProvider;
        textView622222.setTextColor(h6.v0(i5822222, d6Var7));
        this.a.setGravity(i32);
        if (i39 != i33) {
        }
        tg.b bVar22222 = new tg.b(context);
        this.c = bVar22222;
        bVar22222.a(j0Var.c0.boostCount, false);
        if (i39 == 32) {
        }
        if (j0Var.e0) {
        }
    }
}
