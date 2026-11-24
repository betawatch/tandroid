// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qk4 extends gw2 {
    public rk4 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rk4 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk4(rk4 rk4Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = rk4Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.c(null, this);
    }
}
