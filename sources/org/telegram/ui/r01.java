package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class r01 extends org.telegram.ui.Components.rl0 {
    public TLRPC.WebPage B;
    public boolean C;
    public q01[] c;
    public final org.telegram.ui.ActionBar.p2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public zq0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public r01(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.e = p2Var;
        this.f = p2Var.getCurrentAccount();
        this.h = context;
        this.c = H(p2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() || UserConfig.getInstance(i10).isPremium()) {
            return i11 == -1 || MessagesController.getInstance(i10).premiumFeaturesTypesToPosition.get(i11, -1) != -1;
        }
        return false;
    }

    public static q01[] H(final org.telegram.ui.ActionBar.p2 p2Var) {
        q01 q01Var;
        q01 q01Var2;
        q01 q01Var3;
        q01 q01Var4;
        q01 q01Var5;
        q01 q01Var6;
        q01 q01Var7;
        q01 q01Var8;
        q01 q01Var9;
        q01 q01Var10;
        q01 q01Var11;
        q01 q01Var12;
        q01 q01Var13;
        q01 q01Var14;
        q01 q01Var15;
        q01 q01Var16;
        q01 q01Var17;
        q01 q01Var18;
        q01 q01Var19;
        q01 q01Var20;
        q01 q01Var21;
        final int currentAccount = p2Var.getCurrentAccount();
        q01 q01Var22 = new q01(LocaleController.getString(R.string.EditName), 500, 0, new zq0(28, p2Var, p2Var.getResourceProvider()));
        final int i10 = 26;
        q01 q01Var23 = new q01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i11)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i11, 12), 700, true);
                                break;
                            } else {
                                i11++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var23.a("tg://settings/edit/change-number");
        final int i11 = 8;
        q01 q01Var24 = new q01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 4) {
                                i12 = -1;
                            } else if (UserConfig.getInstance(i12).isClientActivated()) {
                                i12++;
                            }
                        }
                        if (i12 >= 0) {
                            p2Var.presentFragment(new ng0(i12));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var24.a("tg://settings/edit/add-account");
        final int i12 = 19;
        final int i13 = 1;
        q01 q01Var25 = new q01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var25.a("tg://settings/notifications");
        q01 q01Var26 = new q01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        q01Var26.a("tg://settings/notifications/private-chats");
        final int i14 = 13;
        q01 q01Var27 = new q01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        q01Var27.a("tg://settings/notifications/groups");
        q01 q01Var28 = new q01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new hi0(i11, p2Var));
        q01Var28.a("tg://settings/notifications/channels");
        q01 q01Var29 = new q01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new hi0(20, p2Var));
        final int i15 = 2;
        q01 q01Var30 = new q01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i16 = 14;
        q01 q01Var31 = new q01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01 q01Var32 = new q01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new hi0(23, p2Var));
        q01Var32.a("tg://settings/notifications/new-contacts");
        final int i17 = 25;
        q01 q01Var33 = new q01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01Var33.a("tg://settings/notifications/pinned-messages");
        final int i18 = 7;
        q01 q01Var34 = new q01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var34.a("tg://settings/notifications/reset");
        q01 q01Var35 = new q01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i19 = 20;
        q01 q01Var36 = new q01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i20 = 21;
        q01 q01Var37 = new q01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i21 = 22;
        q01 q01Var38 = new q01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var38.a("tg://settings/privacy");
        final int i22 = 23;
        q01 q01Var39 = new q01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var39.a("tg://settings/privacy/2sv");
        final int i23 = 0;
        q01 q01Var40 = new q01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i23) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            p2Var.presentFragment(new s4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(p2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a02.W(), null);
                            qbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new eg.l0(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            qbVar.b.setText(spannableStringBuilder);
                            qbVar.b.setSingleLine(false);
                            qbVar.b.setMaxLines(2);
                            a02.b(qbVar, 2750).j();
                            break;
                        } else {
                            p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        q01Var40.a("tg://settings/privacy/auto-delete");
        final int i24 = 25;
        q01 q01Var41 = new q01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var41.a("tg://settings/privacy/passcode");
        q01 q01Var42 = null;
        if (SharedConfig.hasEmailLogin) {
            q01Var = q01Var39;
            final int i25 = 27;
            q01Var2 = new q01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(LiteMode.FLAGS_CHAT);
                            ec0Var2.V(32);
                            break;
                        case 2:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(LiteMode.FLAGS_CHAT);
                            ec0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.W(LiteMode.FLAGS_CHAT);
                            ec0Var4.V(128);
                            break;
                        case 5:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(LiteMode.FLAGS_CHAT);
                            ec0Var5.V(256);
                            break;
                        case 6:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(LiteMode.FLAGS_CHAT);
                            ec0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.V(512);
                            break;
                        case 9:
                            ec0 ec0Var8 = new ec0();
                            p2Var.presentFragment(ec0Var8);
                            ec0Var8.V(1024);
                            break;
                        case 10:
                            ec0 ec0Var9 = new ec0();
                            p2Var.presentFragment(ec0Var9);
                            ec0Var9.V(2048);
                            break;
                        case 11:
                            ec0 ec0Var10 = new ec0();
                            p2Var.presentFragment(ec0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = ec0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((yb0) arrayList.get(i112)).f == 1) {
                                    ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                            break;
                        case 17:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                            o1Var.C();
                            p2Var3.showDialog(o1Var);
                            break;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            p2Var.presentFragment(new i(3));
                            break;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(mx0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            q01Var2.a("tg://settings/privacy/login-email");
        } else {
            q01Var = q01Var39;
            q01Var2 = null;
        }
        final int i26 = 28;
        q01 q01Var43 = new q01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var43.a("tg://settings/privacy/blocked");
        final int i27 = 29;
        q01 q01Var44 = new q01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var44.a("tg://settings/devices");
        final int i28 = 0;
        q01 q01Var45 = new q01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var45.a("tg://settings/privacy/phone-number/");
        final int i29 = 1;
        q01 q01Var46 = new q01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var46.a("tg://settings/privacy/last-seen");
        final int i30 = 2;
        q01 q01Var47 = new q01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var47.a("tg://settings/privacy/profile-photos");
        final int i31 = 3;
        q01 q01Var48 = new q01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var48.a("tg://settings/privacy/forwards");
        final int i32 = 4;
        q01 q01Var49 = new q01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i32) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var49.a("tg://settings/privacy/calls/p2p");
        final int i33 = 6;
        q01 q01Var50 = new q01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i33) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var50.a("tg://settings/privacy/calls");
        final int i34 = 7;
        q01 q01Var51 = new q01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i34) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var51.a("tg://settings/privacy/invites");
        final int i35 = 1;
        q01 q01Var52 = new q01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            p2Var.presentFragment(new s4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(p2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.qb qbVar = new org.telegram.ui.Components.qb(a02.W(), null);
                            qbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new eg.l0(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            qbVar.b.setText(spannableStringBuilder);
                            qbVar.b.setSingleLine(false);
                            qbVar.b.setMaxLines(2);
                            a02.b(qbVar, 2750).j();
                            break;
                        } else {
                            p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        q01Var52.a("tg://settings/privacy/voice");
        final int i36 = 9;
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            q01Var3 = new q01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.o01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i36) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                p2Var.presentFragment(new ng0(i122));
                                break;
                            }
                            break;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.T = true;
                            p2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            p2Var.presentFragment(new b7());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            break;
                        case 27:
                            p2Var.presentFragment(new b7());
                            break;
                        case 28:
                            p2Var.presentFragment(new b7());
                            break;
                        default:
                            p2Var.presentFragment(new b7());
                            break;
                    }
                }
            });
            q01Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            q01Var3 = null;
        }
        final int i37 = 10;
        q01 q01Var53 = new q01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var53.a("tg://settings/privacy/self-destruct");
        final int i38 = 11;
        q01 q01Var54 = new q01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var54.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i39 = 12;
        q01 q01Var55 = new q01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var55.a("tg://settings/privacy/active-websites");
        final int i40 = 13;
        q01 q01Var56 = new q01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var56.a("tg://settings/privacy/data-settings/delete-synced");
        final int i41 = 14;
        q01 q01Var57 = new q01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var57.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i42 = 16;
        q01 q01Var58 = new q01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var58.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i43 = 17;
        q01 q01Var59 = new q01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var59.a("tg://settings/privacy/data-settings/map-provider");
        final int i44 = 18;
        q01 q01Var60 = new q01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var60.a("tg://settings/privacy/data-settings/link-previews");
        final int i45 = 20;
        q01 q01Var61 = new q01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var61.a("tg://settings/devices");
        final int i46 = 21;
        q01 q01Var62 = new q01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var62.a("tg://settings/devices/terminate-sessions");
        final int i47 = 22;
        q01 q01Var63 = new q01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var63.a("tg://settings/devices/link-desktop");
        final int i48 = 23;
        q01 q01Var64 = new q01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var64.a("tg://settings/privacy/data-settings");
        final int i49 = 24;
        q01 q01Var65 = new q01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        final int i50 = 25;
        q01 q01Var66 = new q01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        q01Var66.a("tg://settings/data/storage");
        final int i51 = 27;
        q01 q01Var67 = new q01(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        final int i52 = 28;
        q01 q01Var68 = new q01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        final int i53 = 29;
        q01 q01Var69 = new q01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            p2Var.presentFragment(new ng0(i122));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.T = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new b7());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new b7());
                        break;
                    case 28:
                        p2Var.presentFragment(new b7());
                        break;
                    default:
                        p2Var.presentFragment(new b7());
                        break;
                }
            }
        });
        final int i54 = 0;
        q01 q01Var70 = new q01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        q01Var70.a("tg://settings/data/usage");
        final int i55 = 2;
        q01 q01Var71 = new q01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        q01 q01Var72 = new q01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        q01 q01Var73 = new q01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        final int i58 = 5;
        q01 q01Var74 = new q01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        final int i59 = 6;
        q01 q01Var75 = new q01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        q01Var75.a("tg://settings/data/auto-download/reset");
        final int i60 = 8;
        q01 q01Var76 = new q01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        q01 q01Var77 = new q01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        final int i62 = 10;
        q01 q01Var78 = new q01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        final int i63 = 11;
        q01 q01Var79 = new q01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        q01Var79.a("tg://settings/data/use-less-data");
        final int i64 = 12;
        q01 q01Var80 = new q01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        final int i65 = 14;
        q01 q01Var81 = new q01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        q01Var81.a("tg://settings/data/proxy");
        final int i66 = 15;
        q01 q01Var82 = new q01(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        q01Var82.a("tg://settings/data/proxy/use-for-calls");
        final int i67 = 16;
        q01 q01Var83 = new q01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        q01Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i68 = 17;
        q01 q01Var84 = new q01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        p2Var.presentFragment(new xu(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                }
            }
        });
        q01 q01Var85 = new q01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new hi0(2, p2Var));
        q01Var85.a("tg://settings/data/save-to-photos/chats");
        q01 q01Var86 = new q01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new hi0(3, p2Var));
        q01Var86.a("tg://settings/data/save-to-photos/groups");
        q01 q01Var87 = new q01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new hi0(4, p2Var));
        q01Var87.a("tg://settings/data/save-to-photos/channels");
        q01 q01Var88 = new q01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new hi0(5, p2Var));
        q01Var88.a("tg://settings/appearance/themes");
        q01 q01Var89 = new q01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(6, p2Var));
        q01Var89.a("tg://settings/appearance/text-size");
        q01 q01Var90 = new q01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(7, p2Var));
        q01Var90.a("tg://settings/appearance/wallpapers");
        q01 q01Var91 = new q01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new hi0(9, p2Var));
        q01 q01Var92 = new q01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new hi0(10, p2Var));
        q01 q01Var93 = new q01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(11, p2Var));
        q01 q01Var94 = new q01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(13, p2Var));
        q01 q01Var95 = new q01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new hi0(14, p2Var));
        q01Var95.a("tg://settings/appearance/themes/create");
        q01 q01Var96 = new q01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(15, p2Var));
        q01Var96.a("tg://settings/appearance/message-corners");
        q01 q01Var97 = new q01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(16, p2Var));
        q01 q01Var98 = new q01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(17, p2Var));
        q01 q01Var99 = new q01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(18, p2Var));
        q01Var99.a("tg://settings/appearance/app-icon");
        q01 q01Var100 = new q01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(19, p2Var));
        q01 q01Var101 = new q01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(21, p2Var));
        q01Var101.a("tg://settings/appearance/tap-for-next-media");
        q01 q01Var102 = new q01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(22, p2Var));
        q01Var102.a("tg://settings/data/raise-to-listen");
        q01 q01Var103 = new q01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(24, p2Var));
        q01Var103.a("tg://settings/data/raise-to-speak");
        q01 q01Var104 = new q01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(25, p2Var));
        q01Var104.a("tg://settings/data/pause-music");
        q01 q01Var105 = new q01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(26, p2Var));
        q01 q01Var106 = new q01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(27, p2Var));
        q01 q01Var107 = new q01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(28, p2Var));
        q01 q01Var108 = new q01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new hi0(29, p2Var));
        final int i69 = 0;
        q01 q01Var109 = new q01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01Var109.a("tg://settings/appearance/stickers-and-emoji");
        final int i70 = 1;
        q01 q01Var110 = new q01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i71 = 3;
        q01 q01Var111 = new q01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i72 = 5;
        q01 q01Var112 = new q01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i73 = 6;
        q01 q01Var113 = new q01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i74 = 7;
        q01 q01Var114 = new q01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i75 = 8;
        q01 q01Var115 = new q01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i76 = 9;
        q01 q01Var116 = new q01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i77 = 10;
        q01 q01Var117 = new q01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i78 = 11;
        q01 q01Var118 = new q01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i79 = 12;
        q01 q01Var119 = new q01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i79) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i80 = 13;
        q01 q01Var120 = new q01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i80) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i81 = 22;
        q01 q01Var121 = new q01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i81) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01Var121.a("tg://settings/folders");
        final int i82 = 3;
        q01 q01Var122 = new q01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i82) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            q01Var4 = q01Var122;
            q01Var5 = q01Var113;
            q01Var6 = q01Var115;
            q01Var7 = q01Var117;
            final int i83 = 14;
            q01Var8 = new q01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.m01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(LiteMode.FLAGS_CHAT);
                            ec0Var2.V(32);
                            break;
                        case 2:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(LiteMode.FLAGS_CHAT);
                            ec0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.W(LiteMode.FLAGS_CHAT);
                            ec0Var4.V(128);
                            break;
                        case 5:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(LiteMode.FLAGS_CHAT);
                            ec0Var5.V(256);
                            break;
                        case 6:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(LiteMode.FLAGS_CHAT);
                            ec0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.V(512);
                            break;
                        case 9:
                            ec0 ec0Var8 = new ec0();
                            p2Var.presentFragment(ec0Var8);
                            ec0Var8.V(1024);
                            break;
                        case 10:
                            ec0 ec0Var9 = new ec0();
                            p2Var.presentFragment(ec0Var9);
                            ec0Var9.V(2048);
                            break;
                        case 11:
                            ec0 ec0Var10 = new ec0();
                            p2Var.presentFragment(ec0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = ec0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((yb0) arrayList.get(i112)).f == 1) {
                                    ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                            break;
                        case 17:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                            o1Var.C();
                            p2Var3.showDialog(o1Var);
                            break;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            p2Var.presentFragment(new i(3));
                            break;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(mx0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            q01Var4 = q01Var122;
            q01Var5 = q01Var113;
            q01Var6 = q01Var115;
            q01Var7 = q01Var117;
            q01Var8 = null;
        }
        if (F(currentAccount, 0)) {
            final int i84 = 24;
            q01Var9 = new q01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.m01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(LiteMode.FLAGS_CHAT);
                            ec0Var2.V(32);
                            break;
                        case 2:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(LiteMode.FLAGS_CHAT);
                            ec0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.W(LiteMode.FLAGS_CHAT);
                            ec0Var4.V(128);
                            break;
                        case 5:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(LiteMode.FLAGS_CHAT);
                            ec0Var5.V(256);
                            break;
                        case 6:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(LiteMode.FLAGS_CHAT);
                            ec0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.V(512);
                            break;
                        case 9:
                            ec0 ec0Var8 = new ec0();
                            p2Var.presentFragment(ec0Var8);
                            ec0Var8.V(1024);
                            break;
                        case 10:
                            ec0 ec0Var9 = new ec0();
                            p2Var.presentFragment(ec0Var9);
                            ec0Var9.V(2048);
                            break;
                        case 11:
                            ec0 ec0Var10 = new ec0();
                            p2Var.presentFragment(ec0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = ec0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((yb0) arrayList.get(i112)).f == 1) {
                                    ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                            break;
                        case 17:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                            o1Var.C();
                            p2Var3.showDialog(o1Var);
                            break;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            p2Var.presentFragment(new i(3));
                            break;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(mx0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            q01Var9 = null;
        }
        if (F(currentAccount, 11)) {
            final int i85 = 5;
            q01Var10 = new q01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.o01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                p2Var.presentFragment(new ng0(i122));
                                break;
                            }
                            break;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.T = true;
                            p2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            p2Var.presentFragment(new b7());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            break;
                        case 27:
                            p2Var.presentFragment(new b7());
                            break;
                        case 28:
                            p2Var.presentFragment(new b7());
                            break;
                        default:
                            p2Var.presentFragment(new b7());
                            break;
                    }
                }
            });
        } else {
            q01Var10 = null;
        }
        if (F(currentAccount, 1)) {
            final int i86 = 15;
            q01Var11 = new q01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.o01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                p2Var.presentFragment(new ng0(i122));
                                break;
                            }
                            break;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.T = true;
                            p2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            p2Var.presentFragment(new b7());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            break;
                        case 27:
                            p2Var.presentFragment(new b7());
                            break;
                        case 28:
                            p2Var.presentFragment(new b7());
                            break;
                        default:
                            p2Var.presentFragment(new b7());
                            break;
                    }
                }
            });
        } else {
            q01Var11 = null;
        }
        if (F(currentAccount, 2)) {
            final int i87 = 26;
            q01Var12 = new q01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.o01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 11, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                p2Var.presentFragment(new ng0(i122));
                                break;
                            }
                            break;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 1, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.T = true;
                            p2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            p2Var.presentFragment(new b7());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 2, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            break;
                        case 27:
                            p2Var.presentFragment(new b7());
                            break;
                        case 28:
                            p2Var.presentFragment(new b7());
                            break;
                        default:
                            p2Var.presentFragment(new b7());
                            break;
                    }
                }
            });
        } else {
            q01Var12 = null;
        }
        if (F(currentAccount, 8)) {
            final int i88 = 7;
            q01Var13 = new q01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.p01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            p2Var.presentFragment(new xu(null));
                            break;
                        case 1:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 4:
                            p2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 5:
                            p2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 6:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 7:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 8:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 14:
                            p2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 15:
                            p2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 16:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                    }
                }
            });
        } else {
            q01Var13 = null;
        }
        if (F(currentAccount, 3)) {
            final int i89 = 18;
            q01Var14 = new q01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.p01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            p2Var.presentFragment(new xu(null));
                            break;
                        case 1:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 4:
                            p2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 5:
                            p2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 6:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 7:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 8, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 8:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 14:
                            p2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 15:
                            p2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 16:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 3, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                    }
                }
            });
        } else {
            q01Var14 = null;
        }
        q01 q01Var123 = F(currentAccount, 4) ? new q01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new hi0(12, p2Var)) : null;
        if (F(currentAccount, 5)) {
            final int i90 = 4;
            q01Var15 = new q01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.k01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new u21());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            break;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            break;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            q01Var15 = null;
        }
        if (F(currentAccount, 9)) {
            final int i91 = 15;
            q01Var16 = new q01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.k01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new u21());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            break;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            break;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            q01Var16 = null;
        }
        if (F(currentAccount, 6)) {
            final int i92 = 16;
            q01Var17 = new q01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.k01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i92) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new u21());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            break;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            break;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            q01Var17 = null;
        }
        if (F(currentAccount, 7)) {
            final int i93 = 17;
            q01Var18 = new q01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.k01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i93) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new u21());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            break;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            break;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            q01Var18 = null;
        }
        if (F(currentAccount, 10)) {
            final int i94 = 18;
            q01Var19 = new q01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.k01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i94) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new u21());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            break;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            break;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            q01Var19 = null;
        }
        if (F(currentAccount, 12)) {
            final int i95 = 19;
            q01Var20 = new q01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.k01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i95) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                            o1Var.C();
                            p2Var2.showDialog(o1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new r(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new r(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new u21());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                            o1Var2.C();
                            p2Var3.showDialog(o1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                            o1Var3.C();
                            p2Var4.showDialog(o1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                            o1Var4.C();
                            p2Var5.showDialog(o1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                            o1Var5.C();
                            p2Var6.showDialog(o1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                            o1Var6.C();
                            p2Var7.showDialog(o1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new ec0());
                            break;
                        case 21:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(3);
                            ec0Var2.V(1);
                            break;
                        case 24:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(3);
                            ec0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            q01Var20 = null;
        }
        final int i96 = 20;
        q01 q01Var124 = new q01(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01Var124.a("tg://settings/power-saving");
        final int i97 = 21;
        q01 q01Var125 = new q01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01Var125.a("tg://settings/power-saving/stickers");
        final int i98 = 23;
        q01 q01Var126 = new q01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i99 = 24;
        q01 q01Var127 = new q01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i100 = 26;
        q01 q01Var128 = new q01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        q01Var128.a("tg://settings/power-saving/emoji");
        final int i101 = 27;
        q01 q01Var129 = new q01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i102 = 28;
        q01 q01Var130 = new q01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i102) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i103 = 29;
        q01 q01Var131 = new q01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var2, 5, false);
                        o1Var.C();
                        p2Var2.showDialog(o1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new r(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new r(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new u21());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var2 = new eg.o1(p2Var3, 9, false);
                        o1Var2.C();
                        p2Var3.showDialog(o1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        eg.o1 o1Var3 = new eg.o1(p2Var4, 6, false);
                        o1Var3.C();
                        p2Var4.showDialog(o1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        eg.o1 o1Var4 = new eg.o1(p2Var5, 7, false);
                        o1Var4.C();
                        p2Var5.showDialog(o1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        eg.o1 o1Var5 = new eg.o1(p2Var6, 10, false);
                        o1Var5.C();
                        p2Var6.showDialog(o1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        eg.o1 o1Var6 = new eg.o1(p2Var7, 12, false);
                        o1Var6.C();
                        p2Var7.showDialog(o1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new ec0());
                        break;
                    case 21:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(3);
                        ec0Var2.V(1);
                        break;
                    case 24:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(3);
                        ec0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ec0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i104 = 0;
        q01 q01Var132 = new q01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var132.a("tg://settings/power-saving/effects");
        final int i105 = 1;
        q01 q01Var133 = new q01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i105) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var133.a("tg://settings/power-saving/background");
        final int i106 = 2;
        q01 q01Var134 = new q01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i107 = 4;
        q01 q01Var135 = new q01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            final int i108 = 5;
            q01Var21 = new q01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.m01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i108) {
                        case 0:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(LiteMode.FLAGS_CHAT);
                            ec0Var2.V(32);
                            break;
                        case 2:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(LiteMode.FLAGS_CHAT);
                            ec0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.W(LiteMode.FLAGS_CHAT);
                            ec0Var4.V(128);
                            break;
                        case 5:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(LiteMode.FLAGS_CHAT);
                            ec0Var5.V(256);
                            break;
                        case 6:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(LiteMode.FLAGS_CHAT);
                            ec0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.V(512);
                            break;
                        case 9:
                            ec0 ec0Var8 = new ec0();
                            p2Var.presentFragment(ec0Var8);
                            ec0Var8.V(1024);
                            break;
                        case 10:
                            ec0 ec0Var9 = new ec0();
                            p2Var.presentFragment(ec0Var9);
                            ec0Var9.V(2048);
                            break;
                        case 11:
                            ec0 ec0Var10 = new ec0();
                            p2Var.presentFragment(ec0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = ec0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((yb0) arrayList.get(i112)).f == 1) {
                                    ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                            break;
                        case 17:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                            o1Var.C();
                            p2Var3.showDialog(o1Var);
                            break;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            p2Var.presentFragment(new i(3));
                            break;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(mx0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            q01Var21 = null;
        }
        final int i109 = 6;
        q01 q01Var136 = new q01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i110 = 8;
        q01 q01Var137 = new q01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var137.a("tg://settings/power-saving/call-animations");
        final int i111 = 9;
        q01 q01Var138 = new q01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i112)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var138.a("tg://settings/power-saving/videos");
        final int i112 = 10;
        q01 q01Var139 = new q01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i1122)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var139.a("tg://settings/power-saving/gifs");
        final int i113 = 11;
        q01 q01Var140 = new q01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i113) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i1122)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var140.a("tg://settings/power-saving/transitions");
        final int i114 = 12;
        q01 q01Var141 = new q01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i1122)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var141.a("tg://settings/language");
        final int i115 = 13;
        q01 q01Var142 = new q01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i1122)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i116 = 15;
            q01 q01Var143 = new q01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.m01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i116) {
                        case 0:
                            ec0 ec0Var = new ec0();
                            p2Var.presentFragment(ec0Var);
                            ec0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            ec0 ec0Var2 = new ec0();
                            p2Var.presentFragment(ec0Var2);
                            ec0Var2.W(LiteMode.FLAGS_CHAT);
                            ec0Var2.V(32);
                            break;
                        case 2:
                            ec0 ec0Var3 = new ec0();
                            p2Var.presentFragment(ec0Var3);
                            ec0Var3.W(LiteMode.FLAGS_CHAT);
                            ec0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            ec0 ec0Var4 = new ec0();
                            p2Var.presentFragment(ec0Var4);
                            ec0Var4.W(LiteMode.FLAGS_CHAT);
                            ec0Var4.V(128);
                            break;
                        case 5:
                            ec0 ec0Var5 = new ec0();
                            p2Var.presentFragment(ec0Var5);
                            ec0Var5.W(LiteMode.FLAGS_CHAT);
                            ec0Var5.V(256);
                            break;
                        case 6:
                            ec0 ec0Var6 = new ec0();
                            p2Var.presentFragment(ec0Var6);
                            ec0Var6.W(LiteMode.FLAGS_CHAT);
                            ec0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            ec0 ec0Var7 = new ec0();
                            p2Var.presentFragment(ec0Var7);
                            ec0Var7.V(512);
                            break;
                        case 9:
                            ec0 ec0Var8 = new ec0();
                            p2Var.presentFragment(ec0Var8);
                            ec0Var8.V(1024);
                            break;
                        case 10:
                            ec0 ec0Var9 = new ec0();
                            p2Var.presentFragment(ec0Var9);
                            ec0Var9.V(2048);
                            break;
                        case 11:
                            ec0 ec0Var10 = new ec0();
                            p2Var.presentFragment(ec0Var10);
                            int i1122 = 0;
                            while (true) {
                                ArrayList arrayList = ec0Var10.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((yb0) arrayList.get(i1122)).f == 1) {
                                    ec0Var10.b.e1(new gg.m2(ec0Var10, i1122, 12), 700, true);
                                    break;
                                } else {
                                    i1122++;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                            break;
                        case 17:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                            o1Var.C();
                            p2Var3.showDialog(o1Var);
                            break;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            p2Var.presentFragment(new i(3));
                            break;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            mx0 mx0Var = new mx0();
                            mx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(mx0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            q01Var143.a("tg://settings/language/do-not-translate");
            q01Var42 = q01Var143;
        }
        final int i117 = 16;
        q01 q01Var144 = new q01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i117) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i1122)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var144.a("tg://settings/ask-question");
        final int i118 = 17;
        q01 q01Var145 = new q01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i118) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i1122)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var145.a("tg://settings/faq");
        final int i119 = 18;
        q01 q01Var146 = new q01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i119) {
                    case 0:
                        ec0 ec0Var = new ec0();
                        p2Var.presentFragment(ec0Var);
                        ec0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        ec0 ec0Var2 = new ec0();
                        p2Var.presentFragment(ec0Var2);
                        ec0Var2.W(LiteMode.FLAGS_CHAT);
                        ec0Var2.V(32);
                        break;
                    case 2:
                        ec0 ec0Var3 = new ec0();
                        p2Var.presentFragment(ec0Var3);
                        ec0Var3.W(LiteMode.FLAGS_CHAT);
                        ec0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        ec0 ec0Var4 = new ec0();
                        p2Var.presentFragment(ec0Var4);
                        ec0Var4.W(LiteMode.FLAGS_CHAT);
                        ec0Var4.V(128);
                        break;
                    case 5:
                        ec0 ec0Var5 = new ec0();
                        p2Var.presentFragment(ec0Var5);
                        ec0Var5.W(LiteMode.FLAGS_CHAT);
                        ec0Var5.V(256);
                        break;
                    case 6:
                        ec0 ec0Var6 = new ec0();
                        p2Var.presentFragment(ec0Var6);
                        ec0Var6.W(LiteMode.FLAGS_CHAT);
                        ec0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        ec0 ec0Var7 = new ec0();
                        p2Var.presentFragment(ec0Var7);
                        ec0Var7.V(512);
                        break;
                    case 9:
                        ec0 ec0Var8 = new ec0();
                        p2Var.presentFragment(ec0Var8);
                        ec0Var8.V(1024);
                        break;
                    case 10:
                        ec0 ec0Var9 = new ec0();
                        p2Var.presentFragment(ec0Var9);
                        ec0Var9.V(2048);
                        break;
                    case 11:
                        ec0 ec0Var10 = new ec0();
                        p2Var.presentFragment(ec0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = ec0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((yb0) arrayList.get(i1122)).f == 1) {
                                ec0Var10.b.e1(new gg.m2(ec0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.z4.U(p2Var2, null));
                        break;
                    case 17:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        af.g.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        eg.o1 o1Var = new eg.o1(p2Var3, 0, false);
                        o1Var.C();
                        p2Var3.showDialog(o1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new i(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        mx0 mx0Var = new mx0();
                        mx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(mx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        q01Var146.a("tg://settings/privacy-policy");
        return new q01[]{q01Var22, q01Var23, q01Var24, q01Var25, q01Var26, q01Var27, q01Var28, q01Var29, q01Var30, q01Var31, q01Var32, q01Var33, q01Var34, q01Var35, q01Var36, q01Var37, q01Var38, q01Var, q01Var40, q01Var41, q01Var2, q01Var43, q01Var44, q01Var45, q01Var46, q01Var47, q01Var48, q01Var49, q01Var50, q01Var51, q01Var52, q01Var3, q01Var53, q01Var54, q01Var55, q01Var56, q01Var57, q01Var58, q01Var59, q01Var60, q01Var61, q01Var62, q01Var63, q01Var64, q01Var65, q01Var66, q01Var67, q01Var68, q01Var69, q01Var70, q01Var71, q01Var72, q01Var73, q01Var74, q01Var75, q01Var76, q01Var77, q01Var78, q01Var79, q01Var80, q01Var81, q01Var82, q01Var83, q01Var84, q01Var85, q01Var86, q01Var87, q01Var88, q01Var89, q01Var90, q01Var91, q01Var92, q01Var93, q01Var94, q01Var95, q01Var96, q01Var97, q01Var98, q01Var99, q01Var100, q01Var101, q01Var102, q01Var103, q01Var104, q01Var105, q01Var106, q01Var107, q01Var108, q01Var109, q01Var110, q01Var111, q01Var112, q01Var5, q01Var114, q01Var6, q01Var116, q01Var7, q01Var118, q01Var119, q01Var120, q01Var121, q01Var4, q01Var8, q01Var9, q01Var10, q01Var11, q01Var12, q01Var13, q01Var14, q01Var123, q01Var15, q01Var16, q01Var17, q01Var18, q01Var19, q01Var20, q01Var124, q01Var125, q01Var126, q01Var127, q01Var128, q01Var129, q01Var130, q01Var131, q01Var132, q01Var133, q01Var134, q01Var135, q01Var21, q01Var136, q01Var137, q01Var138, q01Var139, q01Var140, q01Var141, q01Var142, q01Var42, q01Var144, q01Var145, q01Var146};
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 0;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.w) {
            l();
        }
        if (arrayList.size() > 20) {
            android.support.v4.media.a.u(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof q01) {
                ((q01) obj2).g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f;
        TLRPC.WebPage webPage = MessagesController.getInstance(i10).faqWebPage;
        this.B = webPage;
        if (webPage != null) {
            this.d.addAll(MessagesController.getInstance(i10).faqSearchArray);
        }
        if (this.B != null || this.C) {
            return;
        }
        this.C = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = LocaleController.getString(R.string.TelegramFaqUrl);
        tL_messages_getWebPage.hash = 0;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new o(this, 20));
    }

    public final void I(String str) {
        this.y = str;
        if (this.x != null) {
            Utilities.searchQueue.cancelRunnable(this.x);
            this.x = null;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            zq0 zq0Var = new zq0(29, this, str);
            this.x = zq0Var;
            dispatchQueue.postRunnable(zq0Var, 300L);
            return;
        }
        this.w = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.p2 p2Var = this.e;
        if (p2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) p2Var).M.b.getImageReceiver().startAnimation();
                ((ProfileActivity) this.e).M.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        l();
    }

    public final void J() {
        String[] strArr;
        q01 q01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            q01[] q01VarArr = this.c;
            if (i10 >= q01VarArr.length) {
                break;
            }
            q01 q01Var2 = q01VarArr[i10];
            if (q01Var2 != null) {
                hashMap.put(Integer.valueOf(q01Var2.f), this.c[i10]);
            }
            i10++;
        }
        Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.v;
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(it.next()));
                    int readInt32 = serializedData.readInt32(false);
                    int readInt322 = serializedData.readInt32(false);
                    if (readInt322 == 0) {
                        String readString = serializedData.readString(false);
                        int readInt323 = serializedData.readInt32(false);
                        if (readInt323 > 0) {
                            strArr = new String[readInt323];
                            for (int i11 = 0; i11 < readInt323; i11++) {
                                strArr[i11] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        MessagesController.FaqSearchResult faqSearchResult = new MessagesController.FaqSearchResult(readString, strArr, serializedData.readString(false));
                        faqSearchResult.num = readInt32;
                        arrayList.add(faqSearchResult);
                    } else if (readInt322 == 1 && (q01Var = (q01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        q01Var.g = readInt32;
                        arrayList.add(q01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new cu(this));
    }

    @Override // f2.o0
    public final int h() {
        if (this.w) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.v;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (!this.w) {
            ArrayList arrayList = this.v;
            if (i10 == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i10 != arrayList.size() + 1) {
                return 0;
            }
        } else if (i10 < this.r.size() || i10 != this.r.size()) {
            return 0;
        }
        return 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
                return;
            } else {
                if (i11 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                return;
            }
        }
        org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
        if (this.w) {
            if (i10 >= this.r.size()) {
                int f10 = yh.f(1, i10, this.r);
                w6Var.a((CharSequence) this.n.get(this.r.size() + f10), ((MessagesController.FaqSearchResult) this.s.get(f10)).path, true, f10 < this.r.size() - 1);
                return;
            } else {
                q01 q01Var = (q01) this.r.get(i10);
                q01 q01Var2 = i10 > 0 ? (q01) this.r.get(i10 - 1) : null;
                w6Var.b((CharSequence) this.n.get(i10), q01Var.d, (q01Var2 == null || q01Var2.e != q01Var.e) ? q01Var.e : 0, i10 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= arrayList.size()) {
            int f11 = yh.f(1, i10, arrayList);
            MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) this.d.get(f11);
            w6Var.a(faqSearchResult.title, faqSearchResult.path, true, f11 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof q01) {
            q01 q01Var3 = (q01) obj;
            w6Var.a(q01Var3.a, q01Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            w6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View m4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.m4(context, 16) : new org.telegram.ui.Cells.u3(context, null) : new org.telegram.ui.Cells.w6(context);
        m4Var.setLayoutParams(new f2.w0(-1, -2));
        return new org.telegram.ui.Components.el0(m4Var);
    }
}
