package q6;

import a8.j8;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class m {
    public static final Object a = new Object();
    public static boolean b;
    public static int c;

    public static void a(String str, boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            com.google.android.recaptcha.internal.a.s(sb2, "Must be called on ", name2, " thread, but got ", name);
            sb2.append(".");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public static void d(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(String str, boolean z9) {
        if (!z9) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void j(boolean z9) {
        if (!z9) {
            throw new IllegalStateException();
        }
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static com.google.android.gms.common.api.f l(Status status) {
        return status.c != null ? new com.google.android.gms.common.api.p(status) : new com.google.android.gms.common.api.f(status);
    }

    public static Task m(j8 j8Var, l lVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        j8Var.b(new v(j8Var, taskCompletionSource, lVar));
        return taskCompletionSource.getTask();
    }
}
