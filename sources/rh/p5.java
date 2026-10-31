package rh;

import android.content.Context;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.aj0;
import org.telegram.ui.t70;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements q20 {
    public final /* synthetic */ e6 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ q20 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ jj i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ p5(e6 e6Var, long j10, boolean[] zArr, q20 q20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, String str, jj jjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i10, long j11) {
        this.a = e6Var;
        this.b = j10;
        this.c = zArr;
        this.d = q20Var;
        this.e = context;
        this.f = p6Var;
        this.g = z10;
        this.h = str;
        this.i = jjVar;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i10;
        this.m = j11;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        q20 q20Var = (q20) obj;
        e6 e6Var = this.a;
        long j10 = e6Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.c;
        q20 q20Var2 = this.d;
        jj jjVar = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i10 = this.l;
        if (j10 >= j11) {
            e6Var.Z(jjVar, inputInvoice, tL_payments_paymentFormStars, new n4(e6Var, i10, q20Var, zArr, q20Var2));
            return;
        }
        boolean z10 = vp.r1(e6Var.a).k7;
        Context context = this.e;
        org.telegram.ui.ActionBar.p6 p6Var = this.f;
        if (!z10) {
            boolean[] zArr2 = {false};
            x7 x7Var = new x7(context, p6Var, j11, this.g ? 9 : 0, this.h, new t70(e6Var, zArr2, jjVar, inputInvoice, tL_payments_paymentFormStars, zArr, i10, q20Var2, q20Var), this.m);
            x7Var.setOnDismissListener(new aj0(e6Var, q20Var, zArr2, zArr, q20Var2, 3));
            x7Var.show();
            return;
        }
        if (q20Var != null) {
            q20Var.a(Boolean.FALSE);
        }
        if (!zArr[0] && q20Var2 != null) {
            q20Var2.a("cancelled");
            zArr[0] = true;
        }
        e6.c0(context, p6Var);
    }
}
