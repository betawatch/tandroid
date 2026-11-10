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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ui extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ cn b;

    public ui(cn cnVar, Context context) {
        this.b = cnVar;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i7) {
        int i10;
        TLRPC.User user;
        TLRPC.ChatFull chatFull;
        TLRPC.User a22;
        int i11;
        org.telegram.ui.ActionBar.h6 h6Var;
        int i12;
        int i13;
        long j3;
        int i14;
        int i15;
        long j10;
        int i16;
        int i17;
        TLRPC.User user2;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.Components.s01 s01Var;
        cn cnVar = this.b;
        SparseArray[] sparseArrayArr = cnVar.o6;
        SparseArray[] sparseArrayArr2 = cnVar.n6;
        SparseArray[] sparseArrayArr3 = cnVar.m6;
        if (i7 != -2 && i7 != 75 && i7 != -1 && (s01Var = cnVar.m0) != null && s01Var.y > 0.0f) {
            s01Var.d();
        }
        final int i18 = 0;
        if (i7 == -1) {
            if (cnVar.cd.f) {
                cnVar.Ua();
                return;
            }
            lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
            if (lVar.x()) {
                cnVar.O7(false);
                return;
            }
            if (cnVar.f4 == 5 && (cnVar.K6.isEmpty() || cnVar.r4 == 0)) {
                cnVar.wc();
            } else if (cnVar.f4 == 6 && cnVar.Z.t()) {
                cnVar.cc(new Runnable(this) { // from class: org.telegram.ui.ri
                    public final /* synthetic */ ui b;

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
                                ui uiVar = this.b;
                                uiVar.getClass();
                                cn cnVar2 = uiVar.b;
                                Intent intent = new Intent(cnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                intent.setAction("android.intent.action.SEND");
                                intent.setType("text/plain");
                                intent.putExtra("android.intent.extra.TEXT", cnVar2.d4.link);
                                cnVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!cnVar.m7(true, true)) {
                cnVar.finishFragment();
            }
        } else {
            if (i7 == 59) {
                if (cnVar.getUserConfig().e() == cnVar.j6) {
                    cnVar.getMessagesController().N4(true);
                    cnVar.o1.e(false, true);
                    return;
                }
                org.telegram.messenger.k00 k00Var = cnVar.getMessagesController().q7;
                long j11 = -cnVar.j6;
                k00Var.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = k00Var.getMessagesController().h1(j11);
                tL_channels_toggleViewForumAsMessages.enabled = false;
                k00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(k00Var, 7));
                z91.M0(cnVar);
                return;
            }
            org.telegram.messenger.ij ijVar = null;
            if (i7 == 10) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                long j12 = 0;
                for (int i19 = 1; i19 >= 0; i19--) {
                    ArrayList arrayList = new ArrayList();
                    for (int i20 = 0; i20 < sparseArrayArr2[i19].size(); i20++) {
                        arrayList.add(Integer.valueOf(sparseArrayArr2[i19].keyAt(i20)));
                    }
                    if (cnVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = 0; i21 < arrayList.size(); i21++) {
                        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) cn.Y8(j12, ijVar2, arrayList.size() != 1 && ((user2 = cnVar.f) == null || !user2.self)));
                        j12 = ijVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.g0.g(spannableStringBuilder);
                    cnVar.g8();
                    cnVar.M3.j(58, 0L, null);
                }
                cnVar.O7(false);
                return;
            }
            int i22 = 12;
            if (i7 != 12) {
                if (i7 == 11) {
                    cnVar.Da(true);
                    return;
                }
                if (i7 == 69) {
                    cn.J1(cnVar);
                    return;
                }
                if (i7 != 70) {
                    if (i7 == 72) {
                        long j13 = cnVar.j6;
                        if (org.telegram.messenger.t3.p0(cnVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                            if (org.telegram.messenger.t3.A(i17, cnVar.e, 24)) {
                                j13 = cnVar.r4;
                                j10 = cnVar.j6;
                                long j14 = j13;
                                i16 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                                bi.ea.y(i16, false).g0(j14, j10, false, false);
                                return;
                            }
                        }
                        j10 = 0;
                        long j142 = j13;
                        i16 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                        bi.ea.y(i16, false).g0(j142, j10, false, false);
                        return;
                    }
                    if (i7 == 71) {
                        long j15 = cnVar.j6;
                        if (org.telegram.messenger.t3.p0(cnVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                            if (org.telegram.messenger.t3.A(i15, cnVar.e, 24)) {
                                j15 = cnVar.r4;
                                j3 = cnVar.j6;
                                long j16 = j15;
                                i14 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                                bi.ea.y(i14, false).C(j16, j3, new bi.o5(this, j16, j3, 2));
                                return;
                            }
                        }
                        j3 = 0;
                        long j162 = j15;
                        i14 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                        bi.ea.y(i14, false).C(j162, j3, new bi.o5(this, j162, j3, 2));
                        return;
                    }
                    if (i7 == 28) {
                        if (cnVar.zb == null) {
                            cn.O1(cnVar);
                            return;
                        } else {
                            cnVar.I9();
                            return;
                        }
                    }
                    if (i7 == 25) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i23 = 1; i23 >= 0; i23--) {
                            for (int i24 = 0; i24 < sparseArrayArr3[i23].size(); i24++) {
                                arrayList2.add((org.telegram.messenger.ij) sparseArrayArr3[i23].valueAt(i24));
                            }
                            sparseArrayArr3[i23].clear();
                            sparseArrayArr2[i23].clear();
                            sparseArrayArr[i23].clear();
                        }
                        boolean z9 = cnVar.v6 > 0;
                        cnVar.A9();
                        cnVar.fd(0, true);
                        cnVar.Fd(false);
                        MediaController.g0(cnVar.getParentActivity(), cnVar.getAccountInstance(), arrayList2, new si(i18, this, z9));
                        return;
                    }
                    if (i7 == 13) {
                        if (cnVar.getParentActivity() == null) {
                            return;
                        }
                        cnVar.showDialog(org.telegram.ui.Components.u4.S(cnVar.getParentActivity(), cnVar.h, cnVar.za).a);
                        return;
                    }
                    int i25 = 14;
                    if (i7 != 15) {
                        int i26 = 16;
                        if (i7 != 16 && i7 != 26) {
                            if (i7 == 17) {
                                if (cnVar.f == null || cnVar.getParentActivity() == null) {
                                    return;
                                }
                                TextView textView = cnVar.Z1;
                                if (textView != null && textView.getTag() != null) {
                                    cnVar.Xb(((Integer) cnVar.Z1.getTag()).intValue(), null);
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", cnVar.f.id);
                                bundle.putBoolean("addContact", true);
                                cnVar.presentFragment(new qr(bundle));
                                return;
                            }
                            if (i7 == 18) {
                                cnVar.Hc(false);
                                return;
                            }
                            if (i7 == 24) {
                                try {
                                    org.telegram.messenger.ui mediaDataController = cnVar.getMediaDataController();
                                    long j17 = cnVar.f.id;
                                    Pattern pattern = org.telegram.messenger.ui.R1;
                                    mediaDataController.y0(j17, 0, null);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            if (i7 == 29) {
                                if (!org.telegram.messenger.t3.N(cnVar.e)) {
                                    cnVar.getNotificationCenter().k(org.telegram.messenger.qs.n3, Long.valueOf(cnVar.j6));
                                    return;
                                }
                                t5 t5Var = new t5(cnVar.j6);
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = cnVar.R1;
                                t5Var.T = tL_premium_boostsStatus;
                                if (tL_premium_boostsStatus != null) {
                                    t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new l5(t5Var, 0));
                                }
                                cnVar.presentFragment(t5Var);
                                return;
                            }
                            if (i7 == 21) {
                                int i27 = sy0.v1;
                                int currentAccount = cnVar.getCurrentAccount();
                                Activity parentActivity = cnVar.getParentActivity();
                                long a10 = cnVar.a();
                                if (parentActivity == null) {
                                    return;
                                }
                                sy0.J0(currentAccount, parentActivity, a10, false, false, new ArrayList(), null, null, new byte[0], null, null);
                                return;
                            }
                            if (i7 == 22) {
                                for (int i28 = 0; i28 < 2; i28++) {
                                    for (int i29 = 0; i29 < sparseArrayArr[i28].size(); i29++) {
                                        org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) sparseArrayArr[i28].valueAt(i29);
                                        cnVar.getMediaDataController().d(2, ijVar3, ijVar3.F0(), (int) (System.currentTimeMillis() / 1000), !cnVar.p6);
                                    }
                                }
                                cnVar.O7(false);
                                return;
                            }
                            if (i7 == 23) {
                                for (int i30 = 1; i30 >= 0; i30--) {
                                    if (ijVar == null && sparseArrayArr3[i30].size() == 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i31 = 0; i31 < sparseArrayArr3[i30].size(); i31++) {
                                            arrayList3.add(Integer.valueOf(sparseArrayArr3[i30].keyAt(i31)));
                                        }
                                        ijVar = (org.telegram.messenger.ij) cnVar.E6[i30].get(((Integer) arrayList3.get(0)).intValue());
                                    }
                                    sparseArrayArr3[i30].clear();
                                    sparseArrayArr2[i30].clear();
                                    sparseArrayArr[i30].clear();
                                }
                                if (ijVar == null || !ijVar.D4()) {
                                    cnVar.Dc(ijVar, false);
                                } else {
                                    cnVar.t5 = ijVar;
                                    cnVar.cb(org.telegram.messenger.qs.u1);
                                }
                                cnVar.A9();
                                cnVar.fd(0, true);
                                cnVar.Fd(false);
                                return;
                            }
                            if (i7 == 64) {
                                i12 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                                kg.s1 c10 = kg.t1.f(i12).c(cnVar.c9());
                                Activity parentActivity2 = cnVar.getParentActivity();
                                i13 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                                kg.q1.i0(parentActivity2, i13, cnVar.e4, c10, cnVar.getResourceProvider(), new org.telegram.messenger.voip.k(i26, this, c10));
                                return;
                            }
                            if (i7 == 14) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.a, cnVar.getResourceProvider(), true, true);
                                z0Var.j(org.telegram.messenger.id.M0(2131753953, null), R.drawable.input_attach, null);
                                z0Var.setOnClickListener(new a(this, i22));
                                org.telegram.ui.ActionBar.r0 r0Var = cnVar.i0;
                                org.telegram.ui.ActionBar.x xVar = cnVar.f0;
                                xVar.a();
                                r0Var.U(z0Var, xVar.m);
                                return;
                            }
                            if (i7 == 30) {
                                cnVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/help", cnVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                                return;
                            }
                            if (i7 == 31) {
                                cnVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/settings", cnVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                                return;
                            }
                            if (i7 == 40) {
                                cnVar.Na(cnVar.da() ? "" : null);
                                return;
                            }
                            if (i7 == 62) {
                                cnVar.getMessagesController().s7.J(cnVar.a(), false, true);
                                if (cnVar.getMessagesController().s7.K(cnVar.a(), true)) {
                                    return;
                                }
                                cnVar.yd(true);
                                return;
                            }
                            if (i7 == 32 || i7 == 33) {
                                if (cnVar.f == null || cnVar.getParentActivity() == null) {
                                    return;
                                }
                                TLRPC.User user3 = cnVar.f;
                                boolean z10 = i7 == 33;
                                TLRPC.UserFull userFull = cnVar.q8;
                                org.telegram.ui.Components.voip.y1.m(user3, z10, userFull != null && userFull.video_calls_available, cnVar.getParentActivity(), cnVar.getMessagesController().b2(cnVar.f.id), cnVar.getAccountInstance());
                                return;
                            }
                            if (i7 == 27) {
                                cnVar.dc();
                                return;
                            }
                            if (i7 == 60) {
                                if (cnVar.q4 == null) {
                                    return;
                                }
                                org.telegram.messenger.k00 k00Var2 = cnVar.getMessagesController().q7;
                                long j18 = cnVar.e.id;
                                TLRPC.TL_forumTopic tL_forumTopic = cnVar.q4;
                                int i32 = tL_forumTopic.id;
                                tL_forumTopic.closed = true;
                                k00Var2.z(i32, j18, true);
                                cnVar.zd();
                                cnVar.Oc(false);
                                cnVar.yd(true);
                                return;
                            }
                            if (i7 == 61) {
                                z91.M0(cnVar);
                                return;
                            }
                            if (i7 == 65) {
                                org.telegram.messenger.g0.g(cnVar.d4.link);
                                org.telegram.ui.Components.gc.a0(LaunchActivity.Q()).k(false).j();
                                return;
                            }
                            if (i7 == 66) {
                                Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.ri
                                    public final /* synthetic */ ui b;

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
                                                ui uiVar = this.b;
                                                uiVar.getClass();
                                                cn cnVar2 = uiVar.b;
                                                Intent intent = new Intent(cnVar2.getParentActivity(), (Class<?>) LaunchActivity.class);
                                                intent.setAction("android.intent.action.SEND");
                                                intent.setType("text/plain");
                                                intent.putExtra("android.intent.extra.TEXT", cnVar2.d4.link);
                                                cnVar2.startActivityForResult(intent, 500);
                                                break;
                                        }
                                    }
                                };
                                if (cnVar.Z.t()) {
                                    cnVar.cc(runnable);
                                    return;
                                } else {
                                    runnable.run();
                                    return;
                                }
                            }
                            if (i7 == 67) {
                                Activity parentActivity3 = cnVar.getParentActivity();
                                i11 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                                TL_account.TL_businessChatLink tL_businessChatLink = cnVar.d4;
                                h6Var = ((org.telegram.ui.ActionBar.f2) cnVar).resourceProvider;
                                kg.v.g0(parentActivity3, i11, tL_businessChatLink, h6Var);
                                return;
                            }
                            if (i7 == 68) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, cnVar.getParentActivity(), cnVar.getResourceProvider());
                                String M0 = org.telegram.messenger.id.M0(2131752707, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.id.M0(2131752708, null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746321, null), new w0(this, 19));
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                cnVar.showDialog(u1Var);
                                TextView textView2 = (TextView) u1Var.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.q7, cnVar.getResourceProvider());
                                    return;
                                }
                                return;
                            }
                            if (i7 == 75) {
                                if (!cnVar.fa() || cnVar.z8() == null) {
                                    return;
                                }
                                org.telegram.messenger.g0.v1(cnVar.l1);
                                cnVar.m0.requestLayout();
                                org.telegram.ui.Components.s01 s01Var2 = cnVar.m0;
                                s01Var2.h();
                                s01Var2.a(1.0f, 0.0f);
                                return;
                            }
                            if (i7 == 73) {
                                x81 f02 = x81.f0(-cnVar.j6, 0L);
                                f02.D = cnVar;
                                cnVar.presentFragment(f02);
                                return;
                            } else if (i7 == 888) {
                                cnVar.dumpCanvas();
                                return;
                            } else {
                                if (i7 == 889) {
                                    HashSet hashSet = g4.c1;
                                    org.telegram.ui.Components.gc.a0(cnVar).t("No rich message copied", null).j();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    if (cnVar.getParentActivity() == null) {
                        return;
                    }
                    if (i7 == 15 && org.telegram.messenger.t3.p0(cnVar.e)) {
                        if (cnVar.r4 == 0 || (a22 = cnVar.getMessagesController().a2(Long.valueOf(cnVar.r4))) == null) {
                            return;
                        }
                        org.telegram.ui.Components.u4.q(cnVar, -1, a22, cnVar.e, true, new ni.c(i25, this, a22), cnVar.getResourceProvider());
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = cnVar.p8;
                    boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                    if (i7 != 26) {
                        if (i7 == 15) {
                            i10 = (cnVar.h != null || (((user = cnVar.f) == null || org.telegram.messenger.t10.B(user) || org.telegram.messenger.t10.x(cnVar.f)) && ((chatFull = cnVar.p8) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                        }
                        org.telegram.ui.Components.u4.r(cnVar, i7 == i10, cnVar.e, cnVar.f, cnVar.h == null ? 0 : 1, true, false, z11, new l2.q(this, i7, z11));
                        return;
                    }
                    boolean z12 = z11;
                    org.telegram.ui.Components.u4.q(cnVar, -1, cnVar.f, cnVar.e, z12, new ti(this, z12), cnVar.getResourceProvider());
                    return;
                }
                TLRPC.Chat chat = cnVar.e;
                if (chat != null) {
                    cnVar.presentFragment(cn.ta(-chat.linked_monoforum_id));
                }
            } else if (cnVar.getParentActivity() != null) {
                cnVar.V7(null, null, false);
            }
        }
    }
}
