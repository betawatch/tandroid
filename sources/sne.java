// default package

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class sne {
    public static qa4 a(Context context, GoogleSignInOptions googleSignInOptions) {
        xve.h(googleSignInOptions);
        return new qa4(context, q40.a, googleSignInOptions, new g05(new uif((byte) 13), Looper.getMainLooper()));
    }

    public static Task b(Intent intent) {
        f15 f15Var;
        GoogleSignInAccount googleSignInAccount;
        mh0 mh0Var = y8d.a;
        Status status = Status.h;
        if (intent == null) {
            f15Var = new f15(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                f15Var = new f15(null, status);
            } else {
                f15Var = new f15(googleSignInAccount2, Status.e);
            }
        }
        Status status3 = f15Var.a;
        return (!status3.b() || (googleSignInAccount = f15Var.b) == null) ? Tasks.forException(sqd.a(status3)) : Tasks.forResult(googleSignInAccount);
    }
}
