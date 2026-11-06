package xg;

import ah.r;
import android.view.View;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements c20 {
    public final /* synthetic */ boolean a;

    public /* synthetic */ g(boolean z9) {
        this.a = z9;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        View view = (View) obj;
        if (view instanceof r) {
            ((r) view).g(this.a, true);
        }
    }
}
