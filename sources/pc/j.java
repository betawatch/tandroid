package pc;

import java.util.Locale;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class j extends n3.a {
    public String c;
    public String d;
    public String e;
    public final StringBuilder f;
    public String h;
    public boolean n;
    public boolean r;
    public boolean s;
    public oc.b v;

    public j(int i10) {
        super(i10, 1);
        this.f = new StringBuilder();
        this.n = false;
        this.r = false;
        this.s = false;
    }

    public final void j(char c3) {
        String valueOf = String.valueOf(c3);
        String str = this.e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.e = valueOf;
    }

    public final void k(char c3) {
        this.r = true;
        String str = this.h;
        StringBuilder sb = this.f;
        if (str != null) {
            sb.append(str);
            this.h = null;
        }
        sb.append(c3);
    }

    public final void l(String str) {
        this.r = true;
        String str2 = this.h;
        StringBuilder sb = this.f;
        if (str2 != null) {
            sb.append(str2);
            this.h = null;
        }
        if (sb.length() == 0) {
            this.h = str;
        } else {
            sb.append(str);
        }
    }

    public final void n(int[] iArr) {
        this.r = true;
        String str = this.h;
        StringBuilder sb = this.f;
        if (str != null) {
            sb.append(str);
            this.h = null;
        }
        for (int i10 : iArr) {
            sb.appendCodePoint(i10);
        }
    }

    public final void o(String str) {
        String str2 = this.c;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.c = str;
        this.d = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public final String q() {
        String str = this.c;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.c;
    }

    public final void r() {
        if (this.v == null) {
            this.v = new oc.b();
        }
        String str = this.e;
        StringBuilder sb = this.f;
        if (str != null) {
            String trim = str.trim();
            this.e = trim;
            if (trim.length() > 0) {
                String sb2 = this.r ? sb.length() > 0 ? sb.toString() : this.h : this.n ? "" : null;
                oc.b bVar = this.v;
                String str2 = this.e;
                int i10 = bVar.i(str2);
                if (i10 != -1) {
                    bVar.c[i10] = sb2;
                } else {
                    int i11 = bVar.a;
                    int i12 = i11 + 1;
                    if (i12 < i11) {
                        throw new IllegalArgumentException("Must be true");
                    }
                    String[] strArr = bVar.b;
                    int length = strArr.length;
                    if (length < i12) {
                        int i13 = length >= 4 ? i11 * 2 : 4;
                        if (i12 <= i13) {
                            i12 = i13;
                        }
                        String[] strArr2 = new String[i12];
                        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i12));
                        bVar.b = strArr2;
                        String[] strArr3 = bVar.c;
                        String[] strArr4 = new String[i12];
                        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
                        bVar.c = strArr4;
                    }
                    String[] strArr5 = bVar.b;
                    int i14 = bVar.a;
                    strArr5[i14] = str2;
                    bVar.c[i14] = sb2;
                    bVar.a = i14 + 1;
                }
            }
        }
        this.e = null;
        this.n = false;
        this.r = false;
        n3.a.i(sb);
        this.h = null;
    }

    @Override // n3.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public j h() {
        this.c = null;
        this.d = null;
        this.e = null;
        n3.a.i(this.f);
        this.h = null;
        this.n = false;
        this.r = false;
        this.s = false;
        this.v = null;
        return this;
    }
}
