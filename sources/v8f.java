// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class v8f {
    public fgf a(lgf lgfVar) {
        fgf fgfVar;
        fgf fgfVar2 = fgf.d;
        synchronized (lgfVar) {
            fgfVar = lgfVar.b;
            if (fgfVar != fgfVar2) {
                lgfVar.b = fgfVar2;
            }
        }
        return fgfVar;
    }

    public jgf b(lgf lgfVar) {
        jgf jgfVar;
        jgf jgfVar2 = jgf.c;
        synchronized (lgfVar) {
            jgfVar = lgfVar.c;
            if (jgfVar != jgfVar2) {
                lgfVar.c = jgfVar2;
            }
        }
        return jgfVar;
    }

    public void c(jgf jgfVar, jgf jgfVar2) {
        jgfVar.b = jgfVar2;
    }

    public void d(jgf jgfVar, Thread thread) {
        jgfVar.a = thread;
    }

    public boolean e(lgf lgfVar, fgf fgfVar, fgf fgfVar2) {
        synchronized (lgfVar) {
            if (lgfVar.b != fgfVar) {
                return false;
            }
            lgfVar.b = fgfVar2;
            return true;
        }
    }

    public boolean f(lgf lgfVar, Object obj, Object obj2) {
        synchronized (lgfVar) {
            if (lgfVar.a != obj) {
                return false;
            }
            lgfVar.a = obj2;
            return true;
        }
    }

    public boolean g(lgf lgfVar, jgf jgfVar, jgf jgfVar2) {
        synchronized (lgfVar) {
            if (lgfVar.c != jgfVar) {
                return false;
            }
            lgfVar.c = jgfVar2;
            return true;
        }
    }
}
