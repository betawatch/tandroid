// default package

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class y2d extends u2d {
    public final /* synthetic */ TaskCompletionSource h;
    public final /* synthetic */ u2d n;
    public final /* synthetic */ i1d r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2d(i1d i1dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, u2d u2dVar) {
        super(taskCompletionSource);
        this.h = taskCompletionSource2;
        this.n = u2dVar;
        this.r = i1dVar;
    }

    @Override // u2d
    public final void b() {
        synchronized (this.r.f) {
            i1d i1dVar = this.r;
            TaskCompletionSource taskCompletionSource = this.h;
            i1dVar.e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new xab(i1dVar, taskCompletionSource, false, (byte) 8));
            if (this.r.l.getAndIncrement() > 0) {
                this.r.b.b("Already connected to the service.", new Object[0]);
            }
            i1d.b(this.r, this.n);
        }
    }
}
