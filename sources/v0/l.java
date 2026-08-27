package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import h7.o8;
import h7.t7;
import h7.u7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l implements OutcomeReceiver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ i b;

    public l(i iVar, m mVar) {
        this.b = iVar;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th;
                kotlin.jvm.internal.j.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                sd.b bVar = (sd.b) this.b;
                String type = error.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                bVar.onError(o8.a(error.getMessage(), type));
                break;
            default:
                GetCredentialException error2 = (GetCredentialException) th;
                kotlin.jvm.internal.j.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                i iVar = this.b;
                String type2 = error2.getType();
                kotlin.jvm.internal.j.d(type2, "getType(...)");
                iVar.onError(o8.b(error2.getMessage(), type2));
                break;
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        switch (this.a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.j.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                sd.b bVar = (sd.b) this.b;
                Bundle data = response.getData();
                kotlin.jvm.internal.j.d(data, "getData(...)");
                bVar.onResult(t7.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                break;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                kotlin.jvm.internal.j.e(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                i iVar = this.b;
                Credential credential = response2.getCredential();
                kotlin.jvm.internal.j.d(credential, "getCredential(...)");
                String type = credential.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                Bundle data2 = credential.getData();
                kotlin.jvm.internal.j.d(data2, "getData(...)");
                iVar.onResult(new p(u7.a(type, data2)));
                break;
        }
    }

    public l(sd.b bVar, e eVar, m mVar) {
        this.b = bVar;
    }
}
