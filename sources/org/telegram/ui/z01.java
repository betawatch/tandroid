package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z01 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z01(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        org.telegram.messenger.kj kjVar;
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
                c51 c51Var = (c51) obj;
                if (i10 != -1) {
                    if (i10 == 2) {
                        c51Var.k0(new jf0(null));
                        break;
                    }
                } else if (!c51Var.N) {
                    c51Var.finishFragment();
                    break;
                } else {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", c51Var.getUserConfig().e());
                    bundle.putBoolean("immediate", true);
                    c51Var.presentFragment(new qh.i0(bundle));
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((s61) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i10 != -1) {
                    StickersActivity.i0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 5:
                n91 n91Var = (n91) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        n91.d0(n91Var);
                        break;
                    }
                } else {
                    n91Var.finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((ca1) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((tb1) obj).finishFragment();
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
                        twoStepVerificationActivity.C0();
                        break;
                    }
                }
                break;
            case 9:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        userInfoActivity.h0(true);
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
                        usersSelectActivity.c0();
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
                            r9Var.u0();
                            break;
                        }
                    } else {
                        Activity parentActivity = r9Var.getParentActivity();
                        i11 = ((org.telegram.ui.ActionBar.k2) r9Var).currentAccount;
                        org.telegram.ui.Wallet.b6.J0(i11, parentActivity, r9Var.getResourceProvider());
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
                            mVar.i0();
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
                                    kjVar = (org.telegram.messenger.kj) obj2;
                                    if (kjVar == null || kjVar.f1() != intValue) {
                                    }
                                } else {
                                    kjVar = null;
                                }
                            }
                            org.telegram.ui.web.h hVar = mVar.f;
                            if (hVar != null && kjVar == null) {
                                ArrayList arrayList3 = hVar.a;
                                int size2 = arrayList3.size();
                                int i14 = 0;
                                while (true) {
                                    if (i14 < size2) {
                                        Object obj3 = arrayList3.get(i14);
                                        i14++;
                                        org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) obj3;
                                        if (kjVar2 != null && kjVar2.f1() == intValue) {
                                            kjVar = kjVar2;
                                        }
                                    }
                                }
                            }
                            if (kjVar != null) {
                                arrayList.add(kjVar);
                                hashSet3.add(Integer.valueOf(kjVar.f1()));
                                hashSet2.add(org.telegram.ui.web.j.a(kjVar));
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mVar.getParentActivity(), mVar.getResourceProvider());
                        String G = org.telegram.messenger.dd.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = G;
                        x1Var.T = org.telegram.messenger.dd.M0(hashSet3.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages");
                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new cp0(28, mVar, hashSet3));
                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
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
                if (i10 == -1 && !oVar.d0(true)) {
                    oVar.finishFragment();
                    break;
                }
                break;
            case 17:
                vh.k2 k2Var = (vh.k2) obj;
                if (i10 != -1) {
                    if (i10 >= 10) {
                        k2Var.e((org.telegram.messenger.xe) k2Var.g0.get(i10 - 10), false);
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
                    ((xh.s3) obj).finishFragment();
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
                    ((yh.p) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                yh.z zVar = ((yh.u) obj).n;
                if (i10 != -1) {
                    if (i10 == 3) {
                        zVar.j1.a(true, true);
                        zVar.u0(false);
                        zVar.J1 = null;
                        zVar.x1.f3.O(true);
                        zVar.v1.r.getText().clear();
                        zVar.v1.r.requestFocus();
                        org.telegram.messenger.i0.J3(zVar.v1.r);
                        break;
                    }
                } else if (!zVar.E1) {
                    zVar.r1.d.f3.O(false);
                    zVar.k1.E(0);
                    break;
                } else {
                    zVar.dismiss();
                    break;
                }
                break;
            case 24:
                yh.z zVar2 = ((yh.v) obj).r;
                if (i10 != 2) {
                    if (i10 == 3) {
                        zVar2.i1.a(true, true);
                        zVar2.u0(false);
                        TextUtils.isEmpty(zVar2.I1);
                        zVar2.I1 = null;
                        zVar2.w1.h(0L, zVar2.l1, 0L, 0L, null, false, null, true);
                        zVar2.u1.r.getText().clear();
                        zVar2.u1.r.requestFocus();
                        org.telegram.messenger.i0.J3(zVar2.u1.r);
                        break;
                    }
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", zVar2.l1);
                    zVar2.q1.presentFragment(new yh.l(bundle2));
                    zVar2.dismiss();
                    break;
                }
                break;
            default:
                yh.z zVar3 = ((yh.u) obj).n;
                if (i10 == -1) {
                    zVar3.r1.d.f3.O(false);
                    zVar3.k1.E(0);
                    break;
                }
                break;
        }
    }
}
