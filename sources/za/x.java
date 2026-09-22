package za;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class x extends kd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ k1.p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k1.p pVar, kd.c cVar) {
        super(cVar);
        this.c = pVar;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.a(null, this);
    }
}
