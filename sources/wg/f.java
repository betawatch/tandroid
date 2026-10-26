package wg;

import android.view.View;
import org.telegram.messenger.Utilities;
import zg.l;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Utilities.Callback {
    public final /* synthetic */ boolean a;

    public /* synthetic */ f(boolean z10) {
        this.a = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        if (view instanceof l) {
            ((l) view).g(this.a, true);
        }
    }
}
