// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
