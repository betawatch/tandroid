// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qka extends eeb implements fs4 {
    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new qka(2, px2Var);
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        qka qkaVar = (qka) create((jm4) obj, (px2) obj2);
        g7c g7cVar = g7c.a;
        qkaVar.invokeSuspend(g7cVar);
        return g7cVar;
    }
}
