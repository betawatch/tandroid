package ye;

import bf.t;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class c extends df.a {
    public final /* synthetic */ int a;
    public final bf.a b;

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new t();
                break;
            default:
                this.b = new bf.f();
                break;
        }
    }

    @Override // df.a
    public void a(CharSequence charSequence) {
        int i10 = this.a;
    }

    @Override // df.a
    public boolean b(bf.a aVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // df.a
    public final bf.a e() {
        switch (this.a) {
            case 0:
                return (bf.f) this.b;
            default:
                return (t) this.b;
        }
    }

    @Override // df.a
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // df.a
    public final q3.h h(d dVar) {
        switch (this.a) {
            case 0:
                return q3.h.a(dVar.b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
