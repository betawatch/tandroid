package sg;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.d60;
import org.telegram.ui.sn;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class i0 extends LinearLayout {
    public TextView a;
    public TextView b;
    public final ug.b c;
    public LinearLayout d;
    public final /* synthetic */ j0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0d8c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0dbd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0da4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0d81  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0bbb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0bc2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x054e A[LOOP:0: B:227:0x054c->B:228:0x054e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0987  */
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
        g6 g6Var;
        g6 g6Var2;
        int i22;
        int i23;
        String str2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int size;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int size2;
        g6 g6Var3;
        int i29;
        int i30;
        g6 g6Var4;
        g6 g6Var5;
        g6 g6Var6;
        ArrayList arrayList8;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        g6 g6Var7;
        g6 g6Var8;
        g6 g6Var9;
        int i37;
        int i38;
        g6 g6Var10;
        final int i39;
        g6 g6Var11;
        g6 g6Var12;
        g6 g6Var13;
        g6 g6Var14;
        g6 g6Var15;
        int i40;
        boolean z11;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3;
        float f10;
        float f11;
        float f12;
        int i41;
        o2 o2Var = j0Var.n;
        this.e = j0Var;
        setOrientation(1);
        i10 = ((h3) j0Var).backgroundPaddingLeft;
        int dp = AndroidUtilities.dp(6.0f) + i10;
        i11 = ((h3) j0Var).backgroundPaddingLeft;
        setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i11, 0);
        int i42 = j0Var.h0;
        i12 = ((h3) j0Var).currentAccount;
        androidx.emoji2.text.p y12 = j0.y1(i42, i12);
        j0Var.M0 = y12;
        int i43 = y12.a;
        i13 = ((h3) j0Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i13);
        boolean premiumFeaturesBlocked = messagesController.premiumFeaturesBlocked();
        boolean B1 = j0Var.B1();
        if (i42 == 31) {
            str = LocaleController.getString(B1 ? R.string.BoostingAdditionalFeaturesSubtitle : R.string.BoostingAdditionalFeaturesSubtitleChannel);
        } else if (i42 == 32) {
            str = j0Var.u1(true);
        } else if (i42 == 19) {
            org.telegram.ui.Cells.t1 t1Var = j0Var.g0;
            if (t1Var != null) {
                int i44 = t1Var.getMessageObject().messageOwner.from_boosts_applied;
                TLRPC.Chat w12 = j0Var.w1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("GroupBoostedByUserWithTimes", i44, UserObject.getFirstName(j0Var.g0.getCurrentUser())));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.GroupBoostedByUserWithDescription, w12 == null ? "" : w12.title));
                str = spannableStringBuilder.toString();
            } else if (o2Var instanceof d60) {
                str = LocaleController.formatPluralString("BoostingGroupBoostWhatAreBoostsDescription", ug.q.g(), new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(j0Var.u1(true));
                if (ChatObject.hasAdminRights(j0Var.w1()) && B1) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.BoostingPremiumUserCanBoostGroupWithLink));
                }
                str = spannableStringBuilder2.toString();
            }
        } else if (i42 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = j0Var.b0;
            if (tL_premium_boostsStatus4.level == 0) {
                int i45 = B1 ? R.string.GroupNeedBoostsDescription : R.string.ChannelNeedBoostsDescription;
                int i46 = tL_premium_boostsStatus4.next_level_boosts;
                str = LocaleController.formatString(i45, LocaleController.formatPluralString("MoreBoosts", i46, Integer.valueOf(i46)));
            } else {
                int i47 = B1 ? R.string.GroupNeedBoostsDescriptionNextLevel : R.string.ChannelNeedBoostsDescriptionNextLevel;
                int i48 = tL_premium_boostsStatus4.next_level_boosts;
                int i49 = tL_premium_boostsStatus4.boosts;
                str = LocaleController.formatString(i47, LocaleController.formatPluralString("MoreBoosts", i48 - i49, Integer.valueOf(i48 - i49)), LocaleController.formatPluralString("BoostStories", j0Var.b0.level + 1, new Object[0]));
            }
        } else if (i42 == 20) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(j0Var.s1()));
        } else if (i42 == 24) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(j0Var.s1()));
        } else if (i42 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i42 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i42 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i42 == 25) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(B1 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i42 == 26) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(B1 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i42 == 27) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i42 == 28) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(B1 ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i42 == 22) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(B1 ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i42 == 23) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(B1 ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
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
                i41 = ((h3) j0Var).currentAccount;
                i15 = MessagesController.getInstance(i41).dialogFilters.size() - 1;
            } else if (i42 == 7) {
                i15 = UserConfig.getActivatedAccountsCount();
            } else if (i42 == 0) {
                i16 = ((h3) j0Var).currentAccount;
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
                i18 = ((h3) j0Var).currentAccount;
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
                            i20 = ((h3) j0Var).currentAccount;
                            if (!MessagesController.getInstance(i20).premiumFeaturesBlocked() && (((arrayList = j0Var.D0) != null && !arrayList.isEmpty()) || ((arrayList2 = j0Var.C0) != null && arrayList2.size() >= j0Var.B0.size()))) {
                                arrayList3 = !j0Var.D0.isEmpty() ? j0Var.C0 : j0Var.D0;
                                k9 k9Var = new k9(context, false);
                                k9Var.a.q = AndroidUtilities.dp(3.33f);
                                k9Var.setSize(AndroidUtilities.dp(72.0f));
                                k9Var.setStepFactor(0.4f);
                                min = Math.min(arrayList3.size(), 3);
                                k9Var.setCount(min);
                                for (i21 = 0; i21 < min; i21++) {
                                    Long l4 = (Long) arrayList3.get(i21);
                                    l4.getClass();
                                    i32 = ((h3) j0Var).currentAccount;
                                    TLRPC.User user = MessagesController.getInstance(i32).getUser(l4);
                                    i33 = ((h3) j0Var).currentAccount;
                                    k9Var.b(i21, user, i33);
                                }
                                k9Var.a(false);
                                addView(k9Var, z5.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                                TextView textView = new TextView(context);
                                textView.setGravity(17);
                                sl.k(20.0f, i17, textView);
                                int i55 = k6.j5;
                                g6Var = ((h3) j0Var).resourcesProvider;
                                r6.W(textView, i55, g6Var);
                                textView.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                                addView(textView, z5.t(-1, -2, 1, 32, 0, 32, 9));
                                TextView textView2 = new TextView(context);
                                textView2.setGravity(17);
                                textView2.setTextSize(1, 14.0f);
                                g6Var2 = ((h3) j0Var).resourcesProvider;
                                r6.W(textView2, i55, g6Var2);
                                addView(textView2, z5.t(-1, -2, 1, 32, 0, 32, 19));
                                boolean z12 = i42 != 34;
                                ArrayList arrayList9 = j0Var.C0;
                                boolean z13 = arrayList9 == null && arrayList9.size() >= j0Var.D0.size();
                                if (arrayList3.size() != 1) {
                                    int i56 = z12 ? R.string.InviteCallMessagePremiumBlockedOne : z13 ? R.string.InviteMessagePremiumBlockedOne : R.string.InvitePremiumBlockedOne;
                                    i31 = ((h3) j0Var).currentAccount;
                                    str2 = LocaleController.formatString(i56, UserObject.getForcedFirstName(MessagesController.getInstance(i31).getUser((Long) arrayList3.get(0))));
                                } else if (arrayList3.size() == 2) {
                                    int i57 = z12 ? R.string.InviteCallMessagePremiumBlockedTwo : z13 ? R.string.InviteMessagePremiumBlockedTwo : R.string.InvitePremiumBlockedTwo;
                                    i27 = ((h3) j0Var).currentAccount;
                                    String forcedFirstName = UserObject.getForcedFirstName(MessagesController.getInstance(i27).getUser((Long) arrayList3.get(0)));
                                    i28 = ((h3) j0Var).currentAccount;
                                    str2 = LocaleController.formatString(i57, forcedFirstName, UserObject.getForcedFirstName(MessagesController.getInstance(i28).getUser((Long) arrayList3.get(1))));
                                } else if (arrayList3.size() == 3) {
                                    int i58 = z12 ? R.string.InviteCallMessagePremiumBlockedThree : z13 ? R.string.InviteMessagePremiumBlockedThree : R.string.InvitePremiumBlockedThree;
                                    i24 = ((h3) j0Var).currentAccount;
                                    String forcedFirstName2 = UserObject.getForcedFirstName(MessagesController.getInstance(i24).getUser((Long) arrayList3.get(0)));
                                    i25 = ((h3) j0Var).currentAccount;
                                    String forcedFirstName3 = UserObject.getForcedFirstName(MessagesController.getInstance(i25).getUser((Long) arrayList3.get(1)));
                                    i26 = ((h3) j0Var).currentAccount;
                                    str2 = LocaleController.formatString(i58, forcedFirstName2, forcedFirstName3, UserObject.getForcedFirstName(MessagesController.getInstance(i26).getUser((Long) arrayList3.get(2))));
                                } else {
                                    String str3 = z12 ? "InviteCallMessagePremiumBlockedMany" : z13 ? "InviteMessagePremiumBlockedMany" : "InvitePremiumBlockedMany";
                                    int size4 = arrayList3.size() - 2;
                                    i22 = ((h3) j0Var).currentAccount;
                                    String forcedFirstName4 = UserObject.getForcedFirstName(MessagesController.getInstance(i22).getUser((Long) arrayList3.get(0)));
                                    i23 = ((h3) j0Var).currentAccount;
                                    String formatPluralString = LocaleController.formatPluralString(str3, size4, forcedFirstName4, UserObject.getForcedFirstName(MessagesController.getInstance(i23).getUser((Long) arrayList3.get(1))));
                                    int size5 = arrayList3.size() - 2;
                                    int themedColor = j0Var.getThemedColor(k6.h5);
                                    k9Var.b = new a1(k6.Lj, k6.Mj, -1, -1, null);
                                    k9Var.c = new i11(i2.o1.k(size5, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                                    Paint paint = new Paint(1);
                                    k9Var.d = paint;
                                    paint.setColor(themedColor);
                                    str2 = formatPluralString;
                                }
                                textView2.setText(AndroidUtilities.replaceTags(str2));
                                arrayList4 = j0Var.D0;
                                if (arrayList4 != null) {
                                    size = 0;
                                } else {
                                    arrayList5 = j0Var.D0;
                                    size = arrayList5.size();
                                }
                                arrayList6 = j0Var.C0;
                                if (arrayList6 != null) {
                                    size2 = 0;
                                } else {
                                    arrayList7 = j0Var.C0;
                                    size2 = arrayList7.size();
                                }
                                if (size - size2 > 0 || ((size == 1 && size2 == 1) || !j0Var.Y)) {
                                    ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                    j0Var.j0 = true;
                                } else {
                                    g6Var3 = ((h3) j0Var).resourcesProvider;
                                    final int i59 = 0;
                                    p0 p0Var = new p0(context, g6Var3, false);
                                    b6.b(p0Var, 0.02f, 1.2f);
                                    p0Var.a(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), new View.OnClickListener(this) { // from class: sg.g0
                                        public final /* synthetic */ i0 b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            switch (i59) {
                                                case 0:
                                                    o2 o2Var2 = this.b.e.K0;
                                                    if (o2Var2 != null) {
                                                        m2 m2Var = new m2();
                                                        m2Var.a = true;
                                                        o2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), m2Var);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    j0 j0Var2 = this.b.e;
                                                    j0Var2.n.presentFragment(sn.W9(j0Var2.a0));
                                                    j0Var2.dismiss();
                                                    break;
                                            }
                                        }
                                    }, false);
                                    i29 = ((h3) j0Var).backgroundPaddingLeft;
                                    float f14 = (i29 / AndroidUtilities.density) + 4.0f;
                                    i30 = ((h3) j0Var).backgroundPaddingLeft;
                                    addView(p0Var, z5.k(f14, 0.0f, (i30 / AndroidUtilities.density) + 4.0f, 18.0f, -1, 48));
                                    di.n nVar = new di.n(this, context);
                                    nVar.setGravity(17);
                                    int i60 = k6.z6;
                                    g6Var4 = ((h3) j0Var).resourcesProvider;
                                    r6.W(nVar, i60, g6Var4);
                                    nVar.setText(" " + LocaleController.getString(R.string.InvitePremiumBlockedOr) + " ");
                                    nVar.setTextSize(14.0f);
                                    addView(nVar, z5.t(190, -2, 1, 12, 0, 12, 20));
                                    TextView textView3 = new TextView(context);
                                    textView3.setGravity(17);
                                    textView3.setTypeface(AndroidUtilities.bold());
                                    textView3.setTextSize(1, 20.0f);
                                    g6Var5 = ((h3) j0Var).resourcesProvider;
                                    r6.W(textView3, i55, g6Var5);
                                    textView3.setText(LocaleController.getString(R.string.InviteBlockedTitle));
                                    addView(textView3, z5.t(-1, -2, 1, 32, 0, 32, 9));
                                    TextView textView4 = new TextView(context);
                                    textView4.setGravity(17);
                                    textView4.setTextSize(1, 14.0f);
                                    g6Var6 = ((h3) j0Var).resourcesProvider;
                                    r6.W(textView4, i55, g6Var6);
                                    arrayList8 = j0Var.D0;
                                    if (arrayList8.size() <= 1) {
                                        textView4.setText(LocaleController.getString(R.string.InviteBlockedOneMessage));
                                    } else {
                                        textView4.setText(LocaleController.getString(R.string.InviteBlockedManyMessage));
                                    }
                                    addView(textView4, z5.t(-1, -2, 1, 32, 0, 32, 19));
                                }
                                j0Var.P1();
                                return;
                            }
                        }
                        if (i42 != 31 && i42 != 34) {
                            g6Var15 = ((h3) j0Var).resourcesProvider;
                            h0 h0Var = new h0(this, context, i43, i15, i52, f13, g6Var15);
                            j0Var.x0 = h0Var;
                            if (i19 == 0) {
                                tL_premium_boostsStatus2 = j0Var.b0;
                                if (tL_premium_boostsStatus2 != null) {
                                    h0 h0Var2 = j0Var.x0;
                                    tL_premium_boostsStatus3 = j0Var.b0;
                                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.c0;
                                    h0Var2.g(tL_premium_boostsStatus3, canApplyBoost != null && canApplyBoost.boostedNow);
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
                                    i40 = ((h3) j0Var).currentAccount;
                                    if (UserConfig.getInstance(i40).isPremium() || j0Var.N0) {
                                        j0Var.x0.v.setVisibility(8);
                                        if (i42 == 6) {
                                            j0Var.x0.w.setText("2 GB");
                                        } else {
                                            j0Var.x0.w.setText(Integer.toString(i51));
                                        }
                                        z11 = false;
                                        j0Var.x0.w.setVisibility(0);
                                        if (i42 != 2 || i42 == 5) {
                                            j0Var.x0.H = z11;
                                        }
                                        addView(j0Var.x0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                                    }
                                }
                            }
                            z11 = false;
                            if (i42 != 2) {
                            }
                            j0Var.x0.H = z11;
                            addView(j0Var.x0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                        if (i42 != 31) {
                            FrameLayout frameLayout = new FrameLayout(context);
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(f0.c.c(getContext(), R.drawable.large_boosts));
                            i34 = 17;
                            frameLayout.addView(imageView, z5.e(-2, -2, 17));
                            int dp2 = AndroidUtilities.dp(79.0f);
                            int i61 = k6.Oh;
                            ShapeDrawable K = k6.K(dp2, k6.v0(i61));
                            n6 O = r6.O(i61);
                            frameLayout.setBackground(K);
                            r6.k(frameLayout, K, O, null, null);
                            addView(frameLayout, z5.t(79, 79, 1, 0, 23, 0, 0));
                        } else {
                            i34 = 17;
                        }
                        TextView textView5 = new TextView(context);
                        this.a = textView5;
                        textView5.setTypeface(AndroidUtilities.bold());
                        if (i42 != 31) {
                            this.a.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                        } else if (i42 == 32) {
                            this.a.setText(j0Var.v1());
                        } else {
                            i35 = 19;
                            if (i42 == 19) {
                                if (o2Var instanceof d60) {
                                    this.a.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                                } else {
                                    this.a.setText(j0Var.v1());
                                }
                            } else if (i42 == 30) {
                                this.a.setText(j0Var.v1());
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
                                    int i62 = k6.G6;
                                    g6Var7 = ((h3) j0Var).resourcesProvider;
                                    r6.W(textView6, i62, g6Var7);
                                    this.a.setGravity(i34);
                                    if (i42 != i35 || i42 == 32 || j0Var.C1()) {
                                        ug.b bVar = new ug.b(context);
                                        this.c = bVar;
                                        bVar.a(j0Var.c0.boostCount, false);
                                        if (i42 == 32) {
                                            bVar.setVisibility(8);
                                        }
                                        if (j0Var.e0) {
                                            addView(this.a, z5.t(-2, -2, 1, 0, z10 ? 8 : i36, 0, 0));
                                            LinearLayout linearLayout = new LinearLayout(getContext());
                                            linearLayout.setOrientation(0);
                                            linearLayout.setClipChildren(false);
                                            FrameLayout frameLayout2 = new FrameLayout(getContext());
                                            int dp3 = AndroidUtilities.dp(14.0f);
                                            int i63 = k6.a7;
                                            g6Var8 = ((h3) j0Var).resourcesProvider;
                                            ShapeDrawable c02 = k6.c0(dp3, k6.w0(i63, g6Var8));
                                            n6 O2 = r6.O(i63);
                                            g6Var9 = ((h3) j0Var).resourcesProvider;
                                            r6.D(frameLayout2, c02, O2, g6Var9);
                                            w9 w9Var = new w9(getContext());
                                            w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
                                            i37 = ((h3) j0Var).currentAccount;
                                            TLRPC.Chat chat = MessagesController.getInstance(i37).getChat(Long.valueOf(-j0Var.a0));
                                            h9 h9Var = new h9();
                                            i38 = ((h3) j0Var).currentAccount;
                                            h9Var.k(i38, chat);
                                            w9Var.e(chat, h9Var);
                                            frameLayout2.addView(w9Var, z5.c(28.0f, 28));
                                            TextView textView7 = new TextView(getContext());
                                            if (chat != null) {
                                                textView7.setText(chat.title);
                                            }
                                            textView7.setSingleLine(true);
                                            textView7.setMaxLines(1);
                                            textView7.setEllipsize(TextUtils.TruncateAt.END);
                                            textView7.setTextSize(1, 13.0f);
                                            g6Var10 = ((h3) j0Var).resourcesProvider;
                                            r6.W(textView7, i62, g6Var10);
                                            frameLayout2.addView(textView7, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                            linearLayout.addView(frameLayout2, z5.t(-2, 28, 80, 18, 0, 18, 0));
                                            LayoutTransition layoutTransition = new LayoutTransition();
                                            layoutTransition.setDuration(100L);
                                            layoutTransition.enableTransitionType(4);
                                            linearLayout.setLayoutTransition(layoutTransition);
                                            linearLayout.addView(bVar, z5.t(-2, -2, 48, -30, 2, 18, 0));
                                            addView(linearLayout, z5.t(-2, 38, 17, 0, -4, 0, 12));
                                            b6.a(linearLayout);
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
                                                            o2 o2Var2 = this.b.e.K0;
                                                            if (o2Var2 != null) {
                                                                m2 m2Var = new m2();
                                                                m2Var.a = true;
                                                                o2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), m2Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            j0 j0Var2 = this.b.e;
                                                            j0Var2.n.presentFragment(sn.W9(j0Var2.a0));
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
                                                g6Var12 = ((h3) j0Var).resourcesProvider;
                                                if (g6Var12 instanceof ci.b) {
                                                    TextView textView10 = this.b;
                                                    int i64 = k6.y6;
                                                    g6Var14 = ((h3) j0Var).resourcesProvider;
                                                    r6.W(textView10, i64, g6Var14);
                                                } else {
                                                    TextView textView11 = this.b;
                                                    g6Var13 = ((h3) j0Var).resourcesProvider;
                                                    r6.W(textView11, i62, g6Var13);
                                                }
                                            } else {
                                                TextView textView12 = this.b;
                                                g6Var11 = ((h3) j0Var).resourcesProvider;
                                                r6.W(textView12, i62, g6Var11);
                                            }
                                            if (i42 != i35) {
                                                addView(this.b, z5.t(-2, -2, 1, 24, -2, 24, 17));
                                            } else {
                                                addView(this.b, z5.t(-2, -2, 1, 24, 0, 24, 24));
                                            }
                                            if (i42 == 31) {
                                                ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                                ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                                ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                                            }
                                            j0Var.P1();
                                            return;
                                        }
                                        LinearLayout linearLayout2 = new LinearLayout(context);
                                        this.d = linearLayout2;
                                        linearLayout2.setOrientation(0);
                                        this.d.setWeightSum(1.0f);
                                        this.d.addView(this.a, z5.o(-2, -2, 1.0f, 0));
                                        this.d.addView(bVar, z5.t(-2, -2, 48, 0, 2, 0, 0));
                                        addView(this.d, z5.t(-2, -2, 1, 12, z10 ? 8 : i36, 12, 9));
                                    } else {
                                        addView(this.a, z5.t(-2, -2, 1, 0, z10 ? 8 : i36, 0, 10));
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
                                    j0Var.P1();
                                    return;
                                }
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                            }
                            i36 = 22;
                            this.a.setTextSize(1, 20.0f);
                            TextView textView62 = this.a;
                            int i622 = k6.G6;
                            g6Var7 = ((h3) j0Var).resourcesProvider;
                            r6.W(textView62, i622, g6Var7);
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
                        int i6222 = k6.G6;
                        g6Var7 = ((h3) j0Var).resourcesProvider;
                        r6.W(textView622, i6222, g6Var7);
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
                i20 = ((h3) j0Var).currentAccount;
                if (!MessagesController.getInstance(i20).premiumFeaturesBlocked()) {
                    if (!j0Var.D0.isEmpty()) {
                    }
                    k9 k9Var2 = new k9(context, false);
                    k9Var2.a.q = AndroidUtilities.dp(3.33f);
                    k9Var2.setSize(AndroidUtilities.dp(72.0f));
                    k9Var2.setStepFactor(0.4f);
                    min = Math.min(arrayList3.size(), 3);
                    k9Var2.setCount(min);
                    while (i21 < min) {
                    }
                    k9Var2.a(false);
                    addView(k9Var2, z5.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                    TextView textView13 = new TextView(context);
                    textView13.setGravity(17);
                    sl.k(20.0f, i17, textView13);
                    int i552 = k6.j5;
                    g6Var = ((h3) j0Var).resourcesProvider;
                    r6.W(textView13, i552, g6Var);
                    textView13.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                    addView(textView13, z5.t(-1, -2, 1, 32, 0, 32, 9));
                    TextView textView22 = new TextView(context);
                    textView22.setGravity(17);
                    textView22.setTextSize(1, 14.0f);
                    g6Var2 = ((h3) j0Var).resourcesProvider;
                    r6.W(textView22, i552, g6Var2);
                    addView(textView22, z5.t(-1, -2, 1, 32, 0, 32, 19));
                    if (i42 != 34) {
                    }
                    ArrayList arrayList92 = j0Var.C0;
                    if (arrayList92 == null) {
                    }
                    if (arrayList3.size() != 1) {
                    }
                    textView22.setText(AndroidUtilities.replaceTags(str2));
                    arrayList4 = j0Var.D0;
                    if (arrayList4 != null) {
                    }
                    arrayList6 = j0Var.C0;
                    if (arrayList6 != null) {
                    }
                    if (size - size2 > 0) {
                    }
                    ((ViewGroup.MarginLayoutParams) textView22.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    j0Var.j0 = true;
                    j0Var.P1();
                    return;
                }
                if (i42 != 31) {
                    g6Var15 = ((h3) j0Var).resourcesProvider;
                    h0 h0Var4 = new h0(this, context, i43, i15, i52, f13, g6Var15);
                    j0Var.x0 = h0Var4;
                    if (i19 == 0) {
                    }
                    z11 = false;
                    if (i42 != 2) {
                    }
                    j0Var.x0.H = z11;
                    addView(j0Var.x0, z5.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
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
                int i62222 = k6.G6;
                g6Var7 = ((h3) j0Var).resourcesProvider;
                r6.W(textView6222, i62222, g6Var7);
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
            i18 = ((h3) j0Var).currentAccount;
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
            i20 = ((h3) j0Var).currentAccount;
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
            int i622222 = k6.G6;
            g6Var7 = ((h3) j0Var).resourcesProvider;
            r6.W(textView62222, i622222, g6Var7);
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
            i14 = ((h3) j0Var).currentAccount;
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
        i18 = ((h3) j0Var).currentAccount;
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
        i20 = ((h3) j0Var).currentAccount;
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
        int i6222222 = k6.G6;
        g6Var7 = ((h3) j0Var).resourcesProvider;
        r6.W(textView622222, i6222222, g6Var7);
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
