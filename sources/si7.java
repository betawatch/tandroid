// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class si7 extends qx2 {
    public Object a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ui7 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si7(ui7 ui7Var, px2 px2Var) {
        super(px2Var);
        this.e = ui7Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.c(null, this);
    }
}
