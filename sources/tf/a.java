package tf;

import ai.n4;
import android.view.View;
import android.view.ViewTreeObserver;
import yf.x;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ a(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        switch (this.a) {
            case 0:
                ((n4) this.b).forceLayout();
                break;
            default:
                ((x) this.b).e.incrementAndGet();
                break;
        }
    }
}
