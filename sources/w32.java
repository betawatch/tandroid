// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class w32 implements gj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c42 b;
    public final /* synthetic */ TLRPC.TL_messageMediaVenue c;

    public /* synthetic */ w32(c42 c42Var, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, byte b) {
        this.a = b;
        this.b = c42Var;
        this.c = tL_messageMediaVenue;
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        byte b = this.a;
        c42 c42Var = this.b;
        switch (b) {
            case 0:
                c42Var.o0.b(this.c, c42Var.p0, z, i, 0L);
                c42Var.b.a(true);
                break;
            default:
                c42Var.o0.b(this.c, c42Var.p0, z, i, 0L);
                c42Var.b.a(true);
                break;
        }
    }
}
