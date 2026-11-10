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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qt0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qt0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i7) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i10;
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        int i11 = this.a;
        int i12 = 29;
        org.telegram.ui.ActionBar.k kVar = null;
        boolean z9 = true;
        Object obj = this.b;
        switch (i11) {
            case 0:
                if (i7 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i7 == -1) {
                    ((vt0) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i7 == -1) {
                    yv0 yv0Var = profileActivity.N;
                    if (yv0Var == null || !yv0Var.V(true)) {
                        if (!profileActivity.I0) {
                            profileActivity.finishFragment();
                            break;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", profileActivity.e1);
                            bundle.putLong("user_id", profileActivity.d1);
                            profileActivity.presentFragment(new ai.s0(bundle));
                            break;
                        }
                    }
                } else {
                    lVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                    if (lVar != null) {
                        lVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                        kVar = lVar2.getActionBarMenuOnItemClick();
                    }
                    if (kVar != null) {
                        kVar.b(i7);
                        break;
                    }
                }
                break;
            case 3:
                if (i7 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                zx0 zx0Var = (zx0) obj;
                boolean z10 = zx0Var.I;
                org.telegram.messenger.hz hzVar = zx0Var.J;
                if (i7 != -1) {
                    if (i7 == 1 && zx0Var.getParentActivity() != null) {
                        n2.n0 a10 = ui.a.a();
                        a10.p(zx0Var.w);
                        String obj2 = zx0Var.a[0].getText().toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.c = obj2;
                        a10.b = zx0Var.w == 3 ? 0 : Utilities.z(zx0Var.a[1].getText().toString()).intValue();
                        String obj3 = zx0Var.w == 1 ? zx0Var.a[2].getText().toString() : "";
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        a10.d = obj3;
                        String obj4 = zx0Var.w == 1 ? zx0Var.a[3].getText().toString() : "";
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        a10.e = obj4;
                        String obj5 = zx0Var.w != 1 ? zx0Var.a[4].getText().toString() : "";
                        a10.f = obj5 != null ? obj5 : "";
                        hzVar.a = a10.d();
                        SharedPreferences e12 = org.telegram.messenger.qp.e1();
                        SharedPreferences.Editor edit = e12.edit();
                        if (z10) {
                            org.telegram.messenger.iz.a(hzVar);
                            org.telegram.messenger.iz.B1 = hzVar;
                            edit.putBoolean("proxy_enabled", true);
                        } else {
                            z9 = e12.getBoolean("proxy_enabled", false);
                            org.telegram.messenger.iz.z();
                        }
                        if (z10 || org.telegram.messenger.iz.B1 == hzVar) {
                            hzVar.a.i(edit);
                            ConnectionsManager.setProxySettings(z9, hzVar.a);
                        }
                        edit.commit();
                        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.A4, new Object[0]);
                        zx0Var.finishFragment();
                        break;
                    }
                } else {
                    zx0Var.finishFragment();
                    break;
                }
                break;
            case 5:
                if (i7 == -1) {
                    ((fy0) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i7 == -1) {
                    ((uy0) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i7 == -1) {
                    ((bz0) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i7 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i7 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    break;
                }
                break;
            case 10:
                if (i7 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                o31 o31Var = (o31) obj;
                if (i7 != -1) {
                    if (i7 == 2) {
                        o31Var.k0(new he0(null));
                        break;
                    }
                } else if (!o31Var.N) {
                    o31Var.finishFragment();
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", o31Var.getUserConfig().e());
                    bundle2.putBoolean("immediate", true);
                    o31Var.presentFragment(new ai.s0(bundle2));
                    break;
                }
                break;
            case 12:
                if (i7 == -1) {
                    ((e51) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i7 != -1) {
                    StickersActivity.i0(stickersActivity, i7);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 14:
                a81 a81Var = (a81) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        a81.d0(a81Var);
                        break;
                    }
                } else {
                    a81Var.finishFragment();
                    break;
                }
                break;
            case 15:
                if (i7 == -1) {
                    ((p81) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i7 == -1) {
                    ((fa1) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i7 == -1) {
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
            case 18:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        userInfoActivity.h0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 19:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        usersSelectActivity.c0();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) obj;
                if (i7 != -1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            o9Var.u0();
                            break;
                        }
                    } else {
                        Activity parentActivity = o9Var.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.f2) o9Var).currentAccount;
                        org.telegram.ui.Wallet.z5.J0(i10, parentActivity, o9Var.getResourceProvider());
                        break;
                    }
                } else {
                    o9Var.finishFragment();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.web.l lVar7 = (org.telegram.ui.web.l) obj;
                HashSet hashSet = lVar7.y;
                if (i7 != -1) {
                    if (i7 != R.id.menu_delete) {
                        if (i7 == R.id.menu_link) {
                            lVar7.i0();
                            break;
                        }
                    } else {
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet3 = new HashSet();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            ArrayList arrayList2 = lVar7.e.a;
                            int size = arrayList2.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size) {
                                    Object obj6 = arrayList2.get(i13);
                                    i13++;
                                    ijVar = (org.telegram.messenger.ij) obj6;
                                    if (ijVar == null || ijVar.e1() != intValue) {
                                    }
                                } else {
                                    ijVar = null;
                                }
                            }
                            org.telegram.ui.web.h hVar = lVar7.f;
                            if (hVar != null && ijVar == null) {
                                ArrayList arrayList3 = hVar.a;
                                int size2 = arrayList3.size();
                                int i14 = 0;
                                while (true) {
                                    if (i14 < size2) {
                                        Object obj7 = arrayList3.get(i14);
                                        i14++;
                                        org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj7;
                                        if (ijVar2 != null && ijVar2.e1() == intValue) {
                                            ijVar = ijVar2;
                                        }
                                    }
                                }
                            }
                            if (ijVar != null) {
                                arrayList.add(ijVar);
                                hashSet3.add(Integer.valueOf(ijVar.e1()));
                                hashSet2.add(org.telegram.ui.web.j.a(ijVar));
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, lVar7.getParentActivity(), lVar7.getResourceProvider());
                        String G = org.telegram.messenger.id.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = G;
                        u1Var.T = org.telegram.messenger.id.N0(hashSet3.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages");
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ok0(29, lVar7, hashSet3));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    }
                } else {
                    lVar3 = ((org.telegram.ui.ActionBar.f2) lVar7).actionBar;
                    if (!lVar3.x()) {
                        lVar7.finishFragment();
                        break;
                    } else {
                        lVar4 = ((org.telegram.ui.ActionBar.f2) lVar7).actionBar;
                        lVar4.w();
                        hashSet.clear();
                        org.telegram.messenger.g0.d0(lVar7.a, new di.e(28));
                        break;
                    }
                }
                break;
            case 22:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                if (i7 == -1) {
                    lVar5 = ((org.telegram.ui.ActionBar.f2) z0Var).actionBar;
                    if (!lVar5.x()) {
                        z0Var.finishFragment();
                        break;
                    } else {
                        lVar6 = ((org.telegram.ui.ActionBar.f2) z0Var).actionBar;
                        lVar6.w();
                        z0Var.w.clear();
                        org.telegram.messenger.g0.d0(z0Var.a, new di.e(i12));
                        break;
                    }
                }
                break;
            case 23:
                if (i7 == -1) {
                    ((ug.w0) obj).dismiss();
                    break;
                }
                break;
            default:
                if (i7 == -1) {
                    ((zh.m3) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
