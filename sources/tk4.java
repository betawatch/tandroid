// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tk4 extends gw2 {
    public uk4 a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uk4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk4(uk4 uk4Var, fw2 fw2Var) {
        super(fw2Var);
        this.d = uk4Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.c(null, this);
    }
}
