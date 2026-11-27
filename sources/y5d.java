// default package

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class y5d extends q5d {
    public final WeakReference c;

    public y5d(a6d a6dVar) {
        super((byte) 1);
        this.c = new WeakReference(a6dVar);
    }

    @Override // q5d
    public final void U(t7d t7dVar) {
        a6d a6dVar = (a6d) this.c.get();
        if (a6dVar == null) {
            return;
        }
        w5d w5dVar = new w5d(this, a6dVar, a6dVar, t7dVar);
        b6d b6dVar = a6dVar.a.e;
        b6dVar.sendMessage(b6dVar.obtainMessage(1, w5dVar));
    }
}
