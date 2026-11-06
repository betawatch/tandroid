package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ xf(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qj qjVar;
        View sendButton;
        View sendButton2;
        fi.m3 m3Var;
        int i7 = this.a;
        an anVar = this.b;
        switch (i7) {
            case 0:
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && (qjVar = anVar.Z) != null && (sendButton = qjVar.getSendButton()) != null && anVar.Z.getEditField() != null && anVar.Z.getEditField().getText().length() >= 5) {
                    int i10 = org.telegram.messenger.iz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    org.telegram.messenger.iz.L = System.currentTimeMillis();
                    int i11 = org.telegram.messenger.iz.K + 1;
                    org.telegram.messenger.iz.K = i11;
                    edit.putInt("scheduledOrNoSoundHintShows", i11);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.iz.L);
                    edit.apply();
                    if (anVar.u2 == null) {
                        fi.m3 D6 = anVar.D6(280.0f, 3, -1, true);
                        anVar.u2 = D6;
                        D6.u0 = 0.0f;
                        D6.v0 = org.telegram.messenger.g0.L(56.0f) / 2.0f;
                        anVar.u2.u(org.telegram.messenger.hd.M0(2131745848, null));
                    }
                    anVar.u2.y(sendButton, true);
                    anVar.v2 = true;
                    break;
                }
                break;
            case 1:
                qj qjVar2 = anVar.Z;
                if (qjVar2 != null && anVar.gd != null) {
                    if (qjVar2.s0()) {
                        anVar.Z.k0(false);
                        org.telegram.messenger.g0.K3(anVar.gd.a);
                        ((te.a) anVar.gd.b.b).a(false, true);
                        break;
                    } else {
                        anVar.Z.U0(false, false, false);
                        anVar.Z.s1();
                        ((te.a) anVar.gd.b.b).a(true, true);
                        break;
                    }
                }
                break;
            case 2:
                anVar.Sa();
                break;
            case 3:
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && anVar.Z != null && anVar.Ya == null && anVar.getMessagesController().N1(anVar.a()) <= 0 && (sendButton2 = anVar.Z.getSendButton()) != null && anVar.Z.getEditField() != null && anVar.Z.getEditField().getText().length() != 0) {
                    int i12 = org.telegram.messenger.iz.a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                    org.telegram.messenger.iz.N = System.currentTimeMillis();
                    int i13 = org.telegram.messenger.iz.M + 1;
                    org.telegram.messenger.iz.M = i13;
                    edit2.putInt("scheduledHintShows", i13);
                    edit2.putLong("scheduledHintSeenAt", org.telegram.messenger.iz.N);
                    edit2.apply();
                    if (anVar.w2 == null) {
                        fi.m3 D62 = anVar.D6(280.0f, 3, -1, true);
                        anVar.w2 = D62;
                        D62.u0 = 0.0f;
                        D62.u(org.telegram.messenger.hd.M0(2131745850, null));
                    }
                    anVar.w2.y(sendButton2, true);
                    anVar.x2 = true;
                    break;
                }
                break;
            case 4:
                anVar.z9();
                anVar.cd(0, true);
                break;
            case 5:
                anVar.v8(false, true, 0.0f);
                break;
            case 6:
                ArrayList arrayList = anVar.K6;
                anVar.hc = System.currentTimeMillis();
                if (anVar.z0 != null && anVar.C0 != null) {
                    int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i15 = TLObject.FLAG_31;
                    for (int i16 = 0; i16 < anVar.z0.getChildCount(); i16++) {
                        View childAt = anVar.z0.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var.getCurrentMessagesGroup() != null) {
                                for (int i17 = 0; i17 < q1Var.getCurrentMessagesGroup().d.size(); i17++) {
                                    int f12 = ((org.telegram.messenger.ij) q1Var.getCurrentMessagesGroup().d.get(i17)).f1();
                                    i14 = Math.min(i14, f12);
                                    i15 = Math.max(i15, f12);
                                }
                            } else if (q1Var.getMessageObject() != null) {
                                int f13 = q1Var.getMessageObject().f1();
                                i14 = Math.min(i14, f13);
                                i15 = Math.max(i15, f13);
                            }
                        }
                    }
                    if (i14 <= i15) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i18);
                            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) anVar.N6.f(ijVar.d1());
                            if (djVar != null) {
                                ArrayList arrayList3 = djVar.d;
                                if (!arrayList2.contains(Long.valueOf(djVar.a))) {
                                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList3.get(i19);
                                        if (ijVar2 != null) {
                                            int f14 = ijVar2.f1();
                                            anVar.getMessagesController().s7.h(ijVar2, f14 >= i14 + (-7) && f14 <= i15 + 7, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(djVar.a));
                                }
                            } else {
                                int f15 = ijVar.f1();
                                anVar.getMessagesController().s7.h(ijVar, f15 >= i14 + (-7) && f15 <= i15 + 7, false);
                            }
                        }
                    }
                }
                if (anVar.X4 > 0 && anVar.V4 != null) {
                    anVar.getMessagesController().s7.h((org.telegram.messenger.ij) anVar.V4.get(Integer.valueOf(anVar.X4)), true, false);
                }
                anVar.Ad();
                break;
            case 7:
                anVar.W5 = null;
                anVar.z8();
                break;
            case 8:
                anVar.W5 = null;
                anVar.z8();
                break;
            case 9:
                anVar.sa();
                break;
            case 10:
                anVar.v8(false, true, 0.0f);
                break;
            case 11:
                an.u0(anVar);
                break;
            case 12:
                anVar.v8(false, true, 0.0f);
                break;
            case 13:
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, anVar.getParentActivity(), anVar.xa);
                anVar.Pb = u1Var;
                u1Var.setOnShowListener(new ye(anVar, 1));
                anVar.Pb.setOnCancelListener(anVar.Fa);
                anVar.Pb.r(500L);
                break;
            case 14:
                org.telegram.messenger.g0.E2(anVar.Z0);
                break;
            case 15:
                anVar.O7(true);
                org.telegram.messenger.k5.o(null, 2131743971, org.telegram.ui.Components.hc.a0(anVar), R.raw.chats_infotip, 36);
                break;
            case 16:
                anVar.b7();
                break;
            case 17:
                anVar.a = (anVar.a + 1) % 3;
                break;
            case 18:
                anVar.b = !anVar.b;
                break;
            case 19:
                anVar.C0.M.clear();
                jl jlVar = anVar.C0;
                jlVar.L = false;
                jlVar.O(true);
                anVar.sc(false);
                break;
            case 20:
                anVar.C0.M.clear();
                jl jlVar2 = anVar.C0;
                jlVar2.L = false;
                jlVar2.O(true);
                anVar.sc(false);
                break;
            case 21:
                anVar.Ra = false;
                anVar.Yc();
                break;
            case 22:
                anVar.Lc = 0;
                anVar.Mc = false;
                anVar.z0.g1();
                break;
            case 23:
                anVar.K9();
                anVar.M9();
                anVar.F7();
                anVar.H7();
                break;
            case 24:
                anVar.cd(0, anVar.f6 != 0 && SystemClock.elapsedRealtime() >= anVar.f6 + 150);
                break;
            case 25:
                tj tjVar = anVar.f3;
                if ((tjVar == null || tjVar.getVisibility() != 0) && (m3Var = anVar.K1) != null) {
                    m3Var.w();
                    break;
                }
                break;
            case 26:
                anVar.y7();
                break;
            case 27:
                anVar.o7(false);
                break;
            case 28:
                FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 87);
                e10.bottomMargin = anVar.Z.getMeasuredHeight();
                anVar.l1.addView(anVar.M1, e10);
                anVar.M1.setTranslationY(-org.telegram.messenger.g0.n);
                anVar.M1.p(0.0f, anVar.Z.getEmojiButton().getX() + org.telegram.messenger.g0.L(22.0f));
                anVar.M1.w();
                break;
            default:
                int i20 = an.id;
                anVar.n7();
                break;
        }
    }
}
