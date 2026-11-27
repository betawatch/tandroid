// default package

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class vj0 implements im6, fx3 {
    public final Context a;

    public vj0(Context context, byte b) {
        switch (b) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            case 2:
                this.a = context;
                break;
            case 3:
                this.a = context.getApplicationContext();
                break;
            default:
                context.getClass();
                this.a = context;
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int e(ko4 ko4Var) {
        String str = ko4Var.t;
        if (str == null || !eg7.k(str)) {
            return qu6.a(0, 0, 0, 0);
        }
        String str2 = ko4Var.t;
        String str3 = gcc.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return qu6.a(4, 0, 0, 0);
        }
        return qu6.a(1, 0, 0, 0);
    }

    @Override // im6
    public final jm6 a(fp fpVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new sg7((byte) 27).a(fpVar);
        }
        int h = eg7.h(((ko4) fpVar.c).t);
        efd.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(gcc.K(h)));
        rx rxVar = new rx(new qx(h, (byte) 0), new qx(h, (byte) 1));
        rxVar.b = true;
        return rxVar.a(fpVar);
    }

    @Override // fx3
    public final void b(rje rjeVar) {
        lr2 lr2Var = new lr2("EmojiCompatInitializer", (byte) 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), lr2Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new cv2(this, rjeVar, threadPoolExecutor, (byte) 21));
    }

    public final Object c(Context context, t13 t13Var, pz7 pz7Var) {
        va1 va1Var = new va1(1, xpe.a(pz7Var));
        va1Var.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        va1Var.u(new g23(cancellationSignal, (byte) 0));
        zm9 zm9Var = new zm9((Object) va1Var, (byte) 23);
        ic icVar = new ic((byte) 1);
        context.getClass();
        k23 b = ej0.b(new ej0(this.a, (byte) 1), t13Var);
        if (b == null) {
            zm9Var.B(new v03("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            zm9Var.B(new v03("createCredential is not supported on this device", (byte) 3));
        } else {
            b.onCreateCredential(context, t13Var, cancellationSignal, icVar, zm9Var);
        }
        return va1Var.q();
    }

    public final void d(Context context, av4 av4Var, CancellationSignal cancellationSignal, Executor executor, h23 h23Var) {
        executor.getClass();
        k23 b = ej0.b(new ej0(context, (byte) 1), av4Var);
        if (b == null) {
            h23Var.B(new xu4("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
        } else {
            b.onGetCredential(context, av4Var, cancellationSignal, executor, h23Var);
        }
    }
}
