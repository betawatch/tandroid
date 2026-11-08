package wi;

import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
