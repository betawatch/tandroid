// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class v0f {
    public mjd a(tod todVar) {
        return (mjd) rjd.d.getAndSet(todVar, mjd.d);
    }

    public ujd b(tod todVar) {
        return (ujd) rjd.c.getAndSet(todVar, ujd.c);
    }

    public void c(ujd ujdVar, ujd ujdVar2) {
        rjd.b.lazySet(ujdVar, ujdVar2);
    }

    public void d(ujd ujdVar, Thread thread) {
        rjd.a.lazySet(ujdVar, thread);
    }

    public boolean e(tod todVar, mjd mjdVar, mjd mjdVar2) {
        return x0f.a(rjd.d, todVar, mjdVar, mjdVar2);
    }

    public boolean f(akd akdVar, Object obj, Object obj2) {
        return x0f.a(rjd.e, akdVar, obj, obj2);
    }

    public boolean g(akd akdVar, ujd ujdVar, ujd ujdVar2) {
        return x0f.a(rjd.c, akdVar, ujdVar, ujdVar2);
    }
}
