package vi;

import org.telegram.ui.Components.l11;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ o0 c;

    public /* synthetic */ g0(s0 s0Var, o0 o0Var, int i10, int i11) {
        this.a = i11;
        this.b = s0Var;
        this.c = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s0 s0Var = this.b;
                o0 o0Var = this.c;
                ((l11) s0Var.e).c(o0Var.a);
                return;
            case 1:
                s0 s0Var2 = this.b;
                o0 o0Var2 = this.c;
                p0 p0Var = s0Var2.e;
                long j10 = o0Var2.a;
                l11 l11Var = (l11) p0Var;
                synchronized (l11Var) {
                    l11Var.c(j10);
                }
                return;
            default:
                s0 s0Var3 = this.b;
                o0 o0Var3 = this.c;
                ((l11) s0Var3.e).c(o0Var3.a);
                return;
        }
    }

    public /* synthetic */ g0(s0 s0Var, o0 o0Var, Exception exc) {
        this.a = 1;
        this.b = s0Var;
        this.c = o0Var;
    }
}
