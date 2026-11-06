package wi;

import org.telegram.ui.Components.qt;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c {
    public final /* synthetic */ int a;
    public final /* synthetic */ qt b;

    public /* synthetic */ c(qt qtVar, int i7) {
        this.a = i7;
        this.b = qtVar;
    }

    public void a(Exception exc) {
        switch (this.a) {
            case 0:
                qt qtVar = this.b;
                ((t0) qtVar.b).i.post(new j0(qtVar, exc, 1));
                break;
            default:
                qt qtVar2 = this.b;
                ((t0) qtVar2.b).i.post(new j0(qtVar2, exc, 0));
                break;
        }
    }
}
