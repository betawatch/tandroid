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
import w9.n;
import w9.p;
import w9.s;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                o0.a aVar = (o0.a) obj;
                n nVar = (n) aVar.c;
                Boolean bool = (Boolean) obj2;
                if (bool.booleanValue()) {
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
                    return ((Task) aVar.b).onSuccessTask(executor, new z0(this, executor, z10, 23));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = ba.c.e(nVar.g.b.listFiles(n.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                ba.c cVar = ((ba.b) nVar.m.b).b;
                ba.b.a(ba.c.e(cVar.d.listFiles()));
                ba.b.a(ba.c.e(cVar.e.listFiles()));
                ba.b.a(ba.c.e(cVar.f.listFiles()));
                nVar.q.trySetResult(null);
                return Tasks.forResult(null);
            case 2:
                n.a((n) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return p.a((p) obj, (da.b) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                vb.a aVar2 = (vb.a) obj;
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
                    Object e7 = mobileVisionBase.b.e(aVar2);
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
