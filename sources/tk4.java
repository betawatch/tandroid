// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tk4 extends gw2 {
    public uk4 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uk4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk4(uk4 uk4Var, fw2 fw2Var) {
        super(fw2Var);
        this.d = uk4Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.c(null, this);
    }
}
