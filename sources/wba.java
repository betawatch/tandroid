// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wba extends ax2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ xba b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wba(xba xbaVar, ax2 ax2Var) {
        super(ax2Var);
        this.b = xbaVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= TLObject.FLAG_31;
        return this.b.c(null, this);
    }
}
