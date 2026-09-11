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
import n7.z0;
import w7.ga;
import w7.ha;
import w7.oa;
import w7.pa;
import w9.m;
import w9.o;
import w9.r;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class g implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ha haVar;
        int i10 = this.a;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                return (h) ((ShortcutInfoCompatSaverImpl) obj).b.get((String) obj2);
            case 1:
                z0 z0Var = (z0) obj;
                m mVar = (m) z0Var.c;
                Boolean bool = (Boolean) obj2;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean booleanValue = bool.booleanValue();
                    r rVar = mVar.b;
                    if (!booleanValue) {
                        rVar.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    rVar.h.trySetResult(null);
                    Executor executor = (Executor) mVar.e.b;
                    return ((Task) z0Var.b).onSuccessTask(executor, new o0.a(this, executor, z10, 22));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = ba.c.e(mVar.g.b.listFiles(m.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                ba.c cVar = ((ba.b) mVar.m.b).b;
                ba.b.a(ba.c.e(cVar.d.listFiles()));
                ba.b.a(ba.c.e(cVar.e.listFiles()));
                ba.b.a(ba.c.e(cVar.f.listFiles()));
                mVar.q.trySetResult(null);
                return Tasks.forResult(null);
            case 2:
                m.a((m) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return o.a((o) obj, (da.b) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                vb.a aVar = (vb.a) obj;
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
                    Object e7 = mobileVisionBase.b.e(aVar);
                    haVar.close();
                    return e7;
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

    public /* synthetic */ g(MobileVisionBase mobileVisionBase, vb.a aVar) {
        this.a = 4;
        this.b = mobileVisionBase;
        this.c = aVar;
    }
}
