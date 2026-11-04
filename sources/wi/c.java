package wi;

import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ nh b;

    public /* synthetic */ c(nh nhVar, int i3) {
        this.a = i3;
        this.b = nhVar;
    }

    public void a(Exception exc) {
        switch (this.a) {
            case 0:
                nh nhVar = this.b;
                ((t0) nhVar.b).i.post(new j0(nhVar, exc, 1));
                break;
            default:
                nh nhVar2 = this.b;
                ((t0) nhVar2.b).i.post(new j0(nhVar2, exc, 0));
                break;
        }
    }
}
