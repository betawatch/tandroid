// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class zsc implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ atc b;

    public /* synthetic */ zsc(atc atcVar, byte b) {
        this.a = b;
        this.b = atcVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        atc atcVar = this.b;
        ctc ctcVar = (ctc) obj;
        switch (b) {
            case 0:
                atcVar.l = null;
                atcVar.i = true;
                TLRPC.TL_webPage tL_webPage = atcVar.j;
                if (tL_webPage != null) {
                    ctc.o(tL_webPage);
                }
                atcVar.j = ctcVar.c;
                atcVar.c();
                break;
            default:
                atcVar.l = null;
                atcVar.i = true;
                TLRPC.TL_webPage tL_webPage2 = atcVar.j;
                if (tL_webPage2 != null) {
                    ctc.o(tL_webPage2);
                }
                atcVar.j = ctcVar.c;
                atcVar.c();
                break;
        }
    }
}
