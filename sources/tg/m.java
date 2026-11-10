package tg;

import org.telegram.ui.xp0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ xp0 b;

    public /* synthetic */ m(xp0 xp0Var, int i7) {
        this.a = i7;
        this.b = xp0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                g0.X(this.b, (Integer) obj);
                break;
            default:
                g0.a0(this.b, (Integer) obj);
                break;
        }
    }
}
