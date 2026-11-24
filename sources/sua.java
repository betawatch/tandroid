// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sua implements qac {
    public final /* synthetic */ jva a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ qac d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ ylb f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ k47 i;
    public final /* synthetic */ TLRPC.InputInvoice j;
    public final /* synthetic */ TLRPC.TL_payments_paymentFormStars k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;

    public /* synthetic */ sua(jva jvaVar, long j, boolean[] zArr, qac qacVar, Context context, ylb ylbVar, boolean z, String str, k47 k47Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, int i, long j2) {
        this.a = jvaVar;
        this.b = j;
        this.c = zArr;
        this.d = qacVar;
        this.e = context;
        this.f = ylbVar;
        this.g = z;
        this.h = str;
        this.i = k47Var;
        this.j = inputInvoice;
        this.k = tL_payments_paymentFormStars;
        this.l = i;
        this.m = j2;
    }

    @Override // qac
    public final void a(Object obj) {
        qac qacVar = (qac) obj;
        jva jvaVar = this.a;
        long j = jvaVar.f.amount;
        long j2 = this.b;
        boolean[] zArr = this.c;
        qac qacVar2 = this.d;
        k47 k47Var = this.i;
        TLRPC.InputInvoice inputInvoice = this.j;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = this.k;
        int i = this.l;
        if (j >= j2) {
            jvaVar.X(k47Var, inputInvoice, tL_payments_paymentFormStars, new pta(jvaVar, i, qacVar, zArr, qacVar2));
            return;
        }
        boolean c5 = oc7.r1(jvaVar.a).c5();
        Context context = this.e;
        ylb ylbVar = this.f;
        if (c5) {
            boolean[] zArr2 = {false};
            dxa dxaVar = new dxa(context, ylbVar, j2, this.g ? 9 : 0, this.h, new az1(jvaVar, zArr2, k47Var, inputInvoice, tL_payments_paymentFormStars, zArr, i, qacVar2, qacVar), this.m);
            dxaVar.setOnDismissListener(new lv0(jvaVar, qacVar, zArr2, zArr, qacVar2, (byte) 3));
            dxaVar.show();
            return;
        }
        if (qacVar != null) {
            qacVar.a(Boolean.FALSE);
        }
        if (!zArr[0] && qacVar2 != null) {
            qacVar2.a("cancelled");
            zArr[0] = true;
        }
        jva.c0(context, ylbVar);
    }
}
