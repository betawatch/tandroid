// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xja extends ax2 {
    public String a;
    public vja b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yja d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xja(yja yjaVar, zw2 zw2Var) {
        super(zw2Var);
        this.d = yjaVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.e(null, null, this);
    }
}
