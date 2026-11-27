// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s83 extends ka {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final String g;
    public final int h;

    public s83(int i, int i2, int i3, int i4, CharSequence charSequence, String str) {
        super(2, false);
        this.h = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = charSequence;
        this.g = str;
    }

    public static s83 b(CharSequence charSequence, String str) {
        return new s83(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s83)) {
            return false;
        }
        s83 s83Var = (s83) obj;
        CharSequence charSequence = s83Var.f;
        int i = s83Var.a;
        int i2 = this.a;
        if (i != i2) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i2 == 1 || i2 == 4 || i2 == 3 || i2 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i2 == 2) {
            return s83Var.h == this.h && TextUtils.equals(charSequence2, charSequence) && s83Var.d == this.d && s83Var.e == this.e && s83Var.c == this.c;
        }
        return true;
    }

    public s83(int i, String str) {
        super(i, false);
        this.f = str;
    }
}
