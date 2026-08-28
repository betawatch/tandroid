package qh;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.wj;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class o1 implements wj {
    public final /* synthetic */ ki a;
    public final /* synthetic */ x1 b;

    public o1(x1 x1Var, ki kiVar) {
        this.b = x1Var;
        this.a = kiVar;
    }

    @Override // org.telegram.ui.Components.wj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i9, long j10, boolean z11, long j11) {
        boolean isEmpty = arrayList.isEmpty();
        x1 x1Var = this.b;
        if (!isEmpty) {
            x1Var.L.c2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            o3 o3Var = x1Var.L;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            o3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                o3Var.d2(document, message != null ? message.attachPath : null);
            }
        }
        this.a.dismiss(true);
    }

    @Override // org.telegram.ui.Components.wj
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.wj
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.wj
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z10, int i9) {
    }
}
