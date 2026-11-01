package xh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class k3 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.web.o b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ k3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = oVar;
        this.c = document;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.Document document = this.c;
                this.b.a((String) obj, document);
                break;
            default:
                TLRPC.Document document2 = this.c;
                this.b.a((String) obj, document2);
                break;
        }
    }
}
