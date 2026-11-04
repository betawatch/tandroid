package zd;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class f extends hd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ g c;
    public Object d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, hd.c cVar) {
        super(cVar);
        this.c = gVar;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.U(null, this);
    }
}
