package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z81 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z81(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.u0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 1:
                if (i10 == 0) {
                    ((vc1) this.b).s0 = false;
                    break;
                }
                break;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((rd1) this.b).getParentActivity().getCurrentFocus());
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
                wallpapersListActivity.f0 = i10 != 0;
                break;
        }
    }

    @Override // s4.u0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                y91 y91Var = (y91) this.b;
                if (y91Var.u0.size() != y91Var.v0.size() && !y91Var.z0 && y91Var.T.N0() > y91Var.W.c0 - 20) {
                    y91Var.g0();
                    break;
                }
                break;
            case 1:
                vc1 vc1Var = (vc1) this.b;
                vc1Var.v0.g1();
                vc1Var.s0 = true;
                break;
            case 3:
                ye1 ye1Var = (ye1) this.b;
                if (ye1Var.o0 && ye1Var.a0.N0() + 5 >= ye1Var.m0) {
                    ye1Var.L(ye1Var.d0);
                }
                cf1 cf1Var = ye1Var.v0;
                if (cf1Var.s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(cf1Var.p0.getSearchField());
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
                            gi1 gi1Var = wallpapersListActivity.H;
                            if (!gi1Var.f && gi1Var.s == 0) {
                                gi1Var.F(gi1Var.h, gi1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
