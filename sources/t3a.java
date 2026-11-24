// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t3a implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_stickers_createStickerSet a;
    public final /* synthetic */ u3a b;

    public t3a(u3a u3aVar, TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet) {
        this.b = u3aVar;
        this.a = tL_stickers_createStickerSet;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.c3(new bm8(this, tL_error, this.a, tLObject));
    }
}
