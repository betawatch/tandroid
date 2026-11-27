// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wwa implements pcc {
    public final /* synthetic */ jxa a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ icc e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ vnb g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ wwa(jxa jxaVar, long j, int i, boolean[] zArr, icc iccVar, Context context, vnb vnbVar, TLRPC.ChatInvite chatInvite, String str) {
        this.a = jxaVar;
        this.b = j;
        this.c = i;
        this.d = zArr;
        this.e = iccVar;
        this.f = context;
        this.g = vnbVar;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // pcc
    public final void a(Object obj) {
        pcc pccVar = (pcc) obj;
        jxa jxaVar = this.a;
        long j = jxaVar.f.amount;
        long j2 = this.b;
        boolean[] zArr = this.d;
        icc iccVar = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j >= j2) {
            jxaVar.Z(str, chatInvite, new nva(pccVar, zArr, iccVar));
            return;
        }
        boolean i5 = uc7.s1(this.c).i5();
        Context context = this.f;
        vnb vnbVar = this.g;
        if (i5) {
            boolean[] zArr2 = {false};
            dza dzaVar = new dza(context, vnbVar, j2, 1, chatInvite.title, new ra7((Object) jxaVar, (Object) zArr2, (Object) str, (Object) chatInvite, (Object) zArr, (Object) iccVar, (Object) pccVar, (byte) 18), 0L);
            dzaVar.setOnDismissListener(new mu0(jxaVar, pccVar, zArr2, zArr, iccVar, (byte) 2));
            dzaVar.show();
            return;
        }
        if (pccVar != null) {
            pccVar.a(Boolean.FALSE);
        }
        if (!zArr[0]) {
            iccVar.a("cancelled", 0L);
            zArr[0] = true;
        }
        jxa.d0(context, vnbVar);
    }
}
