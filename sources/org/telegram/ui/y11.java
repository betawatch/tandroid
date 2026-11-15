package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y11 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y11(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.t0
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    k31 k31Var = (k31) this.b;
                    if (k31Var.F != null) {
                        org.telegram.ui.ActionBar.d5 d5Var = k31Var.d;
                        if (d5Var == null || !d5Var.x()) {
                            float f10 = k31Var.Y;
                            if (f10 > 0.0f && f10 < 1.0f) {
                                if (f10 < 0.5f) {
                                    k31Var.c.w0(0, (int) Math.ceil(k31Var.Z - k31Var.b0), org.telegram.ui.Components.er.h);
                                    break;
                                } else {
                                    k31Var.c.w0(0, (int) (-(k31Var.a0 - k31Var.Z)), org.telegram.ui.Components.er.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                if (i7 == 0) {
                    ((t71) this.b).t0 = false;
                    break;
                }
                break;
            case 4:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((l81) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 6:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((UsersSelectActivity) this.b).c);
                    break;
                }
                break;
            case 7:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.g0 = i7 != 0;
                break;
        }
    }

    @Override // v4.t0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                ((z11) this.b).d1();
                break;
            case 1:
                k31 k31Var = (k31) this.b;
                k31Var.o0(false, true);
                k31Var.p0();
                if (k31Var.c.J1) {
                    org.telegram.messenger.g0.v1(k31Var.fragmentView);
                    break;
                }
                break;
            case 2:
                z41 z41Var = (z41) this.b;
                if (z41Var.v0.size() != z41Var.w0.size() && !z41Var.A0 && z41Var.U.N0() > z41Var.X.d0 - 20) {
                    z41Var.k0();
                    break;
                }
                break;
            case 3:
                t71 t71Var = (t71) this.b;
                t71Var.w0.g1();
                t71Var.t0 = true;
                break;
            case 5:
                q91 q91Var = (q91) this.b;
                if (q91Var.p0 && q91Var.b0.N0() + 5 >= q91Var.n0) {
                    q91Var.J(q91Var.e0);
                }
                u91 u91Var = q91Var.w0;
                if (u91Var.t0) {
                    if (i7 != 0 || i10 != 0) {
                        org.telegram.messenger.g0.v1(u91Var.q0.getSearchField());
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
                            rc1 rc1Var = wallpapersListActivity.I;
                            if (!rc1Var.f && rc1Var.s == 0) {
                                rc1Var.F(rc1Var.h, rc1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
