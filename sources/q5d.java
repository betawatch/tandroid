// default package

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class q5d extends e1d {
    public final /* synthetic */ byte b = 1;
    public final Object c;

    public q5d(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", (byte) 2);
        this.c = revocationBoundService;
    }

    public final void T() {
        if (!cze.a((RevocationBoundService) this.c, Binder.getCallingUid())) {
            throw new SecurityException(td4.o(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    @Override // e1d
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        String e;
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) y5d.a(parcel, Status.CREATOR);
                ii0 ii0Var = (ii0) y5d.a(parcel, ii0.CREATOR);
                y5d.b(parcel);
                fxe.a(status, ii0Var, (TaskCompletionSource) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i == 1) {
                    T();
                    f3b a = f3b.a(revocationBoundService);
                    GoogleSignInAccount b2 = a.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.w;
                    if (b2 != null) {
                        String e2 = a.e("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(e2) && (e = a.e(f3b.f("googleSignInOptions", e2))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.b(e);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    ua4 a2 = ble.a(revocationBoundService, googleSignInOptions);
                    if (b2 != null) {
                        z3d z3dVar = a2.i;
                        Context context = a2.a;
                        boolean z = a2.l() == 3;
                        j6d.a.a("Revoking access", new Object[0]);
                        String e3 = f3b.a(context).e("refreshToken");
                        j6d.b(context);
                        if (!z) {
                            h6d h6dVar = new h6d(z3dVar, (byte) 1);
                            z3dVar.b.d(1, h6dVar);
                            basePendingResult = h6dVar;
                        } else if (e3 == null) {
                            li0 li0Var = v5d.c;
                            Status status2 = new Status(4, null, null, null);
                            ite.a("Status code must not be SUCCESS", !status2.b());
                            basePendingResult = new o4d(status2);
                            basePendingResult.a(status2);
                        } else {
                            v5d v5dVar = new v5d(e3);
                            new Thread(v5dVar).start();
                            basePendingResult = v5dVar.b;
                        }
                        ydd.a(basePendingResult, new q7f((byte) 29));
                    } else {
                        a2.k();
                    }
                } else {
                    if (i != 2) {
                        return false;
                    }
                    T();
                    k6d.r1(revocationBoundService).s1();
                }
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5d(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", (byte) 2);
        this.c = taskCompletionSource;
    }
}
