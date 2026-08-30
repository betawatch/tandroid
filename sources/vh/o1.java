package vh;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.xj;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class o1 implements xj {
    public final /* synthetic */ li a;
    public final /* synthetic */ y1 b;

    public o1(y1 y1Var, li liVar) {
        this.b = y1Var;
        this.a = liVar;
    }

    @Override // org.telegram.ui.Components.xj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        boolean isEmpty = arrayList.isEmpty();
        y1 y1Var = this.b;
        if (!isEmpty) {
            y1Var.M.c2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            r3 r3Var = y1Var.M;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            r3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                r3Var.d2(document, message != null ? message.attachPath : null);
            }
        }
        this.a.dismiss(true);
    }

    @Override // org.telegram.ui.Components.xj
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.xj
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.xj
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z4, int i10) {
    }
}
