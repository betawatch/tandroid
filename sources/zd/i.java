package zd;

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class i extends hd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ua.b c;
    public ua.b d;
    public c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ua.b bVar, hd.c cVar) {
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
