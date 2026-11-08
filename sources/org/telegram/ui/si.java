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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        org.telegram.ui.ActionBar.f6 f6Var;
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
        org.telegram.ui.Components.s01 s01Var;
        an anVar = this.b;
        SparseArray[] sparseArrayArr = anVar.o6;
        SparseArray[] sparseArrayArr2 = anVar.n6;
        SparseArray[] sparseArrayArr3 = anVar.m6;
        if (i7 != -2 && i7 != 75 && i7 != -1 && (s01Var = anVar.m0) != null && s01Var.y > 0.0f) {
            s01Var.d();
        }
        final int i18 = 0;
        if (i7 == -1) {
            if (anVar.ad.f) {
                anVar.Sa();
                return;
            }
            kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
            if (kVar.v()) {
                anVar.N7(false);
                return;
            }
            if (anVar.f4 == 5 && (anVar.K6.isEmpty() || anVar.r4 == 0)) {
                anVar.tc();
            } else if (anVar.f4 == 6 && anVar.Z.t()) {
                anVar.Zb(new Runnable(this) { // from class: org.telegram.ui.pi
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
                                intent.putExtra("android.intent.extra.TEXT", anVar2.d4.link);
                                anVar2.startActivityForResult(intent, 500);
                                break;
                        }
                    }
                });
            } else if (!anVar.l7(true, true)) {
                anVar.finishFragment();
            }
        } else {
            if (i7 == 59) {
                if (anVar.getUserConfig().e() == anVar.j6) {
                    anVar.getMessagesController().N4(true);
                    anVar.o1.e(false, true);
                    return;
                }
                org.telegram.messenger.k00 k00Var = anVar.getMessagesController().q7;
                long j11 = -anVar.j6;
                k00Var.getClass();
                TLRPC.TL_channels_toggleViewForumAsMessages tL_channels_toggleViewForumAsMessages = new TLRPC.TL_channels_toggleViewForumAsMessages();
                tL_channels_toggleViewForumAsMessages.channel_id = k00Var.getMessagesController().h1(j11);
                tL_channels_toggleViewForumAsMessages.enabled = false;
                k00Var.getConnectionsManager().sendRequest(tL_channels_toggleViewForumAsMessages, new org.telegram.messenger.s1(k00Var, 7));
                w91.M0(anVar);
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
                    if (anVar.h == null) {
                        Collections.sort(arrayList);
                    } else {
                        Collections.sort(arrayList, Collections.reverseOrder());
                    }
                    for (int i21 = 0; i21 < arrayList.size(); i21++) {
                        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) sparseArrayArr2[i19].get(((Integer) arrayList.get(i21)).intValue());
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                        }
                        spannableStringBuilder.append((CharSequence) an.X8(j12, ijVar2, arrayList.size() != 1 && ((user2 = anVar.f) == null || !user2.self)));
                        j12 = ijVar2.Z0();
                    }
                }
                if (spannableStringBuilder.length() != 0) {
                    org.telegram.messenger.g0.g(spannableStringBuilder);
                    anVar.f8();
                    anVar.M3.j(58, 0L, null);
                }
                anVar.N7(false);
                return;
            }
            int i22 = 12;
            if (i7 != 12) {
                if (i7 == 11) {
                    anVar.Ba(true);
                    return;
                }
                if (i7 == 69) {
                    an.I1(anVar);
                    return;
                }
                if (i7 != 70) {
                    if (i7 == 72) {
                        long j13 = anVar.j6;
                        if (org.telegram.messenger.t3.p0(anVar.e)) {
                            i17 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                            if (org.telegram.messenger.t3.A(i17, anVar.e, 24)) {
                                j13 = anVar.r4;
                                j10 = anVar.j6;
                                long j14 = j13;
                                i16 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                                bi.ea.y(i16, false).g0(j14, j10, false, false);
                                return;
                            }
                        }
                        j10 = 0;
                        long j142 = j13;
                        i16 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                        bi.ea.y(i16, false).g0(j142, j10, false, false);
                        return;
                    }
                    if (i7 == 71) {
                        long j15 = anVar.j6;
                        if (org.telegram.messenger.t3.p0(anVar.e)) {
                            i15 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                            if (org.telegram.messenger.t3.A(i15, anVar.e, 24)) {
                                j15 = anVar.r4;
                                j3 = anVar.j6;
                                long j16 = j15;
                                i14 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                                bi.ea.y(i14, false).C(j16, j3, new bi.o5(this, j16, j3, 2));
                                return;
                            }
                        }
                        j3 = 0;
                        long j162 = j15;
                        i14 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                        bi.ea.y(i14, false).C(j162, j3, new bi.o5(this, j162, j3, 2));
                        return;
                    }
                    if (i7 == 28) {
                        if (anVar.xb == null) {
                            an.N1(anVar);
                            return;
                        } else {
                            anVar.H9();
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
                        boolean z9 = anVar.v6 > 0;
                        anVar.z9();
                        anVar.cd(0, true);
                        anVar.Cd(false);
                        MediaController.g0(anVar.getParentActivity(), anVar.getAccountInstance(), arrayList2, new qi(i18, this, z9));
                        return;
                    }
                    if (i7 == 13) {
                        if (anVar.getParentActivity() == null) {
                            return;
                        }
                        anVar.showDialog(org.telegram.ui.Components.v4.S(anVar.getParentActivity(), anVar.h, anVar.xa).a);
                        return;
                    }
                    int i25 = 14;
                    if (i7 != 15) {
                        int i26 = 16;
                        if (i7 != 16 && i7 != 26) {
                            if (i7 == 17) {
                                if (anVar.f == null || anVar.getParentActivity() == null) {
                                    return;
                                }
                                TextView textView = anVar.Z1;
                                if (textView != null && textView.getTag() != null) {
                                    anVar.Ub(((Integer) anVar.Z1.getTag()).intValue(), null);
                                    return;
                                }
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", anVar.f.id);
                                bundle.putBoolean("addContact", true);
                                anVar.presentFragment(new nr(bundle));
                                return;
                            }
                            if (i7 == 18) {
                                anVar.Ec(false);
                                return;
                            }
                            if (i7 == 24) {
                                try {
                                    org.telegram.messenger.ui mediaDataController = anVar.getMediaDataController();
                                    long j17 = anVar.f.id;
                                    Pattern pattern = org.telegram.messenger.ui.R1;
                                    mediaDataController.y0(j17, 0, null);
                                    return;
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                    return;
                                }
                            }
                            if (i7 == 29) {
                                if (!org.telegram.messenger.t3.N(anVar.e)) {
                                    anVar.getNotificationCenter().k(org.telegram.messenger.qs.n3, Long.valueOf(anVar.j6));
                                    return;
                                }
                                t5 t5Var = new t5(anVar.j6);
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = anVar.R1;
                                t5Var.T = tL_premium_boostsStatus;
                                if (tL_premium_boostsStatus != null) {
                                    t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new l5(t5Var, 0));
                                }
                                anVar.presentFragment(t5Var);
                                return;
                            }
                            if (i7 == 21) {
                                int i27 = oy0.s1;
                                int currentAccount = anVar.getCurrentAccount();
                                Activity parentActivity = anVar.getParentActivity();
                                long a10 = anVar.a();
                                if (parentActivity == null) {
                                    return;
                                }
                                oy0.J0(currentAccount, parentActivity, a10, false, false, new ArrayList(), null, null, new byte[0], null, null);
                                return;
                            }
                            if (i7 == 22) {
                                for (int i28 = 0; i28 < 2; i28++) {
                                    for (int i29 = 0; i29 < sparseArrayArr[i28].size(); i29++) {
                                        org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) sparseArrayArr[i28].valueAt(i29);
                                        anVar.getMediaDataController().d(2, ijVar3, ijVar3.F0(), (int) (System.currentTimeMillis() / 1000), !anVar.p6);
                                    }
                                }
                                anVar.N7(false);
                                return;
                            }
                            if (i7 == 23) {
                                for (int i30 = 1; i30 >= 0; i30--) {
                                    if (ijVar == null && sparseArrayArr3[i30].size() == 1) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i31 = 0; i31 < sparseArrayArr3[i30].size(); i31++) {
                                            arrayList3.add(Integer.valueOf(sparseArrayArr3[i30].keyAt(i31)));
                                        }
                                        ijVar = (org.telegram.messenger.ij) anVar.E6[i30].get(((Integer) arrayList3.get(0)).intValue());
                                    }
                                    sparseArrayArr3[i30].clear();
                                    sparseArrayArr2[i30].clear();
                                    sparseArrayArr[i30].clear();
                                }
                                if (ijVar == null || !ijVar.E4()) {
                                    anVar.Ac(ijVar, false);
                                } else {
                                    anVar.t5 = ijVar;
                                    anVar.ab(org.telegram.messenger.qs.u1);
                                }
                                anVar.z9();
                                anVar.cd(0, true);
                                anVar.Cd(false);
                                return;
                            }
                            if (i7 == 64) {
                                i12 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                                kg.s1 c10 = kg.t1.f(i12).c(anVar.b9());
                                Activity parentActivity2 = anVar.getParentActivity();
                                i13 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                                kg.q1.i0(parentActivity2, i13, anVar.e4, c10, anVar.getResourceProvider(), new org.telegram.messenger.voip.k(i26, this, c10));
                                return;
                            }
                            if (i7 == 14) {
                                org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(0, this.a, anVar.getResourceProvider(), true, true);
                                z0Var.j(org.telegram.messenger.id.M0(2131753953, null), R.drawable.input_attach, null);
                                z0Var.setOnClickListener(new a(this, i22));
                                org.telegram.ui.ActionBar.r0 r0Var = anVar.i0;
                                org.telegram.ui.ActionBar.x xVar = anVar.f0;
                                xVar.a();
                                r0Var.U(z0Var, xVar.m);
                                return;
                            }
                            if (i7 == 30) {
                                anVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/help", anVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                                return;
                            }
                            if (i7 == 31) {
                                anVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/settings", anVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                                return;
                            }
                            if (i7 == 40) {
                                anVar.La(anVar.ca() ? "" : null);
                                return;
                            }
                            if (i7 == 62) {
                                anVar.getMessagesController().s7.J(anVar.a(), false, true);
                                if (anVar.getMessagesController().s7.K(anVar.a(), true)) {
                                    return;
                                }
                                anVar.vd(true);
                                return;
                            }
                            if (i7 == 32 || i7 == 33) {
                                if (anVar.f == null || anVar.getParentActivity() == null) {
                                    return;
                                }
                                TLRPC.User user3 = anVar.f;
                                boolean z10 = i7 == 33;
                                TLRPC.UserFull userFull = anVar.q8;
                                org.telegram.ui.Components.voip.y1.m(user3, z10, userFull != null && userFull.video_calls_available, anVar.getParentActivity(), anVar.getMessagesController().b2(anVar.f.id), anVar.getAccountInstance());
                                return;
                            }
                            if (i7 == 27) {
                                anVar.ac();
                                return;
                            }
                            if (i7 == 60) {
                                if (anVar.q4 == null) {
                                    return;
                                }
                                org.telegram.messenger.k00 k00Var2 = anVar.getMessagesController().q7;
                                long j18 = anVar.e.id;
                                TLRPC.TL_forumTopic tL_forumTopic = anVar.q4;
                                int i32 = tL_forumTopic.id;
                                tL_forumTopic.closed = true;
                                k00Var2.z(i32, j18, true);
                                anVar.wd();
                                anVar.Lc(false);
                                anVar.vd(true);
                                return;
                            }
                            if (i7 == 61) {
                                w91.M0(anVar);
                                return;
                            }
                            if (i7 == 65) {
                                org.telegram.messenger.g0.g(anVar.d4.link);
                                org.telegram.ui.Components.hc.a0(LaunchActivity.Q()).k(false).j();
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
                                                intent.putExtra("android.intent.extra.TEXT", anVar2.d4.link);
                                                anVar2.startActivityForResult(intent, 500);
                                                break;
                                        }
                                    }
                                };
                                if (anVar.Z.t()) {
                                    anVar.Zb(runnable);
                                    return;
                                } else {
                                    runnable.run();
                                    return;
                                }
                            }
                            if (i7 == 67) {
                                Activity parentActivity3 = anVar.getParentActivity();
                                i11 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                                TL_account.TL_businessChatLink tL_businessChatLink = anVar.d4;
                                f6Var = ((org.telegram.ui.ActionBar.f2) anVar).resourceProvider;
                                kg.v.g0(parentActivity3, i11, tL_businessChatLink, f6Var);
                                return;
                            }
                            if (i7 == 68) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar.getParentActivity(), anVar.getResourceProvider());
                                String M0 = org.telegram.messenger.id.M0(2131752707, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.id.M0(2131752708, null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746322, null), new w0(this, 19));
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                anVar.showDialog(u1Var);
                                TextView textView2 = (TextView) u1Var.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, anVar.getResourceProvider());
                                    return;
                                }
                                return;
                            }
                            if (i7 == 75) {
                                if (!anVar.ea() || anVar.y8() == null) {
                                    return;
                                }
                                org.telegram.messenger.g0.v1(anVar.l1);
                                anVar.m0.requestLayout();
                                org.telegram.ui.Components.s01 s01Var2 = anVar.m0;
                                s01Var2.h();
                                s01Var2.a(1.0f, 0.0f);
                                return;
                            }
                            if (i7 == 73) {
                                v81 f02 = v81.f0(-anVar.j6, 0L);
                                f02.D = anVar;
                                anVar.presentFragment(f02);
                                return;
                            } else if (i7 == 888) {
                                anVar.dumpCanvas();
                                return;
                            } else {
                                if (i7 == 889) {
                                    HashSet hashSet = g4.c1;
                                    org.telegram.ui.Components.hc.a0(anVar).t("No rich message copied", null).j();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    if (anVar.getParentActivity() == null) {
                        return;
                    }
                    if (i7 == 15 && org.telegram.messenger.t3.p0(anVar.e)) {
                        if (anVar.r4 == 0 || (a22 = anVar.getMessagesController().a2(Long.valueOf(anVar.r4))) == null) {
                            return;
                        }
                        org.telegram.ui.Components.v4.q(anVar, -1, a22, anVar.e, true, new ni.c(i25, this, a22), anVar.getResourceProvider());
                        return;
                    }
                    TLRPC.ChatFull chatFull2 = anVar.p8;
                    boolean z11 = chatFull2 != null && chatFull2.can_delete_channel;
                    if (i7 != 26) {
                        if (i7 == 15) {
                            i10 = (anVar.h != null || (((user = anVar.f) == null || org.telegram.messenger.t10.B(user) || org.telegram.messenger.t10.x(anVar.f)) && ((chatFull = anVar.p8) == null || !chatFull.can_delete_channel))) ? 15 : 15;
                        }
                        org.telegram.ui.Components.v4.r(anVar, i7 == i10, anVar.e, anVar.f, anVar.h == null ? 0 : 1, true, false, z11, new l2.q(this, i7, z11));
                        return;
                    }
                    boolean z12 = z11;
                    org.telegram.ui.Components.v4.q(anVar, -1, anVar.f, anVar.e, z12, new ri(this, z12), anVar.getResourceProvider());
                    return;
                }
                TLRPC.Chat chat = anVar.e;
                if (chat != null) {
                    anVar.presentFragment(an.ra(-chat.linked_monoforum_id));
                }
            } else if (anVar.getParentActivity() != null) {
                anVar.U7(null, null, false);
            }
        }
    }
}
