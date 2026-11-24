// default package

import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yt extends ive {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o b;

    public /* synthetic */ yt(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override // ive
    public final void a(boolean z) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                if (z) {
                    oVar.i0.h(false);
                    break;
                }
                break;
            default:
                fx0 fx0Var = oVar.J;
                if (fx0Var != null) {
                    fx0Var.E0 = z;
                    break;
                }
                break;
        }
    }

    @Override // ive
    public final void b() {
        switch (this.a) {
            case 0:
                if (gl.C3()) {
                    new u21(this.b.h0, null).i(k96.M0(2131743953, null)).j();
                    break;
                }
                break;
        }
    }
}
