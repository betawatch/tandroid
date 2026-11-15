package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class si extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ an b;

    public si(an anVar, Context context) {
        this.b = anVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        int i12;
        int i13;
        long j3;
        int i14;
        int i15;
        long j10;
        int i16;
        int i17;
        TLRPC.User user2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.v01 v01Var;
        an anVar = this.b;
        SparseArray[] sparseArrayArr = anVar.p6;
        SparseArray[] sparseArrayArr2 = anVar.o6;
        SparseArray[] sparseArrayArr3 = anVar.n6;
        if (i7 != -2 && i7 != 75 && i7 != -1 && (v01Var = anVar.n0) != null && v01Var.y > 0.0f) {
            v01Var.d();
        }
        final int i18 = 0;
        if (i7 == -1) {
            if (anVar.dd.f) {
                anVar.Va();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
            if (kVar.x()) {
                anVar.O7(false);
                return;
            }
            if (anVar.g4 == 5 && (anVar.L6.isEmpty() || anVar.s4 == 0)) {
                anVar.xc();
            } else if (anVar.g4 == 6 && anVar.a0.z()) {
                anVar.dc(new Runnable(this) { // from class: org.telegram.ui.pi
                    public final /* synthetic */ si b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i18) {
                            case 0:
                                this.b.b.finishFragment();
                                break;
                            default:
                                si siVar = this.b;
                                siVar.getClass();
                                an anVar2 = siVar.b;
                                Intent intent = new Intent(anVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", anVar2.e4.link);
                                anVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!anVar.m7(true, true)) {
                anVar.finishFragment();
            }
        } else {
            if (i7 == 59) {
                if (anVar.getUserConfig().e() == anVar.k6) {
                    anVar.getMessagesController().O4(true);
                    anVar.p1.e(false, true);
                    return;
                }
                org.telegram.messenger.h00 h00Var = anVar.getMessagesController().r7;
                long j11 = -anVar.k6;
                h00Var.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = h00Var.getMessagesController().h1(j11);
                tL_channels_toggleViewForumAsMessages.enabled = false;
                h00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(h00Var, 7));
                u91.M0(anVar);
                return;
            }
            org.telegram.messenger.gj gjVar = null;
            if (i7 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j12 = 0;
                for (int i19 = 1; i19 >= 0; i19--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i20 = 0; i20 < sparseArrayArr2[i19].size(); i20++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i19].keyAt(i20)));
                    }
                    if (anVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = 0; i21 < arrayList.size(); i21++) {
                        org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) an.Z8(j12, gjVar2, arrayList.size() != 1 && ((user2 = anVar.f) == null || !user2.self)));
                        j12 = gjVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.g0.g(spannableStringBuilder);
                    anVar.h8();
                    anVar.N3.j(58, 0L, null);
                }
                anVar.O7(false);
                return;
            }
            int i22 = 12;
            if (i7 != 12) {
                if (i7 == 11) {
                    anVar.Ea(true);
                    return;
                }
                if (i7 == 69) {
                    an.J1(anVar);
                    return;
                }
                if (i7 != 70) {
                    if (i7 == 72) {
                        long j13 = anVar.k6;
                        if (org.telegram.messenger.t3.p0(anVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                            if (org.telegram.messenger.t3.A(i17, anVar.e, 24)) {
                                j13 = anVar.s4;
                                j10 = anVar.k6;
                                long j14 = j13;
                                i16 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                                di.u8.y(i16, false).g0(j14, j10, false, false);
                                return;
                            }
                        }
                        j10 = 0;
                        long j142 = j13;
                        i16 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        di.u8.y(i16, false).g0(j142, j10, false, false);
                        return;
                    }
                    if (i7 == 71) {
                        long j15 = anVar.k6;
                        if (org.telegram.messenger.t3.p0(anVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                            if (org.telegram.messenger.t3.A(i15, anVar.e, 24)) {
                                j15 = anVar.s4;
                                j3 = anVar.k6;
                                long j16 = j15;
                                i14 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                                di.u8.y(i14, false).C(j16, j3, new di.m4(this, j16, j3, 2));
                                return;
                            }
                        }
                        j3 = 0;
                        long j162 = j15;
                        i14 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        di.u8.y(i14, false).C(j162, j3, new di.m4(this, j162, j3, 2));
                        return;
                    }
                    if (i7 == 28) {
                        if (anVar.Ab == null) {
                            an.O1(anVar);
                            return;
                        } else {
                            anVar.J9();
                            return;
                        }
                    }
                    if (i7 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i23 = 1; i23 >= 0; i23--) {
                            for (int i24 = 0; i24 < sparseArrayArr3[i23].size(); i24++) {
                                arrayList2.add((org.telegram.messenger.gj) sparseArrayArr3[i23].valueAt(i24));
                            }
                            sparseArrayArr3[i23].clear();
                            sparseArrayArr2[i23].clear();
                            sparseArrayArr[i23].clear();
                        }
                        boolean z10 = anVar.w6 > 0;
                        anVar.B9();
                        anVar.gd(0, true);
                        anVar.Gd(false);
                        MediaController.g0(anVar.getParentActivity(), anVar.getAccountInstance(), arrayList2, new qi(i18, this, z10));
                        return;
                    }
                    if (i7 == 13) {
                        if (anVar.getParentActivity() == null) {
                            return;
                        }
                        anVar.showDialog(org.telegram.ui.Components.t4.S(anVar.getParentActivity(), anVar.h, anVar.Aa).a);
                        return;
                    }
                    int i25 = 18;
                    if (i7 == 15 || i7 == 16 || i7 == 26) {
                        if (anVar.getParentActivity() == null) {
                            return;
                        }
                        if (i7 == 15 && org.telegram.messenger.t3.p0(anVar.e)) {
                            if (anVar.s4 == 0 || (a22 = anVar.getMessagesController().a2(Long.valueOf(anVar.s4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.t4.q(anVar, -1, a22, anVar.e, true, new m2.d(i25, this, a22), anVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = anVar.q8;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i7 != 26) {
                            if (i7 == 15) {
                                i10 = (anVar.h != null || (((user = anVar.f) == null || org.telegram.messenger.q10.B(user) || org.telegram.messenger.q10.x(anVar.f)) && ((chatFull = anVar.q8) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                            }
                            org.telegram.ui.Components.t4.r(anVar, i7 == i10, anVar.e, anVar.f, anVar.h == null ? 0 : 1, true, false, z11, new ai.s1(this, i7, z11));
                            return;
                        }
                        boolean z12 = z11;
                        org.telegram.ui.Components.t4.q(anVar, -1, anVar.f, anVar.e, z12, new ri(this, z12), anVar.getResourceProvider());
                        return;
                    }
                    if (i7 == 17) {
                        if (anVar.f == null || anVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = anVar.a2;
                        if (textView != null && textView.getTag() != null) {
                            anVar.Yb(((Integer) anVar.a2.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", anVar.f.id);
                        bundle.putBoolean("addContact", true);
                        anVar.presentFragment(new pr(bundle));
                        return;
                    }
                    if (i7 == 18) {
                        anVar.Ic(false);
                        return;
                    }
                    if (i7 == 24) {
                        try {
                            org.telegram.messenger.si mediaDataController = anVar.getMediaDataController();
                            long j17 = anVar.f.id;
                            Pattern pattern = org.telegram.messenger.si.S1;
                            mediaDataController.y0(j17, 0, null);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    if (i7 == 29) {
                        if (!org.telegram.messenger.t3.N(anVar.e)) {
                            anVar.getNotificationCenter().k(org.telegram.messenger.ns.n3, Long.valueOf(anVar.k6));
                            return;
                        }
                        t5 t5Var = new t5(anVar.k6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = anVar.S1;
                        t5Var.U = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            t5Var.getMessagesController().G0().b(t5Var.S, t5Var.U, new l5(t5Var, 0));
                        }
                        anVar.presentFragment(t5Var);
                        return;
                    }
                    int i26 = 21;
                    if (i7 == 21) {
                        int i27 = my0.w1;
                        int currentAccount = anVar.getCurrentAccount();
                        Activity parentActivity = anVar.getParentActivity();
                        long a10 = anVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        my0.J0(currentAccount, parentActivity, a10, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i7 == 22) {
                        for (int i28 = 0; i28 < 2; i28++) {
                            for (int i29 = 0; i29 < sparseArrayArr[i28].size(); i29++) {
                                org.telegram.messenger.gj gjVar3 = (org.telegram.messenger.gj) sparseArrayArr[i28].valueAt(i29);
                                anVar.getMediaDataController().d(2, gjVar3, gjVar3.F0(), (int) (System.currentTimeMillis() / 1000), !anVar.q6);
                            }
                        }
                        anVar.O7(false);
                        return;
                    }
                    if (i7 == 23) {
                        for (int i30 = 1; i30 >= 0; i30--) {
                            if (gjVar == null && sparseArrayArr3[i30].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i31 = 0; i31 < sparseArrayArr3[i30].size(); i31++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i30].keyAt(i31)));
                                }
                                gjVar = (org.telegram.messenger.gj) anVar.F6[i30].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i30].clear();
                            sparseArrayArr2[i30].clear();
                            sparseArrayArr[i30].clear();
                        }
                        if (gjVar == null || !gjVar.D4()) {
                            anVar.Ec(gjVar, false);
                        } else {
                            anVar.u5 = gjVar;
                            anVar.db(org.telegram.messenger.ns.u1);
                        }
                        anVar.B9();
                        anVar.gd(0, true);
                        anVar.Gd(false);
                        return;
                    }
                    if (i7 == 64) {
                        i12 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        kg.u1 c10 = kg.v1.f(i12).c(anVar.d9());
                        Activity parentActivity2 = anVar.getParentActivity();
                        i13 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        kg.r1.i0(parentActivity2, i13, anVar.f4, c10, anVar.getResourceProvider(), new li.v(i26, this, c10));
                        return;
                    }
                    if (i7 == 14) {
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.a, anVar.getResourceProvider(), true, true);
                        z0Var.j(org.telegram.messenger.hd.M0(2131753953, null), R.drawable.input_attach, null);
                        z0Var.setOnClickListener(new a(this, i22));
                        org.telegram.ui.ActionBar.q0 q0Var = anVar.j0;
                        org.telegram.ui.ActionBar.x xVar = anVar.g0;
                        xVar.a();
                        q0Var.V(z0Var, xVar.m);
                        return;
                    }
                    if (i7 == 30) {
                        anVar.getSendMessagesHelper().r0(org.telegram.messenger.cz.b("/help", anVar.k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i7 == 31) {
                        anVar.getSendMessagesHelper().r0(org.telegram.messenger.cz.b("/settings", anVar.k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i7 == 40) {
                        anVar.Oa(anVar.ea() ? "" : null);
                        return;
                    }
                    if (i7 == 62) {
                        anVar.getMessagesController().t7.J(anVar.a(), false, true);
                        if (anVar.getMessagesController().t7.K(anVar.a(), true)) {
                            return;
                        }
                        anVar.zd(true);
                        return;
                    }
                    if (i7 == 32 || i7 == 33) {
                        if (anVar.f == null || anVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user3 = anVar.f;
                        boolean z13 = i7 == 33;
                        TLRPC.UserFull userFull = anVar.r8;
                        org.telegram.ui.Components.voip.c2.m(user3, z13, userFull != null && userFull.video_calls_available, anVar.getParentActivity(), anVar.getMessagesController().b2(anVar.f.id), anVar.getAccountInstance());
                        return;
                    }
                    if (i7 == 27) {
                        anVar.ec();
                        return;
                    }
                    if (i7 == 60) {
                        if (anVar.r4 == null) {
                            return;
                        }
                        org.telegram.messenger.h00 h00Var2 = anVar.getMessagesController().r7;
                        long j18 = anVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = anVar.r4;
                        int i32 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        h00Var2.z(i32, j18, true);
                        anVar.Ad();
                        anVar.Pc(false);
                        anVar.zd(true);
                        return;
                    }
                    if (i7 == 61) {
                        u91.M0(anVar);
                        return;
                    }
                    if (i7 == 65) {
                        org.telegram.messenger.g0.g(anVar.e4.link);
                        org.telegram.ui.Components.cc.a0(LaunchActivity.Q()).k(false).j();
                        return;
                    }
                    if (i7 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.pi
                            public final /* synthetic */ si b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (r2) {
                                    case 0:
                                        this.b.b.finishFragment();
                                        break;
                                    default:
                                        si siVar = this.b;
                                        siVar.getClass();
                                        an anVar2 = siVar.b;
                                        Intent intent = new Intent(anVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", anVar2.e4.link);
                                        anVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (anVar.a0.z()) {
                            anVar.dc(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i7 == 67) {
                        Activity parentActivity3 = anVar.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = anVar.e4;
                        e6Var = ((org.telegram.ui.ActionBar.e2) anVar).resourceProvider;
                        kg.v.g0(parentActivity3, i11, tL_businessChatLink, e6Var);
                        return;
                    }
                    if (i7 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.getResourceProvider());
                        String M0 = org.telegram.messenger.hd.M0(2131752707, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131752708, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746321, null), new w0(this, 19));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        anVar.showDialog(t1Var);
                        TextView textView2 = (TextView) t1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.q7, anVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    if (i7 == 75) {
                        if (!anVar.ga() || anVar.A8() == null) {
                            return;
                        }
                        org.telegram.messenger.g0.v1(anVar.m1);
                        anVar.n0.requestLayout();
                        org.telegram.ui.Components.v01 v01Var2 = anVar.n0;
                        v01Var2.h();
                        v01Var2.a(1.0f, 0.0f);
                        return;
                    }
                    if (i7 == 73) {
                        s81 f02 = s81.f0(-anVar.k6, 0L);
                        f02.E = anVar;
                        anVar.presentFragment(f02);
                        return;
                    } else if (i7 == 888) {
                        anVar.dumpCanvas();
                        return;
                    } else {
                        if (i7 == 889) {
                            HashSet hashSet = g4.d1;
                            org.telegram.ui.Components.cc.a0(anVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = anVar.e;
                if (chat != null) {
                    anVar.presentFragment(an.ua(-chat.linked_monoforum_id));
                }
            } else if (anVar.getParentActivity() != null) {
                anVar.V7(null, null, false);
            }
        }
    }
}
