// default package

import android.location.Location;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class x32 implements vs2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c42 b;

    public /* synthetic */ x32(c42 c42Var, byte b) {
        this.a = b;
        this.b = c42Var;
    }

    @Override // vs2
    public final void accept(Object obj) {
        byte b = this.a;
        c42 c42Var = this.b;
        switch (b) {
            case 0:
                c42Var.T((ty4) obj);
                break;
            default:
                c42Var.a0((Location) obj);
                break;
        }
    }
}
