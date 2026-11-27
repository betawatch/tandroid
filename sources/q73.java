// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class q73 extends ax2 {
    public Object a;
    public Object b;
    public Object c;
    public p89 d;
    public o83 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ r73 h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q73(r73 r73Var, ax2 ax2Var) {
        super(ax2Var);
        this.h = r73Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.a(null, this);
    }
}
