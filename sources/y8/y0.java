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
import m.r3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class y0 extends n6.g {
    public final ExecutorService U;
    public final o0.b V;
    public final o0.b W;
    public final o0.b X;
    public final o0.b Y;
    public final o0.b Z;
    public final o0.b a0;
    public final o0.b b0;
    public final o0.b c0;
    public final o0.b d0;
    public final o0.b e0;
    public final z0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, r3 r3Var) {
        super(context, looper, 14, r3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        z0 a2 = z0.a(context);
        this.V = new o0.b();
        this.W = new o0.b();
        this.X = new o0.b();
        this.Y = new o0.b();
        this.Z = new o0.b();
        this.a0 = new o0.b();
        this.b0 = new o0.b();
        this.c0 = new o0.b();
        this.d0 = new o0.b();
        this.e0 = new o0.b();
        n6.l.h(unconfigurableExecutorService);
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
    public final void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i10);
        }
        if (i10 == 0) {
            this.V.H(iBinder);
            this.W.H(iBinder);
            this.X.H(iBinder);
            this.Z.H(iBinder);
            this.a0.H(iBinder);
            this.b0.H(iBinder);
            this.c0.H(iBinder);
            this.d0.H(iBinder);
            this.e0.H(iBinder);
            this.Y.H(iBinder);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    @Override // n6.g
    public final boolean C() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final void f(n6.b bVar) {
        n6.a0 a0Var = this.v;
        AtomicInteger atomicInteger = this.R;
        Context context = this.n;
        if (!k()) {
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
                    n6.l.i(bVar, "Connection progress callbacks cannot be null.");
                    this.E = bVar;
                    a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                n6.l.i(bVar, "Connection progress callbacks cannot be null.");
                this.E = bVar;
                a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.f(bVar);
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final boolean k() {
        return !this.f0.b();
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 8600000;
    }

    @Override // n6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new h0(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 4);
    }

    @Override // n6.g
    public final k6.c[] r() {
        return x8.j.b;
    }

    @Override // n6.g
    public final String v() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // n6.g
    public final String w() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // n6.g
    public final String x() {
        return this.f0.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }
}
