// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wha extends qx2 {
    public xha a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xha c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wha(xha xhaVar, qx2 qx2Var) {
        super(qx2Var);
        this.c = xhaVar;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.a(null, this);
    }
}
