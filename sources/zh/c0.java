package zh;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.z1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements z1 {
    public final /* synthetic */ n0 a;

    public /* synthetic */ c0(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(c2 c2Var, int i10) {
        n0 n0Var = this.a;
        n0Var.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            n0Var.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
