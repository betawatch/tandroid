// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class xm4 extends qx2 {
    public sm4 a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ sm4 d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm4(sm4 sm4Var, px2 px2Var) {
        super(px2Var);
        this.d = sm4Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return this.d.c(null, this);
    }
}
