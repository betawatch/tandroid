// default package

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class x14 extends d {
    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        cja cjaVar = new cja(context, null);
        this.fragmentView = cjaVar;
        return cjaVar;
    }
}
