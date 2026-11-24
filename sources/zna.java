// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class zna implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ vqa b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zna(vqa vqaVar, long j, long j2, p8c p8cVar, long j3) {
        this.b = vqaVar;
        this.c = j;
        this.d = j2;
        this.f = p8cVar;
        this.e = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                vqa vqaVar = this.b;
                vqaVar.getClass();
                gl.c3(new goa(vqaVar, (hd) obj, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                gl.c3(new goa(this.b, tLObject, this.c, this.d, (p8c) obj, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ zna(vqa vqaVar, hd hdVar, long j, long j2, long j3) {
        this.b = vqaVar;
        this.f = hdVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
