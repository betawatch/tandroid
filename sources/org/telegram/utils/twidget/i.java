package org.telegram.utils.twidget;

import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements j20 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ org.telegram.messenger.voip.g b;
    public final /* synthetic */ w c;
    public final /* synthetic */ long d;

    public /* synthetic */ i(boolean[] zArr, org.telegram.messenger.voip.g gVar, w wVar, long j10) {
        this.a = zArr;
        this.b = gVar;
        this.c = wVar;
        this.d = j10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.messenger.i0.r(this.b);
        w wVar = this.c;
        long j10 = this.d;
        if (tL_messages_botWidgetQueryAnswer != null) {
            wVar.a(0, p.A(tL_messages_botWidgetQueryAnswer.result), j10);
        } else {
            String str = tL_error != null ? tL_error.text : "";
            wVar.a("WIDGET_RESPONSE_TIMEOUT".equals(str) ? 1 : (str == null || !str.startsWith("FLOOD_WAIT")) ? 3 : 2, null, j10);
        }
    }
}
