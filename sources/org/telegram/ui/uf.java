package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ uf(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.z0 z0Var;
        qj qjVar;
        View sendButton;
        View sendButton2;
        hi.l3 l3Var;
        int i7 = this.a;
        an anVar = this.b;
        switch (i7) {
            case 0:
                anVar.x8(false, true, 0.0f);
                break;
            case 1:
                org.telegram.ui.ActionBar.z0[] z0VarArr = anVar.j9;
                if (z0VarArr != null && z0VarArr.length > 0 && (z0Var = z0VarArr[0]) != null) {
                    z0Var.requestFocus();
                    anVar.j9[0].performAccessibilityAction(64, null);
                    anVar.j9[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 2:
                anVar.X5 = null;
                anVar.B8();
                break;
            case 3:
                anVar.X5 = null;
                anVar.B8();
                break;
            case 4:
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && (qjVar = anVar.a0) != null && (sendButton = qjVar.getSendButton()) != null && anVar.a0.getEditField() != null && anVar.a0.getEditField().getText().length() >= 5) {
                    int i10 = org.telegram.messenger.gz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    org.telegram.messenger.gz.L = System.currentTimeMillis();
                    int i11 = org.telegram.messenger.gz.K + 1;
                    org.telegram.messenger.gz.K = i11;
                    edit.putInt("scheduledOrNoSoundHintShows", i11);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.gz.L);
                    edit.apply();
                    if (anVar.v2 == null) {
                        hi.l3 E6 = anVar.E6(280.0f, 3, -1, true);
                        anVar.v2 = E6;
                        E6.v0 = 0.0f;
                        E6.w0 = org.telegram.messenger.g0.L(56.0f) / 2.0f;
                        anVar.v2.u(org.telegram.messenger.hd.M0(2131745847, null));
                    }
                    anVar.v2.y(sendButton, true);
                    anVar.w2 = true;
                    break;
                }
                break;
            case 5:
                anVar.x8(false, true, 0.0f);
                break;
            case 6:
                if (anVar.getParentActivity() != null && anVar.fragmentView != null && anVar.a0 != null && anVar.bb == null && anVar.getMessagesController().N1(anVar.a()) <= 0 && (sendButton2 = anVar.a0.getSendButton()) != null && anVar.a0.getEditField() != null && anVar.a0.getEditField().getText().length() != 0) {
                    int i12 = org.telegram.messenger.gz.a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.np.e1().edit();
                    org.telegram.messenger.gz.N = System.currentTimeMillis();
                    int i13 = org.telegram.messenger.gz.M + 1;
                    org.telegram.messenger.gz.M = i13;
                    edit2.putInt("scheduledHintShows", i13);
                    edit2.putLong("scheduledHintSeenAt", org.telegram.messenger.gz.N);
                    edit2.apply();
                    if (anVar.x2 == null) {
                        hi.l3 E62 = anVar.E6(280.0f, 3, -1, true);
                        anVar.x2 = E62;
                        E62.v0 = 0.0f;
                        E62.u(org.telegram.messenger.hd.M0(2131745849, null));
                    }
                    anVar.x2.y(sendButton2, true);
                    anVar.y2 = true;
                    break;
                }
                break;
            case 7:
                an.a1(anVar);
                break;
            case 8:
                ArrayList arrayList = anVar.L6;
                anVar.kc = System.currentTimeMillis();
                if (anVar.A0 != null && anVar.D0 != null) {
                    int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i15 = TLObject.FLAG_31;
                    for (int i16 = 0; i16 < anVar.A0.getChildCount(); i16++) {
                        View childAt = anVar.A0.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var.getCurrentMessagesGroup() != null) {
                                for (int i17 = 0; i17 < q1Var.getCurrentMessagesGroup().d.size(); i17++) {
                                    int e12 = ((org.telegram.messenger.gj) q1Var.getCurrentMessagesGroup().d.get(i17)).e1();
                                    i14 = Math.min(i14, e12);
                                    i15 = Math.max(i15, e12);
                                }
                            } else if (q1Var.getMessageObject() != null) {
                                int e13 = q1Var.getMessageObject().e1();
                                i14 = Math.min(i14, e13);
                                i15 = Math.max(i15, e13);
                            }
                        }
                    }
                    if (i14 <= i15) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i18);
                            org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) anVar.O6.f(gjVar.c1());
                            if (bjVar != null) {
                                ArrayList arrayList3 = bjVar.d;
                                if (!arrayList2.contains(Long.valueOf(bjVar.a))) {
                                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                        org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) arrayList3.get(i19);
                                        if (gjVar2 != null) {
                                            int e14 = gjVar2.e1();
                                            anVar.getMessagesController().t7.h(gjVar2, e14 >= i14 + (-7) && e14 <= i15 + 7, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(bjVar.a));
                                }
                            } else {
                                int e15 = gjVar.e1();
                                anVar.getMessagesController().t7.h(gjVar, e15 >= i14 + (-7) && e15 <= i15 + 7, false);
                            }
                        }
                    }
                }
                if (anVar.Y4 > 0 && anVar.W4 != null) {
                    anVar.getMessagesController().t7.h((org.telegram.messenger.gj) anVar.W4.get(Integer.valueOf(anVar.Y4)), true, false);
                }
                anVar.Ed();
                break;
            case 9:
                anVar.x8(false, true, 0.0f);
                break;
            case 10:
                anVar.va();
                break;
            case 11:
                anVar.x8(false, true, 0.0f);
                break;
            case 12:
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, anVar.getParentActivity(), anVar.Aa);
                anVar.Sb = t1Var;
                t1Var.setOnShowListener(new we(anVar, 1));
                anVar.Sb.setOnCancelListener(anVar.Ia);
                anVar.Sb.r(500L);
                break;
            case 13:
                anVar.finishFragment();
                break;
            case 14:
                anVar.x8(false, true, 0.0f);
                break;
            case 15:
                org.telegram.messenger.g0.E2(anVar.a1);
                break;
            case 16:
                anVar.c7();
                break;
            case 17:
                anVar.a = (anVar.a + 1) % 3;
                break;
            case 18:
                anVar.b = !anVar.b;
                break;
            case 19:
                anVar.D0.N.clear();
                jl jlVar = anVar.D0;
                jlVar.M = false;
                jlVar.O(true);
                anVar.wc(false);
                break;
            case 20:
                anVar.P7(true);
                org.telegram.messenger.k5.n(null, 2131743970, org.telegram.ui.Components.cc.a0(anVar), R.raw.chats_infotip, 36);
                break;
            case 21:
                anVar.D0.N.clear();
                jl jlVar2 = anVar.D0;
                jlVar2.M = false;
                jlVar2.O(true);
                anVar.wc(false);
                break;
            case 22:
                anVar.Oc = 0;
                anVar.Pc = false;
                anVar.A0.g1();
                break;
            case 23:
                anVar.Ua = false;
                anVar.cd();
                break;
            case 24:
                anVar.M9();
                anVar.O9();
                anVar.G7();
                anVar.I7();
                break;
            case 25:
                tj tjVar = anVar.g3;
                if ((tjVar == null || tjVar.getVisibility() != 0) && (l3Var = anVar.L1) != null) {
                    l3Var.w();
                    break;
                }
                break;
            case 26:
                anVar.z7();
                break;
            case 27:
                anVar.gd(0, anVar.g6 != 0 && SystemClock.elapsedRealtime() >= anVar.g6 + 150);
                break;
            case 28:
                anVar.p7(false);
                break;
            default:
                int i20 = an.ld;
                anVar.o7();
                break;
        }
    }
}
