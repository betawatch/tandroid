package ph;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class o7 extends bg.b {
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

    public o7(int i10, boolean z4) {
        super(i10, z4);
        this.p = -1;
    }

    public static o7 b(String str, CharSequence charSequence, int i10) {
        o7 o7Var = new o7(9, false);
        o7Var.e = str;
        o7Var.f = charSequence;
        o7Var.q = i10;
        return o7Var;
    }

    public static o7 c() {
        return new o7(0, false);
    }

    public static o7 d() {
        o7 o7Var = new o7(-1, false);
        o7Var.o = -1;
        return o7Var;
    }

    public static o7 e() {
        return new o7(1, false);
    }

    public static o7 f() {
        return new o7(2, false);
    }

    public static o7 g(CharSequence charSequence) {
        o7 o7Var = new o7(6, false);
        o7Var.e = charSequence;
        return o7Var;
    }

    public static o7 h(int i10, int i11, boolean z4) {
        o7 o7Var = new o7(3, false);
        o7Var.i = i10;
        o7Var.k = z4;
        o7Var.j = i11;
        return o7Var;
    }

    public static o7 i(TLRPC.User user, boolean z4, boolean z10) {
        o7 o7Var = new o7(3, true);
        o7Var.g = user;
        o7Var.k = z4;
        o7Var.l = z10;
        return o7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o7.class != obj.getClass()) {
            return false;
        }
        o7 o7Var = (o7) obj;
        int i10 = this.a;
        if (i10 != o7Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != o7Var.o || this.p != o7Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != o7Var.g || this.h != o7Var.h || this.i != o7Var.i || this.j != o7Var.j || this.k != o7Var.k || this.m != o7Var.m || this.n != o7Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != o7Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, o7Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, o7Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, o7Var.e) && TextUtils.equals(this.f, o7Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, o7Var.e) || this.c != o7Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != o7Var.c || !TextUtils.equals(this.e, o7Var.e) || this.k != o7Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == o7Var.q && this.d == o7Var.d && TextUtils.equals(this.e, o7Var.e) && TextUtils.equals(this.f, o7Var.f))) {
            return this.a != 10 || this.q == o7Var.q;
        }
        return false;
    }
}
