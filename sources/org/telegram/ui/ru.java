package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ru extends og.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public ru(int i10, String str) {
        super(i10, false);
        this.f = str;
    }

    public static ru b(CharSequence charSequence, String str) {
        return new ru(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        CharSequence charSequence = ruVar.f;
        int i10 = ruVar.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return ruVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && ruVar.d == this.d && ruVar.e == this.e && ruVar.c == this.c;
        }
        return true;
    }

    public ru(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
