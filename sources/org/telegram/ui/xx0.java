package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xx0 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public xx0(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        int b10 = c1Var.b();
        ProfileActivity profileActivity = this.e;
        if (b10 == profileActivity.N2) {
            profileActivity.L2 = null;
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.e3 != -1) {
            int b10 = c1Var.b();
            if (b10 != profileActivity.e3 && b10 != profileActivity.S2 && b10 != profileActivity.g3 && b10 != profileActivity.f3 && b10 != profileActivity.U2 && b10 != profileActivity.V2 && b10 != profileActivity.y3 && b10 != profileActivity.h3 && b10 != profileActivity.i3 && b10 != profileActivity.p3 && b10 != profileActivity.m3 && b10 != profileActivity.j3 && b10 != profileActivity.l3 && b10 != profileActivity.q3 && b10 != profileActivity.r3 && b10 != profileActivity.u3 && b10 != profileActivity.v3 && b10 != profileActivity.w3 && b10 != profileActivity.x3 && b10 != profileActivity.N2 && b10 != profileActivity.Z3 && b10 != profileActivity.b4 && b10 != profileActivity.f4 && b10 != profileActivity.e4 && b10 != profileActivity.k3 && b10 != profileActivity.T2 && b10 != profileActivity.P2 && b10 != profileActivity.c4 && b10 != profileActivity.d4 && b10 != profileActivity.k4) {
                return false;
            }
        } else {
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.pa) {
                Object currentObject = ((org.telegram.ui.Cells.pa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && org.telegram.messenger.h20.B((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = c1Var.f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
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
            int i10 = 0;
            while (i10 < arrayList2.size()) {
                if (!((TLRPC.TL_username) arrayList2.get(i10)).active || (str != null && str.equals(((TLRPC.TL_username) arrayList2.get(i10)).username))) {
                    arrayList2.remove(i10);
                    i10--;
                }
                i10++;
            }
            str3 = str2;
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i11);
                    SpannableString spannableString = new SpannableString(sc.e.h("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        qx0 qx0Var = new qx0(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, qx0Var);
                        clickableSpan = qx0Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.Uc, this.e.z0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i11 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String L0 = org.telegram.messenger.cd.L0(2131743694, null);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(L0);
                int indexOf = L0.indexOf("%1$s");
                str3 = spannableStringBuilder2;
                if (indexOf >= 0) {
                    spannableStringBuilder2.replace(indexOf, indexOf + 4, (CharSequence) spannableStringBuilder);
                    str3 = spannableStringBuilder2;
                }
            }
        }
        return str3;
    }

    @Override // s4.g0
    public final int b() {
        return this.e.M2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        int i11;
        int i12;
        int i13;
        ProfileActivity profileActivity = this.e;
        if (i10 == profileActivity.C3 || i10 == profileActivity.s4 || i10 == profileActivity.d3 || i10 == profileActivity.R2 || i10 == profileActivity.o3 || i10 == profileActivity.t3 || i10 == profileActivity.m4) {
            return 1;
        }
        if (i10 == profileActivity.F3 || i10 == profileActivity.H3 || i10 == profileActivity.S2 || i10 == profileActivity.T2) {
            return 2;
        }
        if (i10 == profileActivity.K3 || i10 == profileActivity.U2) {
            return 19;
        }
        if (i10 == profileActivity.G3) {
            return 30;
        }
        if (i10 == profileActivity.I3 || i10 == profileActivity.J3 || i10 == profileActivity.V2) {
            return 3;
        }
        if (i10 == profileActivity.p4 || i10 == profileActivity.q4 || i10 == profileActivity.U3 || i10 == profileActivity.W3 || i10 == profileActivity.V3 || i10 == profileActivity.w4 || i10 == profileActivity.x4 || i10 == profileActivity.y4 || i10 == profileActivity.z4 || i10 == profileActivity.F4 || i10 == profileActivity.v4 || i10 == profileActivity.L4 || i10 == profileActivity.K4 || i10 == profileActivity.T3 || i10 == profileActivity.e3 || i10 == profileActivity.g3 || i10 == profileActivity.f3 || i10 == profileActivity.h3 || i10 == profileActivity.i3 || i10 == profileActivity.p3 || i10 == profileActivity.m3 || i10 == profileActivity.j3 || i10 == profileActivity.l3 || i10 == profileActivity.q3 || i10 == profileActivity.r3 || i10 == profileActivity.u3 || i10 == profileActivity.v3 || i10 == profileActivity.w3 || i10 == profileActivity.x3 || i10 == profileActivity.N2 || i10 == profileActivity.Z3 || i10 == profileActivity.Y3 || i10 == profileActivity.k3 || i10 == profileActivity.f4 || i10 == profileActivity.e4 || i10 == profileActivity.A4 || i10 == profileActivity.B4 || i10 == profileActivity.C4) {
            return 4;
        }
        i11 = profileActivity.botPermissionLocation;
        if (i10 == i11) {
            return 4;
        }
        i12 = profileActivity.botPermissionBiometry;
        if (i10 == i12) {
            return 4;
        }
        i13 = profileActivity.botPermissionEmojiStatus;
        if (i10 == i13 || i10 == profileActivity.d4) {
            return 4;
        }
        if (i10 == profileActivity.L3) {
            return 5;
        }
        if (i10 == profileActivity.M3) {
            return 6;
        }
        if (i10 == profileActivity.P3) {
            return 20;
        }
        if (i10 == profileActivity.M4 || i10 == profileActivity.G4 || i10 == profileActivity.l4 || i10 == profileActivity.r4 || i10 == profileActivity.c3 || i10 == profileActivity.n3 || i10 == profileActivity.s3 || i10 == profileActivity.O2 || i10 == profileActivity.a3 || i10 == profileActivity.W2 || i10 == profileActivity.g4 || i10 == profileActivity.X3 || i10 == profileActivity.Q2 || i10 == profileActivity.Y2 || i10 == profileActivity.E4 || i10 == profileActivity.o4 || i10 == profileActivity.D4 || i10 == profileActivity.j4) {
            return 7;
        }
        if (i10 >= profileActivity.t4 && i10 < profileActivity.u4) {
            return 8;
        }
        if (i10 == profileActivity.z3) {
            return 11;
        }
        if (i10 == profileActivity.A3) {
            return 31;
        }
        if (i10 == profileActivity.B3) {
            return 12;
        }
        if (i10 == profileActivity.J4) {
            return 13;
        }
        if (i10 == profileActivity.y3) {
            return 14;
        }
        if (i10 == profileActivity.b3 || i10 == profileActivity.Z2 || i10 == profileActivity.X2) {
            return 15;
        }
        if (i10 == profileActivity.a4) {
            return 17;
        }
        if (i10 == profileActivity.b4) {
            return 18;
        }
        if (i10 == profileActivity.c4) {
            return 24;
        }
        if (i10 == profileActivity.O3) {
            return 21;
        }
        if (i10 == profileActivity.N3) {
            return 22;
        }
        if (i10 == profileActivity.P2) {
            return 23;
        }
        if (i10 == profileActivity.h4) {
            return 25;
        }
        if (i10 == profileActivity.Q3 || i10 == profileActivity.S3) {
            return 26;
        }
        if (i10 == profileActivity.i4) {
            return 32;
        }
        if (i10 == profileActivity.k4) {
            return 33;
        }
        if (i10 == profileActivity.R3) {
            return 27;
        }
        return (i10 == profileActivity.D3 || i10 == profileActivity.E3) ? 28 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:563:0x0ea3, code lost:
    
        if (r0.about != null) goto L571;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0e47  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023e  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        String K0;
        CharSequence charSequence;
        String str;
        int i25;
        String str2;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        long j10;
        TLRPC.Chat chat3;
        boolean z10;
        String str3;
        String str4;
        String str5;
        long j11;
        long j12;
        long j13;
        String str6;
        boolean z11;
        long j14;
        long j15;
        long j16;
        int i26;
        long j17;
        TLRPC.TL_username tL_username;
        String str7;
        long j18;
        int i27;
        Spannable h02;
        long j19;
        String K02;
        String str8;
        boolean z12;
        TLRPC.UserFull userFull;
        long j20;
        int i28;
        String Z;
        int i29;
        int i30;
        TLRPC.UserFull userFull2;
        TLRPC.UserFull userFull3;
        TLRPC.UserFull userFull4;
        String str9;
        TLRPC.UserFull userFull5;
        String str10;
        TLRPC.UserFull userFull6;
        TLRPC.UserFull userFull7;
        TLRPC.ChatFull chatFull4;
        TLRPC.Chat chat4;
        boolean z13;
        TLRPC.Chat chat5;
        TLRPC.UserFull userFull8;
        TLRPC.UserFull userFull9;
        TLRPC.User Z1;
        boolean z14;
        boolean z15;
        TLRPC.UserFull userFull10;
        TLRPC.UserFull userFull11;
        TLRPC.UserFull userFull12;
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
        int i71;
        int i72;
        int i73;
        TLRPC.UserFull userFull13;
        boolean z16;
        int i74;
        boolean z17;
        int i75;
        TLRPC.UserFull userFull14;
        int i76;
        int i77;
        int i78;
        long j21;
        int i79;
        TLRPC.ChatFull chatFull5;
        int i80;
        TLRPC.ChatFull chatFull6;
        TLRPC.ChatFull chatFull7;
        int i81;
        int i82;
        long j22;
        int i83;
        long j23;
        int i84;
        long j24;
        int i85;
        long j25;
        int i86;
        TLRPC.ChatFull chatFull8;
        int i87;
        TLRPC.ChatFull chatFull9;
        int i88;
        TLRPC.ChatFull chatFull10;
        TLRPC.ChatFull chatFull11;
        int i89;
        TLRPC.ChatFull chatFull12;
        TLRPC.Chat chat6;
        int i90;
        TLRPC.Chat chat7;
        int i91;
        TLRPC.Chat chat8;
        TLRPC.ChatFull chatFull13;
        int i92;
        TLRPC.Chat chat9;
        TLRPC.ChatFull chatFull14;
        int i93;
        TLRPC.Chat chat10;
        int i94;
        int i95;
        long j26;
        boolean z18;
        String K03;
        boolean z19;
        String str11;
        org.telegram.messenger.ot notificationsController;
        boolean z20;
        String Y;
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
        int i96;
        int i97;
        int i98;
        long j30;
        TLRPC.UserFull userFull15;
        TLRPC.UserFull userFull16;
        TLRPC.UserFull userFull17;
        boolean z28;
        boolean z29;
        TLRPC.UserFull userFull18;
        TLRPC.UserFull userFull19;
        int i99;
        int i100;
        long j31;
        TLRPC.UserFull userFull20;
        int i101;
        TLRPC.UserFull userFull21;
        TLRPC.UserFull userFull22;
        TLRPC.UserFull userFull23;
        int i102;
        TLRPC.UserFull userFull24;
        TLRPC.UserFull userFull25;
        TLRPC.UserFull userFull26;
        TLRPC.ChatFull chatFull15;
        TL_bots.BotVerification botVerification;
        TLRPC.ChatFull chatFull16;
        TLRPC.UserFull userFull27;
        Long l4;
        long j32;
        TLRPC.User Z12;
        TLRPC.UserFull userFull28;
        TLRPC.UserFull userFull29;
        TLRPC.UserFull userFull30;
        TLRPC.UserFull userFull31;
        TLRPC.UserFull userFull32;
        TLRPC.UserFull userFull33;
        int i103;
        long j33;
        TLRPC.Chat chat11;
        long j34;
        long j35;
        int i104;
        int i105;
        TLRPC.Chat chat12;
        ProfileActivity profileActivity = this.e;
        ArrayList arrayList = profileActivity.Q4;
        ArrayList arrayList2 = profileActivity.R4;
        HashSet hashSet = profileActivity.h5;
        int i106 = c1Var.f;
        View view = c1Var.a;
        int i107 = 2;
        String str13 = "";
        TLRPC.ChatParticipant chatParticipant = null;
        r11 = null;
        String str14 = null;
        TL_account.TL_businessWorkHours tL_businessWorkHours = null;
        TLRPC.TL_businessLocation tL_businessLocation = null;
        r9 = true;
        boolean z30 = true;
        int i108 = 0;
        switch (i106) {
            case 1:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                i11 = profileActivity.C3;
                if (i10 == i11) {
                    chat = profileActivity.D2;
                    if (org.telegram.messenger.w3.T(chat)) {
                        chat2 = profileActivity.D2;
                        if (!chat2.megagroup && profileActivity.J3 != -1) {
                            p4Var.setText(org.telegram.messenger.cd.K0(2131746245));
                        }
                    }
                    p4Var.setText(org.telegram.messenger.cd.K0(2131749206));
                } else {
                    i12 = profileActivity.s4;
                    if (i10 == i12) {
                        p4Var.setText(org.telegram.messenger.cd.K0(2131752377));
                    } else {
                        i13 = profileActivity.d3;
                        if (i10 == i13) {
                            p4Var.setText(org.telegram.messenger.cd.K0(2131746000));
                        } else {
                            i14 = profileActivity.R2;
                            if (i10 == i14) {
                                p4Var.setText(org.telegram.messenger.cd.K0(2131754710));
                            } else {
                                i15 = profileActivity.o3;
                                if (i10 == i15) {
                                    p4Var.setText(org.telegram.messenger.cd.K0(2131745497));
                                } else {
                                    i16 = profileActivity.t3;
                                    if (i10 == i16) {
                                        p4Var.setText(org.telegram.messenger.cd.K0(2131745503));
                                    } else {
                                        i17 = profileActivity.m4;
                                        if (i10 == i17) {
                                            p4Var.setText(org.telegram.messenger.cd.K0(2131753006));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                p4Var.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.t6.L6));
                break;
            case 2:
            case 19:
            case org.telegram.messenger.zs.T /* 30 */:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                if (i10 == profileActivity.T2) {
                    org.telegram.messenger.vp messagesController = profileActivity.getMessagesController();
                    j20 = profileActivity.d1;
                    TLRPC.UserFull a2 = messagesController.a2(j20);
                    if (a2 != null && a2.birthday != null) {
                        boolean d = org.telegram.messenger.y1.d(a2);
                        TL_account.TL_birthday tL_birthday = a2.birthday;
                        boolean z31 = (tL_birthday.flags & 1) != 0;
                        int years = z31 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String d02 = UserInfoActivity.d0(a2.birthday);
                        if (z31) {
                            Z = org.telegram.messenger.cd.G(years, d ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", d02);
                        } else {
                            Z = org.telegram.messenger.cd.Z(d ? 2131746736 : 2131746733, d02);
                        }
                        z8Var.d(org.telegram.messenger.k6.p(Z, z8Var.a, new org.telegram.ui.Components.ji0(this, c1Var, i10, 26)), org.telegram.messenger.cd.K0(d ? 2131746737 : 2131746739), (!profileActivity.p1 && profileActivity.N3 == -1 && profileActivity.O3 == -1) ? false : true);
                        if (!profileActivity.r1 && d && !profileActivity.getMessagesController().i7) {
                            i28 = 1;
                            z10 = false;
                            i108 = i28;
                        }
                    }
                    i28 = 0;
                    z10 = false;
                    i108 = i28;
                } else {
                    i18 = profileActivity.F3;
                    if (i10 == i18) {
                        org.telegram.messenger.vp messagesController2 = profileActivity.getMessagesController();
                        j19 = profileActivity.d1;
                        TLRPC.User Z13 = messagesController2.Z1(Long.valueOf(j19));
                        if (Z13 != null && !TextUtils.isEmpty(profileActivity.d5)) {
                            K02 = org.telegram.messenger.m5.h(new StringBuilder("+"), profileActivity.d5, af.b.c());
                            str8 = profileActivity.d5;
                        } else if (Z13 == null || TextUtils.isEmpty(Z13.phone)) {
                            K02 = org.telegram.messenger.cd.K0(2131747310);
                            str8 = null;
                        } else {
                            String h = org.telegram.messenger.m5.h(new StringBuilder("+"), Z13.phone, af.b.c());
                            str8 = Z13.phone;
                            K02 = h;
                        }
                        profileActivity.b5 = str8 != null && str8.matches("888\\d{8}");
                        z12 = profileActivity.b5;
                        z8Var.d(K02, org.telegram.messenger.cd.K0(z12 ? 2131754251 : 2131747307), false);
                    } else {
                        i19 = profileActivity.G3;
                        if (i10 == i19) {
                            org.telegram.messenger.vp messagesController3 = profileActivity.getMessagesController();
                            j18 = profileActivity.d1;
                            TLRPC.UserFull a22 = messagesController3.a2(j18);
                            if (a22 != null) {
                                TLRPC.TL_textWithEntities tL_textWithEntities = a22.note;
                                i27 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                                if (org.telegram.messenger.d20.i(i27).q()) {
                                    h02 = org.telegram.messenger.jj.h0(tL_textWithEntities, false);
                                    if (!(h02 instanceof SpannableStringBuilder)) {
                                        h02 = new SpannableStringBuilder(h02);
                                    }
                                    org.telegram.messenger.i0.c((SpannableStringBuilder) h02, 1, false, false);
                                } else {
                                    h02 = org.telegram.messenger.jj.h0(org.telegram.messenger.jj.x5(tL_textWithEntities), false);
                                }
                                z8Var.c(h02, org.telegram.messenger.cd.K0(2131746665), org.telegram.messenger.cd.K0(2131746664));
                            }
                        } else {
                            i20 = profileActivity.K3;
                            if (i10 == i20) {
                                ArrayList arrayList3 = new ArrayList();
                                j10 = profileActivity.d1;
                                if (j10 != 0) {
                                    org.telegram.messenger.vp messagesController4 = profileActivity.getMessagesController();
                                    j17 = profileActivity.d1;
                                    TLRPC.User Z14 = messagesController4.Z1(Long.valueOf(j17));
                                    if (Z14 != null) {
                                        arrayList3.addAll(Z14.usernames);
                                    }
                                    if (Z14 == null || TextUtils.isEmpty(Z14.username)) {
                                        tL_username = null;
                                        str5 = null;
                                    } else {
                                        tL_username = org.telegram.messenger.o5.b(Z14.username, arrayList3);
                                        str5 = Z14.username;
                                    }
                                    ArrayList arrayList4 = Z14 == null ? new ArrayList() : new ArrayList(Z14.usernames);
                                    if (TextUtils.isEmpty(str5)) {
                                        int i109 = 0;
                                        while (true) {
                                            if (i109 < arrayList4.size()) {
                                                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList4.get(i109);
                                                if (tL_username2 == null || !tL_username2.active || TextUtils.isEmpty(tL_username2.username)) {
                                                    i109++;
                                                } else {
                                                    str5 = tL_username2.username;
                                                    tL_username = tL_username2;
                                                }
                                            }
                                        }
                                    }
                                    String K04 = org.telegram.messenger.cd.K0(2131743700);
                                    if (str5 != null) {
                                        String concat = "@".concat(str5);
                                        if (tL_username == null || tL_username.editable) {
                                            str7 = concat;
                                        } else {
                                            SpannableString spannableString = new SpannableString(concat);
                                            HashMap hashMap = this.d;
                                            ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                                            if (clickableSpan == null) {
                                                qx0 qx0Var = new qx0(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, qx0Var);
                                                clickableSpan = qx0Var;
                                            }
                                            spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                                            str7 = spannableString;
                                        }
                                    } else {
                                        str7 = "—";
                                    }
                                    z10 = !profileActivity.r1;
                                    ArrayList arrayList5 = arrayList4;
                                    str3 = str7;
                                    arrayList3 = arrayList5;
                                    str4 = K04;
                                } else {
                                    chat3 = profileActivity.D2;
                                    if (chat3 != null) {
                                        org.telegram.messenger.vp messagesController5 = profileActivity.getMessagesController();
                                        j11 = profileActivity.e1;
                                        TLRPC.Chat L0 = messagesController5.L0(Long.valueOf(j11));
                                        String K = org.telegram.messenger.w3.K(L0, false);
                                        if (L0 != null) {
                                            arrayList3.addAll(L0.usernames);
                                        }
                                        if (org.telegram.messenger.w3.t0(L0)) {
                                            z11 = !profileActivity.r1;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(profileActivity.getMessagesController().U2);
                                            sb2.append("/");
                                            sb2.append(K);
                                            j15 = profileActivity.f1;
                                            String str15 = str13;
                                            if (j15 != 0) {
                                                StringBuilder sb3 = new StringBuilder("/");
                                                j16 = profileActivity.f1;
                                                sb3.append(j16);
                                                str15 = sb3.toString();
                                            }
                                            sb2.append(str15);
                                            str6 = sb2.toString();
                                            str4 = org.telegram.messenger.cd.K0(2131749159);
                                        } else {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(profileActivity.getMessagesController().U2);
                                            sb4.append("/c/");
                                            j12 = profileActivity.e1;
                                            sb4.append(j12);
                                            j13 = profileActivity.f1;
                                            String str16 = str13;
                                            if (j13 != 0) {
                                                StringBuilder sb5 = new StringBuilder("/");
                                                j14 = profileActivity.f1;
                                                sb5.append(j14);
                                                str16 = sb5.toString();
                                            }
                                            sb4.append(str16);
                                            String sb6 = sb4.toString();
                                            str4 = org.telegram.messenger.cd.K0(2131749155);
                                            str6 = sb6;
                                            z11 = false;
                                        }
                                        str5 = K;
                                        z10 = z11;
                                        str3 = str6;
                                    } else {
                                        arrayList3 = new ArrayList();
                                        z10 = false;
                                        str3 = "";
                                        str4 = str3;
                                        str5 = null;
                                    }
                                }
                                CharSequence E = E(str5, arrayList3, str4);
                                i26 = profileActivity.E3;
                                z8Var.d(str3, E, i26 == -1 && !(!profileActivity.p1 && profileActivity.N3 == -1 && profileActivity.O3 == -1) && profileActivity.T2 < 0);
                            } else {
                                i21 = profileActivity.H3;
                                if (i10 == i21) {
                                    chatFull = profileActivity.t2;
                                    if (chatFull != null) {
                                        chatFull2 = profileActivity.t2;
                                        if (chatFull2.location instanceof TLRPC.TL_channelLocation) {
                                            chatFull3 = profileActivity.t2;
                                            z8Var.d(((TLRPC.TL_channelLocation) chatFull3.location).address, org.telegram.messenger.cd.K0(2131753961), false);
                                        }
                                    }
                                } else {
                                    i22 = profileActivity.S2;
                                    if (i10 == i22) {
                                        i25 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                                        TLRPC.User f7 = org.telegram.messenger.d20.i(i25).f();
                                        z8Var.d((f7 == null || (str2 = f7.phone) == null || str2.length() == 0) ? org.telegram.messenger.cd.K0(2131747848) : org.telegram.messenger.m5.h(new StringBuilder("+"), f7.phone, af.b.c()), org.telegram.messenger.cd.K0(2131744286), true);
                                        z8Var.setContentDescriptionValueFirst(false);
                                    } else {
                                        i23 = profileActivity.U2;
                                        if (i10 == i23) {
                                            i24 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                                            TLRPC.User f10 = org.telegram.messenger.d20.i(i24).f();
                                            String K05 = org.telegram.messenger.cd.K0(2131743700);
                                            if (f10 == null || f10.usernames.size() <= 0) {
                                                String n10 = org.telegram.messenger.h20.n(f10);
                                                if (f10 == null || TextUtils.isEmpty(n10)) {
                                                    K0 = org.telegram.messenger.cd.K0(2131743687);
                                                    charSequence = K05;
                                                } else {
                                                    K0 = sc.e.h("@", n10);
                                                    charSequence = K05;
                                                }
                                            } else {
                                                int i110 = 0;
                                                while (true) {
                                                    if (i110 < f10.usernames.size()) {
                                                        TLRPC.TL_username tL_username3 = f10.usernames.get(i110);
                                                        if (tL_username3 == null || !tL_username3.active || TextUtils.isEmpty(tL_username3.username)) {
                                                            i110++;
                                                        } else {
                                                            str = tL_username3.username;
                                                        }
                                                    } else {
                                                        str = null;
                                                    }
                                                }
                                                if (str == null) {
                                                    str = f10.username;
                                                }
                                                K0 = (str == null || TextUtils.isEmpty(str)) ? org.telegram.messenger.cd.K0(2131743687) : "@".concat(str);
                                                charSequence = E(str, f10.usernames, K05);
                                            }
                                            z8Var.d(K0, charSequence, true);
                                            z8Var.setContentDescriptionValueFirst(true);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z10 = false;
                }
                if (i108 != 0) {
                    Drawable c10 = f0.c.c(z8Var.getContext(), R.drawable.msg_input_gift);
                    int themedColor = profileActivity.getThemedColor(org.telegram.ui.ActionBar.t6.V6);
                    RectF rectF = ProfileActivity.R6;
                    c10.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
                    profileActivity.M6 = c10;
                    userFull = profileActivity.u2;
                    if (org.telegram.messenger.h20.b(userFull)) {
                        z8Var.setImage(null);
                        z8Var.setImageClickListener(null);
                    } else {
                        z8Var.b(c10, org.telegram.messenger.cd.K0(2131749689));
                        z8Var.setImageClickListener(new iv0(profileActivity, 12));
                    }
                } else if (z10) {
                    Drawable c11 = f0.c.c(z8Var.getContext(), R.drawable.header_qr_24);
                    int themedColor2 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.t6.v8);
                    RectF rectF2 = ProfileActivity.R6;
                    c11.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    profileActivity.N6 = c11;
                    z8Var.b(c11, org.telegram.messenger.cd.K0(2131750481));
                    z8Var.setImageClickListener(new iv0(profileActivity, 13));
                } else {
                    z8Var.setImage(null);
                    z8Var.setImageClickListener(null);
                }
                z8Var.setTag(Integer.valueOf(i10));
                z8Var.a.setLoading(profileActivity.i5);
                z8Var.b.setLoading(profileActivity.i5);
                break;
            case 3:
                org.telegram.ui.Cells.i iVar = (org.telegram.ui.Cells.i) view;
                i29 = profileActivity.I3;
                if (i10 == i29) {
                    userFull8 = profileActivity.u2;
                    if (userFull8.user != null) {
                        userFull12 = profileActivity.u2;
                        Z1 = userFull12.user;
                    } else {
                        org.telegram.messenger.vp messagesController6 = profileActivity.getMessagesController();
                        userFull9 = profileActivity.u2;
                        Z1 = messagesController6.Z1(Long.valueOf(userFull9.id));
                    }
                    z14 = profileActivity.q2;
                    if (!z14) {
                        if (Z1 != null && Z1.premium) {
                            userFull11 = profileActivity.u2;
                            break;
                        }
                        z15 = false;
                        userFull10 = profileActivity.u2;
                        iVar.f(userFull10.about, org.telegram.messenger.cd.K0(2131743791), z15);
                        break;
                    }
                    z15 = true;
                    userFull10 = profileActivity.u2;
                    iVar.f(userFull10.about, org.telegram.messenger.cd.K0(2131743791), z15);
                } else if (i10 == profileActivity.J3) {
                    chatFull4 = profileActivity.t2;
                    String str17 = chatFull4.about;
                    while (str17.contains("\n\n\n")) {
                        str17 = str17.replace("\n\n\n", "\n\n");
                    }
                    String K06 = org.telegram.messenger.cd.K0(2131751460);
                    chat4 = profileActivity.D2;
                    if (org.telegram.messenger.w3.T(chat4)) {
                        chat5 = profileActivity.D2;
                        if (!chat5.megagroup) {
                            z13 = true;
                            iVar.f(str17, K06, z13);
                            break;
                        }
                    }
                    z13 = false;
                    iVar.f(str17, K06, z13);
                } else {
                    i30 = profileActivity.V2;
                    if (i10 == i30) {
                        userFull2 = profileActivity.u2;
                        if (userFull2 != null) {
                            userFull7 = profileActivity.u2;
                            if (TextUtils.isEmpty(userFull7.about)) {
                                iVar.f(org.telegram.messenger.cd.K0(2131743791), org.telegram.messenger.cd.K0(2131743790), false);
                                profileActivity.y2 = null;
                                iVar.setMoreButtonDisabled(true);
                                break;
                            }
                        }
                        userFull3 = profileActivity.u2;
                        if (userFull3 == null) {
                            str9 = org.telegram.messenger.cd.K0(2131748789);
                        } else {
                            userFull4 = profileActivity.u2;
                            str9 = userFull4.about;
                        }
                        iVar.f(str9, org.telegram.messenger.cd.K0(2131743791), profileActivity.getUserConfig().q());
                        userFull5 = profileActivity.u2;
                        if (userFull5 != null) {
                            userFull6 = profileActivity.u2;
                            str10 = userFull6.about;
                        } else {
                            str10 = null;
                        }
                        profileActivity.y2 = str10;
                        iVar.setMoreButtonDisabled(true);
                    }
                }
                break;
            case 4:
            case 18:
            case 24:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                int i111 = org.telegram.ui.ActionBar.t6.m6;
                int i112 = org.telegram.ui.ActionBar.t6.G6;
                p8Var.g(i111, i112);
                p8Var.setTag(Integer.valueOf(i112));
                i31 = profileActivity.p4;
                if (i10 == i31) {
                    int i113 = profileActivity.getMessagesController().Z0(Integer.valueOf(org.telegram.messenger.o5.h(profileActivity.h1))).ttl;
                    p8Var.q(org.telegram.messenger.cd.K0(2131748602), i113 == 0 ? org.telegram.messenger.cd.K0(2131745379) : org.telegram.messenger.cd.c0(i113), false, false);
                } else {
                    i32 = profileActivity.K4;
                    if (i10 == i32) {
                        p8Var.k(org.telegram.messenger.cd.K0(2131743936), false);
                        p8Var.g(-1, org.telegram.ui.ActionBar.t6.p7);
                    } else {
                        i33 = profileActivity.q4;
                        if (i10 == i33) {
                            org.telegram.ui.Components.v30 v30Var = new org.telegram.ui.Components.v30();
                            TLRPC.EncryptedChat Z0 = profileActivity.getMessagesController().Z0(Integer.valueOf(org.telegram.messenger.o5.h(profileActivity.h1)));
                            byte[] bArr = Z0.key_hash;
                            v30Var.a = bArr;
                            if (bArr == null) {
                                byte[] bArr2 = Z0.auth_key;
                                Typeface typeface = org.telegram.messenger.i0.a;
                                byte[] bArr3 = new byte[16];
                                System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                                v30Var.a = bArr3;
                                Z0.key_hash = bArr3;
                            }
                            v30Var.invalidateSelf();
                            p8Var.v(org.telegram.messenger.cd.K0(2131751133), v30Var, false);
                        } else {
                            i34 = profileActivity.L4;
                            if (i10 == i34) {
                                p8Var.g(-1, org.telegram.ui.ActionBar.t6.o6);
                                chat10 = profileActivity.D2;
                                if (chat10.megagroup) {
                                    p8Var.k(org.telegram.messenger.cd.K0(2131746676), false);
                                } else {
                                    p8Var.k(org.telegram.messenger.cd.K0(2131746677), false);
                                }
                            } else {
                                i35 = profileActivity.w4;
                                if (i10 == i35) {
                                    chatFull12 = profileActivity.t2;
                                    if (chatFull12 != null) {
                                        chat8 = profileActivity.D2;
                                        if (org.telegram.messenger.w3.T(chat8)) {
                                            chat9 = profileActivity.D2;
                                            if (!chat9.megagroup) {
                                                String K07 = org.telegram.messenger.cd.K0(2131752289);
                                                chatFull14 = profileActivity.t2;
                                                String E2 = org.telegram.messenger.cd.E(chatFull14.participants_count, ',');
                                                i93 = profileActivity.G4;
                                                p8Var.s(K07, E2, R.drawable.msg_groups, i10 != i93 - 1);
                                            }
                                        }
                                        String K08 = org.telegram.messenger.cd.K0(2131752377);
                                        chatFull13 = profileActivity.t2;
                                        String E3 = org.telegram.messenger.cd.E(chatFull13.participants_count, ',');
                                        i92 = profileActivity.G4;
                                        p8Var.s(K08, E3, R.drawable.msg_groups, i10 != i92 - 1);
                                    } else {
                                        chat6 = profileActivity.D2;
                                        if (org.telegram.messenger.w3.T(chat6)) {
                                            chat7 = profileActivity.D2;
                                            if (!chat7.megagroup) {
                                                String K09 = org.telegram.messenger.cd.K0(2131752289);
                                                i91 = profileActivity.G4;
                                                p8Var.o(R.drawable.msg_groups, K09, i10 != i91 - 1);
                                            }
                                        }
                                        String K010 = org.telegram.messenger.cd.K0(2131752377);
                                        i90 = profileActivity.G4;
                                        p8Var.o(R.drawable.msg_groups, K010, i10 != i90 - 1);
                                    }
                                } else {
                                    i36 = profileActivity.x4;
                                    if (i10 == i36) {
                                        chatFull10 = profileActivity.t2;
                                        if (chatFull10 != null) {
                                            String K011 = org.telegram.messenger.cd.K0(2131744462);
                                            chatFull11 = profileActivity.t2;
                                            String format = String.format("%d", Integer.valueOf(chatFull11.requests_pending));
                                            i89 = profileActivity.G4;
                                            p8Var.s(K011, format, R.drawable.msg_requests, i10 != i89 - 1);
                                        }
                                    } else {
                                        i37 = profileActivity.y4;
                                        if (i10 == i37) {
                                            chatFull8 = profileActivity.t2;
                                            if (chatFull8 != null) {
                                                String K012 = org.telegram.messenger.cd.K0(2131752517);
                                                chatFull9 = profileActivity.t2;
                                                String format2 = String.format("%d", Integer.valueOf(chatFull9.admins_count));
                                                i88 = profileActivity.G4;
                                                p8Var.s(K012, format2, R.drawable.msg_admins, i10 != i88 - 1);
                                            } else {
                                                String K013 = org.telegram.messenger.cd.K0(2131752517);
                                                i87 = profileActivity.G4;
                                                p8Var.o(R.drawable.msg_admins, K013, i10 != i87 - 1);
                                            }
                                        } else {
                                            i38 = profileActivity.z4;
                                            if (i10 == i38) {
                                                String K014 = org.telegram.messenger.cd.K0(2131752519);
                                                i86 = profileActivity.G4;
                                                p8Var.o(R.drawable.msg_customize, K014, i10 != i86 - 1);
                                            } else {
                                                i39 = profileActivity.C4;
                                                if (i10 == i39) {
                                                    i84 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                                                    rh.r g10 = rh.r.g(i84);
                                                    j24 = profileActivity.e1;
                                                    TL_stars.StarsAmount c12 = g10.c(-j24);
                                                    i85 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                                                    rh.r g11 = rh.r.g(i85);
                                                    j25 = profileActivity.e1;
                                                    long i114 = g11.i(-j25);
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                    if (i114 > 0) {
                                                        double d10 = i114 / 1.0E9d;
                                                        if (d10 > 1000.0d) {
                                                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.i0.o0((int) d10, 0));
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
                                                    if (c12.amount > 0) {
                                                        if (spannableStringBuilder.length() > 0) {
                                                            spannableStringBuilder.append((CharSequence) " ");
                                                        }
                                                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) rh.h8.M0(c12, 0.777f, ' '));
                                                    }
                                                    p8Var.s(org.telegram.messenger.cd.K0(2131752290), le.K(rh.h8.Z0(false, spannableStringBuilder, 0.7f, null), p8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                                                } else {
                                                    i40 = profileActivity.A4;
                                                    if (i10 == i40) {
                                                        i83 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                                                        rh.r g12 = rh.r.g(i83);
                                                        j23 = profileActivity.d1;
                                                        TL_stars.StarsAmount c13 = g12.c(j23);
                                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                        if (c13.amount > 0) {
                                                            spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) rh.h8.M0(c13, 0.777f, ' '));
                                                        }
                                                        p8Var.s(org.telegram.messenger.cd.K0(2131753111), le.K(rh.h8.Z0(false, spannableStringBuilder2, 0.7f, null), p8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                                                    } else {
                                                        i41 = profileActivity.B4;
                                                        if (i10 == i41) {
                                                            i82 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                                                            rh.r g13 = rh.r.g(i82);
                                                            j22 = profileActivity.d1;
                                                            long i115 = g13.i(j22);
                                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                            if (i115 > 0) {
                                                                double d11 = i115 / 1.0E9d;
                                                                if (d11 > 1000.0d) {
                                                                    spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.i0.o0((int) d11, 0));
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
                                                            p8Var.s(org.telegram.messenger.cd.K0(2131753110), le.K(rh.h8.Z0(false, spannableStringBuilder3, 0.7f, null), p8Var.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                                                        } else {
                                                            i42 = profileActivity.F4;
                                                            if (i10 == i42) {
                                                                chatFull5 = profileActivity.t2;
                                                                if (chatFull5 != null) {
                                                                    String K015 = org.telegram.messenger.cd.K0(2131752453);
                                                                    chatFull6 = profileActivity.t2;
                                                                    int i116 = chatFull6.banned_count;
                                                                    chatFull7 = profileActivity.t2;
                                                                    String format3 = String.format("%d", Integer.valueOf(Math.max(i116, chatFull7.kicked_count)));
                                                                    i81 = profileActivity.G4;
                                                                    p8Var.s(K015, format3, R.drawable.msg_user_remove, i10 != i81 - 1);
                                                                } else {
                                                                    String K016 = org.telegram.messenger.cd.K0(2131752453);
                                                                    i80 = profileActivity.G4;
                                                                    p8Var.o(R.drawable.msg_user_remove, K016, i10 != i80 - 1);
                                                                }
                                                            } else {
                                                                i43 = profileActivity.v4;
                                                                if (i10 == i43) {
                                                                    p8Var.g(i111, i112);
                                                                    int i117 = i10 + 1;
                                                                    boolean z32 = i117 >= profileActivity.t4 && i117 < profileActivity.u4;
                                                                    String K017 = org.telegram.messenger.cd.K0(2131754401);
                                                                    i79 = profileActivity.G4;
                                                                    p8Var.o(R.drawable.msg_contact_add, K017, i79 == -1 || z32);
                                                                } else {
                                                                    i44 = profileActivity.T3;
                                                                    if (i10 == i44) {
                                                                        p8Var.k(org.telegram.messenger.cd.K0(2131745616), true);
                                                                    } else {
                                                                        i45 = profileActivity.Y3;
                                                                        if (i10 == i45) {
                                                                            p8Var.o(R.drawable.msg_contact_add, org.telegram.messenger.cd.K0(2131754377), false);
                                                                            p8Var.g(i111, i112);
                                                                        } else {
                                                                            i46 = profileActivity.V3;
                                                                            if (i10 == i46) {
                                                                                p8Var.o(R.drawable.menu_reaction_delete_24, org.telegram.messenger.cd.K0(2131751508), false);
                                                                                p8Var.g(org.telegram.ui.ActionBar.t6.q7, org.telegram.ui.ActionBar.t6.p7);
                                                                            } else {
                                                                                i47 = profileActivity.W3;
                                                                                if (i10 == i47) {
                                                                                    org.telegram.messenger.vp messagesController7 = profileActivity.getMessagesController();
                                                                                    j21 = profileActivity.a5;
                                                                                    TLRPC.Chat L02 = messagesController7.L0(Long.valueOf(-j21));
                                                                                    if (L02 == null || !org.telegram.messenger.w3.w(2, L02)) {
                                                                                        p8Var.o(R.drawable.msg_report, org.telegram.messenger.cd.K0(2131746228), false);
                                                                                    } else {
                                                                                        p8Var.o(R.drawable.msg_block2, org.telegram.messenger.cd.K0(2131746227), false);
                                                                                    }
                                                                                    p8Var.g(org.telegram.ui.ActionBar.t6.q7, org.telegram.ui.ActionBar.t6.p7);
                                                                                } else {
                                                                                    i48 = profileActivity.U3;
                                                                                    if (i10 == i48) {
                                                                                        p8Var.k(org.telegram.messenger.cd.K0(2131746203), false);
                                                                                        int i118 = org.telegram.ui.ActionBar.t6.p7;
                                                                                        p8Var.g(-1, i118);
                                                                                        p8Var.g(-1, i118);
                                                                                    } else {
                                                                                        i49 = profileActivity.f3;
                                                                                        if (i10 == i49) {
                                                                                            p8Var.u(org.telegram.messenger.cd.K0(2131749064), org.telegram.messenger.cd.j0(), false, R.drawable.msg2_language, false);
                                                                                            p8Var.setImageLeft(23);
                                                                                        } else {
                                                                                            i50 = profileActivity.e3;
                                                                                            if (i10 == i50) {
                                                                                                p8Var.o(R.drawable.msg2_notifications, org.telegram.messenger.cd.K0(2131747938), true);
                                                                                            } else {
                                                                                                i51 = profileActivity.g3;
                                                                                                if (i10 == i51) {
                                                                                                    p8Var.o(R.drawable.msg2_secret, org.telegram.messenger.cd.K0(2131746786), true);
                                                                                                } else {
                                                                                                    i52 = profileActivity.h3;
                                                                                                    if (i10 == i52) {
                                                                                                        p8Var.o(R.drawable.msg2_data, org.telegram.messenger.cd.K0(2131751678), true);
                                                                                                    } else {
                                                                                                        i53 = profileActivity.i3;
                                                                                                        if (i10 == i53) {
                                                                                                            p8Var.o(R.drawable.msg2_discussion, org.telegram.messenger.cd.K0(2131752210), true);
                                                                                                        } else {
                                                                                                            i54 = profileActivity.j3;
                                                                                                            if (i10 == i54) {
                                                                                                                p8Var.o(R.drawable.msg2_folder, org.telegram.messenger.cd.K0(2131750697), true);
                                                                                                            } else {
                                                                                                                i55 = profileActivity.l3;
                                                                                                                if (i10 == i55) {
                                                                                                                    p8Var.o(R.drawable.msg2_sticker, org.telegram.messenger.cd.K0(2131744875), true);
                                                                                                                } else {
                                                                                                                    i56 = profileActivity.k3;
                                                                                                                    if (i10 == i56) {
                                                                                                                        p8Var.o(R.drawable.msg2_battery, org.telegram.messenger.cd.K0(2131747081), true);
                                                                                                                    } else {
                                                                                                                        i57 = profileActivity.p3;
                                                                                                                        if (i10 == i57) {
                                                                                                                            p8Var.o(R.drawable.msg2_ask_question, org.telegram.messenger.cd.K0(2131753986), true);
                                                                                                                        } else {
                                                                                                                            i58 = profileActivity.q3;
                                                                                                                            if (i10 == i58) {
                                                                                                                                p8Var.o(R.drawable.msg2_help, org.telegram.messenger.cd.K0(2131744267), true);
                                                                                                                            } else {
                                                                                                                                i59 = profileActivity.r3;
                                                                                                                                if (i10 == i59) {
                                                                                                                                    p8Var.o(R.drawable.msg2_policy, org.telegram.messenger.cd.K0(2131746798), false);
                                                                                                                                } else {
                                                                                                                                    i60 = profileActivity.u3;
                                                                                                                                    if (i10 == i60) {
                                                                                                                                        p8Var.k(org.telegram.messenger.cd.K0(2131751614), true);
                                                                                                                                    } else {
                                                                                                                                        i61 = profileActivity.v3;
                                                                                                                                        if (i10 == i61) {
                                                                                                                                            p8Var.k(org.telegram.messenger.cd.K0(2131751615), true);
                                                                                                                                        } else {
                                                                                                                                            i62 = profileActivity.w3;
                                                                                                                                            if (i10 == i62) {
                                                                                                                                                p8Var.k(org.telegram.messenger.cd.K0(2131751651), profileActivity.x3 != -1);
                                                                                                                                            } else if (i10 == profileActivity.x3) {
                                                                                                                                                p8Var.k("Switch Backend", false);
                                                                                                                                            } else {
                                                                                                                                                i63 = profileActivity.m3;
                                                                                                                                                if (i10 == i63) {
                                                                                                                                                    p8Var.o(R.drawable.msg2_devices, org.telegram.messenger.cd.K0(2131751456), true);
                                                                                                                                                } else {
                                                                                                                                                    i64 = profileActivity.N2;
                                                                                                                                                    if (i10 == i64) {
                                                                                                                                                        profileActivity.V.P(86);
                                                                                                                                                        profileActivity.V.L();
                                                                                                                                                        p8Var.p(org.telegram.messenger.cd.K0(2131745533), profileActivity.V, false);
                                                                                                                                                        p8Var.g(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                                                                                                                                                        p8Var.getImageView().setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
                                                                                                                                                        p8Var.setImageLeft(12);
                                                                                                                                                        profileActivity.L2 = p8Var;
                                                                                                                                                    } else {
                                                                                                                                                        i65 = profileActivity.Z3;
                                                                                                                                                        if (i10 == i65) {
                                                                                                                                                            p8Var.o(R.drawable.msg_groups_create, org.telegram.messenger.cd.K0(2131754372), false);
                                                                                                                                                        } else {
                                                                                                                                                            i66 = profileActivity.b4;
                                                                                                                                                            if (i10 == i66) {
                                                                                                                                                                p8Var.p(org.telegram.messenger.cd.K0(2131744256), new org.telegram.ui.Components.e5(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), (kg.j1) ea.f.d().g), true);
                                                                                                                                                                p8Var.setImageLeft(23);
                                                                                                                                                            } else {
                                                                                                                                                                i67 = profileActivity.c4;
                                                                                                                                                                if (i10 == i67) {
                                                                                                                                                                    i78 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                                                                                                                                                                    rh.e6 w9 = rh.e6.w(i78);
                                                                                                                                                                    long j36 = w9.p().amount;
                                                                                                                                                                    String K018 = org.telegram.messenger.cd.K0(2131748619);
                                                                                                                                                                    CharSequence charSequence2 = str13;
                                                                                                                                                                    if (w9.e) {
                                                                                                                                                                        charSequence2 = str13;
                                                                                                                                                                        if (j36 > 0) {
                                                                                                                                                                            charSequence2 = rh.h8.L0(w9.p(), 0.85f, ' ');
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    p8Var.t(K018, charSequence2, new org.telegram.ui.Components.e5(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), (kg.j1) ea.f.d().i), true);
                                                                                                                                                                    p8Var.setImageLeft(23);
                                                                                                                                                                } else {
                                                                                                                                                                    i68 = profileActivity.d4;
                                                                                                                                                                    if (i10 == i68) {
                                                                                                                                                                        i77 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                                                                                                                                                                        rh.e6 L = rh.e6.L(i77);
                                                                                                                                                                        long j37 = L.p().amount;
                                                                                                                                                                        String K019 = org.telegram.messenger.cd.K0(2131748315);
                                                                                                                                                                        CharSequence charSequence3 = str13;
                                                                                                                                                                        if (L.e) {
                                                                                                                                                                            charSequence3 = str13;
                                                                                                                                                                            if (j37 > 0) {
                                                                                                                                                                                charSequence3 = rh.h8.L0(L.p(), 0.85f, ' ');
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        p8Var.s(K019, charSequence3, R.drawable.settings_gram_24, true);
                                                                                                                                                                        p8Var.setImageLeft(23);
                                                                                                                                                                    } else {
                                                                                                                                                                        i69 = profileActivity.e4;
                                                                                                                                                                        if (i10 == i69) {
                                                                                                                                                                            p8Var.o(R.drawable.menu_shop, org.telegram.messenger.cd.K0(2131744277), true);
                                                                                                                                                                            p8Var.setImageLeft(23);
                                                                                                                                                                        } else {
                                                                                                                                                                            i70 = profileActivity.f4;
                                                                                                                                                                            if (i10 == i70) {
                                                                                                                                                                                p8Var.o(R.drawable.menu_gift, org.telegram.messenger.cd.K0(2131745656), false);
                                                                                                                                                                                p8Var.setImageLeft(23);
                                                                                                                                                                            } else {
                                                                                                                                                                                i71 = profileActivity.botPermissionLocation;
                                                                                                                                                                                if (i10 == i71) {
                                                                                                                                                                                    String K020 = org.telegram.messenger.cd.K0(2131753007);
                                                                                                                                                                                    xh.o0 o0Var = profileActivity.r2;
                                                                                                                                                                                    boolean z33 = o0Var != null && o0Var.g();
                                                                                                                                                                                    int themedColor3 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.t6.ik);
                                                                                                                                                                                    i76 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    p8Var.m(K020, z33, R.drawable.filled_access_location, themedColor3, i76 != -1);
                                                                                                                                                                                } else {
                                                                                                                                                                                    i72 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                    if (i10 == i72) {
                                                                                                                                                                                        String K021 = org.telegram.messenger.cd.K0(2131753009);
                                                                                                                                                                                        xh.n nVar = profileActivity.s2;
                                                                                                                                                                                        p8Var.m(K021, nVar != null && nVar.g(), R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(org.telegram.ui.ActionBar.t6.lk), false);
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i73 = profileActivity.botPermissionEmojiStatus;
                                                                                                                                                                                        if (i10 == i73) {
                                                                                                                                                                                            String K022 = org.telegram.messenger.cd.K0(2131753008);
                                                                                                                                                                                            userFull13 = profileActivity.u2;
                                                                                                                                                                                            if (userFull13 != null) {
                                                                                                                                                                                                userFull14 = profileActivity.u2;
                                                                                                                                                                                                if (userFull14.bot_can_manage_emoji_status) {
                                                                                                                                                                                                    z16 = true;
                                                                                                                                                                                                    int themedColor4 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.t6.gk);
                                                                                                                                                                                                    i74 = profileActivity.botPermissionLocation;
                                                                                                                                                                                                    if (i74 == -1) {
                                                                                                                                                                                                        i75 = profileActivity.botPermissionBiometry;
                                                                                                                                                                                                        if (i75 == -1) {
                                                                                                                                                                                                            z17 = false;
                                                                                                                                                                                                            p8Var.m(K022, z16, R.drawable.filled_access_sleeping, themedColor4, z17);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    z17 = true;
                                                                                                                                                                                                    p8Var.m(K022, z16, R.drawable.filled_access_sleeping, themedColor4, z17);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            z16 = false;
                                                                                                                                                                                            int themedColor42 = profileActivity.getThemedColor(org.telegram.ui.ActionBar.t6.gk);
                                                                                                                                                                                            i74 = profileActivity.botPermissionLocation;
                                                                                                                                                                                            if (i74 == -1) {
                                                                                                                                                                                            }
                                                                                                                                                                                            z17 = true;
                                                                                                                                                                                            p8Var.m(K022, z16, R.drawable.filled_access_sleeping, themedColor42, z17);
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
                        }
                    }
                }
                org.telegram.ui.ActionBar.a7.Z(p8Var.c, org.telegram.ui.ActionBar.t6.I6, profileActivity.z0);
                break;
            case 6:
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) view;
                i94 = profileActivity.M3;
                if (i10 == i94) {
                    i95 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                    SharedPreferences w12 = org.telegram.messenger.vp.w1(i95);
                    long j38 = profileActivity.h1;
                    if (j38 == 0) {
                        j27 = profileActivity.d1;
                        if (j27 != 0) {
                            j38 = profileActivity.d1;
                        } else {
                            j28 = profileActivity.e1;
                            j38 = -j28;
                        }
                    }
                    j26 = profileActivity.f1;
                    String v = org.telegram.messenger.ot.v(j38, j26, false);
                    boolean z34 = w12.getBoolean("custom_" + v, false);
                    boolean contains = w12.contains("notify2_" + v);
                    int c14 = org.telegram.messenger.m5.c("notify2_", v, w12, 0);
                    int c15 = org.telegram.messenger.m5.c("notifyuntil_", v, w12, 0);
                    if (c14 == 3 && c15 != Integer.MAX_VALUE) {
                        int currentTime = c15 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str11 = z34 ? org.telegram.messenger.cd.K0(2131747934) : org.telegram.messenger.cd.K0(2131747908);
                            z19 = true;
                        } else {
                            if (currentTime < 3600) {
                                Y = org.telegram.messenger.cd.Y(2131742890, "WillUnmuteIn", org.telegram.messenger.cd.G(currentTime / 60, "Minutes", new Object[0]));
                            } else if (currentTime < 86400) {
                                Y = org.telegram.messenger.cd.Y(2131742890, "WillUnmuteIn", org.telegram.messenger.cd.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                            } else if (currentTime < 31536000) {
                                Y = org.telegram.messenger.cd.Y(2131742890, "WillUnmuteIn", org.telegram.messenger.cd.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                            } else {
                                z19 = false;
                                str11 = null;
                            }
                            str11 = Y;
                            z19 = false;
                        }
                    } else if (c14 == 0) {
                        if (!contains) {
                            notificationsController = profileActivity.getNotificationsController();
                            z18 = notificationsController.C(j38);
                            if (z18 || !z34) {
                                K03 = !z18 ? org.telegram.messenger.cd.K0(2131747908) : org.telegram.messenger.cd.K0(2131747910);
                            } else {
                                K03 = org.telegram.messenger.cd.K0(2131747934);
                            }
                            String str18 = K03;
                            z19 = z18;
                            str11 = str18;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        K03 = !z18 ? org.telegram.messenger.cd.K0(2131747908) : org.telegram.messenger.cd.K0(2131747910);
                        String str182 = K03;
                        z19 = z18;
                        str11 = str182;
                    } else {
                        if (c14 != 1) {
                            z18 = false;
                            if (z18) {
                            }
                            K03 = !z18 ? org.telegram.messenger.cd.K0(2131747908) : org.telegram.messenger.cd.K0(2131747910);
                            String str1822 = K03;
                            z19 = z18;
                            str11 = str1822;
                        }
                        z18 = true;
                        if (z18) {
                        }
                        K03 = !z18 ? org.telegram.messenger.cd.K0(2131747908) : org.telegram.messenger.cd.K0(2131747910);
                        String str18222 = K03;
                        z19 = z18;
                        str11 = str18222;
                    }
                    if (str11 == null) {
                        str11 = org.telegram.messenger.cd.K0(2131747910);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        str11 = String.format(Locale.US, org.telegram.messenger.cd.J0(hashSet.size(), "NotificationTopicExceptionsDesctription"), str11, Integer.valueOf(hashSet.size()));
                    }
                    z20 = profileActivity.l5;
                    l5Var.setAnimationsEnabled(z20);
                    l5Var.b(org.telegram.messenger.cd.K0(2131747940), str11, 0, z19, 0, false, profileActivity.h4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i10));
                break;
            case 8:
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                try {
                    chatParticipant = !arrayList2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) arrayList2.get(i10 - profileActivity.t4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i10 - profileActivity.t4);
                } catch (Exception e) {
                    org.telegram.messenger.f8.f(e);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str19 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str19)) {
                                str19 = org.telegram.messenger.cd.K0(2131752423);
                            }
                            z26 = true;
                            z27 = true;
                            z25 = false;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str19)) {
                                str19 = org.telegram.messenger.cd.K0(2131752520);
                            }
                            z25 = channelParticipant.promoted_by == profileActivity.getUserConfig().e();
                            z26 = true;
                            z27 = false;
                        } else {
                            z25 = false;
                            z26 = false;
                            z27 = false;
                        }
                        z21 = z25;
                        z22 = z26;
                        z23 = z27;
                        str12 = str19;
                    } else {
                        String str20 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = org.telegram.messenger.cd.K0(2131752423);
                            }
                            str12 = str20;
                            z22 = true;
                            z23 = true;
                            z21 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str20)) {
                                str20 = org.telegram.messenger.cd.K0(2131752520);
                            }
                            z21 = chatParticipant.inviter_id == profileActivity.getUserConfig().e();
                            str12 = str20;
                            z22 = true;
                            z23 = false;
                        } else {
                            str12 = str20;
                            z21 = false;
                            z22 = false;
                            z23 = false;
                        }
                    }
                    final TLRPC.User Z15 = profileActivity.getMessagesController().Z1(Long.valueOf(chatParticipant.user_id));
                    if (org.telegram.messenger.h20.B(Z15)) {
                        org.telegram.messenger.vp messagesController8 = profileActivity.getMessagesController();
                        j29 = profileActivity.e1;
                        if (org.telegram.messenger.w3.h(messagesController8.L0(Long.valueOf(j29)))) {
                            z24 = true;
                            final String str21 = str12;
                            final boolean z35 = z22;
                            final boolean z36 = z23;
                            paVar.a(str12, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.mx0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i119;
                                    org.telegram.ui.ActionBar.p6 p6Var;
                                    ProfileActivity profileActivity2 = xx0.this.e;
                                    Activity parentActivity = profileActivity2.getParentActivity();
                                    i119 = ((org.telegram.ui.ActionBar.k2) profileActivity2).currentAccount;
                                    long a10 = profileActivity2.a();
                                    p6Var = ((org.telegram.ui.ActionBar.k2) profileActivity2).resourceProvider;
                                    org.telegram.ui.Components.iz0.b(parentActivity, i119, a10, Z15, str21, z35, z36, z21, p6Var);
                                }
                            });
                            paVar.e(Z15, i10 != profileActivity.u4 - 1);
                            break;
                        }
                    }
                    z24 = false;
                    final String str212 = str12;
                    final boolean z352 = z22;
                    final boolean z362 = z23;
                    paVar.a(str12, z22, z23, z24, new View.OnClickListener() { // from class: org.telegram.ui.mx0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i119;
                            org.telegram.ui.ActionBar.p6 p6Var;
                            ProfileActivity profileActivity2 = xx0.this.e;
                            Activity parentActivity = profileActivity2.getParentActivity();
                            i119 = ((org.telegram.ui.ActionBar.k2) profileActivity2).currentAccount;
                            long a10 = profileActivity2.a();
                            p6Var = ((org.telegram.ui.ActionBar.k2) profileActivity2).resourceProvider;
                            org.telegram.ui.Components.iz0.b(parentActivity, i119, a10, Z15, str212, z352, z362, z21, p6Var);
                        }
                    });
                    paVar.e(Z15, i10 != profileActivity.u4 - 1);
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                org.telegram.ui.Cells.b7 b7Var = (org.telegram.ui.Cells.b7) view;
                i96 = profileActivity.b3;
                if (i10 != i96) {
                    i97 = profileActivity.Z2;
                    if (i10 != i97) {
                        i98 = profileActivity.X2;
                        if (i10 == i98) {
                            b7Var.setType(2);
                            break;
                        }
                    } else {
                        b7Var.setType(0);
                        break;
                    }
                } else {
                    b7Var.setType(1);
                    break;
                }
                break;
            case 17:
                ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.cd.K0(2131753154));
                break;
            case 20:
                String K023 = org.telegram.messenger.cd.K0(2131747940);
                org.telegram.messenger.vp messagesController9 = profileActivity.getMessagesController();
                long a10 = profileActivity.a();
                j30 = profileActivity.f1;
                ((org.telegram.ui.Cells.t8) view).f(K023, !messagesController9.p2(a10, j30), false);
                break;
            case 21:
                ag.l2 l2Var = (ag.l2) view;
                userFull15 = profileActivity.u2;
                if (userFull15 != null) {
                    userFull16 = profileActivity.u2;
                    tL_businessLocation = userFull16.business_location;
                }
                l2Var.a(tL_businessLocation, profileActivity.L3 < 0 && !profileActivity.r1);
                break;
            case 22:
                ag.k2 k2Var = (ag.k2) view;
                k2Var.setOnTimezoneSwitchClick(new lx0(this, r9 ? 1 : 0));
                userFull17 = profileActivity.u2;
                if (userFull17 != null) {
                    userFull18 = profileActivity.u2;
                    tL_businessWorkHours = userFull18.business_work_hours;
                }
                z28 = profileActivity.N4;
                z29 = profileActivity.O4;
                if ((profileActivity.L3 >= 0 || profileActivity.r1) && profileActivity.O3 < 0) {
                    z30 = false;
                }
                k2Var.b(tL_businessWorkHours, z28, z29, z30);
                break;
            case 23:
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                org.telegram.messenger.vp messagesController10 = profileActivity.getMessagesController();
                userFull19 = profileActivity.u2;
                TLRPC.Chat L03 = messagesController10.L0(Long.valueOf(userFull19.personal_channel_id));
                org.telegram.ui.Cells.i6 i6Var = profileActivity.v2;
                j6Var.a(i6Var != null ? i6Var.d : null, L03);
                break;
            case 26:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setLinkTextRippleColor(null);
                i99 = profileActivity.Q3;
                if (i10 == i99) {
                    profileActivity.getMessagesController().d2(profileActivity.a());
                    userFull26 = profileActivity.u2;
                    if (userFull26 != null) {
                        userFull30 = profileActivity.u2;
                        botVerification = userFull30.bot_verification;
                    } else {
                        chatFull15 = profileActivity.t2;
                        if (chatFull15 != null) {
                            chatFull16 = profileActivity.t2;
                            botVerification = chatFull16.bot_verification;
                        } else {
                            botVerification = null;
                        }
                    }
                    userFull27 = profileActivity.u2;
                    if (userFull27 != null) {
                        userFull28 = profileActivity.u2;
                        if (TLObject.hasFlag(userFull28.flags2, 33554432)) {
                            userFull29 = profileActivity.u2;
                            l4 = Long.valueOf(userFull29.bot_manager_id);
                            if (profileActivity.h4 < 0 || botVerification != null || l4 != null) {
                                b9Var.setFixedSize(0);
                                org.telegram.messenger.vp messagesController11 = profileActivity.getMessagesController();
                                j32 = profileActivity.d1;
                                TLRPC.User Z16 = messagesController11.Z1(Long.valueOf(j32));
                                boolean z37 = Z16 == null && Z16.bot && Z16.bot_can_edit;
                                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                if (profileActivity.h4 >= 0) {
                                    spannableStringBuilder4.append(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.K0(z37 ? 2131746720 : 2131746722), new yv0(i107, this, z37)));
                                    if (botVerification != null || l4 != null) {
                                        spannableStringBuilder4.append("\n\n\n");
                                    }
                                }
                                if (botVerification == null) {
                                    spannableStringBuilder4.append("x");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.o5(botVerification.icon, b9Var.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    SpannableString spannableString2 = new SpannableString(org.telegram.messenger.jj.h0(botVerification.description, false));
                                    try {
                                        org.telegram.messenger.i0.c(spannableString2, 1, false, false);
                                        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class);
                                        while (i108 < uRLSpanArr.length) {
                                            URLSpan uRLSpan = uRLSpanArr[i108];
                                            int spanStart = spannableString2.getSpanStart(uRLSpan);
                                            int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                            String url = uRLSpan.getURL();
                                            spannableString2.removeSpan(uRLSpan);
                                            spannableString2.setSpan(new ox0(this, url, url), spanStart, spanEnd, 33);
                                            i108++;
                                        }
                                    } catch (Exception e7) {
                                        org.telegram.messenger.f8.f(e7);
                                    }
                                    spannableStringBuilder4.append((CharSequence) spannableString2);
                                } else if (l4 != null && (Z12 = profileActivity.getMessagesController().Z1(l4)) != null) {
                                    int length = spannableStringBuilder4.length();
                                    spannableStringBuilder4.append("</>");
                                    spannableStringBuilder4.setSpan(new org.telegram.ui.Components.dq(R.drawable.managed_bot), length, spannableStringBuilder4.length(), 33);
                                    spannableStringBuilder4.append(" ");
                                    spannableStringBuilder4.append(org.telegram.messenger.i0.Q2(org.telegram.messenger.cd.Z(2131746724, org.telegram.messenger.h20.n(Z12)), org.telegram.ui.ActionBar.t6.Uc, profileActivity.z0, new et0(18, this, l4)));
                                }
                                b9Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.t6.B6))));
                                b9Var.setText(spannableStringBuilder4);
                                break;
                            } else {
                                b9Var.setFixedSize(14);
                                b9Var.setText(null);
                                break;
                            }
                        }
                    }
                    l4 = null;
                    if (profileActivity.h4 < 0) {
                    }
                    b9Var.setFixedSize(0);
                    org.telegram.messenger.vp messagesController112 = profileActivity.getMessagesController();
                    j32 = profileActivity.d1;
                    TLRPC.User Z162 = messagesController112.Z1(Long.valueOf(j32));
                    if (Z162 == null) {
                    }
                    SpannableStringBuilder spannableStringBuilder42 = new SpannableStringBuilder();
                    if (profileActivity.h4 >= 0) {
                    }
                    if (botVerification == null) {
                    }
                    b9Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.t6.B6))));
                    b9Var.setText(spannableStringBuilder42);
                } else {
                    i100 = profileActivity.S3;
                    if (i10 == i100) {
                        org.telegram.messenger.vp messagesController12 = profileActivity.getMessagesController();
                        j31 = profileActivity.d1;
                        TLRPC.User Z17 = messagesController12.Z1(Long.valueOf(j31));
                        if (Z17 != null && Z17.bot && Z17.bot_can_edit) {
                            b9Var.setFixedSize(0);
                            String p5 = org.telegram.messenger.h20.p(Z17);
                            userFull23 = profileActivity.u2;
                            if (userFull23 != null) {
                                userFull24 = profileActivity.u2;
                                if (userFull24.starref_program != null) {
                                    userFull25 = profileActivity.u2;
                                    i102 = userFull25.starref_program.commission_permille;
                                    b9Var.setText(org.telegram.messenger.cd.Z(2131746727, p5, xh.i.I0(i102)));
                                    break;
                                }
                            }
                            i102 = 0;
                            b9Var.setText(org.telegram.messenger.cd.Z(2131746727, p5, xh.i.I0(i102)));
                        } else {
                            b9Var.setFixedSize(0);
                            String p9 = org.telegram.messenger.h20.p(Z17);
                            userFull20 = profileActivity.u2;
                            if (userFull20 != null) {
                                userFull21 = profileActivity.u2;
                                if (userFull21.starref_program != null) {
                                    userFull22 = profileActivity.u2;
                                    i101 = userFull22.starref_program.commission_permille;
                                    b9Var.setText(org.telegram.messenger.cd.Z(2131746728, p9, xh.i.I0(i101)));
                                    break;
                                }
                            }
                            i101 = 0;
                            b9Var.setText(org.telegram.messenger.cd.Z(2131746728, p9, xh.i.I0(i101)));
                        }
                    }
                }
                break;
            case 27:
                xh.f fVar = (xh.f) view;
                fVar.a(profileActivity.getThemedColor(org.telegram.ui.ActionBar.t6.ik), R.drawable.filled_affiliate, org.telegram.messenger.cd.K0(2131746729), null);
                userFull31 = profileActivity.u2;
                if (userFull31 != null) {
                    userFull32 = profileActivity.u2;
                    if (userFull32.starref_program != null) {
                        userFull33 = profileActivity.u2;
                        str14 = xh.i.I0(userFull33.starref_program.commission_permille);
                    }
                }
                fVar.setPercent(str14);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(10.0f));
                i103 = profileActivity.i4;
                if (i10 == i103) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(R.drawable.round_warn);
                    dqVar.d(org.telegram.messenger.i0.L(1.0f));
                    dqVar.y = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.kk, profileActivity.z0);
                    profileActivity.P6 = dqVar;
                    spannableStringBuilder5.setSpan(dqVar, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    org.telegram.messenger.vp messagesController13 = profileActivity.getMessagesController();
                    j33 = profileActivity.d1;
                    spannableStringBuilder5.append((CharSequence) org.telegram.messenger.cd.Z(2131746636, org.telegram.messenger.h20.k(messagesController13.Z1(Long.valueOf(j33)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                zh.c cVar = (zh.c) view;
                chat11 = profileActivity.D2;
                if (chat11 == null) {
                    j34 = profileActivity.d1;
                    if (j34 != 0) {
                        org.telegram.messenger.vp messagesController14 = profileActivity.getMessagesController();
                        j35 = profileActivity.d1;
                        TLRPC.User Z18 = messagesController14.Z1(Long.valueOf(j35));
                        if (Z18 != null) {
                            i104 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                            cVar.a(i104, profileActivity.getMessagesController().L0(Long.valueOf(Z18.linked_community_id)));
                            break;
                        }
                    }
                } else {
                    i105 = ((org.telegram.ui.ActionBar.k2) profileActivity).currentAccount;
                    org.telegram.messenger.vp messagesController15 = profileActivity.getMessagesController();
                    chat12 = profileActivity.D2;
                    cVar.a(i105, messagesController15.L0(Long.valueOf(chat12.linked_community_id)));
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10;
        View paVar;
        View view;
        View view2;
        boolean z11 = false;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i10) {
            case 1:
                paVar = new org.telegram.ui.Cells.p4(this.c, org.telegram.ui.ActionBar.t6.L6, 18, 7, false, profileActivity.z0);
                break;
            case 2:
            case 19:
            case org.telegram.messenger.zs.T /* 30 */:
                org.telegram.ui.ActionBar.p6 p6Var = profileActivity.z0;
                if (i10 == 30) {
                    z10 = false;
                    z11 = true;
                } else {
                    z10 = false;
                }
                rx0 rx0Var = new rx0(this, this.c, p6Var, z11, i10 == 19 ? true : z10);
                rx0Var.setContentDescriptionValueFirst(true);
                paVar = rx0Var;
                break;
            case 3:
                sx0 sx0Var = new sx0(this, context, profileActivity, profileActivity.z0);
                profileActivity.c6 = sx0Var;
                paVar = sx0Var;
                break;
            case 4:
                paVar = new ls(this, context, profileActivity.z0);
                break;
            case 5:
                View g3Var = new org.telegram.ui.Cells.g3(context, profileActivity.z0);
                g3Var.setPadding(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(4.0f), 0, 0);
                paVar = g3Var;
                break;
            case 6:
                paVar = new tx0(this, context, profileActivity.z0);
                break;
            case 7:
                paVar = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 8:
                paVar = new org.telegram.ui.Cells.pa(profileActivity.v4 == -1 ? 9 : 6, 0, this.c, profileActivity.z0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(10, context, profileActivity.z0);
                b9Var.getTextView().setGravity(1);
                org.telegram.ui.ActionBar.a7.V(b9Var.getTextView(), org.telegram.ui.ActionBar.t6.A6, profileActivity.z0);
                b9Var.getTextView().setMovementMethod(null);
                b9Var.setText(org.telegram.messenger.i0.D0());
                b9Var.getTextView().setPadding(0, org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f));
                paVar = b9Var;
                break;
            case 11:
            case org.telegram.messenger.zs.U /* 31 */:
                View x3Var = new org.telegram.ui.Cells.x3(context, org.telegram.messenger.i0.L(i10 == 31 ? 12.0f : 6.0f), 2);
                x3Var.setTag(-33024);
                view2 = x3Var;
                paVar = view2;
                break;
            case 12:
                View ux0Var = new ux0(this, context);
                ux0Var.setBackground(new ColorDrawable(0));
                ux0Var.setTag(-33024);
                view = ux0Var;
                paVar = view;
                break;
            case 13:
                if (profileActivity.N.getParent() != null) {
                    ((ViewGroup) profileActivity.N.getParent()).removeView(profileActivity.N);
                }
                View view3 = profileActivity.N;
                view3.setTag(-33024);
                view = view3;
                paVar = view;
                break;
            case 15:
                paVar = new wx0(this, context, profileActivity.z0);
                break;
            case 17:
                paVar = new org.telegram.ui.Cells.b9(context, profileActivity.z0);
                break;
            case 18:
            case 24:
                View b2Var = new kg.b2(i10 == 18 ? 0 : 1, context, profileActivity.z0);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, b2Var, profileActivity.z0);
                paVar = b2Var;
                break;
            case 20:
                paVar = new org.telegram.ui.Cells.t8(18, context, profileActivity.z0, false);
                break;
            case 21:
                View l2Var = new ag.l2(context, profileActivity.z0);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, l2Var, profileActivity.z0);
                paVar = l2Var;
                break;
            case 22:
                View vx0Var = new vx0(this, context, profileActivity.z0);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, vx0Var, profileActivity.z0);
                paVar = vx0Var;
                break;
            case 23:
                paVar = new nx0(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                vh.d dVar = new vh.d(context, profileActivity.z0, true);
                dVar.f();
                dVar.i(org.telegram.messenger.cd.L0(2131746723, null), false, true);
                dVar.setOnClickListener(new lx0(this, false ? 1 : 0));
                frameLayout.addView(dVar, w7.b6.d(-1, 48.0f, org.telegram.messenger.zs.E1, 18.0f, 14.0f, 18.0f, 14.0f));
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, frameLayout, profileActivity.z0);
                paVar = frameLayout;
                break;
            case 26:
                paVar = new org.telegram.ui.Cells.b9(context, profileActivity.z0);
                break;
            case 27:
                paVar = new xh.f(context, profileActivity.z0);
                break;
            case 28:
                View bnVar = new org.telegram.ui.Components.bn(context, 18);
                bnVar.setTag(-33024);
                view2 = bnVar;
                paVar = view2;
                break;
            case 32:
                paVar = new jy0(profileActivity, context);
                break;
            case 33:
                paVar = new zh.c(context, profileActivity.z0);
                break;
        }
        if (i10 != 13) {
            paVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new org.telegram.ui.Components.ck0(paVar);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        View view = c1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.N) {
            profileActivity.P = true;
        }
        if (view instanceof org.telegram.ui.Cells.z8) {
            ((org.telegram.ui.Cells.z8) view).a.setLoading(profileActivity.i5);
            ((org.telegram.ui.Cells.z8) view).b.setLoading(profileActivity.i5);
        }
    }

    @Override // s4.g0
    public final void z(s4.c1 c1Var) {
        View view = c1Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.N) {
            profileActivity.P = false;
        }
    }
}
