// default package

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class x5d {
    public na6 a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f;
    public volatile oy g;
    public volatile oy h;
    public final Semaphore i;
    public final Set j;

    public x5d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        oy oyVar = this.g;
        Executor executor = this.f;
        if (oyVar.b == 1) {
            oyVar.b = 2;
            executor.execute(oyVar.a);
            return;
        }
        int F = wi8.F(oyVar.b);
        if (F == 1) {
            dq9.m("Cannot execute task: the task is already running.");
        } else if (F != 2) {
            dq9.m("We should never reach this state");
        } else {
            dq9.m("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final boolean b() {
        if (this.g == null) {
            return false;
        }
        boolean z = this.b;
        if (!z) {
            if (z) {
                c();
            } else {
                this.e = true;
            }
        }
        oy oyVar = this.h;
        oy oyVar2 = this.g;
        if (oyVar != null) {
            oyVar2.getClass();
            this.g = null;
            return false;
        }
        oyVar2.getClass();
        oy oyVar3 = this.g;
        oyVar3.c.set(true);
        boolean cancel = oyVar3.a.cancel(false);
        if (cancel) {
            this.h = this.g;
        }
        this.g = null;
        return cancel;
    }

    public final void c() {
        b();
        this.g = new oy(this);
        a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
