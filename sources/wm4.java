// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
