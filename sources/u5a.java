// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u5a implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_stickers_createStickerSet a;
    public final /* synthetic */ v5a b;

    public u5a(v5a v5aVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.b = v5aVar;
        this.a = tL_stickers_createStickerSet;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new no8(this, tL_error, this.a, tLObject, (byte) 17));
    }
}
