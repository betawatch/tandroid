package y8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import m.p3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class w0 extends n6.g {
    public final ExecutorService U;
    public final ib.c V;
    public final ib.c W;
    public final ib.c X;
    public final ib.c Y;
    public final ib.c Z;
    public final ib.c a0;
    public final ib.c b0;
    public final ib.c c0;
    public final ib.c d0;
    public final ib.c e0;
    public final x0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, p3 p3Var) {
        super(context, looper, 14, p3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        x0 a2 = x0.a(context);
        this.V = new ib.c();
        this.W = new ib.c();
        this.X = new ib.c();
        this.Y = new ib.c();
        this.Z = new ib.c();
        this.a0 = new ib.c();
        this.b0 = new ib.c();
        this.c0 = new ib.c();
        this.d0 = new ib.c();
        this.e0 = new ib.c();
        n6.l.g(unconfigurableExecutorService);
        this.U = unconfigurableExecutorService;
        this.f0 = a2;
        File file = new File(new File(context.getFilesDir(), "wearos_assets"), "streamtmp");
        file.mkdirs();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    @Override // n6.g
    public final void C(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i10);
        }
        if (i10 == 0) {
            this.V.a(iBinder);
            this.W.a(iBinder);
            this.X.a(iBinder);
            this.Z.a(iBinder);
            this.a0.a(iBinder);
            this.b0.a(iBinder);
            this.c0.a(iBinder);
            this.d0.a(iBinder);
            this.e0.a(iBinder);
            this.Y.a(iBinder);
            i10 = 0;
        }
        super.C(i10, iBinder, bundle, i11);
    }

    @Override // n6.g
    public final boolean D() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final void f(n6.b bVar) {
        n6.a0 a0Var = this.w;
        AtomicInteger atomicInteger = this.R;
        Context context = this.n;
        if (!l()) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                int i10 = bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0;
                if (i10 < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i10);
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, f8.b.a);
                    n6.l.h(bVar, "Connection progress callbacks cannot be null.");
                    this.E = bVar;
                    a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                n6.l.h(bVar, "Connection progress callbacks cannot be null.");
                this.E = bVar;
                a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.f(bVar);
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final boolean l() {
        return !this.f0.b();
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int m() {
        return 8600000;
    }

    @Override // n6.g
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof f0 ? (f0) queryLocalInterface : new f0(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 4);
    }

    @Override // n6.g
    public final k6.c[] s() {
        return x8.c.b;
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // n6.g
    public final String x() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // n6.g
    public final String y() {
        return this.f0.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }
}
