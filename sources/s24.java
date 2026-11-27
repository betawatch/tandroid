// default package

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class s24 extends e {
    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        wma wmaVar = new wma(context, null);
        this.fragmentView = wmaVar;
        return wmaVar;
    }
}
