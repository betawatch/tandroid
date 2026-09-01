package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zb1 extends f2.a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.a1
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((ed1) this.b).o0 = false;
                    break;
                }
                break;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((be1) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 3:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.b).c);
                    break;
                }
                break;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.g0 = i10 != 0;
                break;
        }
    }

    @Override // f2.a1
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                ed1 ed1Var = (ed1) this.b;
                ed1Var.r0.f1();
                ed1Var.o0 = true;
                break;
            case 2:
                if1 if1Var = (if1) this.b;
                if (if1Var.j0 && if1Var.S.N0() + 5 >= if1Var.h0) {
                    if1Var.J(if1Var.V);
                }
                mf1 mf1Var = if1Var.q0;
                if (mf1Var.p0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(mf1Var.m0.getSearchField());
                        break;
                    }
                }
                break;
            case 4:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.E.getAdapter() == wallpapersListActivity.G) {
                    int L0 = wallpapersListActivity.H.L0();
                    int abs = L0 == -1 ? 0 : Math.abs(wallpapersListActivity.H.N0() - L0) + 1;
                    if (abs > 0) {
                        int B = wallpapersListActivity.H.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            si1 si1Var = wallpapersListActivity.G;
                            if (!si1Var.f && si1Var.s == 0) {
                                si1Var.F(si1Var.h, si1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
