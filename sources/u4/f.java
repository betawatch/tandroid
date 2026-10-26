package u4;

import aa.b0;
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
import x7.ha;
import x7.ia;
import x7.pa;
import x7.qa;
import y9.l;
import y9.n;
import y9.p;
import y9.s;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
        ia iaVar;
        int i10 = this.a;
        boolean z10 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                return (g) ((ShortcutInfoCompatSaverImpl) obj).b.get((String) obj2);
            case 1:
                l lVar = (l) obj;
                n nVar = (n) lVar.b;
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
                    Executor executor = (Executor) nVar.e.a;
                    return ((Task) lVar.a).onSuccessTask(executor, new m4.c(this, executor, z10, 28));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = da.c.e(nVar.g.b.listFiles(n.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                da.c cVar = ((da.b) nVar.m.b).b;
                da.b.a(da.c.e(cVar.d.listFiles()));
                da.b.a(da.c.e(cVar.e.listFiles()));
                da.b.a(da.c.e(cVar.f.listFiles()));
                nVar.q.trySetResult(null);
                return Tasks.forResult(null);
            case 2:
                n.a((n) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return p.a((p) obj, (b0) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                xb.a aVar = (xb.a) obj;
                HashMap hashMap = ia.f;
                qa.b();
                int i11 = pa.a;
                qa.b();
                if (Boolean.parseBoolean("")) {
                    HashMap hashMap2 = ia.f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ia("detectorTaskWithResource#run"));
                    }
                    iaVar = (ia) hashMap2.get("detectorTaskWithResource#run");
                } else {
                    iaVar = ha.h;
                }
                iaVar.a();
                try {
                    Object e = mobileVisionBase.b.e(aVar);
                    iaVar.close();
                    return e;
                } catch (Throwable th2) {
                    try {
                        iaVar.close();
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

    public /* synthetic */ f(MobileVisionBase mobileVisionBase, xb.a aVar) {
        this.a = 4;
        this.b = mobileVisionBase;
        this.c = aVar;
    }
}
