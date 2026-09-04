package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import w7.b9;
import w7.u7;
import w7.v7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k implements OutcomeReceiver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ i b;

    public k(i iVar, l lVar) {
        this.b = iVar;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th2) {
        switch (this.a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                kotlin.jvm.internal.i.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                mg.n nVar = (mg.n) this.b;
                String type = error.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                nVar.onError(b9.a(error.getMessage(), type));
                break;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.i.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                i iVar = this.b;
                String type2 = error2.getType();
                kotlin.jvm.internal.i.d(type2, "getType(...)");
                iVar.onError(b9.b(error2.getMessage(), type2));
                break;
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        switch (this.a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                mg.n nVar = (mg.n) this.b;
                Bundle data = response.getData();
                kotlin.jvm.internal.i.d(data, "getData(...)");
                nVar.onResult(u7.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                break;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                i iVar = this.b;
                Credential credential = response2.getCredential();
                kotlin.jvm.internal.i.d(credential, "getCredential(...)");
                String type = credential.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                Bundle data2 = credential.getData();
                kotlin.jvm.internal.i.d(data2, "getData(...)");
                iVar.onResult(new o(v7.a(type, data2)));
                break;
        }
    }

    public k(mg.n nVar, e eVar, l lVar) {
        this.b = nVar;
    }
}
