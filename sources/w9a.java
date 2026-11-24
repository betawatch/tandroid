// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class w9a extends yo {
    public final /* synthetic */ byte c;
    public final /* synthetic */ taa d;

    public /* synthetic */ w9a(taa taaVar, byte b) {
        this.c = b;
        this.d = taaVar;
    }

    @Override // yo
    public final int i(int i) {
        byte b = this.c;
        taa taaVar = this.d;
        switch (b) {
            case 0:
                if (i == 0) {
                    return taaVar.C1.J;
                }
                return 1;
            case 1:
                qaa qaaVar = taaVar.H1;
                return (i == qaaVar.x || i == qaaVar.y || i == qaaVar.E || i == qaaVar.G || qaaVar.d(i) == 0) ? 4 : 1;
            default:
                if (i == 0) {
                    return taaVar.D1.J;
                }
                return 1;
        }
    }
}
