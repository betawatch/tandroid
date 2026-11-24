// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
