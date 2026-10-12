package u4;

import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import n6.o;
import w7.ga;
import w7.ha;
import w7.oa;
import w7.pa;
import x9.l;
import x9.n;
import x9.p;
import x9.s;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class f implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ha haVar;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                return (g) ((ShortcutInfoCompatSaverImpl) obj).b.get((String) obj2);
            case 1:
                o oVar = (o) obj;
                n nVar = (n) oVar.c;
                Boolean bool = (Boolean) obj2;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    Iterator it = ca.c.e(nVar.g.b.listFiles(n.r)).iterator();
                    while (it.hasNext()) {
                        ((File) it.next()).delete();
                    }
                    ca.c cVar = ((ca.b) nVar.m.b).b;
                    ca.b.a(ca.c.e(cVar.d.listFiles()));
                    ca.b.a(ca.c.e(cVar.e.listFiles()));
                    ca.b.a(ca.c.e(cVar.f.listFiles()));
                    nVar.q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                s sVar = nVar.b;
                if (!booleanValue) {
                    sVar.getClass();
                    throw new IllegalStateException("An invalid data collection token was used.");
                }
                sVar.h.trySetResult(null);
                Executor executor = (Executor) nVar.e.b;
                Task task = (Task) oVar.b;
                l lVar = new l();
                lVar.b = this;
                lVar.a = executor;
                return task.onSuccessTask(executor, lVar);
            case 2:
                n.a((n) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return p.a((p) obj, (ea.b) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                wb.a aVar = (wb.a) obj;
                HashMap hashMap = ha.f;
                pa.b();
                int i11 = oa.a;
                pa.b();
                if (Boolean.parseBoolean("")) {
                    HashMap hashMap2 = ha.f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ha("detectorTaskWithResource#run"));
                    }
                    haVar = (ha) hashMap2.get("detectorTaskWithResource#run");
                } else {
                    haVar = ga.h;
                }
                haVar.a();
                try {
                    Object e = mobileVisionBase.b.e(aVar);
                    haVar.close();
                    return e;
                } catch (Throwable th2) {
                    try {
                        haVar.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
        }
    }

    public /* synthetic */ f(MobileVisionBase mobileVisionBase, wb.a aVar) {
        this.a = 4;
        this.b = mobileVisionBase;
        this.c = aVar;
    }
}
