// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class t73 extends gw2 {
    public a59 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v73 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t73(v73 v73Var, gw2 gw2Var) {
        super(gw2Var);
        this.c = v73Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.i(null, false, this);
    }
}
