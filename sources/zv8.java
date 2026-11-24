// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
