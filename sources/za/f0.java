package za;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class f0 extends kd.c {
    public /* synthetic */ Object a;
    public final /* synthetic */ i0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.b = i0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return i0.a(this.b, this);
    }
}
