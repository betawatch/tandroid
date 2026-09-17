package za;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
