package xh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.web.o b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ j3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = oVar;
        this.c = document;
    }

    @Override // org.telegram.messenger.q20
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
