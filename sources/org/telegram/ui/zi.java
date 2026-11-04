package org.telegram.ui;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zi extends u4.t {
    public boolean S;
    public final /* synthetic */ wm T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi(wm wmVar, boolean z10) {
        super(z10);
        this.T = wmVar;
    }

    @Override // u4.t
    public final boolean B1(int i3) {
        int i10;
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.ui s92;
        byte b10;
        wm wmVar = this.T;
        fl flVar = wmVar.D0;
        int i11 = flVar.K;
        if (i3 >= i11 && i3 < flVar.L && (i10 = i3 - i11) >= 0 && i10 < flVar.L().size() && (s92 = wmVar.s9((ziVar = (org.telegram.messenger.zi) wmVar.D0.L().get(i10)))) != null) {
            ArrayList arrayList = s92.e;
            org.telegram.messenger.ri d = s92.d(ziVar);
            if (d.a != d.b && (b10 = d.c) == d.d && b10 != 0) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    org.telegram.messenger.ri riVar = (org.telegram.messenger.ri) arrayList.get(i12);
                    if (riVar != d) {
                        byte b11 = riVar.c;
                        byte b12 = d.c;
                        if (b11 <= b12 && riVar.d >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // u4.t
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            return !((org.telegram.ui.Cells.q1) view).getMessageObject().Q3();
        }
        return false;
    }

    @Override // u4.o0
    public final int G() {
        if (this.S) {
            return (int) this.T.M9;
        }
        return 0;
    }

    @Override // u4.o0
    public final int J() {
        return this.S ? (int) this.T.M9 : F();
    }

    @Override // u4.o0
    public final int K() {
        return this.S ? (int) ((this.n - this.T.M9) - C()) : super.K();
    }

    @Override // u4.b0
    public final int X0() {
        return (int) this.T.M9;
    }

    @Override // u4.s, u4.b0, u4.o0
    public final void b0(tf.e eVar, u4.a1 a1Var) {
        boolean z10 = org.telegram.messenger.r2.a;
        try {
            super.b0(eVar, a1Var);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            org.telegram.messenger.g0.h3(new xg(this, 4));
        }
    }

    @Override // u4.b0
    public final void i1(int i3, int i10, boolean z10) {
        if (!z10) {
            i10 = (int) ((i10 - F()) + this.T.M9);
        }
        super.i1(i3, i10, z10);
    }

    @Override // u4.b0, u4.o0
    public final int j(u4.a1 a1Var) {
        this.S = true;
        int B0 = B0(a1Var);
        this.S = false;
        return B0;
    }

    @Override // u4.s, u4.b0, u4.o0
    public final int k(u4.a1 a1Var) {
        this.S = true;
        int C0 = C0(a1Var);
        this.S = false;
        return C0;
    }

    @Override // u4.s, u4.b0, u4.o0
    public final int l(u4.a1 a1Var) {
        this.S = true;
        int D0 = D0(a1Var);
        this.S = false;
        return D0;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    @Override // u4.s, u4.b0, u4.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o0(int i3, tf.e eVar, u4.a1 a1Var) {
        int i10;
        boolean z10;
        int i11;
        float f10;
        float f11;
        float f12;
        dh.j0 j0Var;
        boolean z11 = false;
        wm wmVar = this.T;
        if (i3 < 0) {
            float f13 = wmVar.ha;
            if (f13 != 0.0f) {
                float f14 = f13 + i3;
                wmVar.ha = f14;
                if (f14 < 0.0f) {
                    i3 = (int) f14;
                    wmVar.ha = 0.0f;
                    wmVar.A0.invalidate();
                } else {
                    i3 = 0;
                }
            }
        }
        int childCount = wmVar.A0.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                i10 = 0;
                z10 = false;
                break;
            }
            View childAt = wmVar.A0.getChildAt(i12);
            float f15 = wmVar.M9;
            wmVar.A0.getClass();
            if (RecyclerView.R(childAt) == (wmVar.kb ? 0 : wmVar.D0.b() - 1)) {
                i10 = super.o0(((float) (childAt.getTop() - i3)) > f15 ? (int) (childAt.getTop() - f15) : i3, eVar, a1Var);
                z10 = true;
            } else {
                i12++;
            }
        }
        if (!z10) {
            i10 = super.o0(i3, eVar, a1Var);
        }
        if (!wmVar.bd.f) {
            SparseArray[] sparseArrayArr = wmVar.n6;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i3 > 0 && i10 == 0 && (((org.telegram.messenger.t3.T(wmVar.e) && !wmVar.e.megagroup) || (wmVar.w4 && !org.telegram.messenger.l10.u(wmVar.f))) && (i11 = wmVar.g4) != 3 && i11 != 9 && i11 != 1 && wmVar.A0.getScrollState() == 1)) {
                wi wiVar = wmVar.A0;
                if (!wiVar.W1 && !wiVar.c2 && !wmVar.W9()) {
                    if (wmVar.ha == 0.0f && wmVar.ja != null) {
                        ArrayList arrayList = wmVar.Cb;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            wmVar.ja.g((TLRPC.Chat) wmVar.Cb.get(0));
                        } else if (wmVar.w4) {
                            wmVar.ja.h();
                        } else {
                            wmVar.ja.f();
                        }
                    }
                    Animator animator = wmVar.ka;
                    if (animator != null) {
                        animator.removeAllListeners();
                        wmVar.ka.cancel();
                    }
                    if (wmVar.ha < org.telegram.messenger.g0.L(110.0f)) {
                        float L = wmVar.ha / org.telegram.messenger.g0.L(110.0f);
                        f11 = (1.0f - L) * 0.65f;
                        f12 = L * 0.45f;
                    } else if (wmVar.ha < org.telegram.messenger.g0.L(160.0f)) {
                        float L2 = (wmVar.ha - org.telegram.messenger.g0.L(110.0f)) / org.telegram.messenger.g0.L(50.0f);
                        f11 = (1.0f - L2) * 0.45f;
                        f12 = L2 * 0.05f;
                    } else {
                        f10 = 0.05f;
                        float f16 = i3 * f10;
                        wmVar.ha += f16;
                        int i13 = (int) f16;
                        j0Var = dh.j0.B;
                        if (j0Var != null) {
                            j0Var.r -= i13;
                            if (i13 != 0) {
                                j0Var.u = true;
                            }
                        }
                        wmVar.A0.invalidate();
                    }
                    f10 = f12 + f11;
                    float f162 = i3 * f10;
                    wmVar.ha += f162;
                    int i132 = (int) f162;
                    j0Var = dh.j0.B;
                    if (j0Var != null) {
                    }
                    wmVar.A0.invalidate();
                }
            }
        }
        if (wmVar.ha == 0.0f) {
            wmVar.A0.setOverScrollMode(0);
        } else {
            wmVar.A0.setOverScrollMode(2);
        }
        if (wmVar.ja != null) {
            qe.a aVar = wmVar.Zc;
            if (wmVar.ha > 0.0f && wmVar.A0.getScrollState() == 1) {
                z11 = true;
            }
            aVar.a(z11, true);
        }
        return i10;
    }

    @Override // u4.b0, u4.o0
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        this.T.Ma = false;
        ni.m mVar = new ni.m(recyclerView.getContext(), 0);
        mVar.a = i3;
        w0(mVar);
    }

    @Override // u4.s, u4.b0, u4.o0
    public final boolean y0() {
        return true;
    }
}
