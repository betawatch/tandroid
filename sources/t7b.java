// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t7b implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u7b b;

    public /* synthetic */ t7b(u7b u7bVar, byte b) {
        this.a = b;
        this.b = u7bVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        u7b u7bVar = this.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
        switch (b) {
            case 0:
                u7bVar.d(tL_messages_stickerSet);
                break;
            default:
                u7bVar.b(tL_messages_stickerSet);
                break;
        }
    }
}
