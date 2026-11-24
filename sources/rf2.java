// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class rf2 implements Executor {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rf2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((mp3) obj).c(runnable);
                break;
            case 1:
                ((dfb) obj).e(runnable);
                break;
            case 2:
                ((tz4) obj).post(runnable);
                break;
            case 3:
                hac.X(((tx6) obj).l, runnable);
                break;
            case 4:
                ((ly6) obj).m0(runnable);
                break;
            case 5:
                ((oz6) obj).R(runnable);
                break;
            case 6:
                ((bq9) obj).b.post(runnable);
                break;
            default:
                ((np3) obj).postRunnable(runnable);
                break;
        }
    }
}
