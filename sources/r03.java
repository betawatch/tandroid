// default package

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r03 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o13 b;

    public /* synthetic */ r03(o13 o13Var, byte b) {
        this.a = b;
        this.b = o13Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        o13 o13Var = this.b;
        switch (b) {
            case 0:
                o13Var.L(new c03((CharSequence) null, (byte) 2));
                break;
            case 1:
                o13Var.L(new c03((CharSequence) null, (byte) 2));
                break;
            case 2:
                o13Var.onResult(null);
                break;
            case 3:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5$lambda$4(o13Var);
                break;
            case 4:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$3$lambda$2(o13Var);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$lambda$0(o13Var);
                break;
            case 6:
                o13Var.onResult(null);
                break;
            case 7:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$7$lambda$6(o13Var);
                break;
            case 8:
                o13Var.onResult(null);
                break;
            case 9:
                o13Var.L(new ts4("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                break;
            default:
                o13Var.L(new ts4("No provider data returned.", (byte) 2));
                break;
        }
    }
}
