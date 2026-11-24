// default package

import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tu extends vqd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tu(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // vqd, hy0
    public final void w() {
        switch (this.a) {
            case 3:
                ((tca) this.b).T1 = true;
                break;
        }
    }

    @Override // vqd, hy0
    public final boolean x() {
        boolean z;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                o oVar = (o) obj;
                gkb gkbVar = oVar.R0;
                if (gkbVar == null || !gkbVar.w()) {
                    return true;
                }
                oVar.R0.e(false);
                return false;
            case 1:
                z = ((s45) obj).m;
                break;
            case 2:
                z = ((j55) obj).d;
                break;
            default:
                return super.x();
        }
        return !z;
    }
}
