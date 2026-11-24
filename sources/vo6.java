// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class vo6 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hq6 b;
    public final /* synthetic */ TLRPC.StickerSet c;

    public /* synthetic */ vo6(hq6 hq6Var, TLRPC.StickerSet stickerSet, byte b) {
        this.a = b;
        this.b = hq6Var;
        this.c = stickerSet;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        TLRPC.StickerSet stickerSet = this.c;
        hq6 hq6Var = this.b;
        switch (b) {
            case 0:
                hq6Var.g1(stickerSet.id, false);
                break;
            default:
                hq6Var.h1(stickerSet.id, false);
                break;
        }
    }
}
