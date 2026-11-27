// default package

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class s24 extends e {
    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        wma wmaVar = new wma(context, null);
        this.fragmentView = wmaVar;
        return wmaVar;
    }
}
