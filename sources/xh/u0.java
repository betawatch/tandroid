package xh;

import android.content.Context;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements q20 {
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TLRPC.TL_messages_preparedInlineMessage e;
    public final /* synthetic */ p6 f;
    public final /* synthetic */ org.telegram.ui.web.q g;
    public final /* synthetic */ org.telegram.tgnet.e h;

    public /* synthetic */ u0(org.telegram.ui.ActionBar.x1 x1Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, p6 p6Var, org.telegram.ui.web.q qVar, org.telegram.tgnet.e eVar) {
        this.a = x1Var;
        this.b = context;
        this.c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f = p6Var;
        this.g = qVar;
        this.h = eVar;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        this.a.dismiss();
        new c1(this.b, this.c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f, this.g, this.h).show();
    }
}
