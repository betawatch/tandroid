package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import n7.z0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class o implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ o(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                try {
                    z0 z0Var = this.b.d;
                    ba.c cVar = (ba.c) z0Var.c;
                    String str = (String) z0Var.b;
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
                n nVar = this.b.f;
                z0 z0Var2 = nVar.c;
                ba.c cVar2 = (ba.c) z0Var2.c;
                String str2 = (String) z0Var2.b;
                cVar2.getClass();
                boolean z10 = true;
                if (new File(cVar2.b, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) z0Var2.c;
                    cVar3.getClass();
                    new File(cVar3.b, str2).delete();
                } else {
                    String e10 = nVar.e();
                    if (e10 == null || !nVar.j.c(e10)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
