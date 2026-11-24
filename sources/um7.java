// default package

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class um7 implements Runnable {
    public final /* synthetic */ NotificationsSettingsActivity a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ vl7 d;
    public final /* synthetic */ int e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ um7(NotificationsSettingsActivity notificationsSettingsActivity, int i, boolean z, vl7 vl7Var, int i2) {
        this.a = notificationsSettingsActivity;
        this.b = i;
        this.c = z;
        this.d = vl7Var;
        this.e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NotificationsSettingsActivity notificationsSettingsActivity = this.a;
        notificationsSettingsActivity.getClass();
        byte b = this.b;
        boolean z = this.c;
        if (b == 3) {
            SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
            if (z) {
                edit.remove("EnableAllStories");
            } else {
                edit.putBoolean("EnableAllStories", true);
            }
            edit.apply();
            notificationsSettingsActivity.getNotificationsController().b0(b);
        } else if (b == 4 || b == 5) {
            SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
            if (z) {
                edit2.putBoolean("EnableReactionsMessages", false);
                edit2.putBoolean("EnableReactionsStories", false);
            } else {
                edit2.putBoolean("EnableReactionsMessages", true);
                edit2.putBoolean("EnableReactionsStories", true);
            }
            edit2.apply();
            notificationsSettingsActivity.getNotificationsController().b0(b);
            notificationsSettingsActivity.getNotificationsController().g(b);
        } else {
            notificationsSettingsActivity.getNotificationsController().U(b, !z ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID);
        }
        this.d.e.b(0, !z, true);
        notificationsSettingsActivity.c.g(this.e);
    }
}
