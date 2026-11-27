// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
