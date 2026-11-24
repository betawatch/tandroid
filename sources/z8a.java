// default package

import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z8a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SessionsActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z8a(SessionsActivity sessionsActivity, boolean z, byte b) {
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
                sessionsActivity.p0(z);
                break;
            default:
                sessionsActivity.p0(z);
                break;
        }
    }
}
