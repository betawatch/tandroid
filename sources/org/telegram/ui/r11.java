package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r11 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r11(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // u4.t0
    public void a(RecyclerView recyclerView, int i3) {
        switch (this.a) {
            case 1:
                if (i3 == 0) {
                    c31 c31Var = (c31) this.b;
                    if (c31Var.F != null) {
                        org.telegram.ui.ActionBar.f5 f5Var = c31Var.d;
                        if (f5Var == null || !f5Var.w()) {
                            float f10 = c31Var.Y;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 < 0.5f) {
                                    c31Var.c.w0(0, (int) Math.ceil(c31Var.Z - c31Var.b0), org.telegram.ui.Components.xq.h);
                                    break;
                                } else {
                                    c31Var.c.w0(0, (int) (-(c31Var.a0 - c31Var.Z)), org.telegram.ui.Components.xq.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                if (i3 == 0) {
                    ((l71) this.b).t0 = false;
                    break;
                }
                break;
            case 4:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((d81) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 6:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.b).c);
                    break;
                }
                break;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.g0 = i3 != 0;
                break;
        }
    }

    @Override // u4.t0
    public void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.a) {
            case 0:
                ((s11) this.b).d1();
                break;
            case 1:
                c31 c31Var = (c31) this.b;
                c31Var.o0(false, true);
                c31Var.p0();
                if (c31Var.c.J1) {
                    org.telegram.messenger.g0.v1(c31Var.fragmentView);
                    break;
                }
                break;
            case 2:
                r41 r41Var = (r41) this.b;
                if (r41Var.v0.size() != r41Var.w0.size() && !r41Var.A0 && r41Var.U.N0() > r41Var.X.d0 - 20) {
                    r41Var.k0();
                    break;
                }
                break;
            case 3:
                l71 l71Var = (l71) this.b;
                l71Var.w0.g1();
                l71Var.t0 = true;
                break;
            case 5:
                i91 i91Var = (i91) this.b;
                if (i91Var.p0 && i91Var.b0.N0() + 5 >= i91Var.n0) {
                    i91Var.L(i91Var.e0);
                }
                m91 m91Var = i91Var.w0;
                if (m91Var.t0) {
                    if (i3 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(m91Var.q0.getSearchField());
                        break;
                    }
                }
                break;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.G.getAdapter() == wallpapersListActivity.I) {
                    int L0 = wallpapersListActivity.J.L0();
                    int abs = L0 == -1 ? 0 : Math.abs(wallpapersListActivity.J.N0() - L0) + 1;
                    if (abs > 0) {
                        int B = wallpapersListActivity.J.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            nc1 nc1Var = wallpapersListActivity.I;
                            if (!nc1Var.f && nc1Var.s == 0) {
                                nc1Var.F(nc1Var.h, nc1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
