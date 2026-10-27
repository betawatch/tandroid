package v0;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import w7.m5;
import w7.t;
import w7.u;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class k implements OutcomeReceiver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ i b;

    public k(i iVar, l lVar) {
        this.b = iVar;
    }

    public final void onError(Throwable th2) {
        switch (this.a) {
            case 0:
                CreateCredentialException error = (CreateCredentialException) th2;
                kotlin.jvm.internal.i.e(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                me.b bVar = (me.b) this.b;
                String type = error.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                bVar.onError(m5.a(error.getMessage(), type));
                break;
            default:
                GetCredentialException error2 = (GetCredentialException) th2;
                kotlin.jvm.internal.i.e(error2, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type2 = error2.getType();
                kotlin.jvm.internal.i.d(type2, "getType(...)");
                this.b.onError(m5.b(error2.getMessage(), type2));
                break;
        }
    }

    public final void onResult(Object obj) {
        switch (this.a) {
            case 0:
                CreateCredentialResponse response = (CreateCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                me.b bVar = (me.b) this.b;
                Bundle data = response.getData();
                kotlin.jvm.internal.i.d(data, "getData(...)");
                bVar.onResult(t.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                break;
            default:
                GetCredentialResponse response2 = (GetCredentialResponse) obj;
                kotlin.jvm.internal.i.e(response2, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                Credential credential = response2.getCredential();
                kotlin.jvm.internal.i.d(credential, "getCredential(...)");
                String type = credential.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
                Bundle data2 = credential.getData();
                kotlin.jvm.internal.i.d(data2, "getData(...)");
                this.b.onResult(new o(u.a(type, data2)));
                break;
        }
    }

    public k(me.b bVar, e eVar, l lVar) {
        this.b = bVar;
    }
}
