// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class vk4 extends gw2 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wk4 c;
    public rk4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk4(wk4 wk4Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = wk4Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.h(null, this);
    }
}
