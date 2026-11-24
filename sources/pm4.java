// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class pm4 extends qx2 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ lx6 c;
    public lx6 d;
    public jm4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm4(lx6 lx6Var, px2 px2Var) {
        super(px2Var);
        this.c = lx6Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.g(null, this);
    }
}
