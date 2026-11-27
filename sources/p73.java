// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class p73 extends ax2 {
    public u8a a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u8a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p73(u8a u8aVar, ax2 ax2Var) {
        super(ax2Var);
        this.c = u8aVar;
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.m(this);
    }
}
