package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class x81 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x81(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.u0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 1:
                if (i10 == 0) {
                    ((tc1) this.b).s0 = false;
                    break;
                }
                break;
            case 2:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(((pd1) this.b).getParentActivity().getCurrentFocus());
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
                w91 w91Var = (w91) this.b;
                if (w91Var.u0.size() != w91Var.v0.size() && !w91Var.z0 && w91Var.T.N0() > w91Var.W.c0 - 20) {
                    w91Var.g0();
                    break;
                }
                break;
            case 1:
                tc1 tc1Var = (tc1) this.b;
                tc1Var.v0.g1();
                tc1Var.s0 = true;
                break;
            case 3:
                we1 we1Var = (we1) this.b;
                if (we1Var.o0 && we1Var.a0.N0() + 5 >= we1Var.m0) {
                    we1Var.L(we1Var.d0);
                }
                af1 af1Var = we1Var.v0;
                if (af1Var.s0) {
                    if (i10 != 0 || i11 != 0) {
                        AndroidUtilities.hideKeyboard(af1Var.p0.getSearchField());
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
                            ei1 ei1Var = wallpapersListActivity.H;
                            if (!ei1Var.f && ei1Var.s == 0) {
                                ei1Var.F(ei1Var.h, ei1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
