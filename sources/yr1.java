// default package

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yr1 extends r55 {
    public boolean S;
    public final /* synthetic */ yv1 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr1(yv1 yv1Var, boolean z) {
        super(z);
        this.T = yv1Var;
    }

    @Override // r55
    public final boolean A1(View view) {
        if (view instanceof rc2) {
            return !((rc2) view).getMessageObject().O3();
        }
        return false;
    }

    @Override // f69
    public final int F() {
        if (this.S) {
            return (int) this.T.P9;
        }
        return 0;
    }

    @Override // f69
    public final int I() {
        return this.S ? (int) this.T.P9 : E();
    }

    @Override // f69
    public final int J() {
        return this.S ? (int) ((this.n - this.T.P9) - B()) : super.J();
    }

    @Override // u46
    public final int W0() {
        return (int) this.T.P9;
    }

    @Override // q55, u46, f69
    public final void a0(ki2 ki2Var, r69 r69Var) {
        vr1 vr1Var;
        hu1 hu1Var;
        yv1 yv1Var = this.T;
        int i = yv1Var.vb;
        if (i != 0 && yv1Var.wb != Integer.MIN_VALUE && (vr1Var = yv1Var.A0) != null && (hu1Var = yv1Var.D0) != null && !hu1Var.O && !vr1Var.W1) {
            k47 k47Var = (k47) yv1Var.G6[0].get(i);
            int indexOf = k47Var != null ? yv1Var.M6.indexOf(k47Var) : -1;
            if (indexOf >= 0) {
                int i2 = yv1Var.D0.K + indexOf;
                int paddingTop = yv1Var.wb - yv1Var.A0.getPaddingTop();
                this.y = i2;
                this.A = paddingTop;
                this.z = false;
                t46 t46Var = this.B;
                if (t46Var != null) {
                    t46Var.a = -1;
                }
            }
        }
        boolean z = e21.a;
        try {
            super.a0(ki2Var, r69Var);
        } catch (Exception e) {
            fc4.g(e, true);
            gm.c3(new fo1(this, (byte) 5));
        }
    }

    @Override // u46
    public final void h1(int i, int i2, boolean z) {
        if (!z) {
            i2 = (int) ((i2 - E()) + this.T.P9);
        }
        super.h1(i, i2, z);
    }

    @Override // u46, f69
    public final int j(r69 r69Var) {
        this.S = true;
        int A0 = A0(r69Var);
        this.S = false;
        return A0;
    }

    @Override // q55, u46, f69
    public final int k(r69 r69Var) {
        this.S = true;
        int B0 = B0(r69Var);
        this.S = false;
        return B0;
    }

    @Override // q55, u46, f69
    public final int l(r69 r69Var) {
        this.S = true;
        int C0 = C0(r69Var);
        this.S = false;
        return C0;
    }

    @Override // q55, u46, f69
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
        int i2;
        boolean z;
        int i3;
        float f;
        boolean z2 = false;
        yv1 yv1Var = this.T;
        if (i < 0) {
            float f2 = yv1Var.ka;
            if (f2 != 0.0f) {
                float f3 = f2 + i;
                yv1Var.ka = f3;
                if (f3 < 0.0f) {
                    i = (int) f3;
                    yv1Var.ka = 0.0f;
                    yv1Var.A0.invalidate();
                } else {
                    i = 0;
                }
            }
        }
        int childCount = yv1Var.A0.getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                i2 = 0;
                z = false;
                break;
            }
            View childAt = yv1Var.A0.getChildAt(i4);
            float f4 = yv1Var.P9;
            yv1Var.A0.getClass();
            if (RecyclerView.R(childAt) == (yv1Var.nb ? 0 : yv1Var.D0.b() - 1)) {
                i2 = super.n0(((float) (childAt.getTop() - i)) > f4 ? (int) (childAt.getTop() - f4) : i, ki2Var, r69Var);
                z = true;
            } else {
                i4++;
            }
        }
        if (!z) {
            i2 = super.n0(i, ki2Var, r69Var);
        }
        if (!yv1Var.pd.f) {
            SparseArray[] sparseArrayArr = yv1Var.o6;
            if (sparseArrayArr[0].size() <= 0 && sparseArrayArr[1].size() <= 0 && i > 0 && i2 == 0 && (((sd2.T(yv1Var.e) && !yv1Var.e.megagroup) || (yv1Var.x4 && !m9c.w(yv1Var.f))) && (i3 = yv1Var.g4) != 3 && i3 != 9 && i3 != 1 && yv1Var.A0.getScrollState() == 1)) {
                vr1 vr1Var = yv1Var.A0;
                if (!vr1Var.W1 && !vr1Var.c2 && !yv1Var.c8()) {
                    if (yv1Var.ka == 0.0f && yv1Var.ma != null) {
                        ArrayList arrayList = yv1Var.Nb;
                        if (arrayList == null || arrayList.isEmpty()) {
                            boolean z3 = yv1Var.x4;
                            vd2 vd2Var = yv1Var.ma;
                            if (z3) {
                                vd2Var.h();
                            } else {
                                vd2Var.f();
                            }
                        } else {
                            yv1Var.ma.g((TLRPC.Chat) yv1Var.Nb.get(0));
                        }
                    }
                    Animator animator = yv1Var.na;
                    if (animator != null) {
                        animator.removeAllListeners();
                        yv1Var.na.cancel();
                    }
                    float f5 = yv1Var.ka;
                    float L = gm.L(110.0f);
                    float f6 = yv1Var.ka;
                    if (f5 < L) {
                        float L2 = f6 / gm.L(110.0f);
                        f = (L2 * 0.45f) + ((1.0f - L2) * 0.65f);
                    } else {
                        f = 0.05f;
                        if (f6 < gm.L(160.0f)) {
                            float L3 = (yv1Var.ka - gm.L(110.0f)) / gm.L(50.0f);
                            f = (L3 * 0.05f) + ((1.0f - L3) * 0.45f);
                        }
                    }
                    float f7 = i * f;
                    yv1Var.ka += f7;
                    int i5 = (int) f7;
                    g39 g39Var = g39.B;
                    if (g39Var != null) {
                        g39Var.r -= i5;
                        if (i5 != 0) {
                            g39Var.u = true;
                        }
                    }
                    yv1Var.A0.invalidate();
                }
            }
        }
        float f8 = yv1Var.ka;
        vr1 vr1Var2 = yv1Var.A0;
        if (f8 == 0.0f) {
            vr1Var2.setOverScrollMode(0);
        } else {
            vr1Var2.setOverScrollMode(2);
        }
        if (yv1Var.ma != null) {
            fn0 fn0Var = yv1Var.nd;
            if (yv1Var.ka > 0.0f && yv1Var.A0.getScrollState() == 1) {
                z2 = true;
            }
            fn0Var.a(z2, true);
        }
        return i2;
    }

    @Override // f69
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        this.T.Pa = false;
        w46 w46Var = new w46(recyclerView.getContext(), 0);
        w46Var.a = i;
        v0(w46Var);
    }

    @Override // q55, u46, f69
    public final boolean x0() {
        return true;
    }

    @Override // r55
    public final boolean z1(int i) {
        int i2;
        k47 k47Var;
        f47 v7;
        byte b;
        yv1 yv1Var = this.T;
        hu1 hu1Var = yv1Var.D0;
        int i3 = hu1Var.K;
        if (i >= i3 && i < hu1Var.L && (i2 = i - i3) >= 0 && i2 < hu1Var.G().size() && (v7 = yv1Var.v7((k47Var = (k47) yv1Var.D0.G().get(i2)))) != null) {
            ArrayList arrayList = v7.e;
            c47 d = v7.d(k47Var);
            if (d.a != d.b && (b = d.c) == d.d && b != 0) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    c47 c47Var = (c47) arrayList.get(i4);
                    if (c47Var != d) {
                        byte b2 = c47Var.c;
                        byte b3 = d.c;
                        if (b2 <= b3 && c47Var.d >= b3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
