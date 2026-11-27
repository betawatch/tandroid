// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class q73 extends ax2 {
    public Object a;
    public Object b;
    public Object c;
    public p89 d;
    public o83 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ r73 h;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q73(r73 r73Var, ax2 ax2Var) {
        super(ax2Var);
        this.h = r73Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= TLObject.FLAG_31;
        return this.h.a(null, this);
    }
}
