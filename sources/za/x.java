package za;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
