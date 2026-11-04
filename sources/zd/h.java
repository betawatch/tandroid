package zd;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class h extends hd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ w9.b c;
    public w9.b d;
    public c e;
    public ae.k f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w9.b bVar, hd.c cVar) {
        super(cVar);
        this.c = bVar;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.U(null, this);
    }
}
