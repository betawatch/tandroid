package rh;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.sj;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class o1 implements sj {
    public final /* synthetic */ gi a;
    public final /* synthetic */ x1 b;

    public o1(x1 x1Var, gi giVar) {
        this.b = x1Var;
        this.a = giVar;
    }

    @Override // org.telegram.ui.Components.sj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        boolean isEmpty = arrayList.isEmpty();
        x1 x1Var = this.b;
        if (!isEmpty) {
            x1Var.L.c2((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            p3 p3Var = x1Var.L;
            MessageObject messageObject = (MessageObject) arrayList3.get(0);
            p3Var.getClass();
            if (messageObject != null && messageObject.getDocument() != null) {
                TLRPC.Document document = messageObject.getDocument();
                TLRPC.Message message = messageObject.messageOwner;
                p3Var.d2(document, message != null ? message.attachPath : null);
            }
        }
        this.a.dismiss(true);
    }

    @Override // org.telegram.ui.Components.sj
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.startActivityForResult(intent, 21);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Components.sj
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.sj
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
