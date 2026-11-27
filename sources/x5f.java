// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class x5f {
    public void a(p4f p4fVar, p4f p4fVar2) {
        p4fVar.b = p4fVar2;
    }

    public void b(p4f p4fVar, Thread thread) {
        p4fVar.a = thread;
    }

    public boolean c(p9f p9fVar, wge wgeVar, wge wgeVar2) {
        synchronized (p9fVar) {
            if (p9fVar.b != wgeVar) {
                return false;
            }
            p9fVar.b = wgeVar2;
            return true;
        }
    }

    public boolean d(p9f p9fVar, Object obj, Object obj2) {
        synchronized (p9fVar) {
            if (p9fVar.a != obj) {
                return false;
            }
            p9fVar.a = obj2;
            return true;
        }
    }

    public boolean e(p9f p9fVar, p4f p4fVar, p4f p4fVar2) {
        synchronized (p9fVar) {
            if (p9fVar.c != p4fVar) {
                return false;
            }
            p9fVar.c = p4fVar2;
            return true;
        }
    }
}
