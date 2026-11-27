// default package

import android.app.Notification;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class rn7 extends fo7 {
    public final /* synthetic */ byte e;
    public Object f;

    public rn7(byte b) {
        this.e = b;
        switch (b) {
            case 1:
                this.f = new ArrayList();
                break;
        }
    }

    @Override // fo7
    public final void b(q31 q31Var) {
        switch (this.e) {
            case 0:
                Notification.BigTextStyle bigText = new Notification.BigTextStyle((Notification.Builder) q31Var.c).setBigContentTitle(this.b).bigText((CharSequence) this.f);
                if (this.d) {
                    bigText.setSummaryText(this.c);
                    break;
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) q31Var.c).setBigContentTitle(this.b);
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

    @Override // fo7
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
            ((ArrayList) this.f).add(wn7.c(str));
        }
    }

    public final void e(String str) {
        this.f = wn7.c(str);
    }

    public final void f(String str) {
        this.b = wn7.c(str);
    }

    public final void g(String str) {
        this.c = wn7.c(str);
        this.d = true;
    }
}
