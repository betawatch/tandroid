package org.telegram.ui;

import android.text.TextUtils;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class su extends og.a {
    public final int c;
    public final int d;
    public final int e;
    public final CharSequence f;
    public final CharSequence g;
    public final int h;

    public su(int i10, String str) {
        super(i10, false);
        this.f = str;
    }

    public static su b(CharSequence charSequence, String str) {
        return new su(-1, 0, 0, 0, charSequence, str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof su)) {
            return false;
        }
        su suVar = (su) obj;
        CharSequence charSequence = suVar.f;
        int i10 = suVar.a;
        int i11 = this.a;
        if (i10 != i11) {
            return false;
        }
        CharSequence charSequence2 = this.f;
        if (i11 == 1 || i11 == 4 || i11 == 3 || i11 == 5) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i11 == 2) {
            return suVar.h == this.h && TextUtils.equals(charSequence2, charSequence) && suVar.d == this.d && suVar.e == this.e && suVar.c == this.c;
        }
        return true;
    }

    public su(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2) {
        super(2, false);
        this.h = i10;
        this.c = i11;
        this.d = i12;
        this.e = i13;
        this.f = charSequence;
        this.g = charSequence2;
    }
}
