// default package

import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qo implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bp b;

    public /* synthetic */ qo(bp bpVar, byte b) {
        this.a = b;
        this.b = bpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        bp bpVar = this.b;
        switch (b) {
            case 0:
                if ((bpVar.j0 & 1) != 0) {
                    bpVar.j(0);
                }
                if ((bpVar.j0 & TLObject.FLAG_12) != 0) {
                    bpVar.j(kk7.s1);
                }
                bpVar.i0 = false;
                bpVar.j0 = 0;
                break;
            default:
                bpVar.F.showAtLocation(bpVar.E, 55, 0, 0);
                afc afcVar = bpVar.H;
                if (afcVar != null) {
                    afcVar.b();
                }
                if (bpVar.J && (viewGroup = bpVar.K) != null) {
                    WeakHashMap weakHashMap = jdc.a;
                    if (viewGroup.isLaidOut()) {
                        bpVar.E.setAlpha(0.0f);
                        afc a = jdc.a(bpVar.E);
                        a.a(1.0f);
                        bpVar.H = a;
                        a.d(new ro(this, (byte) 0));
                        break;
                    }
                }
                bpVar.E.setAlpha(1.0f);
                bpVar.E.setVisibility(0);
                break;
        }
    }
}
