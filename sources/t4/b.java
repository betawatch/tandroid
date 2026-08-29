package t4;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import f5.d0;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements j3.g {
    public static final b D = new b("", null, null, null, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f);
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final sg.j V;
    public final float A;
    public final int B;
    public final float C;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int h;
    public final float n;
    public final int r;
    public final float s;
    public final float v;
    public final boolean w;
    public final int x;
    public final int y;

    static {
        int i10 = d0.a;
        E = Integer.toString(0, 36);
        F = Integer.toString(1, 36);
        G = Integer.toString(2, 36);
        H = Integer.toString(3, 36);
        I = Integer.toString(4, 36);
        J = Integer.toString(5, 36);
        K = Integer.toString(6, 36);
        L = Integer.toString(7, 36);
        M = Integer.toString(8, 36);
        N = Integer.toString(9, 36);
        O = Integer.toString(10, 36);
        P = Integer.toString(11, 36);
        Q = Integer.toString(12, 36);
        R = Integer.toString(13, 36);
        S = Integer.toString(14, 36);
        T = Integer.toString(15, 36);
        U = Integer.toString(16, 36);
        V = new sg.j(4);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f9, int i10, int i11, float f10, int i12, int i13, float f11, float f12, float f13, boolean z10, int i14, int i15, float f14) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            f5.a.f(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f9;
        this.f = i10;
        this.h = i11;
        this.n = f10;
        this.r = i12;
        this.s = f12;
        this.v = f13;
        this.w = z10;
        this.x = i14;
        this.y = i13;
        this.A = f11;
        this.B = i15;
        this.C = f14;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.d;
            if (TextUtils.equals(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f == bVar.f && this.h == bVar.h && this.n == bVar.n && this.r == bVar.r && this.s == bVar.s && this.v == bVar.v && this.w == bVar.w && this.x == bVar.x && this.y == bVar.y && this.A == bVar.A && this.B == bVar.B && this.C == bVar.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.h), Float.valueOf(this.n), Integer.valueOf(this.r), Float.valueOf(this.s), Float.valueOf(this.v), Boolean.valueOf(this.w), Integer.valueOf(this.x), Integer.valueOf(this.y), Float.valueOf(this.A), Integer.valueOf(this.B), Float.valueOf(this.C)});
    }
}
