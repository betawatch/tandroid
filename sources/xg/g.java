package xg;

import ah.r;
import android.view.View;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
