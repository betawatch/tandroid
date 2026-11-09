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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class ww0 extends org.telegram.ui.Components.pj0 {
    public String D;
    public TLRPC.WebPage E;
    public boolean F;
    public vw0[] c;
    public final org.telegram.ui.ActionBar.f2 e;
    public final int f;
    public final Context h;
    public boolean x;
    public sn0 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public ww0(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        this.e = f2Var;
        this.f = f2Var.getCurrentAccount();
        this.h = context;
        this.c = H(f2Var);
        J();
    }

    public static boolean F(int i7, int i10) {
        if (!org.telegram.messenger.qp.s1(i7).D3() || org.telegram.messenger.p10.i(i7).q()) {
            return i10 == -1 || org.telegram.messenger.qp.s1(i7).N0.get(i10, -1) != -1;
        }
        return false;
    }

    public static vw0[] H(final org.telegram.ui.ActionBar.f2 f2Var) {
        vw0 vw0Var;
        vw0 vw0Var2;
        vw0 vw0Var3;
        vw0 vw0Var4;
        vw0 vw0Var5;
        vw0 vw0Var6;
        vw0 vw0Var7;
        vw0 vw0Var8;
        vw0 vw0Var9;
        vw0 vw0Var10;
        vw0 vw0Var11;
        vw0 vw0Var12;
        vw0 vw0Var13;
        vw0 vw0Var14;
        vw0 vw0Var15;
        vw0 vw0Var16;
        vw0 vw0Var17;
        vw0 vw0Var18;
        vw0 vw0Var19;
        vw0 vw0Var20;
        vw0 vw0Var21;
        vw0 vw0Var22;
        final int currentAccount = f2Var.getCurrentAccount();
        vw0 vw0Var23 = new vw0(500, org.telegram.messenger.id.L0(2131751264), 0, new sn0(27, f2Var, f2Var.getResourceProvider()));
        final int i7 = 24;
        vw0 vw0Var24 = new vw0(501, org.telegram.messenger.id.L0(2131752537), 0, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i10 = i7;
                int i11 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i10) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i11)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i11, 12), 700, true);
                                break;
                            } else {
                                i11++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var24.a("tg://settings/edit/change-number");
        final int i10 = 6;
        vw0 vw0Var25 = new vw0(502, org.telegram.messenger.id.L0(2131754468), 0, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 4) {
                                i11 = -1;
                            } else if (org.telegram.messenger.p10.i(i11).p()) {
                                i11++;
                            }
                        }
                        if (i11 >= 0) {
                            f2Var.presentFragment(new ee0(i11));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var25.a("tg://settings/edit/add-account");
        final int i11 = 17;
        final int i12 = 1;
        vw0 vw0Var26 = new vw0(1, org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var26.a("tg://settings/notifications");
        final int i13 = 29;
        vw0 vw0Var27 = new vw0(2, org.telegram.messenger.id.L0(2131747878), org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var27.a("tg://settings/notifications/private-chats");
        final int i14 = 11;
        vw0 vw0Var28 = new vw0(3, org.telegram.messenger.id.L0(2131747907), org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        vw0Var28.a("tg://settings/notifications/groups");
        vw0 vw0Var29 = new vw0(4, org.telegram.messenger.id.L0(2131747921), org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new vf0(7, f2Var));
        vw0Var29.a("tg://settings/notifications/channels");
        final int i15 = 19;
        vw0 vw0Var30 = new vw0(5, org.telegram.messenger.id.L0(2131743279), "callsSectionRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new vf0(i15, f2Var));
        vw0 vw0Var31 = new vw0(6, org.telegram.messenger.id.L0(2131753733), "badgeNumberSection", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i16 = 13;
        vw0 vw0Var32 = new vw0(7, org.telegram.messenger.id.L0(2131749219), "inappSectionRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0 vw0Var33 = new vw0(8, org.telegram.messenger.id.L0(2131751790), "contactJoinedRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new vf0(23, f2Var));
        vw0Var33.a("tg://settings/notifications/new-contacts");
        vw0 vw0Var34 = new vw0(9, org.telegram.messenger.id.L0(2131747228), "pinnedMessageRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var34.a("tg://settings/notifications/pinned-messages");
        vw0 vw0Var35 = new vw0(10, org.telegram.messenger.id.L0(2131746112), "resetNotificationsRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i10;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var35.a("tg://settings/notifications/reset");
        vw0 vw0Var36 = new vw0(11, org.telegram.messenger.id.L0(2131747876), "notificationsServiceRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i11;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i17 = 18;
        vw0 vw0Var37 = new vw0(12, org.telegram.messenger.id.L0(2131747875), "notificationsServiceConnectionRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i17;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0 vw0Var38 = new vw0(13, org.telegram.messenger.id.L0(2131746275), "repeatRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i15;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i18 = 20;
        vw0 vw0Var39 = new vw0(100, org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i18;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var39.a("tg://settings/privacy");
        final int i19 = 21;
        vw0 vw0Var40 = new vw0(org.telegram.messenger.qs.u1, org.telegram.messenger.id.L0(2131743938), org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i19;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var40.a("tg://settings/privacy/2sv");
        final int i20 = 0;
        vw0 vw0Var41 = new vw0(org.telegram.messenger.qs.I1, org.telegram.messenger.id.L0(2131753850), org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                int i21 = i20;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                int i22 = currentAccount;
                switch (i21) {
                    case 0:
                        if (org.telegram.messenger.p10.i(i22).p0 >= 0) {
                            f2Var2.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.p10.i(i22).q()) {
                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(f2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(a02.W(), null);
                            kbVar.d(R.raw.voip_muted, new String[0]);
                            String M0 = org.telegram.messenger.id.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            kbVar.b.setText(spannableStringBuilder);
                            kbVar.b.setSingleLine(false);
                            kbVar.b.setMaxLines(2);
                            a02.b(kbVar, 2750).j();
                            break;
                        } else {
                            f2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        vw0Var41.a("tg://settings/privacy/auto-delete");
        final int i21 = 22;
        vw0 vw0Var42 = new vw0(org.telegram.messenger.qs.t1, org.telegram.messenger.id.L0(2131747657), org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i21;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var42.a("tg://settings/privacy/passcode");
        vw0 vw0Var43 = null;
        if (org.telegram.messenger.iz.m1) {
            vw0Var = vw0Var40;
            final int i22 = 25;
            vw0Var2 = new vw0(org.telegram.messenger.qs.J1, org.telegram.messenger.id.L0(2131751202), "emailLoginRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i22;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i112)).f == 1) {
                                    y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            break;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            break;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            break;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            break;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            vw0Var2.a("tg://settings/privacy/login-email");
        } else {
            vw0Var = vw0Var40;
            vw0Var2 = null;
        }
        final int i23 = 26;
        vw0 vw0Var44 = new vw0(101, org.telegram.messenger.id.L0(2131753681), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i23;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var44.a("tg://settings/privacy/blocked");
        final int i24 = 27;
        vw0 vw0Var45 = new vw0(org.telegram.messenger.qs.v1, org.telegram.messenger.id.L0(2131745551), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i24;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var45.a("tg://settings/devices");
        final int i25 = 28;
        vw0 vw0Var46 = new vw0(org.telegram.messenger.qs.q1, org.telegram.messenger.id.L0(2131746790), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i25;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var46.a("tg://settings/privacy/phone-number/");
        final int i26 = 29;
        vw0 vw0Var47 = new vw0(org.telegram.messenger.qs.n1, org.telegram.messenger.id.L0(2131746815), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i26;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var47.a("tg://settings/privacy/last-seen");
        final int i27 = 0;
        vw0 vw0Var48 = new vw0(org.telegram.messenger.qs.o1, org.telegram.messenger.id.L0(2131746777), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var48.a("tg://settings/privacy/profile-photos");
        final int i28 = 1;
        vw0 vw0Var49 = new vw0(org.telegram.messenger.qs.p1, org.telegram.messenger.id.L0(2131746837), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var49.a("tg://settings/privacy/forwards");
        final int i29 = 2;
        vw0 vw0Var50 = new vw0(org.telegram.messenger.qs.G1, org.telegram.messenger.id.L0(2131746800), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var50.a("tg://settings/privacy/calls/p2p");
        final int i30 = 3;
        vw0 vw0Var51 = new vw0(org.telegram.messenger.qs.r1, org.telegram.messenger.id.L0(2131752596), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var51.a("tg://settings/privacy/calls");
        final int i31 = 5;
        vw0 vw0Var52 = new vw0(org.telegram.messenger.qs.s1, org.telegram.messenger.id.L0(2131746817), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var52.a("tg://settings/privacy/invites");
        final int i32 = 1;
        vw0 vw0Var53 = new vw0(org.telegram.messenger.qs.H1, org.telegram.messenger.id.L0(2131746758), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.sw0
            @Override // java.lang.Runnable
            public final void run() {
                int i212 = i32;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                int i222 = currentAccount;
                switch (i212) {
                    case 0:
                        if (org.telegram.messenger.p10.i(i222).p0 >= 0) {
                            f2Var2.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.p10.i(i222).q()) {
                            org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(f2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(a02.W(), null);
                            kbVar.d(R.raw.voip_muted, new String[0]);
                            String M0 = org.telegram.messenger.id.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            kbVar.b.setText(spannableStringBuilder);
                            kbVar.b.setSingleLine(false);
                            kbVar.b.setMaxLines(2);
                            a02.b(kbVar, 2750).j();
                            break;
                        } else {
                            f2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        vw0Var53.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.qp.s1(currentAccount).Y3) {
            vw0Var3 = vw0Var53;
            final int i33 = 7;
            vw0Var4 = new vw0(org.telegram.messenger.qs.F1, org.telegram.messenger.id.L0(2131754171), "newChatsRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i33) {
                        case 0:
                            f2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            f2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            f2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            f2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 5:
                            f2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i112 = 0;
                            while (true) {
                                if (i112 >= 4) {
                                    i112 = -1;
                                } else if (org.telegram.messenger.p10.i(i112).p()) {
                                    i112++;
                                }
                            }
                            if (i112 >= 0) {
                                f2Var.presentFragment(new ee0(i112));
                                break;
                            }
                            break;
                        case 7:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            f2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            break;
                        case 15:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            f2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            f2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            f2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            f2Var.presentFragment(new y6());
                            break;
                        case 24:
                            f2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            break;
                        case 26:
                            f2Var.presentFragment(new y6());
                            break;
                        case 27:
                            f2Var.presentFragment(new y6());
                            break;
                        case 28:
                            f2Var.presentFragment(new mt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            vw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            vw0Var3 = vw0Var53;
            vw0Var4 = null;
        }
        final int i34 = 8;
        vw0 vw0Var54 = new vw0(org.telegram.messenger.qs.x1, org.telegram.messenger.id.L0(2131751596), "deleteAccountRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i34) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var54.a("tg://settings/privacy/self-destruct");
        final int i35 = 9;
        vw0 vw0Var55 = new vw0(org.telegram.messenger.qs.y1, org.telegram.messenger.id.L0(2131746797), "paymentsClearRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i36 = 10;
        vw0 vw0Var56 = new vw0(org.telegram.messenger.qs.z1, org.telegram.messenger.id.L0(2131742911), org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i36) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var56.a("tg://settings/privacy/active-websites");
        final int i37 = 11;
        vw0 vw0Var57 = new vw0(org.telegram.messenger.qs.A1, org.telegram.messenger.id.L0(2131744296), "contactsDeleteRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i38 = 12;
        vw0 vw0Var58 = new vw0(org.telegram.messenger.qs.B1, org.telegram.messenger.id.L0(2131744298), "contactsSyncRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i39 = 13;
        vw0 vw0Var59 = new vw0(org.telegram.messenger.qs.C1, org.telegram.messenger.id.L0(2131744412), "contactsSuggestRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i40 = 15;
        vw0 vw0Var60 = new vw0(org.telegram.messenger.qs.D1, org.telegram.messenger.id.L0(2131748689), "secretMapRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i41 = 16;
        vw0 vw0Var61 = new vw0(org.telegram.messenger.qs.E1, org.telegram.messenger.id.L0(2131745684), "secretWebpageRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i42 = 18;
        vw0 vw0Var62 = new vw0(120, org.telegram.messenger.id.L0(2131751455), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var62.a("tg://settings/devices");
        final int i43 = 19;
        vw0 vw0Var63 = new vw0(org.telegram.messenger.qs.F1, org.telegram.messenger.id.L0(2131744208), "terminateAllSessionsRow", org.telegram.messenger.id.L0(2131751455), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var63.a("tg://settings/devices/terminate-sessions");
        final int i44 = 20;
        vw0 vw0Var64 = new vw0(org.telegram.messenger.qs.G1, org.telegram.messenger.id.L0(2131748917), org.telegram.messenger.id.L0(2131751455), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var64.a("tg://settings/devices/link-desktop");
        final int i45 = 21;
        vw0 vw0Var65 = new vw0(org.telegram.messenger.qs.e3, org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var65.a("tg://settings/privacy/data-settings");
        final int i46 = 22;
        vw0 vw0Var66 = new vw0(org.telegram.messenger.qs.f3, org.telegram.messenger.id.L0(2131751676), "usageSectionRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i47 = 23;
        vw0 vw0Var67 = new vw0(org.telegram.messenger.qs.g3, org.telegram.messenger.id.L0(2131744816), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var67.a("tg://settings/data/storage");
        final int i48 = 24;
        vw0 vw0Var68 = new vw0(203, org.telegram.messenger.id.L0(2131749060), "keepMediaRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i49 = 26;
        vw0 vw0Var69 = new vw0(org.telegram.messenger.qs.i3, org.telegram.messenger.id.L0(2131752075), "cacheRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 27;
        vw0 vw0Var70 = new vw0(org.telegram.messenger.qs.j3, org.telegram.messenger.id.L0(2131748774), "databaseRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 28;
        vw0 vw0Var71 = new vw0(org.telegram.messenger.qs.k3, org.telegram.messenger.id.L0(2131748298), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        f2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        f2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        f2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        f2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i112 = 0;
                        while (true) {
                            if (i112 >= 4) {
                                i112 = -1;
                            } else if (org.telegram.messenger.p10.i(i112).p()) {
                                i112++;
                            }
                        }
                        if (i112 >= 0) {
                            f2Var.presentFragment(new ee0(i112));
                            break;
                        }
                        break;
                    case 7:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        f2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        f2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        f2Var.presentFragment(new y6());
                        break;
                    case 24:
                        f2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 26:
                        f2Var.presentFragment(new y6());
                        break;
                    case 27:
                        f2Var.presentFragment(new y6());
                        break;
                    case 28:
                        f2Var.presentFragment(new mt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        vw0Var71.a("tg://settings/data/usage");
        final int i52 = 0;
        vw0 vw0Var72 = new vw0(org.telegram.messenger.qs.l3, org.telegram.messenger.id.L0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        final int i53 = 1;
        vw0 vw0Var73 = new vw0(208, org.telegram.messenger.id.L0(2131742884), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        final int i54 = 2;
        vw0 vw0Var74 = new vw0(org.telegram.messenger.qs.m3, org.telegram.messenger.id.L0(2131742886), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        final int i55 = 3;
        vw0 vw0Var75 = new vw0(org.telegram.messenger.qs.n3, org.telegram.messenger.id.L0(2131742885), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        final int i56 = 4;
        vw0 vw0Var76 = new vw0(org.telegram.messenger.qs.o3, org.telegram.messenger.id.L0(2131746111), "resetDownloadRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        vw0Var76.a("tg://settings/data/auto-download/reset");
        final int i57 = 5;
        vw0 vw0Var77 = new vw0(org.telegram.messenger.qs.s3, org.telegram.messenger.id.L0(2131744438), "streamSectionRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        final int i58 = 7;
        vw0 vw0Var78 = new vw0(org.telegram.messenger.qs.t3, org.telegram.messenger.id.L0(2131751144), "enableStreamRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        final int i59 = 8;
        vw0 vw0Var79 = new vw0(org.telegram.messenger.qs.u3, org.telegram.messenger.id.L0(2131752596), "callsSectionRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        final int i60 = 9;
        vw0 vw0Var80 = new vw0(org.telegram.messenger.qs.v3, org.telegram.messenger.id.L0(2131743229), "useLessDataForCallsRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        vw0Var80.a("tg://settings/data/use-less-data");
        final int i61 = 10;
        vw0 vw0Var81 = new vw0(org.telegram.messenger.qs.w3, org.telegram.messenger.id.L0(2131743258), "quickRepliesRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        final int i62 = 12;
        vw0 vw0Var82 = new vw0(org.telegram.messenger.qs.x3, org.telegram.messenger.id.L0(2131746601), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        vw0Var82.a("tg://settings/data/proxy");
        final int i63 = 13;
        vw0 vw0Var83 = new vw0(org.telegram.messenger.qs.w1, org.telegram.messenger.id.L0(2131746841), "clearDraftsRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        vw0Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i64 = 14;
        vw0 vw0Var84 = new vw0(org.telegram.messenger.qs.z3, org.telegram.messenger.id.L0(2131745929), "saveToGallerySectionRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        final int i65 = 15;
        vw0 vw0Var85 = new vw0(org.telegram.messenger.qs.A3, org.telegram.messenger.id.L0(2131745919), "saveToGalleryPeerRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        vw0Var85.a("tg://settings/data/save-to-photos/chats");
        final int i66 = 16;
        vw0 vw0Var86 = new vw0(org.telegram.messenger.qs.B3, org.telegram.messenger.id.L0(2131745926), "saveToGalleryGroupsRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.uw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        f2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        f2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        f2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 7:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        f2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        f2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                }
            }
        });
        vw0Var86.a("tg://settings/data/save-to-photos/groups");
        vw0 vw0Var87 = new vw0(org.telegram.messenger.qs.C3, org.telegram.messenger.id.L0(2131745928), "saveToGalleryChannelsRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), R.drawable.msg2_data, new vf0(2, f2Var));
        vw0Var87.a("tg://settings/data/save-to-photos/channels");
        vw0 vw0Var88 = new vw0(org.telegram.messenger.qs.X4, org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(3, f2Var));
        vw0Var88.a("tg://settings/appearance/themes");
        vw0 vw0Var89 = new vw0(org.telegram.messenger.qs.Y4, org.telegram.messenger.id.L0(2131744191), "textSizeHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(4, f2Var));
        vw0Var89.a("tg://settings/appearance/text-size");
        vw0 vw0Var90 = new vw0(org.telegram.messenger.qs.Z4, org.telegram.messenger.id.L0(2131752550), org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(5, f2Var));
        vw0Var90.a("tg://settings/appearance/wallpapers");
        vw0 vw0Var91 = new vw0(org.telegram.messenger.qs.a5, org.telegram.messenger.id.L0(2131745538), null, org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), R.drawable.msg2_discussion, new vf0(6, f2Var));
        vw0 vw0Var92 = new vw0(org.telegram.messenger.qs.b5, org.telegram.messenger.id.L0(2131746108), "resetRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), R.drawable.msg2_discussion, new vf0(8, f2Var));
        vw0 vw0Var93 = new vw0(org.telegram.messenger.qs.d5, org.telegram.messenger.id.L0(2131752011), "themeHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(9, f2Var));
        vw0 vw0Var94 = new vw0(org.telegram.messenger.qs.q5, org.telegram.messenger.id.L0(2131752878), null, org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(10, f2Var));
        vw0 vw0Var95 = new vw0(org.telegram.messenger.qs.r5, org.telegram.messenger.id.L0(2131751712), "createNewThemeRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752878), R.drawable.msg2_discussion, new vf0(11, f2Var));
        vw0Var95.a("tg://settings/appearance/themes/create");
        vw0 vw0Var96 = new vw0(org.telegram.messenger.qs.s5, org.telegram.messenger.id.L0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(13, f2Var));
        vw0Var96.a("tg://settings/appearance/message-corners");
        vw0 vw0Var97 = new vw0(org.telegram.messenger.qs.t5, org.telegram.messenger.id.L0(2131752225), "chatListHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(14, f2Var));
        vw0 vw0Var98 = new vw0(org.telegram.messenger.qs.u5, org.telegram.messenger.id.L0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(15, f2Var));
        vw0 vw0Var99 = new vw0(org.telegram.messenger.qs.v5, org.telegram.messenger.id.L0(2131754240), "appIconHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(16, f2Var));
        vw0Var99.a("tg://settings/appearance/app-icon");
        vw0 vw0Var100 = new vw0(org.telegram.messenger.qs.c5, org.telegram.messenger.id.L0(2131753784), org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(17, f2Var));
        vw0 vw0Var101 = new vw0(org.telegram.messenger.qs.z5, org.telegram.messenger.id.L0(2131748249), "nextMediaTapRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(18, f2Var));
        vw0Var101.a("tg://settings/appearance/tap-for-next-media");
        vw0 vw0Var102 = new vw0(org.telegram.messenger.qs.y5, org.telegram.messenger.id.L0(2131746427), "raiseToListenRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(20, f2Var));
        vw0Var102.a("tg://settings/data/raise-to-listen");
        vw0 vw0Var103 = new vw0(org.telegram.messenger.qs.h5, org.telegram.messenger.id.L0(2131746425), "raiseToSpeakRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(21, f2Var));
        vw0Var103.a("tg://settings/data/raise-to-speak");
        vw0 vw0Var104 = new vw0(org.telegram.messenger.qs.x5, org.telegram.messenger.id.L0(2131747432), "pauseOnMediaRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(22, f2Var));
        vw0Var104.a("tg://settings/data/pause-music");
        vw0 vw0Var105 = new vw0(org.telegram.messenger.qs.w5, org.telegram.messenger.id.L0(2131748439), "bluetoothScoRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(24, f2Var));
        vw0 vw0Var106 = new vw0(org.telegram.messenger.qs.f5, org.telegram.messenger.id.L0(2131751438), "directShareRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(25, f2Var));
        vw0 vw0Var107 = new vw0(org.telegram.messenger.qs.i5, org.telegram.messenger.id.L0(2131745632), "sendByEnterRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(26, f2Var));
        vw0 vw0Var108 = new vw0(org.telegram.messenger.qs.p5, org.telegram.messenger.id.L0(2131751367), "distanceRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new vf0(27, f2Var));
        vw0 vw0Var109 = new vw0(600, org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new vf0(28, f2Var));
        vw0Var109.a("tg://settings/appearance/stickers-and-emoji");
        vw0 vw0Var110 = new vw0(601, org.telegram.messenger.id.L0(2131744402), "suggestRow", org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new vf0(29, f2Var));
        final int i67 = 0;
        vw0 vw0Var111 = new vw0(602, org.telegram.messenger.id.L0(2131750833), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i68 = 2;
        vw0 vw0Var112 = new vw0(603, org.telegram.messenger.id.L0(2131748679), null, org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i69 = 3;
        vw0 vw0Var113 = new vw0(604, org.telegram.messenger.id.L0(2131754128), null, org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i70 = 5;
        vw0 vw0Var114 = new vw0(605, org.telegram.messenger.id.L0(2131754133), null, org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i71 = 6;
        vw0 vw0Var115 = new vw0(606, org.telegram.messenger.id.L0(2131749034), "largeEmojiRow", org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i72 = 7;
        vw0 vw0Var116 = new vw0(607, org.telegram.messenger.id.L0(2131748722), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i73 = 8;
        vw0 vw0Var117 = new vw0(608, org.telegram.messenger.id.L0(2131751196), null, org.telegram.messenger.id.L0(2131744857), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i74 = 9;
        vw0 vw0Var118 = new vw0(609, org.telegram.messenger.id.L0(2131744416), "suggestAnimatedEmojiRow", org.telegram.messenger.id.L0(2131744857), org.telegram.messenger.id.L0(2131751196), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i75 = 10;
        vw0 vw0Var119 = new vw0(610, org.telegram.messenger.id.L0(2131750835), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744857), org.telegram.messenger.id.L0(2131751196), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i76 = 11;
        vw0 vw0Var120 = new vw0(611, org.telegram.messenger.id.L0(2131751350), null, org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i77 = 12;
        vw0 vw0Var121 = new vw0(700, org.telegram.messenger.id.L0(2131750696), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var121.a("tg://settings/folders");
        final int i78 = 21;
        vw0 vw0Var122 = new vw0(701, org.telegram.messenger.id.L0(2131751716), "createFilterRow", org.telegram.messenger.id.L0(2131750696), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            vw0Var5 = vw0Var122;
            vw0Var6 = vw0Var113;
            vw0Var7 = vw0Var115;
            final int i79 = 2;
            vw0Var8 = vw0Var117;
            vw0Var9 = new vw0(800, org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.rw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i79;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i112)).f == 1) {
                                    y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            break;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            break;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            break;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            break;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            vw0Var5 = vw0Var122;
            vw0Var6 = vw0Var113;
            vw0Var7 = vw0Var115;
            vw0Var8 = vw0Var117;
            vw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i80 = 13;
            vw0Var10 = new vw0(801, org.telegram.messenger.id.L0(2131746998), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.rw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i80;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i112)).f == 1) {
                                    y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            break;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            break;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            break;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            break;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            vw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i81 = 23;
            vw0Var11 = new vw0(802, org.telegram.messenger.id.L0(2131747007), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.rw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i81;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i112)).f == 1) {
                                    y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            break;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            break;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            break;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            break;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            vw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i82 = 4;
            vw0Var12 = new vw0(803, org.telegram.messenger.id.L0(2131746964), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.tw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            f2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            f2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            f2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            f2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 5:
                            f2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i112 = 0;
                            while (true) {
                                if (i112 >= 4) {
                                    i112 = -1;
                                } else if (org.telegram.messenger.p10.i(i112).p()) {
                                    i112++;
                                }
                            }
                            if (i112 >= 0) {
                                f2Var.presentFragment(new ee0(i112));
                                break;
                            }
                            break;
                        case 7:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            f2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            break;
                        case 15:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            f2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            f2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            f2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            f2Var.presentFragment(new y6());
                            break;
                        case 24:
                            f2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            break;
                        case 26:
                            f2Var.presentFragment(new y6());
                            break;
                        case 27:
                            f2Var.presentFragment(new y6());
                            break;
                        case 28:
                            f2Var.presentFragment(new mt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            vw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i83 = 14;
            vw0Var13 = new vw0(804, org.telegram.messenger.id.L0(2131747012), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.tw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            f2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            f2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            f2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            f2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 5:
                            f2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i112 = 0;
                            while (true) {
                                if (i112 >= 4) {
                                    i112 = -1;
                                } else if (org.telegram.messenger.p10.i(i112).p()) {
                                    i112++;
                                }
                            }
                            if (i112 >= 0) {
                                f2Var.presentFragment(new ee0(i112));
                                break;
                            }
                            break;
                        case 7:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            f2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            break;
                        case 15:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            f2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            f2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            f2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            f2Var.presentFragment(new y6());
                            break;
                        case 24:
                            f2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            break;
                        case 26:
                            f2Var.presentFragment(new y6());
                            break;
                        case 27:
                            f2Var.presentFragment(new y6());
                            break;
                        case 28:
                            f2Var.presentFragment(new mt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            vw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i84 = 25;
            vw0Var14 = new vw0(805, org.telegram.messenger.id.L0(2131746962), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.tw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            f2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            f2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            f2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            f2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 1, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 5:
                            f2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i112 = 0;
                            while (true) {
                                if (i112 >= 4) {
                                    i112 = -1;
                                } else if (org.telegram.messenger.p10.i(i112).p()) {
                                    i112++;
                                }
                            }
                            if (i112 >= 0) {
                                f2Var.presentFragment(new ee0(i112));
                                break;
                            }
                            break;
                        case 7:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            f2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 2, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            break;
                        case 15:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            f2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            f2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            f2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            f2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            f2Var.presentFragment(new y6());
                            break;
                        case 24:
                            f2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 8, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            break;
                        case 26:
                            f2Var.presentFragment(new y6());
                            break;
                        case 27:
                            f2Var.presentFragment(new y6());
                            break;
                        case 28:
                            f2Var.presentFragment(new mt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            vw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i85 = 6;
            vw0Var15 = new vw0(806, org.telegram.messenger.id.L0(2131746992), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.uw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            f2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            f2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            f2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 7:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            f2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            break;
                    }
                }
            });
        } else {
            vw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i86 = 17;
            vw0Var16 = new vw0(807, org.telegram.messenger.id.L0(2131746983), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.uw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            f2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            f2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            f2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 3, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 7:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            f2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            f2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 4, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            break;
                    }
                }
            });
        } else {
            vw0Var16 = null;
        }
        vw0 vw0Var123 = F(currentAccount, 5) ? new vw0(808, org.telegram.messenger.id.L0(2131746976), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new vf0(12, f2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i87 = 4;
            vw0Var17 = new vw0(809, org.telegram.messenger.id.L0(2131747025), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            f2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            f2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 5:
                            f2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            y90 y90Var = new y90();
                            f2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            break;
                        case 8:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            f2Var.presentFragment(new ey0());
                            break;
                        case 12:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                            ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                            w0Var4.K0();
                            f2Var5.showDialog(w0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                            ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                            w0Var5.K0();
                            f2Var6.showDialog(w0Var5);
                            break;
                        case 18:
                            f2Var.presentFragment(new y90());
                            break;
                        case 19:
                            y90 y90Var2 = new y90();
                            f2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            break;
                        case 20:
                            y90 y90Var3 = new y90();
                            f2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            y90 y90Var4 = new y90();
                            f2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            break;
                        case 23:
                            y90 y90Var5 = new y90();
                            f2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            y90 y90Var6 = new y90();
                            f2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            break;
                        case 26:
                            y90 y90Var7 = new y90();
                            f2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            break;
                        case 27:
                            y90 y90Var8 = new y90();
                            f2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            break;
                        case 28:
                            y90 y90Var9 = new y90();
                            f2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            break;
                        default:
                            y90 y90Var10 = new y90();
                            f2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            vw0Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i88 = 14;
            vw0Var18 = new vw0(810, org.telegram.messenger.id.L0(2131746987), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            f2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            f2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 5:
                            f2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            y90 y90Var = new y90();
                            f2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            break;
                        case 8:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            f2Var.presentFragment(new ey0());
                            break;
                        case 12:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                            ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                            w0Var4.K0();
                            f2Var5.showDialog(w0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                            ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                            w0Var5.K0();
                            f2Var6.showDialog(w0Var5);
                            break;
                        case 18:
                            f2Var.presentFragment(new y90());
                            break;
                        case 19:
                            y90 y90Var2 = new y90();
                            f2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            break;
                        case 20:
                            y90 y90Var3 = new y90();
                            f2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            y90 y90Var4 = new y90();
                            f2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            break;
                        case 23:
                            y90 y90Var5 = new y90();
                            f2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            y90 y90Var6 = new y90();
                            f2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            break;
                        case 26:
                            y90 y90Var7 = new y90();
                            f2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            break;
                        case 27:
                            y90 y90Var8 = new y90();
                            f2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            break;
                        case 28:
                            y90 y90Var9 = new y90();
                            f2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            break;
                        default:
                            y90 y90Var10 = new y90();
                            f2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            vw0Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i89 = 15;
            vw0Var19 = new vw0(811, org.telegram.messenger.id.L0(2131747022), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            f2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            f2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 5:
                            f2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            y90 y90Var = new y90();
                            f2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            break;
                        case 8:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            f2Var.presentFragment(new ey0());
                            break;
                        case 12:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                            ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                            w0Var4.K0();
                            f2Var5.showDialog(w0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                            ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                            w0Var5.K0();
                            f2Var6.showDialog(w0Var5);
                            break;
                        case 18:
                            f2Var.presentFragment(new y90());
                            break;
                        case 19:
                            y90 y90Var2 = new y90();
                            f2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            break;
                        case 20:
                            y90 y90Var3 = new y90();
                            f2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            y90 y90Var4 = new y90();
                            f2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            break;
                        case 23:
                            y90 y90Var5 = new y90();
                            f2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            y90 y90Var6 = new y90();
                            f2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            break;
                        case 26:
                            y90 y90Var7 = new y90();
                            f2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            break;
                        case 27:
                            y90 y90Var8 = new y90();
                            f2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            break;
                        case 28:
                            y90 y90Var9 = new y90();
                            f2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            break;
                        default:
                            y90 y90Var10 = new y90();
                            f2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            vw0Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i90 = 16;
            vw0Var20 = new vw0(812, org.telegram.messenger.id.L0(2131747020), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            f2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            f2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 5:
                            f2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            y90 y90Var = new y90();
                            f2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            break;
                        case 8:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            f2Var.presentFragment(new ey0());
                            break;
                        case 12:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                            ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                            w0Var4.K0();
                            f2Var5.showDialog(w0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                            ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                            w0Var5.K0();
                            f2Var6.showDialog(w0Var5);
                            break;
                        case 18:
                            f2Var.presentFragment(new y90());
                            break;
                        case 19:
                            y90 y90Var2 = new y90();
                            f2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            break;
                        case 20:
                            y90 y90Var3 = new y90();
                            f2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            y90 y90Var4 = new y90();
                            f2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            break;
                        case 23:
                            y90 y90Var5 = new y90();
                            f2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            y90 y90Var6 = new y90();
                            f2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            break;
                        case 26:
                            y90 y90Var7 = new y90();
                            f2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            break;
                        case 27:
                            y90 y90Var8 = new y90();
                            f2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            break;
                        case 28:
                            y90 y90Var9 = new y90();
                            f2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            break;
                        default:
                            y90 y90Var10 = new y90();
                            f2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            vw0Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i91 = 17;
            vw0Var21 = new vw0(813, org.telegram.messenger.id.L0(2131747004), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.pw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            f2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            f2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                            ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 5:
                            f2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            f2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            y90 y90Var = new y90();
                            f2Var.presentFragment(y90Var);
                            y90Var.b0(3);
                            y90Var.a0(2);
                            break;
                        case 8:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            f2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            f2Var.presentFragment(new ey0());
                            break;
                        case 12:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                            ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                            w0Var2.K0();
                            f2Var3.showDialog(w0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                            ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                            w0Var3.K0();
                            f2Var4.showDialog(w0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                            ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                            w0Var4.K0();
                            f2Var5.showDialog(w0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                            ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                            w0Var5.K0();
                            f2Var6.showDialog(w0Var5);
                            break;
                        case 18:
                            f2Var.presentFragment(new y90());
                            break;
                        case 19:
                            y90 y90Var2 = new y90();
                            f2Var.presentFragment(y90Var2);
                            y90Var2.a0(3);
                            break;
                        case 20:
                            y90 y90Var3 = new y90();
                            f2Var.presentFragment(y90Var3);
                            y90Var3.b0(3);
                            y90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            y90 y90Var4 = new y90();
                            f2Var.presentFragment(y90Var4);
                            y90Var4.b0(3);
                            y90Var4.a0(2);
                            break;
                        case 23:
                            y90 y90Var5 = new y90();
                            f2Var.presentFragment(y90Var5);
                            y90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            y90 y90Var6 = new y90();
                            f2Var.presentFragment(y90Var6);
                            y90Var6.b0(28700);
                            y90Var6.a0(16388);
                            break;
                        case 26:
                            y90 y90Var7 = new y90();
                            f2Var.presentFragment(y90Var7);
                            y90Var7.b0(28700);
                            y90Var7.a0(8200);
                            break;
                        case 27:
                            y90 y90Var8 = new y90();
                            f2Var.presentFragment(y90Var8);
                            y90Var8.b0(28700);
                            y90Var8.a0(4112);
                            break;
                        case 28:
                            y90 y90Var9 = new y90();
                            f2Var.presentFragment(y90Var9);
                            y90Var9.a0(360928);
                            break;
                        default:
                            y90 y90Var10 = new y90();
                            f2Var.presentFragment(y90Var10);
                            y90Var10.b0(360928);
                            y90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            vw0Var21 = null;
        }
        final int i92 = 18;
        vw0 vw0Var124 = new vw0(900, org.telegram.messenger.id.L0(2131747066), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i92) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var124.a("tg://settings/power-saving");
        final int i93 = 19;
        vw0 vw0Var125 = new vw0(901, org.telegram.messenger.id.L0(2131748850), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i93) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var125.a("tg://settings/power-saving/stickers");
        final int i94 = 20;
        vw0 vw0Var126 = new vw0(902, org.telegram.messenger.id.L0(2131748862), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i94) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i95 = 22;
        vw0 vw0Var127 = new vw0(903, org.telegram.messenger.id.L0(2131748864), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i95) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i96 = 23;
        vw0 vw0Var128 = new vw0(904, org.telegram.messenger.id.L0(2131748855), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var128.a("tg://settings/power-saving/emoji");
        final int i97 = 25;
        vw0 vw0Var129 = new vw0(905, org.telegram.messenger.id.L0(2131748862), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i98 = 26;
        vw0 vw0Var130 = new vw0(906, org.telegram.messenger.id.L0(2131748861), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i99 = 27;
        vw0 vw0Var131 = new vw0(907, org.telegram.messenger.id.L0(2131748864), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        final int i100 = 28;
        vw0 vw0Var132 = new vw0(908, org.telegram.messenger.id.L0(2131748856), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var132.a("tg://settings/power-saving/effects");
        final int i101 = 29;
        vw0 vw0Var133 = new vw0(909, org.telegram.messenger.id.L0(2131748859), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.pw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        f2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        f2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        ug.w0 w0Var = new ug.w0(f2Var2, 9, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 5:
                        f2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        f2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        y90 y90Var = new y90();
                        f2Var.presentFragment(y90Var);
                        y90Var.b0(3);
                        y90Var.a0(2);
                        break;
                    case 8:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        f2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        f2Var.presentFragment(new ey0());
                        break;
                    case 12:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.f2 f2Var3 = f2Var;
                        ug.w0 w0Var2 = new ug.w0(f2Var3, 6, false);
                        w0Var2.K0();
                        f2Var3.showDialog(w0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.f2 f2Var4 = f2Var;
                        ug.w0 w0Var3 = new ug.w0(f2Var4, 7, false);
                        w0Var3.K0();
                        f2Var4.showDialog(w0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.f2 f2Var5 = f2Var;
                        ug.w0 w0Var4 = new ug.w0(f2Var5, 10, false);
                        w0Var4.K0();
                        f2Var5.showDialog(w0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.f2 f2Var6 = f2Var;
                        ug.w0 w0Var5 = new ug.w0(f2Var6, 12, false);
                        w0Var5.K0();
                        f2Var6.showDialog(w0Var5);
                        break;
                    case 18:
                        f2Var.presentFragment(new y90());
                        break;
                    case 19:
                        y90 y90Var2 = new y90();
                        f2Var.presentFragment(y90Var2);
                        y90Var2.a0(3);
                        break;
                    case 20:
                        y90 y90Var3 = new y90();
                        f2Var.presentFragment(y90Var3);
                        y90Var3.b0(3);
                        y90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        y90 y90Var4 = new y90();
                        f2Var.presentFragment(y90Var4);
                        y90Var4.b0(3);
                        y90Var4.a0(2);
                        break;
                    case 23:
                        y90 y90Var5 = new y90();
                        f2Var.presentFragment(y90Var5);
                        y90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        y90 y90Var6 = new y90();
                        f2Var.presentFragment(y90Var6);
                        y90Var6.b0(28700);
                        y90Var6.a0(16388);
                        break;
                    case 26:
                        y90 y90Var7 = new y90();
                        f2Var.presentFragment(y90Var7);
                        y90Var7.b0(28700);
                        y90Var7.a0(8200);
                        break;
                    case 27:
                        y90 y90Var8 = new y90();
                        f2Var.presentFragment(y90Var8);
                        y90Var8.b0(28700);
                        y90Var8.a0(4112);
                        break;
                    case 28:
                        y90 y90Var9 = new y90();
                        f2Var.presentFragment(y90Var9);
                        y90Var9.a0(360928);
                        break;
                    default:
                        y90 y90Var10 = new y90();
                        f2Var.presentFragment(y90Var10);
                        y90Var10.b0(360928);
                        y90Var10.a0(32);
                        break;
                }
            }
        });
        vw0Var133.a("tg://settings/power-saving/background");
        final int i102 = 0;
        vw0 vw0Var134 = new vw0(910, org.telegram.messenger.id.L0(2131748847), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i102;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i103 = 1;
        vw0 vw0Var135 = new vw0(911, org.telegram.messenger.id.L0(2131748851), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i103;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        if (org.telegram.messenger.iz.o() >= 1) {
            final int i104 = 3;
            vw0Var22 = new vw0(org.telegram.messenger.qs.x5, org.telegram.messenger.id.L0(2131748858), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.rw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i1022 = i104;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i1022) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i112)).f == 1) {
                                    y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            break;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            break;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            break;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            break;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            vw0Var22 = null;
        }
        final int i105 = 4;
        vw0 vw0Var136 = new vw0(912, org.telegram.messenger.id.L0(2131748852), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i105;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i106 = 5;
        vw0 vw0Var137 = new vw0(913, org.telegram.messenger.id.L0(2131748857), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i106;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var137.a("tg://settings/power-saving/call-animations");
        final int i107 = 7;
        vw0 vw0Var138 = new vw0(org.telegram.messenger.qs.r3, org.telegram.messenger.id.L0(2131748860), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i107;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var138.a("tg://settings/power-saving/videos");
        final int i108 = 8;
        vw0 vw0Var139 = new vw0(org.telegram.messenger.qs.q3, org.telegram.messenger.id.L0(2131748863), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i108;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var139.a("tg://settings/power-saving/gifs");
        final int i109 = 9;
        vw0 vw0Var140 = new vw0(914, org.telegram.messenger.id.L0(2131748846), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i109;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var140.a("tg://settings/power-saving/transitions");
        final int i110 = 10;
        vw0 vw0Var141 = new vw0(400, org.telegram.messenger.id.L0(2131749054), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i110;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var141.a("tg://settings/language");
        final int i111 = 11;
        vw0 vw0Var142 = new vw0(405, org.telegram.messenger.id.L0(2131745327), org.telegram.messenger.id.L0(2131749054), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i111;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i112)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.qp.s1(currentAccount).T1().s()) {
            final int i112 = 12;
            vw0 vw0Var143 = new vw0(406, org.telegram.messenger.id.L0(2131751358), org.telegram.messenger.id.L0(2131749054), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.rw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i1022 = i112;
                    int i1122 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i1022) {
                        case 0:
                            y90 y90Var = new y90();
                            f2Var2.presentFragment(y90Var);
                            y90Var.b0(360928);
                            y90Var.a0(64);
                            break;
                        case 1:
                            y90 y90Var2 = new y90();
                            f2Var2.presentFragment(y90Var2);
                            y90Var2.b0(360928);
                            y90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            y90 y90Var3 = new y90();
                            f2Var2.presentFragment(y90Var3);
                            y90Var3.b0(360928);
                            y90Var3.a0(256);
                            break;
                        case 4:
                            y90 y90Var4 = new y90();
                            f2Var2.presentFragment(y90Var4);
                            y90Var4.b0(360928);
                            y90Var4.a0(32768);
                            break;
                        case 5:
                            y90 y90Var5 = new y90();
                            f2Var2.presentFragment(y90Var5);
                            y90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            y90 y90Var6 = new y90();
                            f2Var2.presentFragment(y90Var6);
                            y90Var6.a0(1024);
                            break;
                        case 8:
                            y90 y90Var7 = new y90();
                            f2Var2.presentFragment(y90Var7);
                            y90Var7.a0(2048);
                            break;
                        case 9:
                            y90 y90Var8 = new y90();
                            f2Var2.presentFragment(y90Var8);
                            while (true) {
                                ArrayList arrayList = y90Var8.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((t90) arrayList.get(i1122)).f == 1) {
                                    y90Var8.b.e1(new l2.q(y90Var8, i1122, 12), 700, true);
                                    break;
                                } else {
                                    i1122++;
                                }
                            }
                        case 10:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            f2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                            w0Var.K0();
                            f2Var2.showDialog(w0Var);
                            break;
                        case 14:
                            f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                            break;
                        case 15:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                            break;
                        case 17:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            f2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            f2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                            w0Var2.K0();
                            f2Var2.showDialog(w0Var2);
                            break;
                        case 24:
                            f2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            f2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ut0 ut0Var = new ut0();
                            ut0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(ut0Var);
                            break;
                        case 27:
                            f2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            vw0Var143.a("tg://settings/language/do-not-translate");
            vw0Var43 = vw0Var143;
        }
        final int i113 = 14;
        vw0 vw0Var144 = new vw0(402, org.telegram.messenger.id.L0(2131753986), org.telegram.messenger.id.L0(2131745479), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i113;
                int i1122 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i1122)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var144.a("tg://settings/ask-question");
        final int i114 = 15;
        vw0 vw0Var145 = new vw0(403, org.telegram.messenger.id.L0(2131744242), org.telegram.messenger.id.L0(2131745479), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i114;
                int i1122 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i1122)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var145.a("tg://settings/faq");
        final int i115 = 16;
        vw0 vw0Var146 = new vw0(404, org.telegram.messenger.id.L0(2131746783), org.telegram.messenger.id.L0(2131745479), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.rw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i115;
                int i1122 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        y90 y90Var = new y90();
                        f2Var2.presentFragment(y90Var);
                        y90Var.b0(360928);
                        y90Var.a0(64);
                        break;
                    case 1:
                        y90 y90Var2 = new y90();
                        f2Var2.presentFragment(y90Var2);
                        y90Var2.b0(360928);
                        y90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        y90 y90Var3 = new y90();
                        f2Var2.presentFragment(y90Var3);
                        y90Var3.b0(360928);
                        y90Var3.a0(256);
                        break;
                    case 4:
                        y90 y90Var4 = new y90();
                        f2Var2.presentFragment(y90Var4);
                        y90Var4.b0(360928);
                        y90Var4.a0(32768);
                        break;
                    case 5:
                        y90 y90Var5 = new y90();
                        f2Var2.presentFragment(y90Var5);
                        y90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        y90 y90Var6 = new y90();
                        f2Var2.presentFragment(y90Var6);
                        y90Var6.a0(1024);
                        break;
                    case 8:
                        y90 y90Var7 = new y90();
                        f2Var2.presentFragment(y90Var7);
                        y90Var7.a0(2048);
                        break;
                    case 9:
                        y90 y90Var8 = new y90();
                        f2Var2.presentFragment(y90Var8);
                        while (true) {
                            ArrayList arrayList = y90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((t90) arrayList.get(i1122)).f == 1) {
                                y90Var8.b.e1(new l2.q(y90Var8, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        f2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        ug.w0 w0Var = new ug.w0(f2Var2, 0, false);
                        w0Var.K0();
                        f2Var2.showDialog(w0Var);
                        break;
                    case 14:
                        f2Var2.showDialog(org.telegram.ui.Components.v4.R(f2Var2, null));
                        break;
                    case 15:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744240, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746781, null));
                        break;
                    case 17:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        f2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        f2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        ug.w0 w0Var2 = new ug.w0(f2Var2, 11, false);
                        w0Var2.K0();
                        f2Var2.showDialog(w0Var2);
                        break;
                    case 24:
                        f2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        f2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ut0 ut0Var = new ut0();
                        ut0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(ut0Var);
                        break;
                    case 27:
                        f2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        f2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        f2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        vw0Var146.a("tg://settings/privacy-policy");
        return new vw0[]{vw0Var23, vw0Var24, vw0Var25, vw0Var26, vw0Var27, vw0Var28, vw0Var29, vw0Var30, vw0Var31, vw0Var32, vw0Var33, vw0Var34, vw0Var35, vw0Var36, vw0Var37, vw0Var38, vw0Var39, vw0Var, vw0Var41, vw0Var42, vw0Var2, vw0Var44, vw0Var45, vw0Var46, vw0Var47, vw0Var48, vw0Var49, vw0Var50, vw0Var51, vw0Var52, vw0Var3, vw0Var4, vw0Var54, vw0Var55, vw0Var56, vw0Var57, vw0Var58, vw0Var59, vw0Var60, vw0Var61, vw0Var62, vw0Var63, vw0Var64, vw0Var65, vw0Var66, vw0Var67, vw0Var68, vw0Var69, vw0Var70, vw0Var71, vw0Var72, vw0Var73, vw0Var74, vw0Var75, vw0Var76, vw0Var77, vw0Var78, vw0Var79, vw0Var80, vw0Var81, vw0Var82, vw0Var83, vw0Var84, vw0Var85, vw0Var86, vw0Var87, vw0Var88, vw0Var89, vw0Var90, vw0Var91, vw0Var92, vw0Var93, vw0Var94, vw0Var95, vw0Var96, vw0Var97, vw0Var98, vw0Var99, vw0Var100, vw0Var101, vw0Var102, vw0Var103, vw0Var104, vw0Var105, vw0Var106, vw0Var107, vw0Var108, vw0Var109, vw0Var110, vw0Var111, vw0Var112, vw0Var6, vw0Var114, vw0Var7, vw0Var116, vw0Var8, vw0Var118, vw0Var119, vw0Var120, vw0Var121, vw0Var5, vw0Var9, vw0Var10, vw0Var11, vw0Var12, vw0Var13, vw0Var14, vw0Var15, vw0Var16, vw0Var123, vw0Var17, vw0Var18, vw0Var19, vw0Var20, vw0Var21, vw0Var124, vw0Var125, vw0Var126, vw0Var127, vw0Var128, vw0Var129, vw0Var130, vw0Var131, vw0Var132, vw0Var133, vw0Var134, vw0Var135, vw0Var22, vw0Var136, vw0Var137, vw0Var138, vw0Var139, vw0Var140, vw0Var141, vw0Var142, vw0Var43, vw0Var144, vw0Var145, vw0Var146};
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 0;
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
            if (obj2 instanceof vw0) {
                ((vw0) obj2).g = i7;
            } else if (obj2 instanceof org.telegram.messenger.cp) {
                ((org.telegram.messenger.cp) obj2).d = i7;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.qp.e1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i7 = this.f;
        TLRPC.WebPage webPage = org.telegram.messenger.qp.s1(i7).q2;
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.qp.s1(i7).p2);
        }
        if (this.E != null || this.F) {
            return;
        }
        this.F = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = org.telegram.messenger.id.M0(2131744240, null);
        tL_messages_getWebPage.hash = 0;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getWebPage, new l(this, 20));
    }

    public final void I(String str) {
        this.D = str;
        if (this.y != null) {
            Utilities.g.a(this.y);
            this.y = null;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.g;
            sn0 sn0Var = new sn0(28, this, str);
            this.y = sn0Var;
            p5Var.d(sn0Var, 300L);
            return;
        }
        this.x = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.f2 f2Var = this.e;
        if (f2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) f2Var).O.b.getImageReceiver().P0(false);
                ((ProfileActivity) this.e).O.d.setText(org.telegram.messenger.id.M0(2131745477, null));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        f();
    }

    public final void J() {
        String[] strArr;
        vw0 vw0Var;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            vw0[] vw0VarArr = this.c;
            if (i7 >= vw0VarArr.length) {
                break;
            }
            vw0 vw0Var2 = vw0VarArr[i7];
            if (vw0Var2 != null) {
                hashMap.put(Integer.valueOf(vw0Var2.f), this.c[i7]);
            }
            i7++;
        }
        Set<String> stringSet = org.telegram.messenger.qp.e1().getStringSet("settingsSearchRecent2", null);
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
                        org.telegram.messenger.cp cpVar = new org.telegram.messenger.cp(readString, strArr, serializedData.readString(false));
                        cpVar.d = readInt32;
                        arrayList.add(cpVar);
                    } else if (readInt322 == 1 && (vw0Var = (vw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        vw0Var.g = readInt32;
                        arrayList.add(vw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new wn0(this));
    }

    @Override // v4.g0
    public final int b() {
        if (this.x) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.w;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // v4.g0
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

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.M0(2131745482, null));
                return;
            } else {
                if (i10 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.id.M0(2131745469, null));
                return;
            }
        }
        org.telegram.ui.Cells.v6 v6Var = (org.telegram.ui.Cells.v6) view;
        if (this.x) {
            if (i7 >= this.r.size()) {
                int g10 = jg.g.g(1, i7, this.r);
                v6Var.a((CharSequence) this.n.get(this.r.size() + g10), ((org.telegram.messenger.cp) this.s.get(g10)).b, true, g10 < this.r.size() - 1);
                return;
            } else {
                vw0 vw0Var = (vw0) this.r.get(i7);
                vw0 vw0Var2 = i7 > 0 ? (vw0) this.r.get(i7 - 1) : null;
                v6Var.b((CharSequence) this.n.get(i7), vw0Var.d, (vw0Var2 == null || vw0Var2.e != vw0Var.e) ? vw0Var.e : 0, i7 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.w;
        if (!arrayList.isEmpty()) {
            i7--;
        }
        if (i7 >= arrayList.size()) {
            int g11 = jg.g.g(1, i7, arrayList);
            org.telegram.messenger.cp cpVar = (org.telegram.messenger.cp) this.d.get(g11);
            v6Var.a(cpVar.a, cpVar.b, true, g11 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i7);
        if (obj instanceof vw0) {
            vw0 vw0Var3 = (vw0) obj;
            v6Var.a(vw0Var3.a, vw0Var3.d, false, i7 < arrayList.size() - 1);
        } else if (obj instanceof org.telegram.messenger.cp) {
            org.telegram.messenger.cp cpVar2 = (org.telegram.messenger.cp) obj;
            v6Var.a(cpVar2.a, cpVar2.b, true, i7 < arrayList.size() - 1);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.h;
        View n4Var = i7 != 0 ? i7 != 1 ? new org.telegram.ui.Cells.n4(context, 16) : new org.telegram.ui.Cells.x3(context, null) : new org.telegram.ui.Cells.v6(context);
        n4Var.setLayoutParams(new v4.o0(-1, -2));
        return new org.telegram.ui.Components.yi0(n4Var);
    }
}
