package sh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements Utilities.Callback {
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ g6 f;
    public final /* synthetic */ org.telegram.ui.web.u g;
    public final /* synthetic */ eh.w h;

    public /* synthetic */ w0(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, g6 g6Var, org.telegram.ui.web.u uVar, eh.w wVar) {
        this.a = d2Var;
        this.b = context;
        this.c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f = g6Var;
        this.g = uVar;
        this.h = wVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        this.a.dismiss();
        new e1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
