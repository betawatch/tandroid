// default package

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.internal.zzdm;
import com.google.android.recaptcha.internal.zzsw;
import com.google.android.recaptcha.internal.zzsx;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class p3d implements Continuation {
    public static /* synthetic */ void a() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void b(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    public static /* synthetic */ void c(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void d(int i, int i2, Throwable th) {
        throw new zzdm(i, i2, th);
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    public static /* synthetic */ void f(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void g(long j) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
    }

    public static /* synthetic */ void h(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void i(Throwable th) {
        throw new zp2(th);
    }

    public static /* synthetic */ void j() {
        throw new zzsw("Protocol message tag had invalid wire type.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(int i, int i2) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
    }

    public static /* synthetic */ void l(String str) {
        throw new j8e(str);
    }

    public static /* synthetic */ void m(String str) {
        throw new zzsx(str);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Task forException;
        String message;
        task.getClass();
        zc4 zc4Var = zc4.e;
        boolean isSuccessful = task.isSuccessful();
        mh0 mh0Var = y4d.b;
        if (isSuccessful) {
            mh0Var.a("Successfully completed the operation", new Object[0]);
            Task forResult = Tasks.forResult(zc4Var.invoke(task.getResult()));
            forResult.getClass();
            return forResult;
        }
        Log.e(mh0Var.b, mh0Var.b("Failed to fetch the Verification Support Info: " + task.getException(), new Object[0]));
        Exception exception = task.getException();
        if (exception == null || (message = exception.getMessage()) == null || ddb.f(0, 2, message, "test_number_token is invalid") < 0) {
            forException = Tasks.forException(new fi4(exception instanceof ao ? ((ao) exception).getStatus().a : 55501, "Failed to fetch the Verification Support Info"));
        } else {
            mh0Var.a("Backend rejected the test number token.", new Object[0]);
            forException = Tasks.forException(new fi4(55507, "Invalid test number ID(s) - might be empty, expired or duplicated."));
        }
        forException.getClass();
        return forException;
    }
}
