package qh;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class m7 extends cg.b {
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

    public m7(int i10, boolean z4) {
        super(i10, z4);
        this.p = -1;
    }

    public static m7 b(String str, CharSequence charSequence, int i10) {
        m7 m7Var = new m7(9, false);
        m7Var.e = str;
        m7Var.f = charSequence;
        m7Var.q = i10;
        return m7Var;
    }

    public static m7 c() {
        return new m7(0, false);
    }

    public static m7 d() {
        m7 m7Var = new m7(-1, false);
        m7Var.o = -1;
        return m7Var;
    }

    public static m7 e() {
        return new m7(1, false);
    }

    public static m7 f() {
        return new m7(2, false);
    }

    public static m7 g(CharSequence charSequence) {
        m7 m7Var = new m7(6, false);
        m7Var.e = charSequence;
        return m7Var;
    }

    public static m7 h(int i10, int i11, boolean z4) {
        m7 m7Var = new m7(3, false);
        m7Var.i = i10;
        m7Var.k = z4;
        m7Var.j = i11;
        return m7Var;
    }

    public static m7 i(TLRPC.User user, boolean z4, boolean z10) {
        m7 m7Var = new m7(3, true);
        m7Var.g = user;
        m7Var.k = z4;
        m7Var.l = z10;
        return m7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m7.class != obj.getClass()) {
            return false;
        }
        m7 m7Var = (m7) obj;
        int i10 = this.a;
        if (i10 != m7Var.a) {
            return false;
        }
        if (i10 == -1 && (this.o != m7Var.o || this.p != m7Var.p)) {
            return false;
        }
        if (i10 == 3 && (this.g != m7Var.g || this.h != m7Var.h || this.i != m7Var.i || this.j != m7Var.j || this.k != m7Var.k || this.m != m7Var.m || this.n != m7Var.n)) {
            return false;
        }
        if (i10 == 0 && this.c != m7Var.c) {
            return false;
        }
        if (i10 == 2 && !TextUtils.equals(this.e, m7Var.e)) {
            return false;
        }
        if (this.a == 8 && !TextUtils.equals(this.e, m7Var.e)) {
            return false;
        }
        int i11 = this.a;
        if ((i11 == 4 || i11 == 11) && !(TextUtils.equals(this.e, m7Var.e) && TextUtils.equals(this.f, m7Var.f))) {
            return false;
        }
        if (this.a == 6 && (!TextUtils.equals(this.e, m7Var.e) || this.c != m7Var.c)) {
            return false;
        }
        if (this.a == 7 && (this.c != m7Var.c || !TextUtils.equals(this.e, m7Var.e) || this.k != m7Var.k)) {
            return false;
        }
        if (this.a != 9 || (this.q == m7Var.q && this.d == m7Var.d && TextUtils.equals(this.e, m7Var.e) && TextUtils.equals(this.f, m7Var.f))) {
            return this.a != 10 || this.q == m7Var.q;
        }
        return false;
    }
}
