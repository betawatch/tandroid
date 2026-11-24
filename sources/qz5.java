// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class qz5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rz5 b;
    public final /* synthetic */ j5 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ d e;

    public /* synthetic */ qz5(rz5 rz5Var, j5 j5Var, long j, d dVar, byte b) {
        this.a = b;
        this.b = rz5Var;
        this.c = j5Var;
        this.d = j;
        this.e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gl.d3(new qz5(this.b, this.c, this.d, this.e, (byte) 1));
                break;
            default:
                j5 j5Var = this.c;
                int i = j5Var.a;
                na7 q1 = na7.q1(i);
                long j = this.d;
                long j2 = -j;
                fc2 e1 = q1.e1(j2, false, null);
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(j2));
                na7.q1(i).h1(j);
                rgc.l(K0, null, false, Boolean.valueOf(e1 == null || !e1.b.rtmp_stream), this.b.h, this.e, j5Var);
                break;
        }
    }
}
