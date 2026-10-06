package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class u91 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u91(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 1:
                if (i10 == 0) {
                    ((pd1) this.b).r0 = false;
                    break;
                }
                break;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((le1) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((UsersSelectActivity) this.b).c);
                    break;
                }
                break;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.h0 = i10 != 0;
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                ta1 ta1Var = (ta1) this.b;
                if (ta1Var.u0.size() != ta1Var.v0.size() && !ta1Var.z0 && ta1Var.T.N0() > ta1Var.W.c0 - 20) {
                    ta1Var.f0();
                    break;
                }
                break;
            case 1:
                pd1 pd1Var = (pd1) this.b;
                pd1Var.u0.g1();
                pd1Var.r0 = true;
                break;
            case 3:
                sf1 sf1Var = (sf1) this.b;
                if (sf1Var.o0 && sf1Var.a0.N0() + 5 >= sf1Var.m0) {
                    sf1Var.L(sf1Var.d0);
                }
                wf1 wf1Var = sf1Var.v0;
                if (wf1Var.s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(wf1Var.p0.getSearchField());
                        break;
                    }
                }
                break;
            case 5:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.F.getAdapter() == wallpapersListActivity.H) {
                    int L0 = wallpapersListActivity.I.L0();
                    int abs = L0 == -1 ? 0 : Math.abs(wallpapersListActivity.I.N0() - L0) + 1;
                    if (abs > 0) {
                        int B = wallpapersListActivity.I.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            zi1 zi1Var = wallpapersListActivity.H;
                            if (!zi1Var.f && zi1Var.s == 0) {
                                zi1Var.F(zi1Var.h, zi1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
