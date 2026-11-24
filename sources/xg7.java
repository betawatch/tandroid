// default package

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xg7 extends q3 {
    public final q3 e;
    public final gi3 f;

    public xg7(q3 q3Var, gi3 gi3Var) {
        q3Var.getClass();
        this.e = q3Var;
        this.f = gi3Var;
    }

    @Override // q3
    public final void b() {
        this.e.b();
    }

    @Override // q3
    public final Map d() {
        return new oi6(this.e.a(), new im6(this, (byte) 10));
    }

    @Override // q3
    public final Collection e() {
        return new p3(this, (byte) 0);
    }

    @Override // q3
    public final Set f() {
        return this.e.j();
    }

    @Override // q3
    public final Iterator h() {
        return new ks5(this.e.g().iterator(), new li6(this.f));
    }

    @Override // q3
    public final Collection i(Object obj) {
        return tne.b((List) this.e.i(obj), new ji6(this.f, obj));
    }

    @Override // q3
    public final boolean k(Object obj, Object obj2) {
        return i(obj).remove(obj2);
    }

    @Override // q3
    public final int l() {
        return this.e.l();
    }
}
