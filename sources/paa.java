// default package

import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class paa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SessionsActivity b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ paa(SessionsActivity sessionsActivity, boolean z, byte b) {
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
