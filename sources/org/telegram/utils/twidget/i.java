package org.telegram.utils.twidget;

import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements v10 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ bi.i0 b;
    public final /* synthetic */ u c;
    public final /* synthetic */ long d;

    public /* synthetic */ i(boolean[] zArr, bi.i0 i0Var, u uVar, long j3) {
        this.a = zArr;
        this.b = i0Var;
        this.c = uVar;
        this.d = j3;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.messenger.g0.r(this.b);
        u uVar = this.c;
        long j3 = this.d;
        if (tL_messages_botWidgetQueryAnswer != null) {
            uVar.a(0, p.A(tL_messages_botWidgetQueryAnswer.result), j3);
        } else {
            String str = tL_error != null ? tL_error.text : "";
            uVar.a("WIDGET_RESPONSE_TIMEOUT".equals(str) ? 1 : (str == null || !str.startsWith("FLOOD_WAIT")) ? 3 : 2, null, j3);
        }
    }
}
