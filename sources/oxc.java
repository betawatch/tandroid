// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class oxc implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pxc b;

    public /* synthetic */ oxc(pxc pxcVar, byte b) {
        this.a = b;
        this.b = pxcVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        pxc pxcVar = this.b;
        rxc rxcVar = (rxc) obj;
        switch (b) {
            case 0:
                pxcVar.l = null;
                pxcVar.i = true;
                TLRPC.TL_webPage tL_webPage = pxcVar.j;
                if (tL_webPage != null) {
                    rxc.o(tL_webPage);
                }
                pxcVar.j = rxcVar.c;
                pxcVar.c();
                break;
            default:
                pxcVar.l = null;
                pxcVar.i = true;
                TLRPC.TL_webPage tL_webPage2 = pxcVar.j;
                if (tL_webPage2 != null) {
                    rxc.o(tL_webPage2);
                }
                pxcVar.j = rxcVar.c;
                pxcVar.c();
                break;
        }
    }
}
