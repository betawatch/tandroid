package zd;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends hd.c {
    public ae.k a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z6.c c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z6.c cVar, hd.c cVar2) {
        super(cVar2);
        this.c = cVar;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.U(null, this);
    }
}
