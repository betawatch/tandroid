package wi;

import org.telegram.ui.Components.qt;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
