// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class vq6 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hs6 b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ vq6(hs6 hs6Var, TLRPC.StickerSet stickerSet, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = stickerSet;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.StickerSet stickerSet = this.c;
        hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                hs6Var.g1(stickerSet.id, false);
                break;
            default:
                hs6Var.h1(stickerSet.id, false);
                break;
        }
    }
}
