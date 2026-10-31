package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w41 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w41(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    e51 e51Var = (e51) this.b;
                    if (e51Var.E != null) {
                        org.telegram.ui.ActionBar.p5 p5Var = e51Var.d;
                        if (p5Var == null || !p5Var.w()) {
                            float f7 = e51Var.X;
                            if (f7 > 0.0f && f7 < 1.0f) {
                                if (f7 < 0.5f) {
                                    e51Var.c.w0(0, (int) Math.ceil(e51Var.Y - e51Var.a0), org.telegram.ui.Components.gr.h);
                                    break;
                                } else {
                                    e51Var.c.w0(0, (int) (-(e51Var.Z - e51Var.Y)), org.telegram.ui.Components.gr.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                if (i10 == 0) {
                    ((m91) this.b).s0 = false;
                    break;
                }
                break;
            case 3:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((ea1) this.b).getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((UsersSelectActivity) this.b).c);
                    break;
                }
                break;
            case 6:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                wallpapersListActivity.f0 = i10 != 0;
                break;
        }
    }

    @Override // s4.s0
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.a) {
            case 0:
                e51 e51Var = (e51) this.b;
                e51Var.n0(false, true);
                e51Var.o0();
                if (e51Var.c.I1) {
                    org.telegram.messenger.i0.v1(e51Var.fragmentView);
                    break;
                }
                break;
            case 1:
                u61 u61Var = (u61) this.b;
                if (u61Var.u0.size() != u61Var.v0.size() && !u61Var.z0 && u61Var.T.N0() > u61Var.W.c0 - 20) {
                    u61Var.j0();
                    break;
                }
                break;
            case 2:
                m91 m91Var = (m91) this.b;
                m91Var.v0.g1();
                m91Var.s0 = true;
                break;
            case 4:
                lb1 lb1Var = (lb1) this.b;
                if (lb1Var.o0 && lb1Var.a0.N0() + 5 >= lb1Var.m0) {
                    lb1Var.L(lb1Var.d0);
                }
                pb1 pb1Var = lb1Var.v0;
                if (pb1Var.s0) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.messenger.i0.v1(pb1Var.p0.getSearchField());
                        break;
                    }
                }
                break;
            case 6:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) this.b;
                if (wallpapersListActivity.F.getAdapter() == wallpapersListActivity.H) {
                    int L0 = wallpapersListActivity.I.L0();
                    int abs = L0 == -1 ? 0 : Math.abs(wallpapersListActivity.I.N0() - L0) + 1;
                    if (abs > 0) {
                        int B = wallpapersListActivity.I.B();
                        if (abs != 0 && L0 + abs > B - 2) {
                            pe1 pe1Var = wallpapersListActivity.H;
                            if (!pe1Var.f && pe1Var.s == 0) {
                                pe1Var.F(pe1Var.h, pe1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
