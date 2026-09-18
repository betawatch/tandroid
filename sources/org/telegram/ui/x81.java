package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class x81 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x81(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                g91 g91Var = (g91) this.b;
                if (i10 != -1) {
                    if (i10 == 2) {
                        g91Var.l0(new ah0(null));
                        break;
                    }
                } else {
                    g91Var.finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((ab1) this.b).finishFragment();
                    break;
                }
                break;
            case 2:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                if (i10 != -1) {
                    StickersActivity.d0(stickersActivity, i10);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 3:
                ce1 ce1Var = (ce1) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        ce1.Y(ce1Var);
                        break;
                    }
                } else {
                    ce1Var.finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((ue1) this.b).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((lg1) this.b).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.b;
                    if (twoStepVerificationActivity.X < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.x0();
                        break;
                    }
                }
                break;
            case 7:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        userInfoActivity.c0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 8:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (i10 != -1) {
                    if (i10 == 1) {
                        usersSelectActivity.X();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) this.b;
                if (i10 == -1) {
                    kVar = ((org.telegram.ui.ActionBar.o2) h1Var).actionBar;
                    if (!kVar.s()) {
                        h1Var.finishFragment();
                        break;
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) h1Var).actionBar;
                        kVar2.r();
                        h1Var.v.clear();
                        AndroidUtilities.forEachViews((RecyclerView) h1Var.a, (e2.h) new org.telegram.ui.web.m(1));
                        break;
                    }
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((rg.x0) this.b).dismiss();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((xh.h4) this.b).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((yh.g) this.b).finishFragment();
                    break;
                }
                break;
            default:
                zg.q qVar = (zg.q) this.b;
                if (i10 == -1 && !qVar.X(true)) {
                    qVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
