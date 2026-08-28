package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xe1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xe1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                if (i9 == -1) {
                    ((df1) this.b).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i9 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                    if (twoStepVerificationActivity.T < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.w0();
                        break;
                    }
                }
                break;
            case 2:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.b;
                if (i9 != -1) {
                    if (i9 == 1) {
                        userInfoActivity.b0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 3:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (i9 != -1) {
                    if (i9 == 1) {
                        usersSelectActivity.W();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
                if (i9 == -1) {
                    kVar = ((org.telegram.ui.ActionBar.o2) c1Var).actionBar;
                    if (!kVar.s()) {
                        c1Var.finishFragment();
                        break;
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) c1Var).actionBar;
                        kVar2.r();
                        c1Var.s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) c1Var.a, (d5.d) new ih.e(15));
                        break;
                    }
                }
                break;
            case 5:
                pf.d dVar = (pf.d) this.b;
                if (i9 != -1) {
                    if (i9 == 1) {
                        dVar.W();
                        break;
                    }
                } else if (dVar.onBackPressed(true)) {
                    dVar.finishFragment();
                    break;
                }
                break;
            case 6:
                pf.l lVar = (pf.l) this.b;
                if (i9 != -1) {
                    if (i9 == 1) {
                        lVar.g0();
                        break;
                    }
                } else if (lVar.onBackPressed(true)) {
                    lVar.finishFragment();
                    break;
                }
                break;
            case 7:
                pf.m0 m0Var = (pf.m0) this.b;
                if (i9 != -1) {
                    if (i9 == 1) {
                        m0Var.Z();
                        break;
                    }
                } else if (m0Var.onBackPressed(true)) {
                    m0Var.finishFragment();
                    break;
                }
                break;
            case 8:
                pf.o0 o0Var = (pf.o0) this.b;
                if (i9 != -1) {
                    if (i9 == 1) {
                        o0Var.W();
                        break;
                    }
                } else if (o0Var.onBackPressed(true)) {
                    o0Var.finishFragment();
                    break;
                }
                break;
            case 9:
                pf.w0 w0Var = (pf.w0) this.b;
                if (i9 != -1) {
                    if (i9 == 1) {
                        w0Var.V();
                        break;
                    }
                } else if (w0Var.onBackPressed(true)) {
                    w0Var.finishFragment();
                    break;
                }
                break;
            case 10:
                pf.y0 y0Var = (pf.y0) this.b;
                if (i9 != -1) {
                    if (i9 == 1) {
                        y0Var.c0();
                        break;
                    }
                } else if (y0Var.onBackPressed(true)) {
                    y0Var.finishFragment();
                    break;
                }
                break;
            case 11:
                if (i9 == -1) {
                    ((pf.a1) this.b).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i9 == -1) {
                    ((pf.t1) this.b).finishFragment();
                    break;
                }
                break;
            default:
                if (i9 == -1) {
                    ((zf.x0) this.b).dismiss();
                    break;
                }
                break;
        }
    }
}
