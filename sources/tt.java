// default package

import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tt extends sod {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tt(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // sod, ax0
    public final void x() {
        switch (this.a) {
            case 3:
                ((taa) this.b).T1 = true;
                break;
        }
    }

    @Override // sod, ax0
    public final boolean y() {
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                o oVar = (o) obj;
                fib fibVar = oVar.R0;
                if (fibVar == null || !fibVar.w()) {
                    return true;
                }
                oVar.R0.e(false);
                return false;
            case 1:
                z = ((s25) obj).m;
                break;
            case 2:
                z = ((j35) obj).d;
                break;
            default:
                return super.y();
        }
        return !z;
    }
}
