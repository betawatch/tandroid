package xa;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.web.k0;
import rh.l5;
import vh.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class f extends Service {
    public final ExecutorService a;
    public w b;
    public final Object c;
    public int d;
    public int e;

    public f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c5.s("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new Object();
        this.e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            v.b(intent);
        }
        synchronized (this.c) {
            try {
                int i10 = this.e - 1;
                this.e = i10;
                if (i10 == 0) {
                    stopSelfResult(this.d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.b == null) {
                this.b = new w(new e0(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.c) {
            this.d = i11;
            this.e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) n.D().d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.a.execute(new l5(this, intent2, taskCompletionSource, 21));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new a3.b(3), new k0(25, this, intent));
        return 3;
    }
}
