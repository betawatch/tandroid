// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uua implements qac {
    public final /* synthetic */ jva a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ jac e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ ylb g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ uua(jva jvaVar, long j, int i, boolean[] zArr, jac jacVar, Context context, ylb ylbVar, TLRPC.ChatInvite chatInvite, String str) {
        this.a = jvaVar;
        this.b = j;
        this.c = i;
        this.d = zArr;
        this.e = jacVar;
        this.f = context;
        this.g = ylbVar;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // qac
    public final void a(Object obj) {
        qac qacVar = (qac) obj;
        jva jvaVar = this.a;
        long j = jvaVar.f.amount;
        long j2 = this.b;
        boolean[] zArr = this.d;
        jac jacVar = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j >= j2) {
            jvaVar.Y(str, chatInvite, new mta(qacVar, zArr, jacVar));
            return;
        }
        boolean c5 = oc7.r1(this.c).c5();
        Context context = this.f;
        ylb ylbVar = this.g;
        if (c5) {
            boolean[] zArr2 = {false};
            dxa dxaVar = new dxa(context, ylbVar, j2, 1, chatInvite.title, new ja7((Object) jvaVar, (Object) zArr2, (Object) str, (Object) chatInvite, (Object) zArr, (Object) jacVar, (Object) qacVar, (byte) 18), 0L);
            dxaVar.setOnDismissListener(new lv0(jvaVar, qacVar, zArr2, zArr, jacVar, (byte) 2));
            dxaVar.show();
            return;
        }
        if (qacVar != null) {
            qacVar.a(Boolean.FALSE);
        }
        if (!zArr[0]) {
            jacVar.a("cancelled", 0L);
            zArr[0] = true;
        }
        jva.c0(context, ylbVar);
    }
}
