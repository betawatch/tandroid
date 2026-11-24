// default package

import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qp implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bq b;

    public /* synthetic */ qp(bq bqVar, byte b) {
        this.a = b;
        this.b = bqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        bq bqVar = this.b;
        switch (b) {
            case 0:
                if ((bqVar.j0 & 1) != 0) {
                    bqVar.j(0);
                }
                if ((bqVar.j0 & TLObject.FLAG_12) != 0) {
                    bqVar.j(nm7.s1);
                }
                bqVar.i0 = false;
                bqVar.j0 = 0;
                break;
            default:
                bqVar.F.showAtLocation(bqVar.E, 55, 0, 0);
                ahc ahcVar = bqVar.H;
                if (ahcVar != null) {
                    ahcVar.b();
                }
                if (bqVar.J && (viewGroup = bqVar.K) != null) {
                    WeakHashMap weakHashMap = kfc.a;
                    if (viewGroup.isLaidOut()) {
                        bqVar.E.setAlpha(0.0f);
                        ahc a = kfc.a(bqVar.E);
                        a.a(1.0f);
                        bqVar.H = a;
                        a.d(new rp(this, (byte) 0));
                        break;
                    }
                }
                bqVar.E.setAlpha(1.0f);
                bqVar.E.setVisibility(0);
                break;
        }
    }
}
