// default package

import android.content.Context;
import android.os.Build;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uk0 implements gm6, vx3, s1d {
    public final Context a;

    public uk0(Context context, byte b) {
        switch (b) {
            case 1:
                context.getClass();
                this.a = context;
                break;
            case 2:
            default:
                context.getClass();
                this.a = context;
                break;
            case 3:
                this.a = context.getApplicationContext();
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
    public static int f(go4 go4Var) {
        String str = go4Var.t;
        if (str == null || !wf7.k(str)) {
            return kt6.a(0, 0, 0, 0);
        }
        String str2 = go4Var.t;
        String str3 = hac.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return kt6.a(4, 0, 0, 0);
        }
        return kt6.a(1, 0, 0, 0);
    }

    @Override // w1d
    public final Object a() {
        return this.a;
    }

    @Override // gm6
    public final hm6 b(eq eqVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new kg7((byte) 27).b(eqVar);
        }
        int h = wf7.h(((go4) eqVar.c).t);
        ncd.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(hac.K(h)));
        ry ryVar = new ry(new qy(h, (byte) 0), new qy(h, (byte) 1));
        ryVar.b = true;
        return ryVar.b(eqVar);
    }

    @Override // vx3
    public final void c(bhe bheVar) {
        ds2 ds2Var = new ds2("EmojiCompatInitializer", (byte) 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), ds2Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new pz2(this, bheVar, threadPoolExecutor, (byte) 19));
    }

    public final Object d(Context context, m23 m23Var, ky7 ky7Var) {
        vb1 vb1Var = new vb1(1, fne.a(ky7Var));
        vb1Var.s();
        CancellationSignal cancellationSignal = new CancellationSignal();
        vb1Var.u(new z23(cancellationSignal, (byte) 0));
        nl9 nl9Var = new nl9((Object) vb1Var, (byte) 23);
        kc kcVar = new kc((byte) 1);
        context.getClass();
        d33 a = dk0.a(new dk0(this.a, (byte) 1), m23Var);
        if (a == null) {
            nl9Var.A(new n13("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            nl9Var.A(new n13("createCredential is not supported on this device", (byte) 3));
        } else {
            a.onCreateCredential(context, m23Var, cancellationSignal, kcVar, nl9Var);
        }
        return vb1Var.q();
    }

    public final void e(Context context, xu4 xu4Var, CancellationSignal cancellationSignal, Executor executor, a33 a33Var) {
        executor.getClass();
        d33 a = dk0.a(new dk0(context, (byte) 1), xu4Var);
        if (a == null) {
            a33Var.A(new uu4("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", (byte) 1));
        } else {
            a.onGetCredential(context, xu4Var, cancellationSignal, executor, a33Var);
        }
    }

    public /* synthetic */ uk0(Context context, int i) {
        this.a = context;
    }
}
