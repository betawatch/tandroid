package ph;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.q80;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vh.p2 b;

    public /* synthetic */ p(vh.p2 p2Var, int i10) {
        this.a = i10;
        this.b = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.E2(this.b);
                break;
            case 1:
                org.telegram.messenger.i0.E2(this.b);
                break;
            case 2:
                org.telegram.messenger.i0.E2(this.b);
                break;
            default:
                this.b.getClass();
                break;
        }
    }

    public /* synthetic */ p(vh.p2 p2Var, q80 q80Var, ClickableSpan clickableSpan) {
        this.a = 3;
        this.b = p2Var;
    }
}
