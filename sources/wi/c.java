package wi;

import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ rt b;

    public /* synthetic */ c(rt rtVar, int i7) {
        this.a = i7;
        this.b = rtVar;
    }

    public void a(Exception exc) {
        switch (this.a) {
            case 0:
                rt rtVar = this.b;
                ((t0) rtVar.b).i.post(new j0(rtVar, exc, 1));
                break;
            default:
                rt rtVar2 = this.b;
                ((t0) rtVar2.b).i.post(new j0(rtVar2, exc, 0));
                break;
        }
    }
}
