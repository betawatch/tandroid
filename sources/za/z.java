package za;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
