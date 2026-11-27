// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wm4 extends ax2 {
    public xm4 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xm4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm4(xm4 xm4Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = xm4Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.c(null, this);
    }
}
