// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class xk4 extends gw2 {
    public rk4 a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ rk4 d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk4(rk4 rk4Var, fw2 fw2Var) {
        super(fw2Var);
        this.d = rk4Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return this.d.c(null, this);
    }
}
