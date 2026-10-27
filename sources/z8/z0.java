package z8;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class z0 extends o6.g {
    public final ExecutorService U;
    public final i2.c V;
    public final i2.c W;
    public final i2.c X;
    public final i2.c Y;
    public final i2.c Z;
    public final i2.c a0;
    public final i2.c b0;
    public final i2.c c0;
    public final i2.c d0;
    public final i2.c e0;
    public final a1 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, r3 r3Var) {
        super(context, looper, 14, r3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        a1 a2 = a1.a(context);
        this.V = new i2.c(2);
        this.W = new i2.c(2);
        this.X = new i2.c(2);
        this.Y = new i2.c(2);
        this.Z = new i2.c(2);
        this.a0 = new i2.c(2);
        this.b0 = new i2.c(2);
        this.c0 = new i2.c(2);
        this.d0 = new i2.c(2);
        this.e0 = new i2.c(2);
        o6.l.h(unconfigurableExecutorService);
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

    @Override // o6.g
    public final void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i10);
        }
        if (i10 == 0) {
            this.V.c(iBinder);
            this.W.c(iBinder);
            this.X.c(iBinder);
            this.Z.c(iBinder);
            this.a0.c(iBinder);
            this.b0.c(iBinder);
            this.c0.c(iBinder);
            this.d0.c(iBinder);
            this.e0.c(iBinder);
            this.Y.c(iBinder);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    @Override // o6.g
    public final boolean C() {
        return true;
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final void h(o6.b bVar) {
        o6.a0 a0Var = this.v;
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
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, g8.b.a);
                    o6.l.i(bVar, "Connection progress callbacks cannot be null.");
                    this.E = bVar;
                    a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                o6.l.i(bVar, "Connection progress callbacks cannot be null.");
                this.E = bVar;
                a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.h(bVar);
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final boolean k() {
        return !this.f0.b();
    }

    @Override // o6.g, com.google.android.gms.common.api.c
    public final int l() {
        return 8600000;
    }

    @Override // o6.g
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return queryLocalInterface instanceof i0 ? (i0) queryLocalInterface : new i0(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 5);
    }

    @Override // o6.g
    public final l6.c[] r() {
        return y8.j.b;
    }

    @Override // o6.g
    public final String v() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // o6.g
    public final String w() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // o6.g
    public final String x() {
        return this.f0.b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }
}
