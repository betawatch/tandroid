package ph;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class p7 extends bg.b {
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

    public p7(int i10, boolean z4) {
        super(i10, z4);
        this.p = -1;
    }

    public static p7 b(String str, CharSequence charSequence, int i10) {
        p7 p7Var = new p7(9, false);
        p7Var.e = str;
        p7Var.f = charSequence;
        p7Var.q = i10;
        return p7Var;
    }

    public static p7 c() {
        return new p7(0, false);
    }

    public static p7 d() {
        p7 p7Var = new p7(-1, false);
        p7Var.o = -1;
        return p7Var;
    }

    public static p7 e() {
        return new p7(1, false);
    }

    public static p7 f() {
        return new p7(2, false);
    }

    public static p7 g(CharSequence charSequence) {
        p7 p7Var = new p7(6, false);
        p7Var.e = charSequence;
        return p7Var;
    }

    public static p7 h(int i10, int i11, boolean z4) {
        p7 p7Var = new p7(3, false);
        p7Var.i = i10;
        p7Var.k = z4;
        p7Var.j = i11;
        return p7Var;
    }

    public static p7 i(TLRPC.User user, boolean z4, boolean z10) {
        p7 p7Var = new p7(3, true);
        p7Var.g = user;
        p7Var.k = z4;
        p7Var.l = z10;
        return p7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p7.class != obj.getClass()) {
            return false;
        }
        p7 p7Var = (p7) obj;
        int i10 = this.a;
        if (i10 != p7Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != p7Var.o || this.p != p7Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != p7Var.g || this.h != p7Var.h || this.i != p7Var.i || this.j != p7Var.j || this.k != p7Var.k || this.m != p7Var.m || this.n != p7Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != p7Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, p7Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, p7Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, p7Var.e) && TextUtils.equals(this.f, p7Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, p7Var.e) || this.c != p7Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != p7Var.c || !TextUtils.equals(this.e, p7Var.e) || this.k != p7Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == p7Var.q && this.d == p7Var.d && TextUtils.equals(this.e, p7Var.e) && TextUtils.equals(this.f, p7Var.f))) {
            return this.a != 10 || this.q == p7Var.q;
        }
        return false;
    }
}
