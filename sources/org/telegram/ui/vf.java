package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ vf(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.y0 y0Var;
        rj rjVar;
        View sendButton;
        View sendButton2;
        hi.l3 l3Var;
        int i7 = this.a;
        bn bnVar = this.b;
        switch (i7) {
            case 0:
                bnVar.x8(false, true, 0.0f);
                break;
            case 1:
                org.telegram.ui.ActionBar.y0[] y0VarArr = bnVar.k9;
                if (y0VarArr != null && y0VarArr.length > 0 && (y0Var = y0VarArr[0]) != null) {
                    y0Var.requestFocus();
                    bnVar.k9[0].performAccessibilityAction(64, null);
                    bnVar.k9[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 2:
                bnVar.Y5 = null;
                bnVar.B8();
                break;
            case 3:
                bnVar.Y5 = null;
                bnVar.B8();
                break;
            case 4:
                bnVar.x8(false, true, 0.0f);
                break;
            case 5:
                if (bnVar.getParentActivity() != null && bnVar.fragmentView != null && (rjVar = bnVar.a0) != null && (sendButton = rjVar.getSendButton()) != null && bnVar.a0.getEditField() != null && bnVar.a0.getEditField().getText().length() >= 5) {
                    int i10 = org.telegram.messenger.bz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                    org.telegram.messenger.bz.L = System.currentTimeMillis();
                    int i11 = org.telegram.messenger.bz.K + 1;
                    org.telegram.messenger.bz.K = i11;
                    edit.putInt("scheduledOrNoSoundHintShows", i11);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.bz.L);
                    edit.apply();
                    if (bnVar.v2 == null) {
                        hi.l3 E6 = bnVar.E6(280.0f, 3, -1, true);
                        bnVar.v2 = E6;
                        E6.v0 = 0.0f;
                        E6.w0 = org.telegram.messenger.g0.L(56.0f) / 2.0f;
                        bnVar.v2.v(org.telegram.messenger.gd.N0(2131745651, null));
                    }
                    bnVar.v2.z(sendButton, true);
                    bnVar.w2 = true;
                    break;
                }
                break;
            case 6:
                bn.a1(bnVar);
                break;
            case 7:
                if (bnVar.getParentActivity() != null && bnVar.fragmentView != null && bnVar.a0 != null && bnVar.cb == null && bnVar.getMessagesController().P1(bnVar.a()) <= 0 && (sendButton2 = bnVar.a0.getSendButton()) != null && bnVar.a0.getEditField() != null && bnVar.a0.getEditField().getText().length() != 0) {
                    int i12 = org.telegram.messenger.bz.a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.mp.g1().edit();
                    org.telegram.messenger.bz.N = System.currentTimeMillis();
                    int i13 = org.telegram.messenger.bz.M + 1;
                    org.telegram.messenger.bz.M = i13;
                    edit2.putInt("scheduledHintShows", i13);
                    edit2.putLong("scheduledHintSeenAt", org.telegram.messenger.bz.N);
                    edit2.apply();
                    if (bnVar.x2 == null) {
                        hi.l3 E62 = bnVar.E6(280.0f, 3, -1, true);
                        bnVar.x2 = E62;
                        E62.v0 = 0.0f;
                        E62.v(org.telegram.messenger.gd.N0(2131745653, null));
                    }
                    bnVar.x2.z(sendButton2, true);
                    bnVar.y2 = true;
                    break;
                }
                break;
            case 8:
                bnVar.x8(false, true, 0.0f);
                break;
            case 9:
                ArrayList arrayList = bnVar.M6;
                bnVar.lc = System.currentTimeMillis();
                if (bnVar.A0 != null && bnVar.D0 != null) {
                    int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i15 = TLObject.FLAG_31;
                    for (int i16 = 0; i16 < bnVar.A0.getChildCount(); i16++) {
                        View childAt = bnVar.A0.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.r1) {
                            org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) childAt;
                            if (r1Var.getCurrentMessagesGroup() != null) {
                                for (int i17 = 0; i17 < r1Var.getCurrentMessagesGroup().d.size(); i17++) {
                                    int e12 = ((org.telegram.messenger.fj) r1Var.getCurrentMessagesGroup().d.get(i17)).e1();
                                    i14 = Math.min(i14, e12);
                                    i15 = Math.max(i15, e12);
                                }
                            } else if (r1Var.getMessageObject() != null) {
                                int e13 = r1Var.getMessageObject().e1();
                                i14 = Math.min(i14, e13);
                                i15 = Math.max(i15, e13);
                            }
                        }
                    }
                    if (i14 <= i15) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i18);
                            org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) bnVar.P6.f(fjVar.c1());
                            if (ajVar != null) {
                                ArrayList arrayList3 = ajVar.d;
                                if (!arrayList2.contains(Long.valueOf(ajVar.a))) {
                                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                        org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList3.get(i19);
                                        if (fjVar2 != null) {
                                            int e14 = fjVar2.e1();
                                            bnVar.getMessagesController().v7.h(fjVar2, e14 >= i14 + (-7) && e14 <= i15 + 7, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(ajVar.a));
                                }
                            } else {
                                int e15 = fjVar.e1();
                                bnVar.getMessagesController().v7.h(fjVar, e15 >= i14 + (-7) && e15 <= i15 + 7, false);
                            }
                        }
                    }
                }
                if (bnVar.Z4 > 0 && bnVar.X4 != null) {
                    bnVar.getMessagesController().v7.h((org.telegram.messenger.fj) bnVar.X4.get(Integer.valueOf(bnVar.Z4)), true, false);
                }
                bnVar.Ed();
                break;
            case 10:
                bnVar.x8(false, true, 0.0f);
                break;
            case 11:
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, bnVar.getParentActivity(), bnVar.Ba);
                bnVar.Tb = t1Var;
                t1Var.setOnShowListener(new xe(bnVar, 1));
                bnVar.Tb.setOnCancelListener(bnVar.Ja);
                bnVar.Tb.r(500L);
                break;
            case 12:
                bnVar.va();
                break;
            case 13:
                bnVar.x8(false, true, 0.0f);
                break;
            case 14:
                org.telegram.messenger.g0.E2(bnVar.a1);
                break;
            case 15:
                bnVar.c7();
                break;
            case 16:
                bnVar.a = (bnVar.a + 1) % 3;
                break;
            case 17:
                bnVar.b = !bnVar.b;
                break;
            case 18:
                bnVar.D0.N.clear();
                kl klVar = bnVar.D0;
                klVar.M = false;
                klVar.O(true);
                bnVar.wc(false);
                break;
            case 19:
                bnVar.P7(true);
                org.telegram.messenger.f3.n(null, 2131743727, org.telegram.ui.Components.lc.b0(bnVar), R.raw.chats_infotip, 36);
                break;
            case 20:
                bnVar.finishFragment();
                break;
            case 21:
                bnVar.D0.N.clear();
                kl klVar2 = bnVar.D0;
                klVar2.M = false;
                klVar2.O(true);
                bnVar.wc(false);
                break;
            case 22:
                bnVar.Pc = 0;
                bnVar.Qc = false;
                bnVar.A0.g1();
                break;
            case 23:
                bnVar.M9();
                bnVar.O9();
                bnVar.G7();
                bnVar.I7();
                break;
            case 24:
                bnVar.Va = false;
                bnVar.cd();
                break;
            case 25:
                uj ujVar = bnVar.g3;
                if ((ujVar == null || ujVar.getVisibility() != 0) && (l3Var = bnVar.L1) != null) {
                    l3Var.x();
                    break;
                }
                break;
            case 26:
                bnVar.z7();
                break;
            case 27:
                bnVar.p7(false);
                break;
            case 28:
                bnVar.gd(0, bnVar.h6 != 0 && SystemClock.elapsedRealtime() >= bnVar.h6 + 150);
                break;
            default:
                int i20 = bn.md;
                bnVar.o7();
                break;
        }
    }
}
