// default package

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class x23 implements OutcomeReceiver {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ h23 b;

    public x23(h23 h23Var, y23 y23Var) {
        this.b = h23Var;
    }

    public final void onError(Throwable th) {
        byte b = this.a;
        h23 h23Var = this.b;
        switch (b) {
            case 0:
                CreateCredentialException createCredentialException = (CreateCredentialException) th;
                createCredentialException.getClass();
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                String type = createCredentialException.getType();
                type.getClass();
                ((zm9) h23Var).B(tyd.a(createCredentialException.getMessage(), type));
                break;
            default:
                GetCredentialException getCredentialException = (GetCredentialException) th;
                getCredentialException.getClass();
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                String type2 = getCredentialException.getType();
                type2.getClass();
                h23Var.B(tyd.b(getCredentialException.getMessage(), type2));
                break;
        }
    }

    public final void onResult(Object obj) {
        byte b = this.a;
        h23 h23Var = this.b;
        switch (b) {
            case 0:
                CreateCredentialResponse createCredentialResponse = (CreateCredentialResponse) obj;
                createCredentialResponse.getClass();
                Log.i("CredManProvService", "Create Result returned from framework: ");
                Bundle data = createCredentialResponse.getData();
                data.getClass();
                ((zm9) h23Var).onResult(iee.a("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", data));
                break;
            default:
                GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
                getCredentialResponse.getClass();
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                Credential credential = getCredentialResponse.getCredential();
                credential.getClass();
                String type = credential.getType();
                type.getClass();
                Bundle data2 = credential.getData();
                data2.getClass();
                h23Var.onResult(new bv4(vee.a(type, data2)));
                break;
        }
    }

    public x23(zm9 zm9Var, t13 t13Var, y23 y23Var) {
        this.b = zm9Var;
    }
}
