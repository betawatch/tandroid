// default package

import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class rb4 extends gw2 {
    public FileOutputStream a;
    public FileOutputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sb4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb4(sb4 sb4Var, gw2 gw2Var) {
        super(gw2Var);
        this.d = sb4Var;
    }

    @Override // of0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.b(null, this);
    }
}
