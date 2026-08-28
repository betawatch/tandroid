package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.time.LocalDate;
import j$.time.Period;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vz0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public vz0(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // f2.r0
    public final void A(f2.q1 q1Var) {
        int b10 = q1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.K2) {
            profileActivity.I2 = null;
        }
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.b3 != -1) {
            int b10 = q1Var.b();
            if (b10 != profileActivity.b3 && b10 != profileActivity.P2 && b10 != profileActivity.d3 && b10 != profileActivity.c3 && b10 != profileActivity.R2 && b10 != profileActivity.S2 && b10 != profileActivity.v3 && b10 != profileActivity.e3 && b10 != profileActivity.f3 && b10 != profileActivity.m3 && b10 != profileActivity.j3 && b10 != profileActivity.g3 && b10 != profileActivity.i3 && b10 != profileActivity.n3 && b10 != profileActivity.o3 && b10 != profileActivity.r3 && b10 != profileActivity.s3 && b10 != profileActivity.t3 && b10 != profileActivity.u3 && b10 != profileActivity.K2 && b10 != profileActivity.W3 && b10 != profileActivity.Y3 && b10 != profileActivity.c4 && b10 != profileActivity.b4 && b10 != profileActivity.h3 && b10 != profileActivity.Q2 && b10 != profileActivity.M2 && b10 != profileActivity.Z3 && b10 != profileActivity.a4 && b10 != profileActivity.h4) {
                return false;
            }
        } else {
            View view = q1Var.a;
            if (view instanceof org.telegram.ui.Cells.va) {
                Object currentObject = ((org.telegram.ui.Cells.va) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i9 = q1Var.f;
            if (i9 == 1 || i9 == 5 || i9 == 7 || i9 == 11 || i9 == 31 || i9 == 28 || i9 == 12 || i9 == 13 || i9 == 9 || i9 == 10 || i9 == 25 || i9 == 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence E(String str, ArrayList arrayList, String str2) {
        String str3 = str2;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i9 = 0;
            while (i9 < arrayList2.size()) {
                if (!((TLRPC.TL_username) arrayList2.get(i9)).active || (str != null && str.equals(((TLRPC.TL_username) arrayList2.get(i9)).username))) {
                    arrayList2.remove(i9);
                    i9--;
                }
                i9++;
            }
            str3 = str2;
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i10);
                    SpannableString spannableString = new SpannableString(ta.b.d("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        oz0 oz0Var = new oz0(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, oz0Var);
                        clickableSpan = oz0Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.gc, this.e.v0)), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i10 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String string = LocaleController.getString(R.string.UsernameAlso);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
                int indexOf = string.indexOf("%1$s");
                str3 = spannableStringBuilder2;
                if (indexOf >= 0) {
                    spannableStringBuilder2.replace(indexOf, indexOf + 4, (CharSequence) spannableStringBuilder);
                    str3 = spannableStringBuilder2;
                }
            }
        }
        return str3;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.J2;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        ProfileActivity profileActivity = this.e;
        if (i9 == profileActivity.z3 || i9 == profileActivity.p4 || i9 == profileActivity.a3 || i9 == profileActivity.O2 || i9 == profileActivity.l3 || i9 == profileActivity.q3 || i9 == profileActivity.j4) {
            return 1;
        }
        if (i9 == profileActivity.C3 || i9 == profileActivity.E3 || i9 == profileActivity.P2 || i9 == profileActivity.Q2) {
            return 2;
        }
        if (i9 == profileActivity.H3 || i9 == profileActivity.R2) {
            return 19;
        }
        if (i9 == profileActivity.D3) {
            return 30;
        }
        if (i9 == profileActivity.F3 || i9 == profileActivity.G3 || i9 == profileActivity.S2) {
            return 3;
        }
        if (i9 == profileActivity.m4 || i9 == profileActivity.n4 || i9 == profileActivity.R3 || i9 == profileActivity.T3 || i9 == profileActivity.S3 || i9 == profileActivity.t4 || i9 == profileActivity.u4 || i9 == profileActivity.v4 || i9 == profileActivity.w4 || i9 == profileActivity.C4 || i9 == profileActivity.s4 || i9 == profileActivity.H4 || i9 == profileActivity.G4 || i9 == profileActivity.Q3 || i9 == profileActivity.b3 || i9 == profileActivity.d3 || i9 == profileActivity.c3 || i9 == profileActivity.e3 || i9 == profileActivity.f3 || i9 == profileActivity.m3 || i9 == profileActivity.j3 || i9 == profileActivity.g3 || i9 == profileActivity.i3 || i9 == profileActivity.n3 || i9 == profileActivity.o3 || i9 == profileActivity.r3 || i9 == profileActivity.s3 || i9 == profileActivity.t3 || i9 == profileActivity.u3 || i9 == profileActivity.K2 || i9 == profileActivity.W3 || i9 == profileActivity.V3 || i9 == profileActivity.h3 || i9 == profileActivity.c4 || i9 == profileActivity.b4 || i9 == profileActivity.x4 || i9 == profileActivity.y4 || i9 == profileActivity.z4) {
            return 4;
        }
        i10 = profileActivity.botPermissionLocation;
        if (i9 == i10) {
            return 4;
        }
        i11 = profileActivity.botPermissionBiometry;
        if (i9 == i11) {
            return 4;
        }
        i12 = profileActivity.botPermissionEmojiStatus;
        if (i9 == i12 || i9 == profileActivity.a4) {
            return 4;
        }
        if (i9 == profileActivity.I3) {
            return 5;
        }
        if (i9 == profileActivity.J3) {
            return 6;
        }
        if (i9 == profileActivity.M3) {
            return 20;
        }
        if (i9 == profileActivity.I4 || i9 == profileActivity.D4 || i9 == profileActivity.i4 || i9 == profileActivity.o4 || i9 == profileActivity.Z2 || i9 == profileActivity.k3 || i9 == profileActivity.p3 || i9 == profileActivity.L2 || i9 == profileActivity.X2 || i9 == profileActivity.T2 || i9 == profileActivity.d4 || i9 == profileActivity.U3 || i9 == profileActivity.N2 || i9 == profileActivity.V2 || i9 == profileActivity.B4 || i9 == profileActivity.l4 || i9 == profileActivity.A4 || i9 == profileActivity.g4) {
            return 7;
        }
        if (i9 >= profileActivity.q4 && i9 < profileActivity.r4) {
            return 8;
        }
        if (i9 == profileActivity.w3) {
            return 11;
        }
        if (i9 == profileActivity.x3) {
            return 31;
        }
        if (i9 == profileActivity.y3) {
            return 12;
        }
        if (i9 == profileActivity.F4) {
            return 13;
        }
        if (i9 == profileActivity.v3) {
            return 14;
        }
        if (i9 == profileActivity.Y2 || i9 == profileActivity.W2 || i9 == profileActivity.U2) {
            return 15;
        }
        if (i9 == profileActivity.X3) {
            return 17;
        }
        if (i9 == profileActivity.Y3) {
            return 18;
        }
        if (i9 == profileActivity.Z3) {
            return 24;
        }
        if (i9 == profileActivity.L3) {
            return 21;
        }
        if (i9 == profileActivity.K3) {
            return 22;
        }
        if (i9 == profileActivity.M2) {
            return 23;
        }
        if (i9 == profileActivity.e4) {
            return 25;
        }
        if (i9 == profileActivity.N3 || i9 == profileActivity.P3) {
            return 26;
        }
        if (i9 == profileActivity.f4) {
            return 32;
        }
        if (i9 == profileActivity.h4) {
            return 33;
        }
        if (i9 == profileActivity.O3) {
            return 27;
        }
        return (i9 == profileActivity.A3 || i9 == profileActivity.B3) ? 28 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:566:0x0e35, code lost:
    
        if (r0.about != null) goto L574;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0dde  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x1308  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x1348  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        String string;
        CharSequence charSequence;
        String str;
        int i24;
        String str2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        long j10;
        TLRPC.Chat chat3;
        String str3;
        String str4;
        boolean z10;
        String str5;
        long j11;
        long j12;
        long j13;
        String str6;
        boolean z11;
        long j14;
        long j15;
        long j16;
        int i25;
        long j17;
        TLRPC.TL_username tL_username;
        String str7;
        String str8;
        long j18;
        int i26;
        CharSequence formatTextWithEntities;
        long j19;
        String string2;
        String str9;
        boolean z12;
        TLRPC.UserFull userFull;
        long j20;
        int i27;
        String formatString;
        int i28;
        int i29;
        TLRPC.UserFull userFull2;
        TLRPC.UserFull userFull3;
        TLRPC.UserFull userFull4;
        String str10;
        TLRPC.UserFull userFull5;
        String str11;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        TLRPC.ChatFull chatFull4;
        TLRPC.Chat chat4;
        boolean z13;
        TLRPC.Chat chat5;
        TLRPC.UserFull userFull8;
        TLRPC.UserFull userFull9;
        TLRPC.User user;
        boolean z14;
        boolean z15;
        TLRPC.UserFull userFull10;
        TLRPC.UserFull userFull11;
        TLRPC.UserFull userFull12;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i70;
        org.telegram.ui.Cells.p8 p8Var;
        int i71;
        int i72;
        TLRPC.UserFull userFull13;
        boolean z16;
        int i73;
        boolean z17;
        int i74;
        TLRPC.UserFull userFull14;
        int i75;
        int i76;
        int i77;
        long j21;
        int i78;
        TLRPC.ChatFull chatFull5;
        int i79;
        TLRPC.ChatFull chatFull6;
        TLRPC.ChatFull chatFull7;
        int i80;
        int i81;
        long j22;
        int i82;
        long j23;
        int i83;
        long j24;
        int i84;
        long j25;
        int i85;
        TLRPC.ChatFull chatFull8;
        int i86;
        TLRPC.ChatFull chatFull9;
        int i87;
        TLRPC.ChatFull chatFull10;
        TLRPC.ChatFull chatFull11;
        int i88;
        TLRPC.ChatFull chatFull12;
        TLRPC.Chat chat6;
        int i89;
        TLRPC.Chat chat7;
        int i90;
        TLRPC.Chat chat8;
        TLRPC.ChatFull chatFull13;
        int i91;
        TLRPC.Chat chat9;
        TLRPC.ChatFull chatFull14;
        int i92;
        TLRPC.Chat chat10;
        int i93;
        int i94;
        long j26;
        boolean z18;
        boolean z19;
        NotificationsController notificationsController;
        boolean z20;
        long j27;
        long j28;
        String str12;
        final boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        long j29;
        boolean z25;
        boolean z26;
        boolean z27;
        int i95;
        int i96;
        int i97;
        long j30;
        TLRPC.UserFull userFull15;
        TLRPC.UserFull userFull16;
        TLRPC.UserFull userFull17;
        boolean z28;
        boolean z29;
        TLRPC.UserFull userFull18;
        TLRPC.UserFull userFull19;
        int i98;
        int i99;
        long j31;
        TLRPC.UserFull userFull20;
        int i100;
        TLRPC.UserFull userFull21;
        TLRPC.UserFull userFull22;
        TLRPC.UserFull userFull23;
        int i101;
        TLRPC.UserFull userFull24;
        TLRPC.UserFull userFull25;
        TLRPC.UserFull userFull26;
        TLRPC.ChatFull chatFull15;
        TL_bots.botVerification botverification;
        TLRPC.ChatFull chatFull16;
        TLRPC.UserFull userFull27;
        Long l10;
        long j32;
        TLRPC.User user2;
        TLRPC.UserFull userFull28;
        TLRPC.UserFull userFull29;
        TLRPC.UserFull userFull30;
        TLRPC.UserFull userFull31;
        TLRPC.UserFull userFull32;
        TLRPC.UserFull userFull33;
        int i102;
        org.telegram.ui.ActionBar.b6 b6Var;
        long j33;
        TLRPC.Chat chat11;
        long j34;
        long j35;
        int i103;
        int i104;
        TLRPC.Chat chat12;
        ProfileActivity profileActivity = this.e;
        ArrayList arrayList = profileActivity.M4;
        ArrayList arrayList2 = profileActivity.N4;
        HashSet hashSet = profileActivity.d5;
        int i105 = q1Var.f;
        View view = q1Var.a;
        String str13 = "";
        String str14 = null;
        r10 = null;
        String str15 = null;
        TL_account.TL_businessWorkHours tL_businessWorkHours = null;
        TLRPC.TL_businessLocation tL_businessLocation = null;
        TLRPC.ChatParticipant chatParticipant = null;
        r12 = true;
        boolean z30 = true;
        int i106 = 0;
        switch (i105) {
            case 1:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                i10 = profileActivity.z3;
                if (i9 == i10) {
                    chat = profileActivity.A2;
                    if (ChatObject.isChannel(chat)) {
                        chat2 = profileActivity.A2;
                        if (!chat2.megagroup && profileActivity.G3 != -1) {
                            m4Var.setText(LocaleController.getString(R.string.ReportChatDescription));
                        }
                    }
                    m4Var.setText(LocaleController.getString(R.string.Info));
                } else {
                    i11 = profileActivity.p4;
                    if (i9 == i11) {
                        m4Var.setText(LocaleController.getString(R.string.ChannelMembers));
                    } else {
                        i12 = profileActivity.a3;
                        if (i9 == i12) {
                            m4Var.setText(LocaleController.getString(R.string.SETTINGS));
                        } else {
                            i13 = profileActivity.O2;
                            if (i9 == i13) {
                                m4Var.setText(LocaleController.getString(R.string.Account));
                            } else {
                                i14 = profileActivity.l3;
                                if (i9 == i14) {
                                    m4Var.setText(LocaleController.getString(R.string.SettingsHelp));
                                } else {
                                    i15 = profileActivity.q3;
                                    if (i9 == i15) {
                                        m4Var.setText(LocaleController.getString(R.string.SettingsDebug));
                                    } else {
                                        i16 = profileActivity.j4;
                                        if (i9 == i16) {
                                            m4Var.setText(LocaleController.getString(R.string.BotProfilePermissions));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                m4Var.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.L6));
                break;
            case 2:
            case 19:
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i9 == profileActivity.Q2) {
                    MessagesController messagesController = profileActivity.getMessagesController();
                    j20 = profileActivity.a1;
                    TLRPC.UserFull userFull34 = messagesController.getUserFull(j20);
                    if (userFull34 != null && userFull34.birthday != null) {
                        boolean isToday = BirthdayController.isToday(userFull34);
                        TL_account.TL_birthday tL_birthday = userFull34.birthday;
                        boolean z31 = (tL_birthday.flags & 1) != 0;
                        int years = z31 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String Y = UserInfoActivity.Y(userFull34.birthday);
                        if (z31) {
                            formatString = LocaleController.formatPluralString(isToday ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", years, Y);
                        } else {
                            formatString = LocaleController.formatString(isToday ? R.string.ProfileBirthdayTodayValue : R.string.ProfileBirthdayValue, Y);
                        }
                        z8Var.c(Emoji.replaceWithRestrictedEmoji(formatString, z8Var.a, new jh0(this, q1Var, i9, 7)), LocaleController.getString(isToday ? R.string.ProfileBirthdayToday : R.string.ProfileBirthday), (!profileActivity.m1 && profileActivity.K3 == -1 && profileActivity.L3 == -1) ? false : true);
                        if (!profileActivity.o1 && isToday && !profileActivity.getMessagesController().premiumPurchaseBlocked()) {
                            i27 = 1;
                            i106 = i27;
                        }
                    }
                    i27 = 0;
                    i106 = i27;
                } else {
                    i17 = profileActivity.C3;
                    if (i9 == i17) {
                        MessagesController messagesController2 = profileActivity.getMessagesController();
                        j19 = profileActivity.a1;
                        TLRPC.User user3 = messagesController2.getUser(Long.valueOf(j19));
                        if (user3 != null && !TextUtils.isEmpty(profileActivity.Z4)) {
                            string2 = org.telegram.messenger.ll.g(new StringBuilder("+"), profileActivity.Z4, ne.b.c());
                            str9 = profileActivity.Z4;
                        } else if (user3 == null || TextUtils.isEmpty(user3.phone)) {
                            string2 = LocaleController.getString(R.string.PhoneHidden);
                            str9 = null;
                        } else {
                            String g10 = org.telegram.messenger.ll.g(new StringBuilder("+"), user3.phone, ne.b.c());
                            str9 = user3.phone;
                            string2 = g10;
                        }
                        profileActivity.X4 = str9 != null && str9.matches("888\\d{8}");
                        z12 = profileActivity.X4;
                        z8Var.c(string2, LocaleController.getString(z12 ? R.string.AnonymousNumber : R.string.PhoneMobile), false);
                    } else {
                        i18 = profileActivity.D3;
                        if (i9 == i18) {
                            MessagesController messagesController3 = profileActivity.getMessagesController();
                            j18 = profileActivity.a1;
                            TLRPC.UserFull userFull35 = messagesController3.getUserFull(j18);
                            if (userFull35 != null) {
                                TLRPC.TL_textWithEntities tL_textWithEntities = userFull35.note;
                                i26 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                                if (UserConfig.getInstance(i26).isPremium()) {
                                    formatTextWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities);
                                    if (!(formatTextWithEntities instanceof SpannableStringBuilder)) {
                                        formatTextWithEntities = new SpannableStringBuilder(formatTextWithEntities);
                                    }
                                    AndroidUtilities.addLinksSafe((SpannableStringBuilder) formatTextWithEntities, 1, false, false);
                                } else {
                                    formatTextWithEntities = MessageObject.formatTextWithEntities(MessageObject.removeLinks(tL_textWithEntities));
                                }
                                z8Var.d(formatTextWithEntities, LocaleController.getString(R.string.ProfileNotes), LocaleController.getString(R.string.ProfileNotesInfo));
                            }
                        } else {
                            i19 = profileActivity.H3;
                            if (i9 == i19) {
                                ArrayList arrayList3 = new ArrayList();
                                j10 = profileActivity.a1;
                                if (j10 != 0) {
                                    MessagesController messagesController4 = profileActivity.getMessagesController();
                                    j17 = profileActivity.a1;
                                    TLRPC.User user4 = messagesController4.getUser(Long.valueOf(j17));
                                    if (user4 != null) {
                                        arrayList3.addAll(user4.usernames);
                                    }
                                    if (user4 == null || TextUtils.isEmpty(user4.username)) {
                                        tL_username = null;
                                        str7 = null;
                                    } else {
                                        tL_username = DialogObject.findUsername(user4.username, (ArrayList<TLRPC.TL_username>) arrayList3);
                                        str7 = user4.username;
                                    }
                                    ArrayList arrayList4 = user4 == null ? new ArrayList() : new ArrayList(user4.usernames);
                                    if (TextUtils.isEmpty(str7)) {
                                        int i107 = 0;
                                        while (true) {
                                            if (i107 < arrayList4.size()) {
                                                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList4.get(i107);
                                                if (tL_username2 == null || !tL_username2.active || TextUtils.isEmpty(tL_username2.username)) {
                                                    i107++;
                                                } else {
                                                    str7 = tL_username2.username;
                                                    tL_username = tL_username2;
                                                }
                                            }
                                        }
                                    }
                                    String string3 = LocaleController.getString(R.string.Username);
                                    if (str7 != null) {
                                        String concat = "@".concat(str7);
                                        if (tL_username == null || tL_username.editable) {
                                            str8 = concat;
                                        } else {
                                            SpannableString spannableString = new SpannableString(concat);
                                            HashMap hashMap = this.d;
                                            ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                                            if (clickableSpan == null) {
                                                oz0 oz0Var = new oz0(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, oz0Var);
                                                clickableSpan = oz0Var;
                                            }
                                            spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                                            str8 = spannableString;
                                        }
                                    } else {
                                        str8 = "—";
                                    }
                                    z10 = !profileActivity.o1;
                                    ArrayList arrayList5 = arrayList4;
                                    str3 = str8;
                                    arrayList3 = arrayList5;
                                    str5 = str7;
                                    str4 = string3;
                                } else {
                                    chat3 = profileActivity.A2;
                                    if (chat3 != null) {
                                        MessagesController messagesController5 = profileActivity.getMessagesController();
                                        j11 = profileActivity.b1;
                                        TLRPC.Chat chat13 = messagesController5.getChat(Long.valueOf(j11));
                                        String publicUsername = ChatObject.getPublicUsername(chat13);
                                        if (chat13 != null) {
                                            arrayList3.addAll(chat13.usernames);
                                        }
                                        if (ChatObject.isPublic(chat13)) {
                                            z11 = !profileActivity.o1;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(profileActivity.getMessagesController().linkPrefix);
                                            sb2.append("/");
                                            sb2.append(publicUsername);
                                            j15 = profileActivity.c1;
                                            String str16 = str13;
                                            if (j15 != 0) {
                                                StringBuilder sb3 = new StringBuilder("/");
                                                j16 = profileActivity.c1;
                                                sb3.append(j16);
                                                str16 = sb3.toString();
                                            }
                                            sb2.append(str16);
                                            str6 = sb2.toString();
                                            str4 = LocaleController.getString(R.string.InviteLink);
                                        } else {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(profileActivity.getMessagesController().linkPrefix);
                                            sb4.append("/c/");
                                            j12 = profileActivity.b1;
                                            sb4.append(j12);
                                            j13 = profileActivity.c1;
                                            String str17 = str13;
                                            if (j13 != 0) {
                                                StringBuilder sb5 = new StringBuilder("/");
                                                j14 = profileActivity.c1;
                                                sb5.append(j14);
                                                str17 = sb5.toString();
                                            }
                                            sb4.append(str17);
                                            String sb6 = sb4.toString();
                                            str4 = LocaleController.getString(R.string.InviteLinkPrivate);
                                            str6 = sb6;
                                            z11 = false;
                                        }
                                        str5 = publicUsername;
                                        z10 = z11;
                                        str3 = str6;
                                    } else {
                                        arrayList3 = new ArrayList();
                                        str3 = "";
                                        str4 = str3;
                                        z10 = false;
                                        str5 = null;
                                    }
                                }
                                CharSequence E = E(str5, arrayList3, str4);
                                i25 = profileActivity.B3;
                                z8Var.c(str3, E, i25 == -1 && !(!profileActivity.m1 && profileActivity.K3 == -1 && profileActivity.L3 == -1) && profileActivity.Q2 < 0);
                                if (i106 == 0) {
                                    Drawable d = f0.e.d(z8Var.getContext(), R.drawable.msg_input_gift);
                                    d.setColorFilter(new PorterDuffColorFilter(profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.V6), PorterDuff.Mode.MULTIPLY));
                                    userFull = profileActivity.r2;
                                    if (UserObject.areGiftsDisabled(userFull)) {
                                        z8Var.setImage(null);
                                        z8Var.setImageClickListener(null);
                                    } else {
                                        z8Var.b(d, LocaleController.getString(R.string.GiftPremium));
                                        z8Var.setImageClickListener(new ex0(profileActivity, 11));
                                    }
                                } else if (z10) {
                                    Drawable d9 = f0.e.d(z8Var.getContext(), R.drawable.header_qr_24);
                                    d9.setColorFilter(new PorterDuffColorFilter(profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.v8), PorterDuff.Mode.MULTIPLY));
                                    z8Var.b(d9, LocaleController.getString(R.string.GetQRCode));
                                    z8Var.setImageClickListener(new ex0(profileActivity, 12));
                                } else {
                                    z8Var.setImage(null);
                                    z8Var.setImageClickListener(null);
                                }
                                z8Var.setTag(Integer.valueOf(i9));
                                z8Var.a.setLoading(profileActivity.e5);
                                z8Var.b.setLoading(profileActivity.e5);
                                break;
                            } else {
                                i20 = profileActivity.E3;
                                if (i9 == i20) {
                                    chatFull = profileActivity.q2;
                                    if (chatFull != null) {
                                        chatFull2 = profileActivity.q2;
                                        if (chatFull2.location instanceof TLRPC.TL_channelLocation) {
                                            chatFull3 = profileActivity.q2;
                                            z8Var.c(((TLRPC.TL_channelLocation) chatFull3.location).address, LocaleController.getString(R.string.AttachLocation), false);
                                        }
                                    }
                                } else {
                                    i21 = profileActivity.P2;
                                    if (i9 == i21) {
                                        i24 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                                        TLRPC.User currentUser = UserConfig.getInstance(i24).getCurrentUser();
                                        z8Var.c((currentUser == null || (str2 = currentUser.phone) == null || str2.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.ll.g(new StringBuilder("+"), currentUser.phone, ne.b.c()), LocaleController.getString(R.string.TapToChangePhone), true);
                                        z8Var.setContentDescriptionValueFirst(false);
                                    } else {
                                        i22 = profileActivity.R2;
                                        if (i9 == i22) {
                                            i23 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                                            TLRPC.User currentUser2 = UserConfig.getInstance(i23).getCurrentUser();
                                            String string4 = LocaleController.getString(R.string.Username);
                                            if (currentUser2 == null || currentUser2.usernames.size() <= 0) {
                                                String publicUsername2 = UserObject.getPublicUsername(currentUser2);
                                                if (currentUser2 == null || TextUtils.isEmpty(publicUsername2)) {
                                                    string = LocaleController.getString(R.string.UsernameEmpty);
                                                    charSequence = string4;
                                                } else {
                                                    string = ta.b.d("@", publicUsername2);
                                                    charSequence = string4;
                                                }
                                            } else {
                                                int i108 = 0;
                                                while (true) {
                                                    if (i108 < currentUser2.usernames.size()) {
                                                        TLRPC.TL_username tL_username3 = currentUser2.usernames.get(i108);
                                                        if (tL_username3 == null || !tL_username3.active || TextUtils.isEmpty(tL_username3.username)) {
                                                            i108++;
                                                        } else {
                                                            str = tL_username3.username;
                                                        }
                                                    } else {
                                                        str = null;
                                                    }
                                                }
                                                if (str == null) {
                                                    str = currentUser2.username;
                                                }
                                                string = (str == null || TextUtils.isEmpty(str)) ? LocaleController.getString(R.string.UsernameEmpty) : "@".concat(str);
                                                charSequence = E(str, currentUser2.usernames, string4);
                                            }
                                            z8Var.c(string, charSequence, true);
                                            z8Var.setContentDescriptionValueFirst(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z10 = false;
                if (i106 == 0) {
                }
                z8Var.setTag(Integer.valueOf(i9));
                z8Var.a.setLoading(profileActivity.e5);
                z8Var.b.setLoading(profileActivity.e5);
                break;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view;
                i28 = profileActivity.F3;
                if (i9 == i28) {
                    userFull8 = profileActivity.r2;
                    if (userFull8.user != null) {
                        userFull12 = profileActivity.r2;
                        user = userFull12.user;
                    } else {
                        MessagesController messagesController6 = profileActivity.getMessagesController();
                        userFull9 = profileActivity.r2;
                        user = messagesController6.getUser(Long.valueOf(userFull9.id));
                    }
                    z14 = profileActivity.n2;
                    if (!z14) {
                        if (user != null && user.premium) {
                            userFull11 = profileActivity.r2;
                            break;
                        }
                        z15 = false;
                        userFull10 = profileActivity.r2;
                        jVar.f(userFull10.about, LocaleController.getString(R.string.UserBio), z15);
                        break;
                    }
                    z15 = true;
                    userFull10 = profileActivity.r2;
                    jVar.f(userFull10.about, LocaleController.getString(R.string.UserBio), z15);
                } else if (i9 == profileActivity.G3) {
                    chatFull4 = profileActivity.q2;
                    String str18 = chatFull4.about;
                    while (str18.contains("\n\n\n")) {
                        str18 = str18.replace("\n\n\n", "\n\n");
                    }
                    String string5 = LocaleController.getString(R.string.DescriptionPlaceholder);
                    chat4 = profileActivity.A2;
                    if (ChatObject.isChannel(chat4)) {
                        chat5 = profileActivity.A2;
                        if (!chat5.megagroup) {
                            z13 = true;
                            jVar.f(str18, string5, z13);
                            break;
                        }
                    }
                    z13 = false;
                    jVar.f(str18, string5, z13);
                } else {
                    i29 = profileActivity.S2;
                    if (i9 == i29) {
                        userFull2 = profileActivity.r2;
                        if (userFull2 != null) {
                            userFull7 = profileActivity.r2;
                            if (TextUtils.isEmpty(userFull7.about)) {
                                jVar.f(LocaleController.getString(R.string.UserBio), LocaleController.getString(R.string.UserBioDetail), false);
                                profileActivity.v2 = null;
                                jVar.setMoreButtonDisabled(true);
                                break;
                            }
                        }
                        userFull3 = profileActivity.r2;
                        if (userFull3 == null) {
                            str10 = LocaleController.getString(R.string.Loading);
                        } else {
                            userFull4 = profileActivity.r2;
                            str10 = userFull4.about;
                        }
                        jVar.f(str10, LocaleController.getString(R.string.UserBio), profileActivity.getUserConfig().isPremium());
                        userFull5 = profileActivity.r2;
                        if (userFull5 != null) {
                            userFull6 = profileActivity.r2;
                            str11 = userFull6.about;
                        } else {
                            str11 = null;
                        }
                        profileActivity.v2 = str11;
                        jVar.setMoreButtonDisabled(true);
                    }
                }
                break;
            case 4:
            case 18:
            case 24:
                org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                int i109 = org.telegram.ui.ActionBar.f6.m6;
                int i110 = org.telegram.ui.ActionBar.f6.G6;
                p8Var2.e(i109, i110);
                p8Var2.setTag(Integer.valueOf(i110));
                i30 = profileActivity.m4;
                if (i9 == i30) {
                    int i111 = org.telegram.messenger.l0.l(profileActivity.getMessagesController(), profileActivity.e1).ttl;
                    p8Var2.o(LocaleController.getString(R.string.MessageLifetime), i111 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : LocaleController.formatTTLString(i111), false, false);
                } else {
                    i31 = profileActivity.G4;
                    if (i9 == i31) {
                        p8Var2.i(LocaleController.getString(R.string.Unblock), false);
                        p8Var2.e(-1, org.telegram.ui.ActionBar.f6.p7);
                    } else {
                        i32 = profileActivity.n4;
                        if (i9 == i32) {
                            org.telegram.ui.Components.w30 w30Var = new org.telegram.ui.Components.w30();
                            TLRPC.EncryptedChat l11 = org.telegram.messenger.l0.l(profileActivity.getMessagesController(), profileActivity.e1);
                            byte[] bArr = l11.key_hash;
                            w30Var.a = bArr;
                            if (bArr == null) {
                                byte[] calcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(l11.auth_key);
                                w30Var.a = calcAuthKeyHash;
                                l11.key_hash = calcAuthKeyHash;
                            }
                            w30Var.invalidateSelf();
                            p8Var2.t(LocaleController.getString(R.string.EncryptionKey), w30Var, false);
                        } else {
                            i33 = profileActivity.H4;
                            if (i9 == i33) {
                                p8Var2.e(-1, org.telegram.ui.ActionBar.f6.o6);
                                chat10 = profileActivity.A2;
                                if (chat10.megagroup) {
                                    p8Var2.i(LocaleController.getString(R.string.ProfileJoinGroup), false);
                                } else {
                                    p8Var2.i(LocaleController.getString(R.string.ProfileJoinChannel), false);
                                }
                            } else {
                                i34 = profileActivity.t4;
                                if (i9 == i34) {
                                    chatFull12 = profileActivity.q2;
                                    if (chatFull12 != null) {
                                        chat8 = profileActivity.A2;
                                        if (ChatObject.isChannel(chat8)) {
                                            chat9 = profileActivity.A2;
                                            if (!chat9.megagroup) {
                                                String string6 = LocaleController.getString(R.string.ChannelSubscribers);
                                                chatFull14 = profileActivity.q2;
                                                String formatNumber = LocaleController.formatNumber(chatFull14.participants_count, ',');
                                                int i112 = R.drawable.msg_groups;
                                                i92 = profileActivity.D4;
                                                p8Var2.q(string6, formatNumber, i112, i9 != i92 - 1);
                                            }
                                        }
                                        String string7 = LocaleController.getString(R.string.ChannelMembers);
                                        chatFull13 = profileActivity.q2;
                                        String formatNumber2 = LocaleController.formatNumber(chatFull13.participants_count, ',');
                                        int i113 = R.drawable.msg_groups;
                                        i91 = profileActivity.D4;
                                        p8Var2.q(string7, formatNumber2, i113, i9 != i91 - 1);
                                    } else {
                                        chat6 = profileActivity.A2;
                                        if (ChatObject.isChannel(chat6)) {
                                            chat7 = profileActivity.A2;
                                            if (!chat7.megagroup) {
                                                String string8 = LocaleController.getString(R.string.ChannelSubscribers);
                                                int i114 = R.drawable.msg_groups;
                                                i90 = profileActivity.D4;
                                                p8Var2.m(i114, string8, i9 != i90 - 1);
                                            }
                                        }
                                        String string9 = LocaleController.getString(R.string.ChannelMembers);
                                        int i115 = R.drawable.msg_groups;
                                        i89 = profileActivity.D4;
                                        p8Var2.m(i115, string9, i9 != i89 - 1);
                                    }
                                } else {
                                    i35 = profileActivity.u4;
                                    if (i9 == i35) {
                                        chatFull10 = profileActivity.q2;
                                        if (chatFull10 != null) {
                                            String string10 = LocaleController.getString(R.string.SubscribeRequests);
                                            chatFull11 = profileActivity.q2;
                                            String format = String.format("%d", Integer.valueOf(chatFull11.requests_pending));
                                            int i116 = R.drawable.msg_requests;
                                            i88 = profileActivity.D4;
                                            p8Var2.q(string10, format, i116, i9 != i88 - 1);
                                        }
                                    } else {
                                        i36 = profileActivity.v4;
                                        if (i9 == i36) {
                                            chatFull8 = profileActivity.q2;
                                            if (chatFull8 != null) {
                                                String string11 = LocaleController.getString(R.string.ChannelAdministrators);
                                                chatFull9 = profileActivity.q2;
                                                String format2 = String.format("%d", Integer.valueOf(chatFull9.admins_count));
                                                int i117 = R.drawable.msg_admins;
                                                i87 = profileActivity.D4;
                                                p8Var2.q(string11, format2, i117, i9 != i87 - 1);
                                            } else {
                                                String string12 = LocaleController.getString(R.string.ChannelAdministrators);
                                                int i118 = R.drawable.msg_admins;
                                                i86 = profileActivity.D4;
                                                p8Var2.m(i118, string12, i9 != i86 - 1);
                                            }
                                        } else {
                                            i37 = profileActivity.w4;
                                            if (i9 == i37) {
                                                String string13 = LocaleController.getString(R.string.ChannelAdminSettings);
                                                int i119 = R.drawable.msg_customize;
                                                i85 = profileActivity.D4;
                                                p8Var2.m(i119, string13, i9 != i85 - 1);
                                            } else {
                                                i38 = profileActivity.z4;
                                                if (i9 == i38) {
                                                    i83 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                                                    gh.c0 g11 = gh.c0.g(i83);
                                                    j24 = profileActivity.b1;
                                                    TL_stars.StarsAmount c10 = g11.c(-j24);
                                                    i84 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                                                    gh.c0 g12 = gh.c0.g(i84);
                                                    j25 = profileActivity.b1;
                                                    long i120 = g12.i(-j25);
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                    if (i120 > 0) {
                                                        double d10 = i120 / 1.0E9d;
                                                        if (d10 > 1000.0d) {
                                                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d10, 0));
                                                        } else {
                                                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                                                            decimalFormatSymbols.setDecimalSeparator('.');
                                                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                                                            decimalFormat.setMinimumFractionDigits(2);
                                                            decimalFormat.setMaximumFractionDigits(3);
                                                            decimalFormat.setGroupingUsed(false);
                                                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d10));
                                                        }
                                                    }
                                                    if (c10.amount > 0) {
                                                        if (spannableStringBuilder.length() > 0) {
                                                            spannableStringBuilder.append((CharSequence) " ");
                                                        }
                                                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) gh.oa.K0(c10, 0.777f, ' '));
                                                    }
                                                    p8Var2.q(LocaleController.getString(R.string.ChannelStars), fe.f0(gh.oa.X0(false, spannableStringBuilder, 0.7f, null), p8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                                                } else {
                                                    i39 = profileActivity.x4;
                                                    if (i9 == i39) {
                                                        i82 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                                                        gh.c0 g13 = gh.c0.g(i82);
                                                        j23 = profileActivity.a1;
                                                        TL_stars.StarsAmount c11 = g13.c(j23);
                                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                        if (c11.amount > 0) {
                                                            spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) gh.oa.K0(c11, 0.777f, ' '));
                                                        }
                                                        p8Var2.q(LocaleController.getString(R.string.BotBalanceStars), fe.f0(gh.oa.X0(false, spannableStringBuilder2, 0.7f, null), p8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                                                    } else {
                                                        i40 = profileActivity.y4;
                                                        if (i9 == i40) {
                                                            i81 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                                                            gh.c0 g14 = gh.c0.g(i81);
                                                            j22 = profileActivity.a1;
                                                            long i121 = g14.i(j22);
                                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                            if (i121 > 0) {
                                                                double d11 = i121 / 1.0E9d;
                                                                if (d11 > 1000.0d) {
                                                                    spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d11, 0));
                                                                } else {
                                                                    DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.US);
                                                                    decimalFormatSymbols2.setDecimalSeparator('.');
                                                                    DecimalFormat decimalFormat2 = new DecimalFormat("#.##", decimalFormatSymbols2);
                                                                    decimalFormat2.setMinimumFractionDigits(2);
                                                                    decimalFormat2.setMaximumFractionDigits(3);
                                                                    decimalFormat2.setGroupingUsed(false);
                                                                    spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) decimalFormat2.format(d11));
                                                                }
                                                            }
                                                            p8Var2.q(LocaleController.getString(R.string.BotBalanceTON), fe.f0(gh.oa.X0(false, spannableStringBuilder3, 0.7f, null), p8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                                                        } else {
                                                            i41 = profileActivity.C4;
                                                            if (i9 == i41) {
                                                                chatFull5 = profileActivity.q2;
                                                                if (chatFull5 != null) {
                                                                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                                                                    chatFull6 = profileActivity.q2;
                                                                    int i122 = chatFull6.banned_count;
                                                                    chatFull7 = profileActivity.q2;
                                                                    String format3 = String.format("%d", Integer.valueOf(Math.max(i122, chatFull7.kicked_count)));
                                                                    int i123 = R.drawable.msg_user_remove;
                                                                    i80 = profileActivity.D4;
                                                                    p8Var2.q(string14, format3, i123, i9 != i80 - 1);
                                                                } else {
                                                                    String string15 = LocaleController.getString(R.string.ChannelBlacklist);
                                                                    int i124 = R.drawable.msg_user_remove;
                                                                    i79 = profileActivity.D4;
                                                                    p8Var2.m(i124, string15, i9 != i79 - 1);
                                                                }
                                                            } else {
                                                                i42 = profileActivity.s4;
                                                                if (i9 == i42) {
                                                                    p8Var2.e(i109, i110);
                                                                    int i125 = i9 + 1;
                                                                    boolean z32 = i125 >= profileActivity.q4 && i125 < profileActivity.r4;
                                                                    String string16 = LocaleController.getString(R.string.AddMember);
                                                                    int i126 = R.drawable.msg_contact_add;
                                                                    i78 = profileActivity.D4;
                                                                    p8Var2.m(i126, string16, i78 == -1 || z32);
                                                                } else {
                                                                    i43 = profileActivity.Q3;
                                                                    if (i9 == i43) {
                                                                        p8Var2.i(LocaleController.getString(R.string.SendMessageLocation), true);
                                                                    } else {
                                                                        i44 = profileActivity.V3;
                                                                        if (i9 == i44) {
                                                                            p8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), false);
                                                                            p8Var2.e(i109, i110);
                                                                        } else {
                                                                            i45 = profileActivity.S3;
                                                                            if (i9 == i45) {
                                                                                p8Var2.m(R.drawable.menu_reaction_delete_24, LocaleController.getString(R.string.DeleteReactionMenu), false);
                                                                                p8Var2.e(org.telegram.ui.ActionBar.f6.q7, org.telegram.ui.ActionBar.f6.p7);
                                                                            } else {
                                                                                i46 = profileActivity.T3;
                                                                                if (i9 == i46) {
                                                                                    MessagesController messagesController7 = profileActivity.getMessagesController();
                                                                                    j21 = profileActivity.W4;
                                                                                    TLRPC.Chat chat14 = messagesController7.getChat(Long.valueOf(-j21));
                                                                                    if (chat14 == null || !ChatObject.canBlockUsers(chat14)) {
                                                                                        p8Var2.m(R.drawable.msg_report, LocaleController.getString(R.string.ReportReaction2), false);
                                                                                    } else {
                                                                                        p8Var2.m(R.drawable.msg_block2, LocaleController.getString(R.string.ReportReactionAndBan2), false);
                                                                                    }
                                                                                    p8Var2.e(org.telegram.ui.ActionBar.f6.q7, org.telegram.ui.ActionBar.f6.p7);
                                                                                } else {
                                                                                    i47 = profileActivity.R3;
                                                                                    if (i9 == i47) {
                                                                                        p8Var2.i(LocaleController.getString(R.string.ReportUserLocation), false);
                                                                                        int i127 = org.telegram.ui.ActionBar.f6.p7;
                                                                                        p8Var2.e(-1, i127);
                                                                                        p8Var2.e(-1, i127);
                                                                                    } else {
                                                                                        i48 = profileActivity.c3;
                                                                                        if (i9 == i48) {
                                                                                            p8Var2.s(LocaleController.getString(R.string.Language), LocaleController.getCurrentLanguageName(), false, R.drawable.msg2_language, false);
                                                                                            p8Var2.setImageLeft(23);
                                                                                        } else {
                                                                                            i49 = profileActivity.b3;
                                                                                            if (i9 == i49) {
                                                                                                p8Var2.m(R.drawable.msg2_notifications, LocaleController.getString(R.string.NotificationsAndSounds), true);
                                                                                            } else {
                                                                                                i50 = profileActivity.d3;
                                                                                                if (i9 == i50) {
                                                                                                    p8Var2.m(R.drawable.msg2_secret, LocaleController.getString(R.string.PrivacySettings), true);
                                                                                                } else {
                                                                                                    i51 = profileActivity.e3;
                                                                                                    if (i9 == i51) {
                                                                                                        p8Var2.m(R.drawable.msg2_data, LocaleController.getString(R.string.DataSettings), true);
                                                                                                    } else {
                                                                                                        i52 = profileActivity.f3;
                                                                                                        if (i9 == i52) {
                                                                                                            p8Var2.m(R.drawable.msg2_discussion, LocaleController.getString(R.string.ChatSettings), true);
                                                                                                        } else {
                                                                                                            i53 = profileActivity.g3;
                                                                                                            if (i9 == i53) {
                                                                                                                p8Var2.m(R.drawable.msg2_folder, LocaleController.getString(R.string.Filters), true);
                                                                                                            } else {
                                                                                                                i54 = profileActivity.i3;
                                                                                                                if (i9 == i54) {
                                                                                                                    p8Var2.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), true);
                                                                                                                } else {
                                                                                                                    i55 = profileActivity.h3;
                                                                                                                    if (i9 == i55) {
                                                                                                                        p8Var2.m(R.drawable.msg2_battery, LocaleController.getString(R.string.PowerUsage), true);
                                                                                                                    } else {
                                                                                                                        i56 = profileActivity.m3;
                                                                                                                        if (i9 == i56) {
                                                                                                                            p8Var2.m(R.drawable.msg2_ask_question, LocaleController.getString(R.string.AskAQuestion), true);
                                                                                                                        } else {
                                                                                                                            i57 = profileActivity.n3;
                                                                                                                            if (i9 == i57) {
                                                                                                                                p8Var2.m(R.drawable.msg2_help, LocaleController.getString(R.string.TelegramFAQ), true);
                                                                                                                            } else {
                                                                                                                                i58 = profileActivity.o3;
                                                                                                                                if (i9 == i58) {
                                                                                                                                    p8Var2.m(R.drawable.msg2_policy, LocaleController.getString(R.string.PrivacyPolicy), false);
                                                                                                                                } else {
                                                                                                                                    i59 = profileActivity.r3;
                                                                                                                                    if (i9 == i59) {
                                                                                                                                        p8Var2.i(LocaleController.getString(R.string.DebugSendLogs), true);
                                                                                                                                    } else {
                                                                                                                                        i60 = profileActivity.s3;
                                                                                                                                        if (i9 == i60) {
                                                                                                                                            p8Var2.i(LocaleController.getString(R.string.DebugSendLastLogs), true);
                                                                                                                                        } else {
                                                                                                                                            i61 = profileActivity.t3;
                                                                                                                                            if (i9 == i61) {
                                                                                                                                                p8Var2.i(LocaleController.getString(R.string.DebugClearLogs), profileActivity.u3 != -1);
                                                                                                                                            } else if (i9 == profileActivity.u3) {
                                                                                                                                                p8Var2.i("Switch Backend", false);
                                                                                                                                            } else {
                                                                                                                                                i62 = profileActivity.j3;
                                                                                                                                                if (i9 == i62) {
                                                                                                                                                    p8Var2.m(R.drawable.msg2_devices, LocaleController.getString(R.string.Devices), true);
                                                                                                                                                } else {
                                                                                                                                                    i63 = profileActivity.K2;
                                                                                                                                                    if (i9 == i63) {
                                                                                                                                                        profileActivity.S.N(86);
                                                                                                                                                        profileActivity.S.J();
                                                                                                                                                        p8Var2.n(LocaleController.getString(R.string.SetProfilePhoto), profileActivity.S, false);
                                                                                                                                                        p8Var2.e(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                                                                                                                                                        p8Var2.getImageView().setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                                                                                                                                                        p8Var2.setImageLeft(12);
                                                                                                                                                        profileActivity.I2 = p8Var2;
                                                                                                                                                    } else {
                                                                                                                                                        i64 = profileActivity.W3;
                                                                                                                                                        if (i9 == i64) {
                                                                                                                                                            p8Var2.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.AddToGroupOrChannel), false);
                                                                                                                                                        } else {
                                                                                                                                                            i65 = profileActivity.Y3;
                                                                                                                                                            if (i9 == i65) {
                                                                                                                                                                p8Var2.n(LocaleController.getString(R.string.TelegramPremium), new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), zf.a1.d().f), true);
                                                                                                                                                                p8Var2.setImageLeft(23);
                                                                                                                                                            } else {
                                                                                                                                                                i66 = profileActivity.Z3;
                                                                                                                                                                if (i9 == i66) {
                                                                                                                                                                    i77 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                                                                                                                                                                    gh.v7 w8 = gh.v7.w(i77);
                                                                                                                                                                    long j36 = w8.p().amount;
                                                                                                                                                                    String string17 = LocaleController.getString(R.string.MenuTelegramStars);
                                                                                                                                                                    CharSequence charSequence2 = str13;
                                                                                                                                                                    if (w8.e) {
                                                                                                                                                                        charSequence2 = str13;
                                                                                                                                                                        if (j36 > 0) {
                                                                                                                                                                            charSequence2 = gh.oa.I0(w8.p(), 0.85f, ' ');
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    p8Var2.r(string17, charSequence2, new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), zf.a1.d().h), true);
                                                                                                                                                                    p8Var2.setImageLeft(23);
                                                                                                                                                                } else {
                                                                                                                                                                    i67 = profileActivity.a4;
                                                                                                                                                                    if (i9 == i67) {
                                                                                                                                                                        i76 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                                                                                                                                                                        gh.v7 L = gh.v7.L(i76);
                                                                                                                                                                        long j37 = L.p().amount;
                                                                                                                                                                        String string18 = LocaleController.getString(R.string.MyTON);
                                                                                                                                                                        CharSequence charSequence3 = str13;
                                                                                                                                                                        if (L.e) {
                                                                                                                                                                            charSequence3 = str13;
                                                                                                                                                                            if (j37 > 0) {
                                                                                                                                                                                charSequence3 = gh.oa.I0(L.p(), 0.85f, ' ');
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        p8Var2.q(string18, charSequence3, R.drawable.settings_gram_24, true);
                                                                                                                                                                        p8Var2.setImageLeft(23);
                                                                                                                                                                    } else {
                                                                                                                                                                        i68 = profileActivity.b4;
                                                                                                                                                                        if (i9 == i68) {
                                                                                                                                                                            p8Var2.m(R.drawable.menu_shop, LocaleController.getString(R.string.TelegramBusiness), true);
                                                                                                                                                                            p8Var2.setImageLeft(23);
                                                                                                                                                                        } else {
                                                                                                                                                                            i69 = profileActivity.c4;
                                                                                                                                                                            if (i9 == i69) {
                                                                                                                                                                                p8Var2.m(R.drawable.menu_gift, LocaleController.getString(R.string.SendAGift), false);
                                                                                                                                                                                p8Var2.setImageLeft(23);
                                                                                                                                                                            } else {
                                                                                                                                                                                i70 = profileActivity.botPermissionLocation;
                                                                                                                                                                                if (i9 == i70) {
                                                                                                                                                                                    String string19 = LocaleController.getString(R.string.BotProfilePermissionLocation);
                                                                                                                                                                                    mh.u0 u0Var = profileActivity.o2;
                                                                                                                                                                                    boolean z33 = u0Var != null && u0Var.g();
                                                                                                                                                                                    int i128 = R.drawable.filled_access_location;
                                                                                                                                                                                    int themedColor = profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.uj);
                                                                                                                                                                                    i75 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    p8Var = p8Var2;
                                                                                                                                                                                    p8Var.k(string19, z33, i128, themedColor, i75 != -1);
                                                                                                                                                                                } else {
                                                                                                                                                                                    p8Var = p8Var2;
                                                                                                                                                                                    i71 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    if (i9 == i71) {
                                                                                                                                                                                        String string20 = LocaleController.getString(R.string.BotProfilePermissionBiometry);
                                                                                                                                                                                        mh.r rVar = profileActivity.p2;
                                                                                                                                                                                        p8Var.k(string20, rVar != null && rVar.g(), R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.xj), false);
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i72 = profileActivity.botPermissionEmojiStatus;
                                                                                                                                                                                        if (i9 == i72) {
                                                                                                                                                                                            String string21 = LocaleController.getString(R.string.BotProfilePermissionEmojiStatus);
                                                                                                                                                                                            userFull13 = profileActivity.r2;
                                                                                                                                                                                            if (userFull13 != null) {
                                                                                                                                                                                                userFull14 = profileActivity.r2;
                                                                                                                                                                                                if (userFull14.bot_can_manage_emoji_status) {
                                                                                                                                                                                                    z16 = true;
                                                                                                                                                                                                    int i129 = R.drawable.filled_access_sleeping;
                                                                                                                                                                                                    int themedColor2 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.sj);
                                                                                                                                                                                                    i73 = profileActivity.botPermissionLocation;
                                                                                                                                                                                                    if (i73 == -1) {
                                                                                                                                                                                                        i74 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                                        if (i74 == -1) {
                                                                                                                                                                                                            z17 = false;
                                                                                                                                                                                                            p8Var.k(string21, z16, i129, themedColor2, z17);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    z17 = true;
                                                                                                                                                                                                    p8Var.k(string21, z16, i129, themedColor2, z17);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            z16 = false;
                                                                                                                                                                                            int i1292 = R.drawable.filled_access_sleeping;
                                                                                                                                                                                            int themedColor22 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.sj);
                                                                                                                                                                                            i73 = profileActivity.botPermissionLocation;
                                                                                                                                                                                            if (i73 == -1) {
                                                                                                                                                                                            }
                                                                                                                                                                                            z17 = true;
                                                                                                                                                                                            p8Var.k(string21, z16, i1292, themedColor22, z17);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                p8Var2 = p8Var;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                p8Var2.c.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.I6));
                break;
            case 6:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                i93 = profileActivity.J3;
                if (i9 == i93) {
                    i94 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i94);
                    long j38 = profileActivity.e1;
                    if (j38 == 0) {
                        j27 = profileActivity.a1;
                        if (j27 != 0) {
                            j38 = profileActivity.a1;
                        } else {
                            j28 = profileActivity.b1;
                            j38 = -j28;
                        }
                    }
                    j26 = profileActivity.c1;
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j38, j26);
                    boolean z34 = notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_CUSTOM + sharedPrefKey, false);
                    boolean contains = notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_NOTIFY + sharedPrefKey);
                    int c12 = org.telegram.messenger.l0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY, sharedPrefKey, notificationsSettings, 0);
                    int c13 = org.telegram.messenger.l0.c(NotificationsSettingsFacade.PROPERTY_NOTIFY_UNTIL, sharedPrefKey, notificationsSettings, 0);
                    if (c12 == 3 && c13 != Integer.MAX_VALUE) {
                        int currentTime = c13 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str14 = z34 ? LocaleController.getString(R.string.NotificationsCustom) : LocaleController.getString(R.string.NotificationsOn);
                            z19 = true;
                        } else {
                            if (currentTime < 3600) {
                                str14 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]));
                            } else if (currentTime < 86400) {
                                str14 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Hours", (int) Math.ceil((currentTime / 60.0f) / 60.0f), new Object[0]));
                            } else if (currentTime < 31536000) {
                                str14 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Days", (int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), new Object[0]));
                            }
                            z19 = false;
                        }
                    } else if (c12 == 0) {
                        if (!contains) {
                            notificationsController = profileActivity.getNotificationsController();
                            z18 = notificationsController.isGlobalNotificationsEnabled(j38, false, false);
                            if (z18 || !z34) {
                                str14 = LocaleController.getString(!z18 ? R.string.NotificationsOn : R.string.NotificationsOff);
                            } else {
                                str14 = LocaleController.getString(R.string.NotificationsCustom);
                            }
                            z19 = z18;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        str14 = LocaleController.getString(!z18 ? R.string.NotificationsOn : R.string.NotificationsOff);
                        z19 = z18;
                    } else {
                        if (c12 != 1) {
                            z18 = false;
                            if (z18) {
                            }
                            str14 = LocaleController.getString(!z18 ? R.string.NotificationsOn : R.string.NotificationsOff);
                            z19 = z18;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        str14 = LocaleController.getString(!z18 ? R.string.NotificationsOn : R.string.NotificationsOff);
                        z19 = z18;
                    }
                    if (str14 == null) {
                        str14 = LocaleController.getString(R.string.NotificationsOff);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        str14 = String.format(Locale.US, LocaleController.getPluralString("NotificationTopicExceptionsDesctription", hashSet.size()), str14, Integer.valueOf(hashSet.size()));
                    }
                    String str19 = str14;
                    z20 = profileActivity.h5;
                    j5Var.setAnimationsEnabled(z20);
                    j5Var.b(LocaleController.getString(R.string.Notifications), str19, 0, z19, 0, false, profileActivity.e4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i9));
                break;
            case 8:
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                try {
                    chatParticipant = !arrayList2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) arrayList2.get(i9 - profileActivity.q4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i9 - profileActivity.q4);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str20 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = LocaleController.getString(R.string.ChannelCreator);
                            }
                            z25 = false;
                            z26 = true;
                            z27 = true;
                        } else {
                            if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                                if (TextUtils.isEmpty(str20)) {
                                    str20 = LocaleController.getString(R.string.ChannelAdmin);
                                }
                                z25 = channelParticipant.promoted_by == profileActivity.getUserConfig().getClientUserId();
                                z26 = true;
                            } else {
                                z25 = false;
                                z26 = false;
                            }
                            z27 = false;
                        }
                        z21 = z25;
                        str12 = str20;
                        z22 = z26;
                        z23 = z27;
                    } else {
                        String str21 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str21)) {
                                str21 = LocaleController.getString(R.string.ChannelCreator);
                            }
                            str12 = str21;
                            z21 = false;
                            z22 = true;
                            z23 = true;
                        } else {
                            if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                                if (TextUtils.isEmpty(str21)) {
                                    str21 = LocaleController.getString(R.string.ChannelAdmin);
                                }
                                z21 = chatParticipant.inviter_id == profileActivity.getUserConfig().getClientUserId();
                                str12 = str21;
                                z22 = true;
                            } else {
                                str12 = str21;
                                z21 = false;
                                z22 = false;
                            }
                            z23 = false;
                        }
                    }
                    final TLRPC.User user5 = profileActivity.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                    if (UserObject.isUserSelf(user5)) {
                        MessagesController messagesController8 = profileActivity.getMessagesController();
                        j29 = profileActivity.b1;
                        if (ChatObject.canManageMyTag(messagesController8.getChat(Long.valueOf(j29)))) {
                            z24 = true;
                            final String str22 = str12;
                            final boolean z35 = z22;
                            final boolean z36 = z23;
                            vaVar.a(str12, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.lz0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i130;
                                    org.telegram.ui.ActionBar.b6 b6Var2;
                                    ProfileActivity profileActivity2 = vz0.this.e;
                                    Activity parentActivity = profileActivity2.getParentActivity();
                                    i130 = ((org.telegram.ui.ActionBar.o2) profileActivity2).currentAccount;
                                    long a2 = profileActivity2.a();
                                    b6Var2 = ((org.telegram.ui.ActionBar.o2) profileActivity2).resourceProvider;
                                    org.telegram.ui.Components.iz0.b(parentActivity, i130, a2, user5, str22, z35, z36, z21, b6Var2);
                                }
                            });
                            vaVar.f(user5, i9 != profileActivity.r4 - 1);
                            break;
                        }
                    }
                    z24 = false;
                    final String str222 = str12;
                    final boolean z352 = z22;
                    final boolean z362 = z23;
                    vaVar.a(str12, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.lz0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i130;
                            org.telegram.ui.ActionBar.b6 b6Var2;
                            ProfileActivity profileActivity2 = vz0.this.e;
                            Activity parentActivity = profileActivity2.getParentActivity();
                            i130 = ((org.telegram.ui.ActionBar.o2) profileActivity2).currentAccount;
                            long a2 = profileActivity2.a();
                            b6Var2 = ((org.telegram.ui.ActionBar.o2) profileActivity2).resourceProvider;
                            org.telegram.ui.Components.iz0.b(parentActivity, i130, a2, user5, str222, z352, z362, z21, b6Var2);
                        }
                    });
                    vaVar.f(user5, i9 != profileActivity.r4 - 1);
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
                i95 = profileActivity.Y2;
                if (i9 != i95) {
                    i96 = profileActivity.W2;
                    if (i9 != i96) {
                        i97 = profileActivity.U2;
                        if (i9 == i97) {
                            y6Var.setType(2);
                            break;
                        }
                    } else {
                        y6Var.setType(0);
                        break;
                    }
                } else {
                    y6Var.setType(1);
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Cells.b9) view).setText(LocaleController.getString(R.string.BotAddToGroupOrChannelInfo));
                break;
            case 20:
                String string22 = LocaleController.getString(R.string.Notifications);
                MessagesController messagesController9 = profileActivity.getMessagesController();
                long a2 = profileActivity.a();
                j30 = profileActivity.c1;
                ((org.telegram.ui.Cells.t8) view).f(string22, !messagesController9.isDialogMuted(a2, j30), false);
                break;
            case 21:
                pf.c1 c1Var = (pf.c1) view;
                userFull15 = profileActivity.r2;
                if (userFull15 != null) {
                    userFull16 = profileActivity.r2;
                    tL_businessLocation = userFull16.business_location;
                }
                c1Var.a(tL_businessLocation, profileActivity.I3 < 0 && !profileActivity.o1);
                break;
            case 22:
                pf.b1 b1Var = (pf.b1) view;
                b1Var.setOnTimezoneSwitchClick(new kz0(this, r12 ? 1 : 0));
                userFull17 = profileActivity.r2;
                if (userFull17 != null) {
                    userFull18 = profileActivity.r2;
                    tL_businessWorkHours = userFull18.business_work_hours;
                }
                z28 = profileActivity.J4;
                z29 = profileActivity.K4;
                if ((profileActivity.I3 >= 0 || profileActivity.o1) && profileActivity.L3 < 0) {
                    z30 = false;
                }
                b1Var.b(tL_businessWorkHours, z28, z29, z30);
                break;
            case 23:
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                MessagesController messagesController10 = profileActivity.getMessagesController();
                userFull19 = profileActivity.r2;
                TLRPC.Chat chat15 = messagesController10.getChat(Long.valueOf(userFull19.personal_channel_id));
                org.telegram.ui.Cells.f6 f6Var = profileActivity.s2;
                g6Var.a(f6Var != null ? f6Var.d : null, chat15);
                break;
            case 26:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setLinkTextRippleColor(null);
                i98 = profileActivity.N3;
                if (i9 == i98) {
                    profileActivity.getMessagesController().getUserOrChat(profileActivity.a());
                    userFull26 = profileActivity.r2;
                    if (userFull26 != null) {
                        userFull30 = profileActivity.r2;
                        botverification = userFull30.bot_verification;
                    } else {
                        chatFull15 = profileActivity.q2;
                        if (chatFull15 != null) {
                            chatFull16 = profileActivity.q2;
                            botverification = chatFull16.bot_verification;
                        } else {
                            botverification = null;
                        }
                    }
                    userFull27 = profileActivity.r2;
                    if (userFull27 != null) {
                        userFull28 = profileActivity.r2;
                        if (TLObject.hasFlag(userFull28.flags2, 33554432)) {
                            userFull29 = profileActivity.r2;
                            l10 = Long.valueOf(userFull29.bot_manager_id);
                            int i130 = 14;
                            if (profileActivity.e4 < 0 || botverification != null || l10 != null) {
                                b9Var.setFixedSize(0);
                                MessagesController messagesController11 = profileActivity.getMessagesController();
                                j32 = profileActivity.a1;
                                TLRPC.User user6 = messagesController11.getUser(Long.valueOf(j32));
                                boolean z37 = user6 == null && user6.bot && user6.bot_can_edit;
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                if (profileActivity.e4 >= 0) {
                                    spannableStringBuilder4.append(AndroidUtilities.replaceSingleTag(LocaleController.getString(z37 ? R.string.ProfileBotOpenAppInfoOwner : R.string.ProfileBotOpenAppInfo), new org.telegram.ui.Components.a50(i130, this, z37)));
                                    if (botverification != null || l10 != null) {
                                        spannableStringBuilder4.append("\n\n\n");
                                    }
                                }
                                if (botverification == null) {
                                    spannableStringBuilder4.append("x");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.t5(botverification.icon, b9Var.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    SpannableString spannableString2 = new SpannableString(botverification.description);
                                    try {
                                        AndroidUtilities.addLinksSafe(spannableString2, 1, false, false);
                                        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class);
                                        while (i106 < uRLSpanArr.length) {
                                            URLSpan uRLSpan = uRLSpanArr[i106];
                                            int spanStart = spannableString2.getSpanStart(uRLSpan);
                                            int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                            String url = uRLSpan.getURL();
                                            spannableString2.removeSpan(uRLSpan);
                                            spannableString2.setSpan(new nz0(this, url, url), spanStart, spanEnd, 33);
                                            i106++;
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    spannableStringBuilder4.append((CharSequence) spannableString2);
                                } else if (l10 != null && (user2 = profileActivity.getMessagesController().getUser(l10)) != null) {
                                    int length = spannableStringBuilder4.length();
                                    spannableStringBuilder4.append("</>");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.eq(R.drawable.managed_bot), length, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    spannableStringBuilder4.append(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.ProfileBotManagedBy, UserObject.getPublicUsername(user2)), profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.gc), new ys0(21, this, l10)));
                                }
                                b9Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.B6))));
                                b9Var.setText(spannableStringBuilder4);
                                break;
                            } else {
                                b9Var.setFixedSize(14);
                                b9Var.setText(null);
                                break;
                            }
                        }
                    }
                    l10 = null;
                    int i1302 = 14;
                    if (profileActivity.e4 < 0) {
                    }
                    b9Var.setFixedSize(0);
                    MessagesController messagesController112 = profileActivity.getMessagesController();
                    j32 = profileActivity.a1;
                    TLRPC.User user62 = messagesController112.getUser(Long.valueOf(j32));
                    if (user62 == null) {
                    }
                    SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder();
                    if (profileActivity.e4 >= 0) {
                    }
                    if (botverification == null) {
                    }
                    b9Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.B6))));
                    b9Var.setText(spannableStringBuilder42);
                } else {
                    i99 = profileActivity.P3;
                    if (i9 == i99) {
                        MessagesController messagesController12 = profileActivity.getMessagesController();
                        j31 = profileActivity.a1;
                        TLRPC.User user7 = messagesController12.getUser(Long.valueOf(j31));
                        if (user7 != null && user7.bot && user7.bot_can_edit) {
                            b9Var.setFixedSize(0);
                            int i131 = R.string.ProfileBotAffiliateProgramInfoOwner;
                            String userName = UserObject.getUserName(user7);
                            userFull23 = profileActivity.r2;
                            if (userFull23 != null) {
                                userFull24 = profileActivity.r2;
                                if (userFull24.starref_program != null) {
                                    userFull25 = profileActivity.r2;
                                    i101 = userFull25.starref_program.commission_permille;
                                    b9Var.setText(LocaleController.formatString(i131, userName, mh.l.F0(i101)));
                                    break;
                                }
                            }
                            i101 = 0;
                            b9Var.setText(LocaleController.formatString(i131, userName, mh.l.F0(i101)));
                        } else {
                            b9Var.setFixedSize(0);
                            int i132 = R.string.ProfileBotAffiliateProgramInfo;
                            String userName2 = UserObject.getUserName(user7);
                            userFull20 = profileActivity.r2;
                            if (userFull20 != null) {
                                userFull21 = profileActivity.r2;
                                if (userFull21.starref_program != null) {
                                    userFull22 = profileActivity.r2;
                                    i100 = userFull22.starref_program.commission_permille;
                                    b9Var.setText(LocaleController.formatString(i132, userName2, mh.l.F0(i100)));
                                    break;
                                }
                            }
                            i100 = 0;
                            b9Var.setText(LocaleController.formatString(i132, userName2, mh.l.F0(i100)));
                        }
                    }
                }
                break;
            case 27:
                mh.i iVar = (mh.i) view;
                iVar.a(profileActivity.getThemedColor(org.telegram.ui.ActionBar.f6.uj), R.drawable.filled_affiliate, LocaleController.getString(R.string.ProfileBotAffiliateProgram), null);
                userFull31 = profileActivity.r2;
                if (userFull31 != null) {
                    userFull32 = profileActivity.r2;
                    if (userFull32.starref_program != null) {
                        userFull33 = profileActivity.r2;
                        str15 = mh.l.F0(userFull33.starref_program.commission_permille);
                    }
                }
                iVar.setPercent(str15);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                i102 = profileActivity.f4;
                if (i9 == i102) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.round_warn);
                    eqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
                    int i133 = org.telegram.ui.ActionBar.f6.wj;
                    b6Var = profileActivity.v0;
                    eqVar.setOverrideColor(org.telegram.ui.ActionBar.f6.v0(i133, b6Var));
                    spannableStringBuilder5.setSpan(eqVar, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    int i134 = R.string.ProfileUnofficialSecurityRisk;
                    MessagesController messagesController13 = profileActivity.getMessagesController();
                    j33 = profileActivity.a1;
                    spannableStringBuilder5.append((CharSequence) LocaleController.formatString(i134, UserObject.getForcedFirstName(messagesController13.getUser(Long.valueOf(j33)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                oh.b bVar = (oh.b) view;
                chat11 = profileActivity.A2;
                if (chat11 == null) {
                    j34 = profileActivity.a1;
                    if (j34 != 0) {
                        MessagesController messagesController14 = profileActivity.getMessagesController();
                        j35 = profileActivity.a1;
                        TLRPC.User user8 = messagesController14.getUser(Long.valueOf(j35));
                        if (user8 != null) {
                            i103 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                            bVar.a(i103, profileActivity.getMessagesController().getChat(Long.valueOf(user8.linked_community_id)));
                            break;
                        }
                    }
                } else {
                    i104 = ((org.telegram.ui.ActionBar.o2) profileActivity).currentAccount;
                    MessagesController messagesController15 = profileActivity.getMessagesController();
                    chat12 = profileActivity.A2;
                    bVar.a(i104, messagesController15.getChat(Long.valueOf(chat12.linked_community_id)));
                    break;
                }
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View vaVar;
        View sz0Var;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i9) {
            case 1:
                vaVar = new org.telegram.ui.Cells.m4(this.c, org.telegram.ui.ActionBar.f6.L6, 18, 7, false, profileActivity.v0);
                break;
            case 2:
            case 19:
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                pz0 pz0Var = new pz0(this, this.c, profileActivity.v0, i9 == 30, i9 == 19);
                pz0Var.setContentDescriptionValueFirst(true);
                vaVar = pz0Var;
                break;
            case 3:
                qz0 qz0Var = new qz0(this, context, profileActivity, profileActivity.v0);
                profileActivity.J5 = qz0Var;
                vaVar = qz0Var;
                break;
            case 4:
                vaVar = new gs(this, context, profileActivity.v0);
                break;
            case 5:
                View c3Var = new org.telegram.ui.Cells.c3(context, profileActivity.v0);
                c3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                vaVar = c3Var;
                break;
            case 6:
                vaVar = new rz0(this, context, profileActivity.v0);
                break;
            case 7:
                vaVar = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 8:
                vaVar = new org.telegram.ui.Cells.va(profileActivity.s4 == -1 ? 9 : 6, 0, this.c, profileActivity.v0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context, 10, profileActivity.v0);
                b9Var.getTextView().setGravity(1);
                b9Var.getTextView().setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, profileActivity.v0));
                b9Var.getTextView().setMovementMethod(null);
                b9Var.setText(AndroidUtilities.getBuildVersionInfo());
                b9Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                vaVar = b9Var;
                break;
            case 11:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                View t3Var = new org.telegram.ui.Cells.t3(context, AndroidUtilities.dp(i9 == 31 ? 12.0f : 6.0f), 2);
                t3Var.setTag(-33024);
                vaVar = t3Var;
                break;
            case 12:
                sz0Var = new sz0(this, context);
                sz0Var.setBackground(new ColorDrawable(0));
                sz0Var.setTag(-33024);
                vaVar = sz0Var;
                break;
            case 13:
                if (profileActivity.K.getParent() != null) {
                    ((ViewGroup) profileActivity.K.getParent()).removeView(profileActivity.K);
                }
                sz0Var = profileActivity.K;
                sz0Var.setTag(-33024);
                vaVar = sz0Var;
                break;
            case 15:
                vaVar = new uz0(this, context, profileActivity.v0);
                break;
            case 17:
                vaVar = new org.telegram.ui.Cells.b9(context, profileActivity.v0);
                break;
            case 18:
            case 24:
                View r1Var = new zf.r1(context, i9 == 18 ? 0 : 1, profileActivity.v0);
                r1Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, profileActivity.v0));
                vaVar = r1Var;
                break;
            case 20:
                vaVar = new org.telegram.ui.Cells.t8(18, context, profileActivity.v0, false);
                break;
            case 21:
                View c1Var = new pf.c1(context, profileActivity.v0);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, profileActivity.v0));
                vaVar = c1Var;
                break;
            case 22:
                View tz0Var = new tz0(this, context, profileActivity.v0);
                tz0Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, profileActivity.v0));
                vaVar = tz0Var;
                break;
            case 23:
                vaVar = new mz0(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                kh.d dVar = new kh.d(context, profileActivity.v0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new kz0(this, 0));
                frameLayout.addView(dVar, g7.e6.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, profileActivity.v0));
                vaVar = frameLayout;
                break;
            case 26:
                vaVar = new org.telegram.ui.Cells.b9(context, profileActivity.v0);
                break;
            case 27:
                vaVar = new mh.i(context, profileActivity.v0);
                break;
            case 28:
                sz0Var = new org.telegram.ui.Components.an(context, 23);
                sz0Var.setTag(-33024);
                vaVar = sz0Var;
                break;
            case 32:
                vaVar = new h01(profileActivity, context);
                break;
            case 33:
                vaVar = new oh.b(context, profileActivity.v0);
                break;
        }
        if (i9 != 13) {
            vaVar.setLayoutParams(new f2.a1(-1, -2));
        }
        return new org.telegram.ui.Components.ik0(vaVar);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        View view = q1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.K) {
            profileActivity.M = true;
        }
        if (view instanceof org.telegram.ui.Cells.z8) {
            ((org.telegram.ui.Cells.z8) view).a.setLoading(profileActivity.e5);
            ((org.telegram.ui.Cells.z8) view).b.setLoading(profileActivity.e5);
        }
    }

    @Override // f2.r0
    public final void z(f2.q1 q1Var) {
        View view = q1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.K) {
            profileActivity.M = false;
        }
    }
}
