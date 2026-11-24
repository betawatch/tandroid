// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pg7 extends gw2 {
    public Object a;
    public Object b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ rg7 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg7(rg7 rg7Var, fw2 fw2Var) {
        super(fw2Var);
        this.e = rg7Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= TLObject.FLAG_31;
        return this.e.c(null, this);
    }
}
