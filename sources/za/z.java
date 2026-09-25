package za;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class z extends kd.c {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ k1.p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(k1.p pVar, kd.c cVar) {
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
