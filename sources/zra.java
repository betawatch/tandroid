// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zra implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ wua b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zra(wua wuaVar, long j, long j2, pcc pccVar, long j3) {
        this.b = wuaVar;
        this.c = j;
        this.d = j2;
        this.f = pccVar;
        this.e = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                wua wuaVar = this.b;
                wuaVar.getClass();
                hl.c3(new gsa(wuaVar, (id) obj, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                hl.c3(new gsa(this.b, tLObject, this.c, this.d, (pcc) obj, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ zra(wua wuaVar, id idVar, long j, long j2, long j3) {
        this.b = wuaVar;
        this.f = idVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
