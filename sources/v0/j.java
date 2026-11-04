package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import org.telegram.messenger.et;
import x7.g5;
import x7.h5;
import x7.q6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements OutcomeReceiver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ h b;

    public j(et etVar, k kVar) {
        this.b = etVar;
    }

    public final void onError(Throwable th2) {
        switch (this.a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                kotlin.jvm.internal.j.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                ge.b bVar = (ge.b) this.b;
                String type = error.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                bVar.a(q6.a(error.getMessage(), type));
                break;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.j.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                et etVar = (et) this.b;
                String type2 = error2.getType();
                kotlin.jvm.internal.j.d(type2, "getType(...)");
                etVar.a(q6.b(error2.getMessage(), type2));
                break;
        }
    }

    public final void onResult(Object obj) {
        switch (this.a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.j.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                ge.b bVar = (ge.b) this.b;
                Bundle data = response.getData();
                kotlin.jvm.internal.j.d(data, "getData(...)");
                bVar.onResult(g5.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                break;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                kotlin.jvm.internal.j.e(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                et etVar = (et) this.b;
                Credential credential = response2.getCredential();
                kotlin.jvm.internal.j.d(credential, "getCredential(...)");
                String type = credential.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                Bundle data2 = credential.getData();
                kotlin.jvm.internal.j.d(data2, "getData(...)");
                etVar.onResult(new n(h5.a(type, data2)));
                break;
        }
    }

    public j(ge.b bVar, e eVar, k kVar) {
        this.b = bVar;
    }
}
