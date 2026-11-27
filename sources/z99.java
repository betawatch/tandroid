// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class z99 extends ax2 {
    public xj7 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ aa9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z99(aa9 aa9Var, ax2 ax2Var) {
        super(ax2Var);
        this.c = aa9Var;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.a(this);
    }
}
