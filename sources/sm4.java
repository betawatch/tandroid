// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class sm4 extends ax2 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ qx6 c;
    public qx6 d;
    public nm4 e;
    public gs9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm4(qx6 qx6Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = qx6Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.k(null, this);
    }
}
