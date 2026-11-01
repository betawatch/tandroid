package rh;

import android.content.Context;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.s70;
import org.telegram.ui.yi0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements r20 {
    public final /* synthetic */ e6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ r20 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ kj i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ p5(e6 e6Var, long j10, boolean[] zArr, r20 r20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, String str, kj kjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.a = e6Var;
        this.b = j10;
        this.c = zArr;
        this.d = r20Var;
        this.e = context;
        this.f = p6Var;
        this.g = z10;
        this.h = str;
        this.i = kjVar;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i10;
        this.m = j11;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        r20 r20Var = (r20) obj;
        e6 e6Var = this.a;
        long j10 = e6Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.c;
        r20 r20Var2 = this.d;
        kj kjVar = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i10 = this.l;
        if (j10 >= j11) {
            e6Var.Z(kjVar, inputInvoice, tL_payments_paymentFormStars, new n4(e6Var, i10, r20Var, zArr, r20Var2));
            return;
        }
        boolean z10 = wp.r1(e6Var.a).k7;
        Context context = this.e;
        org.telegram.ui.ActionBar.p6 p6Var = this.f;
        if (!z10) {
            boolean[] zArr2 = {false};
            x7 x7Var = new x7(context, p6Var, j11, this.g ? 9 : 0, this.h, new s70(e6Var, zArr2, kjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i10, r20Var2, r20Var), this.m);
            x7Var.setOnDismissListener(new yi0(e6Var, r20Var, zArr2, zArr, r20Var2, 3));
            x7Var.show();
            return;
        }
        if (r20Var != null) {
            r20Var.a(Boolean.FALSE);
        }
        if (!zArr[0] && r20Var2 != null) {
            r20Var2.a("cancelled");
            zArr[0] = true;
        }
        e6.c0(context, p6Var);
    }
}
