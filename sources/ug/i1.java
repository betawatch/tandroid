package ug;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i1 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b;
                if (i7 == 1) {
                    u0Var.l3 = true;
                }
                if (i7 == 0) {
                    l1 l1Var = null;
                    for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
                        l1 l1Var2 = (l1) u0Var.getChildAt(i10);
                        if (l1Var == null || l1Var2.a > l1Var.a) {
                            l1Var = l1Var2;
                        }
                    }
                    if (l1Var != null) {
                        u0Var.z1(l1Var, true);
                        u0Var.l3 = false;
                        u0Var.w0(0, l1Var.getTop() - ((u0Var.getMeasuredHeight() - l1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    u0Var.A1();
                    break;
                } else {
                    org.telegram.messenger.g0.r(u0Var.m3);
                    break;
                }
                break;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.v0) this.b).U1.getEditText());
                    break;
                }
                break;
            case 3:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.d1) this.b).V1.getEditText());
                    break;
                }
                break;
        }
    }

    @Override // v4.u0
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    u0Var.z1(null, true);
                }
                u0Var.invalidate();
                break;
            case 1:
                ((vh.g) this.b).g1();
                break;
            case 4:
                v4.c0 c0Var = (v4.c0) recyclerView.getLayoutManager();
                zh.l lVar = (zh.l) this.b;
                zh.e eVar = lVar.C;
                if (lVar.x && !lVar.w && c0Var != null) {
                    if (lVar.f.b() - c0Var.N0() < 10) {
                        org.telegram.messenger.g0.r(eVar);
                        org.telegram.messenger.g0.g3(eVar);
                        break;
                    }
                }
                break;
        }
    }
}
