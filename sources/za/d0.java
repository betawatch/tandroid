package za;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class d0 extends kd.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ g0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.b = g0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return g0.a(this.b, this);
    }
}
