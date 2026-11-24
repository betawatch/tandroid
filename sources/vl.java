// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.View;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class vl extends Drawable {
    public static SparseArray r;
    public static HashMap s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static final jc w = new jc(2);
    public static HashMap x;
    public boolean a;
    public ArrayList b;
    public ArrayList c;
    public int d;
    public TLRPC.Document e;
    public long f;
    public int g;
    public int h;
    public String i;
    public boolean j;
    public ml k;
    public boolean m;
    public ColorFilter p;
    public ColorFilter q;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public vl(int i, int i2, long j) {
        this.h = i2;
        this.g = i;
        x();
        this.f = j;
        g(i2).b(j, new ll(this, (byte) 0));
    }

    public static TLRPC.Document e(int i, long j) {
        HashMap hashMap = g(i).a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j));
    }

    public static int f() {
        return gba.o() == 0 ? 0 : 2;
    }

    public static rl g(int i) {
        HashMap hashMap = s;
        if (hashMap == null) {
            hashMap = new HashMap();
            s = hashMap;
        }
        rl rlVar = (rl) hashMap.get(Integer.valueOf(i));
        if (rlVar != null) {
            return rlVar;
        }
        HashMap hashMap2 = s;
        Integer valueOf = Integer.valueOf(i);
        rl rlVar2 = new rl(i);
        hashMap2.put(valueOf, rlVar2);
        return rlVar2;
    }

    public static vl l(int i, int i2, TLRPC.Document document) {
        if (r == null) {
            r = new SparseArray();
        }
        int hash = Objects.hash(Integer.valueOf(i), Integer.valueOf(i2));
        LongSparseArray longSparseArray = (LongSparseArray) r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        vl vlVar = (vl) longSparseArray.get(document.id);
        if (vlVar != null) {
            return vlVar;
        }
        long j = document.id;
        vl vlVar2 = new vl(i2, i, document);
        longSparseArray.put(j, vlVar2);
        return vlVar2;
    }

    public static vl m(int i, long j, String str, int i2) {
        if (r == null) {
            r = new SparseArray();
        }
        byte b = 1;
        int hash = Objects.hash(Integer.valueOf(i), Integer.valueOf(i2));
        LongSparseArray longSparseArray = (LongSparseArray) r.get(hash);
        if (longSparseArray == null) {
            SparseArray sparseArray = r;
            LongSparseArray longSparseArray2 = new LongSparseArray();
            sparseArray.put(hash, longSparseArray2);
            longSparseArray = longSparseArray2;
        }
        vl vlVar = (vl) longSparseArray.get(j);
        if (vlVar != null) {
            return vlVar;
        }
        vl vlVar2 = new vl();
        vlVar2.l = 1.0f;
        vlVar2.n = null;
        vlVar2.o = null;
        vlVar2.h = i;
        vlVar2.g = i2;
        vlVar2.x();
        vlVar2.f = j;
        vlVar2.i = str;
        g(i).b(j, new ll(vlVar2, b));
        longSparseArray.put(j, vlVar2);
        return vlVar2;
    }

    public static void r(int i, boolean z) {
        LongSparseArray longSparseArray;
        ml mlVar;
        boolean z2 = !z;
        if (v != z2) {
            v = z2;
            if (r == null || (longSparseArray = (LongSparseArray) r.get(Objects.hash(Integer.valueOf(i), 25))) == null) {
                return;
            }
            for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                vl vlVar = (vl) longSparseArray.valueAt(i2);
                if (vlVar != null && (mlVar = vlVar.k) != null) {
                    if (z) {
                        mlVar.v0 = true;
                        mlVar.u0 = true;
                        mlVar.M(1);
                        km m = mlVar.m();
                        if (m != null) {
                            boolean z3 = mlVar.w0;
                            if (!m.o0) {
                                m.w0 = z3;
                            }
                            m.start();
                        } else {
                            oy8 y = mlVar.y();
                            if (y != null) {
                                y.start();
                            }
                        }
                    } else {
                        mlVar.u0 = false;
                        mlVar.v0 = false;
                        mlVar.M(0);
                        mlVar.x0();
                    }
                }
            }
        }
    }

    public static void t() {
        if (r != null) {
            w();
            for (int i = 0; i < r.size(); i++) {
                LongSparseArray longSparseArray = (LongSparseArray) r.valueAt(i);
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    long keyAt = longSparseArray.keyAt(i2);
                    vl vlVar = (vl) longSparseArray.get(keyAt);
                    if (vlVar == null || !vlVar.a) {
                        longSparseArray.remove(keyAt);
                    } else {
                        vlVar.i(true);
                    }
                }
            }
        }
    }

    public static void w() {
        t = e66.e(16388);
        u = e66.e(8200);
    }

    public final void a(dm dmVar) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList(10);
            this.c = arrayList;
        }
        this.m = false;
        if (!arrayList.contains(dmVar)) {
            this.c.add(dmVar);
        }
        u();
    }

    public final void b(View view) {
        if (view instanceof ww9) {
            throw new RuntimeException();
        }
        this.m = false;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            arrayList = new ArrayList(10);
            this.b = arrayList;
        }
        if (!arrayList.contains(view)) {
            this.b.add(view);
        }
        u();
    }

    public final boolean c() {
        boolean z = true;
        if (this.g == 19) {
            return true;
        }
        Boolean bool = this.n;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        if (!k() && !k27.B4(this.e)) {
            z = false;
        }
        this.n = Boolean.valueOf(z);
        return z;
    }

    public final void d() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.m = false;
        u();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ml mlVar = this.k;
        if (mlVar == null) {
            return;
        }
        mlVar.j0(getBounds());
        this.k.setAlpha(this.l);
        this.k.h(canvas, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return (int) (this.l * 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return gl.L(this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return gl.L(this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final long h() {
        TLRPC.Document document = this.e;
        return document != null ? document.id : this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x036f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(boolean z) {
        kcb d;
        String str;
        gl5 gl5Var;
        gl5 b;
        lk5 lk5Var;
        gl5 gl5Var2;
        Drawable g;
        Drawable drawable;
        ml mlVar;
        int i;
        String str2 = this.i;
        int i2 = this.g;
        TLRPC.Document document = this.e;
        if (document != null) {
            ml mlVar2 = this.k;
            if (mlVar2 == null || this.j || z) {
                if ((i2 == 20 || i2 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                byte b2 = 0;
                this.j = false;
                if (mlVar2 == null) {
                    ml mlVar3 = new ml(this, b2);
                    this.k = mlVar3;
                    mlVar3.d = this.h;
                    mlVar3.A1 = true;
                    if (i2 == 12) {
                        mlVar3.y = true;
                    }
                }
                if (this.p != null && c()) {
                    this.k.p1 = this.p;
                }
                if (i2 != 0) {
                    this.k.w1 = oo1.n(i2 == 12 ? 2 : i2, "_");
                }
                this.k.z1 = true;
                boolean z2 = (gba.o() == 0 && i2 == 5) || ((i2 == 2 || i2 == 25) && !t) || (i2 == 3 && !u);
                if (i2 == 13 || i2 == 16) {
                    z2 = true;
                }
                if (i2 == 24 || i2 == 27) {
                    z2 = false;
                }
                String str3 = this.d + "_" + this.d;
                if (i2 == 12) {
                    str3 = str3.concat("_d_nostream");
                }
                if (i2 != 17 && i2 != 15 && i2 != 14 && i2 != 8 && ((i2 != 1 || gba.o() < 2) && i2 != 12)) {
                    str3 = str3.concat("_pcache");
                }
                if (i2 != 17 && i2 != 0 && i2 != 26 && i2 != 1 && i2 != 14 && i2 != 15 && i2 != 19 && i2 != 20 && i2 != 21) {
                    str3 = str3.concat("_compress");
                }
                if (i2 == 8) {
                    str3 = str3.concat("firstframe");
                }
                TLRPC.PhotoSize w2 = ba4.w(this.e.thumbs, 90, false, null, false);
                boolean equals = "video/webm".equals(this.e.mime_type);
                TLRPC.Document document2 = this.e;
                if (equals) {
                    b = gl5.b(document2);
                    str3 = str3.concat("_g");
                    d = uo3.d(this.e.thumbs, bkb.l6, 0.2f, true);
                } else {
                    if (!"application/x-tgsticker".equals(document2.mime_type)) {
                        d = uo3.d(this.e.thumbs, bkb.l6, 0.2f, true);
                        if (d != null && k27.K2(this.e, true)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = str3;
                        gl5Var = null;
                        if (i2 != 20 || i2 == 21) {
                            gl5Var2 = null;
                            g = vu3.g(k27.V(this.e, null, null));
                            if (g != null) {
                                drawable = g;
                                if (str2 != null) {
                                    this.k.g0(new km(new File(str2), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                                } else if (i2 == 8) {
                                    ml mlVar4 = this.k;
                                    TLRPC.Document document3 = this.e;
                                    mlVar4.Y(null, null, gl5Var, str, null, null, drawable, document3.size, null, document3, 1);
                                } else {
                                    String str4 = str;
                                    if (z2 || !(t || i2 == 14)) {
                                        gl5 c = i2 == 16 ? gl5.c(w2, this.e) : gl5Var2;
                                        if ("video/webm".equals(this.e.mime_type)) {
                                            ml mlVar5 = this.k;
                                            gl5 c2 = gl5.c(w2, this.e);
                                            String str5 = this.d + "_" + this.d;
                                            TLRPC.Document document4 = this.e;
                                            mlVar5.Y(null, null, c2, str5, c, null, drawable, document4.size, null, document4, 1);
                                        } else {
                                            boolean K2 = k27.K2(this.e, true);
                                            ml mlVar6 = this.k;
                                            if (K2) {
                                                String concat = str4.concat("_firstframe");
                                                TLRPC.Document document5 = this.e;
                                                mlVar6.Z(gl5Var, concat, c, null, drawable, document5.size, null, document5, 1);
                                            } else {
                                                gl5 c3 = gl5.c(w2, this.e);
                                                String str6 = this.d + "_" + this.d;
                                                TLRPC.Document document6 = this.e;
                                                mlVar6.Z(c3, str6, c, null, drawable, document6.size, null, document6, 1);
                                            }
                                        }
                                    } else {
                                        gl5 c4 = i2 == 17 ? gl5.c(w2, this.e) : gl5Var2;
                                        ml mlVar7 = this.k;
                                        gl5 c5 = gl5.c(w2, this.e);
                                        String str7 = this.d + "_" + this.d;
                                        TLRPC.Document document7 = this.e;
                                        mlVar7.Y(gl5Var, str4, c5, str7, c4, null, drawable, document7.size, null, document7, 1);
                                    }
                                }
                                v(this.k);
                                if (i2 != 13 || i2 == 16 || i2 == 3 || i2 == 5 || i2 == 4 || i2 == 24) {
                                    this.k.m0(7);
                                }
                                if (i2 != 9 || i2 == 21 || i2 == 27) {
                                    this.k.m0(6656);
                                }
                                mlVar = this.k;
                                mlVar.S0 = true;
                                if (i2 != 12 || i2 == 26 || i2 == 18 || i2 == 8 || i2 == 6 || i2 == 5 || (i2 == 25 && v)) {
                                    i = 0;
                                    mlVar.u0 = false;
                                    mlVar.v0 = false;
                                    mlVar.M(0);
                                } else {
                                    mlVar.v0 = true;
                                    mlVar.u0 = true;
                                    mlVar.M(1);
                                    i = 0;
                                }
                                this.k.x0 = true;
                                this.k.q0((i2 != 5 || i2 == 6 || i2 == 27) ? gl.L(6.0f) : i2 == 24 ? gl.L(14.0f) : i);
                                u();
                                j();
                            }
                        } else {
                            gl5Var2 = null;
                        }
                        drawable = d;
                        if (str2 != null) {
                        }
                        v(this.k);
                        if (i2 != 13) {
                        }
                        this.k.m0(7);
                        if (i2 != 9) {
                        }
                        this.k.m0(6656);
                        mlVar = this.k;
                        mlVar.S0 = true;
                        if (i2 != 12) {
                        }
                        i = 0;
                        mlVar.u0 = false;
                        mlVar.v0 = false;
                        mlVar.M(0);
                        this.k.x0 = true;
                        this.k.q0((i2 != 5 || i2 == 6 || i2 == 27) ? gl.L(6.0f) : i2 == 24 ? gl.L(14.0f) : i);
                        u();
                        j();
                    }
                    String str8 = (i2 != 0 ? oo1.n(i2, "_") : "") + this.f + "@" + str3;
                    if (gba.o() != 0 || i2 == 2 || i2 == 25 || i2 == 22 || (lk5Var = fl5.z().e) == null || !((LinkedHashMap) lk5Var.c).containsKey(str8)) {
                        kcb d2 = uo3.d(this.e.thumbs, bkb.l6, i2 == 22 ? 0.8f : 0.2f, false);
                        if (d2 != null && k27.K2(this.e, true)) {
                            d2.e = 512;
                            d2.f = 512;
                        }
                        d = d2;
                    } else {
                        d = null;
                    }
                    b = gl5.b(this.e);
                }
                gl5Var = b;
                str = str3;
                if (i2 != 20) {
                }
                gl5Var2 = null;
                g = vu3.g(k27.V(this.e, null, null));
                if (g != null) {
                }
                drawable = d;
                if (str2 != null) {
                }
                v(this.k);
                if (i2 != 13) {
                }
                this.k.m0(7);
                if (i2 != 9) {
                }
                this.k.m0(6656);
                mlVar = this.k;
                mlVar.S0 = true;
                if (i2 != 12) {
                }
                i = 0;
                mlVar.u0 = false;
                mlVar.v0 = false;
                mlVar.M(0);
                this.k.x0 = true;
                this.k.q0((i2 != 5 || i2 == 6 || i2 == 27) ? gl.L(6.0f) : i2 == 24 ? gl.L(14.0f) : i);
                u();
                j();
            }
        }
    }

    public final void j() {
        if (this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                View view = (View) this.b.get(i);
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (this.c != null) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                dm dmVar = (dm) this.c.get(i2);
                if (dmVar != null) {
                    dmVar.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r2 != 2964141614563343L) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k() {
        Boolean bool = this.o;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Document document = this.e;
        boolean z = false;
        if (document != null) {
            TLRPC.InputStickerSet i1 = k27.i1(document);
            if (!(i1 instanceof TLRPC.TL_inputStickerSetEmojiDefaultStatuses)) {
                if (i1 instanceof TLRPC.TL_inputStickerSetID) {
                    long j = i1.id;
                    if (j != 773947703670341676L) {
                    }
                }
                this.o = Boolean.valueOf(z);
            }
            z = true;
            this.o = Boolean.valueOf(z);
        }
        return z;
    }

    public final void n(dm dmVar) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(dmVar);
        }
        this.m = false;
        u();
    }

    public final void o(View view) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        this.m = false;
        u();
    }

    public final void p(long j) {
        ml mlVar = this.k;
        if (mlVar != null) {
            if (this.g == 8) {
                j = 0;
            }
            mlVar.s = j;
        }
    }

    public final void q(String str) {
        ml mlVar;
        int i = this.g;
        if ((i == 20 || i == 21) && !TextUtils.isEmpty(str) && (mlVar = this.k) == null) {
            if (mlVar == null) {
                mlVar = new ml(this, (byte) 0);
                this.k = mlVar;
                mlVar.d = this.h;
                mlVar.A1 = true;
                if (i == 12) {
                    mlVar.y = true;
                }
            }
            this.j = true;
            mlVar.g0(vu3.g(str));
            this.k.B0 = true;
        }
    }

    public final void s(long j) {
        ml mlVar = this.k;
        if (mlVar != null) {
            if (this.g == 8) {
                j = 0;
            }
            if (mlVar.y() != null) {
                this.k.y().Q(j);
            }
            if (this.k.m() != null) {
                this.k.m().D(j);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        float f = i / 255.0f;
        this.l = f;
        ml mlVar = this.k;
        if (mlVar != null) {
            mlVar.setAlpha(f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.q = colorFilter;
        if (this.k == null || this.e == null) {
            this.p = colorFilter;
        } else if (c()) {
            this.k.p1 = colorFilter;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimatedEmojiDrawable{");
        TLRPC.Document document = this.e;
        return b00.j(sb, document == null ? "null" : k27.V(document, null, null), "}");
    }

    public final void u() {
        ArrayList arrayList;
        if (this.k != null) {
            ArrayList arrayList2 = this.b;
            boolean z = (arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.c) != null && arrayList.size() > 0) || this.m;
            if (z != this.a) {
                this.a = z;
                ml mlVar = this.k;
                if (z) {
                    mlVar.I();
                } else {
                    mlVar.K();
                }
                if (this.a) {
                    return;
                }
                jc jcVar = w;
                gl.r(jcVar);
                gl.e3(jcVar, 5000L);
            }
        }
    }

    public final void v(ml mlVar) {
        int i = this.g;
        if (i == 7 || i == 9 || i == 10) {
            mlVar.N(2);
            return;
        }
        if (i == 11 || i == 18 || i == 14 || i == 6 || i == 5 || i == 22) {
            mlVar.N(1);
        } else if (i == 17) {
            mlVar.N(0);
        }
    }

    public final void x() {
        int i = this.g;
        if (i == 0 || i == 26) {
            this.d = (int) (((Math.abs(bkb.n2.descent()) + Math.abs(bkb.n2.ascent())) * 1.15f) / gl.p);
            return;
        }
        TextPaint[] textPaintArr = bkb.x2;
        if (textPaintArr != null && (i == 1 || i == 4 || i == 19 || i == 20)) {
            this.d = (int) (((Math.abs(bkb.x2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / gl.p);
            return;
        }
        if (textPaintArr != null && i == 8) {
            this.d = (int) (((Math.abs(bkb.x2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / gl.p);
            return;
        }
        if (i == 14 || i == 15 || i == 17) {
            this.d = 100;
            return;
        }
        if (i == 11 || i == 22) {
            this.d = 56;
            return;
        }
        if (i == 27) {
            this.d = 50;
            return;
        }
        if (i == 24) {
            this.d = kk7.V1;
            return;
        }
        if (i == 23) {
            this.d = 14;
        } else if (i == 21) {
            this.d = 90;
        } else {
            this.d = 34;
        }
    }

    public vl(int i, int i2, TLRPC.Document document) {
        this.g = i;
        this.h = i2;
        this.e = document;
        x();
        w();
        i(false);
    }
}
