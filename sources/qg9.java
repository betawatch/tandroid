// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class qg9 extends gkb {
    public final /* synthetic */ ah9 F0;
    public final /* synthetic */ ch9 G0;

    public qg9(ch9 ch9Var, ah9 ah9Var) {
        this.G0 = ch9Var;
        this.F0 = ah9Var;
    }

    @Override // skb
    public final boolean B() {
        ch9 ch9Var = this.G0;
        CharSequence q = ch9Var.v3.q();
        if (q == null || q.length() == 0) {
            return true;
        }
        ch9Var.f5(q);
        return true;
    }

    @Override // skb
    public final void C() {
        ch9 ch9Var = this.G0;
        CharSequence q = ch9Var.v3.q();
        if (q != null && q.length() > 0) {
            ch9Var.f5(q);
        }
        ch9Var.A2();
    }

    @Override // gkb, skb
    public final void E() {
        super.E();
        this.F0.e();
    }

    @Override // skb
    public final void G() {
        this.G0.c4();
    }

    @Override // skb
    public final boolean I() {
        if (Z()) {
            return true;
        }
        return this.G0.V4();
    }

    @Override // skb
    public final void J(float f, float f2) {
        ch9 ch9Var = this.G0;
        ch9Var.A3 = true;
        ch9Var.B3 = f;
        ch9Var.C3 = f2;
    }

    @Override // skb
    public final boolean i() {
        int size;
        ch9 ch9Var = this.G0;
        qg9 qg9Var = ch9Var.v3;
        ArrayList arrayList = ch9Var.t3;
        boolean z = false;
        if (!arrayList.isEmpty() && qg9Var.w() && qg9Var.p0 == 0 && qg9Var.q0 == 0 && qg9Var.r0 <= 0 && qg9Var.s0 == (size = arrayList.size() - 1)) {
            ll0 ll0Var = (ll0) arrayList.get(size);
            String l = xk9.n(ll0Var.b) ? zk9.l(xk9.h(ll0Var.b)) : "";
            boolean z2 = !l.isEmpty();
            if (qg9Var.t0 == z2) {
                if (qg9Var.u0 >= (z2 ? l.length() : xk9.y(ll0Var.b).length())) {
                    z = true;
                }
            }
        }
        return !z;
    }

    @Override // skb
    public final int n() {
        return this.G0.getPaddingBottom();
    }

    @Override // skb
    public final int o() {
        return this.G0.getPaddingTop();
    }
}
