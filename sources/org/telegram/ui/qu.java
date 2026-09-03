package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qu extends bg.b {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public qu(int i10, String str) {
        super(i10, false);
        this.f = str;
    }

    public static qu b(CharSequence charSequence, String str) {
        return new qu(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qu)) {
            return false;
        }
        qu quVar = (qu) obj;
        CharSequence charSequence = quVar.f;
        int i10 = quVar.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return quVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && quVar.d == this.d && quVar.e == this.e && quVar.c == this.c;
        }
        return true;
    }

    public qu(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
