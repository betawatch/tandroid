package v7;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        pVar2.a = new w0.h(i2.g.j(i10, "activity with result code: ", " indicating not RESULT_OK"), 2);
        if (i10 == 0) {
            pVar2.a = new w0.g("activity is cancelled by the user.");
        }
        pVar.invoke(cancellationSignal, new b1.c(lVar, pVar2, 1));
        return true;
    }
}
