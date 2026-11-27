// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yr9 extends ax2 {
    public u8a a;
    public xj7 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u8a d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr9(u8a u8aVar, ax2 ax2Var) {
        super(ax2Var);
        this.d = u8aVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.F(this);
    }
}
