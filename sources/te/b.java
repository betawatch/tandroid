package te;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.biometric.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import jd.g;
import kotlin.jvm.internal.i;
import t7.u;
import v0.j;
import v0.l;
import v0.n;
import v0.p;
import w2.d;
import zh.a0;
import zh.b0;
import zh.c1;
import zh.m0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class b implements d, Continuation, a0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b(int i10, boolean z10) {
        this.a = i10;
    }

    public static j c(b bVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.e();
        }
        if (obj instanceof n) {
            for (p pVar : ((n) obj).a) {
            }
        }
        Context ctx = (Context) bVar.b;
        i.e(ctx, "ctx");
        if (ctx.getPackageManager().hasSystemFeature("android.software.leanback") || ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return bVar.e();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            l lVar = new l(ctx);
            l lVar2 = lVar.isAvailableOnDevice() ? lVar : null;
            return lVar2 == null ? bVar.e() : lVar2;
        }
        if (i10 <= 33) {
            return bVar.e();
        }
        return null;
    }

    @Override // zh.a0
    public void a(String str) {
        m0 m0Var = (m0) this.b;
        if (m0Var.getParentActivity() != null) {
            pf.d.r(m0Var.getParentActivity(), str);
        }
    }

    @Override // zh.a0
    public void b(b0 b0Var) {
        m0 m0Var = (m0) this.b;
        FrameLayout frameLayout = m0Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(b0Var);
        }
        if (m0Var.F == b0Var) {
            m0Var.F = null;
        }
        c1 c1Var = m0Var.d;
        if (c1Var != null) {
            c1Var.setScanHidden(false);
        }
    }

    public void d(e eVar) {
        h8.j jVar = (h8.j) this.b;
        jVar.a = eVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    public j e() {
        String string;
        Context context = (Context) this.b;
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
        List m10 = g.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        Iterator it = m10.iterator();
        j jVar = null;
        while (it.hasNext()) {
            try {
                Object newInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
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
        return ((Callable) this.b).call();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                c cVar = c.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((s4.b) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public b(Context context) {
        this.a = 2;
        i.e(context, "context");
        this.b = context;
    }

    public b(int i10) {
        this.a = i10;
        switch (i10) {
            case 7:
                this.b = new CopyOnWriteArrayList();
                break;
            default:
                this.b = new u(28);
                break;
        }
    }
}
