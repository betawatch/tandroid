// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class td9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ye9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ td9(ye9 ye9Var, int i, int i2, byte b) {
        this.a = b;
        this.b = ye9Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.U1(this.c, this.d);
                break;
            default:
                this.b.g4(this.c, this.d);
                break;
        }
    }
}
