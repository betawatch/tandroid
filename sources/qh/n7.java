package qh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class n7 extends cg.b {
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

    public n7(int i10, boolean z4) {
        super(i10, z4);
        this.p = -1;
    }

    public static n7 b(String str, CharSequence charSequence, int i10) {
        n7 n7Var = new n7(9, false);
        n7Var.e = str;
        n7Var.f = charSequence;
        n7Var.q = i10;
        return n7Var;
    }

    public static n7 c() {
        return new n7(0, false);
    }

    public static n7 d() {
        n7 n7Var = new n7(-1, false);
        n7Var.o = -1;
        return n7Var;
    }

    public static n7 e() {
        return new n7(1, false);
    }

    public static n7 f() {
        return new n7(2, false);
    }

    public static n7 g(CharSequence charSequence) {
        n7 n7Var = new n7(6, false);
        n7Var.e = charSequence;
        return n7Var;
    }

    public static n7 h(int i10, int i11, boolean z4) {
        n7 n7Var = new n7(3, false);
        n7Var.i = i10;
        n7Var.k = z4;
        n7Var.j = i11;
        return n7Var;
    }

    public static n7 i(TLRPC.User user, boolean z4, boolean z10) {
        n7 n7Var = new n7(3, true);
        n7Var.g = user;
        n7Var.k = z4;
        n7Var.l = z10;
        return n7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n7.class != obj.getClass()) {
            return false;
        }
        n7 n7Var = (n7) obj;
        int i10 = this.a;
        if (i10 != n7Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != n7Var.o || this.p != n7Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != n7Var.g || this.h != n7Var.h || this.i != n7Var.i || this.j != n7Var.j || this.k != n7Var.k || this.m != n7Var.m || this.n != n7Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != n7Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, n7Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, n7Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, n7Var.e) && TextUtils.equals(this.f, n7Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, n7Var.e) || this.c != n7Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != n7Var.c || !TextUtils.equals(this.e, n7Var.e) || this.k != n7Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == n7Var.q && this.d == n7Var.d && TextUtils.equals(this.e, n7Var.e) && TextUtils.equals(this.f, n7Var.f))) {
            return this.a != 10 || this.q == n7Var.q;
        }
        return false;
    }
}
