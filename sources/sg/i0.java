package sg;

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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.z9;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fo;
import org.telegram.ui.x60;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i0 extends LinearLayout {
    public TextView a;
    public TextView b;
    public final ug.b c;
    public LinearLayout d;
    public final /* synthetic */ j0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0b9a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0d7d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0db2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0dca  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0552 A[LOOP:0: B:227:0x0550->B:228:0x0552, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x09a7  */
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
        int i18;
        float f7;
        int i19;
        int i20;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int min;
        int i21;
        c6 c6Var;
        c6 c6Var2;
        ArrayList arrayList4;
        boolean z11;
        int i22;
        int i23;
        String str2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int size;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int size2;
        c6 c6Var3;
        int i29;
        int i30;
        c6 c6Var4;
        c6 c6Var5;
        c6 c6Var6;
        ArrayList arrayList9;
        int i31;
        ArrayList arrayList10;
        ArrayList arrayList11;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        c6 c6Var7;
        c6 c6Var8;
        int i37;
        int i38;
        c6 c6Var9;
        final int i39;
        c6 c6Var10;
        c6 c6Var11;
        c6 c6Var12;
        c6 c6Var13;
        c6 c6Var14;
        int i40;
        boolean z12;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3;
        float f10;
        float f11;
        float f12;
        int i41;
        m2 m2Var = j0Var.n;
        this.e = j0Var;
        setOrientation(1);
        i10 = ((e3) j0Var).backgroundPaddingLeft;
        int dp = AndroidUtilities.dp(6.0f) + i10;
        i11 = ((e3) j0Var).backgroundPaddingLeft;
        setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i11, 0);
        int i42 = j0Var.h0;
        i12 = ((e3) j0Var).currentAccount;
        androidx.emoji2.text.p v12 = j0.v1(i42, i12);
        j0Var.M0 = v12;
        int i43 = v12.a;
        i13 = ((e3) j0Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i13);
        boolean premiumFeaturesBlocked = messagesController.premiumFeaturesBlocked();
        boolean y12 = j0Var.y1();
        if (i42 == 31) {
            str = LocaleController.getString(y12 ? R.string.BoostingAdditionalFeaturesSubtitle : R.string.BoostingAdditionalFeaturesSubtitleChannel);
        } else if (i42 == 32) {
            str = j0Var.r1(true);
        } else if (i42 == 19) {
            org.telegram.ui.Cells.u1 u1Var = j0Var.g0;
            if (u1Var != null) {
                int i44 = u1Var.getMessageObject().messageOwner.from_boosts_applied;
                TLRPC.Chat t12 = j0Var.t1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("GroupBoostedByUserWithTimes", i44, UserObject.getFirstName(j0Var.g0.getCurrentUser())));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.GroupBoostedByUserWithDescription, t12 == null ? "" : t12.title));
                str = spannableStringBuilder.toString();
            } else if (m2Var instanceof x60) {
                str = LocaleController.formatPluralString("BoostingGroupBoostWhatAreBoostsDescription", ug.s.g(), new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(j0Var.r1(true));
                if (ChatObject.hasAdminRights(j0Var.t1()) && y12) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.BoostingPremiumUserCanBoostGroupWithLink));
                }
                str = spannableStringBuilder2.toString();
            }
        } else if (i42 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = j0Var.b0;
            if (tL_premium_boostsStatus4.level == 0) {
                int i45 = y12 ? R.string.GroupNeedBoostsDescription : R.string.ChannelNeedBoostsDescription;
                int i46 = tL_premium_boostsStatus4.next_level_boosts;
                str = LocaleController.formatString(i45, LocaleController.formatPluralString("MoreBoosts", i46, Integer.valueOf(i46)));
            } else {
                int i47 = y12 ? R.string.GroupNeedBoostsDescriptionNextLevel : R.string.ChannelNeedBoostsDescriptionNextLevel;
                int i48 = tL_premium_boostsStatus4.next_level_boosts;
                int i49 = tL_premium_boostsStatus4.boosts;
                str = LocaleController.formatString(i47, LocaleController.formatPluralString("MoreBoosts", i48 - i49, Integer.valueOf(i48 - i49)), LocaleController.formatPluralString("BoostStories", j0Var.b0.level + 1, new Object[0]));
            }
        } else if (i42 == 20) {
            str = LocaleController.formatString(y12 ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(j0Var.p1()));
        } else if (i42 == 24) {
            str = LocaleController.formatString(y12 ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(j0Var.p1()));
        } else if (i42 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i42 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i42 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i42 == 25) {
            str = LocaleController.formatString(y12 ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(y12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i42 == 26) {
            str = LocaleController.formatString(y12 ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(y12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i42 == 27) {
            str = LocaleController.formatString(y12 ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i42 == 28) {
            str = LocaleController.formatString(y12 ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(y12 ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i42 == 22) {
            str = LocaleController.formatString(y12 ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(y12 ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i42 == 23) {
            str = LocaleController.formatString(y12 ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(y12 ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else if (i42 == 21) {
            int i50 = j0Var.R0;
            str = LocaleController.formatPluralString("ReactionReachLvlForReaction", i50, Integer.valueOf(i50));
        } else if (i42 == 11) {
            formatString = !j0Var.Y ? ChatObject.isChannelAndNotMegaGroup(j0Var.O0) ? j0Var.B0.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsers2One, ContactsController.formatName((TLRPC.User) j0Var.B0.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers2", j0Var.B0.size(), Integer.valueOf(j0Var.B0.size())) : j0Var.B0.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsers2One, ContactsController.formatName((TLRPC.User) j0Var.B0.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers2", j0Var.B0.size(), Integer.valueOf(j0Var.B0.size())) : ChatObject.isChannelAndNotMegaGroup(j0Var.O0) ? j0Var.B0.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsersOne, ContactsController.formatName((TLRPC.User) j0Var.B0.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers", j0Var.B0.size(), Integer.valueOf(j0Var.B0.size())) : j0Var.B0.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsersOne, ContactsController.formatName((TLRPC.User) j0Var.B0.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers", j0Var.B0.size(), Integer.valueOf(j0Var.B0.size()));
            z10 = true;
            androidx.emoji2.text.p pVar = j0Var.M0;
            int i51 = pVar.b;
            int i52 = pVar.c;
            i15 = j0Var.w0;
            if (i42 != 3) {
                i41 = ((e3) j0Var).currentAccount;
                i15 = MessagesController.getInstance(i41).dialogFilters.size() - 1;
            } else if (i42 == 7) {
                i15 = UserConfig.getActivatedAccountsCount();
            } else if (i42 == 0) {
                i16 = ((e3) j0Var).currentAccount;
                ArrayList<TLRPC.Dialog> dialogs = MessagesController.getInstance(i16).getDialogs(0);
                i17 = 1;
                int size3 = dialogs.size();
                int i53 = 0;
                for (int i54 = 0; i54 < size3; i54++) {
                    TLRPC.Dialog dialog = dialogs.get(i54);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                        i53++;
                    }
                }
                i15 = i53;
                i18 = ((e3) j0Var).currentAccount;
                if (!UserConfig.getInstance(i18).isPremium() || j0Var.N0) {
                    i15 = i52;
                    f7 = 1.0f;
                } else {
                    i15 = i15 < 0 ? i51 : i15;
                    if (i42 != 7) {
                        f10 = i15;
                        f11 = i52;
                    } else if (i15 > i51) {
                        f10 = i15 - i51;
                        f11 = i52 - i51;
                    } else {
                        f12 = 0.5f;
                        f7 = f12;
                    }
                    f12 = f10 / f11;
                    f7 = f12;
                }
                float f13 = i51 / i52;
                if (i42 == 18 && i42 != 20 && i42 != 24 && i42 != 25 && i42 != 26) {
                    if (i42 != 29 && i42 != 22 && i42 != 23 && i42 != 19 && i42 != 30 && i42 != 35 && i42 != 21 && i42 != 27 && i42 != 28 && i42 != 32) {
                        i19 = 0;
                        i15 = i19 != 0 ? 0 : i15;
                        if (i42 != 11 || i42 == 34) {
                            i20 = ((e3) j0Var).currentAccount;
                            if (!MessagesController.getInstance(i20).premiumFeaturesBlocked() && (((arrayList = j0Var.D0) != null && !arrayList.isEmpty()) || ((arrayList2 = j0Var.C0) != null && arrayList2.size() >= j0Var.B0.size()))) {
                                arrayList3 = !j0Var.D0.isEmpty() ? j0Var.C0 : j0Var.D0;
                                n9 n9Var = new n9(context, false);
                                n9Var.a.q = AndroidUtilities.dp(3.33f);
                                n9Var.setSize(AndroidUtilities.dp(72.0f));
                                n9Var.setStepFactor(0.4f);
                                min = Math.min(arrayList3.size(), 3);
                                n9Var.setCount(min);
                                for (i21 = 0; i21 < min; i21++) {
                                    Long l4 = (Long) arrayList3.get(i21);
                                    l4.getClass();
                                    i32 = ((e3) j0Var).currentAccount;
                                    TLRPC.User user = MessagesController.getInstance(i32).getUser(l4);
                                    i33 = ((e3) j0Var).currentAccount;
                                    n9Var.b(i21, user, i33);
                                }
                                n9Var.a(false);
                                addView(n9Var, a6.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                                TextView textView = new TextView(context);
                                textView.setGravity(17);
                                yh.k(20.0f, i17, textView);
                                int i55 = g6.j5;
                                c6Var = ((e3) j0Var).resourcesProvider;
                                textView.setTextColor(g6.w0(i55, c6Var));
                                textView.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                                addView(textView, a6.t(-1, -2, 1, 32, 0, 32, 9));
                                TextView textView2 = new TextView(context);
                                textView2.setGravity(17);
                                textView2.setTextSize(1, 14.0f);
                                c6Var2 = ((e3) j0Var).resourcesProvider;
                                textView2.setTextColor(g6.w0(i55, c6Var2));
                                addView(textView2, a6.t(-1, -2, 1, 32, 0, 32, 19));
                                boolean z13 = i42 != 34;
                                arrayList4 = j0Var.C0;
                                if (arrayList4 != null) {
                                    arrayList10 = j0Var.C0;
                                    int size4 = arrayList10.size();
                                    arrayList11 = j0Var.D0;
                                    if (size4 >= arrayList11.size()) {
                                        z11 = true;
                                        if (arrayList3.size() == 1) {
                                            int i56 = z13 ? R.string.InviteCallMessagePremiumBlockedOne : z11 ? R.string.InviteMessagePremiumBlockedOne : R.string.InvitePremiumBlockedOne;
                                            i31 = ((e3) j0Var).currentAccount;
                                            str2 = LocaleController.formatString(i56, UserObject.getForcedFirstName(MessagesController.getInstance(i31).getUser((Long) arrayList3.get(0))));
                                        } else if (arrayList3.size() == 2) {
                                            int i57 = z13 ? R.string.InviteCallMessagePremiumBlockedTwo : z11 ? R.string.InviteMessagePremiumBlockedTwo : R.string.InvitePremiumBlockedTwo;
                                            i27 = ((e3) j0Var).currentAccount;
                                            String forcedFirstName = UserObject.getForcedFirstName(MessagesController.getInstance(i27).getUser((Long) arrayList3.get(0)));
                                            i28 = ((e3) j0Var).currentAccount;
                                            str2 = LocaleController.formatString(i57, forcedFirstName, UserObject.getForcedFirstName(MessagesController.getInstance(i28).getUser((Long) arrayList3.get(1))));
                                        } else if (arrayList3.size() == 3) {
                                            int i58 = z13 ? R.string.InviteCallMessagePremiumBlockedThree : z11 ? R.string.InviteMessagePremiumBlockedThree : R.string.InvitePremiumBlockedThree;
                                            i24 = ((e3) j0Var).currentAccount;
                                            String forcedFirstName2 = UserObject.getForcedFirstName(MessagesController.getInstance(i24).getUser((Long) arrayList3.get(0)));
                                            i25 = ((e3) j0Var).currentAccount;
                                            String forcedFirstName3 = UserObject.getForcedFirstName(MessagesController.getInstance(i25).getUser((Long) arrayList3.get(1)));
                                            i26 = ((e3) j0Var).currentAccount;
                                            str2 = LocaleController.formatString(i58, forcedFirstName2, forcedFirstName3, UserObject.getForcedFirstName(MessagesController.getInstance(i26).getUser((Long) arrayList3.get(2))));
                                        } else {
                                            String str3 = z13 ? "InviteCallMessagePremiumBlockedMany" : z11 ? "InviteMessagePremiumBlockedMany" : "InvitePremiumBlockedMany";
                                            int size5 = arrayList3.size() - 2;
                                            i22 = ((e3) j0Var).currentAccount;
                                            String forcedFirstName4 = UserObject.getForcedFirstName(MessagesController.getInstance(i22).getUser((Long) arrayList3.get(0)));
                                            i23 = ((e3) j0Var).currentAccount;
                                            String formatPluralString = LocaleController.formatPluralString(str3, size5, forcedFirstName4, UserObject.getForcedFirstName(MessagesController.getInstance(i23).getUser((Long) arrayList3.get(1))));
                                            int size6 = arrayList3.size() - 2;
                                            int themedColor = j0Var.getThemedColor(g6.h5);
                                            n9Var.b = new a1(g6.Lj, g6.Mj, -1, -1, null);
                                            n9Var.c = new h11(i2.d.i(size6, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                                            Paint paint = new Paint(1);
                                            n9Var.d = paint;
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
                                            c6Var3 = ((e3) j0Var).resourcesProvider;
                                            final int i59 = 0;
                                            q0 q0Var = new q0(context, c6Var3, false);
                                            w7.c6.b(q0Var, 0.02f, 1.2f);
                                            q0Var.a(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), new View.OnClickListener(this) { // from class: sg.g0
                                                public final /* synthetic */ i0 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i59) {
                                                        case 0:
                                                            m2 m2Var2 = this.b.e.K0;
                                                            if (m2Var2 != null) {
                                                                k2 k2Var = new k2();
                                                                k2Var.a = true;
                                                                m2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), k2Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            j0 j0Var2 = this.b.e;
                                                            j0Var2.n.presentFragment(fo.W9(j0Var2.a0));
                                                            j0Var2.dismiss();
                                                            break;
                                                    }
                                                }
                                            }, false);
                                            i29 = ((e3) j0Var).backgroundPaddingLeft;
                                            float f14 = (i29 / AndroidUtilities.density) + 4.0f;
                                            i30 = ((e3) j0Var).backgroundPaddingLeft;
                                            addView(q0Var, a6.k(f14, 0.0f, (i30 / AndroidUtilities.density) + 4.0f, 18.0f, -1, 48));
                                            ci.n nVar = new ci.n(this, context);
                                            nVar.setGravity(17);
                                            int i60 = g6.z6;
                                            c6Var4 = ((e3) j0Var).resourcesProvider;
                                            nVar.setTextColor(g6.w0(i60, c6Var4));
                                            nVar.setText(" " + LocaleController.getString(R.string.InvitePremiumBlockedOr) + " ");
                                            nVar.setTextSize(14.0f);
                                            addView(nVar, a6.t(190, -2, 1, 12, 0, 12, 20));
                                            TextView textView3 = new TextView(context);
                                            textView3.setGravity(17);
                                            textView3.setTypeface(AndroidUtilities.bold());
                                            textView3.setTextSize(1, 20.0f);
                                            c6Var5 = ((e3) j0Var).resourcesProvider;
                                            textView3.setTextColor(g6.w0(i55, c6Var5));
                                            textView3.setText(LocaleController.getString(R.string.InviteBlockedTitle));
                                            addView(textView3, a6.t(-1, -2, 1, 32, 0, 32, 9));
                                            TextView textView4 = new TextView(context);
                                            textView4.setGravity(17);
                                            textView4.setTextSize(1, 14.0f);
                                            c6Var6 = ((e3) j0Var).resourcesProvider;
                                            textView4.setTextColor(g6.w0(i55, c6Var6));
                                            arrayList9 = j0Var.D0;
                                            if (arrayList9.size() <= 1) {
                                                textView4.setText(LocaleController.getString(R.string.InviteBlockedOneMessage));
                                            } else {
                                                textView4.setText(LocaleController.getString(R.string.InviteBlockedManyMessage));
                                            }
                                            addView(textView4, a6.t(-1, -2, 1, 32, 0, 32, 19));
                                        }
                                        j0Var.M1();
                                        return;
                                    }
                                }
                                z11 = false;
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
                                j0Var.M1();
                                return;
                            }
                        }
                        if (i42 != 31 && i42 != 34) {
                            c6Var14 = ((e3) j0Var).resourcesProvider;
                            h0 h0Var = new h0(this, context, i43, i15, i52, f13, c6Var14);
                            j0Var.x0 = h0Var;
                            if (i19 == 0) {
                                tL_premium_boostsStatus2 = j0Var.b0;
                                if (tL_premium_boostsStatus2 != null) {
                                    h0 h0Var2 = j0Var.x0;
                                    tL_premium_boostsStatus3 = j0Var.b0;
                                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.c0;
                                    h0Var2.e(tL_premium_boostsStatus3, canApplyBoost != null && canApplyBoost.boostedNow);
                                }
                            } else {
                                h0Var.setBagePosition(f7);
                                j0Var.x0.setType(i42);
                                j0Var.x0.w.setVisibility(8);
                                if (z10) {
                                    h0 h0Var3 = j0Var.x0;
                                    h0Var3.I.setVisibility(8);
                                    s sVar = h0Var3.e;
                                    if (sVar != null) {
                                        sVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                                    }
                                    h0Var3.J = true;
                                } else {
                                    i40 = ((e3) j0Var).currentAccount;
                                    if (UserConfig.getInstance(i40).isPremium() || j0Var.N0) {
                                        j0Var.x0.v.setVisibility(8);
                                        if (i42 == 6) {
                                            j0Var.x0.w.setText("2 GB");
                                        } else {
                                            j0Var.x0.w.setText(Integer.toString(i51));
                                        }
                                        z12 = false;
                                        j0Var.x0.w.setVisibility(0);
                                        if (i42 != 2 || i42 == 5) {
                                            j0Var.x0.H = z12;
                                        }
                                        addView(j0Var.x0, a6.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                                    }
                                }
                            }
                            z12 = false;
                            if (i42 != 2) {
                            }
                            j0Var.x0.H = z12;
                            addView(j0Var.x0, a6.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                        if (i42 != 31) {
                            FrameLayout frameLayout = new FrameLayout(context);
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(f0.c.c(getContext(), R.drawable.large_boosts));
                            i34 = 17;
                            frameLayout.addView(imageView, a6.e(-2, -2, 17));
                            frameLayout.setBackground(g6.K(AndroidUtilities.dp(79.0f), g6.v0(g6.Oh)));
                            addView(frameLayout, a6.t(79, 79, 1, 0, 23, 0, 0));
                        } else {
                            i34 = 17;
                        }
                        TextView textView5 = new TextView(context);
                        this.a = textView5;
                        textView5.setTypeface(AndroidUtilities.bold());
                        if (i42 != 31) {
                            this.a.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                        } else if (i42 == 32) {
                            this.a.setText(j0Var.s1());
                        } else {
                            i35 = 19;
                            if (i42 == 19) {
                                if (m2Var instanceof x60) {
                                    this.a.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                                } else {
                                    this.a.setText(j0Var.s1());
                                }
                            } else if (i42 == 30) {
                                this.a.setText(j0Var.s1());
                            } else if (i42 == 35) {
                                this.a.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                            } else if (i42 == 18) {
                                tL_premium_boostsStatus = j0Var.b0;
                                if (tL_premium_boostsStatus.level == 0) {
                                    this.a.setText(LocaleController.getString(R.string.BoostingEnableStories));
                                } else {
                                    this.a.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                                }
                            } else if (i42 == 21) {
                                this.a.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                            } else if (i42 == 20) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableColor));
                            } else if (i42 == 24) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                            } else if (i42 == 27) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                            } else if (i42 == 28) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                            } else if (i42 == 25) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                            } else if (i42 == 26) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                            } else {
                                if (i42 != 29) {
                                    i36 = 22;
                                    if (i42 == 22 || i42 == 23) {
                                        this.a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                    } else if (i42 == 11) {
                                        if (j0Var.Y) {
                                            this.a.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                                        } else {
                                            this.a.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted));
                                        }
                                    } else if (i42 == 34) {
                                        this.a.setText(LocaleController.getString(R.string.CallInviteViaLinkTitle));
                                    } else if (i42 == 6) {
                                        this.a.setText(LocaleController.getString(R.string.FileTooLarge));
                                    } else if (i42 != 14 || j0Var.X <= 1) {
                                        this.a.setText(LocaleController.getString(R.string.LimitReached));
                                    } else {
                                        this.a.setText(LocaleController.getString(R.string.CreateMultipleStories));
                                    }
                                    this.a.setTextSize(1, 20.0f);
                                    TextView textView6 = this.a;
                                    int i61 = g6.G6;
                                    c6Var7 = ((e3) j0Var).resourcesProvider;
                                    textView6.setTextColor(g6.w0(i61, c6Var7));
                                    this.a.setGravity(i34);
                                    if (i42 != i35 || i42 == 32 || j0Var.z1()) {
                                        ug.b bVar = new ug.b(context);
                                        this.c = bVar;
                                        bVar.a(j0Var.c0.boostCount, false);
                                        if (i42 == 32) {
                                            bVar.setVisibility(8);
                                        }
                                        if (j0Var.e0) {
                                            addView(this.a, a6.t(-2, -2, 1, 0, z10 ? 8 : i36, 0, 0));
                                            LinearLayout linearLayout = new LinearLayout(getContext());
                                            linearLayout.setOrientation(0);
                                            linearLayout.setClipChildren(false);
                                            FrameLayout frameLayout2 = new FrameLayout(getContext());
                                            int dp2 = AndroidUtilities.dp(14.0f);
                                            int i62 = g6.a7;
                                            c6Var8 = ((e3) j0Var).resourcesProvider;
                                            frameLayout2.setBackground(g6.c0(dp2, g6.w0(i62, c6Var8)));
                                            z9 z9Var = new z9(getContext());
                                            z9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
                                            i37 = ((e3) j0Var).currentAccount;
                                            TLRPC.Chat chat = MessagesController.getInstance(i37).getChat(Long.valueOf(-j0Var.a0));
                                            k9 k9Var = new k9();
                                            i38 = ((e3) j0Var).currentAccount;
                                            k9Var.k(i38, chat);
                                            z9Var.e(chat, k9Var);
                                            frameLayout2.addView(z9Var, a6.d(28.0f, 28));
                                            TextView textView7 = new TextView(getContext());
                                            if (chat != null) {
                                                textView7.setText(chat.title);
                                            }
                                            textView7.setSingleLine(true);
                                            textView7.setMaxLines(1);
                                            textView7.setEllipsize(TextUtils.TruncateAt.END);
                                            textView7.setTextSize(1, 13.0f);
                                            c6Var9 = ((e3) j0Var).resourcesProvider;
                                            textView7.setTextColor(g6.w0(i61, c6Var9));
                                            frameLayout2.addView(textView7, a6.a(-2.0f, 36.0f, 0.0f, 12.0f, 0.0f, -2, 16));
                                            linearLayout.addView(frameLayout2, a6.t(-2, 28, 80, 18, 0, 18, 0));
                                            LayoutTransition layoutTransition = new LayoutTransition();
                                            layoutTransition.setDuration(100L);
                                            layoutTransition.enableTransitionType(4);
                                            linearLayout.setLayoutTransition(layoutTransition);
                                            linearLayout.addView(bVar, a6.t(-2, -2, 48, -30, 2, 18, 0));
                                            addView(linearLayout, a6.t(-2, 38, 17, 0, -4, 0, 12));
                                            w7.c6.a(linearLayout);
                                            i39 = 1;
                                            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: sg.g0
                                                public final /* synthetic */ i0 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i39) {
                                                        case 0:
                                                            m2 m2Var2 = this.b.e.K0;
                                                            if (m2Var2 != null) {
                                                                k2 k2Var = new k2();
                                                                k2Var.a = true;
                                                                m2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), k2Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            j0 j0Var2 = this.b.e;
                                                            j0Var2.n.presentFragment(fo.W9(j0Var2.a0));
                                                            j0Var2.dismiss();
                                                            break;
                                                    }
                                                }
                                            });
                                            TextView textView8 = new TextView(context);
                                            this.b = textView8;
                                            textView8.setText(AndroidUtilities.replaceTags(formatString));
                                            this.b.setTextSize(i39, 14.0f);
                                            this.b.setGravity(i39);
                                            TextView textView9 = this.b;
                                            textView9.setLineSpacing(textView9.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                            if (i42 != 18) {
                                                c6Var11 = ((e3) j0Var).resourcesProvider;
                                                if (c6Var11 instanceof bi.b) {
                                                    TextView textView10 = this.b;
                                                    int i63 = g6.y6;
                                                    c6Var13 = ((e3) j0Var).resourcesProvider;
                                                    textView10.setTextColor(g6.w0(i63, c6Var13));
                                                } else {
                                                    TextView textView11 = this.b;
                                                    c6Var12 = ((e3) j0Var).resourcesProvider;
                                                    textView11.setTextColor(g6.w0(i61, c6Var12));
                                                }
                                            } else {
                                                TextView textView12 = this.b;
                                                c6Var10 = ((e3) j0Var).resourcesProvider;
                                                textView12.setTextColor(g6.w0(i61, c6Var10));
                                            }
                                            if (i42 != i35) {
                                                addView(this.b, a6.t(-2, -2, 1, 24, -2, 24, 17));
                                            } else {
                                                addView(this.b, a6.t(-2, -2, 1, 24, 0, 24, 24));
                                            }
                                            if (i42 == 31) {
                                                ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                                ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                                ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                                            }
                                            j0Var.M1();
                                            return;
                                        }
                                        LinearLayout linearLayout2 = new LinearLayout(context);
                                        this.d = linearLayout2;
                                        linearLayout2.setOrientation(0);
                                        this.d.setWeightSum(1.0f);
                                        this.d.addView(this.a, a6.o(-2, -2, 1.0f, 0));
                                        this.d.addView(bVar, a6.t(-2, -2, 48, 0, 2, 0, 0));
                                        addView(this.d, a6.t(-2, -2, 1, 12, z10 ? 8 : i36, 12, 9));
                                    } else {
                                        addView(this.a, a6.t(-2, -2, 1, 0, z10 ? 8 : i36, 0, 10));
                                    }
                                    i39 = 1;
                                    TextView textView82 = new TextView(context);
                                    this.b = textView82;
                                    textView82.setText(AndroidUtilities.replaceTags(formatString));
                                    this.b.setTextSize(i39, 14.0f);
                                    this.b.setGravity(i39);
                                    TextView textView92 = this.b;
                                    textView92.setLineSpacing(textView92.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                    if (i42 != 18) {
                                    }
                                    if (i42 != i35) {
                                    }
                                    if (i42 == 31) {
                                    }
                                    j0Var.M1();
                                    return;
                                }
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                            }
                            i36 = 22;
                            this.a.setTextSize(1, 20.0f);
                            TextView textView62 = this.a;
                            int i612 = g6.G6;
                            c6Var7 = ((e3) j0Var).resourcesProvider;
                            textView62.setTextColor(g6.w0(i612, c6Var7));
                            this.a.setGravity(i34);
                            if (i42 != i35) {
                            }
                            ug.b bVar2 = new ug.b(context);
                            this.c = bVar2;
                            bVar2.a(j0Var.c0.boostCount, false);
                            if (i42 == 32) {
                            }
                            if (j0Var.e0) {
                            }
                        }
                        i35 = 19;
                        i36 = 22;
                        this.a.setTextSize(1, 20.0f);
                        TextView textView622 = this.a;
                        int i6122 = g6.G6;
                        c6Var7 = ((e3) j0Var).resourcesProvider;
                        textView622.setTextColor(g6.w0(i6122, c6Var7));
                        this.a.setGravity(i34);
                        if (i42 != i35) {
                        }
                        ug.b bVar22 = new ug.b(context);
                        this.c = bVar22;
                        bVar22.a(j0Var.c0.boostCount, false);
                        if (i42 == 32) {
                        }
                        if (j0Var.e0) {
                        }
                    }
                }
                i19 = i17;
                if (i19 != 0) {
                }
                if (i42 != 11) {
                }
                i20 = ((e3) j0Var).currentAccount;
                if (!MessagesController.getInstance(i20).premiumFeaturesBlocked()) {
                    if (!j0Var.D0.isEmpty()) {
                    }
                    n9 n9Var2 = new n9(context, false);
                    n9Var2.a.q = AndroidUtilities.dp(3.33f);
                    n9Var2.setSize(AndroidUtilities.dp(72.0f));
                    n9Var2.setStepFactor(0.4f);
                    min = Math.min(arrayList3.size(), 3);
                    n9Var2.setCount(min);
                    while (i21 < min) {
                    }
                    n9Var2.a(false);
                    addView(n9Var2, a6.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                    TextView textView13 = new TextView(context);
                    textView13.setGravity(17);
                    yh.k(20.0f, i17, textView13);
                    int i552 = g6.j5;
                    c6Var = ((e3) j0Var).resourcesProvider;
                    textView13.setTextColor(g6.w0(i552, c6Var));
                    textView13.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                    addView(textView13, a6.t(-1, -2, 1, 32, 0, 32, 9));
                    TextView textView22 = new TextView(context);
                    textView22.setGravity(17);
                    textView22.setTextSize(1, 14.0f);
                    c6Var2 = ((e3) j0Var).resourcesProvider;
                    textView22.setTextColor(g6.w0(i552, c6Var2));
                    addView(textView22, a6.t(-1, -2, 1, 32, 0, 32, 19));
                    if (i42 != 34) {
                    }
                    arrayList4 = j0Var.C0;
                    if (arrayList4 != null) {
                    }
                    z11 = false;
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
                    j0Var.M1();
                    return;
                }
                if (i42 != 31) {
                    c6Var14 = ((e3) j0Var).resourcesProvider;
                    h0 h0Var4 = new h0(this, context, i43, i15, i52, f13, c6Var14);
                    j0Var.x0 = h0Var4;
                    if (i19 == 0) {
                    }
                    z12 = false;
                    if (i42 != 2) {
                    }
                    j0Var.x0.H = z12;
                    addView(j0Var.x0, a6.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                }
                if (i42 != 31) {
                }
                TextView textView52 = new TextView(context);
                this.a = textView52;
                textView52.setTypeface(AndroidUtilities.bold());
                if (i42 != 31) {
                }
                i35 = 19;
                i36 = 22;
                this.a.setTextSize(1, 20.0f);
                TextView textView6222 = this.a;
                int i61222 = g6.G6;
                c6Var7 = ((e3) j0Var).resourcesProvider;
                textView6222.setTextColor(g6.w0(i61222, c6Var7));
                this.a.setGravity(i34);
                if (i42 != i35) {
                }
                ug.b bVar222 = new ug.b(context);
                this.c = bVar222;
                bVar222.a(j0Var.c0.boostCount, false);
                if (i42 == 32) {
                }
                if (j0Var.e0) {
                }
            }
            i17 = 1;
            i18 = ((e3) j0Var).currentAccount;
            if (UserConfig.getInstance(i18).isPremium()) {
            }
            i15 = i52;
            f7 = 1.0f;
            float f132 = i51 / i52;
            if (i42 == 18) {
            }
            i19 = i17;
            if (i19 != 0) {
            }
            if (i42 != 11) {
            }
            i20 = ((e3) j0Var).currentAccount;
            if (!MessagesController.getInstance(i20).premiumFeaturesBlocked()) {
            }
            if (i42 != 31) {
            }
            if (i42 != 31) {
            }
            TextView textView522 = new TextView(context);
            this.a = textView522;
            textView522.setTypeface(AndroidUtilities.bold());
            if (i42 != 31) {
            }
            i35 = 19;
            i36 = 22;
            this.a.setTextSize(1, 20.0f);
            TextView textView62222 = this.a;
            int i612222 = g6.G6;
            c6Var7 = ((e3) j0Var).resourcesProvider;
            textView62222.setTextColor(g6.w0(i612222, c6Var7));
            this.a.setGravity(i34);
            if (i42 != i35) {
            }
            ug.b bVar2222 = new ug.b(context);
            this.c = bVar2222;
            bVar2222.a(j0Var.c0.boostCount, false);
            if (i42 == 32) {
            }
            if (j0Var.e0) {
            }
        } else if (i42 == 34) {
            str = j0Var.B0.size() == 1 ? LocaleController.formatString(R.string.InviteCallRestrictedUsersOne, ContactsController.formatName((TLRPC.User) j0Var.B0.get(0))) : LocaleController.formatPluralString("InviteCallRestrictedUsers", j0Var.B0.size(), Integer.valueOf(j0Var.B0.size()));
        } else if (premiumFeaturesBlocked) {
            str = (String) j0Var.M0.f;
        } else {
            i14 = ((e3) j0Var).currentAccount;
            str = (String) ((UserConfig.getInstance(i14).isPremium() || j0Var.N0) ? j0Var.M0.e : j0Var.M0.d);
        }
        formatString = str;
        z10 = premiumFeaturesBlocked;
        androidx.emoji2.text.p pVar2 = j0Var.M0;
        int i512 = pVar2.b;
        int i522 = pVar2.c;
        i15 = j0Var.w0;
        if (i42 != 3) {
        }
        i17 = 1;
        i18 = ((e3) j0Var).currentAccount;
        if (UserConfig.getInstance(i18).isPremium()) {
        }
        i15 = i522;
        f7 = 1.0f;
        float f1322 = i512 / i522;
        if (i42 == 18) {
        }
        i19 = i17;
        if (i19 != 0) {
        }
        if (i42 != 11) {
        }
        i20 = ((e3) j0Var).currentAccount;
        if (!MessagesController.getInstance(i20).premiumFeaturesBlocked()) {
        }
        if (i42 != 31) {
        }
        if (i42 != 31) {
        }
        TextView textView5222 = new TextView(context);
        this.a = textView5222;
        textView5222.setTypeface(AndroidUtilities.bold());
        if (i42 != 31) {
        }
        i35 = 19;
        i36 = 22;
        this.a.setTextSize(1, 20.0f);
        TextView textView622222 = this.a;
        int i6122222 = g6.G6;
        c6Var7 = ((e3) j0Var).resourcesProvider;
        textView622222.setTextColor(g6.w0(i6122222, c6Var7));
        this.a.setGravity(i34);
        if (i42 != i35) {
        }
        ug.b bVar22222 = new ug.b(context);
        this.c = bVar22222;
        bVar22222.a(j0Var.c0.boostCount, false);
        if (i42 == 32) {
        }
        if (j0Var.e0) {
        }
    }
}
