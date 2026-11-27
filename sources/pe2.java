// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class pe2 implements Executor {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pe2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((to3) obj).c(runnable);
                break;
            case 1:
                ((xgb) obj).e(runnable);
                break;
            case 2:
                ((xz4) obj).post(runnable);
                break;
            case 3:
                gcc.X(((yx6) obj).l, runnable);
                break;
            case 4:
                ((qy6) obj).m0(runnable);
                break;
            case 5:
                ((sz6) obj).R(runnable);
                break;
            case 6:
                ((rr9) obj).b.post(runnable);
                break;
            default:
                ((uo3) obj).postRunnable(runnable);
                break;
        }
    }
}
