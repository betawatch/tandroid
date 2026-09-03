package sh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.web.s b;
    public final /* synthetic */ TLRPC.Document c;

    public /* synthetic */ o3(org.telegram.ui.web.s sVar, TLRPC.Document document, int i10) {
        this.a = i10;
        this.b = sVar;
        this.c = document;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                TLRPC.Document document = this.c;
                this.b.run((String) obj, document);
                break;
            default:
                TLRPC.Document document2 = this.c;
                this.b.run((String) obj, document2);
                break;
        }
    }
}
