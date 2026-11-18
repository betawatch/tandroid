package ug;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class j1 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.b;
                if (i7 == 1) {
                    v0Var.l3 = true;
                }
                if (i7 == 0) {
                    m1 m1Var = null;
                    for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
                        m1 m1Var2 = (m1) v0Var.getChildAt(i10);
                        if (m1Var == null || m1Var2.a > m1Var.a) {
                            m1Var = m1Var2;
                        }
                    }
                    if (m1Var != null) {
                        v0Var.z1(m1Var, true);
                        v0Var.l3 = false;
                        v0Var.w0(0, m1Var.getTop() - ((v0Var.getMeasuredHeight() - m1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    v0Var.A1();
                    break;
                } else {
                    org.telegram.messenger.g0.r(v0Var.m3);
                    break;
                }
                break;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.w0) this.b).U1.getEditText());
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
                v0 v0Var = (v0) this.b;
                if (recyclerView.getScrollState() == 1) {
                    v0Var.z1(null, true);
                }
                v0Var.invalidate();
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
