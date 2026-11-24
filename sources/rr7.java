// default package

import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class rr7 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ rr7(int i, String str) {
        this.c = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                u31 t = yr7.h().t(jb6.a0(null, null, i, str), null);
                t.u = true;
                t.j();
                break;
            default:
                PushListenerController.lambda$sendRegistrationToServer$1(str, i);
                break;
        }
    }

    public /* synthetic */ rr7(String str, int i) {
        this.b = str;
        this.c = i;
    }
}
