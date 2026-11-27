// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class pjc implements Runnable {
    public final /* synthetic */ anb a;

    public pjc(anb anbVar) {
        this.a = anbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.c) {
            this.a.d = null;
        }
    }
}
