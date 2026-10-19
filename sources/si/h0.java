package si;

import org.telegram.ui.Components.z01;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;
    public final /* synthetic */ o0 c;

    public /* synthetic */ h0(s0 s0Var, o0 o0Var, int i10, int i11) {
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
                ((z01) s0Var.e).c(o0Var.a);
                return;
            case 1:
                s0 s0Var2 = this.b;
                o0 o0Var2 = this.c;
                p0 p0Var = s0Var2.e;
                long j10 = o0Var2.a;
                z01 z01Var = (z01) p0Var;
                synchronized (z01Var) {
                    z01Var.c(j10);
                }
                return;
            default:
                s0 s0Var3 = this.b;
                o0 o0Var3 = this.c;
                ((z01) s0Var3.e).c(o0Var3.a);
                return;
        }
    }

    public /* synthetic */ h0(s0 s0Var, o0 o0Var, Exception exc) {
        this.a = 1;
        this.b = s0Var;
        this.c = o0Var;
    }
}
