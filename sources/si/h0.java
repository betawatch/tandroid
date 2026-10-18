package si;

import org.telegram.ui.Components.y01;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                ((y01) s0Var.e).c(o0Var.a);
                return;
            case 1:
                s0 s0Var2 = this.b;
                o0 o0Var2 = this.c;
                p0 p0Var = s0Var2.e;
                long j10 = o0Var2.a;
                y01 y01Var = (y01) p0Var;
                synchronized (y01Var) {
                    y01Var.c(j10);
                }
                return;
            default:
                s0 s0Var3 = this.b;
                o0 o0Var3 = this.c;
                ((y01) s0Var3.e).c(o0Var3.a);
                return;
        }
    }

    public /* synthetic */ h0(s0 s0Var, o0 o0Var, Exception exc) {
        this.a = 1;
        this.b = s0Var;
        this.c = o0Var;
    }
}
