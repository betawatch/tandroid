// default package

import org.telegram.messenger.PushListenerController;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class os7 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ os7(int i, String str) {
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
                v21 t = vs7.h().t(ob6.a0(null, null, i, str), null);
                t.u = true;
                t.j();
                break;
            default:
                PushListenerController.lambda$sendRegistrationToServer$1(str, i);
                break;
        }
    }

    public /* synthetic */ os7(String str, int i) {
        this.b = str;
        this.c = i;
    }
}
