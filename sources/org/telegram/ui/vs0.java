package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vs0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vs0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        org.telegram.messenger.zi ziVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        int i11 = this.a;
        org.telegram.ui.ActionBar.j jVar = null;
        boolean z10 = true;
        Object obj = this.b;
        switch (i11) {
            case 0:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (i3 != -1) {
                    if (i3 == 1) {
                        privacyControlActivity.K0();
                        break;
                    }
                } else if (privacyControlActivity.G0(true)) {
                    privacyControlActivity.finishFragment();
                    break;
                }
                break;
            case 1:
                if (i3 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i3 == -1) {
                    ((it0) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i3 == -1) {
                    mv0 mv0Var = profileActivity.O;
                    if (mv0Var == null || !mv0Var.V(true)) {
                        if (!profileActivity.J0) {
                            profileActivity.finishFragment();
                            break;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", profileActivity.f1);
                            bundle.putLong("user_id", profileActivity.e1);
                            profileActivity.presentFragment(new bi.j0(bundle));
                            break;
                        }
                    }
                } else {
                    kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                        jVar = kVar2.getActionBarMenuOnItemClick();
                    }
                    if (jVar != null) {
                        jVar.b(i3);
                        break;
                    }
                }
                break;
            case 4:
                if (i3 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                mx0 mx0Var = (mx0) obj;
                boolean z11 = mx0Var.J;
                org.telegram.messenger.zy zyVar = mx0Var.K;
                if (i3 != -1) {
                    if (i3 == 1 && mx0Var.getParentActivity() != null) {
                        m2.p0 a10 = ui.a.a();
                        a10.p(mx0Var.w);
                        String obj2 = mx0Var.a[0].getText().toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.c = obj2;
                        a10.b = mx0Var.w == 3 ? 0 : Utilities.z(mx0Var.a[1].getText().toString()).intValue();
                        String obj3 = mx0Var.w == 1 ? mx0Var.a[2].getText().toString() : "";
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        a10.d = obj3;
                        String obj4 = mx0Var.w == 1 ? mx0Var.a[3].getText().toString() : "";
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        a10.e = obj4;
                        String obj5 = mx0Var.w != 1 ? mx0Var.a[4].getText().toString() : "";
                        a10.f = obj5 != null ? obj5 : "";
                        zyVar.a = a10.d();
                        SharedPreferences e12 = org.telegram.messenger.hp.e1();
                        SharedPreferences.Editor edit = e12.edit();
                        if (z11) {
                            org.telegram.messenger.az.a(zyVar);
                            org.telegram.messenger.az.B1 = zyVar;
                            edit.putBoolean("proxy_enabled", true);
                        } else {
                            z10 = e12.getBoolean("proxy_enabled", false);
                            org.telegram.messenger.az.z();
                        }
                        if (z11 || org.telegram.messenger.az.B1 == zyVar) {
                            zyVar.a.i(edit);
                            ConnectionsManager.setProxySettings(z10, zyVar.a);
                        }
                        edit.commit();
                        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.A4, new Object[0]);
                        mx0Var.finishFragment();
                        break;
                    }
                } else {
                    mx0Var.finishFragment();
                    break;
                }
                break;
            case 6:
                if (i3 == -1) {
                    ((sx0) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i3 == -1) {
                    ((gy0) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i3 == -1) {
                    ((ny0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i3 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i3 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    break;
                }
                break;
            case 11:
                if (i3 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                c31 c31Var = (c31) obj;
                if (i3 != -1) {
                    if (i3 == 2) {
                        c31Var.k0(new zd0(null));
                        break;
                    }
                } else if (!c31Var.O) {
                    c31Var.finishFragment();
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", c31Var.getUserConfig().e());
                    bundle2.putBoolean("immediate", true);
                    c31Var.presentFragment(new bi.j0(bundle2));
                    break;
                }
                break;
            case 13:
                if (i3 == -1) {
                    ((r41) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i3 != -1) {
                    StickersActivity.i0(stickersActivity, i3);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 15:
                o71 o71Var = (o71) obj;
                if (i3 != -1) {
                    if (i3 == 1) {
                        o71.d0(o71Var);
                        break;
                    }
                } else {
                    o71Var.finishFragment();
                    break;
                }
                break;
            case 16:
                if (i3 == -1) {
                    ((d81) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i3 == -1) {
                    ((s91) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i3 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.Y < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.C0();
                        break;
                    }
                }
                break;
            case 19:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i3 != -1) {
                    if (i3 == 1) {
                        userInfoActivity.h0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 20:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i3 != -1) {
                    if (i3 == 1) {
                        usersSelectActivity.c0();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Wallet.m9 m9Var = (org.telegram.ui.Wallet.m9) obj;
                if (i3 != -1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            m9Var.u0();
                            break;
                        }
                    } else {
                        Activity parentActivity = m9Var.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.d2) m9Var).currentAccount;
                        org.telegram.ui.Wallet.w5.J0(i10, parentActivity, m9Var.getResourceProvider());
                        break;
                    }
                } else {
                    m9Var.finishFragment();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) obj;
                HashSet hashSet = nVar.y;
                if (i3 != -1) {
                    if (i3 != R.id.menu_delete) {
                        if (i3 == R.id.menu_link) {
                            nVar.i0();
                            break;
                        }
                    } else {
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet3 = new HashSet();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            ArrayList arrayList2 = nVar.e.a;
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size) {
                                    Object obj6 = arrayList2.get(i12);
                                    i12++;
                                    ziVar = (org.telegram.messenger.zi) obj6;
                                    if (ziVar == null || ziVar.f1() != intValue) {
                                    }
                                } else {
                                    ziVar = null;
                                }
                            }
                            org.telegram.ui.web.j jVar2 = nVar.f;
                            if (jVar2 != null && ziVar == null) {
                                ArrayList arrayList3 = jVar2.a;
                                int size2 = arrayList3.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size2) {
                                        Object obj7 = arrayList3.get(i13);
                                        i13++;
                                        org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) obj7;
                                        if (ziVar2 != null && ziVar2.f1() == intValue) {
                                            ziVar = ziVar2;
                                        }
                                    }
                                }
                            }
                            if (ziVar != null) {
                                arrayList.add(ziVar);
                                hashSet3.add(Integer.valueOf(ziVar.f1()));
                                hashSet2.add(org.telegram.ui.web.l.a(ziVar));
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nVar.getParentActivity(), nVar.getResourceProvider());
                        String G = org.telegram.messenger.bd.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = G;
                        s1Var.U = org.telegram.messenger.bd.N0(hashSet3.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages");
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new na1(7, nVar, hashSet3));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    }
                } else {
                    kVar3 = ((org.telegram.ui.ActionBar.d2) nVar).actionBar;
                    if (!kVar3.v()) {
                        nVar.finishFragment();
                        break;
                    } else {
                        kVar4 = ((org.telegram.ui.ActionBar.d2) nVar).actionBar;
                        kVar4.u();
                        hashSet.clear();
                        org.telegram.messenger.g0.d0(nVar.a, new ei.e(25));
                        break;
                    }
                }
                break;
            case 23:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                if (i3 == -1) {
                    kVar5 = ((org.telegram.ui.ActionBar.d2) y0Var).actionBar;
                    if (!kVar5.v()) {
                        y0Var.finishFragment();
                        break;
                    } else {
                        kVar6 = ((org.telegram.ui.ActionBar.d2) y0Var).actionBar;
                        kVar6.u();
                        y0Var.w.clear();
                        org.telegram.messenger.g0.d0(y0Var.a, new ei.e(26));
                        break;
                    }
                }
                break;
            default:
                if (i3 == -1) {
                    ((vg.v0) obj).dismiss();
                    break;
                }
                break;
        }
    }
}
