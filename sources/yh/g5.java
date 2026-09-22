package yh;

import android.content.Context;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ze;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements Utilities.Callback {
    public final /* synthetic */ u5 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ g5(u5 u5Var, long j3, int i10, boolean[] zArr, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = u5Var;
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
        u5 u5Var = this.a;
        long j3 = u5Var.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.d;
        Utilities.Callback2 callback2 = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j3 >= j10) {
            u5Var.Z(str, chatInvite, new f4(callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(this.c).starsPurchaseAvailable();
        Context context = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = this.g;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            l7 l7Var = new l7(context, f6Var, j10, 1, chatInvite.title, new ze((Object) u5Var, (Object) zArr2, str, (TLObject) chatInvite, (Object) zArr, (Object) callback2, (Object) callback, 10), 0L);
            l7Var.setOnDismissListener(new org.telegram.ui.web.d0(u5Var, callback, zArr2, zArr, callback2, 1));
            l7Var.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0]) {
            callback2.run("cancelled", 0L);
            zArr[0] = true;
        }
        u5.e0(context, f6Var);
    }
}
