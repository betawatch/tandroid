// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class za9 extends ft5 {
    public final gt5 e;

    public za9(gt5 gt5Var) {
        this.e = gt5Var;
    }

    @Override // ft5
    public final boolean k() {
        return false;
    }

    @Override // ft5
    public final void l(Throwable th) {
        Object v = j().v();
        boolean z = v instanceof fp2;
        gt5 gt5Var = this.e;
        if (z) {
            gt5Var.resumeWith(qse.a(((fp2) v).a));
        } else {
            gt5Var.resumeWith(fad.a(v));
        }
    }
}
