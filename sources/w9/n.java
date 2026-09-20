package w9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import org.telegram.ui.Cells.f3;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                    f3 f3Var = this.b.d;
                    ba.c cVar = (ba.c) f3Var.c;
                    String str = (String) f3Var.b;
                    cVar.getClass();
                    boolean delete = new File(cVar.b, str).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                m mVar = this.b.f;
                f3 f3Var2 = mVar.c;
                ba.c cVar2 = (ba.c) f3Var2.c;
                String str2 = (String) f3Var2.b;
                cVar2.getClass();
                boolean z10 = true;
                if (new File(cVar2.b, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    ba.c cVar3 = (ba.c) f3Var2.c;
                    cVar3.getClass();
                    new File(cVar3.b, str2).delete();
                } else {
                    String e7 = mVar.e();
                    if (e7 == null || !mVar.j.c(e7)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
