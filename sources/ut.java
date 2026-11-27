// default package

import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ut extends itd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ut(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // itd, ix0
    public final void x() {
        switch (this.a) {
            case 3:
                ((kea) this.b).T1 = true;
                break;
        }
    }

    @Override // itd, ix0
    public final boolean y() {
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                o oVar = (o) obj;
                amb ambVar = oVar.R0;
                if (ambVar == null || !ambVar.w()) {
                    return true;
                }
                oVar.R0.e(false);
                return false;
            case 1:
                z = ((w45) obj).m;
                break;
            case 2:
                z = ((n55) obj).d;
                break;
            default:
                return super.y();
        }
        return !z;
    }
}
