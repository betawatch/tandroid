// default package

import java.util.Locale;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class wtb extends iu5 {
    public String e;
    public String f;
    public String g;
    public final StringBuilder h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public gy m;

    public wtb(int i) {
        super(i, (byte) 2);
        this.h = new StringBuilder();
        this.j = false;
        this.k = false;
        this.l = false;
    }

    public final void A() {
        if (this.m == null) {
            this.m = new gy();
        }
        String str = this.g;
        StringBuilder sb = this.h;
        if (str != null) {
            String trim = str.trim();
            this.g = trim;
            if (trim.length() > 0) {
                String sb2 = this.k ? sb.length() > 0 ? sb.toString() : this.i : this.j ? "" : null;
                gy gyVar = this.m;
                String str2 = this.g;
                int h = gyVar.h(str2);
                if (h != -1) {
                    gyVar.c[h] = sb2;
                } else {
                    int i = gyVar.a;
                    int i2 = i + 1;
                    if (i2 < i) {
                        lq5.j("Must be true");
                        return;
                    }
                    String[] strArr = gyVar.b;
                    int length = strArr.length;
                    if (length < i2) {
                        int i3 = length >= 4 ? i << 1 : 4;
                        if (i2 <= i3) {
                            i2 = i3;
                        }
                        String[] strArr2 = new String[i2];
                        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i2));
                        gyVar.b = strArr2;
                        String[] strArr3 = gyVar.c;
                        String[] strArr4 = new String[i2];
                        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
                        gyVar.c = strArr4;
                    }
                    String[] strArr5 = gyVar.b;
                    int i4 = gyVar.a;
                    strArr5[i4] = str2;
                    gyVar.c[i4] = sb2;
                    gyVar.a = i4 + 1;
                }
            }
        }
        this.g = null;
        this.j = false;
        this.k = false;
        iu5.t(sb);
        this.i = null;
    }

    @Override // iu5
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public wtb s() {
        this.e = null;
        this.f = null;
        this.g = null;
        iu5.t(this.h);
        this.i = null;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = null;
        return this;
    }

    public final void u(char c) {
        String valueOf = String.valueOf(c);
        String str = this.g;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.g = valueOf;
    }

    public final void v(char c) {
        this.k = true;
        String str = this.i;
        StringBuilder sb = this.h;
        if (str != null) {
            sb.append(str);
            this.i = null;
        }
        sb.append(c);
    }

    public final void w(String str) {
        this.k = true;
        String str2 = this.i;
        StringBuilder sb = this.h;
        if (str2 != null) {
            sb.append(str2);
            this.i = null;
        }
        if (sb.length() == 0) {
            this.i = str;
        } else {
            sb.append(str);
        }
    }

    public final void x(int[] iArr) {
        this.k = true;
        String str = this.i;
        StringBuilder sb = this.h;
        if (str != null) {
            sb.append(str);
            this.i = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    public final void y(String str) {
        String str2 = this.e;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.e = str;
        this.f = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public final String z() {
        String str = this.e;
        if (str != null && str.length() != 0) {
            return this.e;
        }
        lq5.j("Must be false");
        return null;
    }
}
