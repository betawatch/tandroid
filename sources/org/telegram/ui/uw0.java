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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class uw0 extends org.telegram.ui.Components.dk0 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public tw0[] c;
    public final org.telegram.ui.ActionBar.g2 e;
    public final int f;
    public final Context h;
    public boolean x;
    public mp0 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public uw0(Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        this.e = g2Var;
        this.f = g2Var.getCurrentAccount();
        this.h = context;
        this.c = H(g2Var);
        J();
    }

    public static boolean F(int i7, int i10) {
        if (!org.telegram.messenger.mp.u1(i7).K3() || org.telegram.messenger.i10.i(i7).q()) {
            return i10 == -1 || org.telegram.messenger.mp.u1(i7).O0.get(i10, -1) != -1;
        }
        return false;
    }

    public static tw0[] H(final org.telegram.ui.ActionBar.g2 g2Var) {
        tw0 tw0Var;
        tw0 tw0Var2;
        tw0 tw0Var3;
        tw0 tw0Var4;
        tw0 tw0Var5;
        tw0 tw0Var6;
        tw0 tw0Var7;
        tw0 tw0Var8;
        tw0 tw0Var9;
        tw0 tw0Var10;
        tw0 tw0Var11;
        tw0 tw0Var12;
        tw0 tw0Var13;
        tw0 tw0Var14;
        tw0 tw0Var15;
        tw0 tw0Var16;
        tw0 tw0Var17;
        tw0 tw0Var18;
        tw0 tw0Var19;
        tw0 tw0Var20;
        tw0 tw0Var21;
        tw0 tw0Var22;
        final int currentAccount = g2Var.getCurrentAccount();
        final int i7 = 24;
        tw0 tw0Var23 = new tw0(500, org.telegram.messenger.gd.M0(2131751252), 0, new mp0(i7, g2Var, g2Var.getResourceProvider()));
        tw0 tw0Var24 = new tw0(501, org.telegram.messenger.gd.M0(2131752525), 0, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i10 = i7;
                int i11 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i10) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i11)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i11, 14), 700, true);
                                break;
                            } else {
                                i11++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var24.a("tg://settings/edit/change-number");
        final int i10 = 6;
        tw0 tw0Var25 = new tw0(502, org.telegram.messenger.gd.M0(2131754465), 0, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 4) {
                                i11 = -1;
                            } else if (org.telegram.messenger.i10.i(i11).p()) {
                                i11++;
                            }
                        }
                        if (i11 >= 0) {
                            g2Var.presentFragment(new de0(i11));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var25.a("tg://settings/edit/add-account");
        final int i11 = 17;
        final int i12 = 1;
        tw0 tw0Var26 = new tw0(1, org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var26.a("tg://settings/notifications");
        final int i13 = 29;
        tw0 tw0Var27 = new tw0(2, org.telegram.messenger.gd.M0(2131747684), org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var27.a("tg://settings/notifications/private-chats");
        final int i14 = 11;
        tw0 tw0Var28 = new tw0(3, org.telegram.messenger.gd.M0(2131747713), org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        tw0Var28.a("tg://settings/notifications/groups");
        tw0 tw0Var29 = new tw0(4, org.telegram.messenger.gd.M0(2131747727), org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new vf0(7, g2Var));
        tw0Var29.a("tg://settings/notifications/channels");
        final int i15 = 19;
        tw0 tw0Var30 = new tw0(5, org.telegram.messenger.gd.M0(2131743029), "callsSectionRow", org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new vf0(i15, g2Var));
        tw0 tw0Var31 = new tw0(6, org.telegram.messenger.gd.M0(2131753730), "badgeNumberSection", org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i16 = 13;
        tw0 tw0Var32 = new tw0(7, org.telegram.messenger.gd.M0(2131749026), "inappSectionRow", org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0 tw0Var33 = new tw0(8, org.telegram.messenger.gd.M0(2131751778), "contactJoinedRow", org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new vf0(23, g2Var));
        tw0Var33.a("tg://settings/notifications/new-contacts");
        tw0 tw0Var34 = new tw0(9, org.telegram.messenger.gd.M0(2131747034), "pinnedMessageRow", org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var34.a("tg://settings/notifications/pinned-messages");
        tw0 tw0Var35 = new tw0(10, org.telegram.messenger.gd.M0(2131745916), "resetNotificationsRow", org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i10;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var35.a("tg://settings/notifications/reset");
        tw0 tw0Var36 = new tw0(11, org.telegram.messenger.gd.M0(2131747682), "notificationsServiceRow", org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i11;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i17 = 18;
        tw0 tw0Var37 = new tw0(12, org.telegram.messenger.gd.M0(2131747681), "notificationsServiceConnectionRow", org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i17;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0 tw0Var38 = new tw0(13, org.telegram.messenger.gd.M0(2131746079), "repeatRow", org.telegram.messenger.gd.M0(2131747728), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i15;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i18 = 20;
        tw0 tw0Var39 = new tw0(100, org.telegram.messenger.gd.M0(2131746577), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i18;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var39.a("tg://settings/privacy");
        final int i19 = 21;
        tw0 tw0Var40 = new tw0(org.telegram.messenger.ks.u1, org.telegram.messenger.gd.M0(2131743691), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i19;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var40.a("tg://settings/privacy/2sv");
        final int i20 = 0;
        tw0 tw0Var41 = new tw0(org.telegram.messenger.ks.I1, org.telegram.messenger.gd.M0(2131753847), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                int i21 = i20;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                int i22 = currentAccount;
                switch (i21) {
                    case 0:
                        if (org.telegram.messenger.i10.i(i22).q0 >= 0) {
                            g2Var2.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.i10.i(i22).q()) {
                            org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(g2Var2);
                            b02.getClass();
                            org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(b02.X(), null);
                            nbVar.d(R.raw.voip_muted, new String[0]);
                            String N0 = org.telegram.messenger.gd.N0(2131746561, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                            int indexOf = N0.indexOf(42);
                            int lastIndexOf = N0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) N0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new hi.cb(b02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            nbVar.b.setText(spannableStringBuilder);
                            nbVar.b.setSingleLine(false);
                            nbVar.b.setMaxLines(2);
                            b02.b(nbVar, 2750).j();
                            break;
                        } else {
                            g2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        tw0Var41.a("tg://settings/privacy/auto-delete");
        final int i21 = 22;
        tw0 tw0Var42 = new tw0(org.telegram.messenger.ks.t1, org.telegram.messenger.gd.M0(2131747463), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i21;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var42.a("tg://settings/privacy/passcode");
        tw0 tw0Var43 = null;
        if (org.telegram.messenger.bz.m1) {
            tw0Var = tw0Var40;
            final int i22 = 25;
            tw0Var2 = new tw0(org.telegram.messenger.ks.J1, org.telegram.messenger.gd.M0(2131751190), "emailLoginRow", org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i22;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i102) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i112)).f == 1) {
                                    y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            break;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            break;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                            break;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            break;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
                            break;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            tw0Var2.a("tg://settings/privacy/login-email");
        } else {
            tw0Var = tw0Var40;
            tw0Var2 = null;
        }
        final int i23 = 26;
        tw0 tw0Var44 = new tw0(101, org.telegram.messenger.gd.M0(2131753678), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i23;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var44.a("tg://settings/privacy/blocked");
        final int i24 = 27;
        tw0 tw0Var45 = new tw0(org.telegram.messenger.ks.v1, org.telegram.messenger.gd.M0(2131745355), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i24;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var45.a("tg://settings/devices");
        final int i25 = 28;
        tw0 tw0Var46 = new tw0(org.telegram.messenger.ks.q1, org.telegram.messenger.gd.M0(2131746596), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i25;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var46.a("tg://settings/privacy/phone-number/");
        final int i26 = 29;
        tw0 tw0Var47 = new tw0(org.telegram.messenger.ks.n1, org.telegram.messenger.gd.M0(2131746621), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i26;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var47.a("tg://settings/privacy/last-seen");
        final int i27 = 0;
        tw0 tw0Var48 = new tw0(org.telegram.messenger.ks.o1, org.telegram.messenger.gd.M0(2131746583), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var48.a("tg://settings/privacy/profile-photos");
        final int i28 = 1;
        tw0 tw0Var49 = new tw0(org.telegram.messenger.ks.p1, org.telegram.messenger.gd.M0(2131746643), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var49.a("tg://settings/privacy/forwards");
        final int i29 = 2;
        tw0 tw0Var50 = new tw0(org.telegram.messenger.ks.G1, org.telegram.messenger.gd.M0(2131746606), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var50.a("tg://settings/privacy/calls/p2p");
        final int i30 = 3;
        tw0 tw0Var51 = new tw0(org.telegram.messenger.ks.r1, org.telegram.messenger.gd.M0(2131752584), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var51.a("tg://settings/privacy/calls");
        final int i31 = 5;
        tw0 tw0Var52 = new tw0(org.telegram.messenger.ks.s1, org.telegram.messenger.gd.M0(2131746623), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var52.a("tg://settings/privacy/invites");
        final int i32 = 1;
        tw0 tw0Var53 = new tw0(org.telegram.messenger.ks.H1, org.telegram.messenger.gd.M0(2131746564), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.qw0
            @Override // java.lang.Runnable
            public final void run() {
                int i212 = i32;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                int i222 = currentAccount;
                switch (i212) {
                    case 0:
                        if (org.telegram.messenger.i10.i(i222).q0 >= 0) {
                            g2Var2.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.i10.i(i222).q()) {
                            org.telegram.ui.Components.kc b02 = org.telegram.ui.Components.kc.b0(g2Var2);
                            b02.getClass();
                            org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(b02.X(), null);
                            nbVar.d(R.raw.voip_muted, new String[0]);
                            String N0 = org.telegram.messenger.gd.N0(2131746561, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                            int indexOf = N0.indexOf(42);
                            int lastIndexOf = N0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) N0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new hi.cb(b02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            nbVar.b.setText(spannableStringBuilder);
                            nbVar.b.setSingleLine(false);
                            nbVar.b.setMaxLines(2);
                            b02.b(nbVar, 2750).j();
                            break;
                        } else {
                            g2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        tw0Var53.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.mp.u1(currentAccount).b4) {
            tw0Var3 = tw0Var53;
            final int i33 = 7;
            tw0Var4 = new tw0(org.telegram.messenger.ks.F1, org.telegram.messenger.gd.M0(2131754168), "newChatsRow", org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i33) {
                        case 0:
                            g2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            g2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            g2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            g2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            g2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i112 = 0;
                            while (true) {
                                if (i112 >= 4) {
                                    i112 = -1;
                                } else if (org.telegram.messenger.i10.i(i112).p()) {
                                    i112++;
                                }
                            }
                            if (i112 >= 0) {
                                g2Var.presentFragment(new de0(i112));
                                break;
                            }
                            break;
                        case 7:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            g2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            g2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            g2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            g2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            g2Var.presentFragment(new y6());
                            break;
                        case 24:
                            g2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            g2Var.presentFragment(new y6());
                            break;
                        case 27:
                            g2Var.presentFragment(new y6());
                            break;
                        case 28:
                            g2Var.presentFragment(new ot());
                            break;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            tw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            tw0Var3 = tw0Var53;
            tw0Var4 = null;
        }
        final int i34 = 8;
        tw0 tw0Var54 = new tw0(org.telegram.messenger.ks.x1, org.telegram.messenger.gd.M0(2131751584), "deleteAccountRow", org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i34) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var54.a("tg://settings/privacy/self-destruct");
        final int i35 = 9;
        tw0 tw0Var55 = new tw0(org.telegram.messenger.ks.y1, org.telegram.messenger.gd.M0(2131746603), "paymentsClearRow", org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i36 = 10;
        tw0 tw0Var56 = new tw0(org.telegram.messenger.ks.z1, org.telegram.messenger.gd.M0(2131742640), org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i36) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var56.a("tg://settings/privacy/active-websites");
        final int i37 = 11;
        tw0 tw0Var57 = new tw0(org.telegram.messenger.ks.A1, org.telegram.messenger.gd.M0(2131744051), "contactsDeleteRow", org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i38 = 12;
        tw0 tw0Var58 = new tw0(org.telegram.messenger.ks.B1, org.telegram.messenger.gd.M0(2131744053), "contactsSyncRow", org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i39 = 13;
        tw0 tw0Var59 = new tw0(org.telegram.messenger.ks.C1, org.telegram.messenger.gd.M0(2131744167), "contactsSuggestRow", org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i40 = 15;
        tw0 tw0Var60 = new tw0(org.telegram.messenger.ks.D1, org.telegram.messenger.gd.M0(2131748496), "secretMapRow", org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i41 = 16;
        tw0 tw0Var61 = new tw0(org.telegram.messenger.ks.E1, org.telegram.messenger.gd.M0(2131745488), "secretWebpageRow", org.telegram.messenger.gd.M0(2131746577), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i42 = 18;
        tw0 tw0Var62 = new tw0(120, org.telegram.messenger.gd.M0(2131751443), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var62.a("tg://settings/devices");
        final int i43 = 19;
        tw0 tw0Var63 = new tw0(org.telegram.messenger.ks.F1, org.telegram.messenger.gd.M0(2131743963), "terminateAllSessionsRow", org.telegram.messenger.gd.M0(2131751443), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var63.a("tg://settings/devices/terminate-sessions");
        final int i44 = 20;
        tw0 tw0Var64 = new tw0(org.telegram.messenger.ks.G1, org.telegram.messenger.gd.M0(2131748724), org.telegram.messenger.gd.M0(2131751443), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var64.a("tg://settings/devices/link-desktop");
        final int i45 = 21;
        tw0 tw0Var65 = new tw0(org.telegram.messenger.ks.e3, org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var65.a("tg://settings/privacy/data-settings");
        final int i46 = 22;
        tw0 tw0Var66 = new tw0(org.telegram.messenger.ks.f3, org.telegram.messenger.gd.M0(2131751664), "usageSectionRow", org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i47 = 23;
        tw0 tw0Var67 = new tw0(org.telegram.messenger.ks.g3, org.telegram.messenger.gd.M0(2131744575), org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var67.a("tg://settings/data/storage");
        final int i48 = 24;
        tw0 tw0Var68 = new tw0(203, org.telegram.messenger.gd.M0(2131748867), "keepMediaRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131744575), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i49 = 26;
        tw0 tw0Var69 = new tw0(org.telegram.messenger.ks.i3, org.telegram.messenger.gd.M0(2131752063), "cacheRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131744575), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 27;
        tw0 tw0Var70 = new tw0(org.telegram.messenger.ks.j3, org.telegram.messenger.gd.M0(2131748581), "databaseRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131744575), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 28;
        tw0 tw0Var71 = new tw0(org.telegram.messenger.ks.k3, org.telegram.messenger.gd.M0(2131748105), org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        g2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        g2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        g2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        g2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.i10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            g2Var.presentFragment(new de0(i112));
                            break;
                        }
                        break;
                    case 7:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        g2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        g2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        g2Var.presentFragment(new y6());
                        break;
                    case 24:
                        g2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        g2Var.presentFragment(new y6());
                        break;
                    case 27:
                        g2Var.presentFragment(new y6());
                        break;
                    case 28:
                        g2Var.presentFragment(new ot());
                        break;
                    default:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        tw0Var71.a("tg://settings/data/usage");
        final int i52 = 0;
        tw0 tw0Var72 = new tw0(org.telegram.messenger.ks.l3, org.telegram.messenger.gd.M0(2131753764), "mediaDownloadSectionRow", org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i53 = 1;
        tw0 tw0Var73 = new tw0(org.telegram.messenger.ks.m3, org.telegram.messenger.gd.M0(2131742613), org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i54 = 2;
        tw0 tw0Var74 = new tw0(org.telegram.messenger.ks.n3, org.telegram.messenger.gd.M0(2131742615), org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i55 = 3;
        tw0 tw0Var75 = new tw0(210, org.telegram.messenger.gd.M0(2131742614), org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i56 = 4;
        tw0 tw0Var76 = new tw0(org.telegram.messenger.ks.o3, org.telegram.messenger.gd.M0(2131745915), "resetDownloadRow", org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        tw0Var76.a("tg://settings/data/auto-download/reset");
        final int i57 = 5;
        tw0 tw0Var77 = new tw0(org.telegram.messenger.ks.s3, org.telegram.messenger.gd.M0(2131744193), "streamSectionRow", org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i58 = 7;
        tw0 tw0Var78 = new tw0(org.telegram.messenger.ks.t3, org.telegram.messenger.gd.M0(2131751132), "enableStreamRow", org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i59 = 8;
        tw0 tw0Var79 = new tw0(org.telegram.messenger.ks.u3, org.telegram.messenger.gd.M0(2131752584), "callsSectionRow", org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i60 = 9;
        tw0 tw0Var80 = new tw0(org.telegram.messenger.ks.v3, org.telegram.messenger.gd.M0(2131742979), "useLessDataForCallsRow", org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        tw0Var80.a("tg://settings/data/use-less-data");
        final int i61 = 10;
        tw0 tw0Var81 = new tw0(org.telegram.messenger.ks.w3, org.telegram.messenger.gd.M0(2131743008), "quickRepliesRow", org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i62 = 12;
        tw0 tw0Var82 = new tw0(org.telegram.messenger.ks.x3, org.telegram.messenger.gd.M0(2131746405), org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        tw0Var82.a("tg://settings/data/proxy");
        final int i63 = 13;
        tw0 tw0Var83 = new tw0(org.telegram.messenger.ks.w1, org.telegram.messenger.gd.M0(2131746647), "clearDraftsRow", org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        tw0Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i64 = 14;
        tw0 tw0Var84 = new tw0(org.telegram.messenger.ks.z3, org.telegram.messenger.gd.M0(2131745733), "saveToGallerySectionRow", org.telegram.messenger.gd.M0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i65 = 15;
        tw0 tw0Var85 = new tw0(org.telegram.messenger.ks.A3, org.telegram.messenger.gd.M0(2131745723), "saveToGalleryPeerRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131745733), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        tw0Var85.a("tg://settings/data/save-to-photos/chats");
        final int i66 = 16;
        tw0 tw0Var86 = new tw0(org.telegram.messenger.ks.B3, org.telegram.messenger.gd.M0(2131745730), "saveToGalleryGroupsRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131745733), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        g2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        g2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        g2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        g2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        g2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        tw0Var86.a("tg://settings/data/save-to-photos/groups");
        tw0 tw0Var87 = new tw0(org.telegram.messenger.ks.C3, org.telegram.messenger.gd.M0(2131745732), "saveToGalleryChannelsRow", org.telegram.messenger.gd.M0(2131751665), org.telegram.messenger.gd.M0(2131745733), R.drawable.msg2_data, new vf0(2, g2Var));
        tw0Var87.a("tg://settings/data/save-to-photos/channels");
        tw0 tw0Var88 = new tw0(org.telegram.messenger.ks.X4, org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(3, g2Var));
        tw0Var88.a("tg://settings/appearance/themes");
        tw0 tw0Var89 = new tw0(org.telegram.messenger.ks.Y4, org.telegram.messenger.gd.M0(2131743946), "textSizeHeaderRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(4, g2Var));
        tw0Var89.a("tg://settings/appearance/text-size");
        tw0 tw0Var90 = new tw0(org.telegram.messenger.ks.Z4, org.telegram.messenger.gd.M0(2131752538), org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(5, g2Var));
        tw0Var90.a("tg://settings/appearance/wallpapers");
        tw0 tw0Var91 = new tw0(org.telegram.messenger.ks.a5, org.telegram.messenger.gd.M0(2131745342), null, org.telegram.messenger.gd.M0(2131752198), org.telegram.messenger.gd.M0(2131752232), R.drawable.msg2_discussion, new vf0(6, g2Var));
        tw0 tw0Var92 = new tw0(org.telegram.messenger.ks.b5, org.telegram.messenger.gd.M0(2131745912), "resetRow", org.telegram.messenger.gd.M0(2131752198), org.telegram.messenger.gd.M0(2131752232), R.drawable.msg2_discussion, new vf0(8, g2Var));
        tw0 tw0Var93 = new tw0(org.telegram.messenger.ks.d5, org.telegram.messenger.gd.M0(2131751999), "themeHeaderRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(9, g2Var));
        tw0 tw0Var94 = new tw0(org.telegram.messenger.ks.q5, org.telegram.messenger.gd.M0(2131752866), null, org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(10, g2Var));
        tw0 tw0Var95 = new tw0(org.telegram.messenger.ks.r5, org.telegram.messenger.gd.M0(2131751700), "createNewThemeRow", org.telegram.messenger.gd.M0(2131752198), org.telegram.messenger.gd.M0(2131752866), R.drawable.msg2_discussion, new vf0(11, g2Var));
        tw0Var95.a("tg://settings/appearance/themes/create");
        tw0 tw0Var96 = new tw0(org.telegram.messenger.ks.s5, org.telegram.messenger.gd.M0(2131752828), "bubbleRadiusHeaderRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(13, g2Var));
        tw0Var96.a("tg://settings/appearance/message-corners");
        tw0 tw0Var97 = new tw0(org.telegram.messenger.ks.t5, org.telegram.messenger.gd.M0(2131752213), "chatListHeaderRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(14, g2Var));
        tw0 tw0Var98 = new tw0(org.telegram.messenger.ks.u5, org.telegram.messenger.gd.M0(2131752210), "swipeGestureHeaderRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(15, g2Var));
        tw0 tw0Var99 = new tw0(org.telegram.messenger.ks.v5, org.telegram.messenger.gd.M0(2131754237), "appIconHeaderRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(16, g2Var));
        tw0Var99.a("tg://settings/appearance/app-icon");
        tw0 tw0Var100 = new tw0(org.telegram.messenger.ks.c5, org.telegram.messenger.gd.M0(2131753781), org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(17, g2Var));
        tw0 tw0Var101 = new tw0(org.telegram.messenger.ks.z5, org.telegram.messenger.gd.M0(2131748056), "nextMediaTapRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(18, g2Var));
        tw0Var101.a("tg://settings/appearance/tap-for-next-media");
        tw0 tw0Var102 = new tw0(org.telegram.messenger.ks.y5, org.telegram.messenger.gd.M0(2131746231), "raiseToListenRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(20, g2Var));
        tw0Var102.a("tg://settings/data/raise-to-listen");
        tw0 tw0Var103 = new tw0(org.telegram.messenger.ks.h5, org.telegram.messenger.gd.M0(2131746229), "raiseToSpeakRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(21, g2Var));
        tw0Var103.a("tg://settings/data/raise-to-speak");
        tw0 tw0Var104 = new tw0(org.telegram.messenger.ks.x5, org.telegram.messenger.gd.M0(2131747238), "pauseOnMediaRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(22, g2Var));
        tw0Var104.a("tg://settings/data/pause-music");
        tw0 tw0Var105 = new tw0(org.telegram.messenger.ks.w5, org.telegram.messenger.gd.M0(2131748246), "bluetoothScoRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(24, g2Var));
        tw0 tw0Var106 = new tw0(org.telegram.messenger.ks.f5, org.telegram.messenger.gd.M0(2131751426), "directShareRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(25, g2Var));
        tw0 tw0Var107 = new tw0(org.telegram.messenger.ks.i5, org.telegram.messenger.gd.M0(2131745436), "sendByEnterRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(26, g2Var));
        tw0 tw0Var108 = new tw0(org.telegram.messenger.ks.p5, org.telegram.messenger.gd.M0(2131751355), "distanceRow", org.telegram.messenger.gd.M0(2131752198), R.drawable.msg2_discussion, new vf0(27, g2Var));
        tw0 tw0Var109 = new tw0(600, org.telegram.messenger.gd.M0(2131744616), R.drawable.msg2_sticker, new vf0(28, g2Var));
        tw0Var109.a("tg://settings/appearance/stickers-and-emoji");
        tw0 tw0Var110 = new tw0(601, org.telegram.messenger.gd.M0(2131744157), "suggestRow", org.telegram.messenger.gd.M0(2131744616), R.drawable.msg2_sticker, new vf0(29, g2Var));
        final int i67 = 0;
        tw0 tw0Var111 = new tw0(602, org.telegram.messenger.gd.M0(2131750821), "featuredStickersHeaderRow", org.telegram.messenger.gd.M0(2131744616), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i68 = 2;
        tw0 tw0Var112 = new tw0(603, org.telegram.messenger.gd.M0(2131748486), null, org.telegram.messenger.gd.M0(2131744616), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i69 = 3;
        tw0 tw0Var113 = new tw0(604, org.telegram.messenger.gd.M0(2131754125), null, org.telegram.messenger.gd.M0(2131744616), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i70 = 5;
        tw0 tw0Var114 = new tw0(605, org.telegram.messenger.gd.M0(2131754130), null, org.telegram.messenger.gd.M0(2131744616), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i71 = 6;
        tw0 tw0Var115 = new tw0(606, org.telegram.messenger.gd.M0(2131748841), "largeEmojiRow", org.telegram.messenger.gd.M0(2131744616), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i72 = 7;
        tw0 tw0Var116 = new tw0(607, org.telegram.messenger.gd.M0(2131748529), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748657), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i73 = 8;
        tw0 tw0Var117 = new tw0(608, org.telegram.messenger.gd.M0(2131751184), null, org.telegram.messenger.gd.M0(2131744616), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i74 = 9;
        tw0 tw0Var118 = new tw0(609, org.telegram.messenger.gd.M0(2131744171), "suggestAnimatedEmojiRow", org.telegram.messenger.gd.M0(2131744616), org.telegram.messenger.gd.M0(2131751184), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i75 = 10;
        tw0 tw0Var119 = new tw0(610, org.telegram.messenger.gd.M0(2131750823), "featuredStickersHeaderRow", org.telegram.messenger.gd.M0(2131744616), org.telegram.messenger.gd.M0(2131751184), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i76 = 11;
        tw0 tw0Var120 = new tw0(611, org.telegram.messenger.gd.M0(2131751338), null, org.telegram.messenger.gd.M0(2131744616), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i77 = 12;
        tw0 tw0Var121 = new tw0(700, org.telegram.messenger.gd.M0(2131750679), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var121.a("tg://settings/folders");
        final int i78 = 21;
        tw0 tw0Var122 = new tw0(701, org.telegram.messenger.gd.M0(2131751704), "createFilterRow", org.telegram.messenger.gd.M0(2131750679), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            tw0Var5 = tw0Var122;
            tw0Var6 = tw0Var113;
            tw0Var7 = tw0Var115;
            final int i79 = 2;
            tw0Var8 = tw0Var117;
            tw0Var9 = new tw0(800, org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i79;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i102) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i112)).f == 1) {
                                    y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            break;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            break;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                            break;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            break;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
                            break;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            tw0Var5 = tw0Var122;
            tw0Var6 = tw0Var113;
            tw0Var7 = tw0Var115;
            tw0Var8 = tw0Var117;
            tw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i80 = 13;
            tw0Var10 = new tw0(801, org.telegram.messenger.gd.M0(2131746804), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i80;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i102) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i112)).f == 1) {
                                    y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            break;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            break;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                            break;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            break;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
                            break;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            tw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i81 = 23;
            tw0Var11 = new tw0(802, org.telegram.messenger.gd.M0(2131746813), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i81;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i102) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i112)).f == 1) {
                                    y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            break;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            break;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                            break;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            break;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
                            break;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            tw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i82 = 4;
            tw0Var12 = new tw0(803, org.telegram.messenger.gd.M0(2131746770), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.rw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            g2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            g2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            g2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            g2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            g2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i112 = 0;
                            while (true) {
                                if (i112 >= 4) {
                                    i112 = -1;
                                } else if (org.telegram.messenger.i10.i(i112).p()) {
                                    i112++;
                                }
                            }
                            if (i112 >= 0) {
                                g2Var.presentFragment(new de0(i112));
                                break;
                            }
                            break;
                        case 7:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            g2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            g2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            g2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            g2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            g2Var.presentFragment(new y6());
                            break;
                        case 24:
                            g2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            g2Var.presentFragment(new y6());
                            break;
                        case 27:
                            g2Var.presentFragment(new y6());
                            break;
                        case 28:
                            g2Var.presentFragment(new ot());
                            break;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            tw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i83 = 14;
            tw0Var13 = new tw0(804, org.telegram.messenger.gd.M0(2131746818), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.rw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            g2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            g2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            g2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            g2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            g2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i112 = 0;
                            while (true) {
                                if (i112 >= 4) {
                                    i112 = -1;
                                } else if (org.telegram.messenger.i10.i(i112).p()) {
                                    i112++;
                                }
                            }
                            if (i112 >= 0) {
                                g2Var.presentFragment(new de0(i112));
                                break;
                            }
                            break;
                        case 7:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            g2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            g2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            g2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            g2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            g2Var.presentFragment(new y6());
                            break;
                        case 24:
                            g2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            g2Var.presentFragment(new y6());
                            break;
                        case 27:
                            g2Var.presentFragment(new y6());
                            break;
                        case 28:
                            g2Var.presentFragment(new ot());
                            break;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            tw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i84 = 25;
            tw0Var14 = new tw0(805, org.telegram.messenger.gd.M0(2131746768), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.rw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            g2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            g2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            g2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            g2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 1, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            g2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i112 = 0;
                            while (true) {
                                if (i112 >= 4) {
                                    i112 = -1;
                                } else if (org.telegram.messenger.i10.i(i112).p()) {
                                    i112++;
                                }
                            }
                            if (i112 >= 0) {
                                g2Var.presentFragment(new de0(i112));
                                break;
                            }
                            break;
                        case 7:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            g2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 2, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            g2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            g2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            g2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            g2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            g2Var.presentFragment(new y6());
                            break;
                        case 24:
                            g2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 8, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            g2Var.presentFragment(new y6());
                            break;
                        case 27:
                            g2Var.presentFragment(new y6());
                            break;
                        case 28:
                            g2Var.presentFragment(new ot());
                            break;
                        default:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            tw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i85 = 6;
            tw0Var15 = new tw0(806, org.telegram.messenger.gd.M0(2131746798), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.sw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            g2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            g2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            g2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 7:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            g2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            break;
                    }
                }
            });
        } else {
            tw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i86 = 17;
            tw0Var16 = new tw0(807, org.telegram.messenger.gd.M0(2131746789), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.sw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            g2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            g2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            g2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 3, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 7:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            g2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            g2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            g2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 4, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            break;
                    }
                }
            });
        } else {
            tw0Var16 = null;
        }
        tw0 tw0Var123 = F(currentAccount, 5) ? new tw0(808, org.telegram.messenger.gd.M0(2131746782), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new vf0(12, g2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i87 = 4;
            tw0Var17 = new tw0(809, org.telegram.messenger.gd.M0(2131746831), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            g2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            g2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            g2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            y90 y90Var = new y90();
                            g2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            break;
                        case 8:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            g2Var.presentFragment(new cy0());
                            break;
                        case 12:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                            ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                            y0Var4.L0();
                            g2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                            ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                            y0Var5.L0();
                            g2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            g2Var.presentFragment(new y90());
                            break;
                        case 19:
                            y90 y90Var2 = new y90();
                            g2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            break;
                        case 20:
                            y90 y90Var3 = new y90();
                            g2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            break;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            y90 y90Var4 = new y90();
                            g2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            break;
                        case 23:
                            y90 y90Var5 = new y90();
                            g2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            break;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            y90 y90Var6 = new y90();
                            g2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            break;
                        case 26:
                            y90 y90Var7 = new y90();
                            g2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            break;
                        case 27:
                            y90 y90Var8 = new y90();
                            g2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            break;
                        case 28:
                            y90 y90Var9 = new y90();
                            g2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            break;
                        default:
                            y90 y90Var10 = new y90();
                            g2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            tw0Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i88 = 14;
            tw0Var18 = new tw0(810, org.telegram.messenger.gd.M0(2131746793), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            g2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            g2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            g2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            y90 y90Var = new y90();
                            g2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            break;
                        case 8:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            g2Var.presentFragment(new cy0());
                            break;
                        case 12:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                            ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                            y0Var4.L0();
                            g2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                            ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                            y0Var5.L0();
                            g2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            g2Var.presentFragment(new y90());
                            break;
                        case 19:
                            y90 y90Var2 = new y90();
                            g2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            break;
                        case 20:
                            y90 y90Var3 = new y90();
                            g2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            break;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            y90 y90Var4 = new y90();
                            g2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            break;
                        case 23:
                            y90 y90Var5 = new y90();
                            g2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            break;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            y90 y90Var6 = new y90();
                            g2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            break;
                        case 26:
                            y90 y90Var7 = new y90();
                            g2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            break;
                        case 27:
                            y90 y90Var8 = new y90();
                            g2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            break;
                        case 28:
                            y90 y90Var9 = new y90();
                            g2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            break;
                        default:
                            y90 y90Var10 = new y90();
                            g2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            tw0Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i89 = 15;
            tw0Var19 = new tw0(811, org.telegram.messenger.gd.M0(2131746828), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            g2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            g2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            g2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            y90 y90Var = new y90();
                            g2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            break;
                        case 8:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            g2Var.presentFragment(new cy0());
                            break;
                        case 12:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                            ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                            y0Var4.L0();
                            g2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                            ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                            y0Var5.L0();
                            g2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            g2Var.presentFragment(new y90());
                            break;
                        case 19:
                            y90 y90Var2 = new y90();
                            g2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            break;
                        case 20:
                            y90 y90Var3 = new y90();
                            g2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            break;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            y90 y90Var4 = new y90();
                            g2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            break;
                        case 23:
                            y90 y90Var5 = new y90();
                            g2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            break;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            y90 y90Var6 = new y90();
                            g2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            break;
                        case 26:
                            y90 y90Var7 = new y90();
                            g2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            break;
                        case 27:
                            y90 y90Var8 = new y90();
                            g2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            break;
                        case 28:
                            y90 y90Var9 = new y90();
                            g2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            break;
                        default:
                            y90 y90Var10 = new y90();
                            g2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            tw0Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i90 = 16;
            tw0Var20 = new tw0(812, org.telegram.messenger.gd.M0(2131746826), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            g2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            g2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            g2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            y90 y90Var = new y90();
                            g2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            break;
                        case 8:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            g2Var.presentFragment(new cy0());
                            break;
                        case 12:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                            ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                            y0Var4.L0();
                            g2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                            ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                            y0Var5.L0();
                            g2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            g2Var.presentFragment(new y90());
                            break;
                        case 19:
                            y90 y90Var2 = new y90();
                            g2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            break;
                        case 20:
                            y90 y90Var3 = new y90();
                            g2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            break;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            y90 y90Var4 = new y90();
                            g2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            break;
                        case 23:
                            y90 y90Var5 = new y90();
                            g2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            break;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            y90 y90Var6 = new y90();
                            g2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            break;
                        case 26:
                            y90 y90Var7 = new y90();
                            g2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            break;
                        case 27:
                            y90 y90Var8 = new y90();
                            g2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            break;
                        case 28:
                            y90 y90Var9 = new y90();
                            g2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            break;
                        default:
                            y90 y90Var10 = new y90();
                            g2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            tw0Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i91 = 17;
            tw0Var21 = new tw0(813, org.telegram.messenger.gd.M0(2131746810), org.telegram.messenger.gd.M0(2131743986), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            g2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            g2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                            ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            g2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            g2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            y90 y90Var = new y90();
                            g2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            break;
                        case 8:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            g2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            g2Var.presentFragment(new cy0());
                            break;
                        case 12:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                            ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                            y0Var2.L0();
                            g2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                            ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                            y0Var3.L0();
                            g2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                            ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                            y0Var4.L0();
                            g2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                            ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                            y0Var5.L0();
                            g2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            g2Var.presentFragment(new y90());
                            break;
                        case 19:
                            y90 y90Var2 = new y90();
                            g2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            break;
                        case 20:
                            y90 y90Var3 = new y90();
                            g2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            break;
                        case 21:
                            g2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            y90 y90Var4 = new y90();
                            g2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            break;
                        case 23:
                            y90 y90Var5 = new y90();
                            g2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            break;
                        case 24:
                            g2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            y90 y90Var6 = new y90();
                            g2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            break;
                        case 26:
                            y90 y90Var7 = new y90();
                            g2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            break;
                        case 27:
                            y90 y90Var8 = new y90();
                            g2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            break;
                        case 28:
                            y90 y90Var9 = new y90();
                            g2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            break;
                        default:
                            y90 y90Var10 = new y90();
                            g2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            tw0Var21 = null;
        }
        final int i92 = 18;
        tw0 tw0Var124 = new tw0(900, org.telegram.messenger.gd.M0(2131746872), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i92) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var124.a("tg://settings/power-saving");
        final int i93 = 19;
        tw0 tw0Var125 = new tw0(901, org.telegram.messenger.gd.M0(2131748657), org.telegram.messenger.gd.M0(2131746872), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i93) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var125.a("tg://settings/power-saving/stickers");
        final int i94 = 20;
        tw0 tw0Var126 = new tw0(902, org.telegram.messenger.gd.M0(2131748669), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748657), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i94) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i95 = 22;
        tw0 tw0Var127 = new tw0(903, org.telegram.messenger.gd.M0(2131748671), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748657), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i95) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i96 = 23;
        tw0 tw0Var128 = new tw0(904, org.telegram.messenger.gd.M0(2131748662), org.telegram.messenger.gd.M0(2131746872), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var128.a("tg://settings/power-saving/emoji");
        final int i97 = 25;
        tw0 tw0Var129 = new tw0(905, org.telegram.messenger.gd.M0(2131748669), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748662), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i98 = 26;
        tw0 tw0Var130 = new tw0(906, org.telegram.messenger.gd.M0(2131748668), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748662), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i99 = 27;
        tw0 tw0Var131 = new tw0(907, org.telegram.messenger.gd.M0(2131748671), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748662), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i100 = 28;
        tw0 tw0Var132 = new tw0(908, org.telegram.messenger.gd.M0(2131748663), org.telegram.messenger.gd.M0(2131746872), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var132.a("tg://settings/power-saving/effects");
        final int i101 = 29;
        tw0 tw0Var133 = new tw0(909, org.telegram.messenger.gd.M0(2131748666), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748663), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        g2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        g2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        ug.y0 y0Var = new ug.y0(g2Var2, 9, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        g2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        g2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        g2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        g2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        g2Var.presentFragment(new cy0());
                        break;
                    case 12:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.g2 g2Var3 = g2Var;
                        ug.y0 y0Var2 = new ug.y0(g2Var3, 6, false);
                        y0Var2.L0();
                        g2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.g2 g2Var4 = g2Var;
                        ug.y0 y0Var3 = new ug.y0(g2Var4, 7, false);
                        y0Var3.L0();
                        g2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.g2 g2Var5 = g2Var;
                        ug.y0 y0Var4 = new ug.y0(g2Var5, 10, false);
                        y0Var4.L0();
                        g2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.g2 g2Var6 = g2Var;
                        ug.y0 y0Var5 = new ug.y0(g2Var6, 12, false);
                        y0Var5.L0();
                        g2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        g2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        g2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        g2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        g2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        g2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        g2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        g2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        g2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        g2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        g2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        g2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        g2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        tw0Var133.a("tg://settings/power-saving/background");
        final int i102 = 0;
        tw0 tw0Var134 = new tw0(910, org.telegram.messenger.gd.M0(2131748654), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748663), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i102;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i103 = 1;
        tw0 tw0Var135 = new tw0(911, org.telegram.messenger.gd.M0(2131748658), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748663), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i103;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        if (org.telegram.messenger.bz.o() >= 1) {
            final int i104 = 3;
            tw0Var22 = new tw0(org.telegram.messenger.ks.x5, org.telegram.messenger.gd.M0(2131748665), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748663), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i1022 = i104;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i1022) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i112)).f == 1) {
                                    y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            break;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            break;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                            break;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            break;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
                            break;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            tw0Var22 = null;
        }
        final int i105 = 4;
        tw0 tw0Var136 = new tw0(912, org.telegram.messenger.gd.M0(2131748659), null, org.telegram.messenger.gd.M0(2131746872), org.telegram.messenger.gd.M0(2131748663), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i105;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i106 = 5;
        tw0 tw0Var137 = new tw0(913, org.telegram.messenger.gd.M0(2131748664), org.telegram.messenger.gd.M0(2131746872), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i106;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var137.a("tg://settings/power-saving/call-animations");
        final int i107 = 7;
        tw0 tw0Var138 = new tw0(org.telegram.messenger.ks.r3, org.telegram.messenger.gd.M0(2131748667), org.telegram.messenger.gd.M0(2131746872), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i107;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var138.a("tg://settings/power-saving/videos");
        final int i108 = 8;
        tw0 tw0Var139 = new tw0(org.telegram.messenger.ks.q3, org.telegram.messenger.gd.M0(2131748670), org.telegram.messenger.gd.M0(2131746872), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i108;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var139.a("tg://settings/power-saving/gifs");
        final int i109 = 9;
        tw0 tw0Var140 = new tw0(914, org.telegram.messenger.gd.M0(2131748653), org.telegram.messenger.gd.M0(2131746872), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i109;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var140.a("tg://settings/power-saving/transitions");
        final int i110 = 10;
        tw0 tw0Var141 = new tw0(400, org.telegram.messenger.gd.M0(2131748861), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i110;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var141.a("tg://settings/language");
        final int i111 = 11;
        tw0 tw0Var142 = new tw0(405, org.telegram.messenger.gd.M0(2131745131), org.telegram.messenger.gd.M0(2131748861), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i111;
                int i112 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i112, 14), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.mp.u1(currentAccount).V1().s()) {
            final int i112 = 12;
            tw0 tw0Var143 = new tw0(406, org.telegram.messenger.gd.M0(2131751346), org.telegram.messenger.gd.M0(2131748861), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i1022 = i112;
                    int i1122 = 0;
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    switch (i1022) {
                        case 0:
                            y90 y90Var = new y90();
                            g2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            g2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            g2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            g2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            g2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            g2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            g2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            g2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i1122)).f == 1) {
                                    y90Var8.b.e1(new ai.n1(y90Var8, i1122, 14), 700, true);
                                    break;
                                } else {
                                    i1122++;
                                }
                            }
                        case 10:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            g2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                            y0Var.L0();
                            g2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                            break;
                        case 15:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                            break;
                        case 16:
                            vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                            break;
                        case 17:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            g2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            g2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            g2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                            y0Var2.L0();
                            g2Var2.showDialog(y0Var2);
                            break;
                        case 24:
                            g2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            g2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            rt0 rt0Var = new rt0();
                            rt0Var.getMessagesController().H0(true);
                            g2Var2.presentFragment(rt0Var);
                            break;
                        case 27:
                            g2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            tw0Var143.a("tg://settings/language/do-not-translate");
            tw0Var43 = tw0Var143;
        }
        final int i113 = 14;
        tw0 tw0Var144 = new tw0(402, org.telegram.messenger.gd.M0(2131753983), org.telegram.messenger.gd.M0(2131745283), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i113;
                int i1122 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i1122)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i1122, 14), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var144.a("tg://settings/ask-question");
        final int i114 = 15;
        tw0 tw0Var145 = new tw0(403, org.telegram.messenger.gd.M0(2131743997), org.telegram.messenger.gd.M0(2131745283), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i114;
                int i1122 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i1122)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i1122, 14), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var145.a("tg://settings/faq");
        final int i115 = 16;
        tw0 tw0Var146 = new tw0(404, org.telegram.messenger.gd.M0(2131746589), org.telegram.messenger.gd.M0(2131745283), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i115;
                int i1122 = 0;
                org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        g2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        g2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        g2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        g2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        g2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        g2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        g2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        g2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        g2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i1122)).f == 1) {
                                y90Var8.b.e1(new ai.n1(y90Var8, i1122, 14), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        g2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.y0 y0Var = new ug.y0(g2Var2, 0, false);
                        y0Var.L0();
                        g2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        g2Var2.showDialog(org.telegram.ui.Components.b5.R(g2Var2, null));
                        break;
                    case 15:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131743995, null));
                        break;
                    case 16:
                        vf.c.t(g2Var2.getParentActivity(), org.telegram.messenger.gd.N0(2131746587, null));
                        break;
                    case 17:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        g2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        g2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        g2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.y0 y0Var2 = new ug.y0(g2Var2, 11, false);
                        y0Var2.L0();
                        g2Var2.showDialog(y0Var2);
                        break;
                    case 24:
                        g2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        g2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        rt0 rt0Var = new rt0();
                        rt0Var.getMessagesController().H0(true);
                        g2Var2.presentFragment(rt0Var);
                        break;
                    case 27:
                        g2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        g2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        g2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        tw0Var146.a("tg://settings/privacy-policy");
        return new tw0[]{tw0Var23, tw0Var24, tw0Var25, tw0Var26, tw0Var27, tw0Var28, tw0Var29, tw0Var30, tw0Var31, tw0Var32, tw0Var33, tw0Var34, tw0Var35, tw0Var36, tw0Var37, tw0Var38, tw0Var39, tw0Var, tw0Var41, tw0Var42, tw0Var2, tw0Var44, tw0Var45, tw0Var46, tw0Var47, tw0Var48, tw0Var49, tw0Var50, tw0Var51, tw0Var52, tw0Var3, tw0Var4, tw0Var54, tw0Var55, tw0Var56, tw0Var57, tw0Var58, tw0Var59, tw0Var60, tw0Var61, tw0Var62, tw0Var63, tw0Var64, tw0Var65, tw0Var66, tw0Var67, tw0Var68, tw0Var69, tw0Var70, tw0Var71, tw0Var72, tw0Var73, tw0Var74, tw0Var75, tw0Var76, tw0Var77, tw0Var78, tw0Var79, tw0Var80, tw0Var81, tw0Var82, tw0Var83, tw0Var84, tw0Var85, tw0Var86, tw0Var87, tw0Var88, tw0Var89, tw0Var90, tw0Var91, tw0Var92, tw0Var93, tw0Var94, tw0Var95, tw0Var96, tw0Var97, tw0Var98, tw0Var99, tw0Var100, tw0Var101, tw0Var102, tw0Var103, tw0Var104, tw0Var105, tw0Var106, tw0Var107, tw0Var108, tw0Var109, tw0Var110, tw0Var111, tw0Var112, tw0Var6, tw0Var114, tw0Var7, tw0Var116, tw0Var8, tw0Var118, tw0Var119, tw0Var120, tw0Var121, tw0Var5, tw0Var9, tw0Var10, tw0Var11, tw0Var12, tw0Var13, tw0Var14, tw0Var15, tw0Var16, tw0Var123, tw0Var17, tw0Var18, tw0Var19, tw0Var20, tw0Var21, tw0Var124, tw0Var125, tw0Var126, tw0Var127, tw0Var128, tw0Var129, tw0Var130, tw0Var131, tw0Var132, tw0Var133, tw0Var134, tw0Var135, tw0Var22, tw0Var136, tw0Var137, tw0Var138, tw0Var139, tw0Var140, tw0Var141, tw0Var142, tw0Var43, tw0Var144, tw0Var145, tw0Var146};
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 0;
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
            if (obj2 instanceof tw0) {
                ((tw0) obj2).g = i7;
            } else if (obj2 instanceof org.telegram.messenger.yo) {
                ((org.telegram.messenger.yo) obj2).d = i7;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.mp.g1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i7 = this.f;
        TLRPC.WebPage webPage = org.telegram.messenger.mp.u1(i7).t2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.mp.u1(i7).s2);
        }
        if (this.F != null || this.G) {
            return;
        }
        this.G = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = org.telegram.messenger.gd.N0(2131743995, null);
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
            org.telegram.messenger.q5 q5Var = Utilities.g;
            mp0 mp0Var = new mp0(25, this, str);
            this.y = mp0Var;
            q5Var.d(mp0Var, 300L);
            return;
        }
        this.x = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.g2 g2Var = this.e;
        if (g2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) g2Var).P.b.getImageReceiver().Q0(false);
                ((ProfileActivity) this.e).P.d.setText(org.telegram.messenger.gd.N0(2131745281, null));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        f();
    }

    public final void J() {
        String[] strArr;
        tw0 tw0Var;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            tw0[] tw0VarArr = this.c;
            if (i7 >= tw0VarArr.length) {
                break;
            }
            tw0 tw0Var2 = tw0VarArr[i7];
            if (tw0Var2 != null) {
                hashMap.put(Integer.valueOf(tw0Var2.f), this.c[i7]);
            }
            i7++;
        }
        Set<String> stringSet = org.telegram.messenger.mp.g1().getStringSet("settingsSearchRecent2", null);
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
                        org.telegram.messenger.yo yoVar = new org.telegram.messenger.yo(readString, strArr, serializedData.readString(false));
                        yoVar.d = readInt32;
                        arrayList.add(yoVar);
                    } else if (readInt322 == 1 && (tw0Var = (tw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        tw0Var.g = readInt32;
                        arrayList.add(tw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new ow0(this));
    }

    @Override // v4.i0
    public final int b() {
        if (this.x) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.w;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // v4.i0
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

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 0) {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.N0(2131745286, null));
                return;
            } else {
                if (i10 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.gd.N0(2131745273, null));
                return;
            }
        }
        org.telegram.ui.Cells.v6 v6Var = (org.telegram.ui.Cells.v6) view;
        if (this.x) {
            if (i7 >= this.r.size()) {
                int f10 = i5.c.f(1, i7, this.r);
                v6Var.a((CharSequence) this.n.get(this.r.size() + f10), ((org.telegram.messenger.yo) this.s.get(f10)).b, true, f10 < this.r.size() - 1);
                return;
            } else {
                tw0 tw0Var = (tw0) this.r.get(i7);
                tw0 tw0Var2 = i7 > 0 ? (tw0) this.r.get(i7 - 1) : null;
                v6Var.b((CharSequence) this.n.get(i7), tw0Var.d, (tw0Var2 == null || tw0Var2.e != tw0Var.e) ? tw0Var.e : 0, i7 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.w;
        if (!arrayList.isEmpty()) {
            i7--;
        }
        if (i7 >= arrayList.size()) {
            int f11 = i5.c.f(1, i7, arrayList);
            org.telegram.messenger.yo yoVar = (org.telegram.messenger.yo) this.d.get(f11);
            v6Var.a(yoVar.a, yoVar.b, true, f11 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i7);
        if (obj instanceof tw0) {
            tw0 tw0Var3 = (tw0) obj;
            v6Var.a(tw0Var3.a, tw0Var3.d, false, i7 < arrayList.size() - 1);
        } else if (obj instanceof org.telegram.messenger.yo) {
            org.telegram.messenger.yo yoVar2 = (org.telegram.messenger.yo) obj;
            v6Var.a(yoVar2.a, yoVar2.b, true, i7 < arrayList.size() - 1);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.h;
        View o4Var = i7 != 0 ? i7 != 1 ? new org.telegram.ui.Cells.o4(context, 16) : new org.telegram.ui.Cells.y3(context, null) : new org.telegram.ui.Cells.v6(context);
        o4Var.setLayoutParams(new v4.q0(-1, -2));
        return new org.telegram.ui.Components.mj0(o4Var);
    }
}
