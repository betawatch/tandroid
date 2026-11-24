// default package

import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class so9 extends vo9 implements Iterator {
    public to9 a;
    public to9 b;
    public final /* synthetic */ byte c;

    public so9(to9 to9Var, to9 to9Var2, byte b) {
        this.c = b;
        this.a = to9Var2;
        this.b = to9Var;
    }

    @Override // vo9
    public final void a(to9 to9Var) {
        to9 to9Var2;
        to9 to9Var3 = this.a;
        to9 to9Var4 = null;
        if (to9Var3 == to9Var && to9Var == this.b) {
            this.b = null;
            this.a = null;
            to9Var3 = null;
        }
        to9 to9Var5 = to9Var3;
        if (to9Var3 == to9Var) {
            switch (this.c) {
                case 0:
                    to9Var2 = to9Var3.d;
                    break;
                default:
                    to9Var2 = to9Var3.c;
                    break;
            }
            to9Var5 = to9Var2;
            this.a = to9Var5;
        }
        to9 to9Var6 = this.b;
        if (to9Var6 == to9Var) {
            if (to9Var6 != to9Var5 && to9Var5 != null) {
                to9Var4 = b(to9Var6);
            }
            this.b = to9Var4;
        }
    }

    public final to9 b(to9 to9Var) {
        switch (this.c) {
            case 0:
                return to9Var.c;
            default:
                return to9Var.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        to9 to9Var = this.b;
        to9 to9Var2 = this.a;
        this.b = (to9Var == to9Var2 || to9Var2 == null) ? null : b(to9Var);
        return to9Var;
    }
}
