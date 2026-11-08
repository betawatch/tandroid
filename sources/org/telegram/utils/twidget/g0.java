package org.telegram.utils.twidget;

import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements v10 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ bi.i0 b;
    public final /* synthetic */ v0 c;
    public final /* synthetic */ long d;

    public /* synthetic */ g0(boolean[] zArr, bi.i0 i0Var, v0 v0Var, long j3) {
        this.a = zArr;
        this.b = i0Var;
        this.c = v0Var;
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
        v0 v0Var = this.c;
        long j3 = this.d;
        if (tL_messages_botWidgetQueryAnswer != null) {
            v0Var.b(0, n0.C(tL_messages_botWidgetQueryAnswer.result), j3);
        } else {
            String str = tL_error != null ? tL_error.text : "";
            v0Var.b("WIDGET_RESPONSE_TIMEOUT".equals(str) ? 1 : (str == null || !str.startsWith("FLOOD_WAIT")) ? 3 : 2, null, j3);
        }
    }
}
