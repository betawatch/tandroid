// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uo9 extends vo9 implements Iterator {
    public to9 a;
    public boolean b = true;
    public final /* synthetic */ wo9 c;

    public uo9(wo9 wo9Var) {
        this.c = wo9Var;
    }

    @Override // vo9
    public final void a(to9 to9Var) {
        to9 to9Var2 = this.a;
        if (to9Var == to9Var2) {
            to9 to9Var3 = to9Var2.d;
            this.a = to9Var3;
            this.b = to9Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        to9 to9Var = this.a;
        return (to9Var == null || to9Var.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            to9 to9Var = this.c.a;
            this.a = to9Var;
            return to9Var;
        }
        to9 to9Var2 = this.a;
        to9 to9Var3 = to9Var2 != null ? to9Var2.c : null;
        this.a = to9Var3;
        return to9Var3;
    }
}
