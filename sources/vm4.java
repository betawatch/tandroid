// default package

import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class vm4 extends qx2 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ wm4 c;
    public sm4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm4(wm4 wm4Var, px2 px2Var) {
        super(px2Var);
        this.c = wm4Var;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.g(null, this);
    }
}
