// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class y73 extends ax2 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ z73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y73(z73 z73Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = z73Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= TLObject.FLAG_31;
        return this.c.c(null, this);
    }
}
