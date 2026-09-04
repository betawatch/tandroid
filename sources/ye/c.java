package ye;

import bf.t;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
