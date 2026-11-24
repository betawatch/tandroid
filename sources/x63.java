// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x63 extends gw2 {
    public Object a;
    public Object b;
    public Object c;
    public c59 d;
    public v73 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ y63 h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x63(y63 y63Var, gw2 gw2Var) {
        super(gw2Var);
        this.h = y63Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.a(null, this);
    }
}
