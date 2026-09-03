package wh;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.zj;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class p1 implements zj {
    public final /* synthetic */ mi a;
    public final /* synthetic */ z1 b;

    public p1(z1 z1Var, mi miVar) {
        this.b = z1Var;
        this.a = miVar;
    }

    @Override // org.telegram.ui.Components.zj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        boolean isEmpty = arrayList.isEmpty();
        z1 z1Var = this.b;
        if (!isEmpty) {
            z1Var.M.b2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            r3 r3Var = z1Var.M;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            r3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                r3Var.c2(document, message != null ? message.attachPath : null);
            }
        }
        this.a.dismiss(true);
    }

    @Override // org.telegram.ui.Components.zj
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // org.telegram.ui.Components.zj
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.zj
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z4, int i10) {
    }
}
