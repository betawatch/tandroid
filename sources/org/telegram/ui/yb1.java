package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yb1 extends f2.z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yb1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // f2.z0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((cd1) this.b).o0 = false;
                    break;
                }
                break;
            case 1:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((yd1) this.b).getParentActivity().getCurrentFocus());
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

    @Override // f2.z0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                cd1 cd1Var = (cd1) this.b;
                cd1Var.r0.f1();
                cd1Var.o0 = true;
                break;
            case 2:
                gf1 gf1Var = (gf1) this.b;
                if (gf1Var.j0 && gf1Var.S.N0() + 5 >= gf1Var.h0) {
                    gf1Var.J(gf1Var.V);
                }
                kf1 kf1Var = gf1Var.q0;
                if (kf1Var.p0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(kf1Var.m0.getSearchField());
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
                            pi1 pi1Var = wallpapersListActivity.G;
                            if (!pi1Var.f && pi1Var.s == 0) {
                                pi1Var.F(pi1Var.h, pi1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
