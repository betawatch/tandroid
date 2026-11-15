package org.telegram.utils.twidget;

import bi.r1;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements s10 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ r1 b;
    public final /* synthetic */ y0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ g0(boolean[] zArr, r1 r1Var, y0 y0Var, long j3) {
        this.a = zArr;
        this.b = r1Var;
        this.c = y0Var;
        this.d = j3;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        TLRPC.TL_messages_botWidgetQueryAnswer tL_messages_botWidgetQueryAnswer = (TLRPC.TL_messages_botWidgetQueryAnswer) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        org.telegram.messenger.g0.r(this.b);
        y0 y0Var = this.c;
        long j3 = this.d;
        if (tL_messages_botWidgetQueryAnswer != null) {
            y0Var.b(0, n0.C(tL_messages_botWidgetQueryAnswer.result), j3);
        } else {
            String str = tL_error != null ? tL_error.text : "";
            y0Var.b("WIDGET_RESPONSE_TIMEOUT".equals(str) ? 1 : (str == null || !str.startsWith("FLOOD_WAIT")) ? 3 : 2, null, j3);
        }
    }
}
