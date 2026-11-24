// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vu9 extends i39 {
    public final /* synthetic */ wu9 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu9(wu9 wu9Var, int i, View view, TLRPC.TL_reactionCount tL_reactionCount, ylb ylbVar) {
        super(null, i, view, tL_reactionCount, true, ylbVar);
        this.g0 = wu9Var;
    }

    @Override // i39
    public final boolean e() {
        return this.v > 0 || this.t || this.E.l != 1.0f;
    }

    @Override // i39
    public final boolean h() {
        return !e();
    }

    @Override // i39
    public final int i() {
        return 18;
    }

    @Override // i39
    public final void r(float f) {
        int i = this.h;
        wu9 wu9Var = this.g0;
        boolean z = wu9Var.e;
        xu9 xu9Var = wu9Var.s;
        this.M = on2.f(f, i, cmb.v0(z ? cmb.vk : cmb.lb, xu9Var.c));
        int f2 = on2.f(f, this.f, wu9Var.e ? cmb.v0(cmb.sk, xu9Var.c) : 0);
        this.N = f2;
        this.M = cmb.v(f2, this.M);
        this.O = on2.f(f, this.g, wu9Var.e ? 1526726655 : cmb.v0(cmb.mb, xu9Var.c));
    }
}
