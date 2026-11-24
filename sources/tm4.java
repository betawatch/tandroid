// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tm4 extends qx2 {
    public um4 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ um4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm4(um4 um4Var, px2 px2Var) {
        super(px2Var);
        this.d = um4Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.c(null, this);
    }
}
