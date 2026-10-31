package pb;

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
import u4.f;
import w7.ea;
import w7.fa;
import w7.ma;
import w7.na;
import x7.g8;
import x9.n;
import x9.p;
import x9.s;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        fa faVar;
        int i10 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                ob.a aVar = (ob.a) obj2;
                HashMap hashMap = fa.f;
                na.b();
                int i11 = ma.a;
                na.b();
                if (Boolean.parseBoolean("")) {
                    HashMap hashMap2 = fa.f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new fa("detectorTaskWithResource#run"));
                    }
                    faVar = (fa) hashMap2.get("detectorTaskWithResource#run");
                } else {
                    faVar = ea.h;
                }
                faVar.a();
                try {
                    Object e = mobileVisionBase.b.e(aVar);
                    faVar.close();
                    return e;
                } catch (Throwable th2) {
                    try {
                        faVar.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            case 1:
                return (f) ((ShortcutInfoCompatSaverImpl) obj2).b.get((String) obj);
            case 2:
                g8 g8Var = (g8) obj2;
                n nVar = (n) g8Var.c;
                Boolean bool = (Boolean) obj;
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
                    return ((Task) g8Var.b).onSuccessTask(executor, new u9.b(this, executor));
                }
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
            case 3:
                n.a((n) obj2, (String) obj, Boolean.FALSE);
                return null;
            default:
                return p.a((p) obj2, (ea.d) obj);
        }
    }

    public /* synthetic */ d(MobileVisionBase mobileVisionBase, ob.a aVar) {
        this.a = 0;
        this.b = mobileVisionBase;
        this.c = aVar;
    }
}
