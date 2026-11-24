// default package

import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class x6a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SessionsActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ x6a(SessionsActivity sessionsActivity, boolean z, byte b) {
        this.a = b;
        this.b = sessionsActivity;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        SessionsActivity sessionsActivity = this.b;
        switch (b) {
            case 0:
                sessionsActivity.o0(z);
                break;
            default:
                sessionsActivity.o0(z);
                break;
        }
    }
}
