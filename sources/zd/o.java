package zd;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class o extends hd.c {
    public l a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ l d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, fd.c cVar) {
        super(cVar);
        this.d = lVar;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return this.d.b(null, this);
    }
}
