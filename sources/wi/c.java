package wi;

import org.telegram.ui.Components.rt;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
