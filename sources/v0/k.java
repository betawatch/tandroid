package v0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class k {
    public final Context a;

    public k(Context context, int i10) {
        switch (i10) {
            case 1:
                this.a = context;
                break;
            default:
                kotlin.jvm.internal.i.e(context, "context");
                this.a = context;
                break;
        }
    }

    public static j a(k kVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return kVar.c();
        }
        if (obj instanceof o) {
            for (q qVar : ((o) obj).a) {
            }
        }
        Context ctx = kVar.a;
        kotlin.jvm.internal.i.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return kVar.c();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            m mVar = new m(ctx);
            m mVar2 = mVar.isAvailableOnDevice() ? mVar : null;
            return mVar2 == null ? kVar.c() : mVar2;
        }
        if (i10 <= 33) {
            return kVar.c();
        }
        return null;
    }

    public PackageInfo b(int i10, String str) {
        return this.a.getPackageManager().getPackageInfo(str, i10);
    }

    public j c() {
        String string;
        Context context = this.a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List m10 = hd.g.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        Iterator it = m10.iterator();
        j jVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                j jVar2 = (j) newInstance;
                if (!jVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (jVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    jVar = jVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return jVar;
    }
}
