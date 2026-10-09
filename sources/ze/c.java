package ze;

import cf.t;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c extends ef.a {
    public final /* synthetic */ int a;
    public final cf.a b;

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new t();
                break;
            default:
                this.b = new cf.f();
                break;
        }
    }

    @Override // ef.a
    public void a(CharSequence charSequence) {
        int i10 = this.a;
    }

    @Override // ef.a
    public boolean b(cf.a aVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // ef.a
    public final cf.a e() {
        switch (this.a) {
            case 0:
                return (cf.f) this.b;
            default:
                return (t) this.b;
        }
    }

    @Override // ef.a
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // ef.a
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
