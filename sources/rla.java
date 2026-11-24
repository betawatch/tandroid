// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rla implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.Document b;
    public final /* synthetic */ int c;
    public final /* synthetic */ k47 d;
    public final /* synthetic */ rc2 e;
    public final /* synthetic */ TLRPC.TL_messages_stickerSet f;

    public /* synthetic */ rla(TLRPC.Document document, int i, k47 k47Var, rc2 rc2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, byte b) {
        this.a = b;
        this.b = document;
        this.c = i;
        this.d = k47Var;
        this.e = rc2Var;
        this.f = tL_messages_stickerSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.f;
        rc2 rc2Var = this.e;
        k47 k47Var = this.d;
        int i = this.c;
        TLRPC.Document document = this.b;
        switch (b) {
            case 0:
                er3.q(i).a(bc4.r(null, document), k47Var, rc2Var);
                bc4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                break;
            default:
                er3.q(i).a(bc4.r(null, document), k47Var, rc2Var);
                bc4.G(i).X(document, tL_messages_stickerSet, 1, 1);
                break;
        }
    }
}
