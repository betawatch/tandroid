package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import i7.f8;
import i7.g8;
import i7.u8;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                kotlin.jvm.internal.j.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                o4.g gVar = (o4.g) this.b;
                String type = error.getType();
                kotlin.jvm.internal.j.d(type, "getType(...)");
                gVar.onError(u8.a(error.getMessage(), type));
                break;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.j.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                i iVar = this.b;
                String type2 = error2.getType();
                kotlin.jvm.internal.j.d(type2, "getType(...)");
                iVar.onError(u8.b(error2.getMessage(), type2));
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
                o4.g gVar = (o4.g) this.b;
                Bundle data = response.getData();
                kotlin.jvm.internal.j.d(data, "getData(...)");
                gVar.onResult(f8.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
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
                iVar.onResult(new o(g8.a(type, data2)));
                break;
        }
    }

    public k(o4.g gVar, e eVar, l lVar) {
        this.b = gVar;
    }
}
