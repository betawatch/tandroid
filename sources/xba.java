// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xba extends ax2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ yba b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xba(yba ybaVar, ax2 ax2Var) {
        super(ax2Var);
        this.b = ybaVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.c(null, this);
    }
}
