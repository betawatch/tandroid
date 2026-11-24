// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class w0d extends s0d {
    public final /* synthetic */ TaskCompletionSource h;
    public final /* synthetic */ s0d n;
    public final /* synthetic */ hzc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0d(hzc hzcVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, s0d s0dVar) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.n = s0dVar;
        this.r = hzcVar;
    }

    @Override // s0d
    public final void b() {
        synchronized (this.r.f) {
            hzc hzcVar = this.r;
            TaskCompletionSource taskCompletionSource = this.h;
            hzcVar.e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new v8b(hzcVar, taskCompletionSource, false, (byte) 8));
            if (this.r.l.getAndIncrement() > 0) {
                this.r.b.b("Already connected to the service.", new Object[0]);
            }
            hzc.b(this.r, this.n);
        }
    }
}
