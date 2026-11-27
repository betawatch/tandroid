// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class qm4 extends ax2 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ rm4 c;
    public Object d;
    public nm4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm4(rm4 rm4Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = rm4Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.k(null, this);
    }
}
