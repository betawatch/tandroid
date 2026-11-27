// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
