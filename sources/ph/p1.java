package ph;

import org.telegram.ui.Components.ii;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p1(f2 f2Var, int i10, int i11) {
        this.a = i11;
        this.b = f2Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                ii iiVar = this.b.f;
                if (iiVar != null) {
                    iiVar.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
