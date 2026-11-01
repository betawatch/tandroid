package th;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ k6(l6 l6Var, int i10) {
        this.a = i10;
        this.b = l6Var;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                l6.c(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
            default:
                l6.b(this.b, (TLRPC.TL_messages_stickerSet) obj);
                break;
        }
    }
}
