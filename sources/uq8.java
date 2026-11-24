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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class uq8 extends q59 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public tq8[] c;
    public final d e;
    public final int f;
    public final Context h;
    public boolean x;
    public mn8 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public uq8(d dVar, Context context) {
        this.e = dVar;
        this.f = dVar.getCurrentAccount();
        this.h = context;
        this.c = H(dVar);
        J();
    }

    public static boolean F(int i, int i2) {
        if (!oc7.r1(i).H3() || z8c.h(i).p()) {
            return i2 == -1 || oc7.r1(i).E0.get(i2, -1) != -1;
        }
        return false;
    }

    public static tq8[] H(final d dVar) {
        tq8 tq8Var;
        tq8 tq8Var2;
        tq8 tq8Var3;
        tq8 tq8Var4;
        tq8 tq8Var5;
        tq8 tq8Var6;
        tq8 tq8Var7;
        tq8 tq8Var8;
        tq8 tq8Var9;
        tq8 tq8Var10;
        tq8 tq8Var11;
        tq8 tq8Var12;
        tq8 tq8Var13;
        tq8 tq8Var14;
        tq8 tq8Var15;
        tq8 tq8Var16;
        tq8 tq8Var17;
        tq8 tq8Var18;
        tq8 tq8Var19;
        tq8 tq8Var20;
        final int currentAccount = dVar.getCurrentAccount();
        byte b = 15;
        tq8 tq8Var21 = new tq8(500, jb6.L0(2131751201), 0, new mn8(dVar, dVar.getResourceProvider(), b));
        final byte b2 = 28;
        tq8 tq8Var22 = new tq8(501, jb6.L0(2131752490), 0, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                int i = 0;
                d dVar2 = dVar;
                switch (b3) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var22.h = "tg://settings/edit/change-number";
        final byte b3 = 10;
        tq8 tq8Var23 = new tq8(502, jb6.L0(2131754465), 0, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b4 = b3;
                int i = 0;
                d dVar2 = dVar;
                switch (b4) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var23.h = "tg://settings/edit/add-account";
        final byte b4 = 21;
        tq8 tq8Var24 = new tq8(1, jb6.L0(2131747655), R.drawable.msg_notifications, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b4;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var24.h = "tg://settings/notifications";
        tq8 tq8Var25 = new tq8(2, jb6.L0(2131747611), jb6.L0(2131747655), R.drawable.msg_notifications, new sq8(dVar, (byte) 3));
        tq8Var25.h = "tg://settings/notifications/private-chats";
        tq8 tq8Var26 = new tq8(3, jb6.L0(2131747640), jb6.L0(2131747655), R.drawable.msg_notifications, new sq8(dVar, b));
        tq8Var26.h = "tg://settings/notifications/groups";
        tq8 tq8Var27 = new tq8(4, jb6.L0(2131747654), jb6.L0(2131747655), R.drawable.msg_notifications, new ww1(dVar, (byte) 11));
        tq8Var27.h = "tg://settings/notifications/channels";
        tq8 tq8Var28 = new tq8(5, jb6.L0(2131742963), "callsSectionRow", jb6.L0(2131747655), R.drawable.msg_notifications, new ww1(dVar, (byte) 23));
        final byte b5 = 5;
        tq8 tq8Var29 = new tq8(6, jb6.L0(2131753698), "badgeNumberSection", jb6.L0(2131747655), R.drawable.msg_notifications, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b6 = b5;
                d dVar2 = dVar;
                switch (b6) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b6 = 17;
        tq8 tq8Var30 = new tq8(7, jb6.L0(2131748976), "inappSectionRow", jb6.L0(2131747655), R.drawable.msg_notifications, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b6;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8 tq8Var31 = new tq8(8, jb6.L0(2131751727), "contactJoinedRow", jb6.L0(2131747655), R.drawable.msg_notifications, new ww1(dVar, (byte) 27));
        tq8Var31.h = "tg://settings/notifications/new-contacts";
        final byte b7 = 28;
        tq8 tq8Var32 = new tq8(9, jb6.L0(2131746961), "pinnedMessageRow", jb6.L0(2131747655), R.drawable.msg_notifications, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b7;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var32.h = "tg://settings/notifications/pinned-messages";
        tq8 tq8Var33 = new tq8(10, jb6.L0(2131745845), "resetNotificationsRow", jb6.L0(2131747655), R.drawable.msg_notifications, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b3;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var33.h = "tg://settings/notifications/reset";
        tq8 tq8Var34 = new tq8(11, jb6.L0(2131747609), "notificationsServiceRow", jb6.L0(2131747655), R.drawable.msg_notifications, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b4;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        final byte b8 = 22;
        tq8 tq8Var35 = new tq8(12, jb6.L0(2131747608), "notificationsServiceConnectionRow", jb6.L0(2131747655), R.drawable.msg_notifications, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b8;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        final byte b9 = 23;
        tq8 tq8Var36 = new tq8(13, jb6.L0(2131746008), "repeatRow", jb6.L0(2131747655), R.drawable.msg_notifications, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b9;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        final byte b10 = 24;
        tq8 tq8Var37 = new tq8(100, jb6.L0(2131746506), R.drawable.msg_secret, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b10;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var37.h = "tg://settings/privacy";
        final byte b11 = 25;
        tq8 tq8Var38 = new tq8(nm7.t1, jb6.L0(2131743625), jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b11;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var38.h = "tg://settings/privacy/2sv";
        final byte b12 = 0;
        tq8 tq8Var39 = new tq8(nm7.H1, jb6.L0(2131753815), jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: qq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b13 = b12;
                d dVar2 = dVar;
                int i = currentAccount;
                switch (b13) {
                    case 0:
                        if (z8c.h(i).q0 >= 0) {
                            dVar2.presentFragment(new v70());
                            break;
                        }
                        break;
                    default:
                        if (!z8c.h(i).p()) {
                            c41 b0 = c41.b0(dVar2);
                            b0.getClass();
                            b31 b31Var = new b31(b0.X(), null);
                            byte b14 = 0;
                            b31Var.d(R.raw.voip_muted, new String[0]);
                            String M0 = jb6.M0(2131746490, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new z31(b0, b14), indexOf, lastIndexOf - 1, 33);
                            }
                            b31Var.b.setText(spannableStringBuilder);
                            b31Var.b.setSingleLine(false);
                            b31Var.b.setMaxLines(2);
                            b0.b(b31Var, 2750).j();
                            break;
                        } else {
                            dVar2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        tq8Var39.h = "tg://settings/privacy/auto-delete";
        final byte b13 = 26;
        tq8 tq8Var40 = new tq8(nm7.s1, jb6.L0(2131747390), jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b13;
                int i = 0;
                d dVar2 = dVar;
                switch (b32) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var40.h = "tg://settings/privacy/passcode";
        tq8 tq8Var41 = null;
        if (gda.i1) {
            tq8Var = tq8Var38;
            final byte b14 = 29;
            tq8Var2 = new tq8(nm7.I1, jb6.L0(2131751139), "emailLoginRow", jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: pq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b32 = b14;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b32) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            break;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            break;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            break;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            break;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            break;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            break;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            break;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            break;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            break;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            break;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            break;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            break;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var2.h = "tg://settings/privacy/login-email";
        } else {
            tq8Var = tq8Var38;
            tq8Var2 = null;
        }
        final byte b15 = 0;
        tq8 tq8Var42 = new tq8(101, jb6.L0(2131753646), jb6.L0(2131746506), R.drawable.msg_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b15;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var42.h = "tg://settings/privacy/blocked";
        final byte b16 = 1;
        tq8 tq8Var43 = new tq8(nm7.u1, jb6.L0(2131745285), R.drawable.msg2_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b16;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var43.h = "tg://settings/devices";
        final byte b17 = 2;
        tq8 tq8Var44 = new tq8(nm7.p1, jb6.L0(2131746525), jb6.L0(2131746506), R.drawable.msg_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b17;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var44.h = "tg://settings/privacy/phone-number/";
        final byte b18 = 3;
        tq8 tq8Var45 = new tq8(nm7.m1, jb6.L0(2131746550), jb6.L0(2131746506), R.drawable.msg_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b18;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var45.h = "tg://settings/privacy/last-seen";
        final byte b19 = 4;
        tq8 tq8Var46 = new tq8(nm7.n1, jb6.L0(2131746512), jb6.L0(2131746506), R.drawable.msg_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b19;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var46.h = "tg://settings/privacy/profile-photos";
        final byte b20 = 5;
        tq8 tq8Var47 = new tq8(nm7.o1, jb6.L0(2131746572), jb6.L0(2131746506), R.drawable.msg_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b20;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var47.h = "tg://settings/privacy/forwards";
        final byte b21 = 6;
        tq8 tq8Var48 = new tq8(nm7.F1, jb6.L0(2131746535), jb6.L0(2131746506), R.drawable.msg_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b21;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var48.h = "tg://settings/privacy/calls/p2p";
        final byte b22 = 7;
        tq8 tq8Var49 = new tq8(nm7.q1, jb6.L0(2131752549), jb6.L0(2131746506), R.drawable.msg_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b22;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var49.h = "tg://settings/privacy/calls";
        final byte b23 = 9;
        tq8 tq8Var50 = new tq8(nm7.r1, jb6.L0(2131746552), jb6.L0(2131746506), R.drawable.msg_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b23;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var50.h = "tg://settings/privacy/invites";
        final byte b24 = 1;
        tq8 tq8Var51 = new tq8(nm7.G1, jb6.L0(2131746493), jb6.L0(2131746506), R.drawable.msg_secret, new Runnable() { // from class: qq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b132 = b24;
                d dVar2 = dVar;
                int i = currentAccount;
                switch (b132) {
                    case 0:
                        if (z8c.h(i).q0 >= 0) {
                            dVar2.presentFragment(new v70());
                            break;
                        }
                        break;
                    default:
                        if (!z8c.h(i).p()) {
                            c41 b0 = c41.b0(dVar2);
                            b0.getClass();
                            b31 b31Var = new b31(b0.X(), null);
                            byte b142 = 0;
                            b31Var.d(R.raw.voip_muted, new String[0]);
                            String M0 = jb6.M0(2131746490, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new z31(b0, b142), indexOf, lastIndexOf - 1, 33);
                            }
                            b31Var.b.setText(spannableStringBuilder);
                            b31Var.b.setSingleLine(false);
                            b31Var.b.setMaxLines(2);
                            b0.b(b31Var, 2750).j();
                            break;
                        } else {
                            dVar2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        tq8Var51.h = "tg://settings/privacy/voice";
        if (oc7.r1(currentAccount).l4.L0.f()) {
            tq8Var3 = tq8Var51;
            final byte b25 = 11;
            tq8Var4 = new tq8(121, jb6.L0(2131754136), "newChatsRow", jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: rq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b42 = b25;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b42) {
                        case 0:
                            km8 km8Var = new km8();
                            km8Var.getMessagesController().E0(true);
                            dVar2.presentFragment(km8Var);
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
                            kj8 kj8Var = new kj8(dVar2, 1, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
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
                            kj8 kj8Var2 = new kj8(dVar2, 2, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
                            dVar2.presentFragment(new y71());
                            return;
                        case 28:
                            dVar2.presentFragment(new y71());
                            return;
                        default:
                            kj8 kj8Var3 = new kj8(dVar2, 8, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                    }
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                        } else if (z8c.h(i).o()) {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mh6(i));
                    }
                }
            });
            tq8Var4.h = "tg://settings/privacy/archive-and-mute";
        } else {
            tq8Var3 = tq8Var51;
            tq8Var4 = null;
        }
        final byte b26 = 12;
        tq8 tq8Var52 = new tq8(nm7.w1, jb6.L0(2131751533), "deleteAccountRow", jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b26;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var52.h = "tg://settings/privacy/self-destruct";
        final byte b27 = 13;
        tq8 tq8Var53 = new tq8(nm7.x1, jb6.L0(2131746532), "paymentsClearRow", jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b27;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var53.h = "tg://settings/privacy/data-settings/clear-payment-info";
        final byte b28 = 14;
        tq8 tq8Var54 = new tq8(nm7.y1, jb6.L0(2131742574), jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b28;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var54.h = "tg://settings/privacy/active-websites";
        final byte b29 = 15;
        tq8 tq8Var55 = new tq8(nm7.z1, jb6.L0(2131743981), "contactsDeleteRow", jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b29;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var55.h = "tg://settings/privacy/data-settings/delete-synced";
        final byte b30 = 16;
        tq8 tq8Var56 = new tq8(nm7.A1, jb6.L0(2131743983), "contactsSyncRow", jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b30;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var56.h = "tg://settings/privacy/data-settings/sync-contacts";
        final byte b31 = 17;
        tq8 tq8Var57 = new tq8(nm7.B1, jb6.L0(2131744097), "contactsSuggestRow", jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b31;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var57.h = "tg://settings/privacy/data-settings/suggest-contacts";
        final byte b32 = 19;
        tq8 tq8Var58 = new tq8(nm7.C1, jb6.L0(2131748446), "secretMapRow", jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b32;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var58.h = "tg://settings/privacy/data-settings/map-provider";
        final byte b33 = 20;
        tq8 tq8Var59 = new tq8(nm7.D1, jb6.L0(2131745418), "secretWebpageRow", jb6.L0(2131746506), R.drawable.msg2_secret, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b33;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var59.h = "tg://settings/privacy/data-settings/link-previews";
        final byte b34 = 22;
        tq8 tq8Var60 = new tq8(nm7.E1, jb6.L0(2131751392), R.drawable.msg2_devices, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b34;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var60.h = "tg://settings/devices";
        final byte b35 = 23;
        tq8 tq8Var61 = new tq8(121, jb6.L0(2131743893), "terminateAllSessionsRow", jb6.L0(2131751392), R.drawable.msg2_devices, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b35;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var61.h = "tg://settings/devices/terminate-sessions";
        final byte b36 = 24;
        tq8 tq8Var62 = new tq8(nm7.F1, jb6.L0(2131748674), jb6.L0(2131751392), R.drawable.msg2_devices, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b36;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var62.h = "tg://settings/devices/link-desktop";
        final byte b37 = 25;
        tq8 tq8Var63 = new tq8(nm7.d3, jb6.L0(2131751614), R.drawable.msg2_data, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b37;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var63.h = "tg://settings/privacy/data-settings";
        final byte b38 = 26;
        tq8 tq8Var64 = new tq8(nm7.e3, jb6.L0(2131751613), "usageSectionRow", jb6.L0(2131751614), R.drawable.msg2_data, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b38;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        final byte b39 = 27;
        tq8 tq8Var65 = new tq8(nm7.f3, jb6.L0(2131744505), jb6.L0(2131751614), R.drawable.msg2_data, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b39;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8Var65.h = "tg://settings/data/storage";
        final byte b40 = 28;
        tq8 tq8Var66 = new tq8(203, jb6.L0(2131748817), "keepMediaRow", jb6.L0(2131751614), jb6.L0(2131744505), R.drawable.msg2_data, new Runnable() { // from class: rq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b42 = b40;
                int i = 0;
                d dVar2 = dVar;
                switch (b42) {
                    case 0:
                        km8 km8Var = new km8();
                        km8Var.getMessagesController().E0(true);
                        dVar2.presentFragment(km8Var);
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
                        kj8 kj8Var = new kj8(dVar2, 1, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
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
                        kj8 kj8Var2 = new kj8(dVar2, 2, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
                        dVar2.presentFragment(new y71());
                        return;
                    case 28:
                        dVar2.presentFragment(new y71());
                        return;
                    default:
                        kj8 kj8Var3 = new kj8(dVar2, 8, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        return;
                }
                while (true) {
                    if (i >= 4) {
                        i = -1;
                    } else if (z8c.h(i).o()) {
                        i++;
                    }
                }
                if (i >= 0) {
                    dVar2.presentFragment(new mh6(i));
                }
            }
        });
        tq8 tq8Var67 = new tq8(nm7.h3, jb6.L0(2131752012), "cacheRow", jb6.L0(2131751614), jb6.L0(2131744505), R.drawable.msg2_data, new sq8(dVar, (byte) 0));
        tq8 tq8Var68 = new tq8(nm7.i3, jb6.L0(2131748531), "databaseRow", jb6.L0(2131751614), jb6.L0(2131744505), R.drawable.msg2_data, new sq8(dVar, (byte) 1));
        tq8 tq8Var69 = new tq8(nm7.j3, jb6.L0(2131748055), jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 2));
        tq8Var69.h = "tg://settings/data/usage";
        tq8 tq8Var70 = new tq8(nm7.k3, jb6.L0(2131753732), "mediaDownloadSectionRow", jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 4));
        tq8 tq8Var71 = new tq8(nm7.l3, jb6.L0(2131742547), jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 5));
        tq8 tq8Var72 = new tq8(nm7.m3, jb6.L0(2131742549), jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 6));
        tq8 tq8Var73 = new tq8(nm7.n3, jb6.L0(2131742548), jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 7));
        tq8 tq8Var74 = new tq8(211, jb6.L0(2131745844), "resetDownloadRow", jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 8));
        tq8Var74.h = "tg://settings/data/auto-download/reset";
        tq8 tq8Var75 = new tq8(nm7.r3, jb6.L0(2131744123), "streamSectionRow", jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 9));
        tq8 tq8Var76 = new tq8(nm7.s3, jb6.L0(2131751081), "enableStreamRow", jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 11));
        tq8 tq8Var77 = new tq8(nm7.t3, jb6.L0(2131752549), "callsSectionRow", jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 12));
        tq8 tq8Var78 = new tq8(nm7.u3, jb6.L0(2131742913), "useLessDataForCallsRow", jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 13));
        tq8Var78.h = "tg://settings/data/use-less-data";
        tq8 tq8Var79 = new tq8(nm7.v3, jb6.L0(2131742942), "quickRepliesRow", jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 14));
        tq8 tq8Var80 = new tq8(nm7.w3, jb6.L0(2131746334), jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 16));
        tq8Var80.h = "tg://settings/data/proxy";
        tq8 tq8Var81 = new tq8(nm7.v1, jb6.L0(2131746576), "clearDraftsRow", jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 17));
        tq8Var81.h = "tg://settings/privacy/data-settings/delete-cloud-drafts";
        tq8 tq8Var82 = new tq8(nm7.y3, jb6.L0(2131745663), "saveToGallerySectionRow", jb6.L0(2131751614), R.drawable.msg2_data, new sq8(dVar, (byte) 18));
        tq8 tq8Var83 = new tq8(nm7.z3, jb6.L0(2131745653), "saveToGalleryPeerRow", jb6.L0(2131751614), jb6.L0(2131745663), R.drawable.msg2_data, new sq8(dVar, (byte) 19));
        tq8Var83.h = "tg://settings/data/save-to-photos/chats";
        tq8 tq8Var84 = new tq8(nm7.A3, jb6.L0(2131745660), "saveToGalleryGroupsRow", jb6.L0(2131751614), jb6.L0(2131745663), R.drawable.msg2_data, new sq8(dVar, (byte) 20));
        tq8Var84.h = "tg://settings/data/save-to-photos/groups";
        tq8 tq8Var85 = new tq8(nm7.B3, jb6.L0(2131745662), "saveToGalleryChannelsRow", jb6.L0(2131751614), jb6.L0(2131745663), R.drawable.msg2_data, new ww1(dVar, (byte) 6));
        tq8Var85.h = "tg://settings/data/save-to-photos/channels";
        tq8 tq8Var86 = new tq8(nm7.W4, jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 7));
        tq8Var86.h = "tg://settings/appearance/themes";
        tq8 tq8Var87 = new tq8(nm7.X4, jb6.L0(2131743876), "textSizeHeaderRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 8));
        tq8Var87.h = "tg://settings/appearance/text-size";
        tq8 tq8Var88 = new tq8(nm7.Y4, jb6.L0(2131752503), jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 9));
        tq8Var88.h = "tg://settings/appearance/wallpapers";
        tq8 tq8Var89 = new tq8(nm7.Z4, jb6.L0(2131745272), null, jb6.L0(2131752147), jb6.L0(2131752181), R.drawable.msg2_discussion, new ww1(dVar, (byte) 10));
        tq8 tq8Var90 = new tq8(nm7.a5, jb6.L0(2131745841), "resetRow", jb6.L0(2131752147), jb6.L0(2131752181), R.drawable.msg2_discussion, new ww1(dVar, (byte) 12));
        tq8 tq8Var91 = new tq8(nm7.c5, jb6.L0(2131751948), "themeHeaderRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 13));
        tq8 tq8Var92 = new tq8(nm7.p5, jb6.L0(2131752831), null, jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 14));
        tq8 tq8Var93 = new tq8(nm7.q5, jb6.L0(2131751649), "createNewThemeRow", jb6.L0(2131752147), jb6.L0(2131752831), R.drawable.msg2_discussion, new ww1(dVar, (byte) 15));
        tq8Var93.h = "tg://settings/appearance/themes/create";
        tq8 tq8Var94 = new tq8(nm7.r5, jb6.L0(2131752793), "bubbleRadiusHeaderRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 17));
        tq8Var94.h = "tg://settings/appearance/message-corners";
        tq8 tq8Var95 = new tq8(nm7.s5, jb6.L0(2131752162), "chatListHeaderRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 18));
        tq8 tq8Var96 = new tq8(nm7.t5, jb6.L0(2131752159), "swipeGestureHeaderRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 19));
        tq8 tq8Var97 = new tq8(nm7.u5, jb6.L0(2131754205), "appIconHeaderRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 20));
        tq8Var97.h = "tg://settings/appearance/app-icon";
        tq8 tq8Var98 = new tq8(nm7.b5, jb6.L0(2131753749), jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 21));
        tq8 tq8Var99 = new tq8(nm7.y5, jb6.L0(2131747983), "nextMediaTapRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 22));
        tq8Var99.h = "tg://settings/appearance/tap-for-next-media";
        tq8 tq8Var100 = new tq8(nm7.x5, jb6.L0(2131746160), "raiseToListenRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 24));
        tq8Var100.h = "tg://settings/data/raise-to-listen";
        tq8 tq8Var101 = new tq8(nm7.g5, jb6.L0(2131746158), "raiseToSpeakRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 25));
        tq8Var101.h = "tg://settings/data/raise-to-speak";
        tq8 tq8Var102 = new tq8(nm7.w5, jb6.L0(2131747165), "pauseOnMediaRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 26));
        tq8Var102.h = "tg://settings/data/pause-music";
        tq8 tq8Var103 = new tq8(nm7.v5, jb6.L0(2131748196), "bluetoothScoRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 28));
        tq8 tq8Var104 = new tq8(nm7.e5, jb6.L0(2131751375), "directShareRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new ww1(dVar, (byte) 29));
        final byte b41 = 0;
        tq8 tq8Var105 = new tq8(nm7.h5, jb6.L0(2131745366), "sendByEnterRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b41;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b42 = 1;
        tq8 tq8Var106 = new tq8(nm7.o5, jb6.L0(2131751304), "distanceRow", jb6.L0(2131752147), R.drawable.msg2_discussion, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b42;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b43 = 2;
        tq8 tq8Var107 = new tq8(600, jb6.L0(2131744546), R.drawable.msg2_sticker, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b43;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var107.h = "tg://settings/appearance/stickers-and-emoji";
        final byte b44 = 3;
        tq8 tq8Var108 = new tq8(601, jb6.L0(2131744087), "suggestRow", jb6.L0(2131744546), R.drawable.msg2_sticker, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b44;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b45 = 4;
        tq8 tq8Var109 = new tq8(602, jb6.L0(2131750770), "featuredStickersHeaderRow", jb6.L0(2131744546), R.drawable.msg2_sticker, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b45;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b46 = 6;
        tq8 tq8Var110 = new tq8(603, jb6.L0(2131748436), null, jb6.L0(2131744546), R.drawable.msg2_sticker, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b46;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b47 = 7;
        tq8 tq8Var111 = new tq8(604, jb6.L0(2131754093), null, jb6.L0(2131744546), R.drawable.msg2_sticker, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b47;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var111.h = "tg://settings/appearance/stickers-and-emoji/archived";
        final byte b48 = 9;
        tq8 tq8Var112 = new tq8(605, jb6.L0(2131754098), null, jb6.L0(2131744546), R.drawable.msg2_sticker, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b48;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b49 = 10;
        tq8 tq8Var113 = new tq8(606, jb6.L0(2131748791), "largeEmojiRow", jb6.L0(2131744546), R.drawable.msg2_sticker, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b49;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var113.h = "tg://settings/appearance/stickers-and-emoji/emoji/large";
        final byte b50 = 11;
        tq8 tq8Var114 = new tq8(607, jb6.L0(2131748479), null, jb6.L0(2131746801), jb6.L0(2131748607), R.drawable.msg2_battery, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b50;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b51 = 12;
        tq8 tq8Var115 = new tq8(608, jb6.L0(2131751133), null, jb6.L0(2131744546), R.drawable.input_smile, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b51;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var115.h = "tg://settings/appearance/stickers-and-emoji/emoji";
        final byte b52 = 13;
        tq8 tq8Var116 = new tq8(609, jb6.L0(2131744101), "suggestAnimatedEmojiRow", jb6.L0(2131744546), jb6.L0(2131751133), R.drawable.input_smile, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b52;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var116.h = "tg://settings/appearance/stickers-and-emoji/emoji/suggest";
        final byte b53 = 14;
        tq8 tq8Var117 = new tq8(610, jb6.L0(2131750772), "featuredStickersHeaderRow", jb6.L0(2131744546), jb6.L0(2131751133), R.drawable.input_smile, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b53;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b54 = 15;
        tq8 tq8Var118 = new tq8(611, jb6.L0(2131751287), null, jb6.L0(2131744546), R.drawable.msg2_sticker, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b54;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var118.h = "tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction";
        final byte b55 = 16;
        tq8 tq8Var119 = new tq8(700, jb6.L0(2131750628), null, R.drawable.msg2_folder, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b55;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var119.h = "tg://settings/folders";
        final byte b56 = 25;
        tq8 tq8Var120 = new tq8(701, jb6.L0(2131751653), "createFilterRow", jb6.L0(2131750628), R.drawable.msg2_folder, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b62 = b56;
                d dVar2 = dVar;
                switch (b62) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var120.h = "tg://settings/folders/create";
        if (F(currentAccount, -1)) {
            tq8Var5 = tq8Var120;
            tq8Var6 = tq8Var111;
            tq8Var7 = tq8Var113;
            final byte b57 = 6;
            tq8Var8 = tq8Var115;
            tq8Var9 = new tq8(800, jb6.L0(2131743916), R.drawable.msg_settings_premium, new Runnable() { // from class: pq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b322 = b57;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b322) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            break;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            break;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            break;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            break;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            break;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            break;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            break;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            break;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            break;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            break;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            break;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            break;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var5 = tq8Var120;
            tq8Var6 = tq8Var111;
            tq8Var7 = tq8Var113;
            tq8Var8 = tq8Var115;
            tq8Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final byte b58 = 17;
            tq8Var10 = new tq8(801, jb6.L0(2131746733), jb6.L0(2131743916), R.drawable.msg_settings_premium, new Runnable() { // from class: pq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b322 = b58;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b322) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            break;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            break;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            break;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            break;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            break;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            break;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            break;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            break;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            break;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            break;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            break;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            break;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final byte b59 = 27;
            tq8Var11 = new tq8(802, jb6.L0(2131746742), jb6.L0(2131743916), R.drawable.msg_settings_premium, new Runnable() { // from class: pq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b322 = b59;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b322) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            break;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            break;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            break;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            break;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            break;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            break;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            break;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            break;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            break;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            break;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            break;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            break;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final byte b60 = 8;
            tq8Var12 = new tq8(803, jb6.L0(2131746699), jb6.L0(2131743916), R.drawable.msg_settings_premium, new Runnable() { // from class: rq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b422 = b60;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b422) {
                        case 0:
                            km8 km8Var = new km8();
                            km8Var.getMessagesController().E0(true);
                            dVar2.presentFragment(km8Var);
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
                            kj8 kj8Var = new kj8(dVar2, 1, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
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
                            kj8 kj8Var2 = new kj8(dVar2, 2, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
                            dVar2.presentFragment(new y71());
                            return;
                        case 28:
                            dVar2.presentFragment(new y71());
                            return;
                        default:
                            kj8 kj8Var3 = new kj8(dVar2, 8, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                    }
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                        } else if (z8c.h(i).o()) {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mh6(i));
                    }
                }
            });
        } else {
            tq8Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final byte b61 = 18;
            tq8Var13 = new tq8(804, jb6.L0(2131746747), jb6.L0(2131743916), R.drawable.msg_settings_premium, new Runnable() { // from class: rq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b422 = b61;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b422) {
                        case 0:
                            km8 km8Var = new km8();
                            km8Var.getMessagesController().E0(true);
                            dVar2.presentFragment(km8Var);
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
                            kj8 kj8Var = new kj8(dVar2, 1, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
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
                            kj8 kj8Var2 = new kj8(dVar2, 2, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
                            dVar2.presentFragment(new y71());
                            return;
                        case 28:
                            dVar2.presentFragment(new y71());
                            return;
                        default:
                            kj8 kj8Var3 = new kj8(dVar2, 8, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                    }
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                        } else if (z8c.h(i).o()) {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mh6(i));
                    }
                }
            });
        } else {
            tq8Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final byte b62 = 29;
            tq8Var14 = new tq8(805, jb6.L0(2131746697), jb6.L0(2131743916), R.drawable.msg_settings_premium, new Runnable() { // from class: rq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b422 = b62;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b422) {
                        case 0:
                            km8 km8Var = new km8();
                            km8Var.getMessagesController().E0(true);
                            dVar2.presentFragment(km8Var);
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
                            kj8 kj8Var = new kj8(dVar2, 1, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
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
                            kj8 kj8Var2 = new kj8(dVar2, 2, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
                            dVar2.presentFragment(new y71());
                            return;
                        case 28:
                            dVar2.presentFragment(new y71());
                            return;
                        default:
                            kj8 kj8Var3 = new kj8(dVar2, 8, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            return;
                    }
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                        } else if (z8c.h(i).o()) {
                            i++;
                        }
                    }
                    if (i >= 0) {
                        dVar2.presentFragment(new mh6(i));
                    }
                }
            });
        } else {
            tq8Var14 = null;
        }
        tq8 tq8Var121 = F(currentAccount, 3) ? new tq8(806, jb6.L0(2131746727), jb6.L0(2131743916), R.drawable.msg_settings_premium, new sq8(dVar, (byte) 10)) : null;
        tq8 tq8Var122 = F(currentAccount, 4) ? new tq8(807, jb6.L0(2131746718), jb6.L0(2131743916), R.drawable.msg_settings_premium, new sq8(dVar, (byte) 21)) : null;
        tq8 tq8Var123 = F(currentAccount, 5) ? new tq8(808, jb6.L0(2131746711), jb6.L0(2131743916), R.drawable.msg_settings_premium, new ww1(dVar, (byte) 16)) : null;
        if (F(currentAccount, 9)) {
            final byte b63 = 8;
            tq8Var15 = new tq8(809, jb6.L0(2131746760), jb6.L0(2131743916), R.drawable.msg_settings_premium, new Runnable() { // from class: oq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b622 = b63;
                    d dVar2 = dVar;
                    switch (b622) {
                        case 0:
                        case 1:
                            hg9.n(0, dVar2);
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
                            dVar2.presentFragment(new ht(0));
                            break;
                        case 8:
                            kj8 kj8Var = new kj8(dVar2, 9, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            break;
                        case 9:
                            dVar2.presentFragment(new ht(1));
                            break;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 11:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(3);
                            m86Var.a0(2);
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
                            dVar2.presentFragment(new a39());
                            break;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            kj8 kj8Var2 = new kj8(dVar2, 6, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
                            break;
                        case 19:
                            kj8 kj8Var3 = new kj8(dVar2, 7, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            break;
                        case 20:
                            kj8 kj8Var4 = new kj8(dVar2, 10, false);
                            kj8Var4.F0();
                            dVar2.showDialog(kj8Var4);
                            break;
                        case 21:
                            kj8 kj8Var5 = new kj8(dVar2, 12, false);
                            kj8Var5.F0();
                            dVar2.showDialog(kj8Var5);
                            break;
                        case 22:
                            dVar2.presentFragment(new m86());
                            break;
                        case 23:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.a0(3);
                            break;
                        case 24:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.b0(3);
                            m86Var3.a0(1);
                            break;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 26:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(3);
                            m86Var4.a0(2);
                            break;
                        case 27:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.a0(28700);
                            break;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        default:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(28700);
                            m86Var6.a0(16388);
                            break;
                    }
                }
            });
        } else {
            tq8Var15 = null;
        }
        if (F(currentAccount, 6)) {
            final byte b64 = 18;
            tq8Var16 = new tq8(810, jb6.L0(2131746722), jb6.L0(2131743916), R.drawable.msg_settings_premium, new Runnable() { // from class: oq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b622 = b64;
                    d dVar2 = dVar;
                    switch (b622) {
                        case 0:
                        case 1:
                            hg9.n(0, dVar2);
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
                            dVar2.presentFragment(new ht(0));
                            break;
                        case 8:
                            kj8 kj8Var = new kj8(dVar2, 9, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            break;
                        case 9:
                            dVar2.presentFragment(new ht(1));
                            break;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 11:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(3);
                            m86Var.a0(2);
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
                            dVar2.presentFragment(new a39());
                            break;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            kj8 kj8Var2 = new kj8(dVar2, 6, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
                            break;
                        case 19:
                            kj8 kj8Var3 = new kj8(dVar2, 7, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            break;
                        case 20:
                            kj8 kj8Var4 = new kj8(dVar2, 10, false);
                            kj8Var4.F0();
                            dVar2.showDialog(kj8Var4);
                            break;
                        case 21:
                            kj8 kj8Var5 = new kj8(dVar2, 12, false);
                            kj8Var5.F0();
                            dVar2.showDialog(kj8Var5);
                            break;
                        case 22:
                            dVar2.presentFragment(new m86());
                            break;
                        case 23:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.a0(3);
                            break;
                        case 24:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.b0(3);
                            m86Var3.a0(1);
                            break;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 26:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(3);
                            m86Var4.a0(2);
                            break;
                        case 27:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.a0(28700);
                            break;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        default:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(28700);
                            m86Var6.a0(16388);
                            break;
                    }
                }
            });
        } else {
            tq8Var16 = null;
        }
        if (F(currentAccount, 7)) {
            final byte b65 = 19;
            tq8Var17 = new tq8(811, jb6.L0(2131746757), jb6.L0(2131743916), R.drawable.msg_settings_premium, new Runnable() { // from class: oq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b622 = b65;
                    d dVar2 = dVar;
                    switch (b622) {
                        case 0:
                        case 1:
                            hg9.n(0, dVar2);
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
                            dVar2.presentFragment(new ht(0));
                            break;
                        case 8:
                            kj8 kj8Var = new kj8(dVar2, 9, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            break;
                        case 9:
                            dVar2.presentFragment(new ht(1));
                            break;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 11:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(3);
                            m86Var.a0(2);
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
                            dVar2.presentFragment(new a39());
                            break;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            kj8 kj8Var2 = new kj8(dVar2, 6, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
                            break;
                        case 19:
                            kj8 kj8Var3 = new kj8(dVar2, 7, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            break;
                        case 20:
                            kj8 kj8Var4 = new kj8(dVar2, 10, false);
                            kj8Var4.F0();
                            dVar2.showDialog(kj8Var4);
                            break;
                        case 21:
                            kj8 kj8Var5 = new kj8(dVar2, 12, false);
                            kj8Var5.F0();
                            dVar2.showDialog(kj8Var5);
                            break;
                        case 22:
                            dVar2.presentFragment(new m86());
                            break;
                        case 23:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.a0(3);
                            break;
                        case 24:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.b0(3);
                            m86Var3.a0(1);
                            break;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 26:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(3);
                            m86Var4.a0(2);
                            break;
                        case 27:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.a0(28700);
                            break;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        default:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(28700);
                            m86Var6.a0(16388);
                            break;
                    }
                }
            });
        } else {
            tq8Var17 = null;
        }
        if (F(currentAccount, 10)) {
            final byte b66 = 20;
            tq8Var18 = new tq8(812, jb6.L0(2131746755), jb6.L0(2131743916), R.drawable.msg_settings_premium, new Runnable() { // from class: oq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b622 = b66;
                    d dVar2 = dVar;
                    switch (b622) {
                        case 0:
                        case 1:
                            hg9.n(0, dVar2);
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
                            dVar2.presentFragment(new ht(0));
                            break;
                        case 8:
                            kj8 kj8Var = new kj8(dVar2, 9, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            break;
                        case 9:
                            dVar2.presentFragment(new ht(1));
                            break;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 11:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(3);
                            m86Var.a0(2);
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
                            dVar2.presentFragment(new a39());
                            break;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            kj8 kj8Var2 = new kj8(dVar2, 6, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
                            break;
                        case 19:
                            kj8 kj8Var3 = new kj8(dVar2, 7, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            break;
                        case 20:
                            kj8 kj8Var4 = new kj8(dVar2, 10, false);
                            kj8Var4.F0();
                            dVar2.showDialog(kj8Var4);
                            break;
                        case 21:
                            kj8 kj8Var5 = new kj8(dVar2, 12, false);
                            kj8Var5.F0();
                            dVar2.showDialog(kj8Var5);
                            break;
                        case 22:
                            dVar2.presentFragment(new m86());
                            break;
                        case 23:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.a0(3);
                            break;
                        case 24:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.b0(3);
                            m86Var3.a0(1);
                            break;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 26:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(3);
                            m86Var4.a0(2);
                            break;
                        case 27:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.a0(28700);
                            break;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        default:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(28700);
                            m86Var6.a0(16388);
                            break;
                    }
                }
            });
        } else {
            tq8Var18 = null;
        }
        if (F(currentAccount, 12)) {
            final byte b67 = 21;
            tq8Var19 = new tq8(813, jb6.L0(2131746739), jb6.L0(2131743916), R.drawable.msg_settings_premium, new Runnable() { // from class: oq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b622 = b67;
                    d dVar2 = dVar;
                    switch (b622) {
                        case 0:
                        case 1:
                            hg9.n(0, dVar2);
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
                            dVar2.presentFragment(new ht(0));
                            break;
                        case 8:
                            kj8 kj8Var = new kj8(dVar2, 9, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            break;
                        case 9:
                            dVar2.presentFragment(new ht(1));
                            break;
                        case 10:
                            dVar2.presentFragment(new StickersActivity(0, null));
                            break;
                        case 11:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(3);
                            m86Var.a0(2);
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
                            dVar2.presentFragment(new a39());
                            break;
                        case 16:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 17:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            kj8 kj8Var2 = new kj8(dVar2, 6, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
                            break;
                        case 19:
                            kj8 kj8Var3 = new kj8(dVar2, 7, false);
                            kj8Var3.F0();
                            dVar2.showDialog(kj8Var3);
                            break;
                        case 20:
                            kj8 kj8Var4 = new kj8(dVar2, 10, false);
                            kj8Var4.F0();
                            dVar2.showDialog(kj8Var4);
                            break;
                        case 21:
                            kj8 kj8Var5 = new kj8(dVar2, 12, false);
                            kj8Var5.F0();
                            dVar2.showDialog(kj8Var5);
                            break;
                        case 22:
                            dVar2.presentFragment(new m86());
                            break;
                        case 23:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.a0(3);
                            break;
                        case 24:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.b0(3);
                            m86Var3.a0(1);
                            break;
                        case 25:
                            dVar2.presentFragment(new FiltersSetupActivity());
                            break;
                        case 26:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(3);
                            m86Var4.a0(2);
                            break;
                        case 27:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.a0(28700);
                            break;
                        case 28:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        default:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(28700);
                            m86Var6.a0(16388);
                            break;
                    }
                }
            });
        } else {
            tq8Var19 = null;
        }
        final byte b68 = 22;
        tq8 tq8Var124 = new tq8(900, jb6.L0(2131746801), null, R.drawable.msg2_battery, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b622 = b68;
                d dVar2 = dVar;
                switch (b622) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var124.h = "tg://settings/power-saving";
        final byte b69 = 23;
        tq8 tq8Var125 = new tq8(901, jb6.L0(2131748607), jb6.L0(2131746801), R.drawable.msg2_battery, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b622 = b69;
                d dVar2 = dVar;
                switch (b622) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var125.h = "tg://settings/power-saving/stickers";
        final byte b70 = 24;
        tq8 tq8Var126 = new tq8(902, jb6.L0(2131748619), null, jb6.L0(2131746801), jb6.L0(2131748607), R.drawable.msg2_battery, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b622 = b70;
                d dVar2 = dVar;
                switch (b622) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b71 = 26;
        tq8 tq8Var127 = new tq8(903, jb6.L0(2131748621), null, jb6.L0(2131746801), jb6.L0(2131748607), R.drawable.msg2_battery, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b622 = b71;
                d dVar2 = dVar;
                switch (b622) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b72 = 27;
        tq8 tq8Var128 = new tq8(904, jb6.L0(2131748612), jb6.L0(2131746801), R.drawable.msg2_battery, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b622 = b72;
                d dVar2 = dVar;
                switch (b622) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        tq8Var128.h = "tg://settings/power-saving/emoji";
        final byte b73 = 29;
        tq8 tq8Var129 = new tq8(905, jb6.L0(2131748619), null, jb6.L0(2131746801), jb6.L0(2131748612), R.drawable.msg2_battery, new Runnable() { // from class: oq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b622 = b73;
                d dVar2 = dVar;
                switch (b622) {
                    case 0:
                    case 1:
                        hg9.n(0, dVar2);
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
                        dVar2.presentFragment(new ht(0));
                        break;
                    case 8:
                        kj8 kj8Var = new kj8(dVar2, 9, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 9:
                        dVar2.presentFragment(new ht(1));
                        break;
                    case 10:
                        dVar2.presentFragment(new StickersActivity(0, null));
                        break;
                    case 11:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(3);
                        m86Var.a0(2);
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
                        dVar2.presentFragment(new a39());
                        break;
                    case 16:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 17:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        kj8 kj8Var2 = new kj8(dVar2, 6, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
                        break;
                    case 19:
                        kj8 kj8Var3 = new kj8(dVar2, 7, false);
                        kj8Var3.F0();
                        dVar2.showDialog(kj8Var3);
                        break;
                    case 20:
                        kj8 kj8Var4 = new kj8(dVar2, 10, false);
                        kj8Var4.F0();
                        dVar2.showDialog(kj8Var4);
                        break;
                    case 21:
                        kj8 kj8Var5 = new kj8(dVar2, 12, false);
                        kj8Var5.F0();
                        dVar2.showDialog(kj8Var5);
                        break;
                    case 22:
                        dVar2.presentFragment(new m86());
                        break;
                    case 23:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.a0(3);
                        break;
                    case 24:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.b0(3);
                        m86Var3.a0(1);
                        break;
                    case 25:
                        dVar2.presentFragment(new FiltersSetupActivity());
                        break;
                    case 26:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(3);
                        m86Var4.a0(2);
                        break;
                    case 27:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.a0(28700);
                        break;
                    case 28:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    default:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(28700);
                        m86Var6.a0(16388);
                        break;
                }
            }
        });
        final byte b74 = 0;
        tq8 tq8Var130 = new tq8(906, jb6.L0(2131748618), null, jb6.L0(2131746801), jb6.L0(2131748612), R.drawable.msg2_battery, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b74;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        final byte b75 = 1;
        tq8 tq8Var131 = new tq8(907, jb6.L0(2131748621), null, jb6.L0(2131746801), jb6.L0(2131748612), R.drawable.msg2_battery, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b75;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        final byte b76 = 2;
        tq8 tq8Var132 = new tq8(908, jb6.L0(2131748613), jb6.L0(2131746801), R.drawable.msg2_battery, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b76;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var132.h = "tg://settings/power-saving/effects";
        final byte b77 = 3;
        tq8 tq8Var133 = new tq8(909, jb6.L0(2131748616), null, jb6.L0(2131746801), jb6.L0(2131748613), R.drawable.msg2_battery, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b77;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var133.h = "tg://settings/power-saving/background";
        final byte b78 = 4;
        tq8 tq8Var134 = new tq8(910, jb6.L0(2131748604), null, jb6.L0(2131746801), jb6.L0(2131748613), R.drawable.msg2_battery, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b78;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        final byte b79 = 5;
        tq8 tq8Var135 = new tq8(911, jb6.L0(2131748608), null, jb6.L0(2131746801), jb6.L0(2131748613), R.drawable.msg2_battery, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b79;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        if (gda.o() >= 1) {
            final byte b80 = 7;
            tq8Var20 = new tq8(nm7.w5, jb6.L0(2131748615), null, jb6.L0(2131746801), jb6.L0(2131748613), R.drawable.msg2_battery, new Runnable() { // from class: pq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b322 = b80;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b322) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            break;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            break;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            break;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            break;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            break;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            break;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            break;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            break;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            break;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            break;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            break;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            break;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var20 = null;
        }
        final byte b81 = 8;
        tq8 tq8Var136 = new tq8(912, jb6.L0(2131748609), null, jb6.L0(2131746801), jb6.L0(2131748613), R.drawable.msg2_battery, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b81;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        final byte b82 = 9;
        tq8 tq8Var137 = new tq8(913, jb6.L0(2131748614), jb6.L0(2131746801), R.drawable.msg2_battery, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b82;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var137.h = "tg://settings/power-saving/call-animations";
        final byte b83 = 11;
        tq8 tq8Var138 = new tq8(nm7.q3, jb6.L0(2131748617), jb6.L0(2131746801), R.drawable.msg2_battery, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b83;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var138.h = "tg://settings/power-saving/videos";
        final byte b84 = 12;
        tq8 tq8Var139 = new tq8(nm7.p3, jb6.L0(2131748620), jb6.L0(2131746801), R.drawable.msg2_battery, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b84;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var139.h = "tg://settings/power-saving/gifs";
        final byte b85 = 13;
        tq8 tq8Var140 = new tq8(914, jb6.L0(2131748603), jb6.L0(2131746801), R.drawable.msg2_battery, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b85;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var140.h = "tg://settings/power-saving/transitions";
        final byte b86 = 14;
        tq8 tq8Var141 = new tq8(400, jb6.L0(2131748811), R.drawable.msg2_language, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b86;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var141.h = "tg://settings/language";
        final byte b87 = 15;
        tq8 tq8Var142 = new tq8(405, jb6.L0(2131745061), jb6.L0(2131748811), R.drawable.msg2_language, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b87;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var142.h = "tg://settings/language/show-button";
        if (oc7.r1(currentAccount).i4.r()) {
            final byte b88 = 16;
            tq8 tq8Var143 = new tq8(406, jb6.L0(2131751295), jb6.L0(2131748811), R.drawable.msg2_language, new Runnable() { // from class: pq8
                @Override // java.lang.Runnable
                public final void run() {
                    byte b322 = b88;
                    int i = 0;
                    d dVar2 = dVar;
                    switch (b322) {
                        case 0:
                            m86 m86Var = new m86();
                            dVar2.presentFragment(m86Var);
                            m86Var.b0(28700);
                            m86Var.a0(8200);
                            break;
                        case 1:
                            m86 m86Var2 = new m86();
                            dVar2.presentFragment(m86Var2);
                            m86Var2.b0(28700);
                            m86Var2.a0(4112);
                            break;
                        case 2:
                            m86 m86Var3 = new m86();
                            dVar2.presentFragment(m86Var3);
                            m86Var3.a0(360928);
                            break;
                        case 3:
                            m86 m86Var4 = new m86();
                            dVar2.presentFragment(m86Var4);
                            m86Var4.b0(360928);
                            m86Var4.a0(32);
                            break;
                        case 4:
                            m86 m86Var5 = new m86();
                            dVar2.presentFragment(m86Var5);
                            m86Var5.b0(360928);
                            m86Var5.a0(64);
                            break;
                        case 5:
                            m86 m86Var6 = new m86();
                            dVar2.presentFragment(m86Var6);
                            m86Var6.b0(360928);
                            m86Var6.a0(128);
                            break;
                        case 6:
                            dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 7:
                            m86 m86Var7 = new m86();
                            dVar2.presentFragment(m86Var7);
                            m86Var7.b0(360928);
                            m86Var7.a0(256);
                            break;
                        case 8:
                            m86 m86Var8 = new m86();
                            dVar2.presentFragment(m86Var8);
                            m86Var8.b0(360928);
                            m86Var8.a0(32768);
                            break;
                        case 9:
                            m86 m86Var9 = new m86();
                            dVar2.presentFragment(m86Var9);
                            m86Var9.a0(512);
                            break;
                        case 10:
                            dVar2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 11:
                            m86 m86Var10 = new m86();
                            dVar2.presentFragment(m86Var10);
                            m86Var10.a0(1024);
                            break;
                        case 12:
                            m86 m86Var11 = new m86();
                            dVar2.presentFragment(m86Var11);
                            m86Var11.a0(2048);
                            break;
                        case 13:
                            m86 m86Var12 = new m86();
                            dVar2.presentFragment(m86Var12);
                            while (true) {
                                ArrayList arrayList = m86Var12.s;
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (((g86) arrayList.get(i)).f) {
                                    m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                            kj8 kj8Var = new kj8(dVar2, 0, false);
                            kj8Var.F0();
                            dVar2.showDialog(kj8Var);
                            break;
                        case 18:
                            dVar2.showDialog(ik.R(dVar2, null));
                            break;
                        case 19:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                            break;
                        case 20:
                            l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                            dVar2.presentFragment(PasscodeActivity.n0());
                            break;
                        case 27:
                            kj8 kj8Var2 = new kj8(dVar2, 11, false);
                            kj8Var2.F0();
                            dVar2.showDialog(kj8Var2);
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
            tq8Var143.h = "tg://settings/language/do-not-translate";
            tq8Var41 = tq8Var143;
        }
        final byte b89 = 18;
        tq8 tq8Var144 = new tq8(402, jb6.L0(2131753951), jb6.L0(2131745213), R.drawable.msg2_help, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b89;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var144.h = "tg://settings/ask-question";
        final byte b90 = 19;
        tq8 tq8Var145 = new tq8(403, jb6.L0(2131743927), jb6.L0(2131745213), R.drawable.msg2_help, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b90;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var145.h = "tg://settings/faq";
        final byte b91 = 20;
        tq8 tq8Var146 = new tq8(404, jb6.L0(2131746518), jb6.L0(2131745213), R.drawable.msg2_help, new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                byte b322 = b91;
                int i = 0;
                d dVar2 = dVar;
                switch (b322) {
                    case 0:
                        m86 m86Var = new m86();
                        dVar2.presentFragment(m86Var);
                        m86Var.b0(28700);
                        m86Var.a0(8200);
                        break;
                    case 1:
                        m86 m86Var2 = new m86();
                        dVar2.presentFragment(m86Var2);
                        m86Var2.b0(28700);
                        m86Var2.a0(4112);
                        break;
                    case 2:
                        m86 m86Var3 = new m86();
                        dVar2.presentFragment(m86Var3);
                        m86Var3.a0(360928);
                        break;
                    case 3:
                        m86 m86Var4 = new m86();
                        dVar2.presentFragment(m86Var4);
                        m86Var4.b0(360928);
                        m86Var4.a0(32);
                        break;
                    case 4:
                        m86 m86Var5 = new m86();
                        dVar2.presentFragment(m86Var5);
                        m86Var5.b0(360928);
                        m86Var5.a0(64);
                        break;
                    case 5:
                        m86 m86Var6 = new m86();
                        dVar2.presentFragment(m86Var6);
                        m86Var6.b0(360928);
                        m86Var6.a0(128);
                        break;
                    case 6:
                        dVar2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 7:
                        m86 m86Var7 = new m86();
                        dVar2.presentFragment(m86Var7);
                        m86Var7.b0(360928);
                        m86Var7.a0(256);
                        break;
                    case 8:
                        m86 m86Var8 = new m86();
                        dVar2.presentFragment(m86Var8);
                        m86Var8.b0(360928);
                        m86Var8.a0(32768);
                        break;
                    case 9:
                        m86 m86Var9 = new m86();
                        dVar2.presentFragment(m86Var9);
                        m86Var9.a0(512);
                        break;
                    case 10:
                        dVar2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 11:
                        m86 m86Var10 = new m86();
                        dVar2.presentFragment(m86Var10);
                        m86Var10.a0(1024);
                        break;
                    case 12:
                        m86 m86Var11 = new m86();
                        dVar2.presentFragment(m86Var11);
                        m86Var11.a0(2048);
                        break;
                    case 13:
                        m86 m86Var12 = new m86();
                        dVar2.presentFragment(m86Var12);
                        while (true) {
                            ArrayList arrayList = m86Var12.s;
                            if (i >= arrayList.size()) {
                                break;
                            } else if (((g86) arrayList.get(i)).f) {
                                m86Var12.b.f1(new ji(m86Var12, i, (byte) 11), 700, true);
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
                        kj8 kj8Var = new kj8(dVar2, 0, false);
                        kj8Var.F0();
                        dVar2.showDialog(kj8Var);
                        break;
                    case 18:
                        dVar2.showDialog(ik.R(dVar2, null));
                        break;
                    case 19:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131743925, null));
                        break;
                    case 20:
                        l11.u(dVar2.getParentActivity(), jb6.M0(2131746516, null));
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
                        dVar2.presentFragment(PasscodeActivity.n0());
                        break;
                    case 27:
                        kj8 kj8Var2 = new kj8(dVar2, 11, false);
                        kj8Var2.F0();
                        dVar2.showDialog(kj8Var2);
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
        tq8Var146.h = "tg://settings/privacy-policy";
        return new tq8[]{tq8Var21, tq8Var22, tq8Var23, tq8Var24, tq8Var25, tq8Var26, tq8Var27, tq8Var28, tq8Var29, tq8Var30, tq8Var31, tq8Var32, tq8Var33, tq8Var34, tq8Var35, tq8Var36, tq8Var37, tq8Var, tq8Var39, tq8Var40, tq8Var2, tq8Var42, tq8Var43, tq8Var44, tq8Var45, tq8Var46, tq8Var47, tq8Var48, tq8Var49, tq8Var50, tq8Var3, tq8Var4, tq8Var52, tq8Var53, tq8Var54, tq8Var55, tq8Var56, tq8Var57, tq8Var58, tq8Var59, tq8Var60, tq8Var61, tq8Var62, tq8Var63, tq8Var64, tq8Var65, tq8Var66, tq8Var67, tq8Var68, tq8Var69, tq8Var70, tq8Var71, tq8Var72, tq8Var73, tq8Var74, tq8Var75, tq8Var76, tq8Var77, tq8Var78, tq8Var79, tq8Var80, tq8Var81, tq8Var82, tq8Var83, tq8Var84, tq8Var85, tq8Var86, tq8Var87, tq8Var88, tq8Var89, tq8Var90, tq8Var91, tq8Var92, tq8Var93, tq8Var94, tq8Var95, tq8Var96, tq8Var97, tq8Var98, tq8Var99, tq8Var100, tq8Var101, tq8Var102, tq8Var103, tq8Var104, tq8Var105, tq8Var106, tq8Var107, tq8Var108, tq8Var109, tq8Var110, tq8Var6, tq8Var112, tq8Var7, tq8Var114, tq8Var8, tq8Var116, tq8Var117, tq8Var118, tq8Var119, tq8Var5, tq8Var9, tq8Var10, tq8Var11, tq8Var12, tq8Var13, tq8Var14, tq8Var121, tq8Var122, tq8Var123, tq8Var15, tq8Var16, tq8Var17, tq8Var18, tq8Var19, tq8Var124, tq8Var125, tq8Var126, tq8Var127, tq8Var128, tq8Var129, tq8Var130, tq8Var131, tq8Var132, tq8Var133, tq8Var134, tq8Var135, tq8Var20, tq8Var136, tq8Var137, tq8Var138, tq8Var139, tq8Var140, tq8Var141, tq8Var142, tq8Var41, tq8Var144, tq8Var145, tq8Var146};
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 0;
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
            td4.w(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 instanceof tq8) {
                ((tq8) obj2).g = i;
            } else if (obj2 instanceof bc7) {
                ((bc7) obj2).d = i;
            }
            linkedHashSet.add(obj2.toString());
        }
        oc7.d1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i = this.f;
        TLRPC.WebPage webPage = oc7.r1(i).j2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(oc7.r1(i).i2);
        }
        if (this.F != null || this.G) {
            return;
        }
        this.G = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = jb6.M0(2131743925, null);
        tL_messages_getWebPage.hash = 0;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getWebPage, new r15(this, (byte) 22));
    }

    public final void I(String str) {
        this.E = str;
        if (this.y != null) {
            Utilities.g.a(this.y);
            this.y = null;
        }
        if (!TextUtils.isEmpty(str)) {
            mp3 mp3Var = Utilities.g;
            mn8 mn8Var = new mn8(this, str, (byte) 16);
            this.y = mn8Var;
            mp3Var.d(mn8Var, 300L);
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
                ((ProfileActivity) this.e).P.d.setText(jb6.M0(2131745211, null));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        f();
    }

    public final void J() {
        String[] strArr;
        tq8 tq8Var;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            tq8[] tq8VarArr = this.c;
            if (i >= tq8VarArr.length) {
                break;
            }
            tq8 tq8Var2 = tq8VarArr[i];
            if (tq8Var2 != null) {
                hashMap.put(Integer.valueOf(tq8Var2.f), this.c[i]);
            }
            i++;
        }
        Set<String> stringSet = oc7.d1().getStringSet("settingsSearchRecent2", null);
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
                        bc7 bc7Var = new bc7(readString, strArr, serializedData.readString(false));
                        bc7Var.d = readInt32;
                        arrayList.add(bc7Var);
                    } else if (readInt322 == 1 && (tq8Var = (tq8) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        tq8Var.g = readInt32;
                        arrayList.add(tq8Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new qx7(this, (byte) 7));
    }

    @Override // y59
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

    @Override // y59
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

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ((l55) view).setText(jb6.M0(2131745216, null));
                return;
            } else {
                if (i2 == 2) {
                    ((jf5) view).setText(jb6.M0(2131745203, null));
                    return;
                }
                return;
            }
        }
        oaa oaaVar = (oaa) view;
        if (this.x) {
            int size = this.r.size();
            ArrayList arrayList = this.r;
            if (i >= size) {
                int k = ts2.k(1, i, arrayList);
                oaaVar.a((CharSequence) this.n.get(this.r.size() + k), ((bc7) this.s.get(k)).b, true, k < this.r.size() - 1);
                return;
            } else {
                tq8 tq8Var = (tq8) arrayList.get(i);
                tq8 tq8Var2 = i > 0 ? (tq8) this.r.get(i - 1) : null;
                oaaVar.b((CharSequence) this.n.get(i), tq8Var.d, (tq8Var2 == null || tq8Var2.e != tq8Var.e) ? tq8Var.e : 0, i < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList2 = this.w;
        if (!arrayList2.isEmpty()) {
            i--;
        }
        if (i >= arrayList2.size()) {
            int k2 = ts2.k(1, i, arrayList2);
            bc7 bc7Var = (bc7) this.d.get(k2);
            oaaVar.a(bc7Var.a, bc7Var.b, true, k2 < arrayList2.size() - 1);
            return;
        }
        Object obj = arrayList2.get(i);
        if (obj instanceof tq8) {
            tq8 tq8Var3 = (tq8) obj;
            oaaVar.a(tq8Var3.a, tq8Var3.d, false, i < arrayList2.size() - 1);
        } else if (obj instanceof bc7) {
            bc7 bc7Var2 = (bc7) obj;
            oaaVar.a(bc7Var2.a, bc7Var2.b, true, i < arrayList2.size() - 1);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        Context context = this.h;
        View jf5Var = i != 0 ? i != 1 ? new jf5(context, 16) : new l55(context, null) : new oaa(context);
        jf5Var.setLayoutParams(new g69(-1, -2));
        return new b59(jf5Var);
    }
}
