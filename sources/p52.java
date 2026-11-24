// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class p52 implements b42, ed {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;

    public /* synthetic */ p52(p8c p8cVar, byte b) {
        this.a = b;
        this.b = p8cVar;
    }

    @Override // b42
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        this.b.a(new sd8(messageMedia));
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        p8c p8cVar = this.b;
        switch (b) {
            case 1:
                if (p8cVar != null) {
                    p8cVar.a(Boolean.FALSE);
                    break;
                }
                break;
            default:
                p8cVar.a(hdVar.g(i, true, true));
                break;
        }
    }
}
