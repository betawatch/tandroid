package y4;

import android.text.Layout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public b r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i9;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.c && fVar.c) {
                this.b = fVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = fVar.h;
            }
            if (this.i == -1) {
                this.i = fVar.i;
            }
            if (this.a == null && (str = fVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = fVar.f;
            }
            if (this.g == -1) {
                this.g = fVar.g;
            }
            if (this.n == -1) {
                this.n = fVar.n;
            }
            if (this.o == null && (alignment2 = fVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = fVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = fVar.q;
            }
            if (this.j == -1) {
                this.j = fVar.j;
                this.k = fVar.k;
            }
            if (this.r == null) {
                this.r = fVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = fVar.s;
            }
            if (!this.e && fVar.e) {
                this.d = fVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i9 = fVar.m) == -1) {
                return;
            }
            this.m = i9;
        }
    }
}
