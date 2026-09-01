package w4;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final int w = c(2, 2, 2, 0);
    public static final int x;
    public static final int[] y;
    public static final int[] z;
    public final ArrayList a = new ArrayList();
    public final SpannableStringBuilder b = new SpannableStringBuilder();
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;

    static {
        int c3 = c(0, 0, 0, 0);
        x = c3;
        int c10 = c(0, 0, 0, 3);
        y = new int[]{0, 0, 0, 0, 0, 2, 0};
        z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{c3, c10, c3, c3, c10, c3, c3};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{c3, c3, c3, c3, c3, c10, c10};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i10, int i11, int i12, int i13) {
        int i14;
        h5.a.h(i10, 4);
        h5.a.h(i11, 4);
        h5.a.h(i12, 4);
        h5.a.h(i13, 4);
        if (i13 != 0 && i13 != 1) {
            if (i13 == 2) {
                i14 = 127;
            } else if (i13 == 3) {
                i14 = 0;
            }
            return Color.argb(i14, i10 <= 1 ? 255 : 0, i11 <= 1 ? 255 : 0, i12 <= 1 ? 0 : 255);
        }
        i14 = 255;
        return Color.argb(i14, i10 <= 1 ? 255 : 0, i11 <= 1 ? 255 : 0, i12 <= 1 ? 0 : 255);
    }

    public final void a(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (c3 != '\n') {
            spannableStringBuilder.append(c3);
            return;
        }
        SpannableString b10 = b();
        ArrayList arrayList = this.a;
        arrayList.add(b10);
        spannableStringBuilder.clear();
        if (this.p != -1) {
            this.p = 0;
        }
        if (this.q != -1) {
            this.q = 0;
        }
        if (this.r != -1) {
            this.r = 0;
        }
        if (this.t != -1) {
            this.t = 0;
        }
        while (true) {
            if ((!this.k || arrayList.size() < this.j) && arrayList.size() < 15) {
                return;
            } else {
                arrayList.remove(0);
            }
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
            }
            if (this.q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
            }
            if (this.r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
            }
            if (this.t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.a.clear();
        this.b.clear();
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.t = -1;
        this.v = 0;
        this.c = false;
        this.d = false;
        this.e = 4;
        this.f = false;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 15;
        this.k = true;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        int i10 = x;
        this.o = i10;
        this.s = w;
        this.u = i10;
    }

    public final void e(boolean z4, boolean z10) {
        int i10 = this.p;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i10 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.p, spannableStringBuilder.length(), 33);
                this.p = -1;
            }
        } else if (z4) {
            this.p = spannableStringBuilder.length();
        }
        if (this.q == -1) {
            if (z10) {
                this.q = spannableStringBuilder.length();
            }
        } else {
            if (z10) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, spannableStringBuilder.length(), 33);
            this.q = -1;
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.r;
        SpannableStringBuilder spannableStringBuilder = this.b;
        if (i12 != -1 && this.s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, spannableStringBuilder.length(), 33);
        }
        if (i10 != w) {
            this.r = spannableStringBuilder.length();
            this.s = i10;
        }
        if (this.t != -1 && this.u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, spannableStringBuilder.length(), 33);
        }
        if (i11 != x) {
            this.t = spannableStringBuilder.length();
            this.u = i11;
        }
    }
}
