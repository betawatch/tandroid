package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class u41 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u41(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    c51 c51Var = (c51) this.b;
                    if (c51Var.E != null) {
                        org.telegram.ui.ActionBar.p5 p5Var = c51Var.d;
                        if (p5Var == null || !p5Var.w()) {
                            float f7 = c51Var.X;
                            if (f7 > 0.0f && f7 < 1.0f) {
                                if (f7 < 0.5f) {
                                    c51Var.c.w0(0, (int) Math.ceil(c51Var.Y - c51Var.a0), org.telegram.ui.Components.gr.h);
                                    break;
                                } else {
                                    c51Var.c.w0(0, (int) (-(c51Var.Z - c51Var.Y)), org.telegram.ui.Components.gr.h);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                if (i10 == 0) {
                    ((k91) this.b).s0 = false;
                    break;
                }
                break;
            case 3:
                if (i10 == 1) {
                    org.telegram.messenger.i0.v1(((ca1) this.b).getParentActivity().getCurrentFocus());
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
                c51 c51Var = (c51) this.b;
                c51Var.o0(false, true);
                c51Var.p0();
                if (c51Var.c.I1) {
                    org.telegram.messenger.i0.v1(c51Var.fragmentView);
                    break;
                }
                break;
            case 1:
                s61 s61Var = (s61) this.b;
                if (s61Var.u0.size() != s61Var.v0.size() && !s61Var.z0 && s61Var.T.N0() > s61Var.W.c0 - 20) {
                    s61Var.k0();
                    break;
                }
                break;
            case 2:
                k91 k91Var = (k91) this.b;
                k91Var.v0.g1();
                k91Var.s0 = true;
                break;
            case 4:
                jb1 jb1Var = (jb1) this.b;
                if (jb1Var.o0 && jb1Var.a0.N0() + 5 >= jb1Var.m0) {
                    jb1Var.L(jb1Var.d0);
                }
                nb1 nb1Var = jb1Var.v0;
                if (nb1Var.s0) {
                    if (i10 != 0 || i11 != 0) {
                        org.telegram.messenger.i0.v1(nb1Var.p0.getSearchField());
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
                            ne1 ne1Var = wallpapersListActivity.H;
                            if (!ne1Var.f && ne1Var.s == 0) {
                                ne1Var.F(ne1Var.h, ne1Var.r, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
