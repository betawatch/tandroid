// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tr0 implements p8c {
    public final /* synthetic */ hd a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ wjb f;
    public final /* synthetic */ st0 g;
    public final /* synthetic */ p h;

    public /* synthetic */ tr0(hd hdVar, Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, wjb wjbVar, st0 st0Var, p pVar) {
        this.a = hdVar;
        this.b = context;
        this.c = i;
        this.d = j;
        this.e = tL_messages_preparedInlineMessage;
        this.f = wjbVar;
        this.g = st0Var;
        this.h = pVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        this.a.dismiss();
        new ds0(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
