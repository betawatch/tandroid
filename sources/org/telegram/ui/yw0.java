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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class yw0 extends org.telegram.ui.Components.oj0 {
    public String D;
    public TLRPC.WebPage E;
    public boolean F;
    public xw0[] c;
    public final org.telegram.ui.ActionBar.f2 e;
    public final int f;
    public final Context h;
    public boolean x;
    public tn0 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public yw0(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
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

    public static xw0[] H(final org.telegram.ui.ActionBar.f2 f2Var) {
        xw0 xw0Var;
        xw0 xw0Var2;
        xw0 xw0Var3;
        xw0 xw0Var4;
        xw0 xw0Var5;
        xw0 xw0Var6;
        xw0 xw0Var7;
        xw0 xw0Var8;
        xw0 xw0Var9;
        xw0 xw0Var10;
        xw0 xw0Var11;
        xw0 xw0Var12;
        xw0 xw0Var13;
        xw0 xw0Var14;
        xw0 xw0Var15;
        xw0 xw0Var16;
        xw0 xw0Var17;
        xw0 xw0Var18;
        xw0 xw0Var19;
        xw0 xw0Var20;
        xw0 xw0Var21;
        xw0 xw0Var22;
        final int currentAccount = f2Var.getCurrentAccount();
        xw0 xw0Var23 = new xw0(500, org.telegram.messenger.id.L0(2131751264), 0, new tn0(28, f2Var, f2Var.getResourceProvider()));
        final int i7 = 24;
        xw0 xw0Var24 = new xw0(501, org.telegram.messenger.id.L0(2131752537), 0, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i10 = i7;
                int i11 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i10) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i11)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i11, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var24.a("tg://settings/edit/change-number");
        final int i10 = 6;
        xw0 xw0Var25 = new xw0(502, org.telegram.messenger.id.L0(2131754468), 0, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i11));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var25.a("tg://settings/edit/add-account");
        final int i11 = 17;
        final int i12 = 1;
        xw0 xw0Var26 = new xw0(1, org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var26.a("tg://settings/notifications");
        final int i13 = 29;
        xw0 xw0Var27 = new xw0(2, org.telegram.messenger.id.L0(2131747878), org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var27.a("tg://settings/notifications/private-chats");
        final int i14 = 11;
        xw0 xw0Var28 = new xw0(3, org.telegram.messenger.id.L0(2131747907), org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0Var28.a("tg://settings/notifications/groups");
        xw0 xw0Var29 = new xw0(4, org.telegram.messenger.id.L0(2131747921), org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new wf0(7, f2Var));
        xw0Var29.a("tg://settings/notifications/channels");
        final int i15 = 19;
        xw0 xw0Var30 = new xw0(5, org.telegram.messenger.id.L0(2131743279), "callsSectionRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new wf0(i15, f2Var));
        xw0 xw0Var31 = new xw0(6, org.telegram.messenger.id.L0(2131753733), "badgeNumberSection", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        final int i16 = 13;
        xw0 xw0Var32 = new xw0(7, org.telegram.messenger.id.L0(2131749219), "inappSectionRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0 xw0Var33 = new xw0(8, org.telegram.messenger.id.L0(2131751790), "contactJoinedRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new wf0(23, f2Var));
        xw0Var33.a("tg://settings/notifications/new-contacts");
        xw0 xw0Var34 = new xw0(9, org.telegram.messenger.id.L0(2131747228), "pinnedMessageRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var34.a("tg://settings/notifications/pinned-messages");
        xw0 xw0Var35 = new xw0(10, org.telegram.messenger.id.L0(2131746112), "resetNotificationsRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i10;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var35.a("tg://settings/notifications/reset");
        xw0 xw0Var36 = new xw0(11, org.telegram.messenger.id.L0(2131747876), "notificationsServiceRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i11;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0 xw0Var37 = new xw0(12, org.telegram.messenger.id.L0(2131747875), "notificationsServiceConnectionRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i17;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0 xw0Var38 = new xw0(13, org.telegram.messenger.id.L0(2131746275), "repeatRow", org.telegram.messenger.id.L0(2131747922), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i15;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0 xw0Var39 = new xw0(100, org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i18;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var39.a("tg://settings/privacy");
        final int i19 = 21;
        xw0 xw0Var40 = new xw0(org.telegram.messenger.qs.u1, org.telegram.messenger.id.L0(2131743938), org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i19;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var40.a("tg://settings/privacy/2sv");
        final int i20 = 0;
        xw0 xw0Var41 = new xw0(org.telegram.messenger.qs.I1, org.telegram.messenger.id.L0(2131753850), org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.uw0
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
                            org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(f2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(a02.W(), null);
                            jbVar.d(R.raw.voip_muted, new String[0]);
                            String M0 = org.telegram.messenger.id.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            jbVar.b.setText(spannableStringBuilder);
                            jbVar.b.setSingleLine(false);
                            jbVar.b.setMaxLines(2);
                            a02.b(jbVar, 2750).j();
                            break;
                        } else {
                            f2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        xw0Var41.a("tg://settings/privacy/auto-delete");
        final int i21 = 22;
        xw0 xw0Var42 = new xw0(org.telegram.messenger.qs.t1, org.telegram.messenger.id.L0(2131747657), org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i21;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var42.a("tg://settings/privacy/passcode");
        xw0 xw0Var43 = null;
        if (org.telegram.messenger.iz.m1) {
            xw0Var = xw0Var40;
            final int i22 = 25;
            xw0Var2 = new xw0(org.telegram.messenger.qs.J1, org.telegram.messenger.id.L0(2131751202), "emailLoginRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i22;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            break;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            break;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            break;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            break;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            break;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((u90) arrayList.get(i112)).f == 1) {
                                    z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var2.a("tg://settings/privacy/login-email");
        } else {
            xw0Var = xw0Var40;
            xw0Var2 = null;
        }
        final int i23 = 26;
        xw0 xw0Var44 = new xw0(101, org.telegram.messenger.id.L0(2131753681), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i23;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var44.a("tg://settings/privacy/blocked");
        final int i24 = 27;
        xw0 xw0Var45 = new xw0(org.telegram.messenger.qs.v1, org.telegram.messenger.id.L0(2131745551), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i24;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var45.a("tg://settings/devices");
        final int i25 = 28;
        xw0 xw0Var46 = new xw0(org.telegram.messenger.qs.q1, org.telegram.messenger.id.L0(2131746790), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i25;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var46.a("tg://settings/privacy/phone-number/");
        final int i26 = 29;
        xw0 xw0Var47 = new xw0(org.telegram.messenger.qs.n1, org.telegram.messenger.id.L0(2131746815), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i26;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var47.a("tg://settings/privacy/last-seen");
        final int i27 = 0;
        xw0 xw0Var48 = new xw0(org.telegram.messenger.qs.o1, org.telegram.messenger.id.L0(2131746777), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var48.a("tg://settings/privacy/profile-photos");
        final int i28 = 1;
        xw0 xw0Var49 = new xw0(org.telegram.messenger.qs.p1, org.telegram.messenger.id.L0(2131746837), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var49.a("tg://settings/privacy/forwards");
        final int i29 = 2;
        xw0 xw0Var50 = new xw0(org.telegram.messenger.qs.G1, org.telegram.messenger.id.L0(2131746800), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var50.a("tg://settings/privacy/calls/p2p");
        final int i30 = 3;
        xw0 xw0Var51 = new xw0(org.telegram.messenger.qs.r1, org.telegram.messenger.id.L0(2131752596), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var51.a("tg://settings/privacy/calls");
        final int i31 = 5;
        xw0 xw0Var52 = new xw0(org.telegram.messenger.qs.s1, org.telegram.messenger.id.L0(2131746817), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var52.a("tg://settings/privacy/invites");
        final int i32 = 1;
        xw0 xw0Var53 = new xw0(org.telegram.messenger.qs.H1, org.telegram.messenger.id.L0(2131746758), org.telegram.messenger.id.L0(2131746771), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.uw0
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
                            org.telegram.ui.Components.gc a02 = org.telegram.ui.Components.gc.a0(f2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.jb jbVar = new org.telegram.ui.Components.jb(a02.W(), null);
                            jbVar.d(R.raw.voip_muted, new String[0]);
                            String M0 = org.telegram.messenger.id.M0(2131746755, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new fi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            jbVar.b.setText(spannableStringBuilder);
                            jbVar.b.setSingleLine(false);
                            jbVar.b.setMaxLines(2);
                            a02.b(jbVar, 2750).j();
                            break;
                        } else {
                            f2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        xw0Var53.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.qp.s1(currentAccount).Y3) {
            xw0Var3 = xw0Var53;
            final int i33 = 7;
            xw0Var4 = new xw0(org.telegram.messenger.qs.F1, org.telegram.messenger.id.L0(2131754171), "newChatsRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                                f2Var.presentFragment(new fe0(i112));
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
                            f2Var.presentFragment(new nt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            xw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            xw0Var3 = xw0Var53;
            xw0Var4 = null;
        }
        final int i34 = 8;
        xw0 xw0Var54 = new xw0(org.telegram.messenger.qs.x1, org.telegram.messenger.id.L0(2131751596), "deleteAccountRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var54.a("tg://settings/privacy/self-destruct");
        final int i35 = 9;
        xw0 xw0Var55 = new xw0(org.telegram.messenger.qs.y1, org.telegram.messenger.id.L0(2131746797), "paymentsClearRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i36 = 10;
        xw0 xw0Var56 = new xw0(org.telegram.messenger.qs.z1, org.telegram.messenger.id.L0(2131742911), org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var56.a("tg://settings/privacy/active-websites");
        final int i37 = 11;
        xw0 xw0Var57 = new xw0(org.telegram.messenger.qs.A1, org.telegram.messenger.id.L0(2131744296), "contactsDeleteRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i38 = 12;
        xw0 xw0Var58 = new xw0(org.telegram.messenger.qs.B1, org.telegram.messenger.id.L0(2131744298), "contactsSyncRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i39 = 13;
        xw0 xw0Var59 = new xw0(org.telegram.messenger.qs.C1, org.telegram.messenger.id.L0(2131744412), "contactsSuggestRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i40 = 15;
        xw0 xw0Var60 = new xw0(org.telegram.messenger.qs.D1, org.telegram.messenger.id.L0(2131748689), "secretMapRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i41 = 16;
        xw0 xw0Var61 = new xw0(org.telegram.messenger.qs.E1, org.telegram.messenger.id.L0(2131745684), "secretWebpageRow", org.telegram.messenger.id.L0(2131746771), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i42 = 18;
        xw0 xw0Var62 = new xw0(120, org.telegram.messenger.id.L0(2131751455), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var62.a("tg://settings/devices");
        final int i43 = 19;
        xw0 xw0Var63 = new xw0(org.telegram.messenger.qs.F1, org.telegram.messenger.id.L0(2131744208), "terminateAllSessionsRow", org.telegram.messenger.id.L0(2131751455), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var63.a("tg://settings/devices/terminate-sessions");
        final int i44 = 20;
        xw0 xw0Var64 = new xw0(org.telegram.messenger.qs.G1, org.telegram.messenger.id.L0(2131748917), org.telegram.messenger.id.L0(2131751455), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var64.a("tg://settings/devices/link-desktop");
        final int i45 = 21;
        xw0 xw0Var65 = new xw0(org.telegram.messenger.qs.e3, org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var65.a("tg://settings/privacy/data-settings");
        final int i46 = 22;
        xw0 xw0Var66 = new xw0(org.telegram.messenger.qs.f3, org.telegram.messenger.id.L0(2131751676), "usageSectionRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i47 = 23;
        xw0 xw0Var67 = new xw0(org.telegram.messenger.qs.g3, org.telegram.messenger.id.L0(2131744816), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var67.a("tg://settings/data/storage");
        final int i48 = 24;
        xw0 xw0Var68 = new xw0(203, org.telegram.messenger.id.L0(2131749060), "keepMediaRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i49 = 26;
        xw0 xw0Var69 = new xw0(org.telegram.messenger.qs.i3, org.telegram.messenger.id.L0(2131752075), "cacheRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 27;
        xw0 xw0Var70 = new xw0(org.telegram.messenger.qs.j3, org.telegram.messenger.id.L0(2131748774), "databaseRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131744816), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 28;
        xw0 xw0Var71 = new xw0(org.telegram.messenger.qs.k3, org.telegram.messenger.id.L0(2131748298), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.vw0
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
                            f2Var.presentFragment(new fe0(i112));
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
                        f2Var.presentFragment(new nt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        xw0Var71.a("tg://settings/data/usage");
        final int i52 = 0;
        xw0 xw0Var72 = new xw0(org.telegram.messenger.qs.l3, org.telegram.messenger.id.L0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0 xw0Var73 = new xw0(208, org.telegram.messenger.id.L0(2131742884), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0 xw0Var74 = new xw0(org.telegram.messenger.qs.m3, org.telegram.messenger.id.L0(2131742886), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0 xw0Var75 = new xw0(org.telegram.messenger.qs.n3, org.telegram.messenger.id.L0(2131742885), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0 xw0Var76 = new xw0(org.telegram.messenger.qs.o3, org.telegram.messenger.id.L0(2131746111), "resetDownloadRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0Var76.a("tg://settings/data/auto-download/reset");
        final int i57 = 5;
        xw0 xw0Var77 = new xw0(org.telegram.messenger.qs.s3, org.telegram.messenger.id.L0(2131744438), "streamSectionRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0 xw0Var78 = new xw0(org.telegram.messenger.qs.t3, org.telegram.messenger.id.L0(2131751144), "enableStreamRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0 xw0Var79 = new xw0(org.telegram.messenger.qs.u3, org.telegram.messenger.id.L0(2131752596), "callsSectionRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0 xw0Var80 = new xw0(org.telegram.messenger.qs.v3, org.telegram.messenger.id.L0(2131743229), "useLessDataForCallsRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0Var80.a("tg://settings/data/use-less-data");
        final int i61 = 10;
        xw0 xw0Var81 = new xw0(org.telegram.messenger.qs.w3, org.telegram.messenger.id.L0(2131743258), "quickRepliesRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0 xw0Var82 = new xw0(org.telegram.messenger.qs.x3, org.telegram.messenger.id.L0(2131746601), org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0Var82.a("tg://settings/data/proxy");
        final int i63 = 13;
        xw0 xw0Var83 = new xw0(org.telegram.messenger.qs.w1, org.telegram.messenger.id.L0(2131746841), "clearDraftsRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i64 = 14;
        xw0 xw0Var84 = new xw0(org.telegram.messenger.qs.z3, org.telegram.messenger.id.L0(2131745929), "saveToGallerySectionRow", org.telegram.messenger.id.L0(2131751677), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0 xw0Var85 = new xw0(org.telegram.messenger.qs.A3, org.telegram.messenger.id.L0(2131745919), "saveToGalleryPeerRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0Var85.a("tg://settings/data/save-to-photos/chats");
        final int i66 = 16;
        xw0 xw0Var86 = new xw0(org.telegram.messenger.qs.B3, org.telegram.messenger.id.L0(2131745926), "saveToGalleryGroupsRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ww0
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
        xw0Var86.a("tg://settings/data/save-to-photos/groups");
        xw0 xw0Var87 = new xw0(org.telegram.messenger.qs.C3, org.telegram.messenger.id.L0(2131745928), "saveToGalleryChannelsRow", org.telegram.messenger.id.L0(2131751677), org.telegram.messenger.id.L0(2131745929), R.drawable.msg2_data, new wf0(2, f2Var));
        xw0Var87.a("tg://settings/data/save-to-photos/channels");
        xw0 xw0Var88 = new xw0(org.telegram.messenger.qs.X4, org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(3, f2Var));
        xw0Var88.a("tg://settings/appearance/themes");
        xw0 xw0Var89 = new xw0(org.telegram.messenger.qs.Y4, org.telegram.messenger.id.L0(2131744191), "textSizeHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(4, f2Var));
        xw0Var89.a("tg://settings/appearance/text-size");
        xw0 xw0Var90 = new xw0(org.telegram.messenger.qs.Z4, org.telegram.messenger.id.L0(2131752550), org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(5, f2Var));
        xw0Var90.a("tg://settings/appearance/wallpapers");
        xw0 xw0Var91 = new xw0(org.telegram.messenger.qs.a5, org.telegram.messenger.id.L0(2131745538), null, org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), R.drawable.msg2_discussion, new wf0(6, f2Var));
        xw0 xw0Var92 = new xw0(org.telegram.messenger.qs.b5, org.telegram.messenger.id.L0(2131746108), "resetRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), R.drawable.msg2_discussion, new wf0(8, f2Var));
        xw0 xw0Var93 = new xw0(org.telegram.messenger.qs.d5, org.telegram.messenger.id.L0(2131752011), "themeHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(9, f2Var));
        xw0 xw0Var94 = new xw0(org.telegram.messenger.qs.q5, org.telegram.messenger.id.L0(2131752878), null, org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(10, f2Var));
        xw0 xw0Var95 = new xw0(org.telegram.messenger.qs.r5, org.telegram.messenger.id.L0(2131751712), "createNewThemeRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752878), R.drawable.msg2_discussion, new wf0(11, f2Var));
        xw0Var95.a("tg://settings/appearance/themes/create");
        xw0 xw0Var96 = new xw0(org.telegram.messenger.qs.s5, org.telegram.messenger.id.L0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(13, f2Var));
        xw0Var96.a("tg://settings/appearance/message-corners");
        xw0 xw0Var97 = new xw0(org.telegram.messenger.qs.t5, org.telegram.messenger.id.L0(2131752225), "chatListHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(14, f2Var));
        xw0 xw0Var98 = new xw0(org.telegram.messenger.qs.u5, org.telegram.messenger.id.L0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(15, f2Var));
        xw0 xw0Var99 = new xw0(org.telegram.messenger.qs.v5, org.telegram.messenger.id.L0(2131754240), "appIconHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(16, f2Var));
        xw0Var99.a("tg://settings/appearance/app-icon");
        xw0 xw0Var100 = new xw0(org.telegram.messenger.qs.c5, org.telegram.messenger.id.L0(2131753784), org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(17, f2Var));
        xw0 xw0Var101 = new xw0(org.telegram.messenger.qs.z5, org.telegram.messenger.id.L0(2131748249), "nextMediaTapRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(18, f2Var));
        xw0Var101.a("tg://settings/appearance/tap-for-next-media");
        xw0 xw0Var102 = new xw0(org.telegram.messenger.qs.y5, org.telegram.messenger.id.L0(2131746427), "raiseToListenRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(20, f2Var));
        xw0Var102.a("tg://settings/data/raise-to-listen");
        xw0 xw0Var103 = new xw0(org.telegram.messenger.qs.h5, org.telegram.messenger.id.L0(2131746425), "raiseToSpeakRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(21, f2Var));
        xw0Var103.a("tg://settings/data/raise-to-speak");
        xw0 xw0Var104 = new xw0(org.telegram.messenger.qs.x5, org.telegram.messenger.id.L0(2131747432), "pauseOnMediaRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(22, f2Var));
        xw0Var104.a("tg://settings/data/pause-music");
        xw0 xw0Var105 = new xw0(org.telegram.messenger.qs.w5, org.telegram.messenger.id.L0(2131748439), "bluetoothScoRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(24, f2Var));
        xw0 xw0Var106 = new xw0(org.telegram.messenger.qs.f5, org.telegram.messenger.id.L0(2131751438), "directShareRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(25, f2Var));
        xw0 xw0Var107 = new xw0(org.telegram.messenger.qs.i5, org.telegram.messenger.id.L0(2131745632), "sendByEnterRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(26, f2Var));
        xw0 xw0Var108 = new xw0(org.telegram.messenger.qs.p5, org.telegram.messenger.id.L0(2131751367), "distanceRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new wf0(27, f2Var));
        xw0 xw0Var109 = new xw0(600, org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new wf0(28, f2Var));
        xw0Var109.a("tg://settings/appearance/stickers-and-emoji");
        xw0 xw0Var110 = new xw0(601, org.telegram.messenger.id.L0(2131744402), "suggestRow", org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new wf0(29, f2Var));
        final int i67 = 0;
        xw0 xw0Var111 = new xw0(602, org.telegram.messenger.id.L0(2131750833), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        final int i68 = 2;
        xw0 xw0Var112 = new xw0(603, org.telegram.messenger.id.L0(2131748679), null, org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        final int i69 = 3;
        xw0 xw0Var113 = new xw0(604, org.telegram.messenger.id.L0(2131754128), null, org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i70 = 5;
        xw0 xw0Var114 = new xw0(605, org.telegram.messenger.id.L0(2131754133), null, org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        final int i71 = 6;
        xw0 xw0Var115 = new xw0(606, org.telegram.messenger.id.L0(2131749034), "largeEmojiRow", org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i72 = 7;
        xw0 xw0Var116 = new xw0(607, org.telegram.messenger.id.L0(2131748722), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        final int i73 = 8;
        xw0 xw0Var117 = new xw0(608, org.telegram.messenger.id.L0(2131751196), null, org.telegram.messenger.id.L0(2131744857), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i74 = 9;
        xw0 xw0Var118 = new xw0(609, org.telegram.messenger.id.L0(2131744416), "suggestAnimatedEmojiRow", org.telegram.messenger.id.L0(2131744857), org.telegram.messenger.id.L0(2131751196), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i75 = 10;
        xw0 xw0Var119 = new xw0(610, org.telegram.messenger.id.L0(2131750835), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744857), org.telegram.messenger.id.L0(2131751196), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        final int i76 = 11;
        xw0 xw0Var120 = new xw0(611, org.telegram.messenger.id.L0(2131751350), null, org.telegram.messenger.id.L0(2131744857), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i77 = 12;
        xw0 xw0Var121 = new xw0(700, org.telegram.messenger.id.L0(2131750696), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var121.a("tg://settings/folders");
        final int i78 = 21;
        xw0 xw0Var122 = new xw0(701, org.telegram.messenger.id.L0(2131751716), "createFilterRow", org.telegram.messenger.id.L0(2131750696), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            xw0Var5 = xw0Var122;
            xw0Var6 = xw0Var113;
            xw0Var7 = xw0Var115;
            final int i79 = 2;
            xw0Var8 = xw0Var117;
            xw0Var9 = new xw0(800, org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.tw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i79;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            break;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            break;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            break;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            break;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            break;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((u90) arrayList.get(i112)).f == 1) {
                                    z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var5 = xw0Var122;
            xw0Var6 = xw0Var113;
            xw0Var7 = xw0Var115;
            xw0Var8 = xw0Var117;
            xw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i80 = 13;
            xw0Var10 = new xw0(801, org.telegram.messenger.id.L0(2131746998), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.tw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i80;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            break;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            break;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            break;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            break;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            break;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((u90) arrayList.get(i112)).f == 1) {
                                    z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i81 = 23;
            xw0Var11 = new xw0(802, org.telegram.messenger.id.L0(2131747007), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.tw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i81;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            break;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            break;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            break;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            break;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            break;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((u90) arrayList.get(i112)).f == 1) {
                                    z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i82 = 4;
            xw0Var12 = new xw0(803, org.telegram.messenger.id.L0(2131746964), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.vw0
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
                                f2Var.presentFragment(new fe0(i112));
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
                            f2Var.presentFragment(new nt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            xw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i83 = 14;
            xw0Var13 = new xw0(804, org.telegram.messenger.id.L0(2131747012), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.vw0
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
                                f2Var.presentFragment(new fe0(i112));
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
                            f2Var.presentFragment(new nt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            xw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i84 = 25;
            xw0Var14 = new xw0(805, org.telegram.messenger.id.L0(2131746962), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.vw0
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
                                f2Var.presentFragment(new fe0(i112));
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
                            f2Var.presentFragment(new nt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            xw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i85 = 6;
            xw0Var15 = new xw0(806, org.telegram.messenger.id.L0(2131746992), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ww0
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
            xw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i86 = 17;
            xw0Var16 = new xw0(807, org.telegram.messenger.id.L0(2131746983), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ww0
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
            xw0Var16 = null;
        }
        xw0 xw0Var123 = F(currentAccount, 5) ? new xw0(808, org.telegram.messenger.id.L0(2131746976), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new wf0(12, f2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i87 = 4;
            xw0Var17 = new xw0(809, org.telegram.messenger.id.L0(2131747025), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.qw0
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
                            z90 z90Var = new z90();
                            f2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
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
                            f2Var.presentFragment(new fy0());
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
                            f2Var.presentFragment(new z90());
                            break;
                        case 19:
                            z90 z90Var2 = new z90();
                            f2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            break;
                        case 20:
                            z90 z90Var3 = new z90();
                            f2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            z90 z90Var4 = new z90();
                            f2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            break;
                        case 23:
                            z90 z90Var5 = new z90();
                            f2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            z90 z90Var6 = new z90();
                            f2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            break;
                        case 26:
                            z90 z90Var7 = new z90();
                            f2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            break;
                        case 27:
                            z90 z90Var8 = new z90();
                            f2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            break;
                        case 28:
                            z90 z90Var9 = new z90();
                            f2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            break;
                        default:
                            z90 z90Var10 = new z90();
                            f2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            xw0Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i88 = 14;
            xw0Var18 = new xw0(810, org.telegram.messenger.id.L0(2131746987), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.qw0
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
                            z90 z90Var = new z90();
                            f2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
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
                            f2Var.presentFragment(new fy0());
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
                            f2Var.presentFragment(new z90());
                            break;
                        case 19:
                            z90 z90Var2 = new z90();
                            f2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            break;
                        case 20:
                            z90 z90Var3 = new z90();
                            f2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            z90 z90Var4 = new z90();
                            f2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            break;
                        case 23:
                            z90 z90Var5 = new z90();
                            f2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            z90 z90Var6 = new z90();
                            f2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            break;
                        case 26:
                            z90 z90Var7 = new z90();
                            f2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            break;
                        case 27:
                            z90 z90Var8 = new z90();
                            f2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            break;
                        case 28:
                            z90 z90Var9 = new z90();
                            f2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            break;
                        default:
                            z90 z90Var10 = new z90();
                            f2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            xw0Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i89 = 15;
            xw0Var19 = new xw0(811, org.telegram.messenger.id.L0(2131747022), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.qw0
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
                            z90 z90Var = new z90();
                            f2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
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
                            f2Var.presentFragment(new fy0());
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
                            f2Var.presentFragment(new z90());
                            break;
                        case 19:
                            z90 z90Var2 = new z90();
                            f2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            break;
                        case 20:
                            z90 z90Var3 = new z90();
                            f2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            z90 z90Var4 = new z90();
                            f2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            break;
                        case 23:
                            z90 z90Var5 = new z90();
                            f2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            z90 z90Var6 = new z90();
                            f2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            break;
                        case 26:
                            z90 z90Var7 = new z90();
                            f2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            break;
                        case 27:
                            z90 z90Var8 = new z90();
                            f2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            break;
                        case 28:
                            z90 z90Var9 = new z90();
                            f2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            break;
                        default:
                            z90 z90Var10 = new z90();
                            f2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            xw0Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i90 = 16;
            xw0Var20 = new xw0(812, org.telegram.messenger.id.L0(2131747020), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.qw0
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
                            z90 z90Var = new z90();
                            f2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
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
                            f2Var.presentFragment(new fy0());
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
                            f2Var.presentFragment(new z90());
                            break;
                        case 19:
                            z90 z90Var2 = new z90();
                            f2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            break;
                        case 20:
                            z90 z90Var3 = new z90();
                            f2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            z90 z90Var4 = new z90();
                            f2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            break;
                        case 23:
                            z90 z90Var5 = new z90();
                            f2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            z90 z90Var6 = new z90();
                            f2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            break;
                        case 26:
                            z90 z90Var7 = new z90();
                            f2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            break;
                        case 27:
                            z90 z90Var8 = new z90();
                            f2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            break;
                        case 28:
                            z90 z90Var9 = new z90();
                            f2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            break;
                        default:
                            z90 z90Var10 = new z90();
                            f2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            xw0Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i91 = 17;
            xw0Var21 = new xw0(813, org.telegram.messenger.id.L0(2131747004), org.telegram.messenger.id.L0(2131744231), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.qw0
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
                            z90 z90Var = new z90();
                            f2Var.presentFragment(z90Var);
                            z90Var.b0(3);
                            z90Var.a0(2);
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
                            f2Var.presentFragment(new fy0());
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
                            f2Var.presentFragment(new z90());
                            break;
                        case 19:
                            z90 z90Var2 = new z90();
                            f2Var.presentFragment(z90Var2);
                            z90Var2.a0(3);
                            break;
                        case 20:
                            z90 z90Var3 = new z90();
                            f2Var.presentFragment(z90Var3);
                            z90Var3.b0(3);
                            z90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            z90 z90Var4 = new z90();
                            f2Var.presentFragment(z90Var4);
                            z90Var4.b0(3);
                            z90Var4.a0(2);
                            break;
                        case 23:
                            z90 z90Var5 = new z90();
                            f2Var.presentFragment(z90Var5);
                            z90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            z90 z90Var6 = new z90();
                            f2Var.presentFragment(z90Var6);
                            z90Var6.b0(28700);
                            z90Var6.a0(16388);
                            break;
                        case 26:
                            z90 z90Var7 = new z90();
                            f2Var.presentFragment(z90Var7);
                            z90Var7.b0(28700);
                            z90Var7.a0(8200);
                            break;
                        case 27:
                            z90 z90Var8 = new z90();
                            f2Var.presentFragment(z90Var8);
                            z90Var8.b0(28700);
                            z90Var8.a0(4112);
                            break;
                        case 28:
                            z90 z90Var9 = new z90();
                            f2Var.presentFragment(z90Var9);
                            z90Var9.a0(360928);
                            break;
                        default:
                            z90 z90Var10 = new z90();
                            f2Var.presentFragment(z90Var10);
                            z90Var10.b0(360928);
                            z90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            xw0Var21 = null;
        }
        final int i92 = 18;
        xw0 xw0Var124 = new xw0(900, org.telegram.messenger.id.L0(2131747066), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var124.a("tg://settings/power-saving");
        final int i93 = 19;
        xw0 xw0Var125 = new xw0(901, org.telegram.messenger.id.L0(2131748850), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var125.a("tg://settings/power-saving/stickers");
        final int i94 = 20;
        xw0 xw0Var126 = new xw0(902, org.telegram.messenger.id.L0(2131748862), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        final int i95 = 22;
        xw0 xw0Var127 = new xw0(903, org.telegram.messenger.id.L0(2131748864), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748850), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        final int i96 = 23;
        xw0 xw0Var128 = new xw0(904, org.telegram.messenger.id.L0(2131748855), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var128.a("tg://settings/power-saving/emoji");
        final int i97 = 25;
        xw0 xw0Var129 = new xw0(905, org.telegram.messenger.id.L0(2131748862), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        final int i98 = 26;
        xw0 xw0Var130 = new xw0(906, org.telegram.messenger.id.L0(2131748861), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        final int i99 = 27;
        xw0 xw0Var131 = new xw0(907, org.telegram.messenger.id.L0(2131748864), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748855), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        final int i100 = 28;
        xw0 xw0Var132 = new xw0(908, org.telegram.messenger.id.L0(2131748856), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var132.a("tg://settings/power-saving/effects");
        final int i101 = 29;
        xw0 xw0Var133 = new xw0(909, org.telegram.messenger.id.L0(2131748859), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.qw0
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
                        z90 z90Var = new z90();
                        f2Var.presentFragment(z90Var);
                        z90Var.b0(3);
                        z90Var.a0(2);
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
                        f2Var.presentFragment(new fy0());
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
                        f2Var.presentFragment(new z90());
                        break;
                    case 19:
                        z90 z90Var2 = new z90();
                        f2Var.presentFragment(z90Var2);
                        z90Var2.a0(3);
                        break;
                    case 20:
                        z90 z90Var3 = new z90();
                        f2Var.presentFragment(z90Var3);
                        z90Var3.b0(3);
                        z90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        z90 z90Var4 = new z90();
                        f2Var.presentFragment(z90Var4);
                        z90Var4.b0(3);
                        z90Var4.a0(2);
                        break;
                    case 23:
                        z90 z90Var5 = new z90();
                        f2Var.presentFragment(z90Var5);
                        z90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        z90 z90Var6 = new z90();
                        f2Var.presentFragment(z90Var6);
                        z90Var6.b0(28700);
                        z90Var6.a0(16388);
                        break;
                    case 26:
                        z90 z90Var7 = new z90();
                        f2Var.presentFragment(z90Var7);
                        z90Var7.b0(28700);
                        z90Var7.a0(8200);
                        break;
                    case 27:
                        z90 z90Var8 = new z90();
                        f2Var.presentFragment(z90Var8);
                        z90Var8.b0(28700);
                        z90Var8.a0(4112);
                        break;
                    case 28:
                        z90 z90Var9 = new z90();
                        f2Var.presentFragment(z90Var9);
                        z90Var9.a0(360928);
                        break;
                    default:
                        z90 z90Var10 = new z90();
                        f2Var.presentFragment(z90Var10);
                        z90Var10.b0(360928);
                        z90Var10.a0(32);
                        break;
                }
            }
        });
        xw0Var133.a("tg://settings/power-saving/background");
        final int i102 = 0;
        xw0 xw0Var134 = new xw0(910, org.telegram.messenger.id.L0(2131748847), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i102;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0 xw0Var135 = new xw0(911, org.telegram.messenger.id.L0(2131748851), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i103;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
            xw0Var22 = new xw0(org.telegram.messenger.qs.x5, org.telegram.messenger.id.L0(2131748858), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.tw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i1022 = i104;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i1022) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            break;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            break;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            break;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            break;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            break;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((u90) arrayList.get(i112)).f == 1) {
                                    z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var22 = null;
        }
        final int i105 = 4;
        xw0 xw0Var136 = new xw0(912, org.telegram.messenger.id.L0(2131748852), null, org.telegram.messenger.id.L0(2131747066), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i105;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0 xw0Var137 = new xw0(913, org.telegram.messenger.id.L0(2131748857), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i106;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var137.a("tg://settings/power-saving/call-animations");
        final int i107 = 7;
        xw0 xw0Var138 = new xw0(org.telegram.messenger.qs.r3, org.telegram.messenger.id.L0(2131748860), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i107;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var138.a("tg://settings/power-saving/videos");
        final int i108 = 8;
        xw0 xw0Var139 = new xw0(org.telegram.messenger.qs.q3, org.telegram.messenger.id.L0(2131748863), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i108;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var139.a("tg://settings/power-saving/gifs");
        final int i109 = 9;
        xw0 xw0Var140 = new xw0(914, org.telegram.messenger.id.L0(2131748846), org.telegram.messenger.id.L0(2131747066), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i109;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var140.a("tg://settings/power-saving/transitions");
        final int i110 = 10;
        xw0 xw0Var141 = new xw0(400, org.telegram.messenger.id.L0(2131749054), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i110;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var141.a("tg://settings/language");
        final int i111 = 11;
        xw0 xw0Var142 = new xw0(405, org.telegram.messenger.id.L0(2131745327), org.telegram.messenger.id.L0(2131749054), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i111;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i112)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i112, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.qp.s1(currentAccount).T1().s()) {
            final int i112 = 12;
            xw0 xw0Var143 = new xw0(406, org.telegram.messenger.id.L0(2131751358), org.telegram.messenger.id.L0(2131749054), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.tw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i1022 = i112;
                    int i1122 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i1022) {
                        case 0:
                            z90 z90Var = new z90();
                            f2Var2.presentFragment(z90Var);
                            z90Var.b0(360928);
                            z90Var.a0(64);
                            break;
                        case 1:
                            z90 z90Var2 = new z90();
                            f2Var2.presentFragment(z90Var2);
                            z90Var2.b0(360928);
                            z90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            z90 z90Var3 = new z90();
                            f2Var2.presentFragment(z90Var3);
                            z90Var3.b0(360928);
                            z90Var3.a0(256);
                            break;
                        case 4:
                            z90 z90Var4 = new z90();
                            f2Var2.presentFragment(z90Var4);
                            z90Var4.b0(360928);
                            z90Var4.a0(32768);
                            break;
                        case 5:
                            z90 z90Var5 = new z90();
                            f2Var2.presentFragment(z90Var5);
                            z90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            z90 z90Var6 = new z90();
                            f2Var2.presentFragment(z90Var6);
                            z90Var6.a0(1024);
                            break;
                        case 8:
                            z90 z90Var7 = new z90();
                            f2Var2.presentFragment(z90Var7);
                            z90Var7.a0(2048);
                            break;
                        case 9:
                            z90 z90Var8 = new z90();
                            f2Var2.presentFragment(z90Var8);
                            while (true) {
                                ArrayList arrayList = z90Var8.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((u90) arrayList.get(i1122)).f == 1) {
                                    z90Var8.b.e1(new l2.q(z90Var8, i1122, 12), 700, true);
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
                            f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                            vt0 vt0Var = new vt0();
                            vt0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(vt0Var);
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
            xw0Var143.a("tg://settings/language/do-not-translate");
            xw0Var43 = xw0Var143;
        }
        final int i113 = 14;
        xw0 xw0Var144 = new xw0(402, org.telegram.messenger.id.L0(2131753986), org.telegram.messenger.id.L0(2131745479), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i113;
                int i1122 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i1122)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i1122, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var144.a("tg://settings/ask-question");
        final int i114 = 15;
        xw0 xw0Var145 = new xw0(403, org.telegram.messenger.id.L0(2131744242), org.telegram.messenger.id.L0(2131745479), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i114;
                int i1122 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i1122)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i1122, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var145.a("tg://settings/faq");
        final int i115 = 16;
        xw0 xw0Var146 = new xw0(404, org.telegram.messenger.id.L0(2131746783), org.telegram.messenger.id.L0(2131745479), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.tw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i115;
                int i1122 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        z90 z90Var = new z90();
                        f2Var2.presentFragment(z90Var);
                        z90Var.b0(360928);
                        z90Var.a0(64);
                        break;
                    case 1:
                        z90 z90Var2 = new z90();
                        f2Var2.presentFragment(z90Var2);
                        z90Var2.b0(360928);
                        z90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        z90 z90Var3 = new z90();
                        f2Var2.presentFragment(z90Var3);
                        z90Var3.b0(360928);
                        z90Var3.a0(256);
                        break;
                    case 4:
                        z90 z90Var4 = new z90();
                        f2Var2.presentFragment(z90Var4);
                        z90Var4.b0(360928);
                        z90Var4.a0(32768);
                        break;
                    case 5:
                        z90 z90Var5 = new z90();
                        f2Var2.presentFragment(z90Var5);
                        z90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        z90 z90Var6 = new z90();
                        f2Var2.presentFragment(z90Var6);
                        z90Var6.a0(1024);
                        break;
                    case 8:
                        z90 z90Var7 = new z90();
                        f2Var2.presentFragment(z90Var7);
                        z90Var7.a0(2048);
                        break;
                    case 9:
                        z90 z90Var8 = new z90();
                        f2Var2.presentFragment(z90Var8);
                        while (true) {
                            ArrayList arrayList = z90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((u90) arrayList.get(i1122)).f == 1) {
                                z90Var8.b.e1(new l2.q(z90Var8, i1122, 12), 700, true);
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
                        f2Var2.showDialog(org.telegram.ui.Components.u4.R(f2Var2, null));
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
                        vt0 vt0Var = new vt0();
                        vt0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(vt0Var);
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
        xw0Var146.a("tg://settings/privacy-policy");
        return new xw0[]{xw0Var23, xw0Var24, xw0Var25, xw0Var26, xw0Var27, xw0Var28, xw0Var29, xw0Var30, xw0Var31, xw0Var32, xw0Var33, xw0Var34, xw0Var35, xw0Var36, xw0Var37, xw0Var38, xw0Var39, xw0Var, xw0Var41, xw0Var42, xw0Var2, xw0Var44, xw0Var45, xw0Var46, xw0Var47, xw0Var48, xw0Var49, xw0Var50, xw0Var51, xw0Var52, xw0Var3, xw0Var4, xw0Var54, xw0Var55, xw0Var56, xw0Var57, xw0Var58, xw0Var59, xw0Var60, xw0Var61, xw0Var62, xw0Var63, xw0Var64, xw0Var65, xw0Var66, xw0Var67, xw0Var68, xw0Var69, xw0Var70, xw0Var71, xw0Var72, xw0Var73, xw0Var74, xw0Var75, xw0Var76, xw0Var77, xw0Var78, xw0Var79, xw0Var80, xw0Var81, xw0Var82, xw0Var83, xw0Var84, xw0Var85, xw0Var86, xw0Var87, xw0Var88, xw0Var89, xw0Var90, xw0Var91, xw0Var92, xw0Var93, xw0Var94, xw0Var95, xw0Var96, xw0Var97, xw0Var98, xw0Var99, xw0Var100, xw0Var101, xw0Var102, xw0Var103, xw0Var104, xw0Var105, xw0Var106, xw0Var107, xw0Var108, xw0Var109, xw0Var110, xw0Var111, xw0Var112, xw0Var6, xw0Var114, xw0Var7, xw0Var116, xw0Var8, xw0Var118, xw0Var119, xw0Var120, xw0Var121, xw0Var5, xw0Var9, xw0Var10, xw0Var11, xw0Var12, xw0Var13, xw0Var14, xw0Var15, xw0Var16, xw0Var123, xw0Var17, xw0Var18, xw0Var19, xw0Var20, xw0Var21, xw0Var124, xw0Var125, xw0Var126, xw0Var127, xw0Var128, xw0Var129, xw0Var130, xw0Var131, xw0Var132, xw0Var133, xw0Var134, xw0Var135, xw0Var22, xw0Var136, xw0Var137, xw0Var138, xw0Var139, xw0Var140, xw0Var141, xw0Var142, xw0Var43, xw0Var144, xw0Var145, xw0Var146};
    }

    @Override // org.telegram.ui.Components.oj0
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
            if (obj2 instanceof xw0) {
                ((xw0) obj2).g = i7;
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
            tn0 tn0Var = new tn0(29, this, str);
            this.y = tn0Var;
            p5Var.d(tn0Var, 300L);
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
        xw0 xw0Var;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            xw0[] xw0VarArr = this.c;
            if (i7 >= xw0VarArr.length) {
                break;
            }
            xw0 xw0Var2 = xw0VarArr[i7];
            if (xw0Var2 != null) {
                hashMap.put(Integer.valueOf(xw0Var2.f), this.c[i7]);
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
                    } else if (readInt322 == 1 && (xw0Var = (xw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        xw0Var.g = readInt32;
                        arrayList.add(xw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new xn0(this));
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
                xw0 xw0Var = (xw0) this.r.get(i7);
                xw0 xw0Var2 = i7 > 0 ? (xw0) this.r.get(i7 - 1) : null;
                v6Var.b((CharSequence) this.n.get(i7), xw0Var.d, (xw0Var2 == null || xw0Var2.e != xw0Var.e) ? xw0Var.e : 0, i7 < this.r.size() - 1);
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
        if (obj instanceof xw0) {
            xw0 xw0Var3 = (xw0) obj;
            v6Var.a(xw0Var3.a, xw0Var3.d, false, i7 < arrayList.size() - 1);
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
        return new org.telegram.ui.Components.xi0(n4Var);
    }
}
