// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v83 extends qx2 {
    public Object a;
    public h93 b;
    public nq2 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ h93 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v83(h93 h93Var, qx2 qx2Var) {
        super(qx2Var);
        this.e = h93Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.d(null, this);
    }
}
