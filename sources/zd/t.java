package zd;

import org.telegram.tgnet.TLObject;
import wd.a1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t extends hd.c {
    public u a;
    public c b;
    public w c;
    public a1 d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ u h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, hd.c cVar) {
        super(cVar);
        this.h = uVar;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        this.h.U(null, this);
        return gd.a.a;
    }
}
