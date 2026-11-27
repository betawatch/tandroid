// default package

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class s24 extends e {
    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        wma wmaVar = new wma(context, null);
        this.fragmentView = wmaVar;
        return wmaVar;
    }
}
