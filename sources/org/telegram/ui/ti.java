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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ti extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ bn b;

    public ti(bn bnVar, Context context) {
        this.b = bnVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User c22;
        int i10;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i11;
        int i12;
        long j3;
        int i13;
        int i14;
        long j10;
        int i15;
        int i16;
        TLRPC.User user2;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.Components.f11 f11Var;
        bn bnVar = this.b;
        SparseArray[] sparseArrayArr = bnVar.q6;
        SparseArray[] sparseArrayArr2 = bnVar.p6;
        SparseArray[] sparseArrayArr3 = bnVar.o6;
        if (i7 != -2 && i7 != 75 && i7 != -1 && (f11Var = bnVar.n0) != null && f11Var.y > 0.0f) {
            f11Var.e();
        }
        final int i17 = 0;
        if (i7 == -1) {
            if (bnVar.ed.f) {
                bnVar.Va();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
            if (kVar.y()) {
                bnVar.O7(false);
                return;
            }
            if (bnVar.g4 == 5 && (bnVar.M6.isEmpty() || bnVar.s4 == 0)) {
                bnVar.xc();
            } else if (bnVar.g4 == 6 && bnVar.a0.B()) {
                bnVar.dc(new Runnable(this) { // from class: org.telegram.ui.qi
                    public final /* synthetic */ ti b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i17) {
                            case 0:
                                this.b.b.finishFragment();
                                break;
                            default:
                                ti tiVar = this.b;
                                tiVar.getClass();
                                bn bnVar2 = tiVar.b;
                                Intent intent = new Intent(bnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", bnVar2.e4.link);
                                bnVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!bnVar.m7(true, true)) {
                bnVar.finishFragment();
            }
        } else {
            if (i7 == 59) {
                if (bnVar.getUserConfig().e() == bnVar.l6) {
                    bnVar.getMessagesController().Z4(true);
                    bnVar.p1.e(false, true);
                    return;
                }
                org.telegram.messenger.e00 e00Var = bnVar.getMessagesController().t7;
                long j11 = -bnVar.l6;
                e00Var.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = e00Var.getMessagesController().j1(j11);
                tL_channels_toggleViewForumAsMessages.enabled = false;
                e00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(e00Var, 7));
                y91.M0(bnVar);
                return;
            }
            org.telegram.messenger.fj fjVar = null;
            if (i7 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j12 = 0;
                for (int i18 = 1; i18 >= 0; i18--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i19 = 0; i19 < sparseArrayArr2[i18].size(); i19++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i18].keyAt(i19)));
                    }
                    if (bnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) sparseArrayArr2[i18].get(((Integer) arrayList.get(i20)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) bn.Z8(j12, fjVar2, arrayList.size() != 1 && ((user2 = bnVar.f) == null || !user2.self)));
                        j12 = fjVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.g0.g(spannableStringBuilder);
                    bnVar.h8();
                    bnVar.N3.j(58, 0L, null);
                }
                bnVar.O7(false);
                return;
            }
            int i21 = 12;
            if (i7 != 12) {
                if (i7 == 11) {
                    bnVar.Ea(true);
                    return;
                }
                if (i7 == 69) {
                    bn.J1(bnVar);
                    return;
                }
                if (i7 != 70) {
                    if (i7 == 72) {
                        long j13 = bnVar.l6;
                        if (org.telegram.messenger.v3.p0(bnVar.e)) {
                            i16 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                            if (org.telegram.messenger.v3.A(i16, bnVar.e, 24)) {
                                j13 = bnVar.s4;
                                j10 = bnVar.l6;
                                long j14 = j13;
                                i15 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                                di.x8.y(i15, false).g0(j14, j10, false, false);
                                return;
                            }
                        }
                        j10 = 0;
                        long j142 = j13;
                        i15 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                        di.x8.y(i15, false).g0(j142, j10, false, false);
                        return;
                    }
                    if (i7 == 71) {
                        long j15 = bnVar.l6;
                        if (org.telegram.messenger.v3.p0(bnVar.e)) {
                            i14 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                            if (org.telegram.messenger.v3.A(i14, bnVar.e, 24)) {
                                j15 = bnVar.s4;
                                j3 = bnVar.l6;
                                long j16 = j15;
                                i13 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                                di.x8.y(i13, false).C(j16, j3, new di.p4(this, j16, j3, 2));
                                return;
                            }
                        }
                        j3 = 0;
                        long j162 = j15;
                        i13 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                        di.x8.y(i13, false).C(j162, j3, new di.p4(this, j162, j3, 2));
                        return;
                    }
                    if (i7 == 28) {
                        if (bnVar.Bb == null) {
                            bn.O1(bnVar);
                            return;
                        } else {
                            bnVar.J9();
                            return;
                        }
                    }
                    if (i7 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i22 = 1; i22 >= 0; i22--) {
                            for (int i23 = 0; i23 < sparseArrayArr3[i22].size(); i23++) {
                                arrayList2.add((org.telegram.messenger.fj) sparseArrayArr3[i22].valueAt(i23));
                            }
                            sparseArrayArr3[i22].clear();
                            sparseArrayArr2[i22].clear();
                            sparseArrayArr[i22].clear();
                        }
                        boolean z10 = bnVar.x6 > 0;
                        bnVar.B9();
                        bnVar.gd(0, true);
                        bnVar.Gd(false);
                        MediaController.g0(bnVar.getParentActivity(), bnVar.getAccountInstance(), arrayList2, new ri(i17, this, z10));
                        return;
                    }
                    if (i7 == 13) {
                        if (bnVar.getParentActivity() == null) {
                            return;
                        }
                        bnVar.showDialog(org.telegram.ui.Components.b5.S(bnVar.getParentActivity(), bnVar.h, bnVar.Ba).a);
                        return;
                    }
                    int i24 = 16;
                    if (i7 == 15 || i7 == 16 || i7 == 26) {
                        if (bnVar.getParentActivity() == null) {
                            return;
                        }
                        if (i7 == 15 && org.telegram.messenger.v3.p0(bnVar.e)) {
                            if (bnVar.s4 == 0 || (c22 = bnVar.getMessagesController().c2(Long.valueOf(bnVar.s4))) == null) {
                                return;
                            }
                            org.telegram.ui.Components.b5.q(bnVar, -1, c22, bnVar.e, true, new oi.e0(i24, this, c22), bnVar.getResourceProvider());
                            return;
                        }
                        TLRPC.ChatFull chatFull2 = bnVar.r8;
                        boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                        if (i7 != 26 && (i7 != 15 || bnVar.h != null || (((user = bnVar.f) == null || org.telegram.messenger.o10.C(user) || org.telegram.messenger.o10.y(bnVar.f)) && ((chatFull = bnVar.r8) == null || !chatFull.can_delete_channel)))) {
                            org.telegram.ui.Components.b5.r(bnVar, i7 == 15, bnVar.e, bnVar.f, bnVar.h == null ? 0 : 1, true, false, z11, new ai.s1(this, i7, z11));
                            return;
                        } else {
                            boolean z12 = z11;
                            org.telegram.ui.Components.b5.q(bnVar, -1, bnVar.f, bnVar.e, z12, new si(this, z12), bnVar.getResourceProvider());
                            return;
                        }
                    }
                    if (i7 == 17) {
                        if (bnVar.f == null || bnVar.getParentActivity() == null) {
                            return;
                        }
                        TextView textView = bnVar.a2;
                        if (textView != null && textView.getTag() != null) {
                            bnVar.Yb(((Integer) bnVar.a2.getTag()).intValue(), null);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", bnVar.f.id);
                        bundle.putBoolean("addContact", true);
                        bnVar.presentFragment(new qr(bundle));
                        return;
                    }
                    if (i7 == 18) {
                        bnVar.Ic(false);
                        return;
                    }
                    if (i7 == 24) {
                        try {
                            org.telegram.messenger.ri mediaDataController = bnVar.getMediaDataController();
                            long j17 = bnVar.f.id;
                            Pattern pattern = org.telegram.messenger.ri.U1;
                            mediaDataController.A0(j17, 0, null);
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                    if (i7 == 29) {
                        if (!org.telegram.messenger.v3.N(bnVar.e)) {
                            bnVar.getNotificationCenter().k(org.telegram.messenger.ks.p3, Long.valueOf(bnVar.l6));
                            return;
                        }
                        t5 t5Var = new t5(bnVar.l6);
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = bnVar.S1;
                        t5Var.U = tL_premium_boostsStatus;
                        if (tL_premium_boostsStatus != null) {
                            t5Var.getMessagesController().I0().b(t5Var.S, t5Var.U, new l5(t5Var, 0));
                        }
                        bnVar.presentFragment(t5Var);
                        return;
                    }
                    if (i7 == 21) {
                        int i25 = qy0.w1;
                        int currentAccount = bnVar.getCurrentAccount();
                        Activity parentActivity = bnVar.getParentActivity();
                        long a10 = bnVar.a();
                        if (parentActivity == null) {
                            return;
                        }
                        qy0.K0(currentAccount, parentActivity, a10, false, false, new ArrayList(), null, null, new byte[0], null, null);
                        return;
                    }
                    if (i7 == 22) {
                        for (int i26 = 0; i26 < 2; i26++) {
                            for (int i27 = 0; i27 < sparseArrayArr[i26].size(); i27++) {
                                org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) sparseArrayArr[i26].valueAt(i27);
                                bnVar.getMediaDataController().d(2, fjVar3, fjVar3.F0(), (int) (System.currentTimeMillis() / 1000), !bnVar.r6);
                            }
                        }
                        bnVar.O7(false);
                        return;
                    }
                    if (i7 == 23) {
                        for (int i28 = 1; i28 >= 0; i28--) {
                            if (fjVar == null && sparseArrayArr3[i28].size() == 1) {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i29 = 0; i29 < sparseArrayArr3[i28].size(); i29++) {
                                    arrayList3.add(Integer.valueOf(sparseArrayArr3[i28].keyAt(i29)));
                                }
                                fjVar = (org.telegram.messenger.fj) bnVar.G6[i28].get(((Integer) arrayList3.get(0)).intValue());
                            }
                            sparseArrayArr3[i28].clear();
                            sparseArrayArr2[i28].clear();
                            sparseArrayArr[i28].clear();
                        }
                        if (fjVar == null || !fjVar.D4()) {
                            bnVar.Ec(fjVar, false);
                        } else {
                            bnVar.v5 = fjVar;
                            bnVar.db(org.telegram.messenger.ks.u1);
                        }
                        bnVar.B9();
                        bnVar.gd(0, true);
                        bnVar.Gd(false);
                        return;
                    }
                    if (i7 == 64) {
                        i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                        kg.v1 c10 = kg.w1.f(i11).c(bnVar.d9());
                        Activity parentActivity2 = bnVar.getParentActivity();
                        i12 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                        kg.t1.i0(parentActivity2, i12, bnVar.f4, c10, bnVar.getResourceProvider(), new li.d(20, this, c10));
                        return;
                    }
                    if (i7 == 14) {
                        org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.a, bnVar.getResourceProvider(), true, true);
                        z0Var.j(org.telegram.messenger.gd.M0(2131753951, null), R.drawable.input_attach, null);
                        z0Var.setOnClickListener(new a(this, i21));
                        org.telegram.ui.ActionBar.r0 r0Var = bnVar.j0;
                        org.telegram.ui.ActionBar.y yVar = bnVar.g0;
                        yVar.a();
                        r0Var.V(z0Var, yVar.m);
                        return;
                    }
                    if (i7 == 30) {
                        bnVar.getSendMessagesHelper().r0(org.telegram.messenger.xy.b("/help", bnVar.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i7 == 31) {
                        bnVar.getSendMessagesHelper().r0(org.telegram.messenger.xy.b("/settings", bnVar.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        return;
                    }
                    if (i7 == 40) {
                        bnVar.Oa(bnVar.ea() ? "" : null);
                        return;
                    }
                    if (i7 == 62) {
                        bnVar.getMessagesController().v7.J(bnVar.a(), false, true);
                        if (bnVar.getMessagesController().v7.K(bnVar.a(), true)) {
                            return;
                        }
                        bnVar.zd(true);
                        return;
                    }
                    if (i7 == 32 || i7 == 33) {
                        if (bnVar.f == null || bnVar.getParentActivity() == null) {
                            return;
                        }
                        TLRPC.User user3 = bnVar.f;
                        boolean z13 = i7 == 33;
                        TLRPC.UserFull userFull = bnVar.s8;
                        org.telegram.ui.Components.voip.b2.m(user3, z13, userFull != null && userFull.video_calls_available, bnVar.getParentActivity(), bnVar.getMessagesController().d2(bnVar.f.id), bnVar.getAccountInstance());
                        return;
                    }
                    if (i7 == 27) {
                        bnVar.ec();
                        return;
                    }
                    if (i7 == 60) {
                        if (bnVar.r4 == null) {
                            return;
                        }
                        org.telegram.messenger.e00 e00Var2 = bnVar.getMessagesController().t7;
                        long j18 = bnVar.e.id;
                        TLRPC.TL_forumTopic tL_forumTopic = bnVar.r4;
                        int i30 = tL_forumTopic.id;
                        tL_forumTopic.closed = true;
                        e00Var2.z(i30, j18, true);
                        bnVar.Ad();
                        bnVar.Pc(false);
                        bnVar.zd(true);
                        return;
                    }
                    if (i7 == 61) {
                        y91.M0(bnVar);
                        return;
                    }
                    if (i7 == 65) {
                        org.telegram.messenger.g0.g(bnVar.e4.link);
                        org.telegram.ui.Components.lc.b0(LaunchActivity.Q()).k(false).j();
                        return;
                    }
                    if (i7 == 66) {
                        Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.qi
                            public final /* synthetic */ ti b;

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
                                        ti tiVar = this.b;
                                        tiVar.getClass();
                                        bn bnVar2 = tiVar.b;
                                        Intent intent = new Intent(bnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                        intent.setAction("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", bnVar2.e4.link);
                                        bnVar2.startActivityForResult(intent, 500);
                                        break;
                                }
                            }
                        };
                        if (bnVar.a0.B()) {
                            bnVar.dc(runnable);
                            return;
                        } else {
                            runnable.run();
                            return;
                        }
                    }
                    if (i7 == 67) {
                        Activity parentActivity3 = bnVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                        TL_account.TL_businessChatLink tL_businessChatLink = bnVar.e4;
                        i6Var = ((org.telegram.ui.ActionBar.h2) bnVar).resourceProvider;
                        kg.v.g0(parentActivity3, i10, tL_businessChatLink, i6Var);
                        return;
                    }
                    if (i7 == 68) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar.getParentActivity(), bnVar.getResourceProvider());
                        String M0 = org.telegram.messenger.gd.M0(2131752696, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131752697, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131746126, null), new w0(this, 19));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        bnVar.showDialog(u1Var);
                        TextView textView2 = (TextView) u1Var.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q7, bnVar.getResourceProvider());
                            return;
                        }
                        return;
                    }
                    if (i7 == 75) {
                        if (!bnVar.ga() || bnVar.A8() == null) {
                            return;
                        }
                        org.telegram.messenger.g0.v1(bnVar.m1);
                        bnVar.n0.requestLayout();
                        org.telegram.ui.Components.f11 f11Var2 = bnVar.n0;
                        f11Var2.n();
                        f11Var2.b(1.0f, 0.0f);
                        return;
                    }
                    if (i7 == 73) {
                        w81 f02 = w81.f0(-bnVar.l6, 0L);
                        f02.E = bnVar;
                        bnVar.presentFragment(f02);
                        return;
                    } else if (i7 == 888) {
                        bnVar.dumpCanvas();
                        return;
                    } else {
                        if (i7 == 889) {
                            HashSet hashSet = g4.d1;
                            org.telegram.ui.Components.lc.b0(bnVar).t("No rich message copied", null).j();
                            return;
                        }
                        return;
                    }
                }
                TLRPC.Chat chat = bnVar.e;
                if (chat != null) {
                    bnVar.presentFragment(bn.ua(-chat.linked_monoforum_id));
                }
            } else if (bnVar.getParentActivity() != null) {
                bnVar.V7(null, null, false);
            }
        }
    }
}
