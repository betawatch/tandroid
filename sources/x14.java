// default package

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class x14 extends d {
    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        cja cjaVar = new cja(context, null);
        this.fragmentView = cjaVar;
        return cjaVar;
    }
}
