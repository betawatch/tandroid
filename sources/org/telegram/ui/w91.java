package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class w91 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w91(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 1:
                if (i10 == 0) {
                    ((rd1) this.b).r0 = false;
                    break;
                }
                break;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((ne1) this.b).getParentActivity().getCurrentFocus());
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
                va1 va1Var = (va1) this.b;
                if (va1Var.u0.size() != va1Var.v0.size() && !va1Var.z0 && va1Var.T.N0() > va1Var.W.c0 - 20) {
                    va1Var.f0();
                    break;
                }
                break;
            case 1:
                rd1 rd1Var = (rd1) this.b;
                rd1Var.u0.h1();
                rd1Var.r0 = true;
                break;
            case 3:
                uf1 uf1Var = (uf1) this.b;
                if (uf1Var.n0 && uf1Var.W.N0() + 5 >= uf1Var.l0) {
                    uf1Var.L(uf1Var.c0);
                }
                yf1 yf1Var = uf1Var.u0;
                if (yf1Var.s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(yf1Var.p0.getSearchField());
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
                            bj1 bj1Var = wallpapersListActivity.H;
                            if (!bj1Var.f && bj1Var.s == 0) {
                                bj1Var.F(bj1Var.h, bj1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
