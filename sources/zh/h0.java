package zh;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ h0(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m0 m0Var = this.b;
                if (m0Var.h == null && m0Var.d != null && !m0Var.isFinished && m0Var.getParentActivity() != null) {
                    m0Var.a0(m0Var.d.D0(), 0.0f, true);
                    m0Var.h.setVisibility(4);
                    c cVar = m0Var.x;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                m0 m0Var2 = this.b;
                c cVar2 = m0Var2.x;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                m0Var2.f0();
                break;
            default:
                this.b.e0();
                break;
        }
    }
}
