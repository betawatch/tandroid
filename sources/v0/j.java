package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import org.telegram.messenger.yt;
import r2.y;
import w7.f8;
import w7.g8;
import w7.l9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j implements OutcomeReceiver {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ h b;

    public j(yt ytVar, k kVar) {
        this.b = ytVar;
    }

    public final void onError(Throwable th2) {
        switch (this.a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                kotlin.jvm.internal.i.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                y yVar = (y) this.b;
                String type = error.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                yVar.g(l9.a(error.getMessage(), type));
                break;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.i.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                yt ytVar = (yt) this.b;
                String type2 = error2.getType();
                kotlin.jvm.internal.i.d(type2, "getType(...)");
                ytVar.g(l9.b(error2.getMessage(), type2));
                break;
        }
    }

    public final void onResult(Object obj) {
        switch (this.a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                y yVar = (y) this.b;
                Bundle data = response.getData();
                kotlin.jvm.internal.i.d(data, "getData(...)");
                yVar.onResult(f8.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                break;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                yt ytVar = (yt) this.b;
                Credential credential = response2.getCredential();
                kotlin.jvm.internal.i.d(credential, "getCredential(...)");
                String type = credential.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                Bundle data2 = credential.getData();
                kotlin.jvm.internal.i.d(data2, "getData(...)");
                ytVar.onResult(new n(g8.a(type, data2)));
                break;
        }
    }

    public j(y yVar, e eVar, k kVar) {
        this.b = yVar;
    }
}
