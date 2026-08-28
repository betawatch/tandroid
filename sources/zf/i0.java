package zf;

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
import g7.e6;
import g7.g6;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.qn;
import org.telegram.ui.y50;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i0 extends LinearLayout {
    public TextView a;
    public TextView b;
    public final bg.c c;
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
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        String formatString;
        boolean z10;
        int i14;
        int i15;
        int i16;
        float f10;
        boolean z11;
        int i17;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int min;
        int i18;
        b6 b6Var;
        b6 b6Var2;
        ArrayList arrayList4;
        boolean z12;
        int i19;
        int i20;
        String str2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int size;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int size2;
        b6 b6Var3;
        int i26;
        int i27;
        b6 b6Var4;
        b6 b6Var5;
        b6 b6Var6;
        ArrayList arrayList9;
        int i28;
        ArrayList arrayList10;
        ArrayList arrayList11;
        int i29;
        int i30;
        int i31;
        int i32;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        b6 b6Var7;
        b6 b6Var8;
        int i33;
        int i34;
        b6 b6Var9;
        final int i35;
        b6 b6Var10;
        b6 b6Var11;
        b6 b6Var12;
        b6 b6Var13;
        b6 b6Var14;
        int i36;
        boolean z13;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3;
        float f11;
        float f12;
        int i37;
        o2 o2Var = j0Var.n;
        this.e = j0Var;
        setOrientation(1);
        i9 = ((f3) j0Var).backgroundPaddingLeft;
        int dp = AndroidUtilities.dp(6.0f) + i9;
        i10 = ((f3) j0Var).backgroundPaddingLeft;
        setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i10, 0);
        int i38 = j0Var.d0;
        i11 = ((f3) j0Var).currentAccount;
        androidx.emoji2.text.o u12 = j0.u1(i38, i11);
        j0Var.I0 = u12;
        int i39 = u12.a;
        i12 = ((f3) j0Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i12);
        boolean premiumFeaturesBlocked = messagesController.premiumFeaturesBlocked();
        boolean x12 = j0Var.x1();
        if (i38 == 31) {
            str = LocaleController.getString(x12 ? R.string.BoostingAdditionalFeaturesSubtitle : R.string.BoostingAdditionalFeaturesSubtitleChannel);
        } else if (i38 == 32) {
            str = j0Var.q1(true);
        } else if (i38 == 19) {
            org.telegram.ui.Cells.t1 t1Var = j0Var.c0;
            if (t1Var != null) {
                int i40 = t1Var.getMessageObject().messageOwner.from_boosts_applied;
                TLRPC.Chat s12 = j0Var.s1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("GroupBoostedByUserWithTimes", i40, UserObject.getFirstName(j0Var.c0.getCurrentUser())));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.GroupBoostedByUserWithDescription, s12 == null ? "" : s12.title));
                str = spannableStringBuilder.toString();
            } else if (o2Var instanceof y50) {
                str = LocaleController.formatPluralString("BoostingGroupBoostWhatAreBoostsDescription", bg.u0.g(), new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(j0Var.q1(true));
                if (ChatObject.hasAdminRights(j0Var.s1()) && x12) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.BoostingPremiumUserCanBoostGroupWithLink));
                }
                str = spannableStringBuilder2.toString();
            }
        } else if (i38 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = j0Var.X;
            if (tL_premium_boostsStatus4.level == 0) {
                int i41 = x12 ? R.string.GroupNeedBoostsDescription : R.string.ChannelNeedBoostsDescription;
                int i42 = tL_premium_boostsStatus4.next_level_boosts;
                str = LocaleController.formatString(i41, LocaleController.formatPluralString("MoreBoosts", i42, Integer.valueOf(i42)));
            } else {
                int i43 = x12 ? R.string.GroupNeedBoostsDescriptionNextLevel : R.string.ChannelNeedBoostsDescriptionNextLevel;
                int i44 = tL_premium_boostsStatus4.next_level_boosts;
                int i45 = tL_premium_boostsStatus4.boosts;
                str = LocaleController.formatString(i43, LocaleController.formatPluralString("MoreBoosts", i44 - i45, Integer.valueOf(i44 - i45)), LocaleController.formatPluralString("BoostStories", j0Var.X.level + 1, new Object[0]));
            }
        } else if (i38 == 20) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(j0Var.o1()));
        } else if (i38 == 24) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(j0Var.o1()));
        } else if (i38 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i38 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i38 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i38 == 25) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i38 == 26) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i38 == 27) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i38 == 28) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(x12 ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i38 == 22) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i38 == 23) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else if (i38 == 21) {
            int i46 = j0Var.N0;
            str = LocaleController.formatPluralString("ReactionReachLvlForReaction", i46, Integer.valueOf(i46));
        } else if (i38 == 11) {
            formatString = !j0Var.U ? ChatObject.isChannelAndNotMegaGroup(j0Var.K0) ? j0Var.x0.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsers2One, ContactsController.formatName((TLRPC.User) j0Var.x0.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers2", j0Var.x0.size(), Integer.valueOf(j0Var.x0.size())) : j0Var.x0.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsers2One, ContactsController.formatName((TLRPC.User) j0Var.x0.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers2", j0Var.x0.size(), Integer.valueOf(j0Var.x0.size())) : ChatObject.isChannelAndNotMegaGroup(j0Var.K0) ? j0Var.x0.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsersOne, ContactsController.formatName((TLRPC.User) j0Var.x0.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers", j0Var.x0.size(), Integer.valueOf(j0Var.x0.size())) : j0Var.x0.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsersOne, ContactsController.formatName((TLRPC.User) j0Var.x0.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers", j0Var.x0.size(), Integer.valueOf(j0Var.x0.size()));
            z10 = true;
            androidx.emoji2.text.o oVar = j0Var.I0;
            int i47 = oVar.b;
            int i48 = oVar.c;
            i14 = j0Var.s0;
            if (i38 != 3) {
                i37 = ((f3) j0Var).currentAccount;
                i14 = MessagesController.getInstance(i37).dialogFilters.size() - 1;
            } else if (i38 == 7) {
                i14 = UserConfig.getActivatedAccountsCount();
            } else if (i38 == 0) {
                i15 = ((f3) j0Var).currentAccount;
                ArrayList<TLRPC.Dialog> dialogs = MessagesController.getInstance(i15).getDialogs(0);
                int size3 = dialogs.size();
                int i49 = 0;
                for (int i50 = 0; i50 < size3; i50++) {
                    TLRPC.Dialog dialog = dialogs.get(i50);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                        i49++;
                    }
                }
                i14 = i49;
                i16 = ((f3) j0Var).currentAccount;
                if (!UserConfig.getInstance(i16).isPremium() || j0Var.J0) {
                    i14 = i48;
                    f10 = 1.0f;
                } else {
                    i14 = i14 < 0 ? i47 : i14;
                    if (i38 != 7) {
                        f11 = i14;
                        f12 = i48;
                    } else if (i14 > i47) {
                        f11 = i14 - i47;
                        f12 = i48 - i47;
                    } else {
                        f10 = 0.5f;
                    }
                    f10 = f11 / f12;
                }
                float f13 = i47 / i48;
                if (i38 == 18 && i38 != 20 && i38 != 24 && i38 != 25 && i38 != 26) {
                    if (i38 != 29 && i38 != 22 && i38 != 23 && i38 != 19 && i38 != 30 && i38 != 35 && i38 != 21 && i38 != 27 && i38 != 28 && i38 != 32) {
                        z11 = false;
                        i14 = z11 ? 0 : i14;
                        if (i38 != 11 || i38 == 34) {
                            i17 = ((f3) j0Var).currentAccount;
                            if (!MessagesController.getInstance(i17).premiumFeaturesBlocked() && (((arrayList = j0Var.z0) != null && !arrayList.isEmpty()) || ((arrayList2 = j0Var.y0) != null && arrayList2.size() >= j0Var.x0.size()))) {
                                arrayList3 = !j0Var.z0.isEmpty() ? j0Var.y0 : j0Var.z0;
                                c9 c9Var = new c9(context, false);
                                c9Var.a.q = AndroidUtilities.dp(3.33f);
                                c9Var.setSize(AndroidUtilities.dp(72.0f));
                                c9Var.setStepFactor(0.4f);
                                min = Math.min(arrayList3.size(), 3);
                                c9Var.setCount(min);
                                for (i18 = 0; i18 < min; i18++) {
                                    Long l10 = (Long) arrayList3.get(i18);
                                    l10.getClass();
                                    i29 = ((f3) j0Var).currentAccount;
                                    TLRPC.User user = MessagesController.getInstance(i29).getUser(l10);
                                    i30 = ((f3) j0Var).currentAccount;
                                    c9Var.b(i18, user, i30);
                                }
                                c9Var.a(false);
                                addView(c9Var, e6.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                                TextView textView = new TextView(context);
                                textView.setGravity(17);
                                ll.k(20.0f, 1, textView);
                                int i51 = f6.j5;
                                b6Var = ((f3) j0Var).resourcesProvider;
                                textView.setTextColor(f6.v0(i51, b6Var));
                                textView.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                                addView(textView, e6.t(-1, -2, 1, 32, 0, 32, 9));
                                TextView textView2 = new TextView(context);
                                textView2.setGravity(17);
                                textView2.setTextSize(1, 14.0f);
                                b6Var2 = ((f3) j0Var).resourcesProvider;
                                textView2.setTextColor(f6.v0(i51, b6Var2));
                                addView(textView2, e6.t(-1, -2, 1, 32, 0, 32, 19));
                                boolean z14 = i38 != 34;
                                arrayList4 = j0Var.y0;
                                if (arrayList4 != null) {
                                    arrayList10 = j0Var.y0;
                                    int size4 = arrayList10.size();
                                    arrayList11 = j0Var.z0;
                                    if (size4 >= arrayList11.size()) {
                                        z12 = true;
                                        if (arrayList3.size() == 1) {
                                            int i52 = z14 ? R.string.InviteCallMessagePremiumBlockedOne : z12 ? R.string.InviteMessagePremiumBlockedOne : R.string.InvitePremiumBlockedOne;
                                            i28 = ((f3) j0Var).currentAccount;
                                            str2 = LocaleController.formatString(i52, UserObject.getForcedFirstName(MessagesController.getInstance(i28).getUser((Long) arrayList3.get(0))));
                                        } else if (arrayList3.size() == 2) {
                                            int i53 = z14 ? R.string.InviteCallMessagePremiumBlockedTwo : z12 ? R.string.InviteMessagePremiumBlockedTwo : R.string.InvitePremiumBlockedTwo;
                                            i24 = ((f3) j0Var).currentAccount;
                                            String forcedFirstName = UserObject.getForcedFirstName(MessagesController.getInstance(i24).getUser((Long) arrayList3.get(0)));
                                            i25 = ((f3) j0Var).currentAccount;
                                            str2 = LocaleController.formatString(i53, forcedFirstName, UserObject.getForcedFirstName(MessagesController.getInstance(i25).getUser((Long) arrayList3.get(1))));
                                        } else if (arrayList3.size() == 3) {
                                            int i54 = z14 ? R.string.InviteCallMessagePremiumBlockedThree : z12 ? R.string.InviteMessagePremiumBlockedThree : R.string.InvitePremiumBlockedThree;
                                            i21 = ((f3) j0Var).currentAccount;
                                            String forcedFirstName2 = UserObject.getForcedFirstName(MessagesController.getInstance(i21).getUser((Long) arrayList3.get(0)));
                                            i22 = ((f3) j0Var).currentAccount;
                                            String forcedFirstName3 = UserObject.getForcedFirstName(MessagesController.getInstance(i22).getUser((Long) arrayList3.get(1)));
                                            i23 = ((f3) j0Var).currentAccount;
                                            str2 = LocaleController.formatString(i54, forcedFirstName2, forcedFirstName3, UserObject.getForcedFirstName(MessagesController.getInstance(i23).getUser((Long) arrayList3.get(2))));
                                        } else {
                                            String str3 = z14 ? "InviteCallMessagePremiumBlockedMany" : z12 ? "InviteMessagePremiumBlockedMany" : "InvitePremiumBlockedMany";
                                            int size5 = arrayList3.size() - 2;
                                            i19 = ((f3) j0Var).currentAccount;
                                            String forcedFirstName4 = UserObject.getForcedFirstName(MessagesController.getInstance(i19).getUser((Long) arrayList3.get(0)));
                                            i20 = ((f3) j0Var).currentAccount;
                                            String formatPluralString = LocaleController.formatPluralString(str3, size5, forcedFirstName4, UserObject.getForcedFirstName(MessagesController.getInstance(i20).getUser((Long) arrayList3.get(1))));
                                            int size6 = arrayList3.size() - 2;
                                            int themedColor = j0Var.getThemedColor(f6.h5);
                                            c9Var.b = new z0(f6.Lj, f6.Mj, -1, -1, null);
                                            c9Var.c = new nz0(j3.r0.l(size6, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                                            Paint paint = new Paint(1);
                                            c9Var.d = paint;
                                            paint.setColor(themedColor);
                                            str2 = formatPluralString;
                                        }
                                        textView2.setText(AndroidUtilities.replaceTags(str2));
                                        arrayList5 = j0Var.z0;
                                        if (arrayList5 == null) {
                                            size = 0;
                                        } else {
                                            arrayList6 = j0Var.z0;
                                            size = arrayList6.size();
                                        }
                                        arrayList7 = j0Var.y0;
                                        if (arrayList7 == null) {
                                            size2 = 0;
                                        } else {
                                            arrayList8 = j0Var.y0;
                                            size2 = arrayList8.size();
                                        }
                                        if (size - size2 > 0 || ((size == 1 && size2 == 1) || !j0Var.U)) {
                                            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                            j0Var.f0 = true;
                                        } else {
                                            b6Var3 = ((f3) j0Var).resourcesProvider;
                                            final int i55 = 0;
                                            p0 p0Var = new p0(context, b6Var3, false);
                                            g6.b(p0Var, 0.02f, 1.2f);
                                            p0Var.a(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), new View.OnClickListener(this) { // from class: zf.g0
                                                public final /* synthetic */ i0 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i55) {
                                                        case 0:
                                                            o2 o2Var2 = this.b.e.G0;
                                                            if (o2Var2 != null) {
                                                                m2 m2Var = new m2();
                                                                m2Var.a = true;
                                                                o2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), m2Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            j0 j0Var2 = this.b.e;
                                                            j0Var2.n.presentFragment(qn.R9(j0Var2.W));
                                                            j0Var2.dismiss();
                                                            break;
                                                    }
                                                }
                                            }, false);
                                            i26 = ((f3) j0Var).backgroundPaddingLeft;
                                            float f14 = (i26 / AndroidUtilities.density) + 4.0f;
                                            i27 = ((f3) j0Var).backgroundPaddingLeft;
                                            addView(p0Var, e6.k(f14, 0.0f, (i27 / AndroidUtilities.density) + 4.0f, 18.0f, -1, 48));
                                            bh.e eVar = new bh.e(this, context);
                                            eVar.setGravity(17);
                                            int i56 = f6.z6;
                                            b6Var4 = ((f3) j0Var).resourcesProvider;
                                            eVar.setTextColor(f6.v0(i56, b6Var4));
                                            eVar.setText(" " + LocaleController.getString(R.string.InvitePremiumBlockedOr) + " ");
                                            eVar.setTextSize(14.0f);
                                            addView(eVar, e6.t(190, -2, 1, 12, 0, 12, 20));
                                            TextView textView3 = new TextView(context);
                                            textView3.setGravity(17);
                                            textView3.setTypeface(AndroidUtilities.bold());
                                            textView3.setTextSize(1, 20.0f);
                                            b6Var5 = ((f3) j0Var).resourcesProvider;
                                            textView3.setTextColor(f6.v0(i51, b6Var5));
                                            textView3.setText(LocaleController.getString(R.string.InviteBlockedTitle));
                                            addView(textView3, e6.t(-1, -2, 1, 32, 0, 32, 9));
                                            TextView textView4 = new TextView(context);
                                            textView4.setGravity(17);
                                            textView4.setTextSize(1, 14.0f);
                                            b6Var6 = ((f3) j0Var).resourcesProvider;
                                            textView4.setTextColor(f6.v0(i51, b6Var6));
                                            arrayList9 = j0Var.z0;
                                            if (arrayList9.size() <= 1) {
                                                textView4.setText(LocaleController.getString(R.string.InviteBlockedOneMessage));
                                            } else {
                                                textView4.setText(LocaleController.getString(R.string.InviteBlockedManyMessage));
                                            }
                                            addView(textView4, e6.t(-1, -2, 1, 32, 0, 32, 19));
                                        }
                                        j0Var.L1();
                                        return;
                                    }
                                }
                                z12 = false;
                                if (arrayList3.size() == 1) {
                                }
                                textView2.setText(AndroidUtilities.replaceTags(str2));
                                arrayList5 = j0Var.z0;
                                if (arrayList5 == null) {
                                }
                                arrayList7 = j0Var.y0;
                                if (arrayList7 == null) {
                                }
                                if (size - size2 > 0) {
                                }
                                ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                j0Var.f0 = true;
                                j0Var.L1();
                                return;
                            }
                        }
                        if (i38 != 31 && i38 != 34) {
                            b6Var14 = ((f3) j0Var).resourcesProvider;
                            h0 h0Var = new h0(this, context, i39, i14, i48, f13, b6Var14);
                            j0Var.t0 = h0Var;
                            if (z11) {
                                h0Var.setBagePosition(f10);
                                j0Var.t0.setType(i38);
                                j0Var.t0.w.setVisibility(8);
                                if (z10) {
                                    h0 h0Var2 = j0Var.t0;
                                    h0Var2.E.setVisibility(8);
                                    s sVar = h0Var2.e;
                                    if (sVar != null) {
                                        sVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                                    }
                                    h0Var2.F = true;
                                } else {
                                    i36 = ((f3) j0Var).currentAccount;
                                    if (UserConfig.getInstance(i36).isPremium() || j0Var.J0) {
                                        j0Var.t0.v.setVisibility(8);
                                        if (i38 == 6) {
                                            j0Var.t0.w.setText("2 GB");
                                        } else {
                                            j0Var.t0.w.setText(Integer.toString(i47));
                                        }
                                        z13 = false;
                                        j0Var.t0.w.setVisibility(0);
                                        if (i38 != 2 || i38 == 5) {
                                            j0Var.t0.D = z13;
                                        }
                                        addView(j0Var.t0, e6.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                                    }
                                }
                            } else {
                                tL_premium_boostsStatus2 = j0Var.X;
                                if (tL_premium_boostsStatus2 != null) {
                                    h0 h0Var3 = j0Var.t0;
                                    tL_premium_boostsStatus3 = j0Var.X;
                                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.Y;
                                    h0Var3.e(tL_premium_boostsStatus3, canApplyBoost != null && canApplyBoost.boostedNow);
                                }
                            }
                            z13 = false;
                            if (i38 != 2) {
                            }
                            j0Var.t0.D = z13;
                            addView(j0Var.t0, e6.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                        if (i38 != 31) {
                            FrameLayout frameLayout = new FrameLayout(context);
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(f0.e.d(getContext(), R.drawable.large_boosts));
                            i31 = 17;
                            frameLayout.addView(imageView, e6.e(-2, -2, 17));
                            frameLayout.setBackground(f6.K(AndroidUtilities.dp(79.0f), f6.u0(f6.Oh)));
                            addView(frameLayout, e6.t(79, 79, 1, 0, 23, 0, 0));
                        } else {
                            i31 = 17;
                        }
                        TextView textView5 = new TextView(context);
                        this.a = textView5;
                        textView5.setTypeface(AndroidUtilities.bold());
                        if (i38 != 31) {
                            this.a.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                        } else if (i38 == 32) {
                            this.a.setText(j0Var.r1());
                        } else {
                            i32 = 19;
                            if (i38 == 19) {
                                if (o2Var instanceof y50) {
                                    this.a.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                                } else {
                                    this.a.setText(j0Var.r1());
                                }
                            } else if (i38 == 30) {
                                this.a.setText(j0Var.r1());
                            } else if (i38 == 35) {
                                this.a.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                            } else if (i38 == 18) {
                                tL_premium_boostsStatus = j0Var.X;
                                if (tL_premium_boostsStatus.level == 0) {
                                    this.a.setText(LocaleController.getString(R.string.BoostingEnableStories));
                                } else {
                                    this.a.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                                }
                            } else if (i38 == 21) {
                                this.a.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                            } else if (i38 == 20) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableColor));
                            } else if (i38 == 24) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                            } else if (i38 == 27) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                            } else if (i38 == 28) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                            } else if (i38 == 25) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                            } else if (i38 == 26) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                            } else {
                                if (i38 != 29) {
                                    if (i38 == 22 || i38 == 23) {
                                        this.a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                    } else if (i38 == 11) {
                                        if (j0Var.U) {
                                            this.a.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                                        } else {
                                            this.a.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted));
                                        }
                                    } else if (i38 == 34) {
                                        this.a.setText(LocaleController.getString(R.string.CallInviteViaLinkTitle));
                                    } else if (i38 == 6) {
                                        this.a.setText(LocaleController.getString(R.string.FileTooLarge));
                                    } else if (i38 != 14 || j0Var.T <= 1) {
                                        this.a.setText(LocaleController.getString(R.string.LimitReached));
                                    } else {
                                        this.a.setText(LocaleController.getString(R.string.CreateMultipleStories));
                                    }
                                    this.a.setTextSize(1, 20.0f);
                                    TextView textView6 = this.a;
                                    int i57 = f6.G6;
                                    b6Var7 = ((f3) j0Var).resourcesProvider;
                                    textView6.setTextColor(f6.v0(i57, b6Var7));
                                    this.a.setGravity(i31);
                                    if (i38 != i32 || i38 == 32 || j0Var.y1()) {
                                        bg.c cVar = new bg.c(context);
                                        this.c = cVar;
                                        cVar.a(j0Var.Y.boostCount, false);
                                        if (i38 == 32) {
                                            cVar.setVisibility(8);
                                        }
                                        if (j0Var.a0) {
                                            addView(this.a, e6.t(-2, -2, 1, 0, z10 ? 8 : 22, 0, 0));
                                            LinearLayout linearLayout = new LinearLayout(getContext());
                                            linearLayout.setOrientation(0);
                                            linearLayout.setClipChildren(false);
                                            FrameLayout frameLayout2 = new FrameLayout(getContext());
                                            int dp2 = AndroidUtilities.dp(14.0f);
                                            int i58 = f6.a7;
                                            b6Var8 = ((f3) j0Var).resourcesProvider;
                                            frameLayout2.setBackground(f6.b0(dp2, f6.v0(i58, b6Var8)));
                                            o9 o9Var = new o9(getContext());
                                            o9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
                                            i33 = ((f3) j0Var).currentAccount;
                                            TLRPC.Chat chat = MessagesController.getInstance(i33).getChat(Long.valueOf(-j0Var.W));
                                            z8 z8Var = new z8();
                                            i34 = ((f3) j0Var).currentAccount;
                                            z8Var.k(i34, chat);
                                            o9Var.e(chat, z8Var);
                                            frameLayout2.addView(o9Var, e6.c(28.0f, 28));
                                            TextView textView7 = new TextView(getContext());
                                            if (chat != null) {
                                                textView7.setText(chat.title);
                                            }
                                            textView7.setSingleLine(true);
                                            textView7.setMaxLines(1);
                                            textView7.setEllipsize(TextUtils.TruncateAt.END);
                                            textView7.setTextSize(1, 13.0f);
                                            b6Var9 = ((f3) j0Var).resourcesProvider;
                                            textView7.setTextColor(f6.v0(i57, b6Var9));
                                            frameLayout2.addView(textView7, e6.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                            linearLayout.addView(frameLayout2, e6.t(-2, 28, 80, 18, 0, 18, 0));
                                            LayoutTransition layoutTransition = new LayoutTransition();
                                            layoutTransition.setDuration(100L);
                                            layoutTransition.enableTransitionType(4);
                                            linearLayout.setLayoutTransition(layoutTransition);
                                            linearLayout.addView(cVar, e6.t(-2, -2, 48, -30, 2, 18, 0));
                                            addView(linearLayout, e6.t(-2, 38, 17, 0, -4, 0, 12));
                                            g6.a(linearLayout);
                                            i35 = 1;
                                            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: zf.g0
                                                public final /* synthetic */ i0 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i35) {
                                                        case 0:
                                                            o2 o2Var2 = this.b.e.G0;
                                                            if (o2Var2 != null) {
                                                                m2 m2Var = new m2();
                                                                m2Var.a = true;
                                                                o2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), m2Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            j0 j0Var2 = this.b.e;
                                                            j0Var2.n.presentFragment(qn.R9(j0Var2.W));
                                                            j0Var2.dismiss();
                                                            break;
                                                    }
                                                }
                                            });
                                            TextView textView8 = new TextView(context);
                                            this.b = textView8;
                                            textView8.setText(AndroidUtilities.replaceTags(formatString));
                                            this.b.setTextSize(i35, 14.0f);
                                            this.b.setGravity(i35);
                                            TextView textView9 = this.b;
                                            textView9.setLineSpacing(textView9.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                            if (i38 != 18) {
                                                b6Var11 = ((f3) j0Var).resourcesProvider;
                                                if (b6Var11 instanceof ih.b) {
                                                    TextView textView10 = this.b;
                                                    int i59 = f6.y6;
                                                    b6Var13 = ((f3) j0Var).resourcesProvider;
                                                    textView10.setTextColor(f6.v0(i59, b6Var13));
                                                } else {
                                                    TextView textView11 = this.b;
                                                    b6Var12 = ((f3) j0Var).resourcesProvider;
                                                    textView11.setTextColor(f6.v0(i57, b6Var12));
                                                }
                                            } else {
                                                TextView textView12 = this.b;
                                                b6Var10 = ((f3) j0Var).resourcesProvider;
                                                textView12.setTextColor(f6.v0(i57, b6Var10));
                                            }
                                            if (i38 != i32) {
                                                addView(this.b, e6.t(-2, -2, 1, 24, -2, 24, 17));
                                            } else {
                                                addView(this.b, e6.t(-2, -2, 1, 24, 0, 24, 24));
                                            }
                                            if (i38 == 31) {
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
                                        this.d.addView(this.a, e6.o(-2, -2, 1.0f, 0));
                                        this.d.addView(cVar, e6.t(-2, -2, 48, 0, 2, 0, 0));
                                        addView(this.d, e6.t(-2, -2, 1, 12, z10 ? 8 : 22, 12, 9));
                                    } else {
                                        addView(this.a, e6.t(-2, -2, 1, 0, z10 ? 8 : 22, 0, 10));
                                    }
                                    i35 = 1;
                                    TextView textView82 = new TextView(context);
                                    this.b = textView82;
                                    textView82.setText(AndroidUtilities.replaceTags(formatString));
                                    this.b.setTextSize(i35, 14.0f);
                                    this.b.setGravity(i35);
                                    TextView textView92 = this.b;
                                    textView92.setLineSpacing(textView92.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                    if (i38 != 18) {
                                    }
                                    if (i38 != i32) {
                                    }
                                    if (i38 == 31) {
                                    }
                                    j0Var.L1();
                                    return;
                                }
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                            }
                            this.a.setTextSize(1, 20.0f);
                            TextView textView62 = this.a;
                            int i572 = f6.G6;
                            b6Var7 = ((f3) j0Var).resourcesProvider;
                            textView62.setTextColor(f6.v0(i572, b6Var7));
                            this.a.setGravity(i31);
                            if (i38 != i32) {
                            }
                            bg.c cVar2 = new bg.c(context);
                            this.c = cVar2;
                            cVar2.a(j0Var.Y.boostCount, false);
                            if (i38 == 32) {
                            }
                            if (j0Var.a0) {
                            }
                        }
                        i32 = 19;
                        this.a.setTextSize(1, 20.0f);
                        TextView textView622 = this.a;
                        int i5722 = f6.G6;
                        b6Var7 = ((f3) j0Var).resourcesProvider;
                        textView622.setTextColor(f6.v0(i5722, b6Var7));
                        this.a.setGravity(i31);
                        if (i38 != i32) {
                        }
                        bg.c cVar22 = new bg.c(context);
                        this.c = cVar22;
                        cVar22.a(j0Var.Y.boostCount, false);
                        if (i38 == 32) {
                        }
                        if (j0Var.a0) {
                        }
                    }
                }
                z11 = true;
                if (z11) {
                }
                if (i38 != 11) {
                }
                i17 = ((f3) j0Var).currentAccount;
                if (!MessagesController.getInstance(i17).premiumFeaturesBlocked()) {
                    if (!j0Var.z0.isEmpty()) {
                    }
                    c9 c9Var2 = new c9(context, false);
                    c9Var2.a.q = AndroidUtilities.dp(3.33f);
                    c9Var2.setSize(AndroidUtilities.dp(72.0f));
                    c9Var2.setStepFactor(0.4f);
                    min = Math.min(arrayList3.size(), 3);
                    c9Var2.setCount(min);
                    while (i18 < min) {
                    }
                    c9Var2.a(false);
                    addView(c9Var2, e6.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                    TextView textView13 = new TextView(context);
                    textView13.setGravity(17);
                    ll.k(20.0f, 1, textView13);
                    int i512 = f6.j5;
                    b6Var = ((f3) j0Var).resourcesProvider;
                    textView13.setTextColor(f6.v0(i512, b6Var));
                    textView13.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                    addView(textView13, e6.t(-1, -2, 1, 32, 0, 32, 9));
                    TextView textView22 = new TextView(context);
                    textView22.setGravity(17);
                    textView22.setTextSize(1, 14.0f);
                    b6Var2 = ((f3) j0Var).resourcesProvider;
                    textView22.setTextColor(f6.v0(i512, b6Var2));
                    addView(textView22, e6.t(-1, -2, 1, 32, 0, 32, 19));
                    if (i38 != 34) {
                    }
                    arrayList4 = j0Var.y0;
                    if (arrayList4 != null) {
                    }
                    z12 = false;
                    if (arrayList3.size() == 1) {
                    }
                    textView22.setText(AndroidUtilities.replaceTags(str2));
                    arrayList5 = j0Var.z0;
                    if (arrayList5 == null) {
                    }
                    arrayList7 = j0Var.y0;
                    if (arrayList7 == null) {
                    }
                    if (size - size2 > 0) {
                    }
                    ((ViewGroup.MarginLayoutParams) textView22.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    j0Var.f0 = true;
                    j0Var.L1();
                    return;
                }
                if (i38 != 31) {
                    b6Var14 = ((f3) j0Var).resourcesProvider;
                    h0 h0Var4 = new h0(this, context, i39, i14, i48, f13, b6Var14);
                    j0Var.t0 = h0Var4;
                    if (z11) {
                    }
                    z13 = false;
                    if (i38 != 2) {
                    }
                    j0Var.t0.D = z13;
                    addView(j0Var.t0, e6.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                }
                if (i38 != 31) {
                }
                TextView textView52 = new TextView(context);
                this.a = textView52;
                textView52.setTypeface(AndroidUtilities.bold());
                if (i38 != 31) {
                }
                i32 = 19;
                this.a.setTextSize(1, 20.0f);
                TextView textView6222 = this.a;
                int i57222 = f6.G6;
                b6Var7 = ((f3) j0Var).resourcesProvider;
                textView6222.setTextColor(f6.v0(i57222, b6Var7));
                this.a.setGravity(i31);
                if (i38 != i32) {
                }
                bg.c cVar222 = new bg.c(context);
                this.c = cVar222;
                cVar222.a(j0Var.Y.boostCount, false);
                if (i38 == 32) {
                }
                if (j0Var.a0) {
                }
            }
            i16 = ((f3) j0Var).currentAccount;
            if (UserConfig.getInstance(i16).isPremium()) {
            }
            i14 = i48;
            f10 = 1.0f;
            float f132 = i47 / i48;
            if (i38 == 18) {
            }
            z11 = true;
            if (z11) {
            }
            if (i38 != 11) {
            }
            i17 = ((f3) j0Var).currentAccount;
            if (!MessagesController.getInstance(i17).premiumFeaturesBlocked()) {
            }
            if (i38 != 31) {
            }
            if (i38 != 31) {
            }
            TextView textView522 = new TextView(context);
            this.a = textView522;
            textView522.setTypeface(AndroidUtilities.bold());
            if (i38 != 31) {
            }
            i32 = 19;
            this.a.setTextSize(1, 20.0f);
            TextView textView62222 = this.a;
            int i572222 = f6.G6;
            b6Var7 = ((f3) j0Var).resourcesProvider;
            textView62222.setTextColor(f6.v0(i572222, b6Var7));
            this.a.setGravity(i31);
            if (i38 != i32) {
            }
            bg.c cVar2222 = new bg.c(context);
            this.c = cVar2222;
            cVar2222.a(j0Var.Y.boostCount, false);
            if (i38 == 32) {
            }
            if (j0Var.a0) {
            }
        } else if (i38 == 34) {
            str = j0Var.x0.size() == 1 ? LocaleController.formatString(R.string.InviteCallRestrictedUsersOne, ContactsController.formatName((TLRPC.User) j0Var.x0.get(0))) : LocaleController.formatPluralString("InviteCallRestrictedUsers", j0Var.x0.size(), Integer.valueOf(j0Var.x0.size()));
        } else if (premiumFeaturesBlocked) {
            str = (String) j0Var.I0.f;
        } else {
            i13 = ((f3) j0Var).currentAccount;
            str = (String) ((UserConfig.getInstance(i13).isPremium() || j0Var.J0) ? j0Var.I0.e : j0Var.I0.d);
        }
        formatString = str;
        z10 = premiumFeaturesBlocked;
        androidx.emoji2.text.o oVar2 = j0Var.I0;
        int i472 = oVar2.b;
        int i482 = oVar2.c;
        i14 = j0Var.s0;
        if (i38 != 3) {
        }
        i16 = ((f3) j0Var).currentAccount;
        if (UserConfig.getInstance(i16).isPremium()) {
        }
        i14 = i482;
        f10 = 1.0f;
        float f1322 = i472 / i482;
        if (i38 == 18) {
        }
        z11 = true;
        if (z11) {
        }
        if (i38 != 11) {
        }
        i17 = ((f3) j0Var).currentAccount;
        if (!MessagesController.getInstance(i17).premiumFeaturesBlocked()) {
        }
        if (i38 != 31) {
        }
        if (i38 != 31) {
        }
        TextView textView5222 = new TextView(context);
        this.a = textView5222;
        textView5222.setTypeface(AndroidUtilities.bold());
        if (i38 != 31) {
        }
        i32 = 19;
        this.a.setTextSize(1, 20.0f);
        TextView textView622222 = this.a;
        int i5722222 = f6.G6;
        b6Var7 = ((f3) j0Var).resourcesProvider;
        textView622222.setTextColor(f6.v0(i5722222, b6Var7));
        this.a.setGravity(i31);
        if (i38 != i32) {
        }
        bg.c cVar22222 = new bg.c(context);
        this.c = cVar22222;
        cVar22222.a(j0Var.Y.boostCount, false);
        if (i38 == 32) {
        }
        if (j0Var.a0) {
        }
    }
}
