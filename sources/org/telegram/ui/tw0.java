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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class tw0 extends org.telegram.ui.Components.oj0 {
    public String D;
    public TLRPC.WebPage E;
    public boolean F;
    public sw0[] c;
    public final org.telegram.ui.ActionBar.f2 e;
    public final int f;
    public final Context h;
    public boolean x;
    public qn0 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public tw0(Context context, org.telegram.ui.ActionBar.f2 f2Var) {
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

    public static sw0[] H(final org.telegram.ui.ActionBar.f2 f2Var) {
        sw0 sw0Var;
        sw0 sw0Var2;
        sw0 sw0Var3;
        sw0 sw0Var4;
        sw0 sw0Var5;
        sw0 sw0Var6;
        sw0 sw0Var7;
        sw0 sw0Var8;
        sw0 sw0Var9;
        sw0 sw0Var10;
        sw0 sw0Var11;
        sw0 sw0Var12;
        sw0 sw0Var13;
        sw0 sw0Var14;
        sw0 sw0Var15;
        sw0 sw0Var16;
        sw0 sw0Var17;
        sw0 sw0Var18;
        sw0 sw0Var19;
        sw0 sw0Var20;
        sw0 sw0Var21;
        sw0 sw0Var22;
        final int currentAccount = f2Var.getCurrentAccount();
        sw0 sw0Var23 = new sw0(500, org.telegram.messenger.id.L0(2131751265), 0, new qn0(26, f2Var, f2Var.getResourceProvider()));
        final int i7 = 24;
        sw0 sw0Var24 = new sw0(501, org.telegram.messenger.id.L0(2131752537), 0, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i10 = i7;
                int i11 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i10) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i11)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i11, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var24.a("tg://settings/edit/change-number");
        final int i10 = 6;
        sw0 sw0Var25 = new sw0(502, org.telegram.messenger.id.L0(2131754468), 0, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i11));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var25.a("tg://settings/edit/add-account");
        final int i11 = 17;
        final int i12 = 1;
        sw0 sw0Var26 = new sw0(1, org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var26.a("tg://settings/notifications");
        final int i13 = 29;
        sw0 sw0Var27 = new sw0(2, org.telegram.messenger.id.L0(2131747879), org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var27.a("tg://settings/notifications/private-chats");
        final int i14 = 11;
        sw0 sw0Var28 = new sw0(3, org.telegram.messenger.id.L0(2131747908), org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0Var28.a("tg://settings/notifications/groups");
        sw0 sw0Var29 = new sw0(4, org.telegram.messenger.id.L0(2131747922), org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new tf0(7, f2Var));
        sw0Var29.a("tg://settings/notifications/channels");
        final int i15 = 19;
        sw0 sw0Var30 = new sw0(5, org.telegram.messenger.id.L0(2131743282), "callsSectionRow", org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new tf0(i15, f2Var));
        sw0 sw0Var31 = new sw0(6, org.telegram.messenger.id.L0(2131753733), "badgeNumberSection", org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        final int i16 = 13;
        sw0 sw0Var32 = new sw0(7, org.telegram.messenger.id.L0(2131749220), "inappSectionRow", org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0 sw0Var33 = new sw0(8, org.telegram.messenger.id.L0(2131751790), "contactJoinedRow", org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new tf0(23, f2Var));
        sw0Var33.a("tg://settings/notifications/new-contacts");
        sw0 sw0Var34 = new sw0(9, org.telegram.messenger.id.L0(2131747229), "pinnedMessageRow", org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var34.a("tg://settings/notifications/pinned-messages");
        sw0 sw0Var35 = new sw0(10, org.telegram.messenger.id.L0(2131746115), "resetNotificationsRow", org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i10;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var35.a("tg://settings/notifications/reset");
        sw0 sw0Var36 = new sw0(11, org.telegram.messenger.id.L0(2131747877), "notificationsServiceRow", org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i11;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0 sw0Var37 = new sw0(12, org.telegram.messenger.id.L0(2131747876), "notificationsServiceConnectionRow", org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i17;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0 sw0Var38 = new sw0(13, org.telegram.messenger.id.L0(2131746276), "repeatRow", org.telegram.messenger.id.L0(2131747923), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i15;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0 sw0Var39 = new sw0(100, org.telegram.messenger.id.L0(2131746772), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i18;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var39.a("tg://settings/privacy");
        final int i19 = 21;
        sw0 sw0Var40 = new sw0(org.telegram.messenger.qs.u1, org.telegram.messenger.id.L0(2131743941), org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i19;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var40.a("tg://settings/privacy/2sv");
        final int i20 = 0;
        sw0 sw0Var41 = new sw0(org.telegram.messenger.qs.I1, org.telegram.messenger.id.L0(2131753850), org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.pw0
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
                            String M0 = org.telegram.messenger.id.M0(2131746756, null);
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
        sw0Var41.a("tg://settings/privacy/auto-delete");
        final int i21 = 22;
        sw0 sw0Var42 = new sw0(org.telegram.messenger.qs.t1, org.telegram.messenger.id.L0(2131747658), org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i21;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var42.a("tg://settings/privacy/passcode");
        sw0 sw0Var43 = null;
        if (org.telegram.messenger.iz.m1) {
            sw0Var = sw0Var40;
            final int i22 = 25;
            sw0Var2 = new sw0(org.telegram.messenger.qs.J1, org.telegram.messenger.id.L0(2131751203), "emailLoginRow", org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ow0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i22;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            break;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            break;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            break;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            break;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            break;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((r90) arrayList.get(i112)).f == 1) {
                                    w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var2.a("tg://settings/privacy/login-email");
        } else {
            sw0Var = sw0Var40;
            sw0Var2 = null;
        }
        final int i23 = 26;
        sw0 sw0Var44 = new sw0(101, org.telegram.messenger.id.L0(2131753681), org.telegram.messenger.id.L0(2131746772), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i23;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var44.a("tg://settings/privacy/blocked");
        final int i24 = 27;
        sw0 sw0Var45 = new sw0(org.telegram.messenger.qs.v1, org.telegram.messenger.id.L0(2131745554), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i24;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var45.a("tg://settings/devices");
        final int i25 = 28;
        sw0 sw0Var46 = new sw0(org.telegram.messenger.qs.q1, org.telegram.messenger.id.L0(2131746791), org.telegram.messenger.id.L0(2131746772), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i25;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var46.a("tg://settings/privacy/phone-number/");
        final int i26 = 29;
        sw0 sw0Var47 = new sw0(org.telegram.messenger.qs.n1, org.telegram.messenger.id.L0(2131746816), org.telegram.messenger.id.L0(2131746772), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i102 = i26;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i102) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var47.a("tg://settings/privacy/last-seen");
        final int i27 = 0;
        sw0 sw0Var48 = new sw0(org.telegram.messenger.qs.o1, org.telegram.messenger.id.L0(2131746778), org.telegram.messenger.id.L0(2131746772), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var48.a("tg://settings/privacy/profile-photos");
        final int i28 = 1;
        sw0 sw0Var49 = new sw0(org.telegram.messenger.qs.p1, org.telegram.messenger.id.L0(2131746838), org.telegram.messenger.id.L0(2131746772), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var49.a("tg://settings/privacy/forwards");
        final int i29 = 2;
        sw0 sw0Var50 = new sw0(org.telegram.messenger.qs.G1, org.telegram.messenger.id.L0(2131746801), org.telegram.messenger.id.L0(2131746772), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var50.a("tg://settings/privacy/calls/p2p");
        final int i30 = 3;
        sw0 sw0Var51 = new sw0(org.telegram.messenger.qs.r1, org.telegram.messenger.id.L0(2131752596), org.telegram.messenger.id.L0(2131746772), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var51.a("tg://settings/privacy/calls");
        final int i31 = 5;
        sw0 sw0Var52 = new sw0(org.telegram.messenger.qs.s1, org.telegram.messenger.id.L0(2131746818), org.telegram.messenger.id.L0(2131746772), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var52.a("tg://settings/privacy/invites");
        final int i32 = 1;
        sw0 sw0Var53 = new sw0(org.telegram.messenger.qs.H1, org.telegram.messenger.id.L0(2131746759), org.telegram.messenger.id.L0(2131746772), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.pw0
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
                            String M0 = org.telegram.messenger.id.M0(2131746756, null);
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
        sw0Var53.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.qp.s1(currentAccount).Y3) {
            sw0Var3 = sw0Var53;
            final int i33 = 7;
            sw0Var4 = new sw0(org.telegram.messenger.qs.F1, org.telegram.messenger.id.L0(2131754171), "newChatsRow", org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                                f2Var.presentFragment(new ce0(i112));
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
                            f2Var.presentFragment(new kt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            sw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            sw0Var3 = sw0Var53;
            sw0Var4 = null;
        }
        final int i34 = 8;
        sw0 sw0Var54 = new sw0(org.telegram.messenger.qs.x1, org.telegram.messenger.id.L0(2131751597), "deleteAccountRow", org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var54.a("tg://settings/privacy/self-destruct");
        final int i35 = 9;
        sw0 sw0Var55 = new sw0(org.telegram.messenger.qs.y1, org.telegram.messenger.id.L0(2131746798), "paymentsClearRow", org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i36 = 10;
        sw0 sw0Var56 = new sw0(org.telegram.messenger.qs.z1, org.telegram.messenger.id.L0(2131742914), org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var56.a("tg://settings/privacy/active-websites");
        final int i37 = 11;
        sw0 sw0Var57 = new sw0(org.telegram.messenger.qs.A1, org.telegram.messenger.id.L0(2131744299), "contactsDeleteRow", org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i38 = 12;
        sw0 sw0Var58 = new sw0(org.telegram.messenger.qs.B1, org.telegram.messenger.id.L0(2131744301), "contactsSyncRow", org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i39 = 13;
        sw0 sw0Var59 = new sw0(org.telegram.messenger.qs.C1, org.telegram.messenger.id.L0(2131744415), "contactsSuggestRow", org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i40 = 15;
        sw0 sw0Var60 = new sw0(org.telegram.messenger.qs.D1, org.telegram.messenger.id.L0(2131748690), "secretMapRow", org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i41 = 16;
        sw0 sw0Var61 = new sw0(org.telegram.messenger.qs.E1, org.telegram.messenger.id.L0(2131745687), "secretWebpageRow", org.telegram.messenger.id.L0(2131746772), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i42 = 18;
        sw0 sw0Var62 = new sw0(120, org.telegram.messenger.id.L0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var62.a("tg://settings/devices");
        final int i43 = 19;
        sw0 sw0Var63 = new sw0(org.telegram.messenger.qs.F1, org.telegram.messenger.id.L0(2131744211), "terminateAllSessionsRow", org.telegram.messenger.id.L0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var63.a("tg://settings/devices/terminate-sessions");
        final int i44 = 20;
        sw0 sw0Var64 = new sw0(org.telegram.messenger.qs.G1, org.telegram.messenger.id.L0(2131748918), org.telegram.messenger.id.L0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var64.a("tg://settings/devices/link-desktop");
        final int i45 = 21;
        sw0 sw0Var65 = new sw0(org.telegram.messenger.qs.e3, org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var65.a("tg://settings/privacy/data-settings");
        final int i46 = 22;
        sw0 sw0Var66 = new sw0(org.telegram.messenger.qs.f3, org.telegram.messenger.id.L0(2131751677), "usageSectionRow", org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i47 = 23;
        sw0 sw0Var67 = new sw0(org.telegram.messenger.qs.g3, org.telegram.messenger.id.L0(2131744819), org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var67.a("tg://settings/data/storage");
        final int i48 = 24;
        sw0 sw0Var68 = new sw0(203, org.telegram.messenger.id.L0(2131749061), "keepMediaRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131744819), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i49 = 26;
        sw0 sw0Var69 = new sw0(org.telegram.messenger.qs.i3, org.telegram.messenger.id.L0(2131752075), "cacheRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131744819), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 27;
        sw0 sw0Var70 = new sw0(org.telegram.messenger.qs.j3, org.telegram.messenger.id.L0(2131748775), "databaseRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131744819), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 28;
        sw0 sw0Var71 = new sw0(org.telegram.messenger.qs.k3, org.telegram.messenger.id.L0(2131748299), org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.qw0
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
                            f2Var.presentFragment(new ce0(i112));
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
                        f2Var.presentFragment(new kt());
                        break;
                    default:
                        f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        sw0Var71.a("tg://settings/data/usage");
        final int i52 = 0;
        sw0 sw0Var72 = new sw0(org.telegram.messenger.qs.l3, org.telegram.messenger.id.L0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0 sw0Var73 = new sw0(208, org.telegram.messenger.id.L0(2131742887), org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0 sw0Var74 = new sw0(org.telegram.messenger.qs.m3, org.telegram.messenger.id.L0(2131742889), org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0 sw0Var75 = new sw0(org.telegram.messenger.qs.n3, org.telegram.messenger.id.L0(2131742888), org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0 sw0Var76 = new sw0(org.telegram.messenger.qs.o3, org.telegram.messenger.id.L0(2131746114), "resetDownloadRow", org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0Var76.a("tg://settings/data/auto-download/reset");
        final int i57 = 5;
        sw0 sw0Var77 = new sw0(org.telegram.messenger.qs.s3, org.telegram.messenger.id.L0(2131744441), "streamSectionRow", org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0 sw0Var78 = new sw0(org.telegram.messenger.qs.t3, org.telegram.messenger.id.L0(2131751145), "enableStreamRow", org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0 sw0Var79 = new sw0(org.telegram.messenger.qs.u3, org.telegram.messenger.id.L0(2131752596), "callsSectionRow", org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0 sw0Var80 = new sw0(org.telegram.messenger.qs.v3, org.telegram.messenger.id.L0(2131743232), "useLessDataForCallsRow", org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0Var80.a("tg://settings/data/use-less-data");
        final int i61 = 10;
        sw0 sw0Var81 = new sw0(org.telegram.messenger.qs.w3, org.telegram.messenger.id.L0(2131743261), "quickRepliesRow", org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0 sw0Var82 = new sw0(org.telegram.messenger.qs.x3, org.telegram.messenger.id.L0(2131746602), org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0Var82.a("tg://settings/data/proxy");
        final int i63 = 13;
        sw0 sw0Var83 = new sw0(org.telegram.messenger.qs.w1, org.telegram.messenger.id.L0(2131746842), "clearDraftsRow", org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i64 = 14;
        sw0 sw0Var84 = new sw0(org.telegram.messenger.qs.z3, org.telegram.messenger.id.L0(2131745932), "saveToGallerySectionRow", org.telegram.messenger.id.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0 sw0Var85 = new sw0(org.telegram.messenger.qs.A3, org.telegram.messenger.id.L0(2131745922), "saveToGalleryPeerRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131745932), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0Var85.a("tg://settings/data/save-to-photos/chats");
        final int i66 = 16;
        sw0 sw0Var86 = new sw0(org.telegram.messenger.qs.B3, org.telegram.messenger.id.L0(2131745929), "saveToGalleryGroupsRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131745932), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.rw0
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
        sw0Var86.a("tg://settings/data/save-to-photos/groups");
        sw0 sw0Var87 = new sw0(org.telegram.messenger.qs.C3, org.telegram.messenger.id.L0(2131745931), "saveToGalleryChannelsRow", org.telegram.messenger.id.L0(2131751678), org.telegram.messenger.id.L0(2131745932), R.drawable.msg2_data, new tf0(2, f2Var));
        sw0Var87.a("tg://settings/data/save-to-photos/channels");
        sw0 sw0Var88 = new sw0(org.telegram.messenger.qs.X4, org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(3, f2Var));
        sw0Var88.a("tg://settings/appearance/themes");
        sw0 sw0Var89 = new sw0(org.telegram.messenger.qs.Y4, org.telegram.messenger.id.L0(2131744194), "textSizeHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(4, f2Var));
        sw0Var89.a("tg://settings/appearance/text-size");
        sw0 sw0Var90 = new sw0(org.telegram.messenger.qs.Z4, org.telegram.messenger.id.L0(2131752550), org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(5, f2Var));
        sw0Var90.a("tg://settings/appearance/wallpapers");
        sw0 sw0Var91 = new sw0(org.telegram.messenger.qs.a5, org.telegram.messenger.id.L0(2131745541), null, org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), R.drawable.msg2_discussion, new tf0(6, f2Var));
        sw0 sw0Var92 = new sw0(org.telegram.messenger.qs.b5, org.telegram.messenger.id.L0(2131746111), "resetRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752244), R.drawable.msg2_discussion, new tf0(8, f2Var));
        sw0 sw0Var93 = new sw0(org.telegram.messenger.qs.d5, org.telegram.messenger.id.L0(2131752011), "themeHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(9, f2Var));
        sw0 sw0Var94 = new sw0(org.telegram.messenger.qs.q5, org.telegram.messenger.id.L0(2131752878), null, org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(10, f2Var));
        sw0 sw0Var95 = new sw0(org.telegram.messenger.qs.r5, org.telegram.messenger.id.L0(2131751713), "createNewThemeRow", org.telegram.messenger.id.L0(2131752210), org.telegram.messenger.id.L0(2131752878), R.drawable.msg2_discussion, new tf0(11, f2Var));
        sw0Var95.a("tg://settings/appearance/themes/create");
        sw0 sw0Var96 = new sw0(org.telegram.messenger.qs.s5, org.telegram.messenger.id.L0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(13, f2Var));
        sw0Var96.a("tg://settings/appearance/message-corners");
        sw0 sw0Var97 = new sw0(org.telegram.messenger.qs.t5, org.telegram.messenger.id.L0(2131752225), "chatListHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(14, f2Var));
        sw0 sw0Var98 = new sw0(org.telegram.messenger.qs.u5, org.telegram.messenger.id.L0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(15, f2Var));
        sw0 sw0Var99 = new sw0(org.telegram.messenger.qs.v5, org.telegram.messenger.id.L0(2131754240), "appIconHeaderRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(16, f2Var));
        sw0Var99.a("tg://settings/appearance/app-icon");
        sw0 sw0Var100 = new sw0(org.telegram.messenger.qs.c5, org.telegram.messenger.id.L0(2131753784), org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(17, f2Var));
        sw0 sw0Var101 = new sw0(org.telegram.messenger.qs.z5, org.telegram.messenger.id.L0(2131748250), "nextMediaTapRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(18, f2Var));
        sw0Var101.a("tg://settings/appearance/tap-for-next-media");
        sw0 sw0Var102 = new sw0(org.telegram.messenger.qs.y5, org.telegram.messenger.id.L0(2131746428), "raiseToListenRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(20, f2Var));
        sw0Var102.a("tg://settings/data/raise-to-listen");
        sw0 sw0Var103 = new sw0(org.telegram.messenger.qs.h5, org.telegram.messenger.id.L0(2131746426), "raiseToSpeakRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(21, f2Var));
        sw0Var103.a("tg://settings/data/raise-to-speak");
        sw0 sw0Var104 = new sw0(org.telegram.messenger.qs.x5, org.telegram.messenger.id.L0(2131747433), "pauseOnMediaRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(22, f2Var));
        sw0Var104.a("tg://settings/data/pause-music");
        sw0 sw0Var105 = new sw0(org.telegram.messenger.qs.w5, org.telegram.messenger.id.L0(2131748440), "bluetoothScoRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(24, f2Var));
        sw0 sw0Var106 = new sw0(org.telegram.messenger.qs.f5, org.telegram.messenger.id.L0(2131751439), "directShareRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(25, f2Var));
        sw0 sw0Var107 = new sw0(org.telegram.messenger.qs.i5, org.telegram.messenger.id.L0(2131745635), "sendByEnterRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(26, f2Var));
        sw0 sw0Var108 = new sw0(org.telegram.messenger.qs.p5, org.telegram.messenger.id.L0(2131751368), "distanceRow", org.telegram.messenger.id.L0(2131752210), R.drawable.msg2_discussion, new tf0(27, f2Var));
        sw0 sw0Var109 = new sw0(600, org.telegram.messenger.id.L0(2131744860), R.drawable.msg2_sticker, new tf0(28, f2Var));
        sw0Var109.a("tg://settings/appearance/stickers-and-emoji");
        sw0 sw0Var110 = new sw0(601, org.telegram.messenger.id.L0(2131744405), "suggestRow", org.telegram.messenger.id.L0(2131744860), R.drawable.msg2_sticker, new tf0(29, f2Var));
        final int i67 = 0;
        sw0 sw0Var111 = new sw0(602, org.telegram.messenger.id.L0(2131750834), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744860), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        final int i68 = 2;
        sw0 sw0Var112 = new sw0(603, org.telegram.messenger.id.L0(2131748680), null, org.telegram.messenger.id.L0(2131744860), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        final int i69 = 3;
        sw0 sw0Var113 = new sw0(604, org.telegram.messenger.id.L0(2131754128), null, org.telegram.messenger.id.L0(2131744860), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i70 = 5;
        sw0 sw0Var114 = new sw0(605, org.telegram.messenger.id.L0(2131754133), null, org.telegram.messenger.id.L0(2131744860), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        final int i71 = 6;
        sw0 sw0Var115 = new sw0(606, org.telegram.messenger.id.L0(2131749035), "largeEmojiRow", org.telegram.messenger.id.L0(2131744860), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i72 = 7;
        sw0 sw0Var116 = new sw0(607, org.telegram.messenger.id.L0(2131748723), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748851), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        final int i73 = 8;
        sw0 sw0Var117 = new sw0(608, org.telegram.messenger.id.L0(2131751197), null, org.telegram.messenger.id.L0(2131744860), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i74 = 9;
        sw0 sw0Var118 = new sw0(609, org.telegram.messenger.id.L0(2131744419), "suggestAnimatedEmojiRow", org.telegram.messenger.id.L0(2131744860), org.telegram.messenger.id.L0(2131751197), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i75 = 10;
        sw0 sw0Var119 = new sw0(610, org.telegram.messenger.id.L0(2131750836), "featuredStickersHeaderRow", org.telegram.messenger.id.L0(2131744860), org.telegram.messenger.id.L0(2131751197), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        final int i76 = 11;
        sw0 sw0Var120 = new sw0(611, org.telegram.messenger.id.L0(2131751351), null, org.telegram.messenger.id.L0(2131744860), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i77 = 12;
        sw0 sw0Var121 = new sw0(700, org.telegram.messenger.id.L0(2131750697), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var121.a("tg://settings/folders");
        final int i78 = 21;
        sw0 sw0Var122 = new sw0(701, org.telegram.messenger.id.L0(2131751717), "createFilterRow", org.telegram.messenger.id.L0(2131750697), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            sw0Var5 = sw0Var122;
            sw0Var6 = sw0Var113;
            sw0Var7 = sw0Var115;
            final int i79 = 2;
            sw0Var8 = sw0Var117;
            sw0Var9 = new sw0(800, org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ow0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i79;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            break;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            break;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            break;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            break;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            break;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((r90) arrayList.get(i112)).f == 1) {
                                    w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var5 = sw0Var122;
            sw0Var6 = sw0Var113;
            sw0Var7 = sw0Var115;
            sw0Var8 = sw0Var117;
            sw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i80 = 13;
            sw0Var10 = new sw0(801, org.telegram.messenger.id.L0(2131746999), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ow0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i80;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            break;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            break;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            break;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            break;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            break;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((r90) arrayList.get(i112)).f == 1) {
                                    w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i81 = 23;
            sw0Var11 = new sw0(802, org.telegram.messenger.id.L0(2131747008), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ow0
                @Override // java.lang.Runnable
                public final void run() {
                    int i102 = i81;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i102) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            break;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            break;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            break;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            break;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            break;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((r90) arrayList.get(i112)).f == 1) {
                                    w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i82 = 4;
            sw0Var12 = new sw0(803, org.telegram.messenger.id.L0(2131746965), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.qw0
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
                                f2Var.presentFragment(new ce0(i112));
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
                            f2Var.presentFragment(new kt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            sw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i83 = 14;
            sw0Var13 = new sw0(804, org.telegram.messenger.id.L0(2131747013), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.qw0
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
                                f2Var.presentFragment(new ce0(i112));
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
                            f2Var.presentFragment(new kt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            sw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i84 = 25;
            sw0Var14 = new sw0(805, org.telegram.messenger.id.L0(2131746963), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.qw0
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
                                f2Var.presentFragment(new ce0(i112));
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
                            f2Var.presentFragment(new kt());
                            break;
                        default:
                            f2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            sw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i85 = 6;
            sw0Var15 = new sw0(806, org.telegram.messenger.id.L0(2131746993), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.rw0
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
            sw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i86 = 17;
            sw0Var16 = new sw0(807, org.telegram.messenger.id.L0(2131746984), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.rw0
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
            sw0Var16 = null;
        }
        sw0 sw0Var123 = F(currentAccount, 5) ? new sw0(808, org.telegram.messenger.id.L0(2131746977), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new tf0(12, f2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i87 = 4;
            sw0Var17 = new sw0(809, org.telegram.messenger.id.L0(2131747026), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
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
                            w90 w90Var = new w90();
                            f2Var.presentFragment(w90Var);
                            w90Var.b0(3);
                            w90Var.a0(2);
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
                            f2Var.presentFragment(new ay0());
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
                            f2Var.presentFragment(new w90());
                            break;
                        case 19:
                            w90 w90Var2 = new w90();
                            f2Var.presentFragment(w90Var2);
                            w90Var2.a0(3);
                            break;
                        case 20:
                            w90 w90Var3 = new w90();
                            f2Var.presentFragment(w90Var3);
                            w90Var3.b0(3);
                            w90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            w90 w90Var4 = new w90();
                            f2Var.presentFragment(w90Var4);
                            w90Var4.b0(3);
                            w90Var4.a0(2);
                            break;
                        case 23:
                            w90 w90Var5 = new w90();
                            f2Var.presentFragment(w90Var5);
                            w90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            w90 w90Var6 = new w90();
                            f2Var.presentFragment(w90Var6);
                            w90Var6.b0(28700);
                            w90Var6.a0(16388);
                            break;
                        case 26:
                            w90 w90Var7 = new w90();
                            f2Var.presentFragment(w90Var7);
                            w90Var7.b0(28700);
                            w90Var7.a0(8200);
                            break;
                        case 27:
                            w90 w90Var8 = new w90();
                            f2Var.presentFragment(w90Var8);
                            w90Var8.b0(28700);
                            w90Var8.a0(4112);
                            break;
                        case 28:
                            w90 w90Var9 = new w90();
                            f2Var.presentFragment(w90Var9);
                            w90Var9.a0(360928);
                            break;
                        default:
                            w90 w90Var10 = new w90();
                            f2Var.presentFragment(w90Var10);
                            w90Var10.b0(360928);
                            w90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            sw0Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i88 = 14;
            sw0Var18 = new sw0(810, org.telegram.messenger.id.L0(2131746988), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
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
                            w90 w90Var = new w90();
                            f2Var.presentFragment(w90Var);
                            w90Var.b0(3);
                            w90Var.a0(2);
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
                            f2Var.presentFragment(new ay0());
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
                            f2Var.presentFragment(new w90());
                            break;
                        case 19:
                            w90 w90Var2 = new w90();
                            f2Var.presentFragment(w90Var2);
                            w90Var2.a0(3);
                            break;
                        case 20:
                            w90 w90Var3 = new w90();
                            f2Var.presentFragment(w90Var3);
                            w90Var3.b0(3);
                            w90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            w90 w90Var4 = new w90();
                            f2Var.presentFragment(w90Var4);
                            w90Var4.b0(3);
                            w90Var4.a0(2);
                            break;
                        case 23:
                            w90 w90Var5 = new w90();
                            f2Var.presentFragment(w90Var5);
                            w90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            w90 w90Var6 = new w90();
                            f2Var.presentFragment(w90Var6);
                            w90Var6.b0(28700);
                            w90Var6.a0(16388);
                            break;
                        case 26:
                            w90 w90Var7 = new w90();
                            f2Var.presentFragment(w90Var7);
                            w90Var7.b0(28700);
                            w90Var7.a0(8200);
                            break;
                        case 27:
                            w90 w90Var8 = new w90();
                            f2Var.presentFragment(w90Var8);
                            w90Var8.b0(28700);
                            w90Var8.a0(4112);
                            break;
                        case 28:
                            w90 w90Var9 = new w90();
                            f2Var.presentFragment(w90Var9);
                            w90Var9.a0(360928);
                            break;
                        default:
                            w90 w90Var10 = new w90();
                            f2Var.presentFragment(w90Var10);
                            w90Var10.b0(360928);
                            w90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            sw0Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i89 = 15;
            sw0Var19 = new sw0(811, org.telegram.messenger.id.L0(2131747023), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
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
                            w90 w90Var = new w90();
                            f2Var.presentFragment(w90Var);
                            w90Var.b0(3);
                            w90Var.a0(2);
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
                            f2Var.presentFragment(new ay0());
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
                            f2Var.presentFragment(new w90());
                            break;
                        case 19:
                            w90 w90Var2 = new w90();
                            f2Var.presentFragment(w90Var2);
                            w90Var2.a0(3);
                            break;
                        case 20:
                            w90 w90Var3 = new w90();
                            f2Var.presentFragment(w90Var3);
                            w90Var3.b0(3);
                            w90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            w90 w90Var4 = new w90();
                            f2Var.presentFragment(w90Var4);
                            w90Var4.b0(3);
                            w90Var4.a0(2);
                            break;
                        case 23:
                            w90 w90Var5 = new w90();
                            f2Var.presentFragment(w90Var5);
                            w90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            w90 w90Var6 = new w90();
                            f2Var.presentFragment(w90Var6);
                            w90Var6.b0(28700);
                            w90Var6.a0(16388);
                            break;
                        case 26:
                            w90 w90Var7 = new w90();
                            f2Var.presentFragment(w90Var7);
                            w90Var7.b0(28700);
                            w90Var7.a0(8200);
                            break;
                        case 27:
                            w90 w90Var8 = new w90();
                            f2Var.presentFragment(w90Var8);
                            w90Var8.b0(28700);
                            w90Var8.a0(4112);
                            break;
                        case 28:
                            w90 w90Var9 = new w90();
                            f2Var.presentFragment(w90Var9);
                            w90Var9.a0(360928);
                            break;
                        default:
                            w90 w90Var10 = new w90();
                            f2Var.presentFragment(w90Var10);
                            w90Var10.b0(360928);
                            w90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            sw0Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i90 = 16;
            sw0Var20 = new sw0(812, org.telegram.messenger.id.L0(2131747021), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
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
                            w90 w90Var = new w90();
                            f2Var.presentFragment(w90Var);
                            w90Var.b0(3);
                            w90Var.a0(2);
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
                            f2Var.presentFragment(new ay0());
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
                            f2Var.presentFragment(new w90());
                            break;
                        case 19:
                            w90 w90Var2 = new w90();
                            f2Var.presentFragment(w90Var2);
                            w90Var2.a0(3);
                            break;
                        case 20:
                            w90 w90Var3 = new w90();
                            f2Var.presentFragment(w90Var3);
                            w90Var3.b0(3);
                            w90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            w90 w90Var4 = new w90();
                            f2Var.presentFragment(w90Var4);
                            w90Var4.b0(3);
                            w90Var4.a0(2);
                            break;
                        case 23:
                            w90 w90Var5 = new w90();
                            f2Var.presentFragment(w90Var5);
                            w90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            w90 w90Var6 = new w90();
                            f2Var.presentFragment(w90Var6);
                            w90Var6.b0(28700);
                            w90Var6.a0(16388);
                            break;
                        case 26:
                            w90 w90Var7 = new w90();
                            f2Var.presentFragment(w90Var7);
                            w90Var7.b0(28700);
                            w90Var7.a0(8200);
                            break;
                        case 27:
                            w90 w90Var8 = new w90();
                            f2Var.presentFragment(w90Var8);
                            w90Var8.b0(28700);
                            w90Var8.a0(4112);
                            break;
                        case 28:
                            w90 w90Var9 = new w90();
                            f2Var.presentFragment(w90Var9);
                            w90Var9.a0(360928);
                            break;
                        default:
                            w90 w90Var10 = new w90();
                            f2Var.presentFragment(w90Var10);
                            w90Var10.b0(360928);
                            w90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            sw0Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i91 = 17;
            sw0Var21 = new sw0(813, org.telegram.messenger.id.L0(2131747005), org.telegram.messenger.id.L0(2131744234), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.nw0
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
                            w90 w90Var = new w90();
                            f2Var.presentFragment(w90Var);
                            w90Var.b0(3);
                            w90Var.a0(2);
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
                            f2Var.presentFragment(new ay0());
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
                            f2Var.presentFragment(new w90());
                            break;
                        case 19:
                            w90 w90Var2 = new w90();
                            f2Var.presentFragment(w90Var2);
                            w90Var2.a0(3);
                            break;
                        case 20:
                            w90 w90Var3 = new w90();
                            f2Var.presentFragment(w90Var3);
                            w90Var3.b0(3);
                            w90Var3.a0(1);
                            break;
                        case 21:
                            f2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            w90 w90Var4 = new w90();
                            f2Var.presentFragment(w90Var4);
                            w90Var4.b0(3);
                            w90Var4.a0(2);
                            break;
                        case 23:
                            w90 w90Var5 = new w90();
                            f2Var.presentFragment(w90Var5);
                            w90Var5.a0(28700);
                            break;
                        case 24:
                            f2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            w90 w90Var6 = new w90();
                            f2Var.presentFragment(w90Var6);
                            w90Var6.b0(28700);
                            w90Var6.a0(16388);
                            break;
                        case 26:
                            w90 w90Var7 = new w90();
                            f2Var.presentFragment(w90Var7);
                            w90Var7.b0(28700);
                            w90Var7.a0(8200);
                            break;
                        case 27:
                            w90 w90Var8 = new w90();
                            f2Var.presentFragment(w90Var8);
                            w90Var8.b0(28700);
                            w90Var8.a0(4112);
                            break;
                        case 28:
                            w90 w90Var9 = new w90();
                            f2Var.presentFragment(w90Var9);
                            w90Var9.a0(360928);
                            break;
                        default:
                            w90 w90Var10 = new w90();
                            f2Var.presentFragment(w90Var10);
                            w90Var10.b0(360928);
                            w90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            sw0Var21 = null;
        }
        final int i92 = 18;
        sw0 sw0Var124 = new sw0(900, org.telegram.messenger.id.L0(2131747067), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var124.a("tg://settings/power-saving");
        final int i93 = 19;
        sw0 sw0Var125 = new sw0(901, org.telegram.messenger.id.L0(2131748851), org.telegram.messenger.id.L0(2131747067), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var125.a("tg://settings/power-saving/stickers");
        final int i94 = 20;
        sw0 sw0Var126 = new sw0(902, org.telegram.messenger.id.L0(2131748863), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748851), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        final int i95 = 22;
        sw0 sw0Var127 = new sw0(903, org.telegram.messenger.id.L0(2131748865), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748851), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        final int i96 = 23;
        sw0 sw0Var128 = new sw0(904, org.telegram.messenger.id.L0(2131748856), org.telegram.messenger.id.L0(2131747067), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var128.a("tg://settings/power-saving/emoji");
        final int i97 = 25;
        sw0 sw0Var129 = new sw0(905, org.telegram.messenger.id.L0(2131748863), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        final int i98 = 26;
        sw0 sw0Var130 = new sw0(906, org.telegram.messenger.id.L0(2131748862), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        final int i99 = 27;
        sw0 sw0Var131 = new sw0(907, org.telegram.messenger.id.L0(2131748865), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748856), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        final int i100 = 28;
        sw0 sw0Var132 = new sw0(908, org.telegram.messenger.id.L0(2131748857), org.telegram.messenger.id.L0(2131747067), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var132.a("tg://settings/power-saving/effects");
        final int i101 = 29;
        sw0 sw0Var133 = new sw0(909, org.telegram.messenger.id.L0(2131748860), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748857), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.nw0
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
                        w90 w90Var = new w90();
                        f2Var.presentFragment(w90Var);
                        w90Var.b0(3);
                        w90Var.a0(2);
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
                        f2Var.presentFragment(new ay0());
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
                        f2Var.presentFragment(new w90());
                        break;
                    case 19:
                        w90 w90Var2 = new w90();
                        f2Var.presentFragment(w90Var2);
                        w90Var2.a0(3);
                        break;
                    case 20:
                        w90 w90Var3 = new w90();
                        f2Var.presentFragment(w90Var3);
                        w90Var3.b0(3);
                        w90Var3.a0(1);
                        break;
                    case 21:
                        f2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        w90 w90Var4 = new w90();
                        f2Var.presentFragment(w90Var4);
                        w90Var4.b0(3);
                        w90Var4.a0(2);
                        break;
                    case 23:
                        w90 w90Var5 = new w90();
                        f2Var.presentFragment(w90Var5);
                        w90Var5.a0(28700);
                        break;
                    case 24:
                        f2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        w90 w90Var6 = new w90();
                        f2Var.presentFragment(w90Var6);
                        w90Var6.b0(28700);
                        w90Var6.a0(16388);
                        break;
                    case 26:
                        w90 w90Var7 = new w90();
                        f2Var.presentFragment(w90Var7);
                        w90Var7.b0(28700);
                        w90Var7.a0(8200);
                        break;
                    case 27:
                        w90 w90Var8 = new w90();
                        f2Var.presentFragment(w90Var8);
                        w90Var8.b0(28700);
                        w90Var8.a0(4112);
                        break;
                    case 28:
                        w90 w90Var9 = new w90();
                        f2Var.presentFragment(w90Var9);
                        w90Var9.a0(360928);
                        break;
                    default:
                        w90 w90Var10 = new w90();
                        f2Var.presentFragment(w90Var10);
                        w90Var10.b0(360928);
                        w90Var10.a0(32);
                        break;
                }
            }
        });
        sw0Var133.a("tg://settings/power-saving/background");
        final int i102 = 0;
        sw0 sw0Var134 = new sw0(910, org.telegram.messenger.id.L0(2131748848), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748857), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i102;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0 sw0Var135 = new sw0(911, org.telegram.messenger.id.L0(2131748852), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748857), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i103;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
            sw0Var22 = new sw0(org.telegram.messenger.qs.x5, org.telegram.messenger.id.L0(2131748859), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748857), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ow0
                @Override // java.lang.Runnable
                public final void run() {
                    int i1022 = i104;
                    int i112 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i1022) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            break;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            break;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            break;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            break;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            break;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((r90) arrayList.get(i112)).f == 1) {
                                    w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var22 = null;
        }
        final int i105 = 4;
        sw0 sw0Var136 = new sw0(912, org.telegram.messenger.id.L0(2131748853), null, org.telegram.messenger.id.L0(2131747067), org.telegram.messenger.id.L0(2131748857), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i105;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0 sw0Var137 = new sw0(913, org.telegram.messenger.id.L0(2131748858), org.telegram.messenger.id.L0(2131747067), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i106;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var137.a("tg://settings/power-saving/call-animations");
        final int i107 = 7;
        sw0 sw0Var138 = new sw0(org.telegram.messenger.qs.r3, org.telegram.messenger.id.L0(2131748861), org.telegram.messenger.id.L0(2131747067), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i107;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var138.a("tg://settings/power-saving/videos");
        final int i108 = 8;
        sw0 sw0Var139 = new sw0(org.telegram.messenger.qs.q3, org.telegram.messenger.id.L0(2131748864), org.telegram.messenger.id.L0(2131747067), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i108;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var139.a("tg://settings/power-saving/gifs");
        final int i109 = 9;
        sw0 sw0Var140 = new sw0(914, org.telegram.messenger.id.L0(2131748847), org.telegram.messenger.id.L0(2131747067), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i109;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var140.a("tg://settings/power-saving/transitions");
        final int i110 = 10;
        sw0 sw0Var141 = new sw0(400, org.telegram.messenger.id.L0(2131749055), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i110;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var141.a("tg://settings/language");
        final int i111 = 11;
        sw0 sw0Var142 = new sw0(405, org.telegram.messenger.id.L0(2131745330), org.telegram.messenger.id.L0(2131749055), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i111;
                int i112 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i112)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i112, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.qp.s1(currentAccount).T1().s()) {
            final int i112 = 12;
            sw0 sw0Var143 = new sw0(406, org.telegram.messenger.id.L0(2131751359), org.telegram.messenger.id.L0(2131749055), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.ow0
                @Override // java.lang.Runnable
                public final void run() {
                    int i1022 = i112;
                    int i1122 = 0;
                    org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                    switch (i1022) {
                        case 0:
                            w90 w90Var = new w90();
                            f2Var2.presentFragment(w90Var);
                            w90Var.b0(360928);
                            w90Var.a0(64);
                            break;
                        case 1:
                            w90 w90Var2 = new w90();
                            f2Var2.presentFragment(w90Var2);
                            w90Var2.b0(360928);
                            w90Var2.a0(128);
                            break;
                        case 2:
                            f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            w90 w90Var3 = new w90();
                            f2Var2.presentFragment(w90Var3);
                            w90Var3.b0(360928);
                            w90Var3.a0(256);
                            break;
                        case 4:
                            w90 w90Var4 = new w90();
                            f2Var2.presentFragment(w90Var4);
                            w90Var4.b0(360928);
                            w90Var4.a0(32768);
                            break;
                        case 5:
                            w90 w90Var5 = new w90();
                            f2Var2.presentFragment(w90Var5);
                            w90Var5.a0(512);
                            break;
                        case 6:
                            f2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            w90 w90Var6 = new w90();
                            f2Var2.presentFragment(w90Var6);
                            w90Var6.a0(1024);
                            break;
                        case 8:
                            w90 w90Var7 = new w90();
                            f2Var2.presentFragment(w90Var7);
                            w90Var7.a0(2048);
                            break;
                        case 9:
                            w90 w90Var8 = new w90();
                            f2Var2.presentFragment(w90Var8);
                            while (true) {
                                ArrayList arrayList = w90Var8.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((r90) arrayList.get(i1122)).f == 1) {
                                    w90Var8.b.e1(new l2.q(w90Var8, i1122, 12), 700, true);
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
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                            break;
                        case 16:
                            vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                            st0 st0Var = new st0();
                            st0Var.getMessagesController().F0(true);
                            f2Var2.presentFragment(st0Var);
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
            sw0Var143.a("tg://settings/language/do-not-translate");
            sw0Var43 = sw0Var143;
        }
        final int i113 = 14;
        sw0 sw0Var144 = new sw0(402, org.telegram.messenger.id.L0(2131753986), org.telegram.messenger.id.L0(2131745482), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i113;
                int i1122 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i1122)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i1122, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var144.a("tg://settings/ask-question");
        final int i114 = 15;
        sw0 sw0Var145 = new sw0(403, org.telegram.messenger.id.L0(2131744245), org.telegram.messenger.id.L0(2131745482), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i114;
                int i1122 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i1122)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i1122, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var145.a("tg://settings/faq");
        final int i115 = 16;
        sw0 sw0Var146 = new sw0(404, org.telegram.messenger.id.L0(2131746784), org.telegram.messenger.id.L0(2131745482), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.ow0
            @Override // java.lang.Runnable
            public final void run() {
                int i1022 = i115;
                int i1122 = 0;
                org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                switch (i1022) {
                    case 0:
                        w90 w90Var = new w90();
                        f2Var2.presentFragment(w90Var);
                        w90Var.b0(360928);
                        w90Var.a0(64);
                        break;
                    case 1:
                        w90 w90Var2 = new w90();
                        f2Var2.presentFragment(w90Var2);
                        w90Var2.b0(360928);
                        w90Var2.a0(128);
                        break;
                    case 2:
                        f2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        w90 w90Var3 = new w90();
                        f2Var2.presentFragment(w90Var3);
                        w90Var3.b0(360928);
                        w90Var3.a0(256);
                        break;
                    case 4:
                        w90 w90Var4 = new w90();
                        f2Var2.presentFragment(w90Var4);
                        w90Var4.b0(360928);
                        w90Var4.a0(32768);
                        break;
                    case 5:
                        w90 w90Var5 = new w90();
                        f2Var2.presentFragment(w90Var5);
                        w90Var5.a0(512);
                        break;
                    case 6:
                        f2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        w90 w90Var6 = new w90();
                        f2Var2.presentFragment(w90Var6);
                        w90Var6.a0(1024);
                        break;
                    case 8:
                        w90 w90Var7 = new w90();
                        f2Var2.presentFragment(w90Var7);
                        w90Var7.a0(2048);
                        break;
                    case 9:
                        w90 w90Var8 = new w90();
                        f2Var2.presentFragment(w90Var8);
                        while (true) {
                            ArrayList arrayList = w90Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((r90) arrayList.get(i1122)).f == 1) {
                                w90Var8.b.e1(new l2.q(w90Var8, i1122, 12), 700, true);
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
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131744243, null));
                        break;
                    case 16:
                        vf.c.t(f2Var2.getParentActivity(), org.telegram.messenger.id.M0(2131746782, null));
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
                        st0 st0Var = new st0();
                        st0Var.getMessagesController().F0(true);
                        f2Var2.presentFragment(st0Var);
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
        sw0Var146.a("tg://settings/privacy-policy");
        return new sw0[]{sw0Var23, sw0Var24, sw0Var25, sw0Var26, sw0Var27, sw0Var28, sw0Var29, sw0Var30, sw0Var31, sw0Var32, sw0Var33, sw0Var34, sw0Var35, sw0Var36, sw0Var37, sw0Var38, sw0Var39, sw0Var, sw0Var41, sw0Var42, sw0Var2, sw0Var44, sw0Var45, sw0Var46, sw0Var47, sw0Var48, sw0Var49, sw0Var50, sw0Var51, sw0Var52, sw0Var3, sw0Var4, sw0Var54, sw0Var55, sw0Var56, sw0Var57, sw0Var58, sw0Var59, sw0Var60, sw0Var61, sw0Var62, sw0Var63, sw0Var64, sw0Var65, sw0Var66, sw0Var67, sw0Var68, sw0Var69, sw0Var70, sw0Var71, sw0Var72, sw0Var73, sw0Var74, sw0Var75, sw0Var76, sw0Var77, sw0Var78, sw0Var79, sw0Var80, sw0Var81, sw0Var82, sw0Var83, sw0Var84, sw0Var85, sw0Var86, sw0Var87, sw0Var88, sw0Var89, sw0Var90, sw0Var91, sw0Var92, sw0Var93, sw0Var94, sw0Var95, sw0Var96, sw0Var97, sw0Var98, sw0Var99, sw0Var100, sw0Var101, sw0Var102, sw0Var103, sw0Var104, sw0Var105, sw0Var106, sw0Var107, sw0Var108, sw0Var109, sw0Var110, sw0Var111, sw0Var112, sw0Var6, sw0Var114, sw0Var7, sw0Var116, sw0Var8, sw0Var118, sw0Var119, sw0Var120, sw0Var121, sw0Var5, sw0Var9, sw0Var10, sw0Var11, sw0Var12, sw0Var13, sw0Var14, sw0Var15, sw0Var16, sw0Var123, sw0Var17, sw0Var18, sw0Var19, sw0Var20, sw0Var21, sw0Var124, sw0Var125, sw0Var126, sw0Var127, sw0Var128, sw0Var129, sw0Var130, sw0Var131, sw0Var132, sw0Var133, sw0Var134, sw0Var135, sw0Var22, sw0Var136, sw0Var137, sw0Var138, sw0Var139, sw0Var140, sw0Var141, sw0Var142, sw0Var43, sw0Var144, sw0Var145, sw0Var146};
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
            if (obj2 instanceof sw0) {
                ((sw0) obj2).g = i7;
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
        tL_messages_getWebPage.url = org.telegram.messenger.id.M0(2131744243, null);
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
            qn0 qn0Var = new qn0(27, this, str);
            this.y = qn0Var;
            p5Var.d(qn0Var, 300L);
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
                ((ProfileActivity) this.e).O.d.setText(org.telegram.messenger.id.M0(2131745480, null));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        f();
    }

    public final void J() {
        String[] strArr;
        sw0 sw0Var;
        HashMap hashMap = new HashMap();
        int i7 = 0;
        while (true) {
            sw0[] sw0VarArr = this.c;
            if (i7 >= sw0VarArr.length) {
                break;
            }
            sw0 sw0Var2 = sw0VarArr[i7];
            if (sw0Var2 != null) {
                hashMap.put(Integer.valueOf(sw0Var2.f), this.c[i7]);
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
                    } else if (readInt322 == 1 && (sw0Var = (sw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        sw0Var.g = readInt32;
                        arrayList.add(sw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new un0(this));
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
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.id.M0(2131745485, null));
                return;
            } else {
                if (i10 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.id.M0(2131745472, null));
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
                sw0 sw0Var = (sw0) this.r.get(i7);
                sw0 sw0Var2 = i7 > 0 ? (sw0) this.r.get(i7 - 1) : null;
                v6Var.b((CharSequence) this.n.get(i7), sw0Var.d, (sw0Var2 == null || sw0Var2.e != sw0Var.e) ? sw0Var.e : 0, i7 < this.r.size() - 1);
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
        if (obj instanceof sw0) {
            sw0 sw0Var3 = (sw0) obj;
            v6Var.a(sw0Var3.a, sw0Var3.d, false, i7 < arrayList.size() - 1);
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
