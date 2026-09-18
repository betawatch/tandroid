package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.af;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i5 implements Utilities.Callback {
    public final /* synthetic */ v5 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ i5(v5 v5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = v5Var;
        this.b = j3;
        this.c = i10;
        this.d = zArr;
        this.e = callback2;
        this.f = context;
        this.g = f6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        v5 v5Var = this.a;
        long j3 = v5Var.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j3 >= j10) {
            v5Var.Z(str, chatInvite, new h4(callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(this.c).starsPurchaseAvailable();
        Context context = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = this.g;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            n7 n7Var = new n7(context, f6Var, j10, 1, chatInvite.title, new af((Object) v5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            n7Var.setOnDismissListener(new org.telegram.ui.web.d0(v5Var, callback, zArr2, zArr, callback2, 1));
            n7Var.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0]) {
            callback2.run("cancelled", 0L);
            zArr[0] = true;
        }
        v5.e0(context, f6Var);
    }
}
