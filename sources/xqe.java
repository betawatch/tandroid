// default package

import android.content.Context;
import com.google.android.gms.tasks.TaskExecutors;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class xqe {
    public static void a(String str, ez5 ez5Var, dz5 dz5Var) {
        b(str, ez5Var, dz5Var, false);
    }

    public static void b(String str, ez5 ez5Var, dz5 dz5Var, boolean z) {
        if (z) {
            try {
                Context context = a.b;
                synchronized (jg7.b) {
                    try {
                        jg7.d(context, TaskExecutors.MAIN_THREAD);
                    } finally {
                    }
                }
            } catch (IllegalStateException e) {
                if (!z) {
                    b(str, ez5Var, dz5Var, true);
                    return;
                } else {
                    dz5Var.l(e);
                    cc4.g(e, false);
                    return;
                }
            } catch (Exception e2) {
                dz5Var.l(e2);
                cc4.g(e2, true);
                return;
            } catch (Throwable th) {
                dz5Var.l(null);
                cc4.g(th, false);
                return;
            }
        }
        are.a().c(str).addOnSuccessListener(new e05((Object) ez5Var, (byte) 20)).addOnFailureListener(new e05((Object) dz5Var, (byte) 21));
    }
}
