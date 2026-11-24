// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x6b b;

    public /* synthetic */ xs7(x6b x6bVar, byte b) {
        this.a = b;
        this.b = x6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        x6b x6bVar = this.b;
        switch (b) {
            case 0:
                mt7 mt7Var = x6bVar.e2;
                if (mt7Var != null) {
                    mt7Var.I0();
                    break;
                }
                break;
            default:
                x6bVar.u2.q1.setVisibility(8);
                break;
        }
    }
}
