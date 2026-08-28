package v0;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import m5.c0;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.e3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m implements j {
    public final CredentialManager a;

    public m(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // v0.j
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override // v0.j
    public final void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, i iVar) {
        kotlin.jvm.internal.i.e(context, "context");
        c0 c0Var = (c0) iVar;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            c0Var.onError(new w0.c("Your device doesn't support credential manager", 3));
            return;
        }
        k kVar = new k(c0Var, (e) bVar, this);
        kotlin.jvm.internal.i.b(credentialManager);
        Bundle bundle = bVar.a;
        e3 e3Var = bVar.c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) e3Var.b);
        CharSequence charSequence = (CharSequence) e3Var.c;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, R.drawable.adx_ic_passkey));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bVar.b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        kotlin.jvm.internal.i.d(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        kotlin.jvm.internal.i.d(build, "build(...)");
        credentialManager.createCredential(context, build, cancellationSignal, executor, kVar);
    }

    @Override // v0.j
    public final void onGetCredential(Context context, o oVar, CancellationSignal cancellationSignal, Executor executor, i iVar) {
        kotlin.jvm.internal.i.e(executor, "executor");
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            iVar.onError(new w0.h("Your device doesn't support credential manager", 3));
            return;
        }
        k kVar = new k(iVar, this);
        kotlin.jvm.internal.i.b(credentialManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", oVar.b);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (q qVar : oVar.a) {
            qVar.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", qVar.a, qVar.b).setIsSystemProviderRequired(false).setAllowedProviders(qVar.c).build());
        }
        GetCredentialRequest build = builder.build();
        kotlin.jvm.internal.i.d(build, "build(...)");
        credentialManager.getCredential(context, build, cancellationSignal, executor, kVar);
    }
}
