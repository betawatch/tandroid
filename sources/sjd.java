// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sjd extends v0f {
    @Override // v0f
    public final mjd a(tod todVar) {
        mjd mjdVar;
        mjd mjdVar2 = mjd.d;
        synchronized (todVar) {
            mjdVar = todVar.b;
            if (mjdVar != mjdVar2) {
                todVar.b = mjdVar2;
            }
        }
        return mjdVar;
    }

    @Override // v0f
    public final ujd b(tod todVar) {
        ujd ujdVar;
        ujd ujdVar2 = ujd.c;
        synchronized (todVar) {
            ujdVar = todVar.c;
            if (ujdVar != ujdVar2) {
                todVar.c = ujdVar2;
            }
        }
        return ujdVar;
    }

    @Override // v0f
    public final void c(ujd ujdVar, ujd ujdVar2) {
        ujdVar.b = ujdVar2;
    }

    @Override // v0f
    public final void d(ujd ujdVar, Thread thread) {
        ujdVar.a = thread;
    }

    @Override // v0f
    public final boolean e(tod todVar, mjd mjdVar, mjd mjdVar2) {
        synchronized (todVar) {
            if (todVar.b != mjdVar) {
                return false;
            }
            todVar.b = mjdVar2;
            return true;
        }
    }

    @Override // v0f
    public final boolean f(akd akdVar, Object obj, Object obj2) {
        synchronized (akdVar) {
            if (akdVar.a != obj) {
                return false;
            }
            akdVar.a = obj2;
            return true;
        }
    }

    @Override // v0f
    public final boolean g(akd akdVar, ujd ujdVar, ujd ujdVar2) {
        synchronized (akdVar) {
            if (akdVar.c != ujdVar) {
                return false;
            }
            akdVar.c = ujdVar2;
            return true;
        }
    }
}
