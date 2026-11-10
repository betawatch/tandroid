package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ xf(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj sjVar;
        View sendButton;
        org.telegram.ui.ActionBar.z0 z0Var;
        View sendButton2;
        fi.m3 m3Var;
        int i7 = this.a;
        cn cnVar = this.b;
        switch (i7) {
            case 0:
                cnVar.w8(false, true, 0.0f);
                break;
            case 1:
                if (cnVar.getParentActivity() != null && cnVar.fragmentView != null && (sjVar = cnVar.Z) != null && (sendButton = sjVar.getSendButton()) != null && cnVar.Z.getEditField() != null && cnVar.Z.getEditField().getText().length() >= 5) {
                    int i10 = org.telegram.messenger.iz.a;
                    SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                    org.telegram.messenger.iz.L = System.currentTimeMillis();
                    int i11 = org.telegram.messenger.iz.K + 1;
                    org.telegram.messenger.iz.K = i11;
                    edit.putInt("scheduledOrNoSoundHintShows", i11);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", org.telegram.messenger.iz.L);
                    edit.apply();
                    if (cnVar.u2 == null) {
                        fi.m3 E6 = cnVar.E6(280.0f, 3, -1, true);
                        cnVar.u2 = E6;
                        E6.u0 = 0.0f;
                        E6.v0 = org.telegram.messenger.g0.L(56.0f) / 2.0f;
                        cnVar.u2.u(org.telegram.messenger.id.M0(2131745847, null));
                    }
                    cnVar.u2.y(sendButton, true);
                    cnVar.v2 = true;
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.z0[] z0VarArr = cnVar.i9;
                if (z0VarArr != null && z0VarArr.length > 0 && (z0Var = z0VarArr[0]) != null) {
                    z0Var.requestFocus();
                    cnVar.i9[0].performAccessibilityAction(64, null);
                    cnVar.i9[0].sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 3:
                cnVar.W5 = null;
                cnVar.A8();
                break;
            case 4:
                cnVar.W5 = null;
                cnVar.A8();
                break;
            case 5:
                if (cnVar.getParentActivity() != null && cnVar.fragmentView != null && cnVar.Z != null && cnVar.ab == null && cnVar.getMessagesController().N1(cnVar.a()) <= 0 && (sendButton2 = cnVar.Z.getSendButton()) != null && cnVar.Z.getEditField() != null && cnVar.Z.getEditField().getText().length() != 0) {
                    int i12 = org.telegram.messenger.iz.a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.qp.e1().edit();
                    org.telegram.messenger.iz.N = System.currentTimeMillis();
                    int i13 = org.telegram.messenger.iz.M + 1;
                    org.telegram.messenger.iz.M = i13;
                    edit2.putInt("scheduledHintShows", i13);
                    edit2.putLong("scheduledHintSeenAt", org.telegram.messenger.iz.N);
                    edit2.apply();
                    if (cnVar.w2 == null) {
                        fi.m3 E62 = cnVar.E6(280.0f, 3, -1, true);
                        cnVar.w2 = E62;
                        E62.u0 = 0.0f;
                        E62.u(org.telegram.messenger.id.M0(2131745849, null));
                    }
                    cnVar.w2.y(sendButton2, true);
                    cnVar.x2 = true;
                    break;
                }
                break;
            case 6:
                cnVar.w8(false, true, 0.0f);
                break;
            case 7:
                ArrayList arrayList = cnVar.K6;
                cnVar.jc = System.currentTimeMillis();
                if (cnVar.z0 != null && cnVar.C0 != null) {
                    int i14 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    int i15 = TLObject.FLAG_31;
                    for (int i16 = 0; i16 < cnVar.z0.getChildCount(); i16++) {
                        View childAt = cnVar.z0.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                            if (q1Var.getCurrentMessagesGroup() != null) {
                                for (int i17 = 0; i17 < q1Var.getCurrentMessagesGroup().d.size(); i17++) {
                                    int e12 = ((org.telegram.messenger.ij) q1Var.getCurrentMessagesGroup().d.get(i17)).e1();
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
                            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i18);
                            org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) cnVar.N6.f(ijVar.c1());
                            if (djVar != null) {
                                ArrayList arrayList3 = djVar.d;
                                if (!arrayList2.contains(Long.valueOf(djVar.a))) {
                                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                                        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList3.get(i19);
                                        if (ijVar2 != null) {
                                            int e14 = ijVar2.e1();
                                            cnVar.getMessagesController().s7.h(ijVar2, e14 >= i14 + (-7) && e14 <= i15 + 7, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(djVar.a));
                                }
                            } else {
                                int e15 = ijVar.e1();
                                cnVar.getMessagesController().s7.h(ijVar, e15 >= i14 + (-7) && e15 <= i15 + 7, false);
                            }
                        }
                    }
                }
                if (cnVar.X4 > 0 && cnVar.V4 != null) {
                    cnVar.getMessagesController().s7.h((org.telegram.messenger.ij) cnVar.V4.get(Integer.valueOf(cnVar.X4)), true, false);
                }
                cnVar.Dd();
                break;
            case 8:
                cn.a1(cnVar);
                break;
            case 9:
                cnVar.ua();
                break;
            case 10:
                cnVar.w8(false, true, 0.0f);
                break;
            case 11:
                cnVar.w8(false, true, 0.0f);
                break;
            case 12:
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, cnVar.getParentActivity(), cnVar.za);
                cnVar.Rb = u1Var;
                u1Var.setOnShowListener(new ze(cnVar, 1));
                cnVar.Rb.setOnCancelListener(cnVar.Ha);
                cnVar.Rb.r(500L);
                break;
            case 13:
                cnVar.w8(false, true, 0.0f);
                break;
            case 14:
                org.telegram.messenger.g0.E2(cnVar.Z0);
                break;
            case 15:
                cnVar.c7();
                break;
            case 16:
                cnVar.a = (cnVar.a + 1) % 3;
                break;
            case 17:
                cnVar.b = !cnVar.b;
                break;
            case 18:
                cnVar.C0.M.clear();
                ll llVar = cnVar.C0;
                llVar.L = false;
                llVar.O(true);
                cnVar.vc(false);
                break;
            case 19:
                cnVar.P7(true);
                org.telegram.messenger.k5.o(null, 2131743970, org.telegram.ui.Components.gc.a0(cnVar), R.raw.chats_infotip, 36);
                break;
            case 20:
                cnVar.C0.M.clear();
                ll llVar2 = cnVar.C0;
                llVar2.L = false;
                llVar2.O(true);
                cnVar.vc(false);
                break;
            case 21:
                cnVar.Ta = false;
                cnVar.bd();
                break;
            case 22:
                cnVar.Nc = 0;
                cnVar.Oc = false;
                cnVar.z0.g1();
                break;
            case 23:
                cnVar.L9();
                cnVar.N9();
                cnVar.G7();
                cnVar.I7();
                break;
            case 24:
                cnVar.fd(0, cnVar.f6 != 0 && SystemClock.elapsedRealtime() >= cnVar.f6 + 150);
                break;
            case 25:
                vj vjVar = cnVar.f3;
                if ((vjVar == null || vjVar.getVisibility() != 0) && (m3Var = cnVar.K1) != null) {
                    m3Var.w();
                    break;
                }
                break;
            case 26:
                cnVar.z7();
                break;
            case 27:
                cnVar.p7(false);
                break;
            case 28:
                FrameLayout.LayoutParams e10 = c8.ha.e(-1, -2, 87);
                e10.bottomMargin = cnVar.Z.getMeasuredHeight();
                cnVar.l1.addView(cnVar.M1, e10);
                cnVar.M1.setTranslationY(-org.telegram.messenger.g0.n);
                cnVar.M1.p(0.0f, cnVar.Z.getEmojiButton().getX() + org.telegram.messenger.g0.L(22.0f));
                cnVar.M1.w();
                break;
            default:
                int i20 = cn.kd;
                cnVar.o7();
                break;
        }
    }
}
