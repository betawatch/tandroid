// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class z99 extends ax2 {
    public wj7 a;
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
