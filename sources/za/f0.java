package za;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class f0 extends kd.c {
    public g0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, kd.c cVar) {
        super(cVar);
        this.c = g0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return g0.b(this.c, this);
    }
}
