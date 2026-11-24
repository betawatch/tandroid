// default package

import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zrc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zrc(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                asc ascVar = (asc) obj;
                if (!ascVar.r && i == ascVar.K) {
                    ascVar.M = false;
                    ascVar.a.g3.O(true);
                    break;
                }
                break;
            case 1:
                tvc tvcVar = (tvc) obj;
                ndc ndcVar = tvcVar.a;
                if (i != -1) {
                    if (i != 1) {
                        if (i != -3 && i == -2 && ndcVar.c0()) {
                            tvcVar.L = true;
                            ndcVar.f0();
                            tvcVar.n();
                            break;
                        }
                    } else if (tvcVar.L) {
                        tvcVar.L = false;
                        ndcVar.g0();
                        break;
                    }
                } else {
                    if (ndcVar.c0()) {
                        ndcVar.f0();
                        tvcVar.n();
                    }
                    tvcVar.K = false;
                    break;
                }
                break;
            default:
                try {
                    ((z) obj).h(i);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
