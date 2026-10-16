package v0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import t7.u;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class k implements w2.d, Continuation {
    public Object a;

    public /* synthetic */ k(Object obj) {
        this.a = obj;
    }

    public static j a(k kVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return kVar.c();
        }
        if (obj instanceof o) {
            for (q qVar : ((o) obj).a) {
            }
        }
        Context ctx = (Context) kVar.a;
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

    public void b(androidx.biometric.e eVar) {
        h8.j jVar = (h8.j) this.a;
        jVar.a = eVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    public j c() {
        String string;
        Context context = (Context) this.a;
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
        List m10 = jd.g.m(arrayList);
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

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.a).call();
    }

    public k(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = context;
    }

    public k(int i10) {
        switch (i10) {
            case 5:
                this.a = new CopyOnWriteArrayList();
                break;
            default:
                this.a = new u(28);
                break;
        }
    }
}
