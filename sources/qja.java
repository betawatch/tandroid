// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qja implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ int c;
    public final /* synthetic */ k27 d;
    public final /* synthetic */ gb2 e;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet f;

    public /* synthetic */ qja(TLRPC.Document document, int i, k27 k27Var, gb2 gb2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, byte b) {
        this.a = b;
        this.b = document;
        this.c = i;
        this.d = k27Var;
        this.e = gb2Var;
        this.f = tL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f;
        gb2 gb2Var = this.e;
        k27 k27Var = this.d;
        int i = this.c;
        TLRPC.Document document = this.b;
        switch (b) {
            case 0:
                up3.q(i).a(ba4.r(null, document), k27Var, gb2Var);
                ba4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                break;
            default:
                up3.q(i).a(ba4.r(null, document), k27Var, gb2Var);
                ba4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                break;
        }
    }
}
