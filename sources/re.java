// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class re implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ p8c e;
    public final /* synthetic */ long f;

    public /* synthetic */ re(int i, long j, long j2, p8c p8cVar, long j3, byte b) {
        this.a = b;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = p8cVar;
        this.f = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        wjb f53Var;
        switch (this.a) {
            case 0:
                int i = this.b;
                long j = gta.v(i, false).m().amount;
                long j2 = this.c;
                p8c p8cVar = this.e;
                long j3 = this.f;
                if (j >= j2) {
                    p8cVar.a(Long.valueOf(j3));
                    break;
                } else {
                    Activity u0 = gl.u0();
                    d S = LaunchActivity.S();
                    if (!PhotoViewer.r0().U0()) {
                        if (S == null) {
                            f53Var = null;
                        } else if (!S.hasShownSheet()) {
                            f53Var = S.getResourceProvider();
                        }
                        wjb wjbVar = f53Var;
                        if (u0 == null) {
                            long j4 = this.d;
                            new zua(u0, wjbVar, j2, 13, cf3.r(i, j4), new mf(p8cVar, j3, (byte) 0), j4).show();
                            break;
                        }
                    }
                    f53Var = new f53();
                    wjb wjbVar2 = f53Var;
                    if (u0 == null) {
                    }
                }
                break;
            default:
                int i2 = this.b;
                re reVar = new re(i2, this.c, this.d, this.e, this.f, (byte) 0);
                if (!gta.v(i2, false).e) {
                    gta v = gta.v(i2, false);
                    v.e = false;
                    v.n(reVar, false, true);
                    v.e = true;
                    break;
                } else {
                    reVar.run();
                    break;
                }
        }
    }
}
