// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qsa implements p8c {
    public final /* synthetic */ gta a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ p8c d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ wjb f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ k27 i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ qsa(gta gtaVar, long j, boolean[] zArr, p8c p8cVar, Context context, wjb wjbVar, boolean z, String str, k27 k27Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i, long j2) {
        this.a = gtaVar;
        this.b = j;
        this.c = zArr;
        this.d = p8cVar;
        this.e = context;
        this.f = wjbVar;
        this.g = z;
        this.h = str;
        this.i = k27Var;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i;
        this.m = j2;
    }

    @Override // p8c
    public final void a(Object obj) {
        p8c p8cVar = (p8c) obj;
        gta gtaVar = this.a;
        long j = gtaVar.f.amount;
        long j2 = this.b;
        boolean[] zArr = this.c;
        p8c p8cVar2 = this.d;
        k27 k27Var = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i = this.l;
        if (j >= j2) {
            gtaVar.X(k27Var, inputInvoice, tL_payments_paymentFormStars, new ora(gtaVar, i, p8cVar, zArr, p8cVar2));
            return;
        }
        boolean a5 = na7.q1(gtaVar.a).a5();
        Context context = this.e;
        wjb wjbVar = this.f;
        if (a5) {
            boolean[] zArr2 = {false};
            zua zuaVar = new zua(context, wjbVar, j2, this.g ? 9 : 0, this.h, new nx1(gtaVar, zArr2, k27Var, inputInvoice, tL_payments_paymentFormStars, zArr, i, p8cVar2, p8cVar), this.m);
            zuaVar.setOnDismissListener(new cu0(gtaVar, p8cVar, zArr2, zArr, p8cVar2, (byte) 3));
            zuaVar.show();
            return;
        }
        if (p8cVar != null) {
            p8cVar.a(Boolean.FALSE);
        }
        if (!zArr[0] && p8cVar2 != null) {
            p8cVar2.a("cancelled");
            zArr[0] = true;
        }
        gta.c0(context, wjbVar);
    }
}
