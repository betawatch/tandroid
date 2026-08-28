package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import g7.w7;
import g7.x7;
import g7.x8;
import m5.c0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k implements OutcomeReceiver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ i b;

    public k(i iVar, m mVar) {
        this.b = iVar;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th;
                kotlin.jvm.internal.i.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                c0 c0Var = (c0) this.b;
                String type = error.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                c0Var.onError(x8.a(error.getMessage(), type));
                break;
            default:
                GetCredentialException error2 = (GetCredentialException) th;
                kotlin.jvm.internal.i.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                i iVar = this.b;
                String type2 = error2.getType();
                kotlin.jvm.internal.i.d(type2, "getType(...)");
                iVar.onError(x8.b(error2.getMessage(), type2));
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
                c0 c0Var = (c0) this.b;
                Bundle data = response.getData();
                kotlin.jvm.internal.i.d(data, "getData(...)");
                c0Var.onResult(w7.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
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
                iVar.onResult(new p(x7.a(type, data2)));
                break;
        }
    }

    public k(c0 c0Var, e eVar, m mVar) {
        this.b = c0Var;
    }
}
