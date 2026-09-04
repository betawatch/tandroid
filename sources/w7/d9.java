package w7;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class d9 {
    public static com.google.android.gms.internal.clearcut.u0 a(Context context, GoogleSignInOptions googleSignInOptions) {
        n6.l.h(googleSignInOptions);
        return new com.google.android.gms.internal.clearcut.u0(context, w5.a.a, googleSignInOptions, new com.google.android.gms.common.api.i(new com.google.android.gms.common.api.internal.a(), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        z5.b bVar;
        GoogleSignInAccount googleSignInAccount;
        a5.a aVar = a6.h.a;
        Status status = Status.h;
        if (intent == null) {
            bVar = new z5.b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                bVar = new z5.b(null, status);
            } else {
                bVar = new z5.b(googleSignInAccount2, Status.e);
            }
        }
        Status status3 = bVar.a;
        return (!status3.b() || (googleSignInAccount = bVar.b) == null) ? Tasks.forException(n6.l.m(status3)) : Tasks.forResult(googleSignInAccount);
    }
}
