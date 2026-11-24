// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rz8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a09 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ rz8(a09 a09Var, TLObject tLObject, byte b) {
        this.a = b;
        this.b = a09Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.c;
        a09 a09Var = this.b;
        switch (b) {
            case 0:
                kk7.f(a09Var.b).d(new rz8(a09Var, tLObject, (byte) 1));
                break;
            default:
                a09Var.b(tLObject);
                break;
        }
    }
}
