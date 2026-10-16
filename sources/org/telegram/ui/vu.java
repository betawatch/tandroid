package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vu extends pg.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public vu(int i10, String str) {
        super(i10, false);
        this.f = str;
    }

    public static vu b(CharSequence charSequence, String str) {
        return new vu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vu)) {
            return false;
        }
        vu vuVar = (vu) obj;
        CharSequence charSequence = vuVar.f;
        int i10 = vuVar.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return vuVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && vuVar.d == this.d && vuVar.e == this.e && vuVar.c == this.c;
        }
        return true;
    }

    public vu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
