// default package

import android.app.Notification;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sk7 extends gl7 {
    public final /* synthetic */ byte e;
    public Object f;

    public sk7(byte b) {
        this.e = b;
        switch (b) {
            case 1:
                this.f = new ArrayList();
                break;
        }
    }

    @Override // gl7
    public final void b(h31 h31Var) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) h31Var.c).setBigContentTitle(this.b).bigText((CharSequence) this.f);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) h31Var.c).setBigContentTitle(this.b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                ArrayList arrayList = (ArrayList) this.f;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    bigContentTitle.addLine((CharSequence) obj);
                }
                break;
        }
    }

    @Override // gl7
    public final String c() {
        switch (this.e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    public final void d(String str) {
        if (str != null) {
            ((ArrayList) this.f).add(xk7.c(str));
        }
    }

    public final void e(String str) {
        this.f = xk7.c(str);
    }

    public final void f(String str) {
        this.b = xk7.c(str);
    }

    public final void g(String str) {
        this.c = xk7.c(str);
        this.d = true;
    }
}
