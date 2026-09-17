package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class n implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ n(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                try {
                    o0.a aVar = this.b.d;
                    ba.c cVar = (ba.c) aVar.c;
                    String str = (String) aVar.b;
                    cVar.getClass();
                    boolean delete = new File(cVar.b, str).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e7) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e7);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.b.f;
                o0.a aVar2 = mVar.c;
                ba.c cVar2 = (ba.c) aVar2.c;
                String str2 = (String) aVar2.b;
                cVar2.getClass();
                boolean z10 = true;
                if (new File(cVar2.b, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) aVar2.c;
                    cVar3.getClass();
                    new File(cVar3.b, str2).delete();
                } else {
                    String e10 = mVar.e();
                    if (e10 == null || !mVar.j.c(e10)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
