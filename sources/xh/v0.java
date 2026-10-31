package xh;

import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v0 implements us {
    public final /* synthetic */ long a;
    public final /* synthetic */ us[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ u0 d;

    public v0(long j10, us[] usVarArr, int i10, u0 u0Var) {
        this.a = j10;
        this.b = usVarArr;
        this.c = i10;
        this.d = u0Var;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = zs.w0;
        if (i10 != i12 || (hVar = (a0.h) objArr[0]) == null) {
            return;
        }
        long j10 = this.a;
        if (hVar.d(j10)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
            us[] usVarArr = this.b;
            if (usVarArr[0] != null) {
                zs.f(this.c).n(usVarArr[0], i12);
                usVarArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.a(webPage);
        }
    }
}
