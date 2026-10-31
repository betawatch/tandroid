package org.telegram.ui;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yj extends s4.s {
    public boolean S;
    public final /* synthetic */ un T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(un unVar, boolean z10) {
        super(z10);
        this.T = unVar;
    }

    @Override // s4.s
    public final boolean B1(int i10) {
        int i11;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.ej k92;
        byte b10;
        un unVar = this.T;
        fm fmVar = unVar.C0;
        int i12 = fmVar.J;
        if (i10 >= i12 && i10 < fmVar.K && (i11 = i10 - i12) >= 0 && i11 < fmVar.L().size() && (k92 = unVar.k9((jjVar = (org.telegram.messenger.jj) unVar.C0.L().get(i11)))) != null) {
            ArrayList arrayList = k92.e;
            org.telegram.messenger.bj d = k92.d(jjVar);
            if (d.a != d.b && (b10 = d.c) == d.d && b10 != 0) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) arrayList.get(i13);
                    if (bjVar != d) {
                        byte b11 = bjVar.c;
                        byte b12 = d.c;
                        if (b11 <= b12 && bjVar.d >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // s4.s
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            return !((org.telegram.ui.Cells.q1) view).getMessageObject().P3();
        }
        return false;
    }

    @Override // s4.n0
    public final int G() {
        if (this.S) {
            return (int) this.T.L9;
        }
        return 0;
    }

    @Override // s4.n0
    public final int J() {
        return this.S ? (int) this.T.L9 : F();
    }

    @Override // s4.n0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.L9) - C()) : super.K();
    }

    @Override // s4.a0
    public final int X0() {
        return (int) this.T.L9;
    }

    @Override // s4.r, s4.a0, s4.n0
    public final void b0(hf.e eVar, s4.z0 z0Var) {
        boolean z10 = org.telegram.messenger.v2.a;
        try {
            super.b0(eVar, z0Var);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            org.telegram.messenger.i0.g3(new rh(this, 4));
        }
    }

    @Override // s4.a0
    public final void i1(int i10, int i11, boolean z10) {
        if (!z10) {
            i11 = (int) ((i11 - F()) + this.T.L9);
        }
        super.i1(i10, i11, z10);
    }

    @Override // s4.a0, s4.n0
    public final int j(s4.z0 z0Var) {
        this.S = true;
        int B0 = B0(z0Var);
        this.S = false;
        return B0;
    }

    @Override // s4.r, s4.a0, s4.n0
    public final int k(s4.z0 z0Var) {
        this.S = true;
        int C0 = C0(z0Var);
        this.S = false;
        return C0;
    }

    @Override // s4.r, s4.a0, s4.n0
    public final int l(s4.z0 z0Var) {
        this.S = true;
        int D0 = D0(z0Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    @Override // s4.r, s4.a0, s4.n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        int i11;
        boolean z10;
        int i12;
        float f7;
        float f10;
        float f11;
        sg.k0 k0Var;
        boolean z11 = false;
        un unVar = this.T;
        if (i10 < 0) {
            float f12 = unVar.ga;
            if (f12 != 0.0f) {
                float f13 = f12 + i10;
                unVar.ga = f13;
                if (f13 < 0.0f) {
                    i10 = (int) f13;
                    unVar.ga = 0.0f;
                    unVar.z0.invalidate();
                } else {
                    i10 = 0;
                }
            }
        }
        int childCount = unVar.z0.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i11 = 0;
                z10 = false;
                break;
            }
            View childAt = unVar.z0.getChildAt(i13);
            float f14 = unVar.L9;
            unVar.z0.getClass();
            if (RecyclerView.R(childAt) == (unVar.jb ? 0 : unVar.C0.b() - 1)) {
                i11 = super.o0(((float) (childAt.getTop() - i10)) > f14 ? (int) (childAt.getTop() - f14) : i10, eVar, z0Var);
                z10 = true;
            } else {
                i13++;
            }
        }
        if (!z10) {
            i11 = super.o0(i10, eVar, z0Var);
        }
        if (!unVar.Sc.f) {
            SparseArray[] sparseArrayArr = unVar.m6;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i10 > 0 && i11 == 0 && (((org.telegram.messenger.w3.T(unVar.e) && !unVar.e.megagroup) || (unVar.v4 && !org.telegram.messenger.h20.u(unVar.f))) && (i12 = unVar.f4) != 3 && i12 != 9 && i12 != 1 && unVar.z0.getScrollState() == 1)) {
                vj vjVar = unVar.z0;
                if (!vjVar.V1 && !vjVar.b2 && !unVar.M9()) {
                    if (unVar.ga == 0.0f && unVar.ia != null) {
                        ArrayList arrayList = unVar.Ab;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            unVar.ia.h((TLRPC.Chat) unVar.Ab.get(0));
                        } else if (unVar.v4) {
                            unVar.ia.i();
                        } else {
                            unVar.ia.g();
                        }
                    }
                    Animator animator = unVar.ja;
                    if (animator != null) {
                        animator.removeAllListeners();
                        unVar.ja.cancel();
                    }
                    if (unVar.ga < org.telegram.messenger.i0.L(110.0f)) {
                        float L = unVar.ga / org.telegram.messenger.i0.L(110.0f);
                        f10 = (1.0f - L) * 0.65f;
                        f11 = L * 0.45f;
                    } else if (unVar.ga < org.telegram.messenger.i0.L(160.0f)) {
                        float L2 = (unVar.ga - org.telegram.messenger.i0.L(110.0f)) / org.telegram.messenger.i0.L(50.0f);
                        f10 = (1.0f - L2) * 0.45f;
                        f11 = L2 * 0.05f;
                    } else {
                        f7 = 0.05f;
                        float f15 = i10 * f7;
                        unVar.ga += f15;
                        int i14 = (int) f15;
                        k0Var = sg.k0.B;
                        if (k0Var != null) {
                            k0Var.r -= i14;
                            if (i14 != 0) {
                                k0Var.u = true;
                            }
                        }
                        unVar.z0.invalidate();
                    }
                    f7 = f11 + f10;
                    float f152 = i10 * f7;
                    unVar.ga += f152;
                    int i142 = (int) f152;
                    k0Var = sg.k0.B;
                    if (k0Var != null) {
                    }
                    unVar.z0.invalidate();
                }
            }
        }
        if (unVar.ga == 0.0f) {
            unVar.z0.setOverScrollMode(0);
        } else {
            unVar.z0.setOverScrollMode(2);
        }
        if (unVar.ia != null) {
            fe.b bVar = unVar.Qc;
            if (unVar.ga > 0.0f && unVar.z0.getScrollState() == 1) {
                z11 = true;
            }
            bVar.a(z11, true);
        }
        return i11;
    }

    @Override // s4.a0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        this.T.La = false;
        ci.p pVar = new ci.p(recyclerView.getContext(), 0);
        pVar.a = i10;
        w0(pVar);
    }

    @Override // s4.r, s4.a0, s4.n0
    public final boolean y0() {
        return true;
    }
}
