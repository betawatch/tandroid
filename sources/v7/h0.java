package v7;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class h0 {
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
        pVar2.a = new w0.h(hg.c.i(i10, "activity with result code: ", " indicating not RESULT_OK"), 2);
        if (i10 == 0) {
            pVar2.a = new w0.g("activity is cancelled by the user.");
        }
        pVar.invoke(cancellationSignal, new b1.c(lVar, pVar2, 1));
        return true;
    }
}
