// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class to8 extends n39 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public so8[] c;
    public final d e;
    public final int f;
    public final Context h;
    public boolean x;
    public ll8 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public to8(d dVar, Context context) {
        this.e = dVar;
        this.f = dVar.getCurrentAccount();
        this.h = context;
        this.c = H(dVar);
        J();
    }

    public static boolean F(int i, int i2) {
        if (!na7.q1(i).E3() || y6c.h(i).p()) {
            return i2 == -1 || na7.q1(i).E0.get(i2, -1) != -1;
        }
        return false;
    }

    public static so8[] H(final d dVar) {
        so8 so8Var;
        so8 so8Var2;
        so8 so8Var3;
        so8 so8Var4;
        so8 so8Var5;
        so8 so8Var6;
        so8 so8Var7;
        so8 so8Var8;
        so8 so8Var9;
        so8 so8Var10;
        so8 so8Var11;
        so8 so8Var12;
        so8 so8Var13;
        so8 so8Var14;
        so8 so8Var15;
        so8 so8Var16;
        so8 so8Var17;
        so8 so8Var18;
        so8 so8Var19;
        so8 so8Var20;
        final int currentAccount = dVar.getCurrentAccount();
        so8 so8Var21 = new so8(500, k96.L0(2131751252), 0, new ll8(dVar, dVar.getResourceProvider(), (byte) 13));
        final byte b = 28;
        so8 so8Var22 = new so8(501, k96.L0(2131752525), 0, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                int i = 0;
                d dVar2 = dVar;
                switch (b2) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var22.h = "tg://settings/edit/change-number";
        final byte b2 = 10;
        so8 so8Var23 = new so8(502, k96.L0(2131754465), 0, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                int i = 0;
                d dVar2 = dVar;
                switch (b3) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var23.h = "tg://settings/edit/add-account";
        final byte b3 = 21;
        so8 so8Var24 = new so8(1, k96.L0(2131747729), R.drawable.msg_notifications, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b3;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var24.h = "tg://settings/notifications";
        so8 so8Var25 = new so8(2, k96.L0(2131747685), k96.L0(2131747729), R.drawable.msg_notifications, new ro8(dVar, (byte) 3));
        so8Var25.h = "tg://settings/notifications/private-chats";
        so8 so8Var26 = new so8(3, k96.L0(2131747714), k96.L0(2131747729), R.drawable.msg_notifications, new ro8(dVar, (byte) 15));
        so8Var26.h = "tg://settings/notifications/groups";
        so8 so8Var27 = new so8(4, k96.L0(2131747728), k96.L0(2131747729), R.drawable.msg_notifications, new kv1(dVar, (byte) 11));
        so8Var27.h = "tg://settings/notifications/channels";
        so8 so8Var28 = new so8(5, k96.L0(2131743037), "callsSectionRow", k96.L0(2131747729), R.drawable.msg_notifications, new kv1(dVar, (byte) 23));
        final byte b4 = 5;
        so8 so8Var29 = new so8(6, k96.L0(2131753730), "badgeNumberSection", k96.L0(2131747729), R.drawable.msg_notifications, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b5 = b4;
                d dVar2 = dVar;
                switch (b5) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b5 = 17;
        so8 so8Var30 = new so8(7, k96.L0(2131749027), "inappSectionRow", k96.L0(2131747729), R.drawable.msg_notifications, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b5;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8 so8Var31 = new so8(8, k96.L0(2131751778), "contactJoinedRow", k96.L0(2131747729), R.drawable.msg_notifications, new kv1(dVar, (byte) 27));
        so8Var31.h = "tg://settings/notifications/new-contacts";
        final byte b6 = 28;
        so8 so8Var32 = new so8(9, k96.L0(2131747035), "pinnedMessageRow", k96.L0(2131747729), R.drawable.msg_notifications, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b6;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var32.h = "tg://settings/notifications/pinned-messages";
        so8 so8Var33 = new so8(10, k96.L0(2131745919), "resetNotificationsRow", k96.L0(2131747729), R.drawable.msg_notifications, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                int i = 0;
                d dVar2 = dVar;
                switch (b22) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var33.h = "tg://settings/notifications/reset";
        so8 so8Var34 = new so8(11, k96.L0(2131747683), "notificationsServiceRow", k96.L0(2131747729), R.drawable.msg_notifications, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b3;
                int i = 0;
                d dVar2 = dVar;
                switch (b22) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        final byte b7 = 22;
        so8 so8Var35 = new so8(12, k96.L0(2131747682), "notificationsServiceConnectionRow", k96.L0(2131747729), R.drawable.msg_notifications, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b7;
                int i = 0;
                d dVar2 = dVar;
                switch (b22) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        final byte b8 = 23;
        so8 so8Var36 = new so8(13, k96.L0(2131746082), "repeatRow", k96.L0(2131747729), R.drawable.msg_notifications, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b8;
                int i = 0;
                d dVar2 = dVar;
                switch (b22) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        final byte b9 = 24;
        so8 so8Var37 = new so8(100, k96.L0(2131746580), R.drawable.msg_secret, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b9;
                int i = 0;
                d dVar2 = dVar;
                switch (b22) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var37.h = "tg://settings/privacy";
        final byte b10 = 25;
        so8 so8Var38 = new so8(kk7.t1, k96.L0(2131743699), k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b10;
                int i = 0;
                d dVar2 = dVar;
                switch (b22) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var38.h = "tg://settings/privacy/2sv";
        final byte b11 = 0;
        so8 so8Var39 = new so8(kk7.H1, k96.L0(2131753847), k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: po8
            @Override // java.lang.Runnable
            public final void run() {
                byte b12 = b11;
                d dVar2 = dVar;
                int i = currentAccount;
                switch (b12) {
                    case 0:
                        if (y6c.h(i).q0 >= 0) {
                            dVar2.presentFragment(new v60());
                            break;
                        }
                        break;
                    default:
                        if (!y6c.h(i).p()) {
                            u21 b0 = u21.b0(dVar2);
                            b0.getClass();
                            t11 t11Var = new t11(b0.X(), null);
                            byte b13 = 0;
                            t11Var.d(R.raw.voip_muted, new String[0]);
                            String M0 = k96.M0(2131746564, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new r21(b0, b13), indexOf, lastIndexOf - 1, 33);
                            }
                            t11Var.b.setText(spannableStringBuilder);
                            t11Var.b.setSingleLine(false);
                            t11Var.b.setMaxLines(2);
                            b0.b(t11Var, 2750).j();
                            break;
                        } else {
                            dVar2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        so8Var39.h = "tg://settings/privacy/auto-delete";
        final byte b12 = 26;
        so8 so8Var40 = new so8(kk7.s1, k96.L0(2131747464), k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b12;
                int i = 0;
                d dVar2 = dVar;
                switch (b22) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var40.h = "tg://settings/privacy/passcode";
        so8 so8Var41 = null;
        if (gba.j1) {
            so8Var = so8Var38;
            final byte b13 = 29;
            so8Var2 = new so8(kk7.I1, k96.L0(2131751190), "emailLoginRow", k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: oo8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b22 = b13;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b22) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            break;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            break;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            break;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            break;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            break;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            break;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            break;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            break;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            break;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            break;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            break;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            break;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            break;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            break;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            break;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                    }
                }
            });
            so8Var2.h = "tg://settings/privacy/login-email";
        } else {
            so8Var = so8Var38;
            so8Var2 = null;
        }
        final byte b14 = 0;
        so8 so8Var42 = new so8(101, k96.L0(2131753678), k96.L0(2131746580), R.drawable.msg_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b14;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var42.h = "tg://settings/privacy/blocked";
        final byte b15 = 1;
        so8 so8Var43 = new so8(kk7.u1, k96.L0(2131745359), R.drawable.msg2_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b15;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var43.h = "tg://settings/devices";
        final byte b16 = 2;
        so8 so8Var44 = new so8(kk7.p1, k96.L0(2131746599), k96.L0(2131746580), R.drawable.msg_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b16;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var44.h = "tg://settings/privacy/phone-number/";
        final byte b17 = 3;
        so8 so8Var45 = new so8(kk7.m1, k96.L0(2131746624), k96.L0(2131746580), R.drawable.msg_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b17;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var45.h = "tg://settings/privacy/last-seen";
        final byte b18 = 4;
        so8 so8Var46 = new so8(kk7.n1, k96.L0(2131746586), k96.L0(2131746580), R.drawable.msg_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b18;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var46.h = "tg://settings/privacy/profile-photos";
        final byte b19 = 5;
        so8 so8Var47 = new so8(kk7.o1, k96.L0(2131746646), k96.L0(2131746580), R.drawable.msg_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b19;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var47.h = "tg://settings/privacy/forwards";
        final byte b20 = 6;
        so8 so8Var48 = new so8(kk7.F1, k96.L0(2131746609), k96.L0(2131746580), R.drawable.msg_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b20;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var48.h = "tg://settings/privacy/calls/p2p";
        final byte b21 = 7;
        so8 so8Var49 = new so8(kk7.q1, k96.L0(2131752584), k96.L0(2131746580), R.drawable.msg_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b21;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var49.h = "tg://settings/privacy/calls";
        final byte b22 = 9;
        so8 so8Var50 = new so8(kk7.r1, k96.L0(2131746626), k96.L0(2131746580), R.drawable.msg_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b22;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var50.h = "tg://settings/privacy/invites";
        final byte b23 = 1;
        so8 so8Var51 = new so8(kk7.G1, k96.L0(2131746567), k96.L0(2131746580), R.drawable.msg_secret, new Runnable() { // from class: po8
            @Override // java.lang.Runnable
            public final void run() {
                byte b122 = b23;
                d dVar2 = dVar;
                int i = currentAccount;
                switch (b122) {
                    case 0:
                        if (y6c.h(i).q0 >= 0) {
                            dVar2.presentFragment(new v60());
                            break;
                        }
                        break;
                    default:
                        if (!y6c.h(i).p()) {
                            u21 b0 = u21.b0(dVar2);
                            b0.getClass();
                            t11 t11Var = new t11(b0.X(), null);
                            byte b132 = 0;
                            t11Var.d(R.raw.voip_muted, new String[0]);
                            String M0 = k96.M0(2131746564, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new r21(b0, b132), indexOf, lastIndexOf - 1, 33);
                            }
                            t11Var.b.setText(spannableStringBuilder);
                            t11Var.b.setSingleLine(false);
                            t11Var.b.setMaxLines(2);
                            b0.b(t11Var, 2750).j();
                            break;
                        } else {
                            dVar2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        so8Var51.h = "tg://settings/privacy/voice";
        if (na7.q1(currentAccount).k4.L0.f()) {
            so8Var3 = so8Var51;
            final byte b24 = 11;
            so8Var4 = new so8(kk7.E1, k96.L0(2131754168), "newChatsRow", k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: qo8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b32 = b24;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b32) {
                        case 0:
                            gk8 gk8Var = new gk8();
                            gk8Var.getMessagesController().D0(true);
                            dVar2.presentFragment(gk8Var);
                            return;
                        case 1:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            dVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            dVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            dVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            dVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            dVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            dVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 1, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            dVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 2, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            dVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            dVar2.presentFragment(new r61());
                            return;
                        case 28:
                            dVar2.presentFragment(new r61());
                            return;
                        default:
                            jh8 jh8Var3 = new jh8(dVar2, 8, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                    }
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                        } else if (y6c.h(i).o()) {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mf6(i));
                    }
                }
            });
            so8Var4.h = "tg://settings/privacy/archive-and-mute";
        } else {
            so8Var3 = so8Var51;
            so8Var4 = null;
        }
        final byte b25 = 12;
        so8 so8Var52 = new so8(kk7.w1, k96.L0(2131751584), "deleteAccountRow", k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b25;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var52.h = "tg://settings/privacy/self-destruct";
        final byte b26 = 13;
        so8 so8Var53 = new so8(kk7.x1, k96.L0(2131746606), "paymentsClearRow", k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b26;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var53.h = "tg://settings/privacy/data-settings/clear-payment-info";
        final byte b27 = 14;
        so8 so8Var54 = new so8(kk7.y1, k96.L0(2131742648), k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b27;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var54.h = "tg://settings/privacy/active-websites";
        final byte b28 = 15;
        so8 so8Var55 = new so8(kk7.z1, k96.L0(2131744055), "contactsDeleteRow", k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b28;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var55.h = "tg://settings/privacy/data-settings/delete-synced";
        final byte b29 = 16;
        so8 so8Var56 = new so8(kk7.A1, k96.L0(2131744057), "contactsSyncRow", k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b29;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var56.h = "tg://settings/privacy/data-settings/sync-contacts";
        final byte b30 = 17;
        so8 so8Var57 = new so8(kk7.B1, k96.L0(2131744171), "contactsSuggestRow", k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b30;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var57.h = "tg://settings/privacy/data-settings/suggest-contacts";
        final byte b31 = 19;
        so8 so8Var58 = new so8(kk7.C1, k96.L0(2131748497), "secretMapRow", k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b31;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var58.h = "tg://settings/privacy/data-settings/map-provider";
        final byte b32 = 20;
        so8 so8Var59 = new so8(kk7.D1, k96.L0(2131745492), "secretWebpageRow", k96.L0(2131746580), R.drawable.msg2_secret, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b32;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var59.h = "tg://settings/privacy/data-settings/link-previews";
        final byte b33 = 22;
        so8 so8Var60 = new so8(120, k96.L0(2131751443), R.drawable.msg2_devices, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b33;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var60.h = "tg://settings/devices";
        final byte b34 = 23;
        so8 so8Var61 = new so8(kk7.E1, k96.L0(2131743967), "terminateAllSessionsRow", k96.L0(2131751443), R.drawable.msg2_devices, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b34;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var61.h = "tg://settings/devices/terminate-sessions";
        final byte b35 = 24;
        so8 so8Var62 = new so8(kk7.F1, k96.L0(2131748725), k96.L0(2131751443), R.drawable.msg2_devices, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b35;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var62.h = "tg://settings/devices/link-desktop";
        final byte b36 = 25;
        so8 so8Var63 = new so8(kk7.d3, k96.L0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b36;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var63.h = "tg://settings/privacy/data-settings";
        final byte b37 = 26;
        so8 so8Var64 = new so8(kk7.e3, k96.L0(2131751664), "usageSectionRow", k96.L0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b37;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        final byte b38 = 27;
        so8 so8Var65 = new so8(kk7.f3, k96.L0(2131744579), k96.L0(2131751665), R.drawable.msg2_data, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b38;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8Var65.h = "tg://settings/data/storage";
        final byte b39 = 28;
        so8 so8Var66 = new so8(203, k96.L0(2131748868), "keepMediaRow", k96.L0(2131751665), k96.L0(2131744579), R.drawable.msg2_data, new Runnable() { // from class: qo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b39;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        gk8 gk8Var = new gk8();
                        gk8Var.getMessagesController().D0(true);
                        dVar2.presentFragment(gk8Var);
                        return;
                    case 1:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 2:
                        dVar2.presentFragment(new PrivacyControlActivity(6, true));
                        return;
                    case 3:
                        dVar2.presentFragment(new PrivacyControlActivity(0, true));
                        return;
                    case 4:
                        dVar2.presentFragment(new PrivacyControlActivity(4, true));
                        return;
                    case 5:
                        dVar2.presentFragment(new PrivacyControlActivity(5, true));
                        return;
                    case 6:
                        dVar2.presentFragment(new PrivacyControlActivity(3, true));
                        return;
                    case 7:
                        dVar2.presentFragment(new PrivacyControlActivity(2, true));
                        return;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 1, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        return;
                    case 9:
                        dVar2.presentFragment(new PrivacyControlActivity(1, true));
                        return;
                    case 10:
                        break;
                    case 11:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 12:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 13:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 14:
                        dVar2.presentFragment(new SessionsActivity(1));
                        return;
                    case 15:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 16:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 17:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 2, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        return;
                    case 19:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 20:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        return;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        return;
                    case 22:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 23:
                        dVar2.presentFragment(new SessionsActivity(0));
                        return;
                    case 24:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        dVar2.presentFragment(sessionsActivity);
                        return;
                    case 25:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 26:
                        dVar2.presentFragment(new DataSettingsActivity());
                        return;
                    case 27:
                        dVar2.presentFragment(new r61());
                        return;
                    case 28:
                        dVar2.presentFragment(new r61());
                        return;
                    default:
                        jh8 jh8Var3 = new jh8(dVar2, 8, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (y6c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mf6(i));
                }
            }
        });
        so8 so8Var67 = new so8(kk7.h3, k96.L0(2131752063), "cacheRow", k96.L0(2131751665), k96.L0(2131744579), R.drawable.msg2_data, new ro8(dVar, (byte) 0));
        so8 so8Var68 = new so8(kk7.i3, k96.L0(2131748582), "databaseRow", k96.L0(2131751665), k96.L0(2131744579), R.drawable.msg2_data, new ro8(dVar, (byte) 1));
        so8 so8Var69 = new so8(kk7.j3, k96.L0(2131748106), k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 2));
        so8Var69.h = "tg://settings/data/usage";
        so8 so8Var70 = new so8(kk7.k3, k96.L0(2131753764), "mediaDownloadSectionRow", k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 4));
        so8 so8Var71 = new so8(kk7.l3, k96.L0(2131742621), k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 5));
        so8 so8Var72 = new so8(kk7.m3, k96.L0(2131742623), k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 6));
        so8 so8Var73 = new so8(210, k96.L0(2131742622), k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 7));
        so8 so8Var74 = new so8(kk7.n3, k96.L0(2131745918), "resetDownloadRow", k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 8));
        so8Var74.h = "tg://settings/data/auto-download/reset";
        so8 so8Var75 = new so8(kk7.r3, k96.L0(2131744197), "streamSectionRow", k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 9));
        so8 so8Var76 = new so8(kk7.s3, k96.L0(2131751132), "enableStreamRow", k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 11));
        so8 so8Var77 = new so8(kk7.t3, k96.L0(2131752584), "callsSectionRow", k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 12));
        so8 so8Var78 = new so8(kk7.u3, k96.L0(2131742987), "useLessDataForCallsRow", k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 13));
        so8Var78.h = "tg://settings/data/use-less-data";
        so8 so8Var79 = new so8(kk7.v3, k96.L0(2131743016), "quickRepliesRow", k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 14));
        so8 so8Var80 = new so8(kk7.w3, k96.L0(2131746408), k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 16));
        so8Var80.h = "tg://settings/data/proxy";
        so8 so8Var81 = new so8(kk7.v1, k96.L0(2131746650), "clearDraftsRow", k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 17));
        so8Var81.h = "tg://settings/privacy/data-settings/delete-cloud-drafts";
        so8 so8Var82 = new so8(kk7.y3, k96.L0(2131745737), "saveToGallerySectionRow", k96.L0(2131751665), R.drawable.msg2_data, new ro8(dVar, (byte) 18));
        so8 so8Var83 = new so8(kk7.z3, k96.L0(2131745727), "saveToGalleryPeerRow", k96.L0(2131751665), k96.L0(2131745737), R.drawable.msg2_data, new ro8(dVar, (byte) 19));
        so8Var83.h = "tg://settings/data/save-to-photos/chats";
        so8 so8Var84 = new so8(kk7.A3, k96.L0(2131745734), "saveToGalleryGroupsRow", k96.L0(2131751665), k96.L0(2131745737), R.drawable.msg2_data, new ro8(dVar, (byte) 20));
        so8Var84.h = "tg://settings/data/save-to-photos/groups";
        so8 so8Var85 = new so8(kk7.B3, k96.L0(2131745736), "saveToGalleryChannelsRow", k96.L0(2131751665), k96.L0(2131745737), R.drawable.msg2_data, new kv1(dVar, (byte) 6));
        so8Var85.h = "tg://settings/data/save-to-photos/channels";
        so8 so8Var86 = new so8(kk7.W4, k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 7));
        so8Var86.h = "tg://settings/appearance/themes";
        so8 so8Var87 = new so8(kk7.X4, k96.L0(2131743950), "textSizeHeaderRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 8));
        so8Var87.h = "tg://settings/appearance/text-size";
        so8 so8Var88 = new so8(kk7.Y4, k96.L0(2131752538), k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 9));
        so8Var88.h = "tg://settings/appearance/wallpapers";
        so8 so8Var89 = new so8(kk7.Z4, k96.L0(2131745346), null, k96.L0(2131752198), k96.L0(2131752232), R.drawable.msg2_discussion, new kv1(dVar, (byte) 10));
        so8 so8Var90 = new so8(kk7.a5, k96.L0(2131745915), "resetRow", k96.L0(2131752198), k96.L0(2131752232), R.drawable.msg2_discussion, new kv1(dVar, (byte) 12));
        so8 so8Var91 = new so8(kk7.c5, k96.L0(2131751999), "themeHeaderRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 13));
        so8 so8Var92 = new so8(kk7.p5, k96.L0(2131752866), null, k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 14));
        so8 so8Var93 = new so8(kk7.q5, k96.L0(2131751700), "createNewThemeRow", k96.L0(2131752198), k96.L0(2131752866), R.drawable.msg2_discussion, new kv1(dVar, (byte) 15));
        so8Var93.h = "tg://settings/appearance/themes/create";
        so8 so8Var94 = new so8(kk7.r5, k96.L0(2131752828), "bubbleRadiusHeaderRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 17));
        so8Var94.h = "tg://settings/appearance/message-corners";
        so8 so8Var95 = new so8(kk7.s5, k96.L0(2131752213), "chatListHeaderRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 18));
        so8 so8Var96 = new so8(kk7.t5, k96.L0(2131752210), "swipeGestureHeaderRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 19));
        so8 so8Var97 = new so8(kk7.u5, k96.L0(2131754237), "appIconHeaderRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 20));
        so8Var97.h = "tg://settings/appearance/app-icon";
        so8 so8Var98 = new so8(kk7.b5, k96.L0(2131753781), k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 21));
        so8 so8Var99 = new so8(kk7.y5, k96.L0(2131748057), "nextMediaTapRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 22));
        so8Var99.h = "tg://settings/appearance/tap-for-next-media";
        so8 so8Var100 = new so8(kk7.x5, k96.L0(2131746234), "raiseToListenRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 24));
        so8Var100.h = "tg://settings/data/raise-to-listen";
        so8 so8Var101 = new so8(kk7.g5, k96.L0(2131746232), "raiseToSpeakRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 25));
        so8Var101.h = "tg://settings/data/raise-to-speak";
        so8 so8Var102 = new so8(kk7.w5, k96.L0(2131747239), "pauseOnMediaRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 26));
        so8Var102.h = "tg://settings/data/pause-music";
        so8 so8Var103 = new so8(kk7.v5, k96.L0(2131748247), "bluetoothScoRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 28));
        so8 so8Var104 = new so8(kk7.e5, k96.L0(2131751426), "directShareRow", k96.L0(2131752198), R.drawable.msg2_discussion, new kv1(dVar, (byte) 29));
        final byte b40 = 0;
        so8 so8Var105 = new so8(kk7.h5, k96.L0(2131745440), "sendByEnterRow", k96.L0(2131752198), R.drawable.msg2_discussion, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b40;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b41 = 1;
        so8 so8Var106 = new so8(kk7.o5, k96.L0(2131751355), "distanceRow", k96.L0(2131752198), R.drawable.msg2_discussion, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b41;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b42 = 2;
        so8 so8Var107 = new so8(600, k96.L0(2131744620), R.drawable.msg2_sticker, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b42;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var107.h = "tg://settings/appearance/stickers-and-emoji";
        final byte b43 = 3;
        so8 so8Var108 = new so8(601, k96.L0(2131744161), "suggestRow", k96.L0(2131744620), R.drawable.msg2_sticker, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b43;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b44 = 4;
        so8 so8Var109 = new so8(602, k96.L0(2131750821), "featuredStickersHeaderRow", k96.L0(2131744620), R.drawable.msg2_sticker, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b44;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b45 = 6;
        so8 so8Var110 = new so8(603, k96.L0(2131748487), null, k96.L0(2131744620), R.drawable.msg2_sticker, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b45;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b46 = 7;
        so8 so8Var111 = new so8(604, k96.L0(2131754125), null, k96.L0(2131744620), R.drawable.msg2_sticker, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b46;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var111.h = "tg://settings/appearance/stickers-and-emoji/archived";
        final byte b47 = 9;
        so8 so8Var112 = new so8(605, k96.L0(2131754130), null, k96.L0(2131744620), R.drawable.msg2_sticker, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b47;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b48 = 10;
        so8 so8Var113 = new so8(606, k96.L0(2131748842), "largeEmojiRow", k96.L0(2131744620), R.drawable.msg2_sticker, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b48;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var113.h = "tg://settings/appearance/stickers-and-emoji/emoji/large";
        final byte b49 = 11;
        so8 so8Var114 = new so8(607, k96.L0(2131748530), null, k96.L0(2131746875), k96.L0(2131748658), R.drawable.msg2_battery, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b49;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b50 = 12;
        so8 so8Var115 = new so8(608, k96.L0(2131751184), null, k96.L0(2131744620), R.drawable.input_smile, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b50;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var115.h = "tg://settings/appearance/stickers-and-emoji/emoji";
        final byte b51 = 13;
        so8 so8Var116 = new so8(609, k96.L0(2131744175), "suggestAnimatedEmojiRow", k96.L0(2131744620), k96.L0(2131751184), R.drawable.input_smile, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b52 = b51;
                d dVar2 = dVar;
                switch (b52) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var116.h = "tg://settings/appearance/stickers-and-emoji/emoji/suggest";
        final byte b52 = 14;
        so8 so8Var117 = new so8(610, k96.L0(2131750823), "featuredStickersHeaderRow", k96.L0(2131744620), k96.L0(2131751184), R.drawable.input_smile, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b522 = b52;
                d dVar2 = dVar;
                switch (b522) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b53 = 15;
        so8 so8Var118 = new so8(611, k96.L0(2131751338), null, k96.L0(2131744620), R.drawable.msg2_sticker, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b522 = b53;
                d dVar2 = dVar;
                switch (b522) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var118.h = "tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction";
        final byte b54 = 16;
        so8 so8Var119 = new so8(700, k96.L0(2131750679), null, R.drawable.msg2_folder, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b522 = b54;
                d dVar2 = dVar;
                switch (b522) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var119.h = "tg://settings/folders";
        final byte b55 = 25;
        so8 so8Var120 = new so8(701, k96.L0(2131751704), "createFilterRow", k96.L0(2131750679), R.drawable.msg2_folder, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b522 = b55;
                d dVar2 = dVar;
                switch (b522) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var120.h = "tg://settings/folders/create";
        if (F(currentAccount, -1)) {
            so8Var5 = so8Var120;
            so8Var6 = so8Var111;
            so8Var7 = so8Var113;
            final byte b56 = 6;
            so8Var8 = so8Var115;
            so8Var9 = new so8(800, k96.L0(2131743990), R.drawable.msg_settings_premium, new Runnable() { // from class: oo8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b222 = b56;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b222) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            break;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            break;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            break;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            break;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            break;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            break;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            break;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            break;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            break;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            break;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            break;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            break;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            break;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            break;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            break;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                    }
                }
            });
        } else {
            so8Var5 = so8Var120;
            so8Var6 = so8Var111;
            so8Var7 = so8Var113;
            so8Var8 = so8Var115;
            so8Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final byte b57 = 17;
            so8Var10 = new so8(801, k96.L0(2131746807), k96.L0(2131743990), R.drawable.msg_settings_premium, new Runnable() { // from class: oo8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b222 = b57;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b222) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            break;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            break;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            break;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            break;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            break;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            break;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            break;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            break;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            break;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            break;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            break;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            break;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            break;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            break;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            break;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                    }
                }
            });
        } else {
            so8Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final byte b58 = 27;
            so8Var11 = new so8(802, k96.L0(2131746816), k96.L0(2131743990), R.drawable.msg_settings_premium, new Runnable() { // from class: oo8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b222 = b58;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b222) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            break;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            break;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            break;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            break;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            break;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            break;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            break;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            break;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            break;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            break;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            break;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            break;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            break;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            break;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            break;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                    }
                }
            });
        } else {
            so8Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final byte b59 = 8;
            so8Var12 = new so8(803, k96.L0(2131746773), k96.L0(2131743990), R.drawable.msg_settings_premium, new Runnable() { // from class: qo8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b322 = b59;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b322) {
                        case 0:
                            gk8 gk8Var = new gk8();
                            gk8Var.getMessagesController().D0(true);
                            dVar2.presentFragment(gk8Var);
                            return;
                        case 1:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            dVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            dVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            dVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            dVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            dVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            dVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 1, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            dVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 2, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            dVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            dVar2.presentFragment(new r61());
                            return;
                        case 28:
                            dVar2.presentFragment(new r61());
                            return;
                        default:
                            jh8 jh8Var3 = new jh8(dVar2, 8, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                    }
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                        } else if (y6c.h(i).o()) {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mf6(i));
                    }
                }
            });
        } else {
            so8Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final byte b60 = 18;
            so8Var13 = new so8(804, k96.L0(2131746821), k96.L0(2131743990), R.drawable.msg_settings_premium, new Runnable() { // from class: qo8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b322 = b60;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b322) {
                        case 0:
                            gk8 gk8Var = new gk8();
                            gk8Var.getMessagesController().D0(true);
                            dVar2.presentFragment(gk8Var);
                            return;
                        case 1:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            dVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            dVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            dVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            dVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            dVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            dVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 1, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            dVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 2, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            dVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            dVar2.presentFragment(new r61());
                            return;
                        case 28:
                            dVar2.presentFragment(new r61());
                            return;
                        default:
                            jh8 jh8Var3 = new jh8(dVar2, 8, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                    }
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                        } else if (y6c.h(i).o()) {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mf6(i));
                    }
                }
            });
        } else {
            so8Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final byte b61 = 29;
            so8Var14 = new so8(805, k96.L0(2131746771), k96.L0(2131743990), R.drawable.msg_settings_premium, new Runnable() { // from class: qo8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b322 = b61;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b322) {
                        case 0:
                            gk8 gk8Var = new gk8();
                            gk8Var.getMessagesController().D0(true);
                            dVar2.presentFragment(gk8Var);
                            return;
                        case 1:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 2:
                            dVar2.presentFragment(new PrivacyControlActivity(6, true));
                            return;
                        case 3:
                            dVar2.presentFragment(new PrivacyControlActivity(0, true));
                            return;
                        case 4:
                            dVar2.presentFragment(new PrivacyControlActivity(4, true));
                            return;
                        case 5:
                            dVar2.presentFragment(new PrivacyControlActivity(5, true));
                            return;
                        case 6:
                            dVar2.presentFragment(new PrivacyControlActivity(3, true));
                            return;
                        case 7:
                            dVar2.presentFragment(new PrivacyControlActivity(2, true));
                            return;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 1, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            return;
                        case 9:
                            dVar2.presentFragment(new PrivacyControlActivity(1, true));
                            return;
                        case 10:
                            break;
                        case 11:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 12:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 13:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 14:
                            dVar2.presentFragment(new SessionsActivity(1));
                            return;
                        case 15:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 16:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 17:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 2, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            return;
                        case 19:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 20:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            return;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            return;
                        case 22:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 23:
                            dVar2.presentFragment(new SessionsActivity(0));
                            return;
                        case 24:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            dVar2.presentFragment(sessionsActivity);
                            return;
                        case 25:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 26:
                            dVar2.presentFragment(new DataSettingsActivity());
                            return;
                        case 27:
                            dVar2.presentFragment(new r61());
                            return;
                        case 28:
                            dVar2.presentFragment(new r61());
                            return;
                        default:
                            jh8 jh8Var3 = new jh8(dVar2, 8, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            return;
                    }
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                        } else if (y6c.h(i).o()) {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mf6(i));
                    }
                }
            });
        } else {
            so8Var14 = null;
        }
        so8 so8Var121 = F(currentAccount, 3) ? new so8(806, k96.L0(2131746801), k96.L0(2131743990), R.drawable.msg_settings_premium, new ro8(dVar, (byte) 10)) : null;
        so8 so8Var122 = F(currentAccount, 4) ? new so8(807, k96.L0(2131746792), k96.L0(2131743990), R.drawable.msg_settings_premium, new ro8(dVar, (byte) 21)) : null;
        so8 so8Var123 = F(currentAccount, 5) ? new so8(808, k96.L0(2131746785), k96.L0(2131743990), R.drawable.msg_settings_premium, new kv1(dVar, (byte) 16)) : null;
        if (F(currentAccount, 9)) {
            final byte b62 = 8;
            so8Var15 = new so8(809, k96.L0(2131746834), k96.L0(2131743990), R.drawable.msg_settings_premium, new Runnable() { // from class: no8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b522 = b62;
                    d dVar2 = dVar;
                    switch (b522) {
                        case 0:
                        case 1:
                            de9.o(0, dVar2);
                            break;
                        case 2:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 3:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 5:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 6:
                            dVar2.presentFragment(new StickersActivity(1, null));
                            break;
                        case 7:
                            dVar2.presentFragment(new hs(0));
                            break;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 9, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            break;
                        case 9:
                            dVar2.presentFragment(new hs(1));
                            break;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 11:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(3);
                            m66Var.Z(2);
                            break;
                        case 12:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 14:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 15:
                            dVar2.presentFragment(new y09());
                            break;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 6, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            break;
                        case 19:
                            jh8 jh8Var3 = new jh8(dVar2, 7, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            break;
                        case 20:
                            jh8 jh8Var4 = new jh8(dVar2, 10, false);
                            jh8Var4.F0();
                            dVar2.showDialog(jh8Var4);
                            break;
                        case 21:
                            jh8 jh8Var5 = new jh8(dVar2, 12, false);
                            jh8Var5.F0();
                            dVar2.showDialog(jh8Var5);
                            break;
                        case 22:
                            dVar2.presentFragment(new m66());
                            break;
                        case 23:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.Z(3);
                            break;
                        case 24:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.a0(3);
                            m66Var3.Z(1);
                            break;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 26:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(3);
                            m66Var4.Z(2);
                            break;
                        case 27:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.Z(28700);
                            break;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        default:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(28700);
                            m66Var6.Z(16388);
                            break;
                    }
                }
            });
        } else {
            so8Var15 = null;
        }
        if (F(currentAccount, 6)) {
            final byte b63 = 18;
            so8Var16 = new so8(810, k96.L0(2131746796), k96.L0(2131743990), R.drawable.msg_settings_premium, new Runnable() { // from class: no8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b522 = b63;
                    d dVar2 = dVar;
                    switch (b522) {
                        case 0:
                        case 1:
                            de9.o(0, dVar2);
                            break;
                        case 2:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 3:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 5:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 6:
                            dVar2.presentFragment(new StickersActivity(1, null));
                            break;
                        case 7:
                            dVar2.presentFragment(new hs(0));
                            break;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 9, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            break;
                        case 9:
                            dVar2.presentFragment(new hs(1));
                            break;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 11:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(3);
                            m66Var.Z(2);
                            break;
                        case 12:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 14:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 15:
                            dVar2.presentFragment(new y09());
                            break;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 6, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            break;
                        case 19:
                            jh8 jh8Var3 = new jh8(dVar2, 7, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            break;
                        case 20:
                            jh8 jh8Var4 = new jh8(dVar2, 10, false);
                            jh8Var4.F0();
                            dVar2.showDialog(jh8Var4);
                            break;
                        case 21:
                            jh8 jh8Var5 = new jh8(dVar2, 12, false);
                            jh8Var5.F0();
                            dVar2.showDialog(jh8Var5);
                            break;
                        case 22:
                            dVar2.presentFragment(new m66());
                            break;
                        case 23:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.Z(3);
                            break;
                        case 24:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.a0(3);
                            m66Var3.Z(1);
                            break;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 26:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(3);
                            m66Var4.Z(2);
                            break;
                        case 27:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.Z(28700);
                            break;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        default:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(28700);
                            m66Var6.Z(16388);
                            break;
                    }
                }
            });
        } else {
            so8Var16 = null;
        }
        if (F(currentAccount, 7)) {
            final byte b64 = 19;
            so8Var17 = new so8(811, k96.L0(2131746831), k96.L0(2131743990), R.drawable.msg_settings_premium, new Runnable() { // from class: no8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b522 = b64;
                    d dVar2 = dVar;
                    switch (b522) {
                        case 0:
                        case 1:
                            de9.o(0, dVar2);
                            break;
                        case 2:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 3:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 5:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 6:
                            dVar2.presentFragment(new StickersActivity(1, null));
                            break;
                        case 7:
                            dVar2.presentFragment(new hs(0));
                            break;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 9, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            break;
                        case 9:
                            dVar2.presentFragment(new hs(1));
                            break;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 11:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(3);
                            m66Var.Z(2);
                            break;
                        case 12:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 14:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 15:
                            dVar2.presentFragment(new y09());
                            break;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 6, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            break;
                        case 19:
                            jh8 jh8Var3 = new jh8(dVar2, 7, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            break;
                        case 20:
                            jh8 jh8Var4 = new jh8(dVar2, 10, false);
                            jh8Var4.F0();
                            dVar2.showDialog(jh8Var4);
                            break;
                        case 21:
                            jh8 jh8Var5 = new jh8(dVar2, 12, false);
                            jh8Var5.F0();
                            dVar2.showDialog(jh8Var5);
                            break;
                        case 22:
                            dVar2.presentFragment(new m66());
                            break;
                        case 23:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.Z(3);
                            break;
                        case 24:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.a0(3);
                            m66Var3.Z(1);
                            break;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 26:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(3);
                            m66Var4.Z(2);
                            break;
                        case 27:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.Z(28700);
                            break;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        default:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(28700);
                            m66Var6.Z(16388);
                            break;
                    }
                }
            });
        } else {
            so8Var17 = null;
        }
        if (F(currentAccount, 10)) {
            final byte b65 = 20;
            so8Var18 = new so8(812, k96.L0(2131746829), k96.L0(2131743990), R.drawable.msg_settings_premium, new Runnable() { // from class: no8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b522 = b65;
                    d dVar2 = dVar;
                    switch (b522) {
                        case 0:
                        case 1:
                            de9.o(0, dVar2);
                            break;
                        case 2:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 3:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 5:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 6:
                            dVar2.presentFragment(new StickersActivity(1, null));
                            break;
                        case 7:
                            dVar2.presentFragment(new hs(0));
                            break;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 9, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            break;
                        case 9:
                            dVar2.presentFragment(new hs(1));
                            break;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 11:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(3);
                            m66Var.Z(2);
                            break;
                        case 12:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 14:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 15:
                            dVar2.presentFragment(new y09());
                            break;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 6, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            break;
                        case 19:
                            jh8 jh8Var3 = new jh8(dVar2, 7, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            break;
                        case 20:
                            jh8 jh8Var4 = new jh8(dVar2, 10, false);
                            jh8Var4.F0();
                            dVar2.showDialog(jh8Var4);
                            break;
                        case 21:
                            jh8 jh8Var5 = new jh8(dVar2, 12, false);
                            jh8Var5.F0();
                            dVar2.showDialog(jh8Var5);
                            break;
                        case 22:
                            dVar2.presentFragment(new m66());
                            break;
                        case 23:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.Z(3);
                            break;
                        case 24:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.a0(3);
                            m66Var3.Z(1);
                            break;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 26:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(3);
                            m66Var4.Z(2);
                            break;
                        case 27:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.Z(28700);
                            break;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        default:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(28700);
                            m66Var6.Z(16388);
                            break;
                    }
                }
            });
        } else {
            so8Var18 = null;
        }
        if (F(currentAccount, 12)) {
            final byte b66 = 21;
            so8Var19 = new so8(813, k96.L0(2131746813), k96.L0(2131743990), R.drawable.msg_settings_premium, new Runnable() { // from class: no8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b522 = b66;
                    d dVar2 = dVar;
                    switch (b522) {
                        case 0:
                        case 1:
                            de9.o(0, dVar2);
                            break;
                        case 2:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 3:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 5:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 6:
                            dVar2.presentFragment(new StickersActivity(1, null));
                            break;
                        case 7:
                            dVar2.presentFragment(new hs(0));
                            break;
                        case 8:
                            jh8 jh8Var = new jh8(dVar2, 9, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            break;
                        case 9:
                            dVar2.presentFragment(new hs(1));
                            break;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 11:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(3);
                            m66Var.Z(2);
                            break;
                        case 12:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 14:
                            dVar2.presentFragment(new StickersActivity(5, null));
                            break;
                        case 15:
                            dVar2.presentFragment(new y09());
                            break;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            jh8 jh8Var2 = new jh8(dVar2, 6, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            break;
                        case 19:
                            jh8 jh8Var3 = new jh8(dVar2, 7, false);
                            jh8Var3.F0();
                            dVar2.showDialog(jh8Var3);
                            break;
                        case 20:
                            jh8 jh8Var4 = new jh8(dVar2, 10, false);
                            jh8Var4.F0();
                            dVar2.showDialog(jh8Var4);
                            break;
                        case 21:
                            jh8 jh8Var5 = new jh8(dVar2, 12, false);
                            jh8Var5.F0();
                            dVar2.showDialog(jh8Var5);
                            break;
                        case 22:
                            dVar2.presentFragment(new m66());
                            break;
                        case 23:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.Z(3);
                            break;
                        case 24:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.a0(3);
                            m66Var3.Z(1);
                            break;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 26:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(3);
                            m66Var4.Z(2);
                            break;
                        case 27:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.Z(28700);
                            break;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        default:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(28700);
                            m66Var6.Z(16388);
                            break;
                    }
                }
            });
        } else {
            so8Var19 = null;
        }
        final byte b67 = 22;
        so8 so8Var124 = new so8(900, k96.L0(2131746875), null, R.drawable.msg2_battery, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b522 = b67;
                d dVar2 = dVar;
                switch (b522) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var124.h = "tg://settings/power-saving";
        final byte b68 = 23;
        so8 so8Var125 = new so8(901, k96.L0(2131748658), k96.L0(2131746875), R.drawable.msg2_battery, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b522 = b68;
                d dVar2 = dVar;
                switch (b522) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var125.h = "tg://settings/power-saving/stickers";
        final byte b69 = 24;
        so8 so8Var126 = new so8(902, k96.L0(2131748670), null, k96.L0(2131746875), k96.L0(2131748658), R.drawable.msg2_battery, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b522 = b69;
                d dVar2 = dVar;
                switch (b522) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b70 = 26;
        so8 so8Var127 = new so8(903, k96.L0(2131748672), null, k96.L0(2131746875), k96.L0(2131748658), R.drawable.msg2_battery, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b522 = b70;
                d dVar2 = dVar;
                switch (b522) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b71 = 27;
        so8 so8Var128 = new so8(904, k96.L0(2131748663), k96.L0(2131746875), R.drawable.msg2_battery, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b522 = b71;
                d dVar2 = dVar;
                switch (b522) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        so8Var128.h = "tg://settings/power-saving/emoji";
        final byte b72 = 29;
        so8 so8Var129 = new so8(905, k96.L0(2131748670), null, k96.L0(2131746875), k96.L0(2131748663), R.drawable.msg2_battery, new Runnable() { // from class: no8
            @Override // java.lang.Runnable
            public final void run() {
                byte b522 = b72;
                d dVar2 = dVar;
                switch (b522) {
                    case 0:
                    case 1:
                        de9.o(0, dVar2);
                        break;
                    case 2:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 3:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 5:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 6:
                        dVar2.presentFragment(new StickersActivity(1, null));
                        break;
                    case 7:
                        dVar2.presentFragment(new hs(0));
                        break;
                    case 8:
                        jh8 jh8Var = new jh8(dVar2, 9, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new hs(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(3);
                        m66Var.Z(2);
                        break;
                    case 12:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 14:
                        dVar2.presentFragment(new StickersActivity(5, null));
                        break;
                    case 15:
                        dVar2.presentFragment(new y09());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        jh8 jh8Var2 = new jh8(dVar2, 6, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 19:
                        jh8 jh8Var3 = new jh8(dVar2, 7, false);
                        jh8Var3.F0();
                        dVar2.showDialog(jh8Var3);
                        break;
                    case 20:
                        jh8 jh8Var4 = new jh8(dVar2, 10, false);
                        jh8Var4.F0();
                        dVar2.showDialog(jh8Var4);
                        break;
                    case 21:
                        jh8 jh8Var5 = new jh8(dVar2, 12, false);
                        jh8Var5.F0();
                        dVar2.showDialog(jh8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m66());
                        break;
                    case 23:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.Z(3);
                        break;
                    case 24:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.a0(3);
                        m66Var3.Z(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(3);
                        m66Var4.Z(2);
                        break;
                    case 27:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.Z(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(28700);
                        m66Var6.Z(16388);
                        break;
                }
            }
        });
        final byte b73 = 0;
        so8 so8Var130 = new so8(906, k96.L0(2131748669), null, k96.L0(2131746875), k96.L0(2131748663), R.drawable.msg2_battery, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b73;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        final byte b74 = 1;
        so8 so8Var131 = new so8(907, k96.L0(2131748672), null, k96.L0(2131746875), k96.L0(2131748663), R.drawable.msg2_battery, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b74;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        final byte b75 = 2;
        so8 so8Var132 = new so8(908, k96.L0(2131748664), k96.L0(2131746875), R.drawable.msg2_battery, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b75;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var132.h = "tg://settings/power-saving/effects";
        final byte b76 = 3;
        so8 so8Var133 = new so8(909, k96.L0(2131748667), null, k96.L0(2131746875), k96.L0(2131748664), R.drawable.msg2_battery, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b76;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var133.h = "tg://settings/power-saving/background";
        final byte b77 = 4;
        so8 so8Var134 = new so8(910, k96.L0(2131748655), null, k96.L0(2131746875), k96.L0(2131748664), R.drawable.msg2_battery, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b77;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        final byte b78 = 5;
        so8 so8Var135 = new so8(911, k96.L0(2131748659), null, k96.L0(2131746875), k96.L0(2131748664), R.drawable.msg2_battery, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b78;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        if (gba.o() >= 1) {
            final byte b79 = 7;
            so8Var20 = new so8(kk7.w5, k96.L0(2131748666), null, k96.L0(2131746875), k96.L0(2131748664), R.drawable.msg2_battery, new Runnable() { // from class: oo8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b222 = b79;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b222) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            break;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            break;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            break;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            break;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            break;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            break;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            break;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            break;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            break;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            break;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            break;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            break;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            break;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            break;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            break;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                    }
                }
            });
        } else {
            so8Var20 = null;
        }
        final byte b80 = 8;
        so8 so8Var136 = new so8(912, k96.L0(2131748660), null, k96.L0(2131746875), k96.L0(2131748664), R.drawable.msg2_battery, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b80;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        final byte b81 = 9;
        so8 so8Var137 = new so8(913, k96.L0(2131748665), k96.L0(2131746875), R.drawable.msg2_battery, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b81;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var137.h = "tg://settings/power-saving/call-animations";
        final byte b82 = 11;
        so8 so8Var138 = new so8(kk7.q3, k96.L0(2131748668), k96.L0(2131746875), R.drawable.msg2_battery, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b82;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var138.h = "tg://settings/power-saving/videos";
        final byte b83 = 12;
        so8 so8Var139 = new so8(kk7.p3, k96.L0(2131748671), k96.L0(2131746875), R.drawable.msg2_battery, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b83;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var139.h = "tg://settings/power-saving/gifs";
        final byte b84 = 13;
        so8 so8Var140 = new so8(914, k96.L0(2131748654), k96.L0(2131746875), R.drawable.msg2_battery, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b84;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var140.h = "tg://settings/power-saving/transitions";
        final byte b85 = 14;
        so8 so8Var141 = new so8(400, k96.L0(2131748862), R.drawable.msg2_language, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b85;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var141.h = "tg://settings/language";
        final byte b86 = 15;
        so8 so8Var142 = new so8(405, k96.L0(2131745135), k96.L0(2131748862), R.drawable.msg2_language, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b86;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var142.h = "tg://settings/language/show-button";
        if (na7.q1(currentAccount).i4.r()) {
            final byte b87 = 16;
            so8 so8Var143 = new so8(406, k96.L0(2131751346), k96.L0(2131748862), R.drawable.msg2_language, new Runnable() { // from class: oo8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b222 = b87;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b222) {
                        case 0:
                            m66 m66Var = new m66();
                            dVar2.presentFragment(m66Var);
                            m66Var.a0(28700);
                            m66Var.Z(8200);
                            break;
                        case 1:
                            m66 m66Var2 = new m66();
                            dVar2.presentFragment(m66Var2);
                            m66Var2.a0(28700);
                            m66Var2.Z(4112);
                            break;
                        case 2:
                            m66 m66Var3 = new m66();
                            dVar2.presentFragment(m66Var3);
                            m66Var3.Z(360928);
                            break;
                        case 3:
                            m66 m66Var4 = new m66();
                            dVar2.presentFragment(m66Var4);
                            m66Var4.a0(360928);
                            m66Var4.Z(32);
                            break;
                        case 4:
                            m66 m66Var5 = new m66();
                            dVar2.presentFragment(m66Var5);
                            m66Var5.a0(360928);
                            m66Var5.Z(64);
                            break;
                        case 5:
                            m66 m66Var6 = new m66();
                            dVar2.presentFragment(m66Var6);
                            m66Var6.a0(360928);
                            m66Var6.Z(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m66 m66Var7 = new m66();
                            dVar2.presentFragment(m66Var7);
                            m66Var7.a0(360928);
                            m66Var7.Z(256);
                            break;
                        case 8:
                            m66 m66Var8 = new m66();
                            dVar2.presentFragment(m66Var8);
                            m66Var8.a0(360928);
                            m66Var8.Z(32768);
                            break;
                        case 9:
                            m66 m66Var9 = new m66();
                            dVar2.presentFragment(m66Var9);
                            m66Var9.Z(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m66 m66Var10 = new m66();
                            dVar2.presentFragment(m66Var10);
                            m66Var10.Z(1024);
                            break;
                        case 12:
                            m66 m66Var11 = new m66();
                            dVar2.presentFragment(m66Var11);
                            m66Var11.Z(2048);
                            break;
                        case 13:
                            m66 m66Var12 = new m66();
                            dVar2.presentFragment(m66Var12);
                            while (true) {
                                ArrayList arrayList = m66Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g66) arrayList.get(i)).f) {
                                    m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        case 14:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 15:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            dVar2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 17:
                            jh8 jh8Var = new jh8(dVar2, 0, false);
                            jh8Var.F0();
                            dVar2.showDialog(jh8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ij.R(dVar2, null));
                            break;
                        case 19:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                            break;
                        case 20:
                            d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                            break;
                        case 21:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 23:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 24:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 25:
                            dVar2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 26:
                            dVar2.presentFragment(PasscodeActivity.m0());
                            break;
                        case 27:
                            jh8 jh8Var2 = new jh8(dVar2, 11, false);
                            jh8Var2.F0();
                            dVar2.showDialog(jh8Var2);
                            break;
                        case 28:
                            dVar2.presentFragment(new u8(3));
                            break;
                        default:
                            dVar2.presentFragment(new PrivacySettingsActivity());
                            break;
                    }
                }
            });
            so8Var143.h = "tg://settings/language/do-not-translate";
            so8Var41 = so8Var143;
        }
        final byte b88 = 18;
        so8 so8Var144 = new so8(402, k96.L0(2131753983), k96.L0(2131745287), R.drawable.msg2_help, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b88;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var144.h = "tg://settings/ask-question";
        final byte b89 = 19;
        so8 so8Var145 = new so8(403, k96.L0(2131744001), k96.L0(2131745287), R.drawable.msg2_help, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b89;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var145.h = "tg://settings/faq";
        final byte b90 = 20;
        so8 so8Var146 = new so8(404, k96.L0(2131746592), k96.L0(2131745287), R.drawable.msg2_help, new Runnable() { // from class: oo8
            @Override // java.lang.Runnable
            public final void run() {
                byte b222 = b90;
                int i = 0;
                d dVar2 = dVar;
                switch (b222) {
                    case 0:
                        m66 m66Var = new m66();
                        dVar2.presentFragment(m66Var);
                        m66Var.a0(28700);
                        m66Var.Z(8200);
                        break;
                    case 1:
                        m66 m66Var2 = new m66();
                        dVar2.presentFragment(m66Var2);
                        m66Var2.a0(28700);
                        m66Var2.Z(4112);
                        break;
                    case 2:
                        m66 m66Var3 = new m66();
                        dVar2.presentFragment(m66Var3);
                        m66Var3.Z(360928);
                        break;
                    case 3:
                        m66 m66Var4 = new m66();
                        dVar2.presentFragment(m66Var4);
                        m66Var4.a0(360928);
                        m66Var4.Z(32);
                        break;
                    case 4:
                        m66 m66Var5 = new m66();
                        dVar2.presentFragment(m66Var5);
                        m66Var5.a0(360928);
                        m66Var5.Z(64);
                        break;
                    case 5:
                        m66 m66Var6 = new m66();
                        dVar2.presentFragment(m66Var6);
                        m66Var6.a0(360928);
                        m66Var6.Z(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m66 m66Var7 = new m66();
                        dVar2.presentFragment(m66Var7);
                        m66Var7.a0(360928);
                        m66Var7.Z(256);
                        break;
                    case 8:
                        m66 m66Var8 = new m66();
                        dVar2.presentFragment(m66Var8);
                        m66Var8.a0(360928);
                        m66Var8.Z(32768);
                        break;
                    case 9:
                        m66 m66Var9 = new m66();
                        dVar2.presentFragment(m66Var9);
                        m66Var9.Z(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m66 m66Var10 = new m66();
                        dVar2.presentFragment(m66Var10);
                        m66Var10.Z(1024);
                        break;
                    case 12:
                        m66 m66Var11 = new m66();
                        dVar2.presentFragment(m66Var11);
                        m66Var11.Z(2048);
                        break;
                    case 13:
                        m66 m66Var12 = new m66();
                        dVar2.presentFragment(m66Var12);
                        while (true) {
                            ArrayList arrayList = m66Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g66) arrayList.get(i)).f) {
                                m66Var12.b.f1(new jh(m66Var12, i, (byte) 11), 700, true);
                                break;
                            } else {
                                i++;
                            }
                        }
                    case 14:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 15:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        dVar2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 17:
                        jh8 jh8Var = new jh8(dVar2, 0, false);
                        jh8Var.F0();
                        dVar2.showDialog(jh8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ij.R(dVar2, null));
                        break;
                    case 19:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131743999, null));
                        break;
                    case 20:
                        d01.t(dVar2.getParentActivity(), k96.M0(2131746590, null));
                        break;
                    case 21:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 23:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 24:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 25:
                        dVar2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 26:
                        dVar2.presentFragment(PasscodeActivity.m0());
                        break;
                    case 27:
                        jh8 jh8Var2 = new jh8(dVar2, 11, false);
                        jh8Var2.F0();
                        dVar2.showDialog(jh8Var2);
                        break;
                    case 28:
                        dVar2.presentFragment(new u8(3));
                        break;
                    default:
                        dVar2.presentFragment(new PrivacySettingsActivity());
                        break;
                }
            }
        });
        so8Var146.h = "tg://settings/privacy-policy";
        return new so8[]{so8Var21, so8Var22, so8Var23, so8Var24, so8Var25, so8Var26, so8Var27, so8Var28, so8Var29, so8Var30, so8Var31, so8Var32, so8Var33, so8Var34, so8Var35, so8Var36, so8Var37, so8Var, so8Var39, so8Var40, so8Var2, so8Var42, so8Var43, so8Var44, so8Var45, so8Var46, so8Var47, so8Var48, so8Var49, so8Var50, so8Var3, so8Var4, so8Var52, so8Var53, so8Var54, so8Var55, so8Var56, so8Var57, so8Var58, so8Var59, so8Var60, so8Var61, so8Var62, so8Var63, so8Var64, so8Var65, so8Var66, so8Var67, so8Var68, so8Var69, so8Var70, so8Var71, so8Var72, so8Var73, so8Var74, so8Var75, so8Var76, so8Var77, so8Var78, so8Var79, so8Var80, so8Var81, so8Var82, so8Var83, so8Var84, so8Var85, so8Var86, so8Var87, so8Var88, so8Var89, so8Var90, so8Var91, so8Var92, so8Var93, so8Var94, so8Var95, so8Var96, so8Var97, so8Var98, so8Var99, so8Var100, so8Var101, so8Var102, so8Var103, so8Var104, so8Var105, so8Var106, so8Var107, so8Var108, so8Var109, so8Var110, so8Var6, so8Var112, so8Var7, so8Var114, so8Var8, so8Var116, so8Var117, so8Var118, so8Var119, so8Var5, so8Var9, so8Var10, so8Var11, so8Var12, so8Var13, so8Var14, so8Var121, so8Var122, so8Var123, so8Var15, so8Var16, so8Var17, so8Var18, so8Var19, so8Var124, so8Var125, so8Var126, so8Var127, so8Var128, so8Var129, so8Var130, so8Var131, so8Var132, so8Var133, so8Var134, so8Var135, so8Var20, so8Var136, so8Var137, so8Var138, so8Var139, so8Var140, so8Var141, so8Var142, so8Var41, so8Var144, so8Var145, so8Var146};
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 0;
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
            tb4.v(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 instanceof so8) {
                ((so8) obj2).g = i;
            } else if (obj2 instanceof aa7) {
                ((aa7) obj2).d = i;
            }
            linkedHashSet.add(obj2.toString());
        }
        na7.c1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i = this.f;
        TLRPC.WebPage webPage = na7.q1(i).j2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(na7.q1(i).i2);
        }
        if (this.F != null || this.G) {
            return;
        }
        this.G = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = k96.M0(2131743999, null);
        tL_messages_getWebPage.hash = 0;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getWebPage, new n35(this, (byte) 21));
    }

    public final void I(String str) {
        this.E = str;
        if (this.y != null) {
            Utilities.g.a(this.y);
            this.y = null;
        }
        if (!TextUtils.isEmpty(str)) {
            co3 co3Var = Utilities.g;
            ll8 ll8Var = new ll8(this, str, (byte) 14);
            this.y = ll8Var;
            co3Var.d(ll8Var, 300L);
            return;
        }
        this.x = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        d dVar = this.e;
        if (dVar instanceof ProfileActivity) {
            try {
                ((ProfileActivity) dVar).P.b.getImageReceiver().w0(false);
                ((ProfileActivity) this.e).P.d.setText(k96.M0(2131745285, null));
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        f();
    }

    public final void J() {
        String[] strArr;
        so8 so8Var;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            so8[] so8VarArr = this.c;
            if (i >= so8VarArr.length) {
                break;
            }
            so8 so8Var2 = so8VarArr[i];
            if (so8Var2 != null) {
                hashMap.put(Integer.valueOf(so8Var2.f), this.c[i]);
            }
            i++;
        }
        Set<String> stringSet = na7.c1().getStringSet("settingsSearchRecent2", null);
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
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                strArr[i2] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        aa7 aa7Var = new aa7(readString, strArr, serializedData.readString(false));
                        aa7Var.d = readInt32;
                        arrayList.add(aa7Var);
                    } else if (readInt322 == 1 && (so8Var = (so8) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        so8Var.g = readInt32;
                        arrayList.add(so8Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new fx7(this, (byte) 6));
    }

    @Override // w39
    public final int b() {
        int size;
        int size2;
        int i = 0;
        if (this.x) {
            size = this.r.size();
            if (!this.s.isEmpty()) {
                size2 = this.s.size();
                i = size2 + 1;
            }
        } else {
            ArrayList arrayList = this.w;
            size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
            ArrayList arrayList2 = this.d;
            if (!arrayList2.isEmpty()) {
                size2 = arrayList2.size();
                i = size2 + 1;
            }
        }
        return size + i;
    }

    @Override // w39
    public final int d(int i) {
        if (!this.x) {
            ArrayList arrayList = this.w;
            if (i == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i != arrayList.size() + 1) {
                return 0;
            }
        } else if (i < this.r.size() || i != this.r.size()) {
            return 0;
        }
        return 1;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ((l35) view).setText(k96.M0(2131745290, null));
                return;
            } else {
                if (i2 == 2) {
                    ((ld5) view).setText(k96.M0(2131745277, null));
                    return;
                }
                return;
            }
        }
        o8a o8aVar = (o8a) view;
        if (this.x) {
            int size = this.r.size();
            ArrayList arrayList = this.r;
            if (i >= size) {
                int k = ir2.k(1, i, arrayList);
                o8aVar.a((CharSequence) this.n.get(this.r.size() + k), ((aa7) this.s.get(k)).b, true, k < this.r.size() - 1);
                return;
            } else {
                so8 so8Var = (so8) arrayList.get(i);
                so8 so8Var2 = i > 0 ? (so8) this.r.get(i - 1) : null;
                o8aVar.b((CharSequence) this.n.get(i), so8Var.d, (so8Var2 == null || so8Var2.e != so8Var.e) ? so8Var.e : 0, i < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList2 = this.w;
        if (!arrayList2.isEmpty()) {
            i--;
        }
        if (i >= arrayList2.size()) {
            int k2 = ir2.k(1, i, arrayList2);
            aa7 aa7Var = (aa7) this.d.get(k2);
            o8aVar.a(aa7Var.a, aa7Var.b, true, k2 < arrayList2.size() - 1);
            return;
        }
        Object obj = arrayList2.get(i);
        if (obj instanceof so8) {
            so8 so8Var3 = (so8) obj;
            o8aVar.a(so8Var3.a, so8Var3.d, false, i < arrayList2.size() - 1);
        } else if (obj instanceof aa7) {
            aa7 aa7Var2 = (aa7) obj;
            o8aVar.a(aa7Var2.a, aa7Var2.b, true, i < arrayList2.size() - 1);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = this.h;
        View ld5Var = i != 0 ? i != 1 ? new ld5(context, 16) : new l35(context, null) : new o8a(context);
        ld5Var.setLayoutParams(new e49(-1, -2));
        return new y29(ld5Var);
    }
}
