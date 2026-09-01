package p2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g implements z3.d {
    public int a;
    public int b;
    public Object c;

    @Override // z3.d
    public int a() {
        return this.a;
    }

    @Override // z3.d
    public int b() {
        return this.b;
    }

    @Override // z3.d
    public int c() {
        int i10 = this.a;
        return i10 == -1 ? ((h5.w) this.c).x() : i10;
    }

    public int d() {
        return ((((byte[]) this.c).length - this.a) * 8) - this.b;
    }

    public h e() {
        h hVar = new h();
        hVar.a = this.a;
        hVar.b = this.b;
        hVar.c = (String) this.c;
        return hVar;
    }

    public int f(int i10) {
        byte[] bArr = (byte[]) this.c;
        if (i10 < 1 || i10 > 32 || i10 > d()) {
            throw new IllegalArgumentException(String.valueOf(i10));
        }
        int i11 = this.b;
        int i12 = 0;
        if (i11 > 0) {
            int i13 = 8 - i11;
            int min = Math.min(i10, i13);
            int i14 = i13 - min;
            int i15 = this.a;
            int i16 = (((255 >> (8 - min)) << i14) & bArr[i15]) >> i14;
            i10 -= min;
            int i17 = this.b + min;
            this.b = i17;
            if (i17 == 8) {
                this.b = 0;
                this.a = i15 + 1;
            }
            i12 = i16;
        }
        if (i10 > 0) {
            while (i10 >= 8) {
                int i18 = i12 << 8;
                int i19 = this.a;
                int i20 = i18 | (bArr[i19] & 255);
                this.a = i19 + 1;
                i10 -= 8;
                i12 = i20;
            }
            if (i10 > 0) {
                int i21 = 8 - i10;
                int i22 = ((bArr[this.a] & ((255 >> i21) << i21)) >> i21) | (i12 << i10);
                this.b += i10;
                return i22;
            }
        }
        return i12;
    }

    public synchronized int g() {
        PackageInfo packageInfo;
        if (this.a == 0) {
            try {
                packageInfo = k6.c.a((Context) this.c).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e6) {
                Log.w("Metadata", "Failed to find package ".concat(e6.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.a = packageInfo.versionCode;
            }
        }
        return this.a;
    }

    public synchronized int h() {
        int i10 = this.b;
        if (i10 != 0) {
            return i10;
        }
        Context context = (Context) this.c;
        PackageManager packageManager = context.getPackageManager();
        if (k6.c.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (!i6.b.d()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.b = i11;
                return i11;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i11 = 2;
            this.b = i11;
            return i11;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == i6.b.d()) {
            i11 = 2;
        }
        this.b = i11;
        return i11;
    }
}
