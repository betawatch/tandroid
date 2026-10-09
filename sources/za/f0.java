package za;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f0 extends ld.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ i0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, ld.c cVar) {
        super(cVar);
        this.b = i0Var;
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return i0.a(this.b, this);
    }
}
