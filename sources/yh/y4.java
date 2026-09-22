package yh;

import android.content.Context;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jb;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements Utilities.Callback {
    public final /* synthetic */ u5 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ Utilities.Callback d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ MessageObject i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ y4(u5 u5Var, long j3, boolean[] zArr, Utilities.Callback callback, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j10) {
        this.a = u5Var;
        this.b = j3;
        this.c = zArr;
        this.d = callback;
        this.e = context;
        this.f = e6Var;
        this.g = z10;
        this.h = str;
        this.i = messageObject;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i10;
        this.m = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        Utilities.Callback callback = (Utilities.Callback) obj;
        u5 u5Var = this.a;
        long j3 = u5Var.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.c;
        Utilities.Callback callback2 = this.d;
        MessageObject messageObject = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i10 = this.l;
        if (j3 >= j10) {
            u5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new c5(u5Var, i10, callback, zArr, callback2));
            return;
        }
        boolean starsPurchaseAvailable = MessagesController.getInstance(u5Var.a).starsPurchaseAvailable();
        Context context = this.e;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        if (starsPurchaseAvailable) {
            boolean[] zArr2 = {false};
            m7 m7Var = new m7(context, e6Var, j10, this.g ? 9 : 0, this.h, new jb(u5Var, zArr2, messageObject, inputInvoice, tL_payments_paymentFormStars, zArr, i10, callback2, callback), this.m);
            m7Var.setOnDismissListener(new org.telegram.ui.web.d0(u5Var, callback, zArr2, zArr, callback2, 2));
            m7Var.show();
            return;
        }
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        if (!zArr[0] && callback2 != null) {
            callback2.run("cancelled");
            zArr[0] = true;
        }
        u5.e0(context, e6Var);
    }
}
