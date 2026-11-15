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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class sw0 extends org.telegram.ui.Components.tj0 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public rw0[] c;
    public final org.telegram.ui.ActionBar.e2 e;
    public final int f;
    public final Context h;
    public boolean x;
    public mp0 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public sw0(Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        this.e = e2Var;
        this.f = e2Var.getCurrentAccount();
        this.h = context;
        this.c = H(e2Var);
        J();
    }

    public static boolean F(int i7, int i10) {
        if (!org.telegram.messenger.np.s1(i7).D3() || org.telegram.messenger.m10.i(i7).q()) {
            return i10 == -1 || org.telegram.messenger.np.s1(i7).O0.get(i10, -1) != -1;
        }
        return false;
    }

    public static rw0[] H(final org.telegram.ui.ActionBar.e2 e2Var) {
        rw0 rw0Var;
        rw0 rw0Var2;
        rw0 rw0Var3;
        rw0 rw0Var4;
        rw0 rw0Var5;
        rw0 rw0Var6;
        rw0 rw0Var7;
        rw0 rw0Var8;
        rw0 rw0Var9;
        rw0 rw0Var10;
        rw0 rw0Var11;
        rw0 rw0Var12;
        rw0 rw0Var13;
        rw0 rw0Var14;
        rw0 rw0Var15;
        rw0 rw0Var16;
        rw0 rw0Var17;
        rw0 rw0Var18;
        rw0 rw0Var19;
        rw0 rw0Var20;
        rw0 rw0Var21;
        rw0 rw0Var22;
        final int currentAccount = e2Var.getCurrentAccount();
        int i7 = 23;
        rw0 rw0Var23 = new rw0(500, org.telegram.messenger.hd.L0(2131751264), 0, new mp0(i7, e2Var, e2Var.getResourceProvider()));
        final int i10 = 24;
        rw0 rw0Var24 = new rw0(501, org.telegram.messenger.hd.L0(2131752537), 0, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                int i12 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i11) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i12 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i12)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i12, 15), 700, true);
                                break;
                            } else {
                                i12++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var24.a("tg://settings/edit/change-number");
        final int i11 = 6;
        rw0 rw0Var25 = new rw0(502, org.telegram.messenger.hd.L0(2131754468), 0, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 4) {
                                i12 = -1;
                            } else if (org.telegram.messenger.m10.i(i12).p()) {
                                i12++;
                            }
                        }
                        if (i12 >= 0) {
                            e2Var.presentFragment(new ce0(i12));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var25.a("tg://settings/edit/add-account");
        final int i12 = 17;
        final int i13 = 1;
        rw0 rw0Var26 = new rw0(1, org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var26.a("tg://settings/notifications");
        final int i14 = 29;
        rw0 rw0Var27 = new rw0(2, org.telegram.messenger.hd.L0(2131747878), org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var27.a("tg://settings/notifications/private-chats");
        final int i15 = 11;
        rw0 rw0Var28 = new rw0(3, org.telegram.messenger.hd.L0(2131747907), org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        rw0Var28.a("tg://settings/notifications/groups");
        rw0 rw0Var29 = new rw0(4, org.telegram.messenger.hd.L0(2131747921), org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new tf0(7, e2Var));
        rw0Var29.a("tg://settings/notifications/channels");
        final int i16 = 19;
        rw0 rw0Var30 = new rw0(5, org.telegram.messenger.hd.L0(2131743279), "callsSectionRow", org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new tf0(i16, e2Var));
        rw0 rw0Var31 = new rw0(6, org.telegram.messenger.hd.L0(2131753733), "badgeNumberSection", org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        final int i17 = 13;
        rw0 rw0Var32 = new rw0(7, org.telegram.messenger.hd.L0(2131749219), "inappSectionRow", org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0 rw0Var33 = new rw0(8, org.telegram.messenger.hd.L0(2131751790), "contactJoinedRow", org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new tf0(i7, e2Var));
        rw0Var33.a("tg://settings/notifications/new-contacts");
        rw0 rw0Var34 = new rw0(9, org.telegram.messenger.hd.L0(2131747228), "pinnedMessageRow", org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var34.a("tg://settings/notifications/pinned-messages");
        rw0 rw0Var35 = new rw0(10, org.telegram.messenger.hd.L0(2131746112), "resetNotificationsRow", org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i11;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var35.a("tg://settings/notifications/reset");
        rw0 rw0Var36 = new rw0(11, org.telegram.messenger.hd.L0(2131747876), "notificationsServiceRow", org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i12;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i18 = 18;
        rw0 rw0Var37 = new rw0(12, org.telegram.messenger.hd.L0(2131747875), "notificationsServiceConnectionRow", org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i18;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0 rw0Var38 = new rw0(13, org.telegram.messenger.hd.L0(2131746275), "repeatRow", org.telegram.messenger.hd.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i16;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i19 = 20;
        rw0 rw0Var39 = new rw0(100, org.telegram.messenger.hd.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i19;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var39.a("tg://settings/privacy");
        final int i20 = 21;
        rw0 rw0Var40 = new rw0(org.telegram.messenger.ns.u1, org.telegram.messenger.hd.L0(2131743938), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i20;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var40.a("tg://settings/privacy/2sv");
        final int i21 = 0;
        rw0 rw0Var41 = new rw0(org.telegram.messenger.ns.I1, org.telegram.messenger.hd.L0(2131753850), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i21;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                int i23 = currentAccount;
                switch (i22) {
                    case 0:
                        if (org.telegram.messenger.m10.i(i23).q0 >= 0) {
                            e2Var2.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.m10.i(i23).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(e2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(a02.W(), null);
                            fbVar.d(R.raw.voip_muted, new String[0]);
                            String M0 = org.telegram.messenger.hd.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new hi.ha(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            fbVar.b.setText(spannableStringBuilder);
                            fbVar.b.setSingleLine(false);
                            fbVar.b.setMaxLines(2);
                            a02.b(fbVar, 2750).j();
                            break;
                        } else {
                            e2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        rw0Var41.a("tg://settings/privacy/auto-delete");
        final int i22 = 22;
        rw0 rw0Var42 = new rw0(org.telegram.messenger.ns.t1, org.telegram.messenger.hd.L0(2131747657), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i22;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var42.a("tg://settings/privacy/passcode");
        rw0 rw0Var43 = null;
        if (org.telegram.messenger.gz.m1) {
            rw0Var = rw0Var40;
            final int i23 = 25;
            rw0Var2 = new rw0(org.telegram.messenger.ns.J1, org.telegram.messenger.hd.L0(2131751202), "emailLoginRow", org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i23;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i112) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            break;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            break;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            break;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            break;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            break;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            break;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            break;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((s90) arrayList.get(i122)).f == 1) {
                                    x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            break;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            break;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            break;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            break;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            rw0Var2.a("tg://settings/privacy/login-email");
        } else {
            rw0Var = rw0Var40;
            rw0Var2 = null;
        }
        final int i24 = 26;
        rw0 rw0Var44 = new rw0(101, org.telegram.messenger.hd.L0(2131753681), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i24;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var44.a("tg://settings/privacy/blocked");
        final int i25 = 27;
        rw0 rw0Var45 = new rw0(org.telegram.messenger.ns.v1, org.telegram.messenger.hd.L0(2131745551), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i25;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var45.a("tg://settings/devices");
        final int i26 = 28;
        rw0 rw0Var46 = new rw0(org.telegram.messenger.ns.q1, org.telegram.messenger.hd.L0(2131746790), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i26;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var46.a("tg://settings/privacy/phone-number/");
        final int i27 = 29;
        rw0 rw0Var47 = new rw0(org.telegram.messenger.ns.n1, org.telegram.messenger.hd.L0(2131746815), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i27;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var47.a("tg://settings/privacy/last-seen");
        final int i28 = 0;
        rw0 rw0Var48 = new rw0(org.telegram.messenger.ns.o1, org.telegram.messenger.hd.L0(2131746777), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var48.a("tg://settings/privacy/profile-photos");
        final int i29 = 1;
        rw0 rw0Var49 = new rw0(org.telegram.messenger.ns.p1, org.telegram.messenger.hd.L0(2131746837), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var49.a("tg://settings/privacy/forwards");
        final int i30 = 2;
        rw0 rw0Var50 = new rw0(org.telegram.messenger.ns.G1, org.telegram.messenger.hd.L0(2131746800), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var50.a("tg://settings/privacy/calls/p2p");
        final int i31 = 3;
        rw0 rw0Var51 = new rw0(org.telegram.messenger.ns.r1, org.telegram.messenger.hd.L0(2131752596), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var51.a("tg://settings/privacy/calls");
        final int i32 = 5;
        rw0 rw0Var52 = new rw0(org.telegram.messenger.ns.s1, org.telegram.messenger.hd.L0(2131746817), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i32) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var52.a("tg://settings/privacy/invites");
        final int i33 = 1;
        rw0 rw0Var53 = new rw0(org.telegram.messenger.ns.H1, org.telegram.messenger.hd.L0(2131746758), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i222 = i33;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                int i232 = currentAccount;
                switch (i222) {
                    case 0:
                        if (org.telegram.messenger.m10.i(i232).q0 >= 0) {
                            e2Var2.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.m10.i(i232).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(e2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(a02.W(), null);
                            fbVar.d(R.raw.voip_muted, new String[0]);
                            String M0 = org.telegram.messenger.hd.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new hi.ha(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            fbVar.b.setText(spannableStringBuilder);
                            fbVar.b.setSingleLine(false);
                            fbVar.b.setMaxLines(2);
                            a02.b(fbVar, 2750).j();
                            break;
                        } else {
                            e2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        rw0Var53.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.np.s1(currentAccount).Z3) {
            rw0Var3 = rw0Var53;
            final int i34 = 7;
            rw0Var4 = new rw0(org.telegram.messenger.ns.F1, org.telegram.messenger.hd.L0(2131754171), "newChatsRow", org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i34) {
                        case 0:
                            e2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            e2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            e2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            e2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            e2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (org.telegram.messenger.m10.i(i122).p()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                e2Var.presentFragment(new ce0(i122));
                                break;
                            }
                            break;
                        case 7:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            e2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            e2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            e2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            e2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            e2Var.presentFragment(new y6());
                            break;
                        case 24:
                            e2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            e2Var.presentFragment(new y6());
                            break;
                        case 27:
                            e2Var.presentFragment(new y6());
                            break;
                        case 28:
                            e2Var.presentFragment(new nt());
                            break;
                        default:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            rw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            rw0Var3 = rw0Var53;
            rw0Var4 = null;
        }
        final int i35 = 8;
        rw0 rw0Var54 = new rw0(org.telegram.messenger.ns.x1, org.telegram.messenger.hd.L0(2131751596), "deleteAccountRow", org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var54.a("tg://settings/privacy/self-destruct");
        final int i36 = 9;
        rw0 rw0Var55 = new rw0(org.telegram.messenger.ns.y1, org.telegram.messenger.hd.L0(2131746797), "paymentsClearRow", org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i36) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i37 = 10;
        rw0 rw0Var56 = new rw0(org.telegram.messenger.ns.z1, org.telegram.messenger.hd.L0(2131742911), org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var56.a("tg://settings/privacy/active-websites");
        final int i38 = 11;
        rw0 rw0Var57 = new rw0(org.telegram.messenger.ns.A1, org.telegram.messenger.hd.L0(2131744296), "contactsDeleteRow", org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i39 = 12;
        rw0 rw0Var58 = new rw0(org.telegram.messenger.ns.B1, org.telegram.messenger.hd.L0(2131744298), "contactsSyncRow", org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i40 = 13;
        rw0 rw0Var59 = new rw0(org.telegram.messenger.ns.C1, org.telegram.messenger.hd.L0(2131744412), "contactsSuggestRow", org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i41 = 15;
        rw0 rw0Var60 = new rw0(org.telegram.messenger.ns.D1, org.telegram.messenger.hd.L0(2131748689), "secretMapRow", org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i42 = 16;
        rw0 rw0Var61 = new rw0(org.telegram.messenger.ns.E1, org.telegram.messenger.hd.L0(2131745684), "secretWebpageRow", org.telegram.messenger.hd.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i43 = 18;
        rw0 rw0Var62 = new rw0(120, org.telegram.messenger.hd.L0(2131751455), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var62.a("tg://settings/devices");
        final int i44 = 19;
        rw0 rw0Var63 = new rw0(org.telegram.messenger.ns.F1, org.telegram.messenger.hd.L0(2131744208), "terminateAllSessionsRow", org.telegram.messenger.hd.L0(2131751455), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var63.a("tg://settings/devices/terminate-sessions");
        final int i45 = 20;
        rw0 rw0Var64 = new rw0(org.telegram.messenger.ns.G1, org.telegram.messenger.hd.L0(2131748917), org.telegram.messenger.hd.L0(2131751455), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var64.a("tg://settings/devices/link-desktop");
        final int i46 = 21;
        rw0 rw0Var65 = new rw0(org.telegram.messenger.ns.e3, org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var65.a("tg://settings/privacy/data-settings");
        final int i47 = 22;
        rw0 rw0Var66 = new rw0(org.telegram.messenger.ns.f3, org.telegram.messenger.hd.L0(2131751676), "usageSectionRow", org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i48 = 23;
        rw0 rw0Var67 = new rw0(org.telegram.messenger.ns.g3, org.telegram.messenger.hd.L0(2131744816), org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var67.a("tg://settings/data/storage");
        final int i49 = 24;
        rw0 rw0Var68 = new rw0(203, org.telegram.messenger.hd.L0(2131749060), "keepMediaRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131744816), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 26;
        rw0 rw0Var69 = new rw0(org.telegram.messenger.ns.i3, org.telegram.messenger.hd.L0(2131752075), "cacheRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131744816), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 27;
        rw0 rw0Var70 = new rw0(org.telegram.messenger.ns.j3, org.telegram.messenger.hd.L0(2131748774), "databaseRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131744816), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i52 = 28;
        rw0 rw0Var71 = new rw0(org.telegram.messenger.ns.k3, org.telegram.messenger.hd.L0(2131748298), org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        e2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        e2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        e2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        e2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.m10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            e2Var.presentFragment(new ce0(i122));
                            break;
                        }
                        break;
                    case 7:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        e2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        e2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        e2Var.presentFragment(new y6());
                        break;
                    case 24:
                        e2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        e2Var.presentFragment(new y6());
                        break;
                    case 27:
                        e2Var.presentFragment(new y6());
                        break;
                    case 28:
                        e2Var.presentFragment(new nt());
                        break;
                    default:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        rw0Var71.a("tg://settings/data/usage");
        final int i53 = 0;
        rw0 rw0Var72 = new rw0(org.telegram.messenger.ns.l3, org.telegram.messenger.hd.L0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i54 = 1;
        rw0 rw0Var73 = new rw0(208, org.telegram.messenger.hd.L0(2131742884), org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i55 = 2;
        rw0 rw0Var74 = new rw0(org.telegram.messenger.ns.m3, org.telegram.messenger.hd.L0(2131742886), org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        rw0 rw0Var75 = new rw0(org.telegram.messenger.ns.n3, org.telegram.messenger.hd.L0(2131742885), org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        rw0 rw0Var76 = new rw0(org.telegram.messenger.ns.o3, org.telegram.messenger.hd.L0(2131746111), "resetDownloadRow", org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        rw0Var76.a("tg://settings/data/auto-download/reset");
        final int i58 = 5;
        rw0 rw0Var77 = new rw0(org.telegram.messenger.ns.s3, org.telegram.messenger.hd.L0(2131744438), "streamSectionRow", org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i59 = 7;
        rw0 rw0Var78 = new rw0(org.telegram.messenger.ns.t3, org.telegram.messenger.hd.L0(2131751144), "enableStreamRow", org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i60 = 8;
        rw0 rw0Var79 = new rw0(org.telegram.messenger.ns.u3, org.telegram.messenger.hd.L0(2131752596), "callsSectionRow", org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        rw0 rw0Var80 = new rw0(org.telegram.messenger.ns.v3, org.telegram.messenger.hd.L0(2131743229), "useLessDataForCallsRow", org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        rw0Var80.a("tg://settings/data/use-less-data");
        final int i62 = 10;
        rw0 rw0Var81 = new rw0(org.telegram.messenger.ns.w3, org.telegram.messenger.hd.L0(2131743258), "quickRepliesRow", org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i63 = 12;
        rw0 rw0Var82 = new rw0(org.telegram.messenger.ns.x3, org.telegram.messenger.hd.L0(2131746601), org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        rw0Var82.a("tg://settings/data/proxy");
        final int i64 = 13;
        rw0 rw0Var83 = new rw0(org.telegram.messenger.ns.w1, org.telegram.messenger.hd.L0(2131746841), "clearDraftsRow", org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        rw0Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i65 = 14;
        rw0 rw0Var84 = new rw0(org.telegram.messenger.ns.z3, org.telegram.messenger.hd.L0(2131745929), "saveToGallerySectionRow", org.telegram.messenger.hd.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i66 = 15;
        rw0 rw0Var85 = new rw0(org.telegram.messenger.ns.A3, org.telegram.messenger.hd.L0(2131745919), "saveToGalleryPeerRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131745929), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        rw0Var85.a("tg://settings/data/save-to-photos/chats");
        final int i67 = 16;
        rw0 rw0Var86 = new rw0(org.telegram.messenger.ns.B3, org.telegram.messenger.hd.L0(2131745926), "saveToGalleryGroupsRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131745929), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        e2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        e2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        e2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        e2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        e2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        rw0Var86.a("tg://settings/data/save-to-photos/groups");
        rw0 rw0Var87 = new rw0(org.telegram.messenger.ns.C3, org.telegram.messenger.hd.L0(2131745928), "saveToGalleryChannelsRow", org.telegram.messenger.hd.L0(2131751677), org.telegram.messenger.hd.L0(2131745929), R.drawable.msg2_data, new tf0(2, e2Var));
        rw0Var87.a("tg://settings/data/save-to-photos/channels");
        rw0 rw0Var88 = new rw0(org.telegram.messenger.ns.X4, org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(3, e2Var));
        rw0Var88.a("tg://settings/appearance/themes");
        rw0 rw0Var89 = new rw0(org.telegram.messenger.ns.Y4, org.telegram.messenger.hd.L0(2131744191), "textSizeHeaderRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(4, e2Var));
        rw0Var89.a("tg://settings/appearance/text-size");
        rw0 rw0Var90 = new rw0(org.telegram.messenger.ns.Z4, org.telegram.messenger.hd.L0(2131752550), org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(5, e2Var));
        rw0Var90.a("tg://settings/appearance/wallpapers");
        rw0 rw0Var91 = new rw0(org.telegram.messenger.ns.a5, org.telegram.messenger.hd.L0(2131745538), null, org.telegram.messenger.hd.L0(2131752210), org.telegram.messenger.hd.L0(2131752244), R.drawable.msg2_discussion, new tf0(6, e2Var));
        rw0 rw0Var92 = new rw0(org.telegram.messenger.ns.b5, org.telegram.messenger.hd.L0(2131746108), "resetRow", org.telegram.messenger.hd.L0(2131752210), org.telegram.messenger.hd.L0(2131752244), R.drawable.msg2_discussion, new tf0(8, e2Var));
        rw0 rw0Var93 = new rw0(org.telegram.messenger.ns.d5, org.telegram.messenger.hd.L0(2131752011), "themeHeaderRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(9, e2Var));
        rw0 rw0Var94 = new rw0(org.telegram.messenger.ns.q5, org.telegram.messenger.hd.L0(2131752878), null, org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(10, e2Var));
        rw0 rw0Var95 = new rw0(org.telegram.messenger.ns.r5, org.telegram.messenger.hd.L0(2131751712), "createNewThemeRow", org.telegram.messenger.hd.L0(2131752210), org.telegram.messenger.hd.L0(2131752878), R.drawable.msg2_discussion, new tf0(11, e2Var));
        rw0Var95.a("tg://settings/appearance/themes/create");
        rw0 rw0Var96 = new rw0(org.telegram.messenger.ns.s5, org.telegram.messenger.hd.L0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(13, e2Var));
        rw0Var96.a("tg://settings/appearance/message-corners");
        rw0 rw0Var97 = new rw0(org.telegram.messenger.ns.t5, org.telegram.messenger.hd.L0(2131752225), "chatListHeaderRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(14, e2Var));
        rw0 rw0Var98 = new rw0(org.telegram.messenger.ns.u5, org.telegram.messenger.hd.L0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(15, e2Var));
        rw0 rw0Var99 = new rw0(org.telegram.messenger.ns.v5, org.telegram.messenger.hd.L0(2131754240), "appIconHeaderRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(16, e2Var));
        rw0Var99.a("tg://settings/appearance/app-icon");
        rw0 rw0Var100 = new rw0(org.telegram.messenger.ns.c5, org.telegram.messenger.hd.L0(2131753784), org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(17, e2Var));
        rw0 rw0Var101 = new rw0(org.telegram.messenger.ns.z5, org.telegram.messenger.hd.L0(2131748249), "nextMediaTapRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(18, e2Var));
        rw0Var101.a("tg://settings/appearance/tap-for-next-media");
        rw0 rw0Var102 = new rw0(org.telegram.messenger.ns.y5, org.telegram.messenger.hd.L0(2131746427), "raiseToListenRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(20, e2Var));
        rw0Var102.a("tg://settings/data/raise-to-listen");
        rw0 rw0Var103 = new rw0(org.telegram.messenger.ns.h5, org.telegram.messenger.hd.L0(2131746425), "raiseToSpeakRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(21, e2Var));
        rw0Var103.a("tg://settings/data/raise-to-speak");
        rw0 rw0Var104 = new rw0(org.telegram.messenger.ns.x5, org.telegram.messenger.hd.L0(2131747432), "pauseOnMediaRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(22, e2Var));
        rw0Var104.a("tg://settings/data/pause-music");
        rw0 rw0Var105 = new rw0(org.telegram.messenger.ns.w5, org.telegram.messenger.hd.L0(2131748439), "bluetoothScoRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(24, e2Var));
        rw0 rw0Var106 = new rw0(org.telegram.messenger.ns.f5, org.telegram.messenger.hd.L0(2131751438), "directShareRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(25, e2Var));
        rw0 rw0Var107 = new rw0(org.telegram.messenger.ns.i5, org.telegram.messenger.hd.L0(2131745632), "sendByEnterRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(26, e2Var));
        rw0 rw0Var108 = new rw0(org.telegram.messenger.ns.p5, org.telegram.messenger.hd.L0(2131751367), "distanceRow", org.telegram.messenger.hd.L0(2131752210), R.drawable.msg2_discussion, new tf0(27, e2Var));
        rw0 rw0Var109 = new rw0(600, org.telegram.messenger.hd.L0(2131744857), R.drawable.msg2_sticker, new tf0(28, e2Var));
        rw0Var109.a("tg://settings/appearance/stickers-and-emoji");
        rw0 rw0Var110 = new rw0(601, org.telegram.messenger.hd.L0(2131744402), "suggestRow", org.telegram.messenger.hd.L0(2131744857), R.drawable.msg2_sticker, new tf0(29, e2Var));
        final int i68 = 0;
        rw0 rw0Var111 = new rw0(602, org.telegram.messenger.hd.L0(2131750833), "featuredStickersHeaderRow", org.telegram.messenger.hd.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        final int i69 = 2;
        rw0 rw0Var112 = new rw0(603, org.telegram.messenger.hd.L0(2131748679), null, org.telegram.messenger.hd.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        final int i70 = 3;
        rw0 rw0Var113 = new rw0(604, org.telegram.messenger.hd.L0(2131754128), null, org.telegram.messenger.hd.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i71 = 5;
        rw0 rw0Var114 = new rw0(605, org.telegram.messenger.hd.L0(2131754133), null, org.telegram.messenger.hd.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        final int i72 = 6;
        rw0 rw0Var115 = new rw0(606, org.telegram.messenger.hd.L0(2131749034), "largeEmojiRow", org.telegram.messenger.hd.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i73 = 7;
        rw0 rw0Var116 = new rw0(607, org.telegram.messenger.hd.L0(2131748722), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748850), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        final int i74 = 8;
        rw0 rw0Var117 = new rw0(608, org.telegram.messenger.hd.L0(2131751196), null, org.telegram.messenger.hd.L0(2131744857), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i75 = 9;
        rw0 rw0Var118 = new rw0(609, org.telegram.messenger.hd.L0(2131744416), "suggestAnimatedEmojiRow", org.telegram.messenger.hd.L0(2131744857), org.telegram.messenger.hd.L0(2131751196), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i76 = 10;
        rw0 rw0Var119 = new rw0(610, org.telegram.messenger.hd.L0(2131750835), "featuredStickersHeaderRow", org.telegram.messenger.hd.L0(2131744857), org.telegram.messenger.hd.L0(2131751196), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        final int i77 = 11;
        rw0 rw0Var120 = new rw0(611, org.telegram.messenger.hd.L0(2131751350), null, org.telegram.messenger.hd.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i78 = 12;
        rw0 rw0Var121 = new rw0(700, org.telegram.messenger.hd.L0(2131750696), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var121.a("tg://settings/folders");
        final int i79 = 21;
        rw0 rw0Var122 = new rw0(701, org.telegram.messenger.hd.L0(2131751716), "createFilterRow", org.telegram.messenger.hd.L0(2131750696), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i79) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            rw0Var5 = rw0Var122;
            rw0Var6 = rw0Var113;
            rw0Var7 = rw0Var115;
            final int i80 = 2;
            rw0Var8 = rw0Var117;
            rw0Var9 = new rw0(800, org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i80;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i112) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            break;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            break;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            break;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            break;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            break;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            break;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            break;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((s90) arrayList.get(i122)).f == 1) {
                                    x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            break;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            break;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            break;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            break;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            rw0Var5 = rw0Var122;
            rw0Var6 = rw0Var113;
            rw0Var7 = rw0Var115;
            rw0Var8 = rw0Var117;
            rw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i81 = 13;
            rw0Var10 = new rw0(801, org.telegram.messenger.hd.L0(2131746998), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i81;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i112) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            break;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            break;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            break;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            break;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            break;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            break;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            break;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((s90) arrayList.get(i122)).f == 1) {
                                    x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            break;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            break;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            break;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            break;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            rw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i82 = 23;
            rw0Var11 = new rw0(802, org.telegram.messenger.hd.L0(2131747007), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i82;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i112) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            break;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            break;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            break;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            break;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            break;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            break;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            break;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((s90) arrayList.get(i122)).f == 1) {
                                    x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            break;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            break;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            break;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            break;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            rw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i83 = 4;
            rw0Var12 = new rw0(803, org.telegram.messenger.hd.L0(2131746964), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            e2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            e2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            e2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            e2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            e2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (org.telegram.messenger.m10.i(i122).p()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                e2Var.presentFragment(new ce0(i122));
                                break;
                            }
                            break;
                        case 7:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            e2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            e2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            e2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            e2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            e2Var.presentFragment(new y6());
                            break;
                        case 24:
                            e2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            e2Var.presentFragment(new y6());
                            break;
                        case 27:
                            e2Var.presentFragment(new y6());
                            break;
                        case 28:
                            e2Var.presentFragment(new nt());
                            break;
                        default:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            rw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i84 = 14;
            rw0Var13 = new rw0(804, org.telegram.messenger.hd.L0(2131747012), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            e2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            e2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            e2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            e2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            e2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (org.telegram.messenger.m10.i(i122).p()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                e2Var.presentFragment(new ce0(i122));
                                break;
                            }
                            break;
                        case 7:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            e2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            e2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            e2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            e2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            e2Var.presentFragment(new y6());
                            break;
                        case 24:
                            e2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            e2Var.presentFragment(new y6());
                            break;
                        case 27:
                            e2Var.presentFragment(new y6());
                            break;
                        case 28:
                            e2Var.presentFragment(new nt());
                            break;
                        default:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            rw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i85 = 25;
            rw0Var14 = new rw0(805, org.telegram.messenger.hd.L0(2131746962), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            e2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            e2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            e2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            e2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 1, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            e2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (org.telegram.messenger.m10.i(i122).p()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                e2Var.presentFragment(new ce0(i122));
                                break;
                            }
                            break;
                        case 7:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            e2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 2, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            e2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            e2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            e2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            e2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            e2Var.presentFragment(new y6());
                            break;
                        case 24:
                            e2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 8, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            e2Var.presentFragment(new y6());
                            break;
                        case 27:
                            e2Var.presentFragment(new y6());
                            break;
                        case 28:
                            e2Var.presentFragment(new nt());
                            break;
                        default:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            rw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i86 = 6;
            rw0Var15 = new rw0(806, org.telegram.messenger.hd.L0(2131746992), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.qw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            e2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            e2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            e2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 7:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            e2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            break;
                    }
                }
            });
        } else {
            rw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i87 = 17;
            rw0Var16 = new rw0(807, org.telegram.messenger.hd.L0(2131746983), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.qw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            e2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            e2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            e2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 3, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 7:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            e2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            e2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            e2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 4, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            break;
                    }
                }
            });
        } else {
            rw0Var16 = null;
        }
        rw0 rw0Var123 = F(currentAccount, 5) ? new rw0(808, org.telegram.messenger.hd.L0(2131746976), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new tf0(12, e2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i88 = 4;
            rw0Var17 = new rw0(809, org.telegram.messenger.hd.L0(2131747025), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.mw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            e2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            e2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            e2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            x90 x90Var = new x90();
                            e2Var.presentFragment(x90Var);
                            x90Var.b0(3);
                            x90Var.a0(2);
                            break;
                        case 8:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            e2Var.presentFragment(new zx0());
                            break;
                        case 12:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                            ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                            x0Var4.K0();
                            e2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                            ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                            x0Var5.K0();
                            e2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            e2Var.presentFragment(new x90());
                            break;
                        case 19:
                            x90 x90Var2 = new x90();
                            e2Var.presentFragment(x90Var2);
                            x90Var2.a0(3);
                            break;
                        case 20:
                            x90 x90Var3 = new x90();
                            e2Var.presentFragment(x90Var3);
                            x90Var3.b0(3);
                            x90Var3.a0(1);
                            break;
                        case 21:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            x90 x90Var4 = new x90();
                            e2Var.presentFragment(x90Var4);
                            x90Var4.b0(3);
                            x90Var4.a0(2);
                            break;
                        case 23:
                            x90 x90Var5 = new x90();
                            e2Var.presentFragment(x90Var5);
                            x90Var5.a0(28700);
                            break;
                        case 24:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            x90 x90Var6 = new x90();
                            e2Var.presentFragment(x90Var6);
                            x90Var6.b0(28700);
                            x90Var6.a0(16388);
                            break;
                        case 26:
                            x90 x90Var7 = new x90();
                            e2Var.presentFragment(x90Var7);
                            x90Var7.b0(28700);
                            x90Var7.a0(8200);
                            break;
                        case 27:
                            x90 x90Var8 = new x90();
                            e2Var.presentFragment(x90Var8);
                            x90Var8.b0(28700);
                            x90Var8.a0(4112);
                            break;
                        case 28:
                            x90 x90Var9 = new x90();
                            e2Var.presentFragment(x90Var9);
                            x90Var9.a0(360928);
                            break;
                        default:
                            x90 x90Var10 = new x90();
                            e2Var.presentFragment(x90Var10);
                            x90Var10.b0(360928);
                            x90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            rw0Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i89 = 14;
            rw0Var18 = new rw0(810, org.telegram.messenger.hd.L0(2131746987), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.mw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            e2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            e2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            e2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            x90 x90Var = new x90();
                            e2Var.presentFragment(x90Var);
                            x90Var.b0(3);
                            x90Var.a0(2);
                            break;
                        case 8:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            e2Var.presentFragment(new zx0());
                            break;
                        case 12:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                            ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                            x0Var4.K0();
                            e2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                            ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                            x0Var5.K0();
                            e2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            e2Var.presentFragment(new x90());
                            break;
                        case 19:
                            x90 x90Var2 = new x90();
                            e2Var.presentFragment(x90Var2);
                            x90Var2.a0(3);
                            break;
                        case 20:
                            x90 x90Var3 = new x90();
                            e2Var.presentFragment(x90Var3);
                            x90Var3.b0(3);
                            x90Var3.a0(1);
                            break;
                        case 21:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            x90 x90Var4 = new x90();
                            e2Var.presentFragment(x90Var4);
                            x90Var4.b0(3);
                            x90Var4.a0(2);
                            break;
                        case 23:
                            x90 x90Var5 = new x90();
                            e2Var.presentFragment(x90Var5);
                            x90Var5.a0(28700);
                            break;
                        case 24:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            x90 x90Var6 = new x90();
                            e2Var.presentFragment(x90Var6);
                            x90Var6.b0(28700);
                            x90Var6.a0(16388);
                            break;
                        case 26:
                            x90 x90Var7 = new x90();
                            e2Var.presentFragment(x90Var7);
                            x90Var7.b0(28700);
                            x90Var7.a0(8200);
                            break;
                        case 27:
                            x90 x90Var8 = new x90();
                            e2Var.presentFragment(x90Var8);
                            x90Var8.b0(28700);
                            x90Var8.a0(4112);
                            break;
                        case 28:
                            x90 x90Var9 = new x90();
                            e2Var.presentFragment(x90Var9);
                            x90Var9.a0(360928);
                            break;
                        default:
                            x90 x90Var10 = new x90();
                            e2Var.presentFragment(x90Var10);
                            x90Var10.b0(360928);
                            x90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            rw0Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i90 = 15;
            rw0Var19 = new rw0(811, org.telegram.messenger.hd.L0(2131747022), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.mw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            e2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            e2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            e2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            x90 x90Var = new x90();
                            e2Var.presentFragment(x90Var);
                            x90Var.b0(3);
                            x90Var.a0(2);
                            break;
                        case 8:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            e2Var.presentFragment(new zx0());
                            break;
                        case 12:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                            ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                            x0Var4.K0();
                            e2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                            ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                            x0Var5.K0();
                            e2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            e2Var.presentFragment(new x90());
                            break;
                        case 19:
                            x90 x90Var2 = new x90();
                            e2Var.presentFragment(x90Var2);
                            x90Var2.a0(3);
                            break;
                        case 20:
                            x90 x90Var3 = new x90();
                            e2Var.presentFragment(x90Var3);
                            x90Var3.b0(3);
                            x90Var3.a0(1);
                            break;
                        case 21:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            x90 x90Var4 = new x90();
                            e2Var.presentFragment(x90Var4);
                            x90Var4.b0(3);
                            x90Var4.a0(2);
                            break;
                        case 23:
                            x90 x90Var5 = new x90();
                            e2Var.presentFragment(x90Var5);
                            x90Var5.a0(28700);
                            break;
                        case 24:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            x90 x90Var6 = new x90();
                            e2Var.presentFragment(x90Var6);
                            x90Var6.b0(28700);
                            x90Var6.a0(16388);
                            break;
                        case 26:
                            x90 x90Var7 = new x90();
                            e2Var.presentFragment(x90Var7);
                            x90Var7.b0(28700);
                            x90Var7.a0(8200);
                            break;
                        case 27:
                            x90 x90Var8 = new x90();
                            e2Var.presentFragment(x90Var8);
                            x90Var8.b0(28700);
                            x90Var8.a0(4112);
                            break;
                        case 28:
                            x90 x90Var9 = new x90();
                            e2Var.presentFragment(x90Var9);
                            x90Var9.a0(360928);
                            break;
                        default:
                            x90 x90Var10 = new x90();
                            e2Var.presentFragment(x90Var10);
                            x90Var10.b0(360928);
                            x90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            rw0Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i91 = 16;
            rw0Var20 = new rw0(812, org.telegram.messenger.hd.L0(2131747020), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.mw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            e2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            e2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            e2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            x90 x90Var = new x90();
                            e2Var.presentFragment(x90Var);
                            x90Var.b0(3);
                            x90Var.a0(2);
                            break;
                        case 8:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            e2Var.presentFragment(new zx0());
                            break;
                        case 12:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                            ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                            x0Var4.K0();
                            e2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                            ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                            x0Var5.K0();
                            e2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            e2Var.presentFragment(new x90());
                            break;
                        case 19:
                            x90 x90Var2 = new x90();
                            e2Var.presentFragment(x90Var2);
                            x90Var2.a0(3);
                            break;
                        case 20:
                            x90 x90Var3 = new x90();
                            e2Var.presentFragment(x90Var3);
                            x90Var3.b0(3);
                            x90Var3.a0(1);
                            break;
                        case 21:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            x90 x90Var4 = new x90();
                            e2Var.presentFragment(x90Var4);
                            x90Var4.b0(3);
                            x90Var4.a0(2);
                            break;
                        case 23:
                            x90 x90Var5 = new x90();
                            e2Var.presentFragment(x90Var5);
                            x90Var5.a0(28700);
                            break;
                        case 24:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            x90 x90Var6 = new x90();
                            e2Var.presentFragment(x90Var6);
                            x90Var6.b0(28700);
                            x90Var6.a0(16388);
                            break;
                        case 26:
                            x90 x90Var7 = new x90();
                            e2Var.presentFragment(x90Var7);
                            x90Var7.b0(28700);
                            x90Var7.a0(8200);
                            break;
                        case 27:
                            x90 x90Var8 = new x90();
                            e2Var.presentFragment(x90Var8);
                            x90Var8.b0(28700);
                            x90Var8.a0(4112);
                            break;
                        case 28:
                            x90 x90Var9 = new x90();
                            e2Var.presentFragment(x90Var9);
                            x90Var9.a0(360928);
                            break;
                        default:
                            x90 x90Var10 = new x90();
                            e2Var.presentFragment(x90Var10);
                            x90Var10.b0(360928);
                            x90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            rw0Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i92 = 17;
            rw0Var21 = new rw0(813, org.telegram.messenger.hd.L0(2131747004), org.telegram.messenger.hd.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.mw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i92) {
                        case 0:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            e2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            e2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                            ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            e2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            e2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            x90 x90Var = new x90();
                            e2Var.presentFragment(x90Var);
                            x90Var.b0(3);
                            x90Var.a0(2);
                            break;
                        case 8:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            e2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            e2Var.presentFragment(new zx0());
                            break;
                        case 12:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                            ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                            x0Var2.K0();
                            e2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                            ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                            x0Var3.K0();
                            e2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                            ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                            x0Var4.K0();
                            e2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                            ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                            x0Var5.K0();
                            e2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            e2Var.presentFragment(new x90());
                            break;
                        case 19:
                            x90 x90Var2 = new x90();
                            e2Var.presentFragment(x90Var2);
                            x90Var2.a0(3);
                            break;
                        case 20:
                            x90 x90Var3 = new x90();
                            e2Var.presentFragment(x90Var3);
                            x90Var3.b0(3);
                            x90Var3.a0(1);
                            break;
                        case 21:
                            e2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            x90 x90Var4 = new x90();
                            e2Var.presentFragment(x90Var4);
                            x90Var4.b0(3);
                            x90Var4.a0(2);
                            break;
                        case 23:
                            x90 x90Var5 = new x90();
                            e2Var.presentFragment(x90Var5);
                            x90Var5.a0(28700);
                            break;
                        case 24:
                            e2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            x90 x90Var6 = new x90();
                            e2Var.presentFragment(x90Var6);
                            x90Var6.b0(28700);
                            x90Var6.a0(16388);
                            break;
                        case 26:
                            x90 x90Var7 = new x90();
                            e2Var.presentFragment(x90Var7);
                            x90Var7.b0(28700);
                            x90Var7.a0(8200);
                            break;
                        case 27:
                            x90 x90Var8 = new x90();
                            e2Var.presentFragment(x90Var8);
                            x90Var8.b0(28700);
                            x90Var8.a0(4112);
                            break;
                        case 28:
                            x90 x90Var9 = new x90();
                            e2Var.presentFragment(x90Var9);
                            x90Var9.a0(360928);
                            break;
                        default:
                            x90 x90Var10 = new x90();
                            e2Var.presentFragment(x90Var10);
                            x90Var10.b0(360928);
                            x90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            rw0Var21 = null;
        }
        final int i93 = 18;
        rw0 rw0Var124 = new rw0(900, org.telegram.messenger.hd.L0(2131747066), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i93) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var124.a("tg://settings/power-saving");
        final int i94 = 19;
        rw0 rw0Var125 = new rw0(901, org.telegram.messenger.hd.L0(2131748850), org.telegram.messenger.hd.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i94) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var125.a("tg://settings/power-saving/stickers");
        final int i95 = 20;
        rw0 rw0Var126 = new rw0(902, org.telegram.messenger.hd.L0(2131748862), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748850), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i95) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        final int i96 = 22;
        rw0 rw0Var127 = new rw0(903, org.telegram.messenger.hd.L0(2131748864), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748850), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        final int i97 = 23;
        rw0 rw0Var128 = new rw0(904, org.telegram.messenger.hd.L0(2131748855), org.telegram.messenger.hd.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var128.a("tg://settings/power-saving/emoji");
        final int i98 = 25;
        rw0 rw0Var129 = new rw0(905, org.telegram.messenger.hd.L0(2131748862), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748855), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        final int i99 = 26;
        rw0 rw0Var130 = new rw0(906, org.telegram.messenger.hd.L0(2131748861), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748855), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        final int i100 = 27;
        rw0 rw0Var131 = new rw0(907, org.telegram.messenger.hd.L0(2131748864), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748855), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        final int i101 = 28;
        rw0 rw0Var132 = new rw0(908, org.telegram.messenger.hd.L0(2131748856), org.telegram.messenger.hd.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var132.a("tg://settings/power-saving/effects");
        final int i102 = 29;
        rw0 rw0Var133 = new rw0(909, org.telegram.messenger.hd.L0(2131748859), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.mw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i102) {
                    case 0:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        e2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        e2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        ug.x0 x0Var = new ug.x0(e2Var2, 9, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        e2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        e2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        x90 x90Var = new x90();
                        e2Var.presentFragment(x90Var);
                        x90Var.b0(3);
                        x90Var.a0(2);
                        break;
                    case 8:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        e2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        e2Var.presentFragment(new zx0());
                        break;
                    case 12:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.e2 e2Var3 = e2Var;
                        ug.x0 x0Var2 = new ug.x0(e2Var3, 6, false);
                        x0Var2.K0();
                        e2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.e2 e2Var4 = e2Var;
                        ug.x0 x0Var3 = new ug.x0(e2Var4, 7, false);
                        x0Var3.K0();
                        e2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.e2 e2Var5 = e2Var;
                        ug.x0 x0Var4 = new ug.x0(e2Var5, 10, false);
                        x0Var4.K0();
                        e2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.e2 e2Var6 = e2Var;
                        ug.x0 x0Var5 = new ug.x0(e2Var6, 12, false);
                        x0Var5.K0();
                        e2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        e2Var.presentFragment(new x90());
                        break;
                    case 19:
                        x90 x90Var2 = new x90();
                        e2Var.presentFragment(x90Var2);
                        x90Var2.a0(3);
                        break;
                    case 20:
                        x90 x90Var3 = new x90();
                        e2Var.presentFragment(x90Var3);
                        x90Var3.b0(3);
                        x90Var3.a0(1);
                        break;
                    case 21:
                        e2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        x90 x90Var4 = new x90();
                        e2Var.presentFragment(x90Var4);
                        x90Var4.b0(3);
                        x90Var4.a0(2);
                        break;
                    case 23:
                        x90 x90Var5 = new x90();
                        e2Var.presentFragment(x90Var5);
                        x90Var5.a0(28700);
                        break;
                    case 24:
                        e2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        x90 x90Var6 = new x90();
                        e2Var.presentFragment(x90Var6);
                        x90Var6.b0(28700);
                        x90Var6.a0(16388);
                        break;
                    case 26:
                        x90 x90Var7 = new x90();
                        e2Var.presentFragment(x90Var7);
                        x90Var7.b0(28700);
                        x90Var7.a0(8200);
                        break;
                    case 27:
                        x90 x90Var8 = new x90();
                        e2Var.presentFragment(x90Var8);
                        x90Var8.b0(28700);
                        x90Var8.a0(4112);
                        break;
                    case 28:
                        x90 x90Var9 = new x90();
                        e2Var.presentFragment(x90Var9);
                        x90Var9.a0(360928);
                        break;
                    default:
                        x90 x90Var10 = new x90();
                        e2Var.presentFragment(x90Var10);
                        x90Var10.b0(360928);
                        x90Var10.a0(32);
                        break;
                }
            }
        });
        rw0Var133.a("tg://settings/power-saving/background");
        final int i103 = 0;
        rw0 rw0Var134 = new rw0(910, org.telegram.messenger.hd.L0(2131748847), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i103;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i104 = 1;
        rw0 rw0Var135 = new rw0(911, org.telegram.messenger.hd.L0(2131748851), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i104;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        if (org.telegram.messenger.gz.o() >= 1) {
            final int i105 = 3;
            rw0Var22 = new rw0(org.telegram.messenger.ns.x5, org.telegram.messenger.hd.L0(2131748858), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i105;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i112) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            break;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            break;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            break;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            break;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            break;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            break;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            break;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((s90) arrayList.get(i122)).f == 1) {
                                    x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            break;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            break;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            break;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            break;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            rw0Var22 = null;
        }
        final int i106 = 4;
        rw0 rw0Var136 = new rw0(912, org.telegram.messenger.hd.L0(2131748852), null, org.telegram.messenger.hd.L0(2131747066), org.telegram.messenger.hd.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i106;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i107 = 5;
        rw0 rw0Var137 = new rw0(913, org.telegram.messenger.hd.L0(2131748857), org.telegram.messenger.hd.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i107;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var137.a("tg://settings/power-saving/call-animations");
        final int i108 = 7;
        rw0 rw0Var138 = new rw0(org.telegram.messenger.ns.r3, org.telegram.messenger.hd.L0(2131748860), org.telegram.messenger.hd.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i108;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var138.a("tg://settings/power-saving/videos");
        final int i109 = 8;
        rw0 rw0Var139 = new rw0(org.telegram.messenger.ns.q3, org.telegram.messenger.hd.L0(2131748863), org.telegram.messenger.hd.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i109;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var139.a("tg://settings/power-saving/gifs");
        final int i110 = 9;
        rw0 rw0Var140 = new rw0(914, org.telegram.messenger.hd.L0(2131748846), org.telegram.messenger.hd.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i110;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var140.a("tg://settings/power-saving/transitions");
        final int i111 = 10;
        rw0 rw0Var141 = new rw0(400, org.telegram.messenger.hd.L0(2131749054), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i111;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i112) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var141.a("tg://settings/language");
        final int i112 = 11;
        rw0 rw0Var142 = new rw0(405, org.telegram.messenger.hd.L0(2131745327), org.telegram.messenger.hd.L0(2131749054), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1122 = i112;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i1122) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.np.s1(currentAccount).T1().s()) {
            final int i113 = 12;
            rw0 rw0Var143 = new rw0(406, org.telegram.messenger.hd.L0(2131751358), org.telegram.messenger.hd.L0(2131749054), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i1122 = i113;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                    switch (i1122) {
                        case 0:
                            x90 x90Var = new x90();
                            e2Var2.presentFragment(x90Var);
                            x90Var.b0(360928);
                            x90Var.a0(64);
                            break;
                        case 1:
                            x90 x90Var2 = new x90();
                            e2Var2.presentFragment(x90Var2);
                            x90Var2.b0(360928);
                            x90Var2.a0(128);
                            break;
                        case 2:
                            e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            x90 x90Var3 = new x90();
                            e2Var2.presentFragment(x90Var3);
                            x90Var3.b0(360928);
                            x90Var3.a0(256);
                            break;
                        case 4:
                            x90 x90Var4 = new x90();
                            e2Var2.presentFragment(x90Var4);
                            x90Var4.b0(360928);
                            x90Var4.a0(32768);
                            break;
                        case 5:
                            x90 x90Var5 = new x90();
                            e2Var2.presentFragment(x90Var5);
                            x90Var5.a0(512);
                            break;
                        case 6:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            x90 x90Var6 = new x90();
                            e2Var2.presentFragment(x90Var6);
                            x90Var6.a0(1024);
                            break;
                        case 8:
                            x90 x90Var7 = new x90();
                            e2Var2.presentFragment(x90Var7);
                            x90Var7.a0(2048);
                            break;
                        case 9:
                            x90 x90Var8 = new x90();
                            e2Var2.presentFragment(x90Var8);
                            while (true) {
                                ArrayList arrayList = x90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((s90) arrayList.get(i122)).f == 1) {
                                    x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            e2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                            x0Var.K0();
                            e2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                            break;
                        case 15:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                            break;
                        case 17:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            e2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            e2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            e2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                            x0Var2.K0();
                            e2Var2.showDialog(x0Var2);
                            break;
                        case 24:
                            e2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            e2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            pt0 pt0Var = new pt0();
                            pt0Var.getMessagesController().F0(true);
                            e2Var2.presentFragment(pt0Var);
                            break;
                        case 27:
                            e2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            rw0Var143.a("tg://settings/language/do-not-translate");
            rw0Var43 = rw0Var143;
        }
        final int i114 = 14;
        rw0 rw0Var144 = new rw0(402, org.telegram.messenger.hd.L0(2131753986), org.telegram.messenger.hd.L0(2131745479), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1122 = i114;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i1122) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var144.a("tg://settings/ask-question");
        final int i115 = 15;
        rw0 rw0Var145 = new rw0(403, org.telegram.messenger.hd.L0(2131744242), org.telegram.messenger.hd.L0(2131745479), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1122 = i115;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i1122) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var145.a("tg://settings/faq");
        final int i116 = 16;
        rw0 rw0Var146 = new rw0(404, org.telegram.messenger.hd.L0(2131746783), org.telegram.messenger.hd.L0(2131745479), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1122 = i116;
                int i122 = 0;
                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                switch (i1122) {
                    case 0:
                        x90 x90Var = new x90();
                        e2Var2.presentFragment(x90Var);
                        x90Var.b0(360928);
                        x90Var.a0(64);
                        break;
                    case 1:
                        x90 x90Var2 = new x90();
                        e2Var2.presentFragment(x90Var2);
                        x90Var2.b0(360928);
                        x90Var2.a0(128);
                        break;
                    case 2:
                        e2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        x90 x90Var3 = new x90();
                        e2Var2.presentFragment(x90Var3);
                        x90Var3.b0(360928);
                        x90Var3.a0(256);
                        break;
                    case 4:
                        x90 x90Var4 = new x90();
                        e2Var2.presentFragment(x90Var4);
                        x90Var4.b0(360928);
                        x90Var4.a0(32768);
                        break;
                    case 5:
                        x90 x90Var5 = new x90();
                        e2Var2.presentFragment(x90Var5);
                        x90Var5.a0(512);
                        break;
                    case 6:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        x90 x90Var6 = new x90();
                        e2Var2.presentFragment(x90Var6);
                        x90Var6.a0(1024);
                        break;
                    case 8:
                        x90 x90Var7 = new x90();
                        e2Var2.presentFragment(x90Var7);
                        x90Var7.a0(2048);
                        break;
                    case 9:
                        x90 x90Var8 = new x90();
                        e2Var2.presentFragment(x90Var8);
                        while (true) {
                            ArrayList arrayList = x90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((s90) arrayList.get(i122)).f == 1) {
                                x90Var8.b.e1(new ai.s1(x90Var8, i122, 15), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        e2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.x0 x0Var = new ug.x0(e2Var2, 0, false);
                        x0Var.K0();
                        e2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        e2Var2.showDialog(org.telegram.ui.Components.t4.R(e2Var2, null));
                        break;
                    case 15:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(e2Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131746781, null));
                        break;
                    case 17:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        e2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        e2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        e2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.x0 x0Var2 = new ug.x0(e2Var2, 11, false);
                        x0Var2.K0();
                        e2Var2.showDialog(x0Var2);
                        break;
                    case 24:
                        e2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        e2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        pt0 pt0Var = new pt0();
                        pt0Var.getMessagesController().F0(true);
                        e2Var2.presentFragment(pt0Var);
                        break;
                    case 27:
                        e2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        e2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        e2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        rw0Var146.a("tg://settings/privacy-policy");
        return new rw0[]{rw0Var23, rw0Var24, rw0Var25, rw0Var26, rw0Var27, rw0Var28, rw0Var29, rw0Var30, rw0Var31, rw0Var32, rw0Var33, rw0Var34, rw0Var35, rw0Var36, rw0Var37, rw0Var38, rw0Var39, rw0Var, rw0Var41, rw0Var42, rw0Var2, rw0Var44, rw0Var45, rw0Var46, rw0Var47, rw0Var48, rw0Var49, rw0Var50, rw0Var51, rw0Var52, rw0Var3, rw0Var4, rw0Var54, rw0Var55, rw0Var56, rw0Var57, rw0Var58, rw0Var59, rw0Var60, rw0Var61, rw0Var62, rw0Var63, rw0Var64, rw0Var65, rw0Var66, rw0Var67, rw0Var68, rw0Var69, rw0Var70, rw0Var71, rw0Var72, rw0Var73, rw0Var74, rw0Var75, rw0Var76, rw0Var77, rw0Var78, rw0Var79, rw0Var80, rw0Var81, rw0Var82, rw0Var83, rw0Var84, rw0Var85, rw0Var86, rw0Var87, rw0Var88, rw0Var89, rw0Var90, rw0Var91, rw0Var92, rw0Var93, rw0Var94, rw0Var95, rw0Var96, rw0Var97, rw0Var98, rw0Var99, rw0Var100, rw0Var101, rw0Var102, rw0Var103, rw0Var104, rw0Var105, rw0Var106, rw0Var107, rw0Var108, rw0Var109, rw0Var110, rw0Var111, rw0Var112, rw0Var6, rw0Var114, rw0Var7, rw0Var116, rw0Var8, rw0Var118, rw0Var119, rw0Var120, rw0Var121, rw0Var5, rw0Var9, rw0Var10, rw0Var11, rw0Var12, rw0Var13, rw0Var14, rw0Var15, rw0Var16, rw0Var123, rw0Var17, rw0Var18, rw0Var19, rw0Var20, rw0Var21, rw0Var124, rw0Var125, rw0Var126, rw0Var127, rw0Var128, rw0Var129, rw0Var130, rw0Var131, rw0Var132, rw0Var133, rw0Var134, rw0Var135, rw0Var22, rw0Var136, rw0Var137, rw0Var138, rw0Var139, rw0Var140, rw0Var141, rw0Var142, rw0Var43, rw0Var144, rw0Var145, rw0Var146};
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 0;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.x) {
            f();
        }
        if (arrayList.size() > 20) {
            a8.p0.z(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj2 = arrayList.get(i7);
            if (obj2 instanceof rw0) {
                ((rw0) obj2).g = i7;
            } else if (obj2 instanceof org.telegram.messenger.zo) {
                ((org.telegram.messenger.zo) obj2).d = i7;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.np.e1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i7 = this.f;
        TLRPC.WebPage webPage = org.telegram.messenger.np.s1(i7).r2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.np.s1(i7).q2);
        }
        if (this.F != null || this.G) {
            return;
        }
        this.G = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = org.telegram.messenger.hd.M0(2131744240, null);
        tL_messages_getWebPage.hash = 0;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getWebPage, new l(this, 20));
    }

    public final void I(String str) {
        this.E = str;
        if (this.y != null) {
            Utilities.g.a(this.y);
            this.y = null;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.g;
            mp0 mp0Var = new mp0(24, this, str);
            this.y = mp0Var;
            p5Var.d(mp0Var, 300L);
            return;
        }
        this.x = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.e2 e2Var = this.e;
        if (e2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) e2Var).P.b.getImageReceiver().P0(false);
                ((ProfileActivity) this.e).P.d.setText(org.telegram.messenger.hd.M0(2131745477, null));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        f();
    }

    public final void J() {
        String[] strArr;
        rw0 rw0Var;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            rw0[] rw0VarArr = this.c;
            if (i7 >= rw0VarArr.length) {
                break;
            }
            rw0 rw0Var2 = rw0VarArr[i7];
            if (rw0Var2 != null) {
                hashMap.put(Integer.valueOf(rw0Var2.f), this.c[i7]);
            }
            i7++;
        }
        Set<String> stringSet = org.telegram.messenger.np.e1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.w;
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(it.next()));
                    int readInt32 = serializedData.readInt32(false);
                    int readInt322 = serializedData.readInt32(false);
                    if (readInt322 == 0) {
                        String readString = serializedData.readString(false);
                        int readInt323 = serializedData.readInt32(false);
                        if (readInt323 > 0) {
                            strArr = new String[readInt323];
                            for (int i10 = 0; i10 < readInt323; i10++) {
                                strArr[i10] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        org.telegram.messenger.zo zoVar = new org.telegram.messenger.zo(readString, strArr, serializedData.readString(false));
                        zoVar.d = readInt32;
                        arrayList.add(zoVar);
                    } else if (readInt322 == 1 && (rw0Var = (rw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        rw0Var.g = readInt32;
                        arrayList.add(rw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new qv0(this));
    }

    @Override // v4.h0
    public final int b() {
        if (this.x) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.w;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (!this.x) {
            ArrayList arrayList = this.w;
            if (i7 == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i7 != arrayList.size() + 1) {
                return 0;
            }
        } else if (i7 < this.r.size() || i7 != this.r.size()) {
            return 0;
        }
        return 1;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 != 0) {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.hd.M0(2131745482, null));
                return;
            } else {
                if (i10 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.hd.M0(2131745469, null));
                return;
            }
        }
        org.telegram.ui.Cells.u6 u6Var = (org.telegram.ui.Cells.u6) view;
        if (this.x) {
            if (i7 >= this.r.size()) {
                int f10 = i5.c.f(1, i7, this.r);
                u6Var.a((CharSequence) this.n.get(this.r.size() + f10), ((org.telegram.messenger.zo) this.s.get(f10)).b, true, f10 < this.r.size() - 1);
                return;
            } else {
                rw0 rw0Var = (rw0) this.r.get(i7);
                rw0 rw0Var2 = i7 > 0 ? (rw0) this.r.get(i7 - 1) : null;
                u6Var.b((CharSequence) this.n.get(i7), rw0Var.d, (rw0Var2 == null || rw0Var2.e != rw0Var.e) ? rw0Var.e : 0, i7 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.w;
        if (!arrayList.isEmpty()) {
            i7--;
        }
        if (i7 >= arrayList.size()) {
            int f11 = i5.c.f(1, i7, arrayList);
            org.telegram.messenger.zo zoVar = (org.telegram.messenger.zo) this.d.get(f11);
            u6Var.a(zoVar.a, zoVar.b, true, f11 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i7);
        if (obj instanceof rw0) {
            rw0 rw0Var3 = (rw0) obj;
            u6Var.a(rw0Var3.a, rw0Var3.d, false, i7 < arrayList.size() - 1);
        } else if (obj instanceof org.telegram.messenger.zo) {
            org.telegram.messenger.zo zoVar2 = (org.telegram.messenger.zo) obj;
            u6Var.a(zoVar2.a, zoVar2.b, true, i7 < arrayList.size() - 1);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = this.h;
        View n4Var = i7 != 0 ? i7 != 1 ? new org.telegram.ui.Cells.n4(context, 16) : new org.telegram.ui.Cells.x3(context, null) : new org.telegram.ui.Cells.u6(context);
        n4Var.setLayoutParams(new v4.p0(-1, -2));
        return new org.telegram.ui.Components.cj0(n4Var);
    }
}
