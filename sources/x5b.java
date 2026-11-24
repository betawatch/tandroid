// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class x5b implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y5b b;

    public /* synthetic */ x5b(y5b y5bVar, byte b) {
        this.a = b;
        this.b = y5bVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        y5b y5bVar = this.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
        switch (b) {
            case 0:
                y5bVar.d(tL_messages_stickerSet);
                break;
            default:
                y5bVar.b(tL_messages_stickerSet);
                break;
        }
    }
}
