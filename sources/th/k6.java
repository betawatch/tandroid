package th;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k6 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l6 b;

    public /* synthetic */ k6(l6 l6Var, int i10) {
        this.a = i10;
        this.b = l6Var;
    }

    @Override // org.telegram.messenger.q20
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
