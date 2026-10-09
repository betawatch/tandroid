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
import m.q3;
import org.telegram.ui.Components.yh0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class y0 extends n6.g {
    public final ExecutorService U;
    public final yh0 V;
    public final yh0 W;
    public final yh0 X;
    public final yh0 Y;
    public final yh0 Z;
    public final yh0 a0;
    public final yh0 b0;
    public final yh0 c0;
    public final yh0 d0;
    public final yh0 e0;
    public final z0 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, q3 q3Var) {
        super(context, looper, 14, q3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        z0 a2 = z0.a(context);
        this.V = new yh0(1);
        this.W = new yh0(1);
        this.X = new yh0(1);
        this.Y = new yh0(1);
        this.Z = new yh0(1);
        this.a0 = new yh0(1);
        this.b0 = new yh0(1);
        this.c0 = new yh0(1);
        this.d0 = new yh0(1);
        this.e0 = new yh0(1);
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

    @Override // n6.g
    public final boolean C() {
        return true;
    }

    @Override // n6.g, com.google.android.gms.common.api.c
    public final void f(n6.b bVar) {
        n6.b0 b0Var = this.v;
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
                    b0Var.sendMessage(b0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                n6.l.i(bVar, "Connection progress callbacks cannot be null.");
                this.E = bVar;
                b0Var.sendMessage(b0Var.obtainMessage(3, atomicInteger.get(), 16, null));
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
