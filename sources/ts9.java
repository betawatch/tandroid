// default package

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ts9 extends f19 {
    public final /* synthetic */ us9 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts9(us9 us9Var, int i, View view, TLRPC.TL_reactionCount tL_reactionCount, wjb wjbVar) {
        super(null, i, view, tL_reactionCount, true, wjbVar);
        this.g0 = us9Var;
    }

    @Override // f19
    public final boolean e() {
        return this.v > 0 || this.t || this.E.l != 1.0f;
    }

    @Override // f19
    public final boolean h() {
        return !e();
    }

    @Override // f19
    public final int i() {
        return 18;
    }

    @Override // f19
    public final void r(float f) {
        int i = this.h;
        us9 us9Var = this.g0;
        boolean z = us9Var.e;
        vs9 vs9Var = us9Var.s;
        this.M = bm2.f(f, i, bkb.v0(z ? bkb.vk : bkb.lb, vs9Var.c));
        int f2 = bm2.f(f, this.f, us9Var.e ? bkb.v0(bkb.sk, vs9Var.c) : 0);
        this.N = f2;
        this.M = bkb.v(f2, this.M);
        this.O = bm2.f(f, this.g, us9Var.e ? 1526726655 : bkb.v0(bkb.mb, vs9Var.c));
    }
}
