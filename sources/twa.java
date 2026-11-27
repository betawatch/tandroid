// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class twa implements pcc {
    public final /* synthetic */ jxa a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ pcc d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ vnb f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ r47 i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ twa(jxa jxaVar, long j, boolean[] zArr, pcc pccVar, Context context, vnb vnbVar, boolean z, String str, r47 r47Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i, long j2) {
        this.a = jxaVar;
        this.b = j;
        this.c = zArr;
        this.d = pccVar;
        this.e = context;
        this.f = vnbVar;
        this.g = z;
        this.h = str;
        this.i = r47Var;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i;
        this.m = j2;
    }

    @Override // pcc
    public final void a(Object obj) {
        pcc pccVar = (pcc) obj;
        jxa jxaVar = this.a;
        long j = jxaVar.f.amount;
        long j2 = this.b;
        boolean[] zArr = this.c;
        pcc pccVar2 = this.d;
        r47 r47Var = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i = this.l;
        if (j >= j2) {
            jxaVar.Y(r47Var, inputInvoice, tL_payments_paymentFormStars, new sva(jxaVar, i, pccVar, zArr, pccVar2));
            return;
        }
        boolean i5 = uc7.s1(jxaVar.a).i5();
        Context context = this.e;
        vnb vnbVar = this.f;
        if (i5) {
            boolean[] zArr2 = {false};
            dza dzaVar = new dza(context, vnbVar, j2, this.g ? 9 : 0, this.h, new zx1(jxaVar, zArr2, r47Var, inputInvoice, tL_payments_paymentFormStars, zArr, i, pccVar2, pccVar), this.m);
            dzaVar.setOnDismissListener(new mu0(jxaVar, pccVar, zArr2, zArr, pccVar2, (byte) 3));
            dzaVar.show();
            return;
        }
        if (pccVar != null) {
            pccVar.a(Boolean.FALSE);
        }
        if (!zArr[0] && pccVar2 != null) {
            pccVar2.a("cancelled");
            zArr[0] = true;
        }
        jxa.d0(context, vnbVar);
    }
}
