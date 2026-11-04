package org.telegram.utils.twidget;

import ai.z1;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements n10 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ z1 b;
    public final /* synthetic */ u c;
    public final /* synthetic */ long d;

    public /* synthetic */ i(boolean[] zArr, z1 z1Var, u uVar, long j10) {
        this.a = zArr;
        this.b = z1Var;
        this.c = uVar;
        this.d = j10;
    }

    @Override // org.telegram.messenger.n10
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
        long j10 = this.d;
        if (tL_messages_botWidgetQueryAnswer != null) {
            uVar.a(0, p.A(tL_messages_botWidgetQueryAnswer.result), j10);
        } else {
            String str = tL_error != null ? tL_error.text : "";
            uVar.a("WIDGET_RESPONSE_TIMEOUT".equals(str) ? 1 : (str == null || !str.startsWith("FLOOD_WAIT")) ? 3 : 2, null, j10);
        }
    }
}
