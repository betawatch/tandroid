// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zv8 implements ed {
    public final /* synthetic */ gw8 a;

    public /* synthetic */ zv8(gw8 gw8Var) {
        this.a = gw8Var;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        gw8 gw8Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            gw8Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
