// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class tdb implements zga, x74 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ydb b;

    public /* synthetic */ tdb(ydb ydbVar, byte b) {
        this.a = b;
        this.b = ydbVar;
    }

    @Override // x74
    public final void F(float f, int i) {
        byte b = this.a;
    }

    @Override // zga
    public final int b() {
        return this.b.b0;
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        byte b = this.a;
        ydb ydbVar = this.b;
        switch (b) {
            case 1:
                ydbVar.G0();
                break;
            case 2:
                ydbVar.G0();
                break;
            default:
                ydbVar.X.setAlpha(f);
                break;
        }
    }

    private final void a(float f, int i) {
    }

    private final void c(float f, int i) {
    }

    private final void d(float f, int i) {
    }
}
