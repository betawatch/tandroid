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
import tg.x;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class k implements i {
    public final CredentialManager a;

    public k(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        this.a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // v0.i
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override // v0.i
    public final void onCreateCredential(Context context, b bVar, CancellationSignal cancellationSignal, Executor executor, g gVar) {
        kotlin.jvm.internal.j.e(context, "context");
        u7.i iVar = (u7.i) gVar;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            iVar.a(new w0.c(3, "Your device doesn't support credential manager"));
            return;
        }
        j jVar = new j(iVar, (e) bVar, this);
        kotlin.jvm.internal.j.b(credentialManager);
        Bundle bundle = bVar.a;
        x xVar = bVar.c;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", (String) xVar.b);
        CharSequence charSequence = (CharSequence) xVar.c;
        if (!TextUtils.isEmpty(charSequence)) {
            bundle2.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", charSequence);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle2.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", null);
        }
        bundle2.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, R.drawable.adx_ic_passkey));
        bundle.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundle2);
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bVar.b).setIsSystemProviderRequired(false).setAlwaysSendAppInfoToProvider(true);
        kotlin.jvm.internal.j.d(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        CreateCredentialRequest build = alwaysSendAppInfoToProvider.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        credentialManager.createCredential(context, build, cancellationSignal, executor, jVar);
    }

    @Override // v0.i
    public final void onGetCredential(Context context, m mVar, CancellationSignal cancellationSignal, Executor executor, g gVar) {
        kotlin.jvm.internal.j.e(executor, "executor");
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            gVar.a(new w0.h(3, "Your device doesn't support credential manager"));
            return;
        }
        j jVar = new j(gVar, this);
        kotlin.jvm.internal.j.b(credentialManager);
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", mVar.b);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (h hVar : mVar.a) {
            builder.addCredentialOption(new CredentialOption.Builder(hVar.a, hVar.b, hVar.c).setIsSystemProviderRequired(false).setAllowedProviders(hVar.d).build());
        }
        GetCredentialRequest build = builder.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        credentialManager.getCredential(context, build, cancellationSignal, executor, jVar);
    }
}
