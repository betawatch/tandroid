package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y01 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y01(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        org.telegram.messenger.jj jjVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int i12 = this.a;
        Object obj = this.b;
        switch (i12) {
            case 0:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                e51 e51Var = (e51) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        e51Var.j0(new jf0(null));
                        break;
                    }
                } else if (!e51Var.N) {
                    e51Var.finishFragment();
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", e51Var.getUserConfig().e());
                    bundle.putBoolean("immediate", true);
                    e51Var.presentFragment(new qh.i0(bundle));
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((u61) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i10 != -1) {
                    StickersActivity.h0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 5:
                p91 p91Var = (p91) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        p91.c0(p91Var);
                        break;
                    }
                } else {
                    p91Var.finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((ea1) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((vb1) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.X < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.B0();
                        break;
                    }
                }
                break;
            case 9:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        userInfoActivity.g0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        usersSelectActivity.b0();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) obj;
                if (i10 != -1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            r9Var.t0();
                            break;
                        }
                    } else {
                        Activity parentActivity = r9Var.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.k2) r9Var).currentAccount;
                        org.telegram.ui.Wallet.b6.I0(i11, parentActivity, r9Var.getResourceProvider());
                        break;
                    }
                } else {
                    r9Var.finishFragment();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                HashSet hashSet = mVar.y;
                if (i10 != -1) {
                    if (i10 != R.id.menu_delete) {
                        if (i10 == R.id.menu_link) {
                            mVar.h0();
                            break;
                        }
                    } else {
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet3 = new HashSet();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            ArrayList arrayList2 = mVar.e.a;
                            int size = arrayList2.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size) {
                                    Object obj2 = arrayList2.get(i13);
                                    i13++;
                                    jjVar = (org.telegram.messenger.jj) obj2;
                                    if (jjVar == null || jjVar.f1() != intValue) {
                                    }
                                } else {
                                    jjVar = null;
                                }
                            }
                            org.telegram.ui.web.h hVar = mVar.f;
                            if (hVar != null && jjVar == null) {
                                ArrayList arrayList3 = hVar.a;
                                int size2 = arrayList3.size();
                                int i14 = 0;
                                while (true) {
                                    if (i14 < size2) {
                                        Object obj3 = arrayList3.get(i14);
                                        i14++;
                                        org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) obj3;
                                        if (jjVar2 != null && jjVar2.f1() == intValue) {
                                            jjVar = jjVar2;
                                        }
                                    }
                                }
                            }
                            if (jjVar != null) {
                                arrayList.add(jjVar);
                                hashSet3.add(Integer.valueOf(jjVar.f1()));
                                hashSet2.add(org.telegram.ui.web.j.a(jjVar));
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mVar.getParentActivity(), mVar.getResourceProvider());
                        String G = org.telegram.messenger.cd.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = G;
                        x1Var.T = org.telegram.messenger.cd.M0(hashSet3.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages");
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ep0(28, mVar, hashSet3));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    }
                } else {
                    lVar = ((org.telegram.ui.ActionBar.k2) mVar).actionBar;
                    if (!lVar.u()) {
                        mVar.finishFragment();
                        break;
                    } else {
                        lVar2 = ((org.telegram.ui.ActionBar.k2) mVar).actionBar;
                        lVar2.t();
                        hashSet.clear();
                        org.telegram.messenger.i0.d0(mVar.a, new ag.z0(24));
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                if (i10 == -1) {
                    lVar3 = ((org.telegram.ui.ActionBar.k2) b1Var).actionBar;
                    if (!lVar3.u()) {
                        b1Var.finishFragment();
                        break;
                    } else {
                        lVar4 = ((org.telegram.ui.ActionBar.k2) b1Var).actionBar;
                        lVar4.t();
                        b1Var.w.clear();
                        org.telegram.messenger.i0.d0(b1Var.a, new ag.z0(25));
                        break;
                    }
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((ph.r3) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((rh.i) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                sg.o oVar = (sg.o) obj;
                if (i10 == -1 && !oVar.c0(true)) {
                    oVar.finishFragment();
                    break;
                }
                break;
            case 17:
                vh.k2 k2Var = (vh.k2) obj;
                if (i10 != -1) {
                    if (i10 >= 10) {
                        k2Var.e((org.telegram.messenger.we) k2Var.g0.get(i10 - 10), false);
                        break;
                    }
                } else {
                    Runnable runnable = k2Var.V;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 18:
                if (i10 == -1) {
                    ((xh.o) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((xh.r3) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((yh.e) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((yh.l) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((yh.q) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                yh.a0 a0Var = ((yh.v) obj).n;
                if (i10 != -1) {
                    if (i10 == 3) {
                        a0Var.j1.a(true, true);
                        a0Var.u0(false);
                        a0Var.J1 = null;
                        a0Var.x1.f3.O(true);
                        a0Var.v1.r.getText().clear();
                        a0Var.v1.r.requestFocus();
                        org.telegram.messenger.i0.J3(a0Var.v1.r);
                        break;
                    }
                } else if (!a0Var.E1) {
                    a0Var.r1.d.f3.O(false);
                    a0Var.k1.E(0);
                    break;
                } else {
                    a0Var.dismiss();
                    break;
                }
                break;
            case 24:
                yh.a0 a0Var2 = ((yh.w) obj).r;
                if (i10 != 2) {
                    if (i10 == 3) {
                        a0Var2.i1.a(true, true);
                        a0Var2.u0(false);
                        TextUtils.isEmpty(a0Var2.I1);
                        a0Var2.I1 = null;
                        a0Var2.w1.h(0L, a0Var2.l1, 0L, 0L, null, false, null, true);
                        a0Var2.u1.r.getText().clear();
                        a0Var2.u1.r.requestFocus();
                        org.telegram.messenger.i0.J3(a0Var2.u1.r);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", a0Var2.l1);
                    a0Var2.q1.presentFragment(new yh.l(bundle2));
                    a0Var2.dismiss();
                    break;
                }
                break;
            default:
                yh.a0 a0Var3 = ((yh.v) obj).n;
                if (i10 == -1) {
                    a0Var3.r1.d.f3.O(false);
                    a0Var3.k1.E(0);
                    break;
                }
                break;
        }
    }
}
