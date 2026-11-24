// default package

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q50 extends BiometricPrompt$AuthenticationCallback {
    public final /* synthetic */ t50 a;

    public q50(t50 t50Var) {
        this.a = t50Var;
    }

    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    public void onAuthenticationFailed() {
        WeakReference weakReference = ((jk0) this.a).a;
        if (weakReference.get() == null || !((lk0) weakReference.get()).l) {
            return;
        }
        lk0 lk0Var = (lk0) weakReference.get();
        kj7 kj7Var = lk0Var.s;
        if (kj7Var == null) {
            kj7Var = new kj7();
            lk0Var.s = kj7Var;
        }
        lk0.f(kj7Var, Boolean.TRUE);
    }

    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential b;
        gk0 gk0Var = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher d = b53.d(cryptoObject);
            if (d != null) {
                gk0Var = new gk0(d);
            } else {
                Signature f = b53.f(cryptoObject);
                if (f != null) {
                    gk0Var = new gk0(f);
                } else {
                    Mac e = b53.e(cryptoObject);
                    if (e != null) {
                        gk0Var = new gk0(e);
                    } else if (Build.VERSION.SDK_INT >= 30 && (b = c53.b(cryptoObject)) != null) {
                        gk0Var = new gk0(b);
                    }
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                i2 = s50.a(authenticationResult);
            }
        } else if (i != 29) {
            i2 = 2;
        }
        this.a.b(new fk0(gk0Var, i2));
    }

    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
