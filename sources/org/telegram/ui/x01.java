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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class x01 extends org.telegram.ui.Components.rl0 {
    public TLRPC.WebPage B;
    public boolean C;
    public w01[] c;
    public final org.telegram.ui.ActionBar.p2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public pr0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public x01(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
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

    public static w01[] H(final org.telegram.ui.ActionBar.p2 p2Var) {
        w01 w01Var;
        w01 w01Var2;
        w01 w01Var3;
        w01 w01Var4;
        w01 w01Var5;
        w01 w01Var6;
        w01 w01Var7;
        w01 w01Var8;
        w01 w01Var9;
        w01 w01Var10;
        w01 w01Var11;
        w01 w01Var12;
        w01 w01Var13;
        w01 w01Var14;
        w01 w01Var15;
        w01 w01Var16;
        w01 w01Var17;
        w01 w01Var18;
        w01 w01Var19;
        w01 w01Var20;
        w01 w01Var21;
        final int currentAccount = p2Var.getCurrentAccount();
        final int i10 = 26;
        w01 w01Var22 = new w01(LocaleController.getString(R.string.EditName), 500, 0, new pr0(26, p2Var, p2Var.getResourceProvider()));
        w01 w01Var23 = new w01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i11)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i11, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var23.a("tg://settings/edit/change-number");
        final int i11 = 8;
        w01 w01Var24 = new w01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i12));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var24.a("tg://settings/edit/add-account");
        final int i12 = 19;
        final int i13 = 1;
        w01 w01Var25 = new w01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var25.a("tg://settings/notifications");
        w01 w01Var26 = new w01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        w01Var26.a("tg://settings/notifications/private-chats");
        final int i14 = 13;
        w01 w01Var27 = new w01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        w01Var27.a("tg://settings/notifications/groups");
        w01 w01Var28 = new w01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ii0(i11, p2Var));
        w01Var28.a("tg://settings/notifications/channels");
        final int i15 = 20;
        w01 w01Var29 = new w01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ii0(i15, p2Var));
        final int i16 = 2;
        w01 w01Var30 = new w01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i17 = 14;
        w01 w01Var31 = new w01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01 w01Var32 = new w01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ii0(23, p2Var));
        w01Var32.a("tg://settings/notifications/new-contacts");
        final int i18 = 25;
        w01 w01Var33 = new w01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01Var33.a("tg://settings/notifications/pinned-messages");
        final int i19 = 7;
        w01 w01Var34 = new w01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var34.a("tg://settings/notifications/reset");
        w01 w01Var35 = new w01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01 w01Var36 = new w01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i20 = 21;
        w01 w01Var37 = new w01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i21 = 22;
        w01 w01Var38 = new w01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var38.a("tg://settings/privacy");
        final int i22 = 23;
        w01 w01Var39 = new w01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var39.a("tg://settings/privacy/2sv");
        final int i23 = 0;
        w01 w01Var40 = new w01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.t01
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
                                spannableStringBuilder.setSpan(new fg.l0(a02, 5), indexOf, lastIndexOf - 1, 33);
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
        w01Var40.a("tg://settings/privacy/auto-delete");
        final int i24 = 25;
        w01 w01Var41 = new w01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var41.a("tg://settings/privacy/passcode");
        w01 w01Var42 = null;
        if (SharedConfig.hasEmailLogin) {
            w01Var = w01Var39;
            final int i25 = 27;
            w01Var2 = new w01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.s01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(LiteMode.FLAGS_CHAT);
                            fc0Var2.V(32);
                            break;
                        case 2:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(LiteMode.FLAGS_CHAT);
                            fc0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.W(LiteMode.FLAGS_CHAT);
                            fc0Var4.V(128);
                            break;
                        case 5:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(LiteMode.FLAGS_CHAT);
                            fc0Var5.V(256);
                            break;
                        case 6:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(LiteMode.FLAGS_CHAT);
                            fc0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.V(512);
                            break;
                        case 9:
                            fc0 fc0Var8 = new fc0();
                            p2Var.presentFragment(fc0Var8);
                            fc0Var8.V(1024);
                            break;
                        case 10:
                            fc0 fc0Var9 = new fc0();
                            p2Var.presentFragment(fc0Var9);
                            fc0Var9.V(2048);
                            break;
                        case 11:
                            fc0 fc0Var10 = new fc0();
                            p2Var.presentFragment(fc0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = fc0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((zb0) arrayList.get(i112)).f == 1) {
                                    fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                            fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                            n1Var.C();
                            p2Var3.showDialog(n1Var);
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
                            tx0 tx0Var = new tx0();
                            tx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(tx0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            w01Var2.a("tg://settings/privacy/login-email");
        } else {
            w01Var = w01Var39;
            w01Var2 = null;
        }
        final int i26 = 28;
        w01 w01Var43 = new w01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var43.a("tg://settings/privacy/blocked");
        final int i27 = 29;
        w01 w01Var44 = new w01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var44.a("tg://settings/devices");
        final int i28 = 0;
        w01 w01Var45 = new w01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var45.a("tg://settings/privacy/phone-number/");
        final int i29 = 1;
        w01 w01Var46 = new w01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var46.a("tg://settings/privacy/last-seen");
        final int i30 = 2;
        w01 w01Var47 = new w01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var47.a("tg://settings/privacy/profile-photos");
        final int i31 = 3;
        w01 w01Var48 = new w01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var48.a("tg://settings/privacy/forwards");
        final int i32 = 4;
        w01 w01Var49 = new w01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var49.a("tg://settings/privacy/calls/p2p");
        final int i33 = 6;
        w01 w01Var50 = new w01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var50.a("tg://settings/privacy/calls");
        final int i34 = 7;
        w01 w01Var51 = new w01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var51.a("tg://settings/privacy/invites");
        final int i35 = 1;
        w01 w01Var52 = new w01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.t01
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
                                spannableStringBuilder.setSpan(new fg.l0(a02, 5), indexOf, lastIndexOf - 1, 33);
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
        w01Var52.a("tg://settings/privacy/voice");
        final int i36 = 9;
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            w01Var3 = new w01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                                p2Var.presentFragment(new og0(i122));
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
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
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
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
            w01Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            w01Var3 = null;
        }
        final int i37 = 10;
        w01 w01Var53 = new w01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var53.a("tg://settings/privacy/self-destruct");
        final int i38 = 11;
        w01 w01Var54 = new w01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var54.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i39 = 12;
        w01 w01Var55 = new w01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var55.a("tg://settings/privacy/active-websites");
        final int i40 = 13;
        w01 w01Var56 = new w01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var56.a("tg://settings/privacy/data-settings/delete-synced");
        final int i41 = 14;
        w01 w01Var57 = new w01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var57.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i42 = 16;
        w01 w01Var58 = new w01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var58.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i43 = 17;
        w01 w01Var59 = new w01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var59.a("tg://settings/privacy/data-settings/map-provider");
        final int i44 = 18;
        w01 w01Var60 = new w01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var60.a("tg://settings/privacy/data-settings/link-previews");
        final int i45 = 20;
        w01 w01Var61 = new w01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var61.a("tg://settings/devices");
        final int i46 = 21;
        w01 w01Var62 = new w01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var62.a("tg://settings/devices/terminate-sessions");
        final int i47 = 22;
        w01 w01Var63 = new w01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var63.a("tg://settings/devices/link-desktop");
        final int i48 = 23;
        w01 w01Var64 = new w01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var64.a("tg://settings/privacy/data-settings");
        final int i49 = 24;
        w01 w01Var65 = new w01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01 w01Var66 = new w01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01Var66.a("tg://settings/data/storage");
        final int i51 = 27;
        w01 w01Var67 = new w01(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01 w01Var68 = new w01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01 w01Var69 = new w01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.u01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new og0(i122));
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
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
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
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
        w01 w01Var70 = new w01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        w01Var70.a("tg://settings/data/usage");
        final int i55 = 2;
        w01 w01Var71 = new w01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        w01 w01Var72 = new w01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        w01 w01Var73 = new w01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        final int i58 = 5;
        w01 w01Var74 = new w01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        final int i59 = 6;
        w01 w01Var75 = new w01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        w01Var75.a("tg://settings/data/auto-download/reset");
        final int i60 = 8;
        w01 w01Var76 = new w01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        w01 w01Var77 = new w01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        final int i62 = 10;
        w01 w01Var78 = new w01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        final int i63 = 11;
        w01 w01Var79 = new w01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        w01Var79.a("tg://settings/data/use-less-data");
        final int i64 = 12;
        w01 w01Var80 = new w01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        final int i65 = 14;
        w01 w01Var81 = new w01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        w01Var81.a("tg://settings/data/proxy");
        final int i66 = 15;
        w01 w01Var82 = new w01(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        w01Var82.a("tg://settings/data/proxy/use-for-calls");
        final int i67 = 16;
        w01 w01Var83 = new w01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        w01Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i68 = 17;
        w01 w01Var84 = new w01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        p2Var.presentFragment(new yu(null));
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                }
            }
        });
        w01 w01Var85 = new w01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ii0(2, p2Var));
        w01Var85.a("tg://settings/data/save-to-photos/chats");
        w01 w01Var86 = new w01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ii0(3, p2Var));
        w01Var86.a("tg://settings/data/save-to-photos/groups");
        w01 w01Var87 = new w01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ii0(4, p2Var));
        w01Var87.a("tg://settings/data/save-to-photos/channels");
        w01 w01Var88 = new w01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ii0(5, p2Var));
        w01Var88.a("tg://settings/appearance/themes");
        w01 w01Var89 = new w01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(6, p2Var));
        w01Var89.a("tg://settings/appearance/text-size");
        w01 w01Var90 = new w01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(7, p2Var));
        w01Var90.a("tg://settings/appearance/wallpapers");
        w01 w01Var91 = new w01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ii0(9, p2Var));
        w01 w01Var92 = new w01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ii0(10, p2Var));
        w01 w01Var93 = new w01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(11, p2Var));
        w01 w01Var94 = new w01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(13, p2Var));
        w01 w01Var95 = new w01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ii0(14, p2Var));
        w01Var95.a("tg://settings/appearance/themes/create");
        w01 w01Var96 = new w01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(15, p2Var));
        w01Var96.a("tg://settings/appearance/message-corners");
        w01 w01Var97 = new w01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(16, p2Var));
        w01 w01Var98 = new w01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(17, p2Var));
        w01 w01Var99 = new w01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(18, p2Var));
        w01Var99.a("tg://settings/appearance/app-icon");
        w01 w01Var100 = new w01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(19, p2Var));
        w01 w01Var101 = new w01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(21, p2Var));
        w01Var101.a("tg://settings/appearance/tap-for-next-media");
        w01 w01Var102 = new w01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(22, p2Var));
        w01Var102.a("tg://settings/data/raise-to-listen");
        w01 w01Var103 = new w01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(24, p2Var));
        w01Var103.a("tg://settings/data/raise-to-speak");
        w01 w01Var104 = new w01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(25, p2Var));
        w01Var104.a("tg://settings/data/pause-music");
        w01 w01Var105 = new w01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(26, p2Var));
        w01 w01Var106 = new w01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(27, p2Var));
        w01 w01Var107 = new w01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(28, p2Var));
        w01 w01Var108 = new w01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ii0(29, p2Var));
        final int i69 = 0;
        w01 w01Var109 = new w01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01Var109.a("tg://settings/appearance/stickers-and-emoji");
        final int i70 = 1;
        w01 w01Var110 = new w01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i71 = 3;
        w01 w01Var111 = new w01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i72 = 5;
        w01 w01Var112 = new w01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i73 = 6;
        w01 w01Var113 = new w01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i74 = 7;
        w01 w01Var114 = new w01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i75 = 8;
        w01 w01Var115 = new w01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i76 = 9;
        w01 w01Var116 = new w01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i77 = 10;
        w01 w01Var117 = new w01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i78 = 11;
        w01 w01Var118 = new w01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i79 = 12;
        w01 w01Var119 = new w01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i80 = 13;
        w01 w01Var120 = new w01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i81 = 22;
        w01 w01Var121 = new w01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01Var121.a("tg://settings/folders");
        final int i82 = 3;
        w01 w01Var122 = new w01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i82) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            w01Var4 = w01Var122;
            w01Var5 = w01Var113;
            w01Var6 = w01Var115;
            w01Var7 = w01Var117;
            final int i83 = 14;
            w01Var8 = new w01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.s01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(LiteMode.FLAGS_CHAT);
                            fc0Var2.V(32);
                            break;
                        case 2:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(LiteMode.FLAGS_CHAT);
                            fc0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.W(LiteMode.FLAGS_CHAT);
                            fc0Var4.V(128);
                            break;
                        case 5:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(LiteMode.FLAGS_CHAT);
                            fc0Var5.V(256);
                            break;
                        case 6:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(LiteMode.FLAGS_CHAT);
                            fc0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.V(512);
                            break;
                        case 9:
                            fc0 fc0Var8 = new fc0();
                            p2Var.presentFragment(fc0Var8);
                            fc0Var8.V(1024);
                            break;
                        case 10:
                            fc0 fc0Var9 = new fc0();
                            p2Var.presentFragment(fc0Var9);
                            fc0Var9.V(2048);
                            break;
                        case 11:
                            fc0 fc0Var10 = new fc0();
                            p2Var.presentFragment(fc0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = fc0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((zb0) arrayList.get(i112)).f == 1) {
                                    fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                            fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                            n1Var.C();
                            p2Var3.showDialog(n1Var);
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
                            tx0 tx0Var = new tx0();
                            tx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(tx0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            w01Var4 = w01Var122;
            w01Var5 = w01Var113;
            w01Var6 = w01Var115;
            w01Var7 = w01Var117;
            w01Var8 = null;
        }
        if (F(currentAccount, 0)) {
            final int i84 = 24;
            w01Var9 = new w01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.s01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(LiteMode.FLAGS_CHAT);
                            fc0Var2.V(32);
                            break;
                        case 2:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(LiteMode.FLAGS_CHAT);
                            fc0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.W(LiteMode.FLAGS_CHAT);
                            fc0Var4.V(128);
                            break;
                        case 5:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(LiteMode.FLAGS_CHAT);
                            fc0Var5.V(256);
                            break;
                        case 6:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(LiteMode.FLAGS_CHAT);
                            fc0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.V(512);
                            break;
                        case 9:
                            fc0 fc0Var8 = new fc0();
                            p2Var.presentFragment(fc0Var8);
                            fc0Var8.V(1024);
                            break;
                        case 10:
                            fc0 fc0Var9 = new fc0();
                            p2Var.presentFragment(fc0Var9);
                            fc0Var9.V(2048);
                            break;
                        case 11:
                            fc0 fc0Var10 = new fc0();
                            p2Var.presentFragment(fc0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = fc0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((zb0) arrayList.get(i112)).f == 1) {
                                    fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                            fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                            n1Var.C();
                            p2Var3.showDialog(n1Var);
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
                            tx0 tx0Var = new tx0();
                            tx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(tx0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            w01Var9 = null;
        }
        if (F(currentAccount, 11)) {
            final int i85 = 5;
            w01Var10 = new w01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.u01
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                                p2Var.presentFragment(new og0(i122));
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
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
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
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
            w01Var10 = null;
        }
        if (F(currentAccount, 1)) {
            final int i86 = 15;
            w01Var11 = new w01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.u01
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                                p2Var.presentFragment(new og0(i122));
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
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
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
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
            w01Var11 = null;
        }
        if (F(currentAccount, 2)) {
            final int i87 = 26;
            w01Var12 = new w01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.u01
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 11, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                                p2Var.presentFragment(new og0(i122));
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 1, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
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
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 2, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
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
            w01Var12 = null;
        }
        if (F(currentAccount, 8)) {
            final int i88 = 7;
            w01Var13 = new w01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.v01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            p2Var.presentFragment(new yu(null));
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            break;
                    }
                }
            });
        } else {
            w01Var13 = null;
        }
        if (F(currentAccount, 3)) {
            final int i89 = 18;
            w01Var14 = new w01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.v01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            p2Var.presentFragment(new yu(null));
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 8, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 3, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            break;
                    }
                }
            });
        } else {
            w01Var14 = null;
        }
        w01 w01Var123 = F(currentAccount, 4) ? new w01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ii0(12, p2Var)) : null;
        if (F(currentAccount, 5)) {
            final int i90 = 4;
            w01Var15 = new w01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.r01
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new b31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            break;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            break;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            w01Var15 = null;
        }
        if (F(currentAccount, 9)) {
            final int i91 = 15;
            w01Var16 = new w01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.r01
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new b31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            break;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            break;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            w01Var16 = null;
        }
        if (F(currentAccount, 6)) {
            final int i92 = 16;
            w01Var17 = new w01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.r01
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new b31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            break;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            break;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            w01Var17 = null;
        }
        if (F(currentAccount, 7)) {
            final int i93 = 17;
            w01Var18 = new w01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.r01
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new b31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            break;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            break;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            w01Var18 = null;
        }
        if (F(currentAccount, 10)) {
            final int i94 = 18;
            w01Var19 = new w01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.r01
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new b31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            break;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            break;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            w01Var19 = null;
        }
        if (F(currentAccount, 12)) {
            final int i95 = 19;
            w01Var20 = new w01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.r01
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
                            fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                            n1Var.C();
                            p2Var2.showDialog(n1Var);
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
                            p2Var.presentFragment(new b31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                            n1Var2.C();
                            p2Var3.showDialog(n1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                            n1Var3.C();
                            p2Var4.showDialog(n1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                            n1Var4.C();
                            p2Var5.showDialog(n1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                            n1Var5.C();
                            p2Var6.showDialog(n1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                            n1Var6.C();
                            p2Var7.showDialog(n1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new fc0());
                            break;
                        case 21:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(3);
                            fc0Var2.V(1);
                            break;
                        case 24:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(3);
                            fc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            w01Var20 = null;
        }
        final int i96 = 20;
        w01 w01Var124 = new w01(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01Var124.a("tg://settings/power-saving");
        final int i97 = 21;
        w01 w01Var125 = new w01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01Var125.a("tg://settings/power-saving/stickers");
        final int i98 = 23;
        w01 w01Var126 = new w01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i99 = 24;
        w01 w01Var127 = new w01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i100 = 26;
        w01 w01Var128 = new w01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        w01Var128.a("tg://settings/power-saving/emoji");
        final int i101 = 27;
        w01 w01Var129 = new w01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i102 = 28;
        w01 w01Var130 = new w01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i103 = 29;
        w01 w01Var131 = new w01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.r01
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
                        fg.n1 n1Var = new fg.n1(p2Var2, 5, false);
                        n1Var.C();
                        p2Var2.showDialog(n1Var);
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
                        p2Var.presentFragment(new b31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        fg.n1 n1Var2 = new fg.n1(p2Var3, 9, false);
                        n1Var2.C();
                        p2Var3.showDialog(n1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        fg.n1 n1Var3 = new fg.n1(p2Var4, 6, false);
                        n1Var3.C();
                        p2Var4.showDialog(n1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        fg.n1 n1Var4 = new fg.n1(p2Var5, 7, false);
                        n1Var4.C();
                        p2Var5.showDialog(n1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        fg.n1 n1Var5 = new fg.n1(p2Var6, 10, false);
                        n1Var5.C();
                        p2Var6.showDialog(n1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        fg.n1 n1Var6 = new fg.n1(p2Var7, 12, false);
                        n1Var6.C();
                        p2Var7.showDialog(n1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new fc0());
                        break;
                    case 21:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(3);
                        fc0Var2.V(1);
                        break;
                    case 24:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(3);
                        fc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        fc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i104 = 0;
        w01 w01Var132 = new w01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var132.a("tg://settings/power-saving/effects");
        final int i105 = 1;
        w01 w01Var133 = new w01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i105) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var133.a("tg://settings/power-saving/background");
        final int i106 = 2;
        w01 w01Var134 = new w01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i107 = 4;
        w01 w01Var135 = new w01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            final int i108 = 5;
            w01Var21 = new w01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.s01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i108) {
                        case 0:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(LiteMode.FLAGS_CHAT);
                            fc0Var2.V(32);
                            break;
                        case 2:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(LiteMode.FLAGS_CHAT);
                            fc0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.W(LiteMode.FLAGS_CHAT);
                            fc0Var4.V(128);
                            break;
                        case 5:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(LiteMode.FLAGS_CHAT);
                            fc0Var5.V(256);
                            break;
                        case 6:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(LiteMode.FLAGS_CHAT);
                            fc0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.V(512);
                            break;
                        case 9:
                            fc0 fc0Var8 = new fc0();
                            p2Var.presentFragment(fc0Var8);
                            fc0Var8.V(1024);
                            break;
                        case 10:
                            fc0 fc0Var9 = new fc0();
                            p2Var.presentFragment(fc0Var9);
                            fc0Var9.V(2048);
                            break;
                        case 11:
                            fc0 fc0Var10 = new fc0();
                            p2Var.presentFragment(fc0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = fc0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((zb0) arrayList.get(i112)).f == 1) {
                                    fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                            fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                            n1Var.C();
                            p2Var3.showDialog(n1Var);
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
                            tx0 tx0Var = new tx0();
                            tx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(tx0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            w01Var21 = null;
        }
        final int i109 = 6;
        w01 w01Var136 = new w01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i110 = 8;
        w01 w01Var137 = new w01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var137.a("tg://settings/power-saving/call-animations");
        final int i111 = 9;
        w01 w01Var138 = new w01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i112)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i112, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var138.a("tg://settings/power-saving/videos");
        final int i112 = 10;
        w01 w01Var139 = new w01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i1122)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i1122, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var139.a("tg://settings/power-saving/gifs");
        final int i113 = 11;
        w01 w01Var140 = new w01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i113) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i1122)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i1122, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var140.a("tg://settings/power-saving/transitions");
        final int i114 = 12;
        w01 w01Var141 = new w01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i1122)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i1122, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var141.a("tg://settings/language");
        final int i115 = 13;
        w01 w01Var142 = new w01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i1122)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i1122, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i116 = 15;
            w01 w01Var143 = new w01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.s01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i116) {
                        case 0:
                            fc0 fc0Var = new fc0();
                            p2Var.presentFragment(fc0Var);
                            fc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            fc0 fc0Var2 = new fc0();
                            p2Var.presentFragment(fc0Var2);
                            fc0Var2.W(LiteMode.FLAGS_CHAT);
                            fc0Var2.V(32);
                            break;
                        case 2:
                            fc0 fc0Var3 = new fc0();
                            p2Var.presentFragment(fc0Var3);
                            fc0Var3.W(LiteMode.FLAGS_CHAT);
                            fc0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            fc0 fc0Var4 = new fc0();
                            p2Var.presentFragment(fc0Var4);
                            fc0Var4.W(LiteMode.FLAGS_CHAT);
                            fc0Var4.V(128);
                            break;
                        case 5:
                            fc0 fc0Var5 = new fc0();
                            p2Var.presentFragment(fc0Var5);
                            fc0Var5.W(LiteMode.FLAGS_CHAT);
                            fc0Var5.V(256);
                            break;
                        case 6:
                            fc0 fc0Var6 = new fc0();
                            p2Var.presentFragment(fc0Var6);
                            fc0Var6.W(LiteMode.FLAGS_CHAT);
                            fc0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            fc0 fc0Var7 = new fc0();
                            p2Var.presentFragment(fc0Var7);
                            fc0Var7.V(512);
                            break;
                        case 9:
                            fc0 fc0Var8 = new fc0();
                            p2Var.presentFragment(fc0Var8);
                            fc0Var8.V(1024);
                            break;
                        case 10:
                            fc0 fc0Var9 = new fc0();
                            p2Var.presentFragment(fc0Var9);
                            fc0Var9.V(2048);
                            break;
                        case 11:
                            fc0 fc0Var10 = new fc0();
                            p2Var.presentFragment(fc0Var10);
                            int i1122 = 0;
                            while (true) {
                                ArrayList arrayList = fc0Var10.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((zb0) arrayList.get(i1122)).f == 1) {
                                    fc0Var10.b.d1(new hg.m2(fc0Var10, i1122, 12), 700, true);
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
                            fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                            n1Var.C();
                            p2Var3.showDialog(n1Var);
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
                            tx0 tx0Var = new tx0();
                            tx0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(tx0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            w01Var143.a("tg://settings/language/do-not-translate");
            w01Var42 = w01Var143;
        }
        final int i117 = 16;
        w01 w01Var144 = new w01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i117) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i1122)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i1122, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var144.a("tg://settings/ask-question");
        final int i118 = 17;
        w01 w01Var145 = new w01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i118) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i1122)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i1122, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var145.a("tg://settings/faq");
        final int i119 = 18;
        w01 w01Var146 = new w01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i119) {
                    case 0:
                        fc0 fc0Var = new fc0();
                        p2Var.presentFragment(fc0Var);
                        fc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        fc0 fc0Var2 = new fc0();
                        p2Var.presentFragment(fc0Var2);
                        fc0Var2.W(LiteMode.FLAGS_CHAT);
                        fc0Var2.V(32);
                        break;
                    case 2:
                        fc0 fc0Var3 = new fc0();
                        p2Var.presentFragment(fc0Var3);
                        fc0Var3.W(LiteMode.FLAGS_CHAT);
                        fc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        fc0 fc0Var4 = new fc0();
                        p2Var.presentFragment(fc0Var4);
                        fc0Var4.W(LiteMode.FLAGS_CHAT);
                        fc0Var4.V(128);
                        break;
                    case 5:
                        fc0 fc0Var5 = new fc0();
                        p2Var.presentFragment(fc0Var5);
                        fc0Var5.W(LiteMode.FLAGS_CHAT);
                        fc0Var5.V(256);
                        break;
                    case 6:
                        fc0 fc0Var6 = new fc0();
                        p2Var.presentFragment(fc0Var6);
                        fc0Var6.W(LiteMode.FLAGS_CHAT);
                        fc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        fc0 fc0Var7 = new fc0();
                        p2Var.presentFragment(fc0Var7);
                        fc0Var7.V(512);
                        break;
                    case 9:
                        fc0 fc0Var8 = new fc0();
                        p2Var.presentFragment(fc0Var8);
                        fc0Var8.V(1024);
                        break;
                    case 10:
                        fc0 fc0Var9 = new fc0();
                        p2Var.presentFragment(fc0Var9);
                        fc0Var9.V(2048);
                        break;
                    case 11:
                        fc0 fc0Var10 = new fc0();
                        p2Var.presentFragment(fc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = fc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((zb0) arrayList.get(i1122)).f == 1) {
                                fc0Var10.b.d1(new hg.m2(fc0Var10, i1122, 12), 700, true);
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
                        fg.n1 n1Var = new fg.n1(p2Var3, 0, false);
                        n1Var.C();
                        p2Var3.showDialog(n1Var);
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
                        tx0 tx0Var = new tx0();
                        tx0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(tx0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        w01Var146.a("tg://settings/privacy-policy");
        return new w01[]{w01Var22, w01Var23, w01Var24, w01Var25, w01Var26, w01Var27, w01Var28, w01Var29, w01Var30, w01Var31, w01Var32, w01Var33, w01Var34, w01Var35, w01Var36, w01Var37, w01Var38, w01Var, w01Var40, w01Var41, w01Var2, w01Var43, w01Var44, w01Var45, w01Var46, w01Var47, w01Var48, w01Var49, w01Var50, w01Var51, w01Var52, w01Var3, w01Var53, w01Var54, w01Var55, w01Var56, w01Var57, w01Var58, w01Var59, w01Var60, w01Var61, w01Var62, w01Var63, w01Var64, w01Var65, w01Var66, w01Var67, w01Var68, w01Var69, w01Var70, w01Var71, w01Var72, w01Var73, w01Var74, w01Var75, w01Var76, w01Var77, w01Var78, w01Var79, w01Var80, w01Var81, w01Var82, w01Var83, w01Var84, w01Var85, w01Var86, w01Var87, w01Var88, w01Var89, w01Var90, w01Var91, w01Var92, w01Var93, w01Var94, w01Var95, w01Var96, w01Var97, w01Var98, w01Var99, w01Var100, w01Var101, w01Var102, w01Var103, w01Var104, w01Var105, w01Var106, w01Var107, w01Var108, w01Var109, w01Var110, w01Var111, w01Var112, w01Var5, w01Var114, w01Var6, w01Var116, w01Var7, w01Var118, w01Var119, w01Var120, w01Var121, w01Var4, w01Var8, w01Var9, w01Var10, w01Var11, w01Var12, w01Var13, w01Var14, w01Var123, w01Var15, w01Var16, w01Var17, w01Var18, w01Var19, w01Var20, w01Var124, w01Var125, w01Var126, w01Var127, w01Var128, w01Var129, w01Var130, w01Var131, w01Var132, w01Var133, w01Var134, w01Var135, w01Var21, w01Var136, w01Var137, w01Var138, w01Var139, w01Var140, w01Var141, w01Var142, w01Var42, w01Var144, w01Var145, w01Var146};
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 0;
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
            if (obj2 instanceof w01) {
                ((w01) obj2).g = i10;
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
            pr0 pr0Var = new pr0(27, this, str);
            this.x = pr0Var;
            dispatchQueue.postRunnable(pr0Var, 300L);
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
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        l();
    }

    public final void J() {
        String[] strArr;
        w01 w01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            w01[] w01VarArr = this.c;
            if (i10 >= w01VarArr.length) {
                break;
            }
            w01 w01Var2 = w01VarArr[i10];
            if (w01Var2 != null) {
                hashMap.put(Integer.valueOf(w01Var2.f), this.c[i10]);
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
                    } else if (readInt322 == 1 && (w01Var = (w01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        w01Var.g = readInt32;
                        arrayList.add(w01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new du(this));
    }

    @Override // f2.p0
    public final int h() {
        if (this.w) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.v;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f;
        View view = m1Var.a;
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
                int e6 = yh.e(1, i10, this.r);
                w6Var.a((CharSequence) this.n.get(this.r.size() + e6), ((MessagesController.FaqSearchResult) this.s.get(e6)).path, true, e6 < this.r.size() - 1);
                return;
            } else {
                w01 w01Var = (w01) this.r.get(i10);
                w01 w01Var2 = i10 > 0 ? (w01) this.r.get(i10 - 1) : null;
                w6Var.b((CharSequence) this.n.get(i10), w01Var.d, (w01Var2 == null || w01Var2.e != w01Var.e) ? w01Var.e : 0, i10 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= arrayList.size()) {
            int e10 = yh.e(1, i10, arrayList);
            MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) this.d.get(e10);
            w6Var.a(faqSearchResult.title, faqSearchResult.path, true, e10 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof w01) {
            w01 w01Var3 = (w01) obj;
            w6Var.a(w01Var3.a, w01Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            w6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View m4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.m4(context, 16) : new org.telegram.ui.Cells.u3(context, null) : new org.telegram.ui.Cells.w6(context);
        m4Var.setLayoutParams(new f2.x0(-1, -2));
        return new org.telegram.ui.Components.el0(m4Var);
    }
}
