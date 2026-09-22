package v7;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class f0 {
    public static void a(CancellationSignal cancellationSignal, rd.a onResultOrException) {
        kotlin.jvm.internal.i.e(onResultOrException, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (a1.g.a(cancellationSignal)) {
            return;
        }
        onResultOrException.invoke();
    }

    public static boolean b(int i10, rd.p pVar, rd.l lVar, CancellationSignal cancellationSignal) {
        if (i10 == -1) {
            return false;
        }
        kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
        pVar2.a = new w0.h(hg.k0.i(i10, "activity with result code: ", " indicating not RESULT_OK"), 2);
        if (i10 == 0) {
            pVar2.a = new w0.g("activity is cancelled by the user.");
        }
        pVar.invoke(cancellationSignal, new b1.c(lVar, pVar2, 1));
        return true;
    }
}
