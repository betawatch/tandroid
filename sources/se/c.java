package se;

import ve.s;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class c extends xe.a {
    public final /* synthetic */ int a;
    public final ve.a b;

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.b = new s();
                break;
            default:
                this.b = new ve.f();
                break;
        }
    }

    @Override // xe.a
    public void a(CharSequence charSequence) {
        int i10 = this.a;
    }

    @Override // xe.a
    public boolean b(ve.a aVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // xe.a
    public final ve.a e() {
        switch (this.a) {
            case 0:
                return (ve.f) this.b;
            default:
                return (s) this.b;
        }
    }

    @Override // xe.a
    public boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // xe.a
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
