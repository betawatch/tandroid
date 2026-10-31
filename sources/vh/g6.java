package vh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g6 extends hg.b {
    public int c;
    public Drawable d;
    public CharSequence e;
    public CharSequence f;
    public TLRPC.User g;
    public TLRPC.Chat h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;

    public g6(int i10, boolean z10) {
        super(i10, z10);
        this.p = -1;
    }

    public static g6 b(String str, CharSequence charSequence, int i10) {
        g6 g6Var = new g6(9, false);
        g6Var.e = str;
        g6Var.f = charSequence;
        g6Var.q = i10;
        return g6Var;
    }

    public static g6 c() {
        return new g6(0, false);
    }

    public static g6 d() {
        g6 g6Var = new g6(-1, false);
        g6Var.o = -1;
        return g6Var;
    }

    public static g6 e() {
        return new g6(1, false);
    }

    public static g6 f() {
        return new g6(2, false);
    }

    public static g6 g(CharSequence charSequence) {
        g6 g6Var = new g6(6, false);
        g6Var.e = charSequence;
        return g6Var;
    }

    public static g6 h(int i10, int i11, boolean z10) {
        g6 g6Var = new g6(3, false);
        g6Var.i = i10;
        g6Var.k = z10;
        g6Var.j = i11;
        return g6Var;
    }

    public static g6 i(TLRPC.User user, boolean z10, boolean z11) {
        g6 g6Var = new g6(3, true);
        g6Var.g = user;
        g6Var.k = z10;
        g6Var.l = z11;
        return g6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g6.class != obj.getClass()) {
            return false;
        }
        g6 g6Var = (g6) obj;
        int i10 = this.a;
        if (i10 != g6Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != g6Var.o || this.p != g6Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != g6Var.g || this.h != g6Var.h || this.i != g6Var.i || this.j != g6Var.j || this.k != g6Var.k || this.m != g6Var.m || this.n != g6Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != g6Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, g6Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, g6Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, g6Var.e) && TextUtils.equals(this.f, g6Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, g6Var.e) || this.c != g6Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != g6Var.c || !TextUtils.equals(this.e, g6Var.e) || this.k != g6Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == g6Var.q && this.d == g6Var.d && TextUtils.equals(this.e, g6Var.e) && TextUtils.equals(this.f, g6Var.f))) {
            return this.a != 10 || this.q == g6Var.q;
        }
        return false;
    }
}
