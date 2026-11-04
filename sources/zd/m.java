package zd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends hd.c {
    public ae.q a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ae.q d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ae.q qVar, fd.c cVar) {
        super(cVar);
        this.d = qVar;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.b(null, this);
    }
}
