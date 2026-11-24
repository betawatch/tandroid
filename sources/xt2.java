// default package

import android.content.ContentValues;
import android.net.Uri;
import org.telegram.messenger.GcmPushListenerService;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.SmsReceiver;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class xt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ xt2(evc evcVar, String str) {
        this.a = (byte) 8;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Uri parse = Uri.parse(this.b);
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
                a.b.getContentResolver().update(parse, contentValues, null, null);
                return;
            case 1:
                String str = this.b;
                try {
                    fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
                    fa4.j().a.flush();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 2:
                String str2 = this.b;
                try {
                    fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + str2 + "\n");
                    fa4.j().a.flush();
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            case 3:
                String str3 = this.b;
                try {
                    fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " D/tmessages: " + str3 + "\n");
                    fa4.j().a.flush();
                    return;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    if (gl.D1(e3)) {
                        LaunchActivity.E(1);
                        return;
                    }
                    return;
                }
            case 4:
                String str4 = this.b;
                int i = GcmPushListenerService.n;
                if (w01.a) {
                    fa4.b("Refreshed FCM token: " + str4);
                }
                a.v();
                PushListenerController.sendRegistrationToServer(2, str4);
                return;
            case 5:
                String str5 = this.b;
                l15 l15Var = bje.b;
                if (l15Var == null || !str5.equals(l15Var.d)) {
                    return;
                }
                bje.b.c("STORAGE_CANCELED");
                bje.b.e();
                return;
            case 6:
                String str6 = this.b;
                int i2 = SmsReceiver.a;
                kk7.e().k(kk7.i4, str6);
                return;
            case 7:
                gl.g(this.b);
                return;
            default:
                throw null;
        }
    }

    public /* synthetic */ xt2(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
