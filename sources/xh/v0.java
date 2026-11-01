package xh;

import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class v0 implements vs {
    public final /* synthetic */ long a;
    public final /* synthetic */ vs[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ u0 d;

    public v0(long j10, vs[] vsVarArr, int i10, u0 u0Var) {
        this.a = j10;
        this.b = vsVarArr;
        this.c = i10;
        this.d = u0Var;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = at.w0;
        if (i10 != i12 || (hVar = (a0.h) objArr[0]) == null) {
            return;
        }
        long j10 = this.a;
        if (hVar.d(j10)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
            vs[] vsVarArr = this.b;
            if (vsVarArr[0] != null) {
                at.f(this.c).n(vsVarArr[0], i12);
                vsVarArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.a(webPage);
        }
    }
}
