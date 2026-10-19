package vg;

import android.view.View;
import org.telegram.messenger.Utilities;
import yg.k;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Utilities.Callback {
    public final /* synthetic */ boolean a;

    public /* synthetic */ f(boolean z10) {
        this.a = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        if (view instanceof k) {
            ((k) view).g(this.a, true);
        }
    }
}
