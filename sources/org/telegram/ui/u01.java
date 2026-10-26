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
import org.telegram.messenger.DispatchQueue2;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class u01 extends org.telegram.ui.Components.lm0 {
    public TLRPC.WebPage E;
    public boolean F;
    public t01[] c;
    public final org.telegram.ui.ActionBar.r2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public fy0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public u01(Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        this.e = r2Var;
        this.f = r2Var.getCurrentAccount();
        this.h = context;
        this.c = H(r2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() || UserConfig.getInstance(i10).isPremium()) {
            return i11 == -1 || MessagesController.getInstance(i10).premiumFeaturesTypesToPosition.get(i11, -1) != -1;
        }
        return false;
    }

    public static t01[] H(final org.telegram.ui.ActionBar.r2 r2Var) {
        t01 t01Var;
        t01 t01Var2;
        t01 t01Var3;
        t01 t01Var4;
        t01 t01Var5;
        t01 t01Var6;
        t01 t01Var7;
        t01 t01Var8;
        t01 t01Var9;
        t01 t01Var10;
        t01 t01Var11;
        t01 t01Var12;
        t01 t01Var13;
        t01 t01Var14;
        t01 t01Var15;
        t01 t01Var16;
        t01 t01Var17;
        t01 t01Var18;
        t01 t01Var19;
        t01 t01Var20;
        t01 t01Var21;
        t01 t01Var22;
        final int currentAccount = r2Var.getCurrentAccount();
        t01 t01Var23 = new t01(LocaleController.getString(R.string.EditName), 500, 0, new fy0(8, r2Var, r2Var.getResourceProvider()));
        final int i10 = 24;
        t01 t01Var24 = new t01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i11)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i11, 13), 700, true);
                                break;
                            } else {
                                i11++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var24.a("tg://settings/edit/change-number");
        final int i11 = 6;
        t01 t01Var25 = new t01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 4) {
                                i12 = -1;
                            } else if (UserConfig.getInstance(i12).isClientActivated()) {
                                i12++;
                            }
                        }
                        if (i12 >= 0) {
                            r2Var.presentFragment(new gg0(i12));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var25.a("tg://settings/edit/add-account");
        final int i12 = 17;
        final int i13 = 1;
        t01 t01Var26 = new t01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var26.a("tg://settings/notifications");
        final int i14 = 29;
        t01 t01Var27 = new t01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var27.a("tg://settings/notifications/private-chats");
        final int i15 = 11;
        t01 t01Var28 = new t01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        t01Var28.a("tg://settings/notifications/groups");
        t01 t01Var29 = new t01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(7, r2Var));
        t01Var29.a("tg://settings/notifications/channels");
        final int i16 = 19;
        t01 t01Var30 = new t01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(i16, r2Var));
        t01 t01Var31 = new t01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        final int i17 = 13;
        t01 t01Var32 = new t01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01 t01Var33 = new t01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ci0(23, r2Var));
        t01Var33.a("tg://settings/notifications/new-contacts");
        t01 t01Var34 = new t01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var34.a("tg://settings/notifications/pinned-messages");
        t01 t01Var35 = new t01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var35.a("tg://settings/notifications/reset");
        t01 t01Var36 = new t01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i18 = 18;
        t01 t01Var37 = new t01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01 t01Var38 = new t01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i19 = 20;
        t01 t01Var39 = new t01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var39.a("tg://settings/privacy");
        final int i20 = 21;
        t01 t01Var40 = new t01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var40.a("tg://settings/privacy/2sv");
        final int i21 = 0;
        t01 t01Var41 = new t01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.q01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            r2Var.presentFragment(new t4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(r2Var2);
                            b02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(b02.X(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.hb(b02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.b.setText(spannableStringBuilder);
                            ybVar.b.setSingleLine(false);
                            ybVar.b.setMaxLines(2);
                            b02.b(ybVar, 2750).j();
                            break;
                        } else {
                            r2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        t01Var41.a("tg://settings/privacy/auto-delete");
        final int i22 = 22;
        t01 t01Var42 = new t01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var42.a("tg://settings/privacy/passcode");
        t01 t01Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            t01Var = t01Var40;
            final int i23 = 25;
            t01Var2 = new t01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.p01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(LiteMode.FLAGS_CHAT);
                            tb0Var.W(64);
                            break;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(LiteMode.FLAGS_CHAT);
                            tb0Var2.W(128);
                            break;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(LiteMode.FLAGS_CHAT);
                            tb0Var3.W(256);
                            break;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(LiteMode.FLAGS_CHAT);
                            tb0Var4.W(32768);
                            break;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            break;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            break;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            break;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((nb0) arrayList.get(i112)).f == 1) {
                                    tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            break;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
                            break;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            t01Var2.a("tg://settings/privacy/login-email");
        } else {
            t01Var = t01Var40;
            t01Var2 = null;
        }
        final int i24 = 26;
        t01 t01Var44 = new t01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var44.a("tg://settings/privacy/blocked");
        final int i25 = 27;
        t01 t01Var45 = new t01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i25) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var45.a("tg://settings/devices");
        final int i26 = 28;
        t01 t01Var46 = new t01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var46.a("tg://settings/privacy/phone-number/");
        final int i27 = 29;
        t01 t01Var47 = new t01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var47.a("tg://settings/privacy/last-seen");
        final int i28 = 0;
        t01 t01Var48 = new t01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var48.a("tg://settings/privacy/profile-photos");
        final int i29 = 1;
        t01 t01Var49 = new t01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var49.a("tg://settings/privacy/forwards");
        final int i30 = 2;
        t01 t01Var50 = new t01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var50.a("tg://settings/privacy/calls/p2p");
        final int i31 = 3;
        t01 t01Var51 = new t01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var51.a("tg://settings/privacy/calls");
        final int i32 = 5;
        t01 t01Var52 = new t01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i32) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var52.a("tg://settings/privacy/invites");
        final int i33 = 1;
        t01 t01Var53 = new t01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.q01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i33) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            r2Var.presentFragment(new t4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(r2Var2);
                            b02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(b02.X(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.hb(b02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.b.setText(spannableStringBuilder);
                            ybVar.b.setSingleLine(false);
                            ybVar.b.setMaxLines(2);
                            b02.b(ybVar, 2750).j();
                            break;
                        } else {
                            r2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        t01Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            t01Var3 = t01Var53;
            final int i34 = 7;
            t01Var4 = new t01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.r01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i34) {
                        case 0:
                            r2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            r2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            r2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            r2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            r2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                r2Var.presentFragment(new gg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            r2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            r2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            r2Var.presentFragment(new c7());
                            break;
                        case 24:
                            r2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            r2Var.presentFragment(new c7());
                            break;
                        case 27:
                            r2Var.presentFragment(new c7());
                            break;
                        case 28:
                            r2Var.presentFragment(new lu());
                            break;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            t01Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            t01Var3 = t01Var53;
            t01Var4 = null;
        }
        final int i35 = 8;
        t01 t01Var54 = new t01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var54.a("tg://settings/privacy/self-destruct");
        final int i36 = 9;
        t01 t01Var55 = new t01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i36) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i37 = 10;
        t01 t01Var56 = new t01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var56.a("tg://settings/privacy/active-websites");
        final int i38 = 11;
        t01 t01Var57 = new t01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i39 = 12;
        t01 t01Var58 = new t01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i40 = 13;
        t01 t01Var59 = new t01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i41 = 15;
        t01 t01Var60 = new t01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i42 = 16;
        t01 t01Var61 = new t01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i43 = 18;
        t01 t01Var62 = new t01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var62.a("tg://settings/devices");
        final int i44 = 19;
        t01 t01Var63 = new t01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var63.a("tg://settings/devices/terminate-sessions");
        final int i45 = 20;
        t01 t01Var64 = new t01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var64.a("tg://settings/devices/link-desktop");
        final int i46 = 21;
        t01 t01Var65 = new t01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var65.a("tg://settings/privacy/data-settings");
        final int i47 = 22;
        t01 t01Var66 = new t01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i48 = 23;
        t01 t01Var67 = new t01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var67.a("tg://settings/data/storage");
        final int i49 = 24;
        t01 t01Var68 = new t01(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 26;
        t01 t01Var69 = new t01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 27;
        t01 t01Var70 = new t01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i52 = 28;
        t01 t01Var71 = new t01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.r01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        r2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        r2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        r2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        r2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            r2Var.presentFragment(new gg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        r2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        r2Var.presentFragment(new c7());
                        break;
                    case 24:
                        r2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        r2Var.presentFragment(new c7());
                        break;
                    case 27:
                        r2Var.presentFragment(new c7());
                        break;
                    case 28:
                        r2Var.presentFragment(new lu());
                        break;
                    default:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        t01Var71.a("tg://settings/data/usage");
        final int i53 = 0;
        t01 t01Var72 = new t01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i54 = 1;
        t01 t01Var73 = new t01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i55 = 2;
        t01 t01Var74 = new t01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        t01 t01Var75 = new t01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        t01 t01Var76 = new t01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        t01Var76.a("tg://settings/data/auto-download/reset");
        final int i58 = 5;
        t01 t01Var77 = new t01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i59 = 7;
        t01 t01Var78 = new t01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i60 = 8;
        t01 t01Var79 = new t01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        t01 t01Var80 = new t01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        t01Var80.a("tg://settings/data/use-less-data");
        final int i62 = 10;
        t01 t01Var81 = new t01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i63 = 12;
        t01 t01Var82 = new t01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        t01Var82.a("tg://settings/data/proxy");
        final int i64 = 13;
        t01 t01Var83 = new t01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        t01Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i65 = 14;
        t01 t01Var84 = new t01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i66 = 15;
        t01 t01Var85 = new t01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        t01Var85.a("tg://settings/data/save-to-photos/chats");
        final int i67 = 16;
        t01 t01Var86 = new t01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.s01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        r2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        r2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        r2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        r2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        r2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        t01Var86.a("tg://settings/data/save-to-photos/groups");
        t01 t01Var87 = new t01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ci0(2, r2Var));
        t01Var87.a("tg://settings/data/save-to-photos/channels");
        t01 t01Var88 = new t01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ci0(3, r2Var));
        t01Var88.a("tg://settings/appearance/themes");
        t01 t01Var89 = new t01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(4, r2Var));
        t01Var89.a("tg://settings/appearance/text-size");
        t01 t01Var90 = new t01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(5, r2Var));
        t01Var90.a("tg://settings/appearance/wallpapers");
        t01 t01Var91 = new t01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ci0(6, r2Var));
        t01 t01Var92 = new t01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ci0(8, r2Var));
        t01 t01Var93 = new t01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(9, r2Var));
        t01 t01Var94 = new t01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(10, r2Var));
        t01 t01Var95 = new t01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ci0(11, r2Var));
        t01Var95.a("tg://settings/appearance/themes/create");
        t01 t01Var96 = new t01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(13, r2Var));
        t01Var96.a("tg://settings/appearance/message-corners");
        t01 t01Var97 = new t01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(14, r2Var));
        t01 t01Var98 = new t01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(15, r2Var));
        t01 t01Var99 = new t01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(16, r2Var));
        t01Var99.a("tg://settings/appearance/app-icon");
        t01 t01Var100 = new t01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(17, r2Var));
        t01 t01Var101 = new t01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(18, r2Var));
        t01Var101.a("tg://settings/appearance/tap-for-next-media");
        t01 t01Var102 = new t01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(20, r2Var));
        t01Var102.a("tg://settings/data/raise-to-listen");
        t01 t01Var103 = new t01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(21, r2Var));
        t01Var103.a("tg://settings/data/raise-to-speak");
        t01 t01Var104 = new t01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(22, r2Var));
        t01Var104.a("tg://settings/data/pause-music");
        t01 t01Var105 = new t01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(24, r2Var));
        t01 t01Var106 = new t01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(25, r2Var));
        t01 t01Var107 = new t01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(26, r2Var));
        t01 t01Var108 = new t01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ci0(27, r2Var));
        t01 t01Var109 = new t01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new ci0(28, r2Var));
        t01Var109.a("tg://settings/appearance/stickers-and-emoji");
        t01 t01Var110 = new t01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new ci0(29, r2Var));
        final int i68 = 0;
        t01 t01Var111 = new t01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        final int i69 = 2;
        t01 t01Var112 = new t01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        final int i70 = 3;
        t01 t01Var113 = new t01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i71 = 5;
        t01 t01Var114 = new t01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        final int i72 = 6;
        t01 t01Var115 = new t01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i73 = 7;
        t01 t01Var116 = new t01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        final int i74 = 8;
        t01 t01Var117 = new t01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i75 = 9;
        t01 t01Var118 = new t01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i76 = 10;
        t01 t01Var119 = new t01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        final int i77 = 11;
        t01 t01Var120 = new t01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i78 = 12;
        t01 t01Var121 = new t01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var121.a("tg://settings/folders");
        final int i79 = 21;
        t01 t01Var122 = new t01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i79) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            t01Var5 = t01Var122;
            t01Var6 = t01Var113;
            t01Var7 = t01Var115;
            t01Var8 = t01Var117;
            final int i80 = 2;
            t01Var9 = new t01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.p01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i80) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(LiteMode.FLAGS_CHAT);
                            tb0Var.W(64);
                            break;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(LiteMode.FLAGS_CHAT);
                            tb0Var2.W(128);
                            break;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(LiteMode.FLAGS_CHAT);
                            tb0Var3.W(256);
                            break;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(LiteMode.FLAGS_CHAT);
                            tb0Var4.W(32768);
                            break;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            break;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            break;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            break;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((nb0) arrayList.get(i112)).f == 1) {
                                    tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            break;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
                            break;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            t01Var5 = t01Var122;
            t01Var6 = t01Var113;
            t01Var7 = t01Var115;
            t01Var8 = t01Var117;
            t01Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i81 = 13;
            t01Var10 = new t01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.p01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i81) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(LiteMode.FLAGS_CHAT);
                            tb0Var.W(64);
                            break;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(LiteMode.FLAGS_CHAT);
                            tb0Var2.W(128);
                            break;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(LiteMode.FLAGS_CHAT);
                            tb0Var3.W(256);
                            break;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(LiteMode.FLAGS_CHAT);
                            tb0Var4.W(32768);
                            break;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            break;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            break;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            break;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((nb0) arrayList.get(i112)).f == 1) {
                                    tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            break;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
                            break;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            t01Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i82 = 23;
            t01Var11 = new t01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.p01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(LiteMode.FLAGS_CHAT);
                            tb0Var.W(64);
                            break;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(LiteMode.FLAGS_CHAT);
                            tb0Var2.W(128);
                            break;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(LiteMode.FLAGS_CHAT);
                            tb0Var3.W(256);
                            break;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(LiteMode.FLAGS_CHAT);
                            tb0Var4.W(32768);
                            break;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            break;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            break;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            break;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((nb0) arrayList.get(i112)).f == 1) {
                                    tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            break;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
                            break;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            t01Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i83 = 4;
            t01Var12 = new t01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.r01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            r2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            r2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            r2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            r2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            r2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                r2Var.presentFragment(new gg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            r2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            r2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            r2Var.presentFragment(new c7());
                            break;
                        case 24:
                            r2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            r2Var.presentFragment(new c7());
                            break;
                        case 27:
                            r2Var.presentFragment(new c7());
                            break;
                        case 28:
                            r2Var.presentFragment(new lu());
                            break;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            t01Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i84 = 14;
            t01Var13 = new t01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.r01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            r2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            r2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            r2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            r2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            r2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                r2Var.presentFragment(new gg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            r2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            r2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            r2Var.presentFragment(new c7());
                            break;
                        case 24:
                            r2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            r2Var.presentFragment(new c7());
                            break;
                        case 27:
                            r2Var.presentFragment(new c7());
                            break;
                        case 28:
                            r2Var.presentFragment(new lu());
                            break;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            t01Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i85 = 25;
            t01Var14 = new t01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.r01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            r2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            r2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            r2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            r2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 1, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            r2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                r2Var.presentFragment(new gg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            r2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 2, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            r2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            r2Var.presentFragment(new c7());
                            break;
                        case 24:
                            r2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 8, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            r2Var.presentFragment(new c7());
                            break;
                        case 27:
                            r2Var.presentFragment(new c7());
                            break;
                        case 28:
                            r2Var.presentFragment(new lu());
                            break;
                        default:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            t01Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i86 = 6;
            t01Var15 = new t01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.s01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            r2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            r2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            r2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 7:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            r2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            break;
                    }
                }
            });
        } else {
            t01Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i87 = 17;
            t01Var16 = new t01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.s01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            r2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            r2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            r2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 3, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 7:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            r2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            r2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            r2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 4, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            break;
                    }
                }
            });
        } else {
            t01Var16 = null;
        }
        t01 t01Var123 = F(currentAccount, 5) ? new t01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ci0(12, r2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i88 = 4;
            t01Var17 = new t01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.n01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            r2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            r2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            r2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            r2Var.presentFragment(new g21());
                            break;
                        case 12:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                            tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                            y0Var4.F();
                            r2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                            tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                            y0Var5.F();
                            r2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            r2Var.presentFragment(new tb0());
                            break;
                        case 19:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.W(3);
                            break;
                        case 20:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(3);
                            tb0Var2.W(1);
                            break;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(3);
                            tb0Var3.W(2);
                            break;
                        case 23:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            tb0Var8.W(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            tb0 tb0Var9 = new tb0();
                            r2Var.presentFragment(tb0Var9);
                            tb0Var9.X(LiteMode.FLAGS_CHAT);
                            tb0Var9.W(32);
                            break;
                    }
                }
            });
        } else {
            t01Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i89 = 14;
            t01Var18 = new t01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.n01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            r2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            r2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            r2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            r2Var.presentFragment(new g21());
                            break;
                        case 12:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                            tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                            y0Var4.F();
                            r2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                            tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                            y0Var5.F();
                            r2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            r2Var.presentFragment(new tb0());
                            break;
                        case 19:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.W(3);
                            break;
                        case 20:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(3);
                            tb0Var2.W(1);
                            break;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(3);
                            tb0Var3.W(2);
                            break;
                        case 23:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            tb0Var8.W(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            tb0 tb0Var9 = new tb0();
                            r2Var.presentFragment(tb0Var9);
                            tb0Var9.X(LiteMode.FLAGS_CHAT);
                            tb0Var9.W(32);
                            break;
                    }
                }
            });
        } else {
            t01Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i90 = 15;
            t01Var19 = new t01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.n01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            r2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            r2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            r2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            r2Var.presentFragment(new g21());
                            break;
                        case 12:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                            tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                            y0Var4.F();
                            r2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                            tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                            y0Var5.F();
                            r2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            r2Var.presentFragment(new tb0());
                            break;
                        case 19:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.W(3);
                            break;
                        case 20:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(3);
                            tb0Var2.W(1);
                            break;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(3);
                            tb0Var3.W(2);
                            break;
                        case 23:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            tb0Var8.W(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            tb0 tb0Var9 = new tb0();
                            r2Var.presentFragment(tb0Var9);
                            tb0Var9.X(LiteMode.FLAGS_CHAT);
                            tb0Var9.W(32);
                            break;
                    }
                }
            });
        } else {
            t01Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i91 = 16;
            t01Var20 = new t01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.n01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            r2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            r2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            r2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            r2Var.presentFragment(new g21());
                            break;
                        case 12:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                            tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                            y0Var4.F();
                            r2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                            tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                            y0Var5.F();
                            r2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            r2Var.presentFragment(new tb0());
                            break;
                        case 19:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.W(3);
                            break;
                        case 20:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(3);
                            tb0Var2.W(1);
                            break;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(3);
                            tb0Var3.W(2);
                            break;
                        case 23:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            tb0Var8.W(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            tb0 tb0Var9 = new tb0();
                            r2Var.presentFragment(tb0Var9);
                            tb0Var9.X(LiteMode.FLAGS_CHAT);
                            tb0Var9.W(32);
                            break;
                    }
                }
            });
        } else {
            t01Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i92 = 17;
            t01Var21 = new t01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.n01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i92) {
                        case 0:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            r2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            r2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            r2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            r2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            r2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            r2Var.presentFragment(new g21());
                            break;
                        case 12:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                            y0Var2.F();
                            r2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                            y0Var3.F();
                            r2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                            tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                            y0Var4.F();
                            r2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                            tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                            y0Var5.F();
                            r2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            r2Var.presentFragment(new tb0());
                            break;
                        case 19:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.W(3);
                            break;
                        case 20:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(3);
                            tb0Var2.W(1);
                            break;
                        case 21:
                            r2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(3);
                            tb0Var3.W(2);
                            break;
                        case 23:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                            tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            tb0Var8.W(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            tb0 tb0Var9 = new tb0();
                            r2Var.presentFragment(tb0Var9);
                            tb0Var9.X(LiteMode.FLAGS_CHAT);
                            tb0Var9.W(32);
                            break;
                    }
                }
            });
        } else {
            t01Var21 = null;
        }
        final int i93 = 18;
        t01 t01Var124 = new t01(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i93) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var124.a("tg://settings/power-saving");
        final int i94 = 19;
        t01 t01Var125 = new t01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i94) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var125.a("tg://settings/power-saving/stickers");
        final int i95 = 20;
        t01 t01Var126 = new t01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i95) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        final int i96 = 22;
        t01 t01Var127 = new t01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        final int i97 = 23;
        t01 t01Var128 = new t01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var128.a("tg://settings/power-saving/emoji");
        final int i98 = 25;
        t01 t01Var129 = new t01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        final int i99 = 26;
        t01 t01Var130 = new t01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        final int i100 = 27;
        t01 t01Var131 = new t01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        final int i101 = 28;
        t01 t01Var132 = new t01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var132.a("tg://settings/power-saving/effects");
        final int i102 = 29;
        t01 t01Var133 = new t01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i102) {
                    case 0:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        r2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        r2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 9, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        r2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        r2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        r2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        r2Var.presentFragment(new g21());
                        break;
                    case 12:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var3, 6, false);
                        y0Var2.F();
                        r2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var3 = new tg.y0(r2Var4, 7, false);
                        y0Var3.F();
                        r2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.r2 r2Var5 = r2Var;
                        tg.y0 y0Var4 = new tg.y0(r2Var5, 10, false);
                        y0Var4.F();
                        r2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.r2 r2Var6 = r2Var;
                        tg.y0 y0Var5 = new tg.y0(r2Var6, 12, false);
                        y0Var5.F();
                        r2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        r2Var.presentFragment(new tb0());
                        break;
                    case 19:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.W(3);
                        break;
                    case 20:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(3);
                        tb0Var2.W(1);
                        break;
                    case 21:
                        r2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(3);
                        tb0Var3.W(2);
                        break;
                    case 23:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var5.W(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var6.W(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.X(LiteMode.FLAGS_ANIMATED_EMOJI);
                        tb0Var7.W(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        tb0Var8.W(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        tb0 tb0Var9 = new tb0();
                        r2Var.presentFragment(tb0Var9);
                        tb0Var9.X(LiteMode.FLAGS_CHAT);
                        tb0Var9.W(32);
                        break;
                }
            }
        });
        t01Var133.a("tg://settings/power-saving/background");
        final int i103 = 0;
        t01 t01Var134 = new t01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i104 = 1;
        t01 t01Var135 = new t01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            final int i105 = 3;
            t01Var22 = new t01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.p01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i105) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(LiteMode.FLAGS_CHAT);
                            tb0Var.W(64);
                            break;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(LiteMode.FLAGS_CHAT);
                            tb0Var2.W(128);
                            break;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(LiteMode.FLAGS_CHAT);
                            tb0Var3.W(256);
                            break;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(LiteMode.FLAGS_CHAT);
                            tb0Var4.W(32768);
                            break;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            break;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            break;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            break;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((nb0) arrayList.get(i112)).f == 1) {
                                    tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            break;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
                            break;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            t01Var22 = null;
        }
        final int i106 = 4;
        t01 t01Var136 = new t01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i107 = 5;
        t01 t01Var137 = new t01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var137.a("tg://settings/power-saving/call-animations");
        final int i108 = 7;
        t01 t01Var138 = new t01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i108) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var138.a("tg://settings/power-saving/videos");
        final int i109 = 8;
        t01 t01Var139 = new t01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var139.a("tg://settings/power-saving/gifs");
        final int i110 = 9;
        t01 t01Var140 = new t01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var140.a("tg://settings/power-saving/transitions");
        final int i111 = 10;
        t01 t01Var141 = new t01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i112)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var141.a("tg://settings/language");
        final int i112 = 11;
        t01 t01Var142 = new t01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i1122)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i113 = 12;
            t01 t01Var143 = new t01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.p01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i113) {
                        case 0:
                            tb0 tb0Var = new tb0();
                            r2Var.presentFragment(tb0Var);
                            tb0Var.X(LiteMode.FLAGS_CHAT);
                            tb0Var.W(64);
                            break;
                        case 1:
                            tb0 tb0Var2 = new tb0();
                            r2Var.presentFragment(tb0Var2);
                            tb0Var2.X(LiteMode.FLAGS_CHAT);
                            tb0Var2.W(128);
                            break;
                        case 2:
                            r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            tb0 tb0Var3 = new tb0();
                            r2Var.presentFragment(tb0Var3);
                            tb0Var3.X(LiteMode.FLAGS_CHAT);
                            tb0Var3.W(256);
                            break;
                        case 4:
                            tb0 tb0Var4 = new tb0();
                            r2Var.presentFragment(tb0Var4);
                            tb0Var4.X(LiteMode.FLAGS_CHAT);
                            tb0Var4.W(32768);
                            break;
                        case 5:
                            tb0 tb0Var5 = new tb0();
                            r2Var.presentFragment(tb0Var5);
                            tb0Var5.W(512);
                            break;
                        case 6:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            tb0 tb0Var6 = new tb0();
                            r2Var.presentFragment(tb0Var6);
                            tb0Var6.W(1024);
                            break;
                        case 8:
                            tb0 tb0Var7 = new tb0();
                            r2Var.presentFragment(tb0Var7);
                            tb0Var7.W(2048);
                            break;
                        case 9:
                            tb0 tb0Var8 = new tb0();
                            r2Var.presentFragment(tb0Var8);
                            int i1122 = 0;
                            while (true) {
                                ArrayList arrayList = tb0Var8.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((nb0) arrayList.get(i1122)).f == 1) {
                                    tb0Var8.b.e1(new i2.r(tb0Var8, i1122, 13), 700, true);
                                    break;
                                } else {
                                    i1122++;
                                }
                            }
                        case 10:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            r2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                            tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                            y0Var.F();
                            r2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                            r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                            break;
                        case 15:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            r2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            r2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            r2Var.presentFragment(PasscodeActivity.l0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                            tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                            y0Var2.F();
                            r2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            r2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            r2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            sx0 sx0Var = new sx0();
                            sx0Var.getMessagesController().getBlockedPeers(true);
                            r2Var.presentFragment(sx0Var);
                            break;
                        case 27:
                            r2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            r2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            r2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            t01Var143.a("tg://settings/language/do-not-translate");
            t01Var43 = t01Var143;
        }
        final int i114 = 14;
        t01 t01Var144 = new t01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i1122)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var144.a("tg://settings/ask-question");
        final int i115 = 15;
        t01 t01Var145 = new t01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i1122)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var145.a("tg://settings/faq");
        final int i116 = 16;
        t01 t01Var146 = new t01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.p01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i116) {
                    case 0:
                        tb0 tb0Var = new tb0();
                        r2Var.presentFragment(tb0Var);
                        tb0Var.X(LiteMode.FLAGS_CHAT);
                        tb0Var.W(64);
                        break;
                    case 1:
                        tb0 tb0Var2 = new tb0();
                        r2Var.presentFragment(tb0Var2);
                        tb0Var2.X(LiteMode.FLAGS_CHAT);
                        tb0Var2.W(128);
                        break;
                    case 2:
                        r2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        tb0 tb0Var3 = new tb0();
                        r2Var.presentFragment(tb0Var3);
                        tb0Var3.X(LiteMode.FLAGS_CHAT);
                        tb0Var3.W(256);
                        break;
                    case 4:
                        tb0 tb0Var4 = new tb0();
                        r2Var.presentFragment(tb0Var4);
                        tb0Var4.X(LiteMode.FLAGS_CHAT);
                        tb0Var4.W(32768);
                        break;
                    case 5:
                        tb0 tb0Var5 = new tb0();
                        r2Var.presentFragment(tb0Var5);
                        tb0Var5.W(512);
                        break;
                    case 6:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        tb0 tb0Var6 = new tb0();
                        r2Var.presentFragment(tb0Var6);
                        tb0Var6.W(1024);
                        break;
                    case 8:
                        tb0 tb0Var7 = new tb0();
                        r2Var.presentFragment(tb0Var7);
                        tb0Var7.W(2048);
                        break;
                    case 9:
                        tb0 tb0Var8 = new tb0();
                        r2Var.presentFragment(tb0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = tb0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((nb0) arrayList.get(i1122)).f == 1) {
                                tb0Var8.b.e1(new i2.r(tb0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        r2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                        tg.y0 y0Var = new tg.y0(r2Var2, 0, false);
                        y0Var.F();
                        r2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.r2 r2Var3 = r2Var;
                        r2Var3.showDialog(org.telegram.ui.Components.g5.T(r2Var3, null));
                        break;
                    case 15:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        qf.d.r(r2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        r2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        r2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        r2Var.presentFragment(PasscodeActivity.l0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.r2 r2Var4 = r2Var;
                        tg.y0 y0Var2 = new tg.y0(r2Var4, 11, false);
                        y0Var2.F();
                        r2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        r2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        r2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        sx0 sx0Var = new sx0();
                        sx0Var.getMessagesController().getBlockedPeers(true);
                        r2Var.presentFragment(sx0Var);
                        break;
                    case 27:
                        r2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        r2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        r2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        t01Var146.a("tg://settings/privacy-policy");
        return new t01[]{t01Var23, t01Var24, t01Var25, t01Var26, t01Var27, t01Var28, t01Var29, t01Var30, t01Var31, t01Var32, t01Var33, t01Var34, t01Var35, t01Var36, t01Var37, t01Var38, t01Var39, t01Var, t01Var41, t01Var42, t01Var2, t01Var44, t01Var45, t01Var46, t01Var47, t01Var48, t01Var49, t01Var50, t01Var51, t01Var52, t01Var3, t01Var4, t01Var54, t01Var55, t01Var56, t01Var57, t01Var58, t01Var59, t01Var60, t01Var61, t01Var62, t01Var63, t01Var64, t01Var65, t01Var66, t01Var67, t01Var68, t01Var69, t01Var70, t01Var71, t01Var72, t01Var73, t01Var74, t01Var75, t01Var76, t01Var77, t01Var78, t01Var79, t01Var80, t01Var81, t01Var82, t01Var83, t01Var84, t01Var85, t01Var86, t01Var87, t01Var88, t01Var89, t01Var90, t01Var91, t01Var92, t01Var93, t01Var94, t01Var95, t01Var96, t01Var97, t01Var98, t01Var99, t01Var100, t01Var101, t01Var102, t01Var103, t01Var104, t01Var105, t01Var106, t01Var107, t01Var108, t01Var109, t01Var110, t01Var111, t01Var112, t01Var6, t01Var114, t01Var7, t01Var116, t01Var8, t01Var118, t01Var119, t01Var120, t01Var121, t01Var5, t01Var9, t01Var10, t01Var11, t01Var12, t01Var13, t01Var14, t01Var15, t01Var16, t01Var123, t01Var17, t01Var18, t01Var19, t01Var20, t01Var21, t01Var124, t01Var125, t01Var126, t01Var127, t01Var128, t01Var129, t01Var130, t01Var131, t01Var132, t01Var133, t01Var134, t01Var135, t01Var22, t01Var136, t01Var137, t01Var138, t01Var139, t01Var140, t01Var141, t01Var142, t01Var43, t01Var144, t01Var145, t01Var146};
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 0;
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
            a1.g.A(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof t01) {
                ((t01) obj2).g = i10;
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
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(MessagesController.getInstance(i10).faqSearchArray);
        }
        if (this.E != null || this.F) {
            return;
        }
        this.F = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = LocaleController.getString(R.string.TelegramFaqUrl);
        tL_messages_getWebPage.hash = 0;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new l(this, 21));
    }

    public final void I(String str) {
        this.y = str;
        if (this.x != null) {
            Utilities.searchQueue.cancelRunnable(this.x);
            this.x = null;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            fy0 fy0Var = new fy0(9, this, str);
            this.x = fy0Var;
            dispatchQueue2.postRunnable(fy0Var, 300L);
            return;
        }
        this.w = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.r2 r2Var = this.e;
        if (r2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) r2Var).O.b.getImageReceiver().startAnimation();
                ((ProfileActivity) this.e).O.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        l();
    }

    public final void J() {
        String[] strArr;
        t01 t01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            t01[] t01VarArr = this.c;
            if (i10 >= t01VarArr.length) {
                break;
            }
            t01 t01Var2 = t01VarArr[i10];
            if (t01Var2 != null) {
                hashMap.put(Integer.valueOf(t01Var2.f), this.c[i10]);
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
                    } else if (readInt322 == 1 && (t01Var = (t01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        t01Var.g = readInt32;
                        arrayList.add(t01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new bv(this));
    }

    @Override // s4.h0
    public final int h() {
        if (this.w) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.v;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.z3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
                return;
            } else {
                if (i11 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.q4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                return;
            }
        }
        org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
        if (this.w) {
            if (i10 >= this.r.size()) {
                int f7 = ic.a.f(1, i10, this.r);
                c7Var.a((CharSequence) this.n.get(this.r.size() + f7), ((MessagesController.FaqSearchResult) this.s.get(f7)).path, true, f7 < this.r.size() - 1);
                return;
            } else {
                t01 t01Var = (t01) this.r.get(i10);
                t01 t01Var2 = i10 > 0 ? (t01) this.r.get(i10 - 1) : null;
                c7Var.b((CharSequence) this.n.get(i10), t01Var.d, (t01Var2 == null || t01Var2.e != t01Var.e) ? t01Var.e : 0, i10 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= arrayList.size()) {
            int f10 = ic.a.f(1, i10, arrayList);
            MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) this.d.get(f10);
            c7Var.a(faqSearchResult.title, faqSearchResult.path, true, f10 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof t01) {
            t01 t01Var3 = (t01) obj;
            c7Var.a(t01Var3.a, t01Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            c7Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View q4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.q4(context, 16) : new org.telegram.ui.Cells.z3(context, null) : new org.telegram.ui.Cells.c7(context);
        q4Var.setLayoutParams(new s4.q0(-1, -2));
        return new org.telegram.ui.Components.vl0(q4Var);
    }
}
