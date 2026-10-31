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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.yt;
import r2.y;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k implements i {
    public final CredentialManager a;

    public k(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // v0.i
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override // v0.i
    public final void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, h hVar) {
        kotlin.jvm.internal.i.e(context, "context");
        y yVar = (y) hVar;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            yVar.g(new w0.c(3, "Your device doesn't support credential manager"));
            return;
        }
        j jVar = new j(yVar, (e) bVar, this);
        kotlin.jvm.internal.i.b(credentialManager);
        Bundle bundle = bVar.a;
        m5.e eVar = bVar.c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) eVar.b);
        CharSequence charSequence = (CharSequence) eVar.c;
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
        credentialManager.createCredential(context, build, cancellationSignal, executor, jVar);
    }

    @Override // v0.i
    public final void onGetCredential(Context context, m mVar, CancellationSignal cancellationSignal, Executor executor, h hVar) {
        kotlin.jvm.internal.i.e(executor, "executor");
        yt ytVar = (yt) hVar;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            ytVar.g(new w0.h(3, "Your device doesn't support credential manager"));
            return;
        }
        j jVar = new j(ytVar, this);
        kotlin.jvm.internal.i.b(credentialManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", mVar.b);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (o oVar : mVar.a) {
            oVar.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", oVar.a, oVar.b).setIsSystemProviderRequired(false).setAllowedProviders(oVar.c).build());
        }
        GetCredentialRequest build = builder.build();
        kotlin.jvm.internal.i.d(build, "build(...)");
        credentialManager.getCredential(context, build, cancellationSignal, executor, jVar);
    }
}
