// default package

import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q0d b;

    public /* synthetic */ p0d(q0d q0dVar, byte b) {
        this.a = b;
        this.b = q0dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        q0d q0dVar = this.b;
        switch (b) {
            case 0:
                z zVar = q0dVar.e;
                if (zVar != null) {
                    zVar.f(q0dVar.w);
                    break;
                }
                break;
            default:
                z zVar2 = q0dVar.e;
                if (zVar2 != null) {
                    zVar2.f(q0dVar.w);
                    break;
                }
                break;
        }
    }
}
