// default package

import android.view.ViewGroup;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ro implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cp b;

    public /* synthetic */ ro(cp cpVar, byte b) {
        this.a = b;
        this.b = cpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                if ((cpVar.j0 & 1) != 0) {
                    cpVar.j(0);
                }
                if ((cpVar.j0 & TLObject.FLAG_12) != 0) {
                    cpVar.j(jn7.s1);
                }
                cpVar.i0 = false;
                cpVar.j0 = 0;
                break;
            default:
                cpVar.F.showAtLocation(cpVar.E, 55, 0, 0);
                zic zicVar = cpVar.H;
                if (zicVar != null) {
                    zicVar.b();
                }
                if (cpVar.J && (viewGroup = cpVar.K) != null) {
                    WeakHashMap weakHashMap = ihc.a;
                    if (viewGroup.isLaidOut()) {
                        cpVar.E.setAlpha(0.0f);
                        zic a = ihc.a(cpVar.E);
                        a.a(1.0f);
                        cpVar.H = a;
                        a.d(new so(this, (byte) 0));
                        break;
                    }
                }
                cpVar.E.setAlpha(1.0f);
                cpVar.E.setVisibility(0);
                break;
        }
    }
}
