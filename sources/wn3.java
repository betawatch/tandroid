// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class wn3 implements Executor {
    public static final wn3 b = new wn3(0);
    public static final /* synthetic */ wn3 c = new wn3(1);
    public static final /* synthetic */ wn3 d = new wn3(2);
    public static final /* synthetic */ wn3 e = new wn3(3);
    public final /* synthetic */ byte a;

    public /* synthetic */ wn3(byte b2) {
        this.a = b2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
