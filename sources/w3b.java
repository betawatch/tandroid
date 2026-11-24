// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class w3b implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x3b b;

    public /* synthetic */ w3b(x3b x3bVar, byte b) {
        this.a = b;
        this.b = x3bVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        x3b x3bVar = this.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
        switch (b) {
            case 0:
                x3bVar.d(tL_messages_stickerSet);
                break;
            default:
                x3bVar.b(tL_messages_stickerSet);
                break;
        }
    }
}
